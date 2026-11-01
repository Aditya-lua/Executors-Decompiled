
void FUN_0042a3e0(void)

{
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  
  _memcpy(&uStack0000000000000008);
  *(undefined1 *)(unaff_x21 + unaff_x20) = 0;
  func_0x00462a54(unaff_x29 + -0x38,&uStack0000000000000008,unaff_x20 + 1);
  if (*(int *)(unaff_x29 + -0x38) == 1) {
    *unaff_x19 = 0x8000000000000000;
    unaff_x19[1] = &UNK_009dae48;
  }
  else {
    func_0x00432218();
  }
  return;
}

