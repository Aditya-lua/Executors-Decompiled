
void FUN_004d43d8(long param_1)

{
  long lVar1;
  long unaff_x20;
  long unaff_x21;
  undefined8 *puVar2;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  long in_stack_00000088;
  long in_stack_000000a0;
  long in_stack_000000a8;
  
  do {
    if (param_1 != 0) {
      func_0x00187bd4();
    }
    if ((in_stack_000000a8 != 0) && (lVar1 = in_stack_000000a8 * 0x11 + 0x19, lVar1 != 0)) {
      func_0x00187bd4(in_stack_000000a0 + in_stack_000000a8 * -0x10 + -0x10,lVar1,8);
    }
    if (in_stack_00000030 != 0) {
      func_0x00187bd4(in_stack_00000038,in_stack_00000030 << 2,4);
    }
    __Unwind_Resume();
    puVar2 = (undefined8 *)(unaff_x20 + 8);
    do {
      if (puVar2[-1] != 0) {
        func_0x00187bd4(*puVar2,puVar2[-1] << 3,8);
      }
      puVar2 = puVar2 + 3;
      unaff_x21 = unaff_x21 + -1;
    } while (unaff_x21 != 0);
    param_1 = in_stack_00000088;
  } while( true );
}

