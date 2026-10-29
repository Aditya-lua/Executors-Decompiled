/* 7ff70c7fabb0 FUN_7ff70c7fabb0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7fabb0(longlong param_1,undefined8 param_2,undefined4 param_3,float param_4)

{
  code *pcVar1;
  longlong lVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  float fVar6;
  float fVar7;
  float fVar8;
  float fVar9;
  undefined1 auStack_c8 [32];
  undefined4 uStack_a8;
  float fStack_a0;
  ulonglong uStack_90;
  
  uStack_90 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_c8;
  fVar7 = param_4 / _DAT_7ff70cb1c678;
  if (param_4 / _DAT_7ff70cb1c678 <= _DAT_7ff70cb1ba2c) {
    fVar7 = _DAT_7ff70cb1ba2c;
  }
  param_4 = param_4 - fVar7 * _DAT_7ff70cb1ba70;
  fVar6 = param_4 / _DAT_7ff70cb1bae0;
  fVar8 = (float)param_2 + _DAT_7ff70cb1c67c * fVar7 + fVar6;
  fVar9 = (_DAT_7ff70cb1c67c * fVar7 + (float)((ulonglong)param_2 >> 0x20) + param_4) -
          _DAT_7ff70cb1ba70 * fVar6;
  iVar4 = *(int *)(param_1 + 0x50);
  if (iVar4 == *(int *)(param_1 + 0x54)) {
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
      FUN_7ff70cb12b60(lVar2,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
    }
    *(longlong *)(param_1 + 0x58) = lVar2;
    *(int *)(param_1 + 0x54) = iVar5;
    iVar4 = *(int *)(param_1 + 0x50);
  }
  else {
    lVar2 = *(longlong *)(param_1 + 0x58);
  }
  *(float *)(lVar2 + (longlong)iVar4 * 8) = fVar8 - fVar6;
  *(float *)(lVar2 + 4 + (longlong)iVar4 * 8) = fVar9 - fVar6;
  iVar3 = *(int *)(param_1 + 0x50);
  iVar4 = iVar3 + 1;
  *(int *)(param_1 + 0x50) = iVar4;
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
      FUN_7ff70cb12b60(lVar2,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
    }
    *(longlong *)(param_1 + 0x58) = lVar2;
    *(int *)(param_1 + 0x54) = iVar3;
    iVar4 = *(int *)(param_1 + 0x50);
  }
  else {
    lVar2 = *(longlong *)(param_1 + 0x58);
  }
  *(float *)(lVar2 + (longlong)iVar4 * 8) = fVar8;
  *(float *)(lVar2 + 4 + (longlong)iVar4 * 8) = fVar9;
  iVar3 = *(int *)(param_1 + 0x50);
  iVar4 = iVar3 + 1;
  *(int *)(param_1 + 0x50) = iVar4;
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
      FUN_7ff70cb12b60(lVar2,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
    }
    *(longlong *)(param_1 + 0x58) = lVar2;
    *(int *)(param_1 + 0x54) = iVar3;
    iVar4 = *(int *)(param_1 + 0x50);
  }
  else {
    lVar2 = *(longlong *)(param_1 + 0x58);
  }
  *(float *)(lVar2 + (longlong)iVar4 * 8) = fVar8 + fVar6 + fVar6;
  *(float *)(lVar2 + 4 + (longlong)iVar4 * 8) = fVar9 - (fVar6 + fVar6);
  iVar4 = *(int *)(param_1 + 0x50) + 1;
  *(int *)(param_1 + 0x50) = iVar4;
  uStack_a8 = 0;
  fStack_a0 = fVar7;
  FUN_7ff70c7b8f50(param_1,*(undefined8 *)(param_1 + 0x58),iVar4,param_3);
  *(undefined4 *)(param_1 + 0x50) = 0;
  if (_DAT_7ff70cbebd80 == (uStack_90 ^ (ulonglong)auStack_c8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_90 ^ (ulonglong)auStack_c8);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


