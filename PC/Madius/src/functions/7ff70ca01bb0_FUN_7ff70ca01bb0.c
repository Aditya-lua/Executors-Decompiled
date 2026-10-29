/* 7ff70ca01bb0 FUN_7ff70ca01bb0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70ca01bb0(void)

{
  code *pcVar1;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  FUN_7ff70cb12530(&UNK_7ff70cb843c2);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


