# My Clojure Warehouse

個人学習用

# Usage

```
$ clj

user=> (load-file "ファイル名")

user=> (in-ns 名前空間)

例:

user=> (in-ns 'my-clojure-warehouse.greeting)
#object[clojure.lang.Namespace 0x6e1472cf "my-clojure-warehouse.greeting"]
my-clojure-warehouse.greeting=> (greet)
Hello, world !!
nil
my-clojure-warehouse.greeting=> (greet "Tom")
Hello, Tom !!
nil
my-clojure-warehouse.greeting=> (in-ns 'user)
#object[clojure.lang.Namespace 0x4a6d5660 "user"]
user=> (. System exit 0)

```
