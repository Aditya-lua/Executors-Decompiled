
undefined4 FUN_00128adc(void)

{
  long unaff_x20;
  int unaff_w22;
  long unaff_x23;
  undefined4 unaff_w24;
  long unaff_x27;
  undefined8 in_stack_00000018;
  ulong in_stack_00000028;
  undefined8 in_stack_00000048;
  char in_stack_00000050;
  
  if ((((in_stack_00000048._6_1_ != '\0') && (*(int *)(&UNK_00004050 + unaff_x27) == unaff_w22)) &&
      (in_stack_00000050 == '\0')) &&
     (((*(byte *)(unaff_x20 + 0x10) >> 5 & 1) == 0 && ((*(byte *)(unaff_x23 + 4) >> 4 & 1) == 0))))
  {
    func_0x000bc0e8();
    func_0x000d9148("%.*s");
  }
  if ((in_stack_00000028 & 0x20000000000000) != 0) {
    unaff_w24 = in_stack_00000018._4_4_;
  }
  return unaff_w24;
}

