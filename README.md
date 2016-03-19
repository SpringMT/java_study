## Javaをさくっと書いて実行させる

### ファイル作成

### コマンド実行
#### 単体
javac HelloWorld.java
java HelloWorld

#### gladleを使ったjUnitと合わせた使い方

```
brew install gradle
```

dir構成はこのリポジトリの通りにする

```
├── build.gradle
└── src
    ├── main
    │   ├── java
    │   │   ├── HelloWorld.java
    │   │   └── org
    │   │       └── json
    │   │           ├── JSONTokener.java
    │   │           └── JSONWriter.java
    │   └── resources
    └── test
        ├── java
        │   └── HelloWorldTest.java
        └── resources
```

gradle test

