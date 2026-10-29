/* 7ff70c910500 FUN_7ff70c910500 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c910500(longlong param_1)

{
  code *pcVar1;
  undefined1 auStack_38 [40];
  ulonglong uStack_10;
  
  uStack_10 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  FUN_7ff70c7b6d40(param_1 + 0x28);
  *(undefined4 *)(param_1 + 4) = 0xbf800000;
  if (_DAT_7ff70cbebd80 == (uStack_10 ^ (ulonglong)auStack_38)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_10 ^ (ulonglong)auStack_38);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


