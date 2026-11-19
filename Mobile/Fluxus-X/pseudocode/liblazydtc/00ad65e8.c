/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad65e8
 */

void FUN_00ad65e8(long param_1)

{
  void *ptr;
  
  ptr = *(void **)(param_1 + 0x98);
  if (ptr == (void *)0x0) {
    return;
  }
  BN_free(*(BIGNUM **)((long)ptr + 8));
  CRYPTO_free(*(void **)((long)ptr + 0x38));
  CRYPTO_free(*(void **)((long)ptr + 0x40));
  CRYPTO_free(ptr);
  return;
}

