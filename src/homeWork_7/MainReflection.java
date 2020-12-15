package homeWork_7;

import homeWork_6.*;

import java.lang.reflect.Modifier;
import java.time.LocalDate;
import java.lang.*;
import java.lang.reflect.*;
import java.util.*;

import static java.lang.Class.*;

public class MainReflection {
    private static <T> void reflectionClassPackage(Class<T> clazz) {
        Package packageClass = null;
        Class superclass = null;
        String packageClassName, className, packageName;
        int modifierClass;

        packageClassName = clazz.getName();
        className = clazz.getSimpleName();
        modifierClass = clazz.getModifiers();
        packageClass = clazz.getPackage();
        packageName = packageClass.getName();
        superclass = clazz.getSuperclass();
        System.out.println("Информация о классе:");
        System.out.println(clazz + " -> " + packageClassName + " -> " + className + " -> " + modifierClass + " - " + Modifier.toString(modifierClass) + " -> " + packageClass);
        System.out.println("==============================================================================");
        System.out.println("Информация о пакете:");
        System.out.println(packageClass + " -> " + packageName);
        System.out.println("==============================================================================");
        System.out.println("Дерево классов предков, если есть, иначе ничего не выводить:");
        System.out.println(superclass);
        if (superclass != null) {
            while (!superclass.getName().equals("java.lang.Object")) {
                superclass = superclass.getSuperclass();
                System.out.println(superclass);
            }
        }
        System.out.println("==============================================================================");
    }

    private static <T> void reflectionInterfaces(Class<T> clazz) {
        Class[] interfaces = clazz.getInterfaces();
        System.out.println("Список реализуемых интерфейсов:");
        if (interfaces.length > 0) {
            for (int i = 0; i < interfaces.length; i++) {
                System.out.print(interfaces[i].getSimpleName() + "  ");
            }
        }
        System.out.println();
        System.out.println("==============================================================================");

    }

    private static <T> void reflectionConstructors(Class<T> clazz) {
        Constructor[] constructors = clazz.getConstructors();
        System.out.println("Список конструкторов с параметрами:");
        if (constructors.length > 0) {
            for (int i = 0; i < constructors.length; i++) {
                System.out.print(constructors[i].getName() + "  ");
                if (constructors[i].getParameters().length > 0) {
                    for (int j = 0; j < constructors[i].getParameters().length; j++) {
                        System.out.print(constructors[i].getParameters()[j] + "  ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println("==============================================================================");
    }

    private static <T> void reflectionFields(Class<T> clazz) {
        Field[] fields = null;
        fields = clazz.getDeclaredFields();
        Class superclass = clazz.getSuperclass();

        System.out.println("Список всех полей, в том числе приватных, включая их тип:");
        if (fields.length > 0) {
            for (int i = 0; i < fields.length; i++) {
                if (fields[i].getType() == Collection.class || fields[i].getType() == Map.class) {
                    System.out.println(Modifier.toString(fields[i].getModifiers()) + "  " + fields[i].getGenericType() + "  " + fields[i].getName());
                } else {
                    System.out.println(Modifier.toString(fields[i].getModifiers()) + "  " + fields[i].getType() + "  " + fields[i].getName());
                }
                if (!fields[i].getType().isPrimitive() && fields[i].getType() != String.class && fields[i].getType() != Object.class && fields[i].getType() != clazz && fields[i].getType() != Collection.class && fields[i].getType() == Map.class && superclass != null) {
                    System.out.println("******************************************************************************");
                    reflectionAboutClass(fields[i].getType());
                    System.out.println("******************************************************************************");
                }
            }
        }
        System.out.println("==============================================================================");

    }

    private static <T> void reflectionMethods(Class<T> clazz) {
        Parameter[] parameters = null;
        Method[] methods = clazz.getDeclaredMethods();
        Class superclass = clazz.getSuperclass();

        System.out.println("Список всех методов:");
        if (methods.length > 0 && superclass != null) {
            for (int i = 0; i < methods.length; i++) {
                System.out.print(Modifier.toString(methods[i].getModifiers()) + "  " + methods[i].getReturnType() + "  " + methods[i].getName() + "(");
                parameters = methods[i].getParameters();
                if (parameters.length > 0) {
                    for (int j = 0; j < parameters.length; j++) {
                        System.out.print(parameters[j].getType() + " " + parameters[j].getName() + "  ");
                    }
                }
                System.out.print(")");
                System.out.println();
                if (parameters.length > 0) {
                    for (int j = 0; j < parameters.length; j++) {
                        if (!parameters[j].getType().isPrimitive() && parameters[j].getType() != String.class && parameters[j].getType() != Object.class && parameters[j].getType() != clazz && parameters[j].getType() != Collection.class && parameters[j].getType() != Map.class) {
                            System.out.println("******************************************************************************");
                            reflectionAboutClass(parameters[j].getType());
                            System.out.println("******************************************************************************");
                        }
                    }
                }
            }
        }
        System.out.println("==============================================================================");

    }

    private static <T> void reflectionAboutClass(Class<T> clazz) {
        reflectionClassPackage(clazz);
        reflectionInterfaces(clazz);
        reflectionConstructors(clazz);
        reflectionFields(clazz);
        reflectionMethods(clazz);
    }

    public static void main(String[] args) {

       /* IdentifierPerson idPerson = new IdentifierPerson("Petr", "Petrov", 5);
        reflectionAboutClass(idPerson.getClass());
        List<Person> list1 = new ArrayList<>();
        list1.add(new IdentifierPerson("MARIA", "KUZNETSOVA", 18));
        list1.add(new Person("IVAN", "IVANOV", 88));
        list1.add(new Person("M***", "K***", 15));
        list1.add(new Person("STEPAN", "IVANOV", 118));

        ReflectionTest test = new ReflectionTest(new Person("M***", "K***", 15), 7, list1);

        reflectionAboutClass(test.getClass());*/
        BillPerson billPerson = new BillPerson("YANA", "KUZNETSOVA", 48, LocalDate.now(), 89.5);
        reflectionAboutClass(billPerson.getClass());


    }
}
