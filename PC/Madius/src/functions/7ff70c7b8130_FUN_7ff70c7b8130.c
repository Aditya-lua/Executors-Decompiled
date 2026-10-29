/* 7ff70c7b8130 FUN_7ff70c7b8130 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b8130(int *param_1)

{
  longlong lVar1;
  int iVar2;
  int iVar3;
  code *pcVar4;
  undefined8 uVar5;
  int iVar6;
  int iVar7;
  longlong lVar8;
  longlong lVar9;
  undefined8 *puVar10;
  int iVar11;
  undefined1 (*pauVar12) [16];
  undefined1 auStack_78 [32];
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  ulonglong uStack_38;
  
  uStack_38 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  iVar2 = param_1[0x28];
  iVar7 = (int)((longlong)iVar2 + -1);
  param_1[0x28] = iVar7;
  lVar8 = *(longlong *)(param_1 + 2);
  puVar10 = (undefined8 *)(*(longlong *)(param_1 + 0x2a) + -0x10 + ((longlong)iVar2 + -1) * 0x10);
  if (iVar7 == 0) {
    puVar10 = (undefined8 *)(*(longlong *)(param_1 + 0xe) + 0x38);
  }
  uVar5 = puVar10[1];
  *(undefined8 *)(param_1 + 0x18) = *puVar10;
  *(undefined8 *)(param_1 + 0x1a) = uVar5;
  iVar2 = *param_1;
  lVar9 = (longlong)iVar2;
  lVar1 = lVar8 + lVar9 * 0x48;
  pauVar12 = (undefined1 (*) [16])(lVar1 + -0x48);
  if (*(int *)(lVar8 + -0x20 + lVar9 * 0x48) == 0) {
    if (1 < iVar2) {
      lVar8 = lVar8 + lVar9 * 0x48;
      iVar7 = FUN_7ff70cb12b50((undefined1 (*) [16])(param_1 + 0x18),lVar8 + -0x90,0x24);
      if (((iVar7 == 0) &&
          (*(int *)(lVar8 + -0x68) + *(int *)(lVar8 + -0x6c) == *(int *)(lVar8 + -0x24))) &&
         (*(longlong *)(lVar8 + -0x60) == 0)) {
        *param_1 = iVar2 + -1;
        goto LAB_7ff70c7b82be;
      }
    }
  }
  else if (*(undefined1 (*) [16])(param_1 + 0x18) != *pauVar12) {
    uStack_58 = *puVar10;
    uStack_50 = puVar10[1];
    uStack_48 = *(undefined8 *)(param_1 + 0x1c);
    uStack_40 = *(undefined8 *)(param_1 + 0x1e);
    iVar7 = param_1[4];
    iVar3 = param_1[0x20];
    if (iVar2 == param_1[1]) {
      if (iVar2 == 0) {
        iVar6 = 8;
      }
      else {
        iVar6 = iVar2 / 2 + iVar2;
      }
      iVar11 = iVar2 + 1;
      if (iVar2 + 1 < iVar6) {
        iVar11 = iVar6;
      }
      lVar8 = FUN_7ff70c802100((longlong)iVar11 * 0x48);
      if (*(longlong *)(param_1 + 2) != 0) {
        FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
      }
      *(longlong *)(param_1 + 2) = lVar8;
      param_1[1] = iVar11;
      lVar9 = (longlong)*param_1;
    }
    puVar10 = (undefined8 *)(lVar8 + 0x10 + lVar9 * 0x48);
    *puVar10 = uStack_48;
    puVar10[1] = uStack_40;
    puVar10 = (undefined8 *)(lVar8 + lVar9 * 0x48);
    *puVar10 = uStack_58;
    puVar10[1] = uStack_50;
    *(int *)(lVar8 + 0x20 + lVar9 * 0x48) = iVar3;
    *(int *)(lVar8 + 0x24 + lVar9 * 0x48) = iVar7;
    *(undefined1 (*) [16])(lVar8 + 0x28 + lVar9 * 0x48) = (undefined1  [16])0x0;
    *(undefined1 (*) [16])(lVar8 + 0x38 + lVar9 * 0x48) = (undefined1  [16])0x0;
    *param_1 = *param_1 + 1;
    goto LAB_7ff70c7b82be;
  }
  uVar5 = puVar10[1];
  *(undefined8 *)*pauVar12 = *puVar10;
  *(undefined8 *)(lVar1 + -0x40) = uVar5;
LAB_7ff70c7b82be:
  if (_DAT_7ff70cbebd80 == (uStack_38 ^ (ulonglong)auStack_78)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_38 ^ (ulonglong)auStack_78);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}


