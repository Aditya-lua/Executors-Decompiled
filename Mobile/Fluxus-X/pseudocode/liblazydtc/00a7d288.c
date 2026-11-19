/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7d288
 */

undefined8 ossl_ffc_params_copy(undefined8 *param_1,undefined8 *param_2)

{
  int iVar1;
  long lVar2;
  BIGNUM *pBVar3;
  undefined8 uVar4;
  
  pBVar3 = (BIGNUM *)*param_2;
  if ((pBVar3 != (BIGNUM *)0x0) &&
     (((iVar1 = BN_get_flags(pBVar3,2), iVar1 == 0 || (iVar1 = BN_get_flags(pBVar3,1), iVar1 != 0))
      && (pBVar3 = BN_dup(pBVar3), pBVar3 == (BIGNUM *)0x0)))) {
    return 0;
  }
  BN_clear_free((BIGNUM *)*param_1);
  *param_1 = pBVar3;
  pBVar3 = (BIGNUM *)param_2[2];
  if (((pBVar3 != (BIGNUM *)0x0) &&
      ((iVar1 = BN_get_flags(pBVar3,2), iVar1 == 0 || (iVar1 = BN_get_flags(pBVar3,1), iVar1 != 0)))
      ) && (pBVar3 = BN_dup(pBVar3), pBVar3 == (BIGNUM *)0x0)) {
    return 0;
  }
  BN_clear_free((BIGNUM *)param_1[2]);
  param_1[2] = pBVar3;
  pBVar3 = (BIGNUM *)param_2[1];
  if (((pBVar3 != (BIGNUM *)0x0) &&
      ((iVar1 = BN_get_flags(pBVar3,2), iVar1 == 0 || (iVar1 = BN_get_flags(pBVar3,1), iVar1 != 0)))
      ) && (pBVar3 = BN_dup(pBVar3), pBVar3 == (BIGNUM *)0x0)) {
    return 0;
  }
  BN_clear_free((BIGNUM *)param_1[1]);
  param_1[1] = pBVar3;
  pBVar3 = (BIGNUM *)param_2[3];
  if ((pBVar3 != (BIGNUM *)0x0) &&
     (((iVar1 = BN_get_flags(pBVar3,2), iVar1 == 0 || (iVar1 = BN_get_flags(pBVar3,1), iVar1 != 0))
      && (pBVar3 = BN_dup(pBVar3), pBVar3 == (BIGNUM *)0x0)))) {
    return 0;
  }
  BN_clear_free((BIGNUM *)param_1[3]);
  param_1[3] = pBVar3;
  uVar4 = param_2[9];
  param_1[10] = param_2[10];
  param_1[9] = uVar4;
  CRYPTO_free((void *)param_1[4]);
  param_1[5] = param_2[5];
  if (param_2[4] == 0) {
    param_1[4] = 0;
  }
  else {
    lVar2 = CRYPTO_memdup(param_2[4],param_2[5],"crypto/ffc/ffc_params.c",0xbe);
    param_1[4] = lVar2;
    if (lVar2 == 0) {
      return 0;
    }
  }
  uVar4 = param_2[6];
  param_1[7] = param_2[7];
  param_1[6] = uVar4;
  *(undefined4 *)(param_1 + 8) = *(undefined4 *)(param_2 + 8);
  *(undefined4 *)(param_1 + 0xb) = *(undefined4 *)(param_2 + 0xb);
  return 1;
}

