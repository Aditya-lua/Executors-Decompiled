
undefined8 FUN_00787ec0(undefined8 param_1)

{
  long unaff_x19;
  undefined8 uStack0000000000000008;
  char *pcStack0000000000000010;
  
  pcStack0000000000000010 = "";
  if ((*(uint *)(&UNK_00001344 + unaff_x19) & 8) != 0) {
    pcStack0000000000000010 = " (in redirect)";
  }
  uStack0000000000000008 = param_1;
  func_0x0073c9e4();
  return 1;
}

