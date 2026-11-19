/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a860e8
 */

EVP_PKEY * FUN_00a860e8(undefined8 param_1,char *param_2)

{
  BIO *bp;
  EVP_PKEY *pEVar1;
  
  fprintf((FILE *)sched_yield,"(TEST_ENG_OPENSSL_PKEY)Loading Private key %s\n",param_2);
  bp = BIO_new_file(param_2,"r");
  pEVar1 = (EVP_PKEY *)0x0;
  if (bp != (BIO *)0x0) {
    pEVar1 = PEM_read_bio_PrivateKey(bp,(EVP_PKEY **)0x0,(undefined1 *)0x0,(void *)0x0);
    BIO_free(bp);
  }
  return pEVar1;
}

