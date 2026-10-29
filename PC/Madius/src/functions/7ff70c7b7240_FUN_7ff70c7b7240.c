/* 7ff70c7b7240 FUN_7ff70c7b7240 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b7240(int *param_1)

{
  undefined8 *puVar1;
  int *piVar2;
  int iVar3;
  int iVar4;
  code *pcVar5;
  int iVar6;
  longlong lVar7;
  int iVar9;
  int iVar10;
  undefined1 auStack_78 [32];
  undefined8 uStack_58;
  undefined8 uStack_50;
  int iStack_48;
  int iStack_44;
  int iStack_40;
  int iStack_3c;
  ulonglong uStack_30;
  longlong lVar8;
  
  uStack_30 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  uStack_58 = *(undefined8 *)(param_1 + 0x18);
  uStack_50 = *(undefined8 *)(param_1 + 0x1a);
  iStack_48 = param_1[0x1c];
  iStack_44 = param_1[0x1d];
  iStack_40 = param_1[0x1e];
  iStack_3c = param_1[0x1f];
  iVar3 = param_1[0x20];
  iVar6 = *param_1;
  iVar4 = param_1[4];
  if (iVar6 == param_1[1]) {
    if (iVar6 == 0) {
      iVar9 = 8;
    }
    else {
      iVar9 = iVar6 / 2 + iVar6;
    }
    iVar10 = iVar6 + 1;
    if (iVar6 + 1 < iVar9) {
      iVar10 = iVar9;
    }
    lVar7 = FUN_7ff70c802100((longlong)iVar10 * 0x48);
    if (*(longlong *)(param_1 + 2) != 0) {
      FUN_7ff70cb12b60(lVar7,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
    }
    *(longlong *)(param_1 + 2) = lVar7;
    param_1[1] = iVar10;
    iVar6 = *param_1;
  }
  else {
    lVar7 = *(longlong *)(param_1 + 2);
  }
  lVar8 = (longlong)iVar6;
  piVar2 = (int *)(lVar7 + 0x10 + lVar8 * 0x48);
  *piVar2 = iStack_48;
  piVar2[1] = iStack_44;
  piVar2[2] = iStack_40;
  piVar2[3] = iStack_3c;
  puVar1 = (undefined8 *)(lVar7 + lVar8 * 0x48);
  *puVar1 = uStack_58;
  puVar1[1] = uStack_50;
  *(int *)(lVar7 + 0x20 + lVar8 * 0x48) = iVar3;
  *(int *)(lVar7 + 0x24 + lVar8 * 0x48) = iVar4;
  puVar1 = (undefined8 *)(lVar7 + 0x28 + lVar8 * 0x48);
  *puVar1 = 0;
  puVar1[1] = 0;
  puVar1 = (undefined8 *)(lVar7 + 0x38 + lVar8 * 0x48);
  *puVar1 = 0;
  puVar1[1] = 0;
  *param_1 = *param_1 + 1;
  if (_DAT_7ff70cbebd80 == (uStack_30 ^ (ulonglong)auStack_78)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_30 ^ (ulonglong)auStack_78);
  pcVar5 = (code *)swi(3);
  (*pcVar5)();
  return;
}


