/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a034ec
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

BN_MONT_CTX * BN_MONT_CTX_new(void)

{
  BN_MONT_CTX *pBVar1;
  
  pBVar1 = CRYPTO_malloc(0x68,"crypto/bn/bn_mont.c",0xe8);
  if (pBVar1 == (BN_MONT_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_mont.c",0xe9,"BN_MONT_CTX_new");
    ERR_set_error(3,0xc0100,0);
  }
  else {
    pBVar1->ri = 0;
    bn_init(&pBVar1->RR);
    bn_init(&pBVar1->N);
    bn_init(&pBVar1->Ni);
    pBVar1->n0[0] = 0;
    pBVar1->n0[1] = 0;
    pBVar1->flags = 1;
  }
  return pBVar1;
}

