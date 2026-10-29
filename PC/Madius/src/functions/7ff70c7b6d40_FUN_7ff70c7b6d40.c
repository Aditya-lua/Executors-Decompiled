/* 7ff70c7b6d40 FUN_7ff70c7b6d40 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b6d40(uint *param_1)

{
  undefined8 *puVar1;
  code *pcVar2;
  ulonglong uVar3;
  longlong lVar4;
  longlong lVar5;
  undefined1 auStack_68 [40];
  ulonglong uStack_40;
  
  uStack_40 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_68;
  if (0 < (int)param_1[2]) {
    lVar4 = 0;
    uVar3 = 0;
    do {
      lVar5 = *(longlong *)(param_1 + 4);
      if (uVar3 == *param_1) {
        puVar1 = (undefined8 *)(lVar5 + 0x10 + lVar4);
        *puVar1 = 0;
        puVar1[1] = 0;
        *(undefined8 *)(lVar5 + lVar4) = 0;
        ((undefined8 *)(lVar5 + lVar4))[1] = 0;
        lVar5 = *(longlong *)(param_1 + 4);
      }
      if (*(longlong *)(lVar5 + 8 + lVar4) != 0) {
        *(undefined8 *)(lVar5 + lVar4) = 0;
        FUN_7ff70c802510();
        *(undefined8 *)(lVar5 + 8 + lVar4) = 0;
        lVar5 = *(longlong *)(param_1 + 4);
      }
      if (*(longlong *)(lVar5 + 0x18 + lVar4) != 0) {
        *(undefined8 *)(lVar5 + 0x10 + lVar4) = 0;
        FUN_7ff70c802510();
        *(undefined8 *)(lVar5 + 0x18 + lVar4) = 0;
      }
      uVar3 = uVar3 + 1;
      lVar4 = lVar4 + 0x20;
    } while ((longlong)uVar3 < (longlong)(int)param_1[2]);
  }
  param_1[0] = 0;
  param_1[1] = 1;
  if (*(longlong *)(param_1 + 4) != 0) {
    param_1[2] = 0;
    param_1[3] = 0;
    FUN_7ff70c802510();
    param_1[4] = 0;
    param_1[5] = 0;
  }
  if (_DAT_7ff70cbebd80 == (uStack_40 ^ (ulonglong)auStack_68)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_40 ^ (ulonglong)auStack_68);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


