/* 7ff70c847de0 FUN_7ff70c847de0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c847de0(int param_1,float param_2)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if (*(char *)(_DAT_7ff70cc1a3c0 + 0xe8 + (longlong)param_1) == '\x01') {
    if (param_2 < 0.0) {
      param_2 = *(float *)(_DAT_7ff70cc1a3c0 + 0x70);
    }
    uVar2 = CONCAT71((int7)((ulonglong)_DAT_7ff70cc1a3c0 >> 8),
                     param_2 * param_2 <=
                     *(float *)(_DAT_7ff70cc1a3c0 + 0xb94 + (longlong)param_1 * 4));
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


