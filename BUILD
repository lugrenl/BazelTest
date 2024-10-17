java_binary(
name = "BazelTest",
srcs = glob(["src/main/java/org/example/*.java"]),
main_class = "org.example.Main",
deps = [
"@maven//:org_apache_commons_commons_lang3", # Зависимость от внешней библиотеки
":Operations",
],
)

java_import(
    name = "Operations",
    jars = ["src/main/java/org/example/lib/Operations.jar"],
)
