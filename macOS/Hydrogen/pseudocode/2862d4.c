
undefined * FUN_002862d4(void)

{
  undefined *puVar1;
  byte *unaff_x19;
  byte *unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x29;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000020;
  
  if ((unaff_x22 & 0xf) != 0) {
    uStack0000000000000010 = 0;
    in_stack_00000018 = 0;
    ___memcpy_chk(&uStack0000000000000010,unaff_x24 + unaff_x25,unaff_x22 & 0xf,0x10);
    func_0x002f52c0(&uStack0000000000000020,&uStack0000000000000010,0x10);
  }
  func_0x002f52c0(&uStack0000000000000020);
  if ((unaff_x21 & 0xf) != 0) {
    uStack0000000000000010 = 0;
    in_stack_00000018 = 0;
    ___memcpy_chk(&uStack0000000000000010,unaff_x23 + (unaff_x21 & 0xfffffffffffffff0),
                  unaff_x21 & 0xf,0x10);
    func_0x002f52c0(&uStack0000000000000020,&uStack0000000000000010,0x10);
  }
  func_0x002f52c0(&uStack0000000000000020);
  puVar1 = (undefined *)func_0x002f53b8(&uStack0000000000000020);
  *unaff_x19 = *unaff_x19 ^ *unaff_x20;
  unaff_x19[1] = unaff_x19[1] ^ unaff_x20[1];
  unaff_x19[2] = unaff_x19[2] ^ unaff_x20[2];
  unaff_x19[3] = unaff_x19[3] ^ unaff_x20[3];
  unaff_x19[4] = unaff_x19[4] ^ unaff_x20[4];
  unaff_x19[5] = unaff_x19[5] ^ unaff_x20[5];
  unaff_x19[6] = unaff_x19[6] ^ unaff_x20[6];
  unaff_x19[7] = unaff_x19[7] ^ unaff_x20[7];
  unaff_x19[8] = unaff_x19[8] ^ unaff_x20[8];
  unaff_x19[9] = unaff_x19[9] ^ unaff_x20[9];
  unaff_x19[10] = unaff_x19[10] ^ unaff_x20[10];
  unaff_x19[0xb] = unaff_x19[0xb] ^ unaff_x20[0xb];
  unaff_x19[0xf] = unaff_x19[0xf] & 0x7f;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return puVar1;
  }
  ___stack_chk_fail();
  return &UNK_009cde48;
}

