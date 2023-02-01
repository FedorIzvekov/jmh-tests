#  Intel i7-10510U CPU @ 1.80GHz

## JDK 1.8.0_192

Benchmark                          (stringCount)  (stringLength)  Mode  Cnt        Score        Error  Units
StringConcatenation.stringBuffer               5              15  avgt   20  1495198.898 ± 386496.148  ns/op
StringConcatenation.stringBuffer              10              15  avgt   20  2174859.094 ± 550925.575  ns/op
StringConcatenation.stringBuffer              25              15  avgt   20  3434487.462 ± 839023.812  ns/op
StringConcatenation.stringBuilder              5              15  avgt   20  1502581.411 ± 389638.484  ns/op
StringConcatenation.stringBuilder             10              15  avgt   20  2186909.354 ± 554237.573  ns/op
StringConcatenation.stringBuilder             25              15  avgt   20  3450306.875 ± 846434.203  ns/op
StringConcatenation.stringConcat               5              15  avgt   20      135.307 ±      1.006  ns/op
StringConcatenation.stringConcat              10              15  avgt   20      286.113 ±      2.213  ns/op
StringConcatenation.stringConcat              25              15  avgt   20      996.073 ±     14.477  ns/op
StringConcatenation.stringFormat               5              15  avgt   20     1051.182 ±     21.096  ns/op
StringConcatenation.stringFormat              10              15  avgt   20     2032.442 ±     34.114  ns/op
StringConcatenation.stringFormat              25              15  avgt   20     4691.507 ±     71.001  ns/op
StringConcatenation.stringJoiner               5              15  avgt   20  1500556.481 ± 394235.878  ns/op
StringConcatenation.stringJoiner              10              15  avgt   20  2164250.829 ± 541644.565  ns/op
StringConcatenation.stringJoiner              25              15  avgt   20  3479328.813 ± 863758.928  ns/op
StringConcatenation.stringPlus                 5              15  avgt   20       76.220 ±      1.038  ns/op
StringConcatenation.stringPlus                10              15  avgt   20      188.868 ±      3.146  ns/op
StringConcatenation.stringPlus                25              15  avgt   20      953.947 ±      4.827  ns/op


## JDK 11.0.18

Benchmark                          (stringCount)  (stringLength)  Mode  Cnt        Score         Error  Units
StringConcatenation.stringBuffer               5              15  avgt   20  1069312.679 ±  298383.622  ns/op
StringConcatenation.stringBuffer              10              15  avgt   20  1549512.422 ±  393806.475  ns/op
StringConcatenation.stringBuffer              25              15  avgt   20  2468070.547 ±  588222.347  ns/op
StringConcatenation.stringBuilder              5              15  avgt   20  1070804.474 ±  300139.610  ns/op
StringConcatenation.stringBuilder             10              15  avgt   20  1549032.957 ±  391869.308  ns/op
StringConcatenation.stringBuilder             25              15  avgt   20  2465233.742 ±  589830.764  ns/op
StringConcatenation.stringConcat               5              15  avgt   20       92.307 ±       0.632  ns/op
StringConcatenation.stringConcat              10              15  avgt   20      197.108 ±       2.087  ns/op
StringConcatenation.stringConcat              25              15  avgt   20      624.495 ±       3.936  ns/op
StringConcatenation.stringFormat               5              15  avgt   20      881.014 ±      14.352  ns/op
StringConcatenation.stringFormat              10              15  avgt   20     1750.522 ±      30.190  ns/op
StringConcatenation.stringFormat              25              15  avgt   20     4076.217 ±      53.523  ns/op
StringConcatenation.stringJoiner               5              15  avgt   20  1945623.679 ±  517144.656  ns/op
StringConcatenation.stringJoiner              10              15  avgt   20  2835105.864 ±  731073.450  ns/op
StringConcatenation.stringJoiner              25              15  avgt   20  4551613.246 ± 1125407.570  ns/op
StringConcatenation.stringPlus                 5              15  avgt   20       90.937 ±       0.995  ns/op
StringConcatenation.stringPlus                10              15  avgt   20      179.885 ±       1.527  ns/op
StringConcatenation.stringPlus                25              15  avgt   20      609.623 ±       7.707


