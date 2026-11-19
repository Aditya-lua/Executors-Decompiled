/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a86570
 */

void EVP_CIPHER_meth_free(long param_1)

{
  if ((param_1 == 0) || (*(int *)(param_1 + 0x18) != 2)) {
    return;
  }
  evp_cipher_free_int();
  return;
}

