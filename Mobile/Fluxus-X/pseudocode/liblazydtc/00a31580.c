/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a31580
 */

EC_METHOD * EC_POINT_method_of(EC_POINT *point)

{
  return *(EC_METHOD **)point;
}

