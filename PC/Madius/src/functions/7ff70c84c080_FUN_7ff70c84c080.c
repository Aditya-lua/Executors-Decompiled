/* 7ff70c84c080 FUN_7ff70c84c080 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c84c080(void)

{
  code *pcVar1;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x1130));
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


