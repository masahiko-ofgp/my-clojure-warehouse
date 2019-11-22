(def curdir (clojure.java.io/file "."))

(def files (file-seq curdir))

(defn listDir []
  (doseq [f files]
    (if (.isDirectory f)
      (println "\u001b[01;34m" (.getPath f) "\u001b[00m")
      (println (.getPath f)))))
