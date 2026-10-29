/* 7ff70c7b5f30 FUN_7ff70c7b5f30 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b5f30(undefined8 *param_1)

{
  undefined8 *puVar1;
  code *pcVar2;
  ulonglong uVar3;
  longlong lVar4;
  longlong lVar5;
  undefined1 auStack_68 [40];
  ulonglong uStack_40;
  
  uStack_40 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_68;
  if (param_1[1] != 0) {
    *param_1 = 0;
    FUN_7ff70c802510();
    param_1[1] = 0;
  }
  if (param_1[3] != 0) {
    param_1[2] = 0;
    FUN_7ff70c802510();
    param_1[3] = 0;
  }
  if (param_1[5] != 0) {
    param_1[4] = 0;
    FUN_7ff70c802510();
    param_1[5] = 0;
  }
  param_1[6] = 0;
  param_1[8] = 0;
  param_1[9] = 0;
  if (param_1[0x15] != 0) {
    param_1[0x14] = 0;
    FUN_7ff70c802510();
    param_1[0x15] = 0;
  }
  if (param_1[0x17] != 0) {
    param_1[0x16] = 0;
    FUN_7ff70c802510();
    param_1[0x17] = 0;
  }
  if (param_1[0x19] != 0) {
    param_1[0x18] = 0;
    FUN_7ff70c802510();
    param_1[0x19] = 0;
  }
  if (param_1[0xb] != 0) {
    param_1[10] = 0;
    FUN_7ff70c802510();
    param_1[0xb] = 0;
  }
  if (0 < *(int *)(param_1 + 0x12)) {
    lVar4 = 0;
    uVar3 = 0;
    do {
      lVar5 = param_1[0x13];
      if (uVar3 == *(uint *)(param_1 + 0x11)) {
        puVar1 = (undefined8 *)(lVar5 + 0x10 + lVar4);
        *puVar1 = 0;
        puVar1[1] = 0;
        *(undefined8 *)(lVar5 + lVar4) = 0;
        ((undefined8 *)(lVar5 + lVar4))[1] = 0;
        lVar5 = param_1[0x13];
      }
      if (*(longlong *)(lVar5 + 8 + lVar4) != 0) {
        *(undefined8 *)(lVar5 + lVar4) = 0;
        FUN_7ff70c802510();
        *(undefined8 *)(lVar5 + 8 + lVar4) = 0;
        lVar5 = param_1[0x13];
      }
      if (*(longlong *)(lVar5 + 0x18 + lVar4) != 0) {
        *(undefined8 *)(lVar5 + 0x10 + lVar4) = 0;
        FUN_7ff70c802510();
        *(undefined8 *)(lVar5 + 0x18 + lVar4) = 0;
      }
      uVar3 = uVar3 + 1;
      lVar4 = lVar4 + 0x20;
    } while ((longlong)uVar3 < (longlong)*(int *)(param_1 + 0x12));
  }
  param_1[0x11] = 0x100000000;
  if (param_1[0x13] != 0) {
    param_1[0x12] = 0;
    FUN_7ff70c802510();
    param_1[0x13] = 0;
  }
  if (_DAT_7ff70cbebd80 == (uStack_40 ^ (ulonglong)auStack_68)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_40 ^ (ulonglong)auStack_68);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