## JDK 17.0.6

Benchmark                          (stringCount)  (stringLength)  Mode  Cnt        Score         Error  Units
StringConcatenation.stringBuffer               5              15  avgt   20  1054616.290 ±  294339.750  ns/op
StringConcatenation.stringBuffer              10              15  avgt   20  1528225.335 ±  389187.475  ns/op
StringConcatenation.stringBuffer              25              15  avgt   20  2434772.630 ±  580369.266  ns/op
StringConcatenation.stringBuilder              5              15  avgt   20  1062743.378 ±  299379.574  ns/op
StringConcatenation.stringBuilder             10              15  avgt   20  1529500.904 ±  387642.285  ns/op
StringConcatenation.stringBuilder             25              15  avgt   20  2430015.608 ±  578023.095  ns/op
StringConcatenation.stringConcat               5              15  avgt   20       80.799 ±       0.789  ns/op
StringConcatenation.stringConcat              10              15  avgt   20      184.414 ±       2.220  ns/op
StringConcatenation.stringConcat              25              15  avgt   20      614.078 ±       5.430  ns/op
StringConcatenation.stringFormat               5              15  avgt   20      270.741 ±       1.872  ns/op
StringConcatenation.stringFormat              10              15  avgt   20      497.868 ±       4.251  ns/op
StringConcatenation.stringFormat              25              15  avgt   20     1234.592 ±      23.464  ns/op
StringConcatenation.stringJoiner               5              15  avgt   20  2280971.959 ±  552433.000  ns/op
StringConcatenation.stringJoiner              10              15  avgt   20  3194597.951 ±  771424.308  ns/op
StringConcatenation.stringJoiner              25              15  avgt   20  5059019.742 ± 1245558.176  ns/op
StringConcatenation.stringPlus                 5              15  avgt   20       77.358 ±       0.671  ns/op
StringConcatenation.stringPlus                10              15  avgt   20      168.432 ±       2.487  ns/op
StringConcatenation.stringPlus                25              15  avgt   20      583.721 ±       8.772  ns/op


# Apple M1 Pro

## JDK 17.0.6 arm

Benchmark                          (stringCount)  (stringLength)  Mode  Cnt        Score        Error  Units
StringConcatenation.stringBuffer               5              15  avgt   20   566315.678 ± 148143.670  ns/op
StringConcatenation.stringBuffer              10              15  avgt   20   760124.795 ± 153287.284  ns/op
StringConcatenation.stringBuffer              25              15  avgt   20  1034002.580 ± 180377.047  ns/op
StringConcatenation.stringBuilder              5              15  avgt   20   569143.093 ± 148588.641  ns/op
StringConcatenation.stringBuilder             10              15  avgt   20   760585.480 ± 153925.336  ns/op
StringConcatenation.stringBuilder             25              15  avgt   20  1034631.732 ± 178237.807  ns/op
StringConcatenation.stringConcat               5              15  avgt   20       45.157 ±      0.130  ns/op
StringConcatenation.stringConcat              10              15  avgt   20      105.931 ±      0.237  ns/op
StringConcatenation.stringConcat              25              15  avgt   20      350.493 ±      1.638  ns/op
StringConcatenation.stringFormat               5              15  avgt   20      116.425 ±      3.166  ns/op
StringConcatenation.stringFormat              10              15  avgt   20      205.921 ±      0.170  ns/op
StringConcatenation.stringFormat              25              15  avgt   20      516.395 ±      3.424  ns/op
StringConcatenation.stringJoiner               5              15  avgt   20  1590169.981 ± 368939.183  ns/op
StringConcatenation.stringJoiner              10              15  avgt   20  2230513.163 ± 529438.973  ns/op
StringConcatenation.stringJoiner              25              15  avgt   20  3692373.921 ± 882606.562  ns/op
StringConcatenation.stringPlus                 5              15  avgt   20       58.030 ±      0.132  ns/op
StringConcatenation.stringPlus                10              15  avgt   20      113.409 ±      1.061  ns/op
StringConcatenation.stringPlus                25              15  avgt   20      327.947 ±      0.693  ns/op