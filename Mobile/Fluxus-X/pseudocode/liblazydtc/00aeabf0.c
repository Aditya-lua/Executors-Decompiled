/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeabf0
 */

undefined4 * OSSL_STORE_SEARCH_by_key_fingerprint(long param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  undefined4 uVar2;
  undefined4 *ptr;
  undefined8 uVar3;
  
  ptr = (undefined4 *)CRYPTO_zalloc(0x30,"crypto/store/store_lib.c",0x375);
  if (ptr == (undefined4 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/store/store_lib.c",0x378,"OSSL_STORE_SEARCH_by_key_fingerprint");
    ERR_set_error(0x2c,0xc0100,0);
  }
  else {
    if ((param_1 != 0) && (iVar1 = EVP_MD_get_size(param_1), iVar1 != param_3)) {
      ERR_new();
      ERR_set_debug("crypto/store/store_lib.c",0x37d,"OSSL_STORE_SEARCH_by_key_fingerprint");
      uVar3 = EVP_MD_get0_name(param_1);
      uVar2 = EVP_MD_get_size(param_1);
      ERR_set_error(0x2c,0x79,"%s size is %d, fingerprint size is %zu",uVar3,uVar2,param_3);
      CRYPTO_free(ptr);
      return (undefined4 *)0x0;
    }
    *(long *)(ptr + 6) = param_1;
    *(undefined8 *)(ptr + 8) = param_2;
    *ptr = 3;
    *(long *)(ptr + 10) = param_3;
  }
  return ptr;
}

