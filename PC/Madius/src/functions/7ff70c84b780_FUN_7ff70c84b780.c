/* 7ff70c84b780 FUN_7ff70c84b780 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c84b780(float param_1)

{
  longlong lVar1;
  code *pcVar2;
  longlong lVar3;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  lVar3 = _DAT_7ff70cc1a3c0;
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  lVar1 = *(longlong *)(lVar3 + 0x1440);
  if ((param_1 == 0.0) && (!NAN(param_1))) {
    param_1 = *(float *)(lVar3 + 0xcbc);
  }
  param_1 = *(float *)(lVar1 + 0x15c) - param_1;
  *(float *)(lVar1 + 0x15c) = param_1;
  *(float *)(lVar1 + 0x118) = param_1 + *(float *)(lVar1 + 0x28) + *(float *)(lVar1 + 0x160);
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


