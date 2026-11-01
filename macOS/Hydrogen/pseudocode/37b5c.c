
undefined8 FUN_00037b5c(void)

{
  long unaff_x29;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000070;
  undefined8 uStack0000000000000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  
  func_0x006bd97c(&uStack0000000000000078,&uStack0000000000000060);
  if (*(char *)(unaff_x29 + -0x30) != '\0') {
    if (*(long *)(unaff_x29 + -0x50) != 0) {
      *(long *)(unaff_x29 + -0x48) = *(long *)(unaff_x29 + -0x50);
      __ZdlPv();
    }
    if (*(long *)(unaff_x29 + -0x78) != 0) {
      __ZdlPv();
    }
  }
  if (in_stack_00000070._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000060);
  }
  func_0x00700e1c();
  func_0x006e1e34();
  func_0x006e1e44();
  if (in_stack_00000088._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000078);
    return 1;
  }
  return 1;
}

