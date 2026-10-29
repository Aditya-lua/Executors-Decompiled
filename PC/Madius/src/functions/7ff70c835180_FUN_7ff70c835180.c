/* 7ff70c835180 FUN_7ff70c835180 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c835180(void)

{
  code *pcVar1;
  undefined7 uVar3;
  undefined8 uVar2;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  uVar3 = (undefined7)(uStack_8 >> 8);
  uVar2 = CONCAT71(uVar3,1);
  if (*(int *)(_DAT_7ff70cc1a3c0 + 0x149c) == 0) {
    uVar2 = CONCAT71(uVar3,*(int *)(_DAT_7ff70cc1a3c0 + 0x14a0) != 0);
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return uVar2;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar1 = (code *)swi(3);
  uVar2 = (*pcVar1)();
  return uVar2;
}


