/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f5ec
 */

BIGNUM * EC_KEY_get0_private_key(EC_KEY *key)

{
  return *(BIGNUM **)(key + 0x28);
}

