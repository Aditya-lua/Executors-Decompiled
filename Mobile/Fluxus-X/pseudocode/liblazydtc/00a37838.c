/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a37838
 */

undefined8 ossl_ec_GFp_mont_group_copy(long param_1,long param_2)

{
  undefined8 uVar1;
  BN_MONT_CTX *pBVar2;
  BIGNUM *pBVar3;
  
  BN_MONT_CTX_free(*(BN_MONT_CTX **)(param_1 + 0x78));
  *(undefined8 *)(param_1 + 0x78) = 0;
  BN_clear_free(*(BIGNUM **)(param_1 + 0x80));
  *(undefined8 *)(param_1 + 0x80) = 0;
  uVar1 = ossl_ec_GFp_simple_group_copy(param_1,param_2);
  if ((int)uVar1 == 0) {
    return uVar1;
  }
  if (*(long *)(param_2 + 0x78) == 0) {
LAB_00a37894:
    if (*(BIGNUM **)(param_2 + 0x80) != (BIGNUM *)0x0) {
      pBVar3 = BN_dup(*(BIGNUM **)(param_2 + 0x80));
      *(BIGNUM **)(param_1 + 0x80) = pBVar3;
      if (pBVar3 == (BIGNUM *)0x0) goto LAB_00a378b0;
    }
    uVar1 = 1;
  }
  else {
    pBVar2 = BN_MONT_CTX_new();
    *(BN_MONT_CTX **)(param_1 + 0x78) = pBVar2;
    if (pBVar2 == (BN_MONT_CTX *)0x0) {
      return 0;
    }
    pBVar2 = BN_MONT_CTX_copy(pBVar2,*(BN_MONT_CTX **)(param_2 + 0x78));
    if (pBVar2 != (BN_MONT_CTX *)0x0) goto LAB_00a37894;
LAB_00a378b0:
    BN_MONT_CTX_free(*(BN_MONT_CTX **)(param_1 + 0x78));
    uVar1 = 0;
    *(undefined8 *)(param_1 + 0x78) = 0;
  }
  return uVar1;
}

