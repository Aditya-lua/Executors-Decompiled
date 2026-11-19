/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a29cb4
 */

undefined8 ossl_ec_GF2m_simple_group_copy(long param_1,long param_2)

{
  int iVar1;
  int iVar2;
  BIGNUM *pBVar3;
  long lVar4;
  undefined8 uVar5;
  
  pBVar3 = BN_copy(*(BIGNUM **)(param_1 + 0x40),*(BIGNUM **)(param_2 + 0x40));
  uVar5 = 0;
  if (((pBVar3 != (BIGNUM *)0x0) &&
      (pBVar3 = BN_copy(*(BIGNUM **)(param_1 + 0x60),*(BIGNUM **)(param_2 + 0x60)), uVar5 = 0,
      pBVar3 != (BIGNUM *)0x0)) &&
     (pBVar3 = BN_copy(*(BIGNUM **)(param_1 + 0x68),*(BIGNUM **)(param_2 + 0x68)), uVar5 = 0,
     pBVar3 != (BIGNUM *)0x0)) {
    iVar2 = *(int *)(param_2 + 0x48);
    *(int *)(param_1 + 0x48) = iVar2;
    *(undefined4 *)(param_1 + 0x4c) = *(undefined4 *)(param_2 + 0x4c);
    *(undefined4 *)(param_1 + 0x50) = *(undefined4 *)(param_2 + 0x50);
    *(undefined4 *)(param_1 + 0x54) = *(undefined4 *)(param_2 + 0x54);
    *(undefined4 *)(param_1 + 0x58) = *(undefined4 *)(param_2 + 0x58);
    iVar1 = iVar2 + 0x7e;
    if (-1 < iVar2 + 0x3f) {
      iVar1 = iVar2 + 0x3f;
    }
    *(undefined4 *)(param_1 + 0x5c) = *(undefined4 *)(param_2 + 0x5c);
    lVar4 = bn_wexpand(*(undefined8 *)(param_1 + 0x60),iVar1 >> 6);
    uVar5 = 0;
    if (lVar4 != 0) {
      iVar1 = *(int *)(param_1 + 0x48) + 0x3f;
      iVar2 = *(int *)(param_1 + 0x48) + 0x7e;
      if (-1 < iVar1) {
        iVar2 = iVar1;
      }
      lVar4 = bn_wexpand(*(undefined8 *)(param_1 + 0x68),iVar2 >> 6);
      uVar5 = 0;
      if (lVar4 != 0) {
        bn_set_all_zero(*(undefined8 *)(param_1 + 0x60));
        bn_set_all_zero(*(undefined8 *)(param_1 + 0x68));
        uVar5 = 1;
      }
    }
  }
  return uVar5;
}

