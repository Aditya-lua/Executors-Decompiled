/* 7ff70c7b6160 FUN_7ff70c7b6160 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b6160(int *param_1)

{
  undefined8 *puVar1;
  code *pcVar2;
  int iVar3;
  undefined8 uVar4;
  longlong lVar5;
  int iVar7;
  int iVar8;
  undefined1 auStack_48 [40];
  ulonglong uStack_20;
  longlong lVar6;
  
  uStack_20 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  if (param_1[0x23] < 2) {
    iVar3 = param_1[1];
  }
  else {
    FUN_7ff70c7b6530(param_1 + 0x22,param_1);
    iVar3 = param_1[1];
  }
  if (iVar3 < 0) {
    uVar4 = FUN_7ff70c802100(0);
    if (*(longlong *)(param_1 + 2) != 0) {
      FUN_7ff70cb12b60(uVar4,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
    }
    *(undefined8 *)(param_1 + 2) = uVar4;
    param_1[1] = 0;
    *param_1 = 0;
    iVar3 = param_1[5];
  }
  else {
    *param_1 = 0;
    iVar3 = param_1[5];
  }
  if (iVar3 < 0) {
    uVar4 = FUN_7ff70c802100(0);
    if (*(longlong *)(param_1 + 6) != 0) {
      FUN_7ff70cb12b60(uVar4,*(longlong *)(param_1 + 6),(longlong)param_1[4] * 2);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 6));
    }
    *(undefined8 *)(param_1 + 6) = uVar4;
    param_1[5] = 0;
    param_1[4] = 0;
    iVar3 = param_1[9];
  }
  else {
    param_1[4] = 0;
    iVar3 = param_1[9];
  }
  if (iVar3 < 0) {
    uVar4 = FUN_7ff70c802100(0);
    if (*(longlong *)(param_1 + 10) != 0) {
      FUN_7ff70cb12b60(uVar4,*(longlong *)(param_1 + 10),(longlong)param_1[8] * 0x14);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 10));
    }
    *(undefined8 *)(param_1 + 10) = uVar4;
    param_1[9] = 0;
  }
  param_1[8] = 0;
  param_1[0xc] = *(int *)(*(longlong *)(param_1 + 0xe) + 0x34);
  param_1[0x18] = 0;
  param_1[0x19] = 0;
  param_1[0x1a] = 0;
  param_1[0x1b] = 0;
  param_1[0x1c] = 0;
  param_1[0x1d] = 0;
  param_1[0x1e] = 0;
  param_1[0x1f] = 0;
  param_1[0x20] = 0;
  param_1[0x21] = 0;
  param_1[0xd] = 0;
  param_1[0x10] = 0;
  param_1[0x11] = 0;
  param_1[0x12] = 0;
  param_1[0x13] = 0;
  if (param_1[0x29] < 0) {
    uVar4 = FUN_7ff70c802100(0);
    if (*(longlong *)(param_1 + 0x2a) != 0) {
      FUN_7ff70cb12b60(uVar4,*(longlong *)(param_1 + 0x2a),(longlong)param_1[0x28] << 4);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x2a));
    }
    *(undefined8 *)(param_1 + 0x2a) = uVar4;
    param_1[0x29] = 0;
    param_1[0x28] = 0;
    iVar3 = param_1[0x2d];
  }
  else {
    param_1[0x28] = 0;
    iVar3 = param_1[0x2d];
  }
  if (iVar3 < 0) {
    uVar4 = FUN_7ff70c802100(0);
    if (*(longlong *)(param_1 + 0x2e) != 0) {
      FUN_7ff70cb12b60(uVar4,*(longlong *)(param_1 + 0x2e),(longlong)param_1[0x2c] << 4);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x2e));
    }
    *(undefined8 *)(param_1 + 0x2e) = uVar4;
    param_1[0x2d] = 0;
    param_1[0x2c] = 0;
    iVar3 = param_1[0x31];
  }
  else {
    param_1[0x2c] = 0;
    iVar3 = param_1[0x31];
  }
  if (iVar3 < 0) {
    uVar4 = FUN_7ff70c802100(0);
    if (*(longlong *)(param_1 + 0x32) != 0) {
      FUN_7ff70cb12b60(uVar4,*(longlong *)(param_1 + 0x32),(longlong)param_1[0x30]);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x32));
    }
    *(undefined8 *)(param_1 + 0x32) = uVar4;
    param_1[0x31] = 0;
    param_1[0x30] = 0;
    iVar3 = param_1[0x15];
  }
  else {
    param_1[0x30] = 0;
    iVar3 = param_1[0x15];
  }
  if (iVar3 < 0) {
    uVar4 = FUN_7ff70c802100(0);
    if (*(longlong *)(param_1 + 0x16) != 0) {
      FUN_7ff70cb12b60(uVar4,*(longlong *)(param_1 + 0x16),(longlong)param_1[0x14] << 3);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x16));
    }
    *(undefined8 *)(param_1 + 0x16) = uVar4;
    param_1[0x15] = 0;
  }
  param_1[0x14] = 0;
  param_1[0x22] = 0;
  param_1[0x23] = 1;
  iVar3 = *param_1;
  if (iVar3 == param_1[1]) {
    if (iVar3 == 0) {
      iVar7 = 8;
    }
    else {
      iVar7 = iVar3 / 2 + iVar3;
    }
    iVar8 = iVar3 + 1;
    if (iVar3 + 1 < iVar7) {
      iVar8 = iVar7;
    }
    lVar5 = FUN_7ff70c802100((longlong)iVar8 * 0x48);
    if (*(longlong *)(param_1 + 2) != 0) {
      FUN_7ff70cb12b60(lVar5,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
    }
    *(longlong *)(param_1 + 2) = lVar5;
    param_1[1] = iVar8;
    iVar3 = *param_1;
  }
  else {
    lVar5 = *(longlong *)(param_1 + 2);
  }
  lVar6 = (longlong)iVar3;
  puVar1 = (undefined8 *)(lVar5 + 0x30 + lVar6 * 0x48);
  *puVar1 = 0;
  puVar1[1] = 0;
  puVar1 = (undefined8 *)(lVar5 + 0x20 + lVar6 * 0x48);
  *puVar1 = 0;
  puVar1[1] = 0;
  puVar1 = (undefined8 *)(lVar5 + 0x10 + lVar6 * 0x48);
  *puVar1 = 0;
  puVar1[1] = 0;
  puVar1 = (undefined8 *)(lVar5 + lVar6 * 0x48);
  *puVar1 = 0;
  puVar1[1] = 0;
  *(undefined8 *)(lVar5 + 0x40 + lVar6 * 0x48) = 0;
  *param_1 = *param_1 + 1;
  param_1[0x34] = *(int *)(*(longlong *)(param_1 + 0xe) + 0x30);
  if (_DAT_7ff70cbebd80 == (uStack_20 ^ (ulonglong)auStack_48)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_20 ^ (ulonglong)auStack_48);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


