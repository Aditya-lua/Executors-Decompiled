/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a17a70
 */

DH * DHparams_dup(DH *param_1)

{
  int iVar1;
  DH *dh;
  BIGNUM *pBVar2;
  
  dh = DH_new();
  if (dh != (DH *)0x0) {
    pBVar2 = param_1->g;
    iVar1 = ossl_ffc_params_copy(&dh->p,&param_1->p);
    if (iVar1 == 0) {
      DH_free(dh);
      dh = (DH *)0x0;
    }
    else {
      if (pBVar2 == (BIGNUM *)0x0) {
        dh->references = param_1->references;
      }
      dh[1].method_mont_p = (BN_MONT_CTX *)((long)&(dh[1].method_mont_p)->ri + 1);
    }
  }
  return dh;
}

