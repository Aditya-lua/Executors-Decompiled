/* 7ff70c9103f0 FUN_7ff70c9103f0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9103f0(longlong param_1)

{
  code *pcVar1;
  longlong lVar2;
  longlong lVar3;
  longlong lVar4;
  undefined1 auStack_38 [32];
  ulonglong uStack_18;
  
  lVar2 = _DAT_7ff70cc1a3c0;
  uStack_18 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  *(undefined8 *)(param_1 + 0x1f0) = 0;
  if (*(longlong *)(param_1 + 0x1e8) != 0) {
    *(undefined8 *)(param_1 + 0x1e0) = 0;
    FUN_7ff70c802510();
    *(undefined8 *)(param_1 + 0x1e8) = 0;
  }
  *(undefined1 *)(param_1 + 0x23a) = 1;
  if (*(longlong *)(param_1 + 0x198) != 0) {
    *(undefined8 *)(param_1 + 400) = 0;
    FUN_7ff70c802510();
    *(undefined8 *)(param_1 + 0x198) = 0;
  }
  *(undefined1 *)(param_1 + 0x249) = 1;
  if (0 < *(int *)(param_1 + 0x6c)) {
    lVar3 = 0x54;
    lVar4 = 0;
    do {
      *(undefined2 *)(*(longlong *)(param_1 + 0x18) + lVar3) = 0xffff;
      lVar4 = lVar4 + 1;
      lVar3 = lVar3 + 0x74;
    } while (lVar4 < *(int *)(param_1 + 0x6c));
  }
  *(undefined4 *)
   (*(longlong *)(lVar2 + 0x22c8) +
   (longlong)((int)((ulonglong)(param_1 - *(longlong *)(lVar2 + 0x22a0)) >> 4) * -0x6eb3e453) * 4) =
       0xbf800000;
  if (_DAT_7ff70cbebd80 == (uStack_18 ^ (ulonglong)auStack_38)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_18 ^ (ulonglong)auStack_38);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


