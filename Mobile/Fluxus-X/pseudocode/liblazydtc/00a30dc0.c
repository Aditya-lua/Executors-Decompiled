/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30dc0
 */

EC_POINT * EC_GROUP_get0_generator(EC_GROUP *group)

{
  return *(EC_POINT **)(group + 8);
}

