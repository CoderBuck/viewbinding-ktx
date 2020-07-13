# viewbinding-ktx

[![Release](https://jitpack.io/v/CoderBuck/viewbinding-ktx.svg)](https://jitpack.io/#CoderBuck/viewbinding-ktx)

A viewbinding delegate. This is based on [Simple one-liner ViewBinding in Fragments and Activities with Kotlin](https://medium.com/@Zhuinden/simple-one-liner-viewbinding-in-fragments-and-activities-with-kotlin-961430c6c07c)
by [Zhuinden](https://github.com/Zhuinden)

## Gradle

project build.gradle

```groovy
allprojects {
    repositories {
        // ...
        maven { url 'https://jitpack.io' }
    }
}
```

app build.gradle

```groovy
implementation 'com.github.coderbuck:viewbinding-ktx:1.0.0'
```

## Usage

in AppCompatActivity or Fragment,

```kotlin
val binding by viewBinding(ActivityMainBinding::bind)
```
> note: replace ActivityMainBinding with your own

##

## License

```
   Copyright 2020 CoderBuck

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
