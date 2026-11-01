
undefined8 FUN_00081024(void)

{
  undefined8 uVar1;
  undefined8 *unaff_x23;
  long unaff_x29;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000050;
  undefined1 uStack0000000000000060;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000088;
  
  uStack0000000000000038 = unaff_x23[1];
  _uStack0000000000000030 = *unaff_x23;
  uStack0000000000000040 = unaff_x23[2];
  func_0x0000a968();
  func_0x000804dc(&uStack0000000000000018);
  func_0x00080294(&uStack0000000000000050,0x65,&uStack0000000000000030,&uStack0000000000000018,0);
  uVar1 = func_0x00081674();
  uStack0000000000000050 = &UNK_009b9460;
  __ZNSt13runtime_errorD1Ev(&uStack0000000000000060);
  __ZNSt9exceptionD2Ev(&uStack0000000000000050);
  if (in_stack_00000028._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000018);
  }
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
  if (in_stack_00000088._7_1_ < '\0') {
    __ZdlPv(in_stack_00000078);
  }
  if (*(long *)(unaff_x29 + -0x70) != 0) {
    __ZdlPv();
  }
  return uVar1;
}

