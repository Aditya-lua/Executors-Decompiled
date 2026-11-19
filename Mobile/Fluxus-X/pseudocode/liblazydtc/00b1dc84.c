/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1dc84
 */

long ossl_d2i_ED25519_PUBKEY(long *param_1,undefined8 *param_2,undefined8 param_3)

{
  EVP_PKEY *pkey;
  long lVar1;
  undefined8 local_38;
  
  local_38 = *param_2;
  pkey = (EVP_PKEY *)FUN_00b1d214(0,&local_38,param_3,0,0,1);
  if (pkey == (EVP_PKEY *)0x0) {
    lVar1 = 0;
  }
  else {
    lVar1 = ossl_evp_pkey_get1_ED25519();
    EVP_PKEY_free(pkey);
    if (lVar1 != 0) {
      *param_2 = local_38;
      if (param_1 != (long *)0x0) {
        ossl_ecx_key_free(*param_1);
        *param_1 = lVar1;
      }
    }
  }
  return lVar1;
}

