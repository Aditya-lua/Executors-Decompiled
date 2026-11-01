
undefined8 FUN_002915dc(undefined8 param_1,long param_2,long param_3,ulong *param_4)

{
  int iVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  int *piVar8;
  long lVar9;
  ulong uVar10;
  undefined1 auVar11 [16];
  
  piVar8 = *(int **)(param_2 + 0x28);
  lVar3 = func_0x002bfbcc(param_1);
  if (lVar3 == 0) {
    uVar6 = 0x75;
    uVar7 = 0x58;
LAB_002915c0:
    func_0x0028f83c(6,0,uVar6,"/aws-lc/crypto/evp_extra/p_dh.c",uVar7);
    return 0;
  }
  if (param_3 == 0) {
    iVar1 = func_0x002c06a0();
    uVar10 = (ulong)iVar1;
code_r0x0029168c:
    *param_4 = uVar10;
    return 1;
  }
  uVar10 = *param_4;
  iVar1 = func_0x002c06a0();
  if (uVar10 < (ulong)(long)iVar1) {
    uVar6 = 100;
    uVar7 = 0x62;
    goto LAB_002915c0;
  }
  if (*piVar8 == 0) {
    uVar2 = func_0x002c0a24(param_3,lVar3);
  }
  else {
    uVar2 = func_0x002c0a20(param_3,lVar3);
  }
  if ((int)uVar2 < 0) {
    return 0;
  }
  iVar1 = func_0x002c06a0();
  if ((int)uVar2 <= iVar1) {
    uVar10 = (ulong)uVar2;
    goto code_r0x0029168c;
  }
  auVar11 = func_0x0079d64c();
  lVar3 = auVar11._0_8_;
  lVar9 = *(long *)(lVar3 + 0x28);
  lVar4 = func_0x002bf86c();
  if (lVar4 == 0) {
    return 0;
  }
  if (*(long *)(lVar3 + 0x38) == 0) {
    lVar5 = 0;
    iVar1 = func_0x002898d8(lVar4,*(undefined4 *)(lVar9 + 4),*(undefined4 *)(lVar9 + 8),0);
joined_r0x00291768:
    if (iVar1 == 1) {
      func_0x00292054(auVar11._8_8_,lVar4);
      uVar6 = 1;
      goto code_r0x0029177c;
    }
  }
  else {
    lVar5 = func_0x002ac884();
    if (lVar5 != 0) {
      func_0x002db95c(lVar5,lVar3);
      iVar1 = func_0x002898d8(lVar4,*(undefined4 *)(lVar9 + 4),*(undefined4 *)(lVar9 + 8),lVar5);
      goto joined_r0x00291768;
    }
  }
  func_0x002bf97c(lVar4);
  uVar6 = 0;
code_r0x0029177c:
  func_0x002ac88c(lVar5);
  return uVar6;
}

