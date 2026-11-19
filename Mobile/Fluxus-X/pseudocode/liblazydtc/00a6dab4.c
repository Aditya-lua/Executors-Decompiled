/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6dab4
 */

dsa_st * EVP_PKEY_get1_DSA(EVP_PKEY *pkey)

{
  DSA *r;
  
  if (pkey->type == 0x74) {
    r = (DSA *)evp_pkey_get_legacy();
    if (r != (DSA *)0x0) {
      DSA_up_ref(r);
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/evp/p_lib.c",0x351,"evp_pkey_get0_DSA_int");
    ERR_set_error(6,0x81,0);
    r = (DSA *)0x0;
  }
  return r;
}

