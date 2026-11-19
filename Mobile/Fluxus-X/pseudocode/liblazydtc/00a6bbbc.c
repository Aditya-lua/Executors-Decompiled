/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6bbbc
 */

rsa_st * EVP_PKEY_get1_RSA(EVP_PKEY *pkey)

{
  RSA *r;
  
  if ((pkey->type == 6) || (pkey->type == 0x390)) {
    r = (RSA *)evp_pkey_get_legacy();
    if (r != (RSA *)0x0) {
      RSA_up_ref(r);
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/evp/p_legacy.c",0x25,"evp_pkey_get0_RSA_int");
    ERR_set_error(6,0x7f,0);
    r = (RSA *)0x0;
  }
  return r;
}

