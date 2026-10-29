/* 7ff70c7c6a60 FUN_7ff70c7c6a60 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7c6a60(longlong param_1,int *param_2,int *param_3)

{
  longlong lVar1;
  code *pcVar2;
  undefined1 auVar3 [16];
  int iVar4;
  int iVar5;
  longlong lVar6;
  int iVar7;
  ulonglong uVar8;
  longlong lVar9;
  undefined1 auStack_58 [40];
  ulonglong uStack_30;
  
  uStack_30 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_58;
  lVar9 = (longlong)*param_3;
  if ((lVar9 != 0) &&
     (((*param_3 != 1 || (*(int *)(*(longlong *)(param_3 + 2) + 0x28) != 0)) ||
      (*(longlong *)(*(longlong *)(param_3 + 2) + 0x30) != 0)))) {
    if (0 < param_3[0x30]) {
      uVar8 = lVar9 * 0x48 - 0x48;
      auVar3._8_8_ = 0;
      auVar3._0_8_ = uVar8;
      lVar1 = *(longlong *)(param_3 + 2);
      lVar6 = lVar1;
      if ((SUB164(auVar3 * ZEXT816(0xe38e38e38e38e38f),8) >> 6 & 1) == 0) {
        if (((*(longlong *)(lVar1 + 0x30) != 0) && ((longlong)*(int *)(lVar1 + 0x44) != -1)) &&
           (0 < *(int *)(lVar1 + 0x40))) {
          *(longlong *)(lVar1 + 0x38) =
               (longlong)*(int *)(lVar1 + 0x44) + *(longlong *)(param_3 + 0x32);
        }
        lVar6 = lVar1 + 0x48;
      }
      if (0x47 < uVar8) {
        do {
          if (((*(longlong *)(lVar6 + 0x30) != 0) && ((longlong)*(int *)(lVar6 + 0x44) != -1)) &&
             (0 < *(int *)(lVar6 + 0x40))) {
            *(longlong *)(lVar6 + 0x38) =
                 (longlong)*(int *)(lVar6 + 0x44) + *(longlong *)(param_3 + 0x32);
          }
          if (((*(longlong *)(lVar6 + 0x78) != 0) && ((longlong)*(int *)(lVar6 + 0x8c) != -1)) &&
             (0 < *(int *)(lVar6 + 0x88))) {
            *(longlong *)(lVar6 + 0x80) =
                 (longlong)*(int *)(lVar6 + 0x8c) + *(longlong *)(param_3 + 0x32);
          }
          lVar6 = lVar6 + 0x90;
        } while (lVar6 != lVar1 + lVar9 * 0x48);
      }
    }
    iVar4 = *param_2;
    if (iVar4 == param_2[1]) {
      if (iVar4 == 0) {
        iVar5 = 8;
      }
      else {
        iVar5 = iVar4 / 2 + iVar4;
      }
      iVar7 = iVar4 + 1;
      if (iVar4 + 1 < iVar5) {
        iVar7 = iVar5;
      }
      lVar9 = FUN_7ff70c802100((longlong)iVar7 << 3);
      if (*(longlong *)(param_2 + 2) != 0) {
        FUN_7ff70cb12b60(lVar9,*(longlong *)(param_2 + 2),(longlong)*param_2 << 3);
        FUN_7ff70c802510(*(undefined8 *)(param_2 + 2));
      }
      *(longlong *)(param_2 + 2) = lVar9;
      param_2[1] = iVar7;
      iVar4 = *param_2;
    }
    else {
      lVar9 = *(longlong *)(param_2 + 2);
    }
    *(int **)(lVar9 + (longlong)iVar4 * 8) = param_3;
    *param_2 = *param_2 + 1;
    *(int *)(param_1 + 4) = *(int *)(param_1 + 4) + 1;
    *(int *)(param_1 + 0xc) = *(int *)(param_1 + 0xc) + param_3[8];
    *(int *)(param_1 + 8) = *(int *)(param_1 + 8) + param_3[4];
  }
  if (_DAT_7ff70cbebd80 == (uStack_30 ^ (ulonglong)auStack_58)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_30 ^ (ulonglong)auStack_58);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


