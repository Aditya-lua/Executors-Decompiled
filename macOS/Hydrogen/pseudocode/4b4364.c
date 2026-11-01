
undefined8 FUN_004b4364(undefined8 param_1)

{
  undefined8 uVar1;
  char *unaff_x19;
  char in_wzr;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  
  _uStack0000000000000008 = param_1;
  func_0x004653b0(&uStack0000000000000010,&UNK_008a1732,4,&uStack0000000000000008,&UNK_009e5218);
  uVar1 = func_0x00465628();
  if (*unaff_x19 == '\x01') {
    *unaff_x19 = in_wzr;
  }
  else {
    func_0x007b05dc();
  }
  return uVar1;
}

