/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a18500
 */

undefined4 FUN_00a18500(long param_1,undefined8 param_2,code *param_3)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  undefined8 uVar10;
  uint uVar11;
  
  uVar10 = *(undefined8 *)(param_1 + 0x20);
  lVar3 = DH_get0_p(uVar10);
  lVar4 = DH_get0_g(uVar10);
  lVar5 = DH_get0_q(uVar10);
  lVar6 = DH_get_length(uVar10);
  lVar7 = DH_get0_pub_key(uVar10);
  lVar8 = DH_get0_priv_key(uVar10);
  if (lVar3 == 0) {
    return 0;
  }
  if (lVar4 == 0) {
    return 0;
  }
  lVar9 = OSSL_PARAM_BLD_new();
  if (lVar9 == 0) {
    return 0;
  }
  iVar1 = OSSL_PARAM_BLD_push_BN(lVar9,&DAT_002a38e7,lVar3);
  if (((iVar1 != 0) && (iVar1 = OSSL_PARAM_BLD_push_BN(lVar9,&DAT_002d92e5,lVar4), iVar1 != 0)) &&
     ((lVar5 == 0 || (iVar1 = OSSL_PARAM_BLD_push_BN(lVar9,&DAT_002cf3b1,lVar5), iVar1 != 0)))) {
    if (lVar6 < 1) {
      uVar11 = 4;
    }
    else {
      iVar1 = OSSL_PARAM_BLD_push_long(lVar9,"priv_len",lVar6);
      if (iVar1 == 0) goto LAB_00a18678;
      uVar11 = 0x84;
    }
    if (lVar7 != 0) {
      iVar1 = OSSL_PARAM_BLD_push_BN(lVar9,&DAT_002ad463,lVar7);
      if (iVar1 == 0) goto LAB_00a18678;
      uVar11 = uVar11 | 2;
    }
    if (lVar8 != 0) {
      iVar1 = OSSL_PARAM_BLD_push_BN(lVar9,&DAT_002a3e83,lVar8);
      if (iVar1 == 0) goto LAB_00a18678;
      uVar11 = uVar11 | 1;
    }
    lVar3 = OSSL_PARAM_BLD_to_param(lVar9);
    if (lVar3 != 0) {
      uVar2 = (*param_3)(param_2,uVar11,lVar3);
      OSSL_PARAM_free(lVar3);
      goto LAB_00a1867c;
    }
  }
LAB_00a18678:
  uVar2 = 0;
LAB_00a1867c:
  OSSL_PARAM_BLD_free(lVar9);
  return uVar2;
}

