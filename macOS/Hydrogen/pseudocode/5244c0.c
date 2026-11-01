
void FUN_005244c0(void)

{
  undefined1 in_ZR;
  long unaff_x19;
  long unaff_x21;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  
  while (!(bool)in_ZR) {
    uStack0000000000000018 = unaff_x19;
    func_0x00465960(&uStack0000000000000008,&uStack0000000000000018);
    unaff_x21 = unaff_x21 + -0x20;
    unaff_x19 = unaff_x19 + 0x20;
    in_ZR = unaff_x21 == 0;
  }
  func_0x00465c80(&uStack0000000000000008);
  return;
}

