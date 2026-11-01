
undefined1  [16] FUN_0044f89c(void)

{
  bool in_ZR;
  undefined *puVar1;
  undefined *puVar2;
  int in_w8;
  undefined1 auVar3 [16];
  
  if (in_ZR) {
    puVar1 = &UNK_0088c8df;
    puVar2 = (undefined *)0x18;
  }
  else {
    puVar2 = (undefined *)0xf;
    if (in_w8 != 0x3a00) {
      puVar2 = &UNK_0088c8f7;
    }
    puVar1 = &UNK_0088c8f7;
    if (in_w8 != 0x3a00) {
      puVar1 = (undefined *)0x0;
    }
  }
  auVar3._8_8_ = puVar2;
  auVar3._0_8_ = puVar1;
  return auVar3;
}

