/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa34e8
 */

undefined8 OSSL_PROVIDER_set_default_search_path(undefined8 param_1,char *param_2)

{
  int iVar1;
  char *ptr;
  long lVar2;
  
  if (param_2 == (char *)0x0) {
    ptr = (char *)0x0;
  }
  else {
    ptr = CRYPTO_strdup(param_2,"crypto/provider_core.c",0x32f);
    if (ptr == (char *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/provider_core.c",0x331,"OSSL_PROVIDER_set_default_search_path");
      ERR_set_error(0xf,0xc0100,0);
      return 0;
    }
  }
  lVar2 = ossl_lib_ctx_get_data(param_1,1,&DAT_00c6d4c8);
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x156,"get_provider_store");
    ERR_set_error(0xf,0xc0103,0);
  }
  else {
    iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(lVar2 + 0x18));
    if (iVar1 != 0) {
      CRYPTO_free(*(void **)(lVar2 + 0x28));
      *(char **)(lVar2 + 0x28) = ptr;
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar2 + 0x18));
      return 1;
    }
  }
  CRYPTO_free(ptr);
  return 0;
}

