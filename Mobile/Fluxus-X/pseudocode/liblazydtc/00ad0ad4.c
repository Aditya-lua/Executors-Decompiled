/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad0ad4
 */

BN_BLINDING * BN_BLINDING_new(BIGNUM *A,BIGNUM *Ai,BIGNUM *mod)

{
  int iVar1;
  BN_BLINDING *ptr;
  long lVar2;
  pthread_t pVar3;
  BIGNUM *pBVar4;
  
  ptr = (BN_BLINDING *)CRYPTO_zalloc(0x50,"crypto/bn/bn_blind.c",0x24);
  if (ptr == (BN_BLINDING *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_blind.c",0x25,"BN_BLINDING_new");
    ERR_set_error(3,0xc0100,0);
    return (BN_BLINDING *)0x0;
  }
  lVar2 = CRYPTO_THREAD_lock_new();
  *(long *)(ptr + 0x48) = lVar2;
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_blind.c",0x2b,"BN_BLINDING_new");
    ERR_set_error(3,0xc0100,0);
    goto LAB_00ad0c30;
  }
  pVar3 = CRYPTO_THREAD_get_current_id();
  *(pthread_t *)(ptr + 0x20) = pVar3;
  if (A == (BIGNUM *)0x0) {
LAB_00ad0b34:
    if (Ai != (BIGNUM *)0x0) {
      pBVar4 = BN_dup(Ai);
      *(BIGNUM **)(ptr + 8) = pBVar4;
      if (pBVar4 == (BIGNUM *)0x0) goto LAB_00ad0bb4;
    }
    pBVar4 = BN_dup(mod);
    *(BIGNUM **)(ptr + 0x18) = pBVar4;
    if (pBVar4 != (BIGNUM *)0x0) {
      iVar1 = BN_get_flags(mod,4);
      if (iVar1 != 0) {
        BN_set_flags(*(undefined8 *)(ptr + 0x18),4);
      }
      *(undefined4 *)(ptr + 0x28) = 0xffffffff;
      return ptr;
    }
  }
  else {
    pBVar4 = BN_dup(A);
    *(BIGNUM **)ptr = pBVar4;
    if (pBVar4 != (BIGNUM *)0x0) goto LAB_00ad0b34;
  }
LAB_00ad0bb4:
  BN_free(*(BIGNUM **)ptr);
  BN_free(*(BIGNUM **)(ptr + 8));
  BN_free(*(BIGNUM **)(ptr + 0x10));
  BN_free(*(BIGNUM **)(ptr + 0x18));
  CRYPTO_THREAD_lock_free(*(undefined8 *)(ptr + 0x48));
LAB_00ad0c30:
  CRYPTO_free(ptr);
  return (BN_BLINDING *)0x0;
}

