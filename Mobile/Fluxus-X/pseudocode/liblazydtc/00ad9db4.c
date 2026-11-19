/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad9db4
 */

bool ossl_rsa_check_crt_components(long param_1,BN_CTX *param_2)

{
  bool bVar1;
  int iVar2;
  BIGNUM *r;
  BIGNUM *a;
  BIGNUM *a_00;
  BIGNUM *pBVar3;
  BIGNUM *pBVar4;
  
  if (*(long *)(param_1 + 0x50) == 0) {
    if (*(long *)(param_1 + 0x58) == 0) {
      return *(long *)(param_1 + 0x60) == 0;
    }
    return false;
  }
  if ((*(long *)(param_1 + 0x58) == 0) || (*(long *)(param_1 + 0x60) == 0)) {
    return false;
  }
  BN_CTX_start(param_2);
  r = BN_CTX_get(param_2);
  a = BN_CTX_get(param_2);
  a_00 = BN_CTX_get(param_2);
  if (a_00 != (BIGNUM *)0x0) {
    BN_set_flags(r,4);
    BN_set_flags(a,4);
    BN_set_flags(a_00,4);
    pBVar3 = BN_copy(a,*(BIGNUM **)(param_1 + 0x40));
    if ((((pBVar3 != (BIGNUM *)0x0) && (iVar2 = BN_sub_word(a,1), iVar2 != 0)) &&
        (pBVar3 = BN_copy(a_00,*(BIGNUM **)(param_1 + 0x48)), pBVar3 != (BIGNUM *)0x0)) &&
       (iVar2 = BN_sub_word(a_00,1), iVar2 != 0)) {
      pBVar4 = *(BIGNUM **)(param_1 + 0x50);
      pBVar3 = BN_value_one();
      iVar2 = BN_cmp(pBVar4,pBVar3);
      if (0 < iVar2) {
        iVar2 = BN_cmp(*(BIGNUM **)(param_1 + 0x50),a);
        bVar1 = false;
        if (-1 < iVar2) goto LAB_00ad9fa8;
        pBVar4 = *(BIGNUM **)(param_1 + 0x58);
        pBVar3 = BN_value_one();
        iVar2 = BN_cmp(pBVar4,pBVar3);
        if (0 < iVar2) {
          iVar2 = BN_cmp(*(BIGNUM **)(param_1 + 0x58),a_00);
          bVar1 = false;
          if (-1 < iVar2) goto LAB_00ad9fa8;
          pBVar4 = *(BIGNUM **)(param_1 + 0x60);
          pBVar3 = BN_value_one();
          iVar2 = BN_cmp(pBVar4,pBVar3);
          if (0 < iVar2) {
            iVar2 = BN_cmp(*(BIGNUM **)(param_1 + 0x60),*(BIGNUM **)(param_1 + 0x40));
            bVar1 = false;
            if (-1 < iVar2) goto LAB_00ad9fa8;
            iVar2 = BN_mod_mul(r,*(BIGNUM **)(param_1 + 0x50),*(BIGNUM **)(param_1 + 0x30),a,param_2
                              );
            if (((iVar2 != 0) && (iVar2 = BN_is_one(r), iVar2 != 0)) &&
               ((iVar2 = BN_mod_mul(r,*(BIGNUM **)(param_1 + 0x58),*(BIGNUM **)(param_1 + 0x30),a_00
                                    ,param_2), iVar2 != 0 &&
                ((iVar2 = BN_is_one(r), iVar2 != 0 &&
                 (iVar2 = BN_mod_mul(r,*(BIGNUM **)(param_1 + 0x60),*(BIGNUM **)(param_1 + 0x48),
                                     *(BIGNUM **)(param_1 + 0x40),param_2), iVar2 != 0)))))) {
              iVar2 = BN_is_one(r);
              bVar1 = iVar2 != 0;
              goto LAB_00ad9fa8;
            }
          }
        }
      }
    }
  }
  bVar1 = false;
LAB_00ad9fa8:
  BN_clear(r);
  BN_clear(a);
  BN_clear(a_00);
  BN_CTX_end(param_2);
  return bVar1;
}

