
undefined8 FUN_00052ff4(void)

{
  long lVar1;
  undefined1 unaff_w19;
  undefined8 in_stack_00000010;
  long in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000038;
  
  lVar1 = func_0x0005290c(0xa33390,&uStack0000000000000028);
  if (lVar1 != 0) {
    **(undefined1 **)(lVar1 + 0x28) = unaff_w19;
  }
  if (in_stack_00000020 < 0) {
    __ZdlPv(in_stack_00000010);
  }
  if (in_stack_00000038._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000028);
  }
  return 0;
}

