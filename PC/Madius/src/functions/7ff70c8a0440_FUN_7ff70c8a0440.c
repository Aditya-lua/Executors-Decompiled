/* 7ff70c8a0440 FUN_7ff70c8a0440 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8a0440(int *param_1,undefined1 param_2)

{
  undefined4 *puVar1;
  code *pcVar2;
  undefined8 uVar3;
  longlong lVar4;
  longlong lVar5;
  undefined1 auStack_48 [40];
  ulonglong uStack_20;
  
  uStack_20 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  if (param_1[1] < 0) {
    uVar3 = FUN_7ff70c802100(0);
    if (*(longlong *)(param_1 + 2) != 0) {
      FUN_7ff70cb12b60(uVar3,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x18);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
    }
    *(undefined8 *)(param_1 + 2) = uVar3;
    param_1[0] = 0;
    param_1[1] = 0;
  }
  else {
    *param_1 = 0;
    if (param_1[1] != 0) {
      lVar4 = *(longlong *)(param_1 + 2);
      lVar5 = 0;
      goto LAB_7ff70c8a04eb;
    }
  }
  lVar4 = FUN_7ff70c802100(0xc0);
  if (*(longlong *)(param_1 + 2) != 0) {
    FUN_7ff70cb12b60(lVar4,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x18);
    FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
  }
  *(longlong *)(param_1 + 2) = lVar4;
  param_1[1] = 8;
  lVar5 = (longlong)*param_1;
LAB_7ff70c8a04eb:
  *(undefined4 *)(lVar4 + lVar5 * 0x18) = 1;
  *(undefined1 *)(lVar4 + 4 + lVar5 * 0x18) = param_2;
  *(undefined1 *)(lVar4 + 5 + lVar5 * 0x18) = 0;
  puVar1 = (undefined4 *)(lVar4 + 8 + lVar5 * 0x18);
  *puVar1 = 0xffffffff;
  puVar1[1] = 0xffffffff;
  puVar1[2] = 0xffffffff;
  puVar1[3] = 0xffffffff;
  *param_1 = *param_1 + 1;
  if (_DAT_7ff70cbebd80 == (uStack_20 ^ (ulonglong)auStack_48)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_20 ^ (ulonglong)auStack_48);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


