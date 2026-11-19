/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f538
 */

EC_GROUP * EC_KEY_get0_group(EC_KEY *key)

{
  return *(EC_GROUP **)(key + 0x18);
}

