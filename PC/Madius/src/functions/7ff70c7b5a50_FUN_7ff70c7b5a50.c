/* 7ff70c7b5a50 FUN_7ff70c7b5a50 */

void FUN_7ff70c7b5a50(undefined8 *param_1)

{
  undefined8 *puVar1;
  int iVar2;
  undefined8 *puVar3;
  longlong lVar4;
  ulonglong uVar5;
  longlong lVar6;
  
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
    uVar5 = 0;
    do {
      lVar4 = param_1[0x13];
      if (uVar5 == *(uint *)(param_1 + 0x11)) {
        puVar1 = (undefined8 *)(lVar4 + 0x10 + uVar5 * 0x20);
        *puVar1 = 0;
        puVar1[1] = 0;
        puVar1 = (undefined8 *)(lVar4 + uVar5 * 0x20);
        *puVar1 = 0;
        puVar1[1] = 0;
        lVar4 = param_1[0x13];
      }
      lVar6 = uVar5 * 0x20;
      if (*(longlong *)(lVar4 + 8 + lVar6) != 0) {
        *(undefined8 *)(lVar4 + lVar6) = 0;
        FUN_7ff70c802510();
        ((undefined8 *)(lVar4 + lVar6))[1] = 0;
        lVar4 = param_1[0x13];
      }
      if (*(longlong *)(lVar4 + 0x18 + lVar6) != 0) {
        *(undefined8 *)(lVar4 + lVar6 + 0x10) = 0;
        FUN_7ff70c802510();
        *(undefined8 *)(lVar4 + lVar6 + 0x18) = 0;
      }
      uVar5 = uVar5 + 1;
    } while ((longlong)uVar5 < (longlong)*(int *)(param_1 + 0x12));
  }
  param_1[0x11] = 0x100000000;
  if (param_1[0x13] != 0) {
    param_1[0x12] = 0;
    FUN_7ff70c802510();
    param_1[0x13] = 0;
  }
  lVar4 = param_1[7];
  if (lVar4 != 0) {
    puVar3 = *(undefined8 **)(lVar4 + 0x60);
    iVar2 = *(int *)(lVar4 + 0x58);
    puVar1 = puVar3 + iVar2;
    if (0 < (longlong)iVar2) {
      do {
        if ((undefined8 *)*puVar3 == param_1) break;
        puVar3 = puVar3 + 1;
      } while (puVar3 < puVar1);
    }
    if (puVar3 < puVar1) {
      if (puVar3 < puVar1 + -1) {
        *puVar3 = puVar1[-1];
        iVar2 = *(int *)(lVar4 + 0x58);
      }
      *(int *)(lVar4 + 0x58) = iVar2 + -1;
    }
  }
  param_1[7] = 0;
  if (param_1[0x19] != 0) {
    FUN_7ff70c802510();
  }
  if (param_1[0x17] != 0) {
    FUN_7ff70c802510();
  }
  if (param_1[0x15] != 0) {
    FUN_7ff70c802510();
  }
  if (0 < *(int *)(param_1 + 0x12)) {
    uVar5 = 0;
    do {
      lVar4 = param_1[0x13];
      if (uVar5 == *(uint *)(param_1 + 0x11)) {
        puVar1 = (undefined8 *)(lVar4 + 0x10 + uVar5 * 0x20);
        *puVar1 = 0;
        puVar1[1] = 0;
        puVar1 = (undefined8 *)(lVar4 + uVar5 * 0x20);
        *puVar1 = 0;
        puVar1[1] = 0;
        lVar4 = param_1[0x13];
      }
      lVar6 = uVar5 * 0x20;
      if (*(longlong *)(lVar4 + 8 + lVar6) != 0) {
        *(undefined8 *)(lVar4 + lVar6) = 0;
        FUN_7ff70c802510();
        ((undefined8 *)(lVar4 + lVar6))[1] = 0;
        lVar4 = param_1[0x13];
      }
      if (*(longlong *)(lVar4 + 0x18 + lVar6) != 0) {
        *(undefined8 *)(lVar4 + lVar6 + 0x10) = 0;
        FUN_7ff70c802510();
        *(undefined8 *)(lVar4 + lVar6 + 0x18) = 0;
      }
      uVar5 = uVar5 + 1;
    } while ((longlong)uVar5 < (longlong)*(int *)(param_1 + 0x12));
  }
  param_1[0x11] = 0x100000000;
  if (param_1[0x13] != 0) {
    param_1[0x12] = 0;
    FUN_7ff70c802510();
    param_1[0x13] = 0;
  }
  if (param_1[0xb] != 0) {
    FUN_7ff70c802510();
  }
  if (param_1[5] != 0) {
    FUN_7ff70c802510();
  }
  if (param_1[3] != 0) {
    FUN_7ff70c802510();
  }
  if (param_1[1] != 0) {
    FUN_7ff70c802510();
  }
  return;
}


