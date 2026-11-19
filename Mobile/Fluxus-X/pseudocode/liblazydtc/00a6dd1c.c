/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6dd1c
 */

dh_st * EVP_PKEY_get1_DH(EVP_PKEY *pkey)

{
  DH *dh;
  
  if ((pkey->type == 0x1c) || (pkey->type == 0x398)) {
    dh = (DH *)evp_pkey_get_legacy();
    if (dh != (DH *)0x0) {
      DH_up_ref(dh);
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/evp/p_lib.c",0x3b4,"evp_pkey_get0_DH_int");
    ERR_set_error(6,0x80,0);
    dh = (DH *)0x0;
  }
  return dh;
}

