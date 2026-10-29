/* 7ff70c84b370 FUN_7ff70c84b370 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c84b370(undefined8 *param_1)

{
  longlong lVar1;
  code *pcVar2;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  lVar1 = _DAT_7ff70cc1a3c0;
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  lVar1 = *(longlong *)(lVar1 + 0x1440);
  *(undefined8 *)(lVar1 + 0x118) = *param_1;
  *(undefined1 *)(lVar1 + 0x159) = 1;
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


