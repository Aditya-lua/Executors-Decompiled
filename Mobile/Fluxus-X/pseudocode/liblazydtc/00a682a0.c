/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a682a0
 */

long * EVP_MAC_CTX_new(undefined8 *param_1)

{
  int iVar1;
  long *ptr;
  long lVar2;
  code *pcVar3;
  
  ptr = (long *)CRYPTO_zalloc(0x10,"crypto/evp/mac_lib.c",0x18);
  if (ptr == (long *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/mac_lib.c",0x1d,"EVP_MAC_CTX_new");
    ERR_set_error(6,0xc0100,0);
  }
  else {
    pcVar3 = (code *)param_1[6];
    ossl_provider_ctx(*param_1);
    lVar2 = (*pcVar3)();
    ptr[1] = lVar2;
    if ((lVar2 != 0) && (iVar1 = EVP_MAC_up_ref(param_1), iVar1 != 0)) {
      *ptr = (long)param_1;
      return ptr;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/mac_lib.c",0x1d,"EVP_MAC_CTX_new");
    ERR_set_error(6,0xc0100,0);
    (*(code *)param_1[8])(ptr[1]);
  }
  CRYPTO_free(ptr);
  return (long *)0x0;
}

