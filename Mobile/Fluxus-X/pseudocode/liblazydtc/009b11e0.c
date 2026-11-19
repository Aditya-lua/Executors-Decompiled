/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b11e0
 */

uint SSL_CIPHER_is_aead(long param_1)

{
  return *(uint *)(param_1 + 0x28) >> 6 & 1;
}

