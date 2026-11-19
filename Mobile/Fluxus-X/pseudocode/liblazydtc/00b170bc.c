/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b170bc
 */

undefined4 * OSSL_HTTP_REQ_CTX_new(long param_1,long param_2,int param_3)

{
  undefined4 *ptr;
  void *pvVar1;
  
  if ((param_1 == 0) || (param_2 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0x5f,"OSSL_HTTP_REQ_CTX_new");
    ERR_set_error(0x3d,0xc0102,0);
  }
  else {
    ptr = (undefined4 *)CRYPTO_zalloc(0xc0,"crypto/http/http_client.c",99);
    if (ptr == (undefined4 *)0x0) {
      return (undefined4 *)0x0;
    }
    *ptr = 0x1000;
    if (param_3 < 1) {
      param_3 = 0x1000;
    }
    ptr[4] = param_3;
    pvVar1 = CRYPTO_malloc(param_3,"crypto/http/http_client.c",0x67);
    *(void **)(ptr + 2) = pvVar1;
    *(long *)(ptr + 6) = param_1;
    *(long *)(ptr + 8) = param_2;
    if (pvVar1 != (void *)0x0) {
      *(undefined8 *)(ptr + 0x26) = 0x19000;
      return ptr;
    }
    CRYPTO_free(ptr);
  }
  return (undefined4 *)0x0;
}

