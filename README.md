## Stiven Franco
# 1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?

Un repositorio de Git es un proyecto que, además de contener los archivos, guarda el historial de cambios realizados. Permite saber qué se modifico, cuándo, quién lo hizo y recuperar versiones anteriores.

# 2. ¿Cuáles son las tres áreas principales de Git?

- Working Directory: donde se encuentran y modifican los archivos.
- Staging Area / Index: área donde se seleccionan los cambios que se incluirán en el próximo commit mediante git add.
- Repository: almacena permanentemente los commits y el historial del proyecto.

# 3. ¿Cómo representa Git los cambios internamente?

Git utiliza diferentes tipos de objetos:

- Blob: almacena el contenido de los archivos.
- Tree: representa directorios y relaciona archivos con sus blobs.
- Commit: guarda una versión del proyecto junto con información sobre el cambio.
- Tag: sirve para identificar o marcar determinados commits, normalmente versiones importantes.

# 4. ¿Cómo se crea un commit y qué información almacena?

Primero se agregan los cambios al staging con git add y después se crea el commit con git commit. El commit almacena información como el autor, fecha, mensaje, referencia al árbol de archivos y los commits anteriores.

# 5. ¿Cuál es la diferencia entre git pull y git fetch?

git fetch descarga los cambios del repositorio remoto pero no modifica directamente la rama de trabajo.

git pull descarga los cambios y además intenta integrarlos en la rama actual..