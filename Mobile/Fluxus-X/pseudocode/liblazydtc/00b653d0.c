/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b653d0
 */

void ossl_cipher_generic_reset_ctx(long param_1)

{
  if ((param_1 != 0) && (*(int *)(param_1 + 0x80) != 0)) {
    CRYPTO_free(*(void **)(param_1 + 0x78));
    *(undefined4 *)(param_1 + 0x80) = 0;
    *(undefined8 *)(param_1 + 0x78) = 0;
  }
  return;
}

