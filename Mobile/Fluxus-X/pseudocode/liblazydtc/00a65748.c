/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a65748
 */

EVP_PKEY * evp_keymgmt_util_make_pkey(long param_1,stack_st_X509_ATTRIBUTE *param_2)

{
  int iVar1;
  EVP_PKEY *pkey;
  
  pkey = (EVP_PKEY *)0x0;
  if (((param_1 != 0) && (param_2 != (stack_st_X509_ATTRIBUTE *)0x0)) &&
     (pkey = EVP_PKEY_new(), pkey != (EVP_PKEY *)0x0)) {
    iVar1 = EVP_PKEY_set_type_by_keymgmt(pkey,param_1);
    if (iVar1 != 0) {
      pkey[1].attributes = param_2;
      evp_keymgmt_util_cache_keyinfo(pkey);
      return pkey;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/keymgmt_lib.c",0x41,"evp_keymgmt_util_assign_pkey");
    ERR_set_error(6,0xc0103,0);
  }
  EVP_PKEY_free(pkey);
  return (EVP_PKEY *)0x0;
}

