/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae8a68
 */

void * OPENSSL_sk_new_reserve(undefined8 param_1,int param_2)

{
  int iVar1;
  void *ptr;
  
  ptr = (void *)CRYPTO_zalloc(0x20,"crypto/stack/stack.c",0xe4);
  if (ptr == (void *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/stack/stack.c",0xe7,"OPENSSL_sk_new_reserve");
    ERR_set_error(0xf,0xc0100,0);
  }
  else {
    *(undefined8 *)((long)ptr + 0x18) = param_1;
    if ((0 < param_2) && (iVar1 = FUN_00ae8ba0(ptr,param_2,1), iVar1 == 0)) {
      CRYPTO_free(*(void **)((long)ptr + 8));
      CRYPTO_free(ptr);
      ptr = (void *)0x0;
    }
  }
  return ptr;
}

