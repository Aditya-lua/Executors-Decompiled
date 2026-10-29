/* 7ff70c7b8300 FUN_7ff70c7b8300 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b8300(int *param_1,int *param_2)

{
  undefined8 *puVar1;
  code *pcVar2;
  undefined8 uVar3;
  int iVar4;
  int iVar5;
  longlong lVar6;
  longlong lVar7;
  int iVar8;
  int iVar9;
  longlong lVar10;
  int iVar11;
  undefined1 auStack_78 [32];
  undefined8 uStack_58;
  undefined8 uStack_50;
  int iStack_48;
  int iStack_44;
  int iStack_40;
  int iStack_3c;
  ulonglong uStack_38;
  
  uStack_38 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  iVar4 = param_1[0x2c];
  if (iVar4 == param_1[0x2d]) {
    if (iVar4 == 0) {
      iVar8 = 8;
    }
    else {
      iVar8 = iVar4 / 2 + iVar4;
    }
    iVar9 = iVar4 + 1;
    if (iVar4 + 1 < iVar8) {
      iVar9 = iVar8;
    }
    lVar6 = FUN_7ff70c802100((longlong)iVar9 << 4);
    if (*(longlong *)(param_1 + 0x2e) != 0) {
      FUN_7ff70cb12b60(lVar6,*(longlong *)(param_1 + 0x2e),(longlong)param_1[0x2c] << 4);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x2e));
    }
    *(longlong *)(param_1 + 0x2e) = lVar6;
    param_1[0x2d] = iVar9;
    iVar4 = param_1[0x2c];
  }
  else {
    lVar6 = *(longlong *)(param_1 + 0x2e);
  }
  uVar3 = *(undefined8 *)(param_2 + 2);
  puVar1 = (undefined8 *)(lVar6 + (longlong)iVar4 * 0x10);
  *puVar1 = *(undefined8 *)param_2;
  puVar1[1] = uVar3;
  param_1[0x2c] = param_1[0x2c] + 1;
  iVar4 = param_2[1];
  iVar8 = param_2[2];
  iVar9 = param_2[3];
  param_1[0x1c] = *param_2;
  param_1[0x1d] = iVar4;
  param_1[0x1e] = iVar8;
  param_1[0x1f] = iVar9;
  lVar7 = *(longlong *)(param_1 + 2);
  iVar4 = *param_1;
  lVar10 = (longlong)iVar4;
  lVar6 = lVar7 + lVar10 * 0x48;
  iVar8 = *(int *)(lVar7 + -0x20 + lVar10 * 0x48);
  if ((iVar8 == 0) ||
     ((*(longlong *)(lVar6 + -0x30) == *(longlong *)(param_1 + 0x1e) &&
      (*(longlong *)(lVar6 + -0x38) == *(longlong *)(param_1 + 0x1c))))) {
    if (*(longlong *)(lVar6 + -0x18) == 0) {
      if ((1 < iVar4) && (iVar8 == 0)) {
        iVar8 = FUN_7ff70cb12b50(param_1 + 0x18,lVar6 + -0x90,0x24);
        if ((iVar8 == 0) &&
           ((*(int *)(lVar6 + -0x68) + *(int *)(lVar6 + -0x6c) == *(int *)(lVar6 + -0x24) &&
            (*(longlong *)(lVar6 + -0x60) == 0)))) {
          *param_1 = iVar4 + -1;
          goto LAB_7ff70c7b84f3;
        }
      }
      iVar4 = param_2[1];
      iVar8 = param_2[2];
      iVar9 = param_2[3];
      *(int *)(lVar6 + -0x38) = *param_2;
      *(int *)(lVar6 + -0x34) = iVar4;
      *(int *)(lVar6 + -0x30) = iVar8;
      *(int *)(lVar6 + -0x2c) = iVar9;
    }
  }
  else {
    uStack_58 = *(undefined8 *)(param_1 + 0x18);
    uStack_50 = *(undefined8 *)(param_1 + 0x1a);
    iStack_48 = *param_2;
    iStack_44 = param_2[1];
    iStack_40 = param_2[2];
    iStack_3c = param_2[3];
    iVar8 = param_1[4];
    iVar9 = param_1[0x20];
    if (iVar4 == param_1[1]) {
      if (iVar4 == 0) {
        iVar5 = 8;
      }
      else {
        iVar5 = iVar4 / 2 + iVar4;
      }
      iVar11 = iVar4 + 1;
      if (iVar4 + 1 < iVar5) {
        iVar11 = iVar5;
      }
      lVar7 = FUN_7ff70c802100((longlong)iVar11 * 0x48);
      if (*(longlong *)(param_1 + 2) != 0) {
        FUN_7ff70cb12b60(lVar7,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
      }
      *(longlong *)(param_1 + 2) = lVar7;
      param_1[1] = iVar11;
      lVar10 = (longlong)*param_1;
    }
    puVar1 = (undefined8 *)(lVar7 + 0x10 + lVar10 * 0x48);
    *puVar1 = CONCAT44(iStack_44,iStack_48);
    puVar1[1] = CONCAT44(iStack_3c,iStack_40);
    puVar1 = (undefined8 *)(lVar7 + lVar10 * 0x48);
    *puVar1 = uStack_58;
    puVar1[1] = uStack_50;
    *(int *)(lVar7 + 0x20 + lVar10 * 0x48) = iVar9;
    *(int *)(lVar7 + 0x24 + lVar10 * 0x48) = iVar8;
    puVar1 = (undefined8 *)(lVar7 + 0x28 + lVar10 * 0x48);
    *puVar1 = 0;
    puVar1[1] = 0;
    puVar1 = (undefined8 *)(lVar7 + 0x38 + lVar10 * 0x48);
    *puVar1 = 0;
    puVar1[1] = 0;
    *param_1 = *param_1 + 1;
  }
LAB_7ff70c7b84f3:
  if (_DAT_7ff70cbebd80 == (uStack_38 ^ (ulonglong)auStack_78)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_38 ^ (ulonglong)auStack_78);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


