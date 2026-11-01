
undefined8 FUN_002b4170(void)

{
  byte bVar1;
  undefined8 uVar2;
  long unaff_x19;
  int unaff_w20;
  uint *unaff_x21;
  long in_stack_00000028;
  
  uVar2 = func_0x00383020();
  *(undefined **)(unaff_x19 + 0x100) = &DAT_00383280;
  *(undefined **)(unaff_x19 + 0x108) = &DAT_003832f0;
  bVar1 = 0;
  if (unaff_w20 != 0) {
    bVar1 = (byte)(*unaff_x21 >> 5) & 1;
  }
  *(byte *)(unaff_x19 + 0x118) = *(byte *)(unaff_x19 + 0x118) & 0xfe | bVar1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000028) {
    return uVar2;
  }
  ___stack_chk_fail();
  func_0x00373e9c(0xa29668,&DAT_002b4228);
  return 0xa3a880;
}

