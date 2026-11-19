/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30a48
 */

EC_METHOD * EC_GROUP_method_of(EC_GROUP *group)

{
  return *(EC_METHOD **)group;
}

