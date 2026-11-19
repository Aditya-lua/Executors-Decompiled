/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab4ee0
 */

DSA * PEM_read_DSAPrivateKey(FILE *fp,DSA **x,undefined1 *cb,void *u)

{
  EVP_PKEY *pkey;
  dsa_st *pdVar1;
  
  pkey = PEM_read_PrivateKey(fp,(EVP_PKEY **)0x0,cb,u);
  if (pkey == (EVP_PKEY *)0x0) {
    pdVar1 = (dsa_st *)0x0;
  }
  else {
    pdVar1 = EVP_PKEY_get1_DSA(pkey);
    EVP_PKEY_free(pkey);
    if ((pdVar1 != (dsa_st *)0x0) && (x != (DSA **)0x0)) {
      DSA_free(*x);
      *x = pdVar1;
    }
  }
  return pdVar1;
}

