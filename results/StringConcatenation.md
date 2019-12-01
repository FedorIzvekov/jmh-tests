# CPU Intel i7-10510U 1.80GHz

## Liberica JDK 11.0.5
| Benchmark                                        | (stringCount) | (stringLength) | Mode | Cnt |                             Score                             |   Error   | Units |
|:-------------------------------------------------|:-------------:|:--------------:|:----:|:---:|:-------------------------------------------------------------:|:---------:|:-----:|
| StringConcatenation.stringBuffer                 |      10       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    185.858    </span> | ±  17.460 | ns/op |
| StringConcatenation.stringBuffer                 |      50       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    812.353    </span> | ±   2.764 | ns/op |
| StringConcatenation.stringBuffer                 |      100      |       15       | avgt | 20  | <span style="background-color:#1E1F22">   1637.709    </span> | ±   9.675 | ns/op |
| StringConcatenation.stringBufferWithPresetSize   |      10       |       15       | avgt | 20  | <span style="background-color:green">      150.514    </span> | ±   1.235 | ns/op |
| StringConcatenation.stringBufferWithPresetSize   |      50       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    754.906    </span> | ±   4.423 | ns/op |
| StringConcatenation.stringBufferWithPresetSize   |      100      |       15       | avgt | 20  | <span style="background-color:#1E1F22">   1547.489    </span> | ±  15.753 | ns/op |
| StringConcatenation.stringBuilder                |      10       |       15       | avgt | 20  | <span style="background-color:green">      163.658    </span> | ±   3.736 | ns/op |
| StringConcatenation.stringBuilder                |      50       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    641.099    </span> | ±  13.448 | ns/op |
| StringConcatenation.stringBuilder                |      100      |       15       | avgt | 20  | <span style="background-color:#1E1F22">   1343.843    </span> | ±  27.650 | ns/op |
| StringConcatenation.stringBuilderWithPresetSize  |      10       |       15       | avgt | 20  | <span style="background-color:green">      143.107    </span> | ±   3.161 | ns/op |
| StringConcatenation.stringBuilderWithPresetSize  |      50       |       15       | avgt | 20  | <span style="background-color:green">      543.589    </span> | ±  11.756 | ns/op |
| StringConcatenation.stringBuilderWithPresetSize  |      100      |       15       | avgt | 20  | <span style="background-color:green">     1056.853    </span> | ±  15.782 | ns/op |
| StringConcatenation.stringConcat                 |      10       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    200.151    </span> | ±   7.227 | ns/op |
| StringConcatenation.stringConcat                 |      50       |       15       | avgt | 20  | <span style="background-color:#1E1F22">   1999.272    </span> | ±  24.456 | ns/op |
| StringConcatenation.stringConcat                 |      100      |       15       | avgt | 20  | <span style="background-color:red">       7249.557    </span> | ±  49.220 | ns/op |
| StringConcatenation.stringPlus                   |      10       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    185.663    </span> | ±   5.332 | ns/op |
| StringConcatenation.stringPlus                   |      50       |       15       | avgt | 20  | <span style="background-color:#1E1F22">   1973.417    </span> | ±   5.875 | ns/op |
| StringConcatenation.stringPlus                   |      100      |       15       | avgt | 20  | <span style="background-color:red">       7160.190    </span> | ±  36.283 | ns/op |
| StringConcatenation.stringJoiner                 |      10       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    196.539    </span> | ±   3.488 | ns/op |
| StringConcatenation.stringJoiner                 |      50       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    859.977    </span> | ±  24.205 | ns/op |
| StringConcatenation.stringJoiner                 |      100      |       15       | avgt | 20  | <span style="background-color:#1E1F22">   1844.472    </span> | ±  47.300 | ns/op |
| StringConcatenation.stringStreamJoining          |      10       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    213.994    </span> | ±   1.865 | ns/op |
| StringConcatenation.stringStreamJoining          |      50       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    725.296    </span> | ±  14.702 | ns/op |
| StringConcatenation.stringStreamJoining          |      100      |       15       | avgt | 20  | <span style="background-color:#1E1F22">   1479.620    </span> | ±  17.037 | ns/op |
| StringConcatenation.stringFormat                 |      10       |       15       | avgt | 20  | <span style="background-color:red">       1815.746    </span> | ±  18.201 | ns/op |
| StringConcatenation.stringFormat                 |      50       |       15       | avgt | 20  | <span style="background-color:red">       8391.629    </span> | ± 104.358 | ns/op |
| StringConcatenation.stringFormat                 |      100      |       15       | avgt | 20  | <span style="background-color:red">      17427.287    </span> | ± 433.179 | ns/op |


