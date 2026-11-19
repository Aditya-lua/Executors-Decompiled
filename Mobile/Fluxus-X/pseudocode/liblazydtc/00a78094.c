/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a78094
 */

void FUN_00a78094(long param_1)

{
  void *ptr;
  
  ptr = *(void **)(param_1 + 0x98);
  if (ptr == (void *)0x0) {
    return;
  }
  CRYPTO_free(*(void **)((long)ptr + 0x40));
  ASN1_OBJECT_free(*(ASN1_OBJECT **)((long)ptr + 0x30));
  CRYPTO_free(ptr);
  return;
}

