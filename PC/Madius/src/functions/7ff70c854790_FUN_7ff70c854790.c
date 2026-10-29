/* 7ff70c854790 FUN_7ff70c854790 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c854790(void)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if ((*(char *)(_DAT_7ff70cc1a3c0 + 0x2029) == '\x01') &&
     (*(int *)(_DAT_7ff70cc1a3c0 + 0x2078) == 0)) {
    uVar2 = CONCAT71((int7)((ulonglong)_DAT_7ff70cc1a3c0 >> 8),
                     *(int *)(_DAT_7ff70cc1a3c0 + 0x20e8) == 0);
  }
  else {
    uVar2 = 0;
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return uVar2;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  uVar2 = (*pcVar1)();
  return uVar2;
}


