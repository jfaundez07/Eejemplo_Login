# Ejemplo Login 

### 11/09

## Descripcion:

El código proporcionado es una implementación en Java de un sistema básico de autenticación de usuarios. La clase principal Main contiene varios métodos que se ejecutan para validar las credenciales de un usuario.

El método main es el punto de entrada del programa y simplemente llama al método setUp. Este método setUp inicializa dos arreglos: uno para los nombres de usuario (users) y otro para las contraseñas correspondientes (passwords).

```java
String[] users  = {"samuel01", "nicolas02", "joaquin03"};
String[] passwords = {"sepulveda_ufrontera", "pelizari_ufromail","faundez_ufromail"};
```
El método run es responsable de manejar la interacción con el usuario. 

**Primero:** solicita al usuario que ingrese su nombre de usuario y contraseña. 

**Luego**: verifica si el nombre de usuario ingresado existe en el arreglo users utilizando el método validateUser. Si el usuario no se encuentra, imprime un mensaje y termina la ejecución del método. Si el usuario es válido, obtiene el índice del usuario en el arreglo users mediante el método getIndex. 

**Por ultimo**: Con este índice, verifica si la contraseña ingresada coincide con la contraseña almacenada en el arreglo passwords en la misma posición, utilizando el método validateCredentials. Si la contraseña no coincide, imprime un mensaje de error y termina la ejecución. 

Si todo es correcto, imprime un mensaje de bienvenida.