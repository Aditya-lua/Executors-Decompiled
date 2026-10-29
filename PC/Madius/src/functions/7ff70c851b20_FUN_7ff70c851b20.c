/* 7ff70c851b20 FUN_7ff70c851b20 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c851b20(longlong param_1,uint param_2)

{
  code *pcVar1;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if (((*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98) == param_1) &&
      (*(char *)(_DAT_7ff70cc1a3c0 + 0x2029) == '\x01')) &&
     (*(int *)(_DAT_7ff70cc1a3c0 + 0x1fa4) == 0)) {
    *(uint *)(_DAT_7ff70cc1a3c0 + 0x202c) =
         *(uint *)(_DAT_7ff70cc1a3c0 + 0x202c) & 0xfffffff0 | param_2;
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


