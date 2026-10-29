/* 7ff70c83da20 FUN_7ff70c83da20 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c83da20(undefined8 *param_1,undefined8 *param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  code *pcVar2;
  longlong lVar3;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  lVar3 = _DAT_7ff70cc1a3c0;
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) | 0x10;
  uVar1 = *param_2;
  *(undefined8 *)(lVar3 + 0x1eb4) = *param_1;
  *(undefined8 *)(lVar3 + 0x1ebc) = uVar1;
  *(undefined8 *)(lVar3 + 0x1ec8) = param_3;
  *(undefined8 *)(lVar3 + 0x1ed0) = param_4;
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


