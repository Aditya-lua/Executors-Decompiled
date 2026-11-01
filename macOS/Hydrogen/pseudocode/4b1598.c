
void FUN_004b1598(void)

{
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000018;
  
  do {
    _uStack0000000000000018 = unaff_x19;
    func_0x00465960(&uStack0000000000000008,&uStack0000000000000018,unaff_x20 + 0xab0);
    unaff_x21 = unaff_x21 + -0x80;
    unaff_x19 = unaff_x19 + 0x80;
  } while (unaff_x21 != 0);
  func_0x00465c80(&uStack0000000000000008);
  return;
}

