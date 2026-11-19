/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3ac60
 */

ulong ossl_ec_GFp_simple_cmp(EC_GROUP *param_1,EC_POINT *param_2,EC_POINT *param_3,BN_CTX *param_4)

{
  code *pcVar1;
  code *pcVar2;
  int iVar3;
  int iVar4;
  BIGNUM *pBVar5;
  BIGNUM *pBVar6;
  BIGNUM *pBVar7;
  BIGNUM *pBVar8;
  BN_CTX *c;
  ulong uVar9;
  BIGNUM *b;
  BIGNUM *a;
  
  iVar3 = EC_POINT_is_at_infinity(param_1,param_2);
  iVar4 = EC_POINT_is_at_infinity(param_1,param_3);
  if (iVar3 != 0) {
    return (ulong)(iVar4 == 0);
  }
  if (iVar4 != 0) {
    return 1;
  }
  if ((*(int *)(param_2 + 0x28) != 0) && (*(int *)(param_3 + 0x28) != 0)) {
    iVar3 = BN_cmp(*(BIGNUM **)(param_2 + 0x10),*(BIGNUM **)(param_3 + 0x10));
    if (iVar3 == 0) {
      iVar3 = BN_cmp(*(BIGNUM **)(param_2 + 0x18),*(BIGNUM **)(param_3 + 0x18));
      return (ulong)(iVar3 != 0);
    }
    return 1;
  }
  pcVar1 = *(code **)(*(long *)param_1 + 0xf8);
  pcVar2 = *(code **)(*(long *)param_1 + 0x100);
  c = (BN_CTX *)0x0;
  if ((param_4 == (BN_CTX *)0x0) &&
     (param_4 = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 0xa8)), c = param_4,
     param_4 == (BN_CTX *)0x0)) {
    return 0xffffffff;
  }
  BN_CTX_start(param_4);
  pBVar5 = BN_CTX_get(param_4);
  pBVar6 = BN_CTX_get(param_4);
  pBVar7 = BN_CTX_get(param_4);
  pBVar8 = BN_CTX_get(param_4);
  if (pBVar8 == (BIGNUM *)0x0) {
LAB_00a3aec0:
    uVar9 = 0xffffffff;
  }
  else {
    if (*(int *)(param_3 + 0x28) == 0) {
      iVar3 = (*pcVar2)(param_1,pBVar8,*(undefined8 *)(param_3 + 0x20),param_4);
      if ((iVar3 == 0) ||
         (iVar3 = (*pcVar1)(param_1,pBVar5,*(undefined8 *)(param_2 + 0x10),pBVar8,param_4),
         a = pBVar5, iVar3 == 0)) goto LAB_00a3aec0;
    }
    else {
      a = *(BIGNUM **)(param_2 + 0x10);
    }
    if (*(int *)(param_2 + 0x28) == 0) {
      iVar3 = (*pcVar2)(param_1,pBVar7,*(undefined8 *)(param_2 + 0x20),param_4);
      if ((iVar3 == 0) ||
         (iVar3 = (*pcVar1)(param_1,pBVar6,*(undefined8 *)(param_3 + 0x10),pBVar7,param_4),
         b = pBVar6, iVar3 == 0)) goto LAB_00a3aec0;
    }
    else {
      b = *(BIGNUM **)(param_3 + 0x10);
    }
    iVar3 = BN_cmp(a,b);
    if (iVar3 != 0) {
      uVar9 = 1;
      goto LAB_00a3aec4;
    }
    if (*(int *)(param_3 + 0x28) == 0) {
      iVar3 = (*pcVar1)(param_1,pBVar8,pBVar8,*(undefined8 *)(param_3 + 0x20),param_4);
      if ((iVar3 == 0) ||
         (iVar3 = (*pcVar1)(param_1,pBVar5,*(undefined8 *)(param_2 + 0x18),pBVar8,param_4),
         iVar3 == 0)) goto LAB_00a3aec0;
    }
    else {
      a = *(BIGNUM **)(param_2 + 0x18);
    }
    if (*(int *)(param_2 + 0x28) == 0) {
      iVar3 = (*pcVar1)(param_1,pBVar7,pBVar7,*(undefined8 *)(param_2 + 0x20),param_4);
      if ((iVar3 == 0) ||
         (iVar3 = (*pcVar1)(param_1,pBVar6,*(undefined8 *)(param_3 + 0x18),pBVar7,param_4),
         iVar3 == 0)) goto LAB_00a3aec0;
    }
    else {
      b = *(BIGNUM **)(param_3 + 0x18);
    }
    iVar3 = BN_cmp(a,b);
    uVar9 = (ulong)(iVar3 != 0);
  }
LAB_00a3aec4:
  BN_CTX_end(param_4);
  BN_CTX_free(c);
  return uVar9;
}

