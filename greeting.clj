(ns my-clojure-warehouse.greeting)

(defn hello
  "No args"
  []
  (println "Hello, world!!"))

(defn hello2
  "One arg"
  [^String name]
  (println (format "Hello, %s!!" name)))
