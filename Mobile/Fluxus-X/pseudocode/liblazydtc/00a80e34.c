/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a80e34
 */

void * OSSL_LIB_CTX_new(void)

{
  int iVar1;
  void *ptr;
  
  ptr = (void *)CRYPTO_zalloc(0x1c8,"crypto/context.c",0xc0);
  if ((ptr != (void *)0x0) && (iVar1 = FUN_00a80e90(ptr), iVar1 == 0)) {
    CRYPTO_free(ptr);
    ptr = (void *)0x0;
  }
  return ptr;
}

