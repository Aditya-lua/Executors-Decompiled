/* 7ff70c854720 FUN_7ff70c854720 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c854720(void)

{
  code *pcVar1;
  bool bVar2;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if (*(longlong *)(_DAT_7ff70cc1a3c0 + 0x2278) == 0) {
    bVar2 = *(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x1c8) == 0;
  }
  else {
    bVar2 = false;
  }
  *(bool *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x178) = bVar2;
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


