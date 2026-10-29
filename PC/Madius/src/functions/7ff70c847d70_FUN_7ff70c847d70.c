/* 7ff70c847d70 FUN_7ff70c847d70 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c847d70(int param_1,float param_2)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  if (param_2 < 0.0) {
    param_2 = *(float *)(_DAT_7ff70cc1a3c0 + 0x70);
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return CONCAT71((int7)((ulonglong)_DAT_7ff70cc1a3c0 >> 8),
                    param_2 * param_2 <=
                    *(float *)(_DAT_7ff70cc1a3c0 + 0xb94 + (longlong)param_1 * 4));
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  uVar2 = (*pcVar1)();
  return uVar2;
}


