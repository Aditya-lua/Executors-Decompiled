
void FUN_005a3244(undefined8 param_1,long param_2)

{
  undefined8 *puVar1;
  long *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  undefined8 *unaff_x24;
  undefined8 unaff_x25;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined1 uStack0000000000000020;
  undefined8 *in_stack_00000028;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  
  while( true ) {
    uStack0000000000000050 = param_1;
    if (unaff_x20 == uStack0000000000000008) {
      func_0x007af5a0(&uStack0000000000000008,unaff_x20,(unaff_x22 >> 4) + 1,8,0x18);
      param_2 = in_stack_00000010;
    }
    puVar1 = (undefined8 *)(param_2 + unaff_x23);
    puVar1[2] = in_stack_00000058;
    unaff_x20 = unaff_x20 + 1;
    puVar1[1] = uStack0000000000000050;
    *puVar1 = unaff_x25;
    unaff_x23 = unaff_x23 + 0x18;
    unaff_x22 = unaff_x22 - 0x10;
    in_stack_00000018 = unaff_x20;
    if (unaff_x24 == unaff_x21) break;
    param_1 = *unaff_x24;
    unaff_x24 = unaff_x24 + 2;
  }
  in_stack_00000028 = unaff_x24;
  func_0x005d809c(&uStack0000000000000020);
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = uStack0000000000000008;
  unaff_x19[2] = in_stack_00000018;
  return;
}

