(defproject test-project "0.1.0"
  :description "test project with some scala"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.scala-lang/scala-library "2.10.4"]]
  :scala-source-path "scala"
  :plugins [[lein-scalac "0.1.1"]]
  :prep-tasks ["scalac"]
  ;; for Leiningen 1.x you need this instead:
  ;; :hooks [leiningen.hooks.scalac]
  :main test-project.core)
