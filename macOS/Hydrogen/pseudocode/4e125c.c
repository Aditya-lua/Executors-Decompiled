
void FUN_004e125c(void)

{
  long unaff_x21;
  long unaff_x22;
  long lVar1;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  
  while( true ) {
    lVar1 = unaff_x22;
    func_0x00465960(&uStack0000000000000008,&uStack0000000000000018);
    unaff_x21 = unaff_x21 + -0x20;
    if (unaff_x21 == 0) break;
    unaff_x22 = lVar1 + 0x20;
    uStack0000000000000018 = lVar1;
  }
  func_0x00465c80(&uStack0000000000000008);
  return;
}

