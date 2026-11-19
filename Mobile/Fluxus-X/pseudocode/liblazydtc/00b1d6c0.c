/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1d6c0
 */

dh_st * ossl_d2i_DH_PUBKEY(undefined8 *param_1,undefined8 *param_2,undefined8 param_3)

{
  int iVar1;
  EVP_PKEY *pkey;
  dh_st *pdVar2;
  undefined8 local_38;
  
  local_38 = *param_2;
  pkey = (EVP_PKEY *)FUN_00b1d214(0,&local_38,param_3,0,0,1);
  if (pkey != (EVP_PKEY *)0x0) {
    iVar1 = EVP_PKEY_get_id();
    if (iVar1 == 0x1c) {
      pdVar2 = EVP_PKEY_get1_DH(pkey);
      EVP_PKEY_free(pkey);
      if (pdVar2 == (dh_st *)0x0) {
        return (dh_st *)0x0;
      }
      *param_2 = local_38;
      if (param_1 == (undefined8 *)0x0) {
        return pdVar2;
      }
      DH_free((DH *)*param_1);
      *param_1 = pdVar2;
      return pdVar2;
    }
    EVP_PKEY_free(pkey);
  }
  return (dh_st *)0x0;
}

