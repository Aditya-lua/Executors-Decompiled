
undefined8 FUN_007573fc(void)

{
  ulong uVar1;
  undefined1 *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x25;
  undefined1 auVar2 [16];
  
  uVar1 = func_0x007718a8();
  if ((uVar1 & 1) != 0) {
    *(undefined4 *)(unaff_x25 + 0x30) = 1;
    auVar2 = func_0x00782d28();
    *(undefined1 (*) [16])(unaff_x25 + 0x20) = auVar2;
    func_0x00768170();
    *(uint *)(unaff_x21 + 0x134) = *(uint *)(unaff_x21 + 0x134) & 0xfffffffd | 0x40;
  }
  *unaff_x20 = 0;
  *unaff_x19 = 0;
  return 0;
}

