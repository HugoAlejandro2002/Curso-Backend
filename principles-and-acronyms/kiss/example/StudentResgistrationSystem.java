package example;

import java.util.*;

/*
 class StudentRegistrationSystem {
    
    List<Student> registeredStudents = new ArrayList<>();
    List<Course> availableCourses = new ArrayList<>();

    boolean registerStudent(Student student, Course course) {
        if (student != null && course != null) {
            if (!registeredStudents.contains(student)) {
                if (availableCourses.contains(course)) {
                    for (Course c : student.getCourses()) {
                        if (c.equals(course)) {
                            // El estudiante ya está registrado en el curso
                            return false;
                        }
                    }
                    // Lógica de registro
                    student.getCourses().add(course);
                    registeredStudents.add(student);
                    return true;
                } else {
                    // Curso no disponible
                    return false;
                }
            } else {
                // El estudiante ya está registrado
                return false;
            }
        } else {
            // Datos nulos
            throw new IllegalArgumentException("Estudiante o curso no pueden ser nulos");
        }
    }
}

 */

public class StudentRegistrationSystem {
    
    private final Map<Student, Set<Course>> studentCourseMap = new HashMap<>();

    boolean registerStudent(Student student, Course course) {
        if (student == null || course == null) {
            throw new IllegalArgumentException("Estudiante o curso no pueden ser nulos");
        }

        Set<Course> registeredCourses = studentCourseMap.computeIfAbsent(student, k -> new HashSet<>());

        if (!availableCourses.contains(course)) {
            return false;
        }

        return registeredCourses.add(course);
    }
}


/*
 
Supongo que availableCourses es un conjunto actualizado de cursos que están abiertos para la inscripción, por lo que no es necesario cambiar su estructura o uso.
La lógica de registro ahora solo agrega estudiantes al mapa si su registro es exitoso, por lo que no necesitamos una lista separada de registeredStudents.
Estoy asumiendo que la lista de cursos de un estudiante (getCourses()) no es necesaria ya que manejamos los registros dentro del studentCourseMap.
Al utilizar Set<Course>, la verificación de si el estudiante ya está registrado en el curso es implícita y simplifica el proceso, ya que los conjuntos no permiten duplicados.
Supongo que no necesitamos realizar un seguimiento de los estudiantes que no tienen cursos, ya que no afecta a la lógica de registro.
 */