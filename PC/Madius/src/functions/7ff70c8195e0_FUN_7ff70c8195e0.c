/* 7ff70c8195e0 FUN_7ff70c8195e0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c8195e0(void)

{
  code *pcVar1;
  longlong lVar2;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  lVar2 = 0;
  if (*(char *)(**(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88) + 0x58) != '\0') {
    lVar2 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88) + 0x58;
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return lVar2;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  lVar2 = (*pcVar1)();
  return lVar2;
}


