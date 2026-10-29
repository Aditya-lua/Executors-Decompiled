/* 7ff70c7b8530 FUN_7ff70c7b8530 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b8530(int *param_1)

{
  longlong lVar1;
  int *piVar2;
  undefined8 *puVar3;
  code *pcVar4;
  int iVar5;
  int iVar6;
  longlong lVar7;
  longlong lVar8;
  int iVar9;
  int iVar10;
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
  iVar10 = param_1[0x2c];
  iVar5 = (int)((longlong)iVar10 + -1);
  param_1[0x2c] = iVar5;
  if (iVar5 == 0) {
    iVar10 = 0;
    iVar5 = 0;
    iVar11 = 0;
    iVar6 = 0;
  }
  else {
    piVar2 = (int *)(*(longlong *)(param_1 + 0x2e) + -0x10 + ((longlong)iVar10 + -1) * 0x10);
    iVar10 = *piVar2;
    iVar5 = piVar2[1];
    iVar11 = piVar2[2];
    iVar6 = piVar2[3];
  }
  uStack_58 = CONCAT44(iVar5,iVar10);
  uStack_50 = CONCAT44(iVar6,iVar11);
  param_1[0x1c] = iVar10;
  param_1[0x1d] = iVar5;
  param_1[0x1e] = iVar11;
  param_1[0x1f] = iVar6;
  lVar7 = *(longlong *)(param_1 + 2);
  iVar10 = *param_1;
  lVar8 = (longlong)iVar10;
  lVar1 = lVar7 + lVar8 * 0x48;
  iVar5 = *(int *)(lVar7 + -0x20 + lVar8 * 0x48);
  if ((iVar5 == 0) ||
     ((*(longlong *)(lVar1 + -0x30) == *(longlong *)(param_1 + 0x1e) &&
      (*(longlong *)(lVar1 + -0x38) == *(longlong *)(param_1 + 0x1c))))) {
    if (*(longlong *)(lVar1 + -0x18) == 0) {
      if ((1 < iVar10) && (iVar5 == 0)) {
        iVar5 = FUN_7ff70cb12b50(param_1 + 0x18,lVar1 + -0x90,0x24);
        if ((iVar5 == 0) &&
           ((*(int *)(lVar1 + -0x68) + *(int *)(lVar1 + -0x6c) == *(int *)(lVar1 + -0x24) &&
            (*(longlong *)(lVar1 + -0x60) == 0)))) {
          *param_1 = iVar10 + -1;
          goto LAB_7ff70c7b86bd;
        }
      }
      iVar10 = param_1[0x1d];
      iVar5 = param_1[0x1e];
      iVar11 = param_1[0x1f];
      *(int *)(lVar1 + -0x38) = param_1[0x1c];
      *(int *)(lVar1 + -0x34) = iVar10;
      *(int *)(lVar1 + -0x30) = iVar5;
      *(int *)(lVar1 + -0x2c) = iVar11;
    }
  }
  else {
    uStack_58 = *(undefined8 *)(param_1 + 0x18);
    uStack_50 = *(undefined8 *)(param_1 + 0x1a);
    iStack_48 = param_1[0x1c];
    iStack_44 = param_1[0x1d];
    iStack_40 = param_1[0x1e];
    iStack_3c = param_1[0x1f];
    iVar5 = param_1[4];
    iVar11 = param_1[0x20];
    if (iVar10 == param_1[1]) {
      if (iVar10 == 0) {
        iVar6 = 8;
      }
      else {
        iVar6 = iVar10 / 2 + iVar10;
      }
      iVar9 = iVar10 + 1;
      if (iVar10 + 1 < iVar6) {
        iVar9 = iVar6;
      }
      lVar7 = FUN_7ff70c802100((longlong)iVar9 * 0x48);
      if (*(longlong *)(param_1 + 2) != 0) {
        FUN_7ff70cb12b60(lVar7,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
      }
      *(longlong *)(param_1 + 2) = lVar7;
      param_1[1] = iVar9;
      lVar8 = (longlong)*param_1;
    }
    puVar3 = (undefined8 *)(lVar7 + 0x10 + lVar8 * 0x48);
    *puVar3 = CONCAT44(iStack_44,iStack_48);
    puVar3[1] = CONCAT44(iStack_3c,iStack_40);
    puVar3 = (undefined8 *)(lVar7 + lVar8 * 0x48);
    *puVar3 = uStack_58;
    puVar3[1] = uStack_50;
    *(int *)(lVar7 + 0x20 + lVar8 * 0x48) = iVar11;
    *(int *)(lVar7 + 0x24 + lVar8 * 0x48) = iVar5;
    puVar3 = (undefined8 *)(lVar7 + 0x28 + lVar8 * 0x48);
    *puVar3 = 0;
    puVar3[1] = 0;
    puVar3 = (undefined8 *)(lVar7 + 0x38 + lVar8 * 0x48);
    *puVar3 = 0;
    puVar3[1] = 0;
    *param_1 = *param_1 + 1;
  }
LAB_7ff70c7b86bd:
  if (_DAT_7ff70cbebd80 == (uStack_38 ^ (ulonglong)auStack_78)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_38 ^ (ulonglong)auStack_78);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}


