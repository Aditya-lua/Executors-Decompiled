/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1d948
 */

DSA * d2i_DSA_PUBKEY(DSA **a,uchar **pp,long length)

{
  EVP_PKEY *pkey;
  dsa_st *pdVar1;
  uchar *local_38;
  
  local_38 = *pp;
  pkey = (EVP_PKEY *)FUN_00b1d214(0,&local_38,length,0,0,1);
  if (pkey == (EVP_PKEY *)0x0) {
    pdVar1 = (dsa_st *)0x0;
  }
  else {
    pdVar1 = EVP_PKEY_get1_DSA(pkey);
    EVP_PKEY_free(pkey);
    if ((pdVar1 != (dsa_st *)0x0) && (*pp = local_38, a != (DSA **)0x0)) {
      DSA_free(*a);
      *a = pdVar1;
    }
  }
  return pdVar1;
}

