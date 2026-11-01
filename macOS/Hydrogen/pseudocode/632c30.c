
void FUN_00632c30(ulong param_1)

{
  long *plVar1;
  long in_x9;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  long in_stack_00000008;
  long in_stack_00000018;
  
  do {
    param_1 = param_1 - 1;
    if (param_1 == 0) {
      do {
        func_0x00611644();
        do {
          func_0x0064f6d0(unaff_x19);
          if (in_stack_00000018 == unaff_x20) {
            if (in_stack_00000008 != 0) {
              __ZdlPv();
            }
            return;
          }
          unaff_x19 = in_stack_00000018 + -0xa0;
          *(undefined8 *)(in_stack_00000018 + -0x30) = unaff_x21;
          plVar1 = (long *)(in_stack_00000018 + -0x10);
          param_1 = *(ulong *)(in_stack_00000018 + -0x20);
          if (*(ulong *)(in_stack_00000018 + -0x18) <= *(ulong *)(in_stack_00000018 + -0x20)) {
            param_1 = *(ulong *)(in_stack_00000018 + -0x18);
          }
          in_stack_00000018 = unaff_x19;
        } while (*plVar1 == 0);
      } while (param_1 == 0);
      in_x9 = *plVar1 + -8;
    }
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
  } while( true );
}

