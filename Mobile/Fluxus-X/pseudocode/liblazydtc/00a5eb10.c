/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5eb10
 */

uint EVP_CIPHER_get_mode(long param_1)

{
  return *(uint *)(param_1 + 0x10) & 0xf0007;
}

