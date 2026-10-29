/* 7ff70c8582b0 FUN_7ff70c8582b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8582b0(void)

{
  code *pcVar1;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if (*(float *)(_DAT_7ff70cc1a3c0 + 0x2674) <= 0.0) {
    *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2674) = *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x24);
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


