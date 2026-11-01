
undefined1  [16] FUN_0044efd4(void)

{
  undefined *puVar1;
  undefined *puVar2;
  int in_w8;
  int in_w9;
  undefined1 auVar3 [16];
  
  if (in_w8 == in_w9) {
    puVar1 = &UNK_008905e0;
    puVar2 = (undefined *)0x10;
  }
  else {
    puVar2 = (undefined *)0x10;
    if (in_w8 != 0x4105) {
      puVar2 = &UNK_008905f0;
    }
    puVar1 = &UNK_008905f0;
    if (in_w8 != 0x4105) {
      puVar1 = (undefined *)0x0;
    }
  }
  auVar3._8_8_ = puVar2;
  auVar3._0_8_ = puVar1;
  return auVar3;
}

