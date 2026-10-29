/* 7ff70c7bd6c0 FUN_7ff70c7bd6c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7bd6c0(longlong param_1,undefined8 *param_2,undefined8 *param_3,ulonglong param_4,
                     undefined4 param_5)

{
  code *pcVar1;
  longlong lVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  float fVar6;
  float fVar7;
  undefined1 auStack_88 [32];
  undefined4 uStack_68;
  undefined4 uStack_60;
  ulonglong uStack_50;
  
  uStack_50 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_88;
  if (0xffffff < (uint)param_4) {
    fVar6 = (float)*param_2 + _DAT_7ff70cb1ba80;
    fVar7 = (float)((ulonglong)*param_2 >> 0x20) + _UNK_7ff70cb1ba84;
    iVar4 = *(int *)(param_1 + 0x50);
    if (iVar4 == *(int *)(param_1 + 0x54)) {
      param_4 = param_4 & 0xffffffff;
      if (iVar4 == 0) {
        iVar3 = 8;
      }
      else {
        iVar3 = iVar4 / 2 + iVar4;
      }
      iVar5 = iVar4 + 1;
      if (iVar4 + 1 < iVar3) {
        iVar5 = iVar3;
      }
      lVar2 = FUN_7ff70c802100((longlong)iVar5 << 3);
      if (*(longlong *)(param_1 + 0x58) != 0) {
        FUN_7ff70cb12b60(lVar2,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3
                        );
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
      }
      *(longlong *)(param_1 + 0x58) = lVar2;
      *(int *)(param_1 + 0x54) = iVar5;
      iVar4 = *(int *)(param_1 + 0x50);
    }
    else {
      lVar2 = *(longlong *)(param_1 + 0x58);
    }
    *(ulonglong *)(lVar2 + (longlong)iVar4 * 8) = CONCAT44(fVar7,fVar6);
    iVar3 = *(int *)(param_1 + 0x50);
    iVar4 = iVar3 + 1;
    *(int *)(param_1 + 0x50) = iVar4;
    fVar6 = (float)*param_3 + _DAT_7ff70cb1ba80;
    fVar7 = (float)((ulonglong)*param_3 >> 0x20) + _UNK_7ff70cb1ba84;
    if (iVar4 == *(int *)(param_1 + 0x54)) {
      iVar3 = iVar3 + 2;
      if (iVar4 == 0) {
        iVar4 = 8;
      }
      else {
        iVar4 = iVar4 / 2 + iVar4;
      }
      if (iVar3 < iVar4) {
        iVar3 = iVar4;
      }
      lVar2 = FUN_7ff70c802100((longlong)iVar3 << 3);
      if (*(longlong *)(param_1 + 0x58) != 0) {
        FUN_7ff70cb12b60(lVar2,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3
                        );
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
      }
      *(longlong *)(param_1 + 0x58) = lVar2;
      *(int *)(param_1 + 0x54) = iVar3;
      iVar4 = *(int *)(param_1 + 0x50);
      param_4 = param_4 & 0xffffffff;
    }
    else {
      lVar2 = *(longlong *)(param_1 + 0x58);
    }
    *(ulonglong *)(lVar2 + (longlong)iVar4 * 8) = CONCAT44(fVar7,fVar6);
    iVar4 = *(int *)(param_1 + 0x50) + 1;
    *(int *)(param_1 + 0x50) = iVar4;
    uStack_60 = param_5;
    uStack_68 = 0;
    FUN_7ff70c7b8f50(param_1,*(undefined8 *)(param_1 + 0x58),iVar4,param_4);
    *(undefined4 *)(param_1 + 0x50) = 0;
  }
  if (_DAT_7ff70cbebd80 == (uStack_50 ^ (ulonglong)auStack_88)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_50 ^ (ulonglong)auStack_88);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


