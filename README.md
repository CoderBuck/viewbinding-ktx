# viewbinding-ktx

[![Release](https://jitpack.io/v/CoderBuck/viewbinding-ktx.svg)]
(https://jitpack.io/#CoderBuck/viewbinding-ktx)

## 添加依赖

```
// project
maven { url 'https://jitpack.io' }

// app
implementation 'com.github.coderbuck:viewbinding-ktx:1.0.0'
```

## 使用

```
// AppCompatActivity or Fragment
val binding by viewBinding(ActivityMainBinding::bind)
```

