/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab5024
 */

EC_KEY * PEM_read_bio_ECPrivateKey(BIO *bp,EC_KEY **x,undefined1 *cb,void *u)

{
  EVP_PKEY *pkey;
  ec_key_st *peVar1;
  
  pkey = PEM_read_bio_PrivateKey(bp,(EVP_PKEY **)0x0,cb,u);
  if (pkey == (EVP_PKEY *)0x0) {
    peVar1 = (ec_key_st *)0x0;
  }
  else {
    peVar1 = EVP_PKEY_get1_EC_KEY(pkey);
    EVP_PKEY_free(pkey);
    if ((peVar1 != (ec_key_st *)0x0) && (x != (EC_KEY **)0x0)) {
      EC_KEY_free(*x);
      *x = peVar1;
    }
  }
  return peVar1;
}

