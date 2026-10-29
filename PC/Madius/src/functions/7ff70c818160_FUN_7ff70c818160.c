/* 7ff70c818160 FUN_7ff70c818160 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c818160(int param_1)

{
  code *pcVar1;
  longlong lVar2;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  lVar2 = _DAT_7ff70cc1a3c0;
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  *(int *)(_DAT_7ff70cc1a3c0 + 0x149c) = param_1;
  *(undefined1 *)(lVar2 + 0x14b0) = 0;
  if ((param_1 != 0) && (*(int *)(lVar2 + 0x14a0) != param_1)) {
    *(undefined8 *)(lVar2 + 0x14a8) = 0;
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


