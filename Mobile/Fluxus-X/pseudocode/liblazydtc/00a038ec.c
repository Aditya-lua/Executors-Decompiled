/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a038ec
 */

BN_MONT_CTX * BN_MONT_CTX_set_locked(BN_MONT_CTX **pmont,int lock,BIGNUM *mod,BN_CTX *ctx)

{
  int iVar1;
  BN_MONT_CTX *pBVar2;
  
  iVar1 = CRYPTO_THREAD_read_lock(lock);
  if (iVar1 != 0) {
    pBVar2 = *pmont;
    CRYPTO_THREAD_unlock(lock);
    if (pBVar2 != (BN_MONT_CTX *)0x0) {
      return pBVar2;
    }
    pBVar2 = BN_MONT_CTX_new();
    if (pBVar2 != (BN_MONT_CTX *)0x0) {
      iVar1 = BN_MONT_CTX_set(pBVar2,mod,ctx);
      if ((iVar1 != 0) && (iVar1 = CRYPTO_THREAD_write_lock(lock), iVar1 != 0)) {
        if (*pmont == (BN_MONT_CTX *)0x0) {
          *pmont = pBVar2;
        }
        else {
          BN_clear_free(&pBVar2->RR);
          BN_clear_free(&pBVar2->N);
          BN_clear_free(&pBVar2->Ni);
          if ((pBVar2->flags & 1) != 0) {
            CRYPTO_free(pBVar2);
          }
          pBVar2 = *pmont;
        }
        CRYPTO_THREAD_unlock(lock);
        return pBVar2;
      }
      BN_clear_free(&pBVar2->RR);
      BN_clear_free(&pBVar2->N);
      BN_clear_free(&pBVar2->Ni);
      if ((pBVar2->flags & 1) == 0) {
        return (BN_MONT_CTX *)0x0;
      }
      CRYPTO_free(pBVar2);
    }
  }
  return (BN_MONT_CTX *)0x0;
}