## Liberica JDK 1.8.0_232
| Benchmark                                        | (stringCount) | (stringLength) | Mode | Cnt | Score                                                         |   Error   | Units |
|--------------------------------------------------|:-------------:|:--------------:|:----:|:---:|---------------------------------------------------------------|:---------:|:-----:|
| StringConcatenation.stringBuffer                 |      10       |       15       | avgt | 20  | <span style="background-color:green">      185.641    </span> | ±   3.192 | ns/op |
| StringConcatenation.stringBuffer                 |      50       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    865.826    </span> | ±   9.467 | ns/op |
| StringConcatenation.stringBuffer                 |      100      |       15       | avgt | 20  | <span style="background-color:#1E1F22">   1683.737    </span> | ±  13.128 | ns/op |
| StringConcatenation.stringBufferWithPresetSize   |      10       |       15       | avgt | 20  | <span style="background-color:green">      189.753    </span> | ±   2.172 | ns/op |
| StringConcatenation.stringBufferWithPresetSize   |      50       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    749.340    </span> | ±  10.100 | ns/op |
| StringConcatenation.stringBufferWithPresetSize   |      100      |       15       | avgt | 20  | <span style="background-color:#1E1F22">   1510.511    </span> | ±   7.374 | ns/op |
| StringConcatenation.stringBuilder                |      10       |       15       | avgt | 20  | <span style="background-color:green">      194.692    </span> | ±   1.396 | ns/op |
| StringConcatenation.stringBuilder                |      50       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    884.235    </span> | ±   2.756 | ns/op |
| StringConcatenation.stringBuilder                |      100      |       15       | avgt | 20  | <span style="background-color:#1E1F22">   1715.167    </span> | ±  10.007 | ns/op |
| StringConcatenation.stringBuilderWithPresetSize  |      10       |       15       | avgt | 20  | <span style="background-color:green">      189.055    </span> | ±   2.825 | ns/op |
| StringConcatenation.stringBuilderWithPresetSize  |      50       |       15       | avgt | 20  | <span style="background-color:green">      686.257    </span> | ±  11.754 | ns/op |
| StringConcatenation.stringBuilderWithPresetSize  |      100      |       15       | avgt | 20  | <span style="background-color:green">     1397.022    </span> | ±  11.030 | ns/op |
| StringConcatenation.stringConcat                 |      10       |       15       | avgt | 20  | <span style="background-color:red">        284.086    </span> | ±   5.390 | ns/op |
| StringConcatenation.stringConcat                 |      50       |       15       | avgt | 20  | <span style="background-color:red">       3491.293    </span> | ±  17.221 | ns/op |
| StringConcatenation.stringConcat                 |      100      |       15       | avgt | 20  | <span style="background-color:red">      13042.129    </span> | ±  66.328 | ns/op |
| StringConcatenation.stringPlus                   |      10       |       15       | avgt | 20  | <span style="background-color:green">      190.636    </span> | ±   3.112 | ns/op |
| StringConcatenation.stringPlus                   |      50       |       15       | avgt | 20  | <span style="background-color:red">       3494.043    </span> | ±   6.300 | ns/op |
| StringConcatenation.stringPlus                   |      100      |       15       | avgt | 20  | <span style="background-color:red">      13218.259    </span> | ±  19.153 | ns/op |
| StringConcatenation.stringJoiner                 |      10       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    258.098    </span> | ±   2.408 | ns/op |
| StringConcatenation.stringJoiner                 |      50       |       15       | avgt | 20  | <span style="background-color:#1E1F22">   1093.233    </span> | ±  19.396 | ns/op |
| StringConcatenation.stringJoiner                 |      100      |       15       | avgt | 20  | <span style="background-color:#1E1F22">   2182.266    </span> | ±  32.426 | ns/op |
| StringConcatenation.stringStreamJoining          |      10       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    223.913    </span> | ±   4.080 | ns/op |
| StringConcatenation.stringStreamJoining          |      50       |       15       | avgt | 20  | <span style="background-color:#1E1F22">    946.130    </span> | ±   2.597 | ns/op |
| StringConcatenation.stringStreamJoining          |      100      |       15       | avgt | 20  | <span style="background-color:#1E1F22">   1816.649    </span> | ±   7.025 | ns/op |
| StringConcatenation.stringFormat                 |      10       |       15       | avgt | 20  | <span style="background-color:red">       1993.353    </span> | ±  73.527 | ns/op |
| StringConcatenation.stringFormat                 |      50       |       15       | avgt | 20  | <span style="background-color:red">       9111.596    </span> | ±  53.977 | ns/op |
| StringConcatenation.stringFormat                 |      100      |       15       | avgt | 20  | <span style="background-color:red">      17964.025    </span> | ± 210.634 | ns/op |
