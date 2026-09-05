## Stiven Franco

### GIT

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

git pull descarga los cambios y además intenta integrarlos en la rama actual.

# 6. ¿Qué es un branch y cómo Git gestiona los punteros a commits?

Un branch es una rama de desarrollo que permite trabajar sobre una línea independiente de commits. Git gestiona las ramas mediante punteros que apuntan a determinados commits y se actualizan conforme se crean nuevos commits.

# 7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?

Un merge integra los cambios de una rama en otra. Puede haber conflictos cuando ambas ramas modifican las mismas partes de un archivo de manera incompatible. Se resuelven revisando manualmente los archivos afectados, escogiendo o combinando los cambios y después realizando git add y un nuevo commit.

# 8. ¿Cómo funciona el área de staging (git add)?

git add coloca los cambios seleccionados en el área de staging para indicar que serán incluidos en el próximo commit. Si se omite, los cambios no estarán preparados para ese commit.

# 9. ¿Qué es .gitignore?

Es un archivo que especifica qué archivos o carpetas Git debe ignorar y no incluir en el seguimiento, como archivos temporales, configuraciones locales o archivos generados automáticamente.

# 10. ¿Cuál es la diferencia entre commit amend y un nuevo commit?

git commit --amend modifica el commit anterior, por ejemplo para corregir su mensaje o agregar cambios que se olvidaron. Un nuevo commit crea una nueva entrada independiente en el historial.

# 11. ¿Cómo se utiliza git stash?

git stash guarda temporalmente cambios que todavía no queremos confirmar mediante un commit. Es útil cuando necesitamos cambiar de rama o realizar otra tarea sin perder nuestro trabajo actual.

# 12. ¿Qué mecanismos ofrece Git para deshacer cambios?

- git reset: mueve el puntero de la rama y puede quitar cambios del historial.
- git revert: crea un nuevo commit que deshace los cambios de un commit anterior.
- git checkout: permite cambiar de rama o recuperar versiones de archivos, dependiendo del uso.

# 13. ¿Cómo funcionan origin y upstream?

Son nombres utilizados para identificar repositorios remotos. Normalmente origin hace referencia al repositorio remoto principal del proyecto clonado, mientras que upstream suele utilizarse para identificar el repositorio original cuando se trabaja con un fork. Se pueden gestionar mediante comandos como git remote add, git remote -v y git remote remove.

# 14. ¿Cómo puedo inspeccionar el historial de commits?

Se pueden utilizar: 

- git log: muestra el historial de commits.
- git diff: muestra diferencias entre cambios.
- git show: muestra información detallada de un commit.
