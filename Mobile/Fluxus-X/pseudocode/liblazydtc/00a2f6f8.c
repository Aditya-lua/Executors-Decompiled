/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f6f8
 */

EC_POINT * EC_KEY_get0_public_key(EC_KEY *key)

{
  return *(EC_POINT **)(key + 0x20);
}

