/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1d9d8
 */

dsa_st * ossl_d2i_DSA_PUBKEY(undefined8 *param_1,long *param_2,undefined8 param_3)

{
  long lVar1;
  EVP_PKEY *pkey;
  dsa_st *r;
  long local_48;
  long local_40;
  long local_38;
  
  local_38 = *param_2;
  pkey = (EVP_PKEY *)FUN_00b1d214(0,&local_38,param_3,0,0,1);
  if (pkey != (EVP_PKEY *)0x0) {
    r = EVP_PKEY_get1_DSA(pkey);
    EVP_PKEY_free(pkey);
    lVar1 = local_38;
    if (r != (dsa_st *)0x0) {
      DSA_get0_pqg(r,&local_38,&local_40,&local_48);
      if (((local_38 != 0) && (local_40 != 0)) && (local_48 != 0)) {
        *param_2 = lVar1;
        if (param_1 == (undefined8 *)0x0) {
          return r;
        }
        DSA_free((DSA *)*param_1);
        *param_1 = r;
        return r;
      }
      DSA_free(r);
    }
  }
  return (dsa_st *)0x0;
}

