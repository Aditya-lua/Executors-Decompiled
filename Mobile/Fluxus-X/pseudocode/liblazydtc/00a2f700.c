/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f700
 */

uint EC_KEY_get_enc_flags(EC_KEY *key)

{
  return *(uint *)(key + 0x30);
}

