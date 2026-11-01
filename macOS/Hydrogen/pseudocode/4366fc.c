
void FUN_004366fc(long param_1)

{
  long unaff_x20;
  long unaff_x21;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  
  while (unaff_x21 != unaff_x20) {
    uStack0000000000000018 = param_1;
    func_0x00465960(&uStack0000000000000008,&uStack0000000000000018);
    param_1 = param_1 + 0x10;
    unaff_x21 = param_1;
  }
  func_0x00465c80(&uStack0000000000000008);
  return;
}

