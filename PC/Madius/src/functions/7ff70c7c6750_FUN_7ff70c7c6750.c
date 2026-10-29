/* 7ff70c7c6750 FUN_7ff70c7c6750 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7c6750(int *param_1,int *param_2,int param_3)

{
  int *piVar1;
  undefined8 *puVar2;
  longlong lVar3;
  int iVar4;
  code *pcVar5;
  undefined8 uVar6;
  int iVar7;
  int iVar8;
  longlong lVar9;
  int *piVar10;
  int iVar11;
  longlong lVar12;
  int iVar13;
  undefined1 auStack_78 [32];
  undefined8 uStack_58;
  undefined8 uStack_50;
  int iStack_48;
  int iStack_44;
  int iStack_40;
  int iStack_3c;
  ulonglong uStack_38;
  
  uStack_38 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  if (*param_1 == param_3) goto LAB_7ff70c7c6973;
  uVar6 = *(undefined8 *)(param_2 + 2);
  puVar2 = (undefined8 *)(*(longlong *)(param_1 + 4) + (longlong)*param_1 * 0x20);
  *puVar2 = *(undefined8 *)param_2;
  puVar2[1] = uVar6;
  uVar6 = *(undefined8 *)(param_2 + 6);
  puVar2 = (undefined8 *)(*(longlong *)(param_1 + 4) + 0x10 + (longlong)*param_1 * 0x20);
  *puVar2 = *(undefined8 *)(param_2 + 4);
  puVar2[1] = uVar6;
  *param_1 = param_3;
  puVar2 = (undefined8 *)(*(longlong *)(param_1 + 4) + (longlong)param_3 * 0x20);
  uVar6 = puVar2[1];
  *(undefined8 *)param_2 = *puVar2;
  *(undefined8 *)(param_2 + 2) = uVar6;
  piVar10 = (int *)(*(longlong *)(param_1 + 4) + 0x10 + (longlong)param_3 * 0x20);
  iVar4 = piVar10[1];
  iVar11 = piVar10[2];
  iVar7 = piVar10[3];
  param_2[4] = *piVar10;
  param_2[5] = iVar4;
  param_2[6] = iVar11;
  param_2[7] = iVar7;
  iVar4 = param_2[4];
  *(longlong *)(param_2 + 0x12) = (longlong)iVar4 * 2 + *(longlong *)(param_2 + 6);
  iVar11 = *param_2;
  lVar12 = (longlong)iVar11;
  if (lVar12 == 0) {
LAB_7ff70c7c689d:
    uStack_58 = *(undefined8 *)(param_2 + 0x18);
    uStack_50 = *(undefined8 *)(param_2 + 0x1a);
    iStack_48 = param_2[0x1c];
    iStack_44 = param_2[0x1d];
    iStack_40 = param_2[0x1e];
    iStack_3c = param_2[0x1f];
    iVar7 = param_2[0x20];
    if (iVar11 == param_2[1]) {
      if (iVar11 == 0) {
        iVar8 = 8;
      }
      else {
        iVar8 = iVar11 / 2 + iVar11;
      }
      iVar13 = iVar11 + 1;
      if (iVar11 + 1 < iVar8) {
        iVar13 = iVar8;
      }
      lVar9 = FUN_7ff70c802100((longlong)iVar13 * 0x48);
      if (*(longlong *)(param_2 + 2) != 0) {
        FUN_7ff70cb12b60(lVar9,*(longlong *)(param_2 + 2),(longlong)*param_2 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(param_2 + 2));
      }
      *(longlong *)(param_2 + 2) = lVar9;
      param_2[1] = iVar13;
      iVar11 = *param_2;
    }
    else {
      lVar9 = *(longlong *)(param_2 + 2);
    }
    lVar12 = (longlong)iVar11;
  }
  else {
    lVar9 = *(longlong *)(param_2 + 2);
    lVar3 = lVar9 + lVar12 * 0x48;
    piVar10 = (int *)(lVar3 + -0x48);
    if (piVar10 == (int *)0x0) goto LAB_7ff70c7c689d;
    piVar1 = param_2 + 0x18;
    if (*(int *)(lVar3 + -0x20) == 0) {
      *(int *)(lVar3 + -0x28) = param_2[0x20];
      iVar4 = *piVar1;
      iVar11 = param_2[0x19];
      iVar7 = param_2[0x1a];
      iVar8 = param_2[0x1b];
      uVar6 = *(undefined8 *)(param_2 + 0x1e);
      *(undefined8 *)(lVar3 + -0x38) = *(undefined8 *)(param_2 + 0x1c);
      *(undefined8 *)(lVar3 + -0x30) = uVar6;
      *piVar10 = iVar4;
      *(int *)(lVar3 + -0x44) = iVar11;
      *(int *)(lVar3 + -0x40) = iVar7;
      *(int *)(lVar3 + -0x3c) = iVar8;
      goto LAB_7ff70c7c6973;
    }
    iVar7 = FUN_7ff70cb12b50(piVar10,piVar1,0x24);
    if (iVar7 == 0) goto LAB_7ff70c7c6973;
    uStack_58 = *(undefined8 *)piVar1;
    uStack_50 = *(undefined8 *)(param_2 + 0x1a);
    iStack_48 = param_2[0x1c];
    iStack_44 = param_2[0x1d];
    iStack_40 = param_2[0x1e];
    iStack_3c = param_2[0x1f];
    iVar7 = param_2[0x20];
    if (iVar11 == param_2[1]) {
      iVar8 = 1;
      if (1 < iVar11 / 2) {
        iVar8 = iVar11 / 2;
      }
      lVar9 = FUN_7ff70c802100((longlong)(iVar8 + iVar11) * 0x48);
      if (*(longlong *)(param_2 + 2) != 0) {
        FUN_7ff70cb12b60(lVar9,*(longlong *)(param_2 + 2),(longlong)*param_2 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(param_2 + 2));
      }
      *(longlong *)(param_2 + 2) = lVar9;
      param_2[1] = iVar8 + iVar11;
      lVar12 = (longlong)*param_2;
    }
  }
  puVar2 = (undefined8 *)(lVar9 + 0x10 + lVar12 * 0x48);
  *puVar2 = CONCAT44(iStack_44,iStack_48);
  puVar2[1] = CONCAT44(iStack_3c,iStack_40);
  puVar2 = (undefined8 *)(lVar9 + lVar12 * 0x48);
  *puVar2 = uStack_58;
  puVar2[1] = uStack_50;
  *(int *)(lVar9 + 0x20 + lVar12 * 0x48) = iVar7;
  *(int *)(lVar9 + 0x24 + lVar12 * 0x48) = iVar4;
  puVar2 = (undefined8 *)(lVar9 + 0x28 + lVar12 * 0x48);
  *puVar2 = 0;
  puVar2[1] = 0;
  puVar2 = (undefined8 *)(lVar9 + 0x38 + lVar12 * 0x48);
  *puVar2 = 0;
  puVar2[1] = 0;
  *param_2 = *param_2 + 1;
LAB_7ff70c7c6973:
  if (_DAT_7ff70cbebd80 != (uStack_38 ^ (ulonglong)auStack_78)) {
    FUN_7ff70caa97e0(uStack_38 ^ (ulonglong)auStack_78);
    pcVar5 = (code *)swi(3);
    (*pcVar5)();
    return;
  }
  return;
}


