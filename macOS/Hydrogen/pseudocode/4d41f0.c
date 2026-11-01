
void FUN_004d41f0(long param_1,undefined8 param_2)

{
  long lVar1;
  long unaff_x20;
  undefined8 *puVar2;
  undefined8 *unaff_x21;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  long in_stack_00000088;
  long in_stack_000000a0;
  long in_stack_000000a8;
  
  do {
    func_0x00187bd4(param_2,param_1 << 3,8);
    puVar2 = unaff_x21;
    do {
      unaff_x21 = puVar2 + 3;
      unaff_x20 = unaff_x20 + -1;
      if (unaff_x20 == 0) {
        if (in_stack_00000088 != 0) {
          func_0x00187bd4();
        }
        if ((in_stack_000000a8 != 0) && (lVar1 = in_stack_000000a8 * 0x11 + 0x19, lVar1 != 0)) {
          func_0x00187bd4(in_stack_000000a0 + in_stack_000000a8 * -0x10 + -0x10,lVar1,8);
        }
        if (in_stack_00000030 != 0) {
          func_0x00187bd4(in_stack_00000038,in_stack_00000030 << 2,4);
        }
        return;
      }
      param_1 = puVar2[2];
      puVar2 = unaff_x21;
    } while (param_1 == 0);
    param_2 = *unaff_x21;
  } while( true );
}

