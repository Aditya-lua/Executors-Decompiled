/* 7ff70ca007a0 FUN_7ff70ca007a0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70ca007a0(void)

{
  code *pcVar1;
  undefined1 auStack_48 [40];
  undefined *puStack_20;
  undefined *puStack_18;
  undefined8 uStack_10;
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  uStack_10 = 0;
  puStack_18 = &UNK_7ff70cb85489;
  puStack_20 = &UNK_7ff70cb74098;
  FUN_7ff70cb12a50(&puStack_20,&UNK_7ff70cbd1850);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


