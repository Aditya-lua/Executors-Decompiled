/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad0e24
 */

BN_BLINDING *
BN_BLINDING_create_param
          (BN_BLINDING *b,BIGNUM *e,BIGNUM *m,BN_CTX *ctx,bn_mod_exp *bn_mod_exp,BN_MONT_CTX *m_ctx)

{
  int iVar1;
  int iVar2;
  BN_BLINDING *ptr;
  BIGNUM *pBVar3;
  long lVar4;
  int local_44;
  
  ptr = b;
  if ((b == (BN_BLINDING *)0x0) &&
     (ptr = BN_BLINDING_new((BIGNUM *)0x0,(BIGNUM *)0x0,m), ptr == (BN_BLINDING *)0x0)) {
    return (BN_BLINDING *)0x0;
  }
  if (*(long *)ptr == 0) {
    pBVar3 = BN_new();
    *(BIGNUM **)ptr = pBVar3;
    if (pBVar3 == (BIGNUM *)0x0) goto LAB_00ad0f78;
  }
  if (*(long *)(ptr + 8) == 0) {
    pBVar3 = BN_new();
    *(BIGNUM **)(ptr + 8) = pBVar3;
    if (pBVar3 == (BIGNUM *)0x0) goto LAB_00ad0f78;
  }
  pBVar3 = *(BIGNUM **)(ptr + 0x10);
  if (e != (BIGNUM *)0x0) {
    BN_free(pBVar3);
    pBVar3 = BN_dup(e);
    *(BIGNUM **)(ptr + 0x10) = pBVar3;
  }
  if (pBVar3 != (BIGNUM *)0x0) {
    if (bn_mod_exp != (bn_mod_exp *)0x0) {
      *(bn_mod_exp **)(ptr + 0x40) = bn_mod_exp;
    }
    if (m_ctx != (BN_MONT_CTX *)0x0) {
      *(BN_MONT_CTX **)(ptr + 0x38) = m_ctx;
    }
    iVar1 = BN_priv_rand_range_ex(*(undefined8 *)ptr,*(undefined8 *)(ptr + 0x18),0,ctx);
    if (iVar1 != 0) {
      iVar1 = -0x21;
      do {
        lVar4 = int_bn_mod_inverse(*(undefined8 *)(ptr + 8),*(undefined8 *)ptr,
                                   *(undefined8 *)(ptr + 0x18),ctx,&local_44);
        if (lVar4 != 0) {
          if ((*(code **)(ptr + 0x40) == (code *)0x0) || (*(long *)(ptr + 0x38) == 0)) {
            iVar1 = BN_mod_exp(*(BIGNUM **)ptr,*(BIGNUM **)ptr,*(BIGNUM **)(ptr + 0x10),
                               *(BIGNUM **)(ptr + 0x18),ctx);
          }
          else {
            iVar1 = (**(code **)(ptr + 0x40))
                              (*(undefined8 *)ptr,*(undefined8 *)ptr,*(undefined8 *)(ptr + 0x10),
                               *(undefined8 *)(ptr + 0x18),ctx);
          }
          if (iVar1 != 0) {
            if (*(long *)(ptr + 0x38) == 0) {
              return ptr;
            }
            iVar1 = bn_to_mont_fixed_top
                              (*(undefined8 *)(ptr + 8),*(undefined8 *)(ptr + 8),
                               *(long *)(ptr + 0x38),ctx);
            if ((iVar1 != 0) &&
               (iVar1 = bn_to_mont_fixed_top
                                  (*(undefined8 *)ptr,*(undefined8 *)ptr,*(undefined8 *)(ptr + 0x38)
                                   ,ctx), iVar1 != 0)) {
              return ptr;
            }
          }
          break;
        }
        if (local_44 == 0) break;
        iVar1 = iVar1 + 1;
        if (iVar1 == 0) {
          ERR_new();
          ERR_set_debug("crypto/bn/bn_blind.c",0x11e,"BN_BLINDING_create_param");
          ERR_set_error(3,0x71,0);
          break;
        }
        iVar2 = BN_priv_rand_range_ex(*(undefined8 *)ptr,*(undefined8 *)(ptr + 0x18),0,ctx);
      } while (iVar2 != 0);
    }
  }
LAB_00ad0f78:
  if (b == (BN_BLINDING *)0x0) {
    BN_free(*(BIGNUM **)ptr);
    BN_free(*(BIGNUM **)(ptr + 8));
    BN_free(*(BIGNUM **)(ptr + 0x10));
    BN_free(*(BIGNUM **)(ptr + 0x18));
    CRYPTO_THREAD_lock_free(*(undefined8 *)(ptr + 0x48));
    CRYPTO_free(ptr);
    ptr = (BN_BLINDING *)0x0;
  }
  return ptr;
}

