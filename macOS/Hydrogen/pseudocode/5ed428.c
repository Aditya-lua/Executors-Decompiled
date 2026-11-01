
undefined8 FUN_005ed428(void)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  
  while( true ) {
    uVar1 = func_0x0046849c(*unaff_x19,unaff_x19[1],&uStack0000000000000010);
    if ((uVar1 & 1) != 0) {
      return 1;
    }
    unaff_x22 = unaff_x22 + 1;
    if (unaff_x22 == unaff_x23) break;
    uStack0000000000000010 = unaff_x27;
    in_stack_00000018 = unaff_x25;
    in_stack_00000020 = unaff_x26;
    in_stack_00000028 = unaff_x25;
    in_stack_00000030 = unaff_x21;
    in_stack_00000038 = unaff_x25;
    in_stack_00000040 = unaff_x24;
    in_stack_00000048 = unaff_x20;
  }
  uVar2 = func_0x0046a9ac();
  return uVar2;
}

