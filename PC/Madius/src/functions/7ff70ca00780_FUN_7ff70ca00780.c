/* 7ff70ca00780 FUN_7ff70ca00780 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70ca00780(void)

{
  code *pcVar1;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  FUN_7ff70cb12520(&UNK_7ff70cb8576a);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


