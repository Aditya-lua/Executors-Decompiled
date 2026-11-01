
undefined8 FUN_0076930c(void)

{
  int in_w8;
  code *pcVar1;
  long unaff_x19;
  long unaff_x20;
  
  if (in_w8 != 0xd) {
    *(undefined4 *)(unaff_x19 + 0x60) = 0xd;
  }
  *(long *)(unaff_x19 + 0x18) = unaff_x20;
  func_0x0075e474(unaff_x20 + 0x3c8);
  if ((*(long *)(unaff_x20 + 0x3a0) != 0) &&
     (pcVar1 = *(code **)(*(long *)(unaff_x20 + 0x3a0) + 0x80), pcVar1 != (code *)0x0)) {
    (*pcVar1)();
  }
  *(uint *)(unaff_x19 + 0x134) = *(uint *)(unaff_x19 + 0x134) | 1;
  return 0;
}

