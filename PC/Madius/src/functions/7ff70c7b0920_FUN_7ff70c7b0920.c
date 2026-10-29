/* 7ff70c7b0920 FUN_7ff70c7b0920 */

void FUN_7ff70c7b0920(void)

{
  code *pcVar1;
  undefined *puStack_18;
  undefined8 uStack_10;
  undefined8 uStack_8;
  
  uStack_10 = 0;
  uStack_8 = 0;
  puStack_18 = &UNK_7ff70cb150f8;
  FUN_7ff70cb12a50(&puStack_18,&UNK_7ff70cb9fe20);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


