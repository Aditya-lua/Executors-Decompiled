
undefined8 * FUN_0004a22c(void)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  long unaff_x20;
  
  puVar1 = (undefined8 *)__Znwm();
  uVar2 = *(undefined8 *)(unaff_x20 + 8);
  *puVar1 = &UNK_009b70d8;
  puVar1[1] = uVar2;
  func_0x00049128(puVar1 + 2,unaff_x20 + 0x10);
  *puVar1 = &UNK_009b6ff8;
  func_0x00049128(puVar1 + 0xe,unaff_x20 + 0x70);
  *puVar1 = &UNK_009b6ea0;
  return puVar1;
}

