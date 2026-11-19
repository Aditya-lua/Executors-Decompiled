/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae86d0
 */

undefined8 * OPENSSL_sk_dup(int *param_1)

{
  undefined8 *ptr;
  void *__dest;
  undefined8 uVar1;
  
  ptr = CRYPTO_malloc(0x20,"crypto/stack/stack.c",0x30);
  if (ptr == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/stack/stack.c",0x4b,"OPENSSL_sk_dup");
    ERR_set_error(0xf,0xc0100,0);
  }
  else {
    if (param_1 == (int *)0x0) {
      *(undefined4 *)ptr = 0;
      *(undefined4 *)(ptr + 2) = 0;
      ptr[3] = 0;
    }
    else {
      uVar1 = *(undefined8 *)(param_1 + 4);
      ptr[3] = *(undefined8 *)(param_1 + 6);
      ptr[2] = uVar1;
      uVar1 = *(undefined8 *)param_1;
      ptr[1] = *(undefined8 *)(param_1 + 2);
      *ptr = uVar1;
      if (*param_1 != 0) {
        __dest = CRYPTO_malloc(param_1[5] << 3,"crypto/stack/stack.c",0x44);
        ptr[1] = __dest;
        if (__dest != (void *)0x0) {
          memcpy(__dest,*(void **)(param_1 + 2),(long)*param_1 << 3);
          return ptr;
        }
        ERR_new();
        ERR_set_debug("crypto/stack/stack.c",0x4b,"OPENSSL_sk_dup");
        ERR_set_error(0xf,0xc0100,0);
        if (ptr == (undefined8 *)0x0) {
          return (undefined8 *)0x0;
        }
        CRYPTO_free((void *)ptr[1]);
        CRYPTO_free(ptr);
        return (undefined8 *)0x0;
      }
    }
    ptr[1] = 0;
    *(undefined4 *)((long)ptr + 0x14) = 0;
  }
  return ptr;
}

