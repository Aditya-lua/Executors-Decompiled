/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1e038
 */

long ossl_d2i_X448_PUBKEY(long *param_1,undefined8 *param_2,undefined8 param_3)

{
  int iVar1;
  EVP_PKEY *pkey;
  long lVar2;
  undefined8 local_38;
  
  local_38 = *param_2;
  pkey = (EVP_PKEY *)FUN_00b1d214(0,&local_38,param_3,0,0,1);
  if (pkey != (EVP_PKEY *)0x0) {
    iVar1 = EVP_PKEY_get_id();
    if (iVar1 == 0x40b) {
      lVar2 = ossl_evp_pkey_get1_X448(pkey);
      EVP_PKEY_free(pkey);
      if (lVar2 == 0) {
        return 0;
      }
      *param_2 = local_38;
      if (param_1 == (long *)0x0) {
        return lVar2;
      }
      ossl_ecx_key_free(*param_1);
      *param_1 = lVar2;
      return lVar2;
    }
    EVP_PKEY_free(pkey);
  }
  return 0;
}

