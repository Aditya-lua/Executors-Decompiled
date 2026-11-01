
void FUN_0013b204(long *param_1,long param_2)

{
  long unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  long in_stack_00000010;
  long *in_stack_00000020;
  undefined1 uStack0000000000000038;
  undefined8 in_stack_00000040;
  
  do {
    param_1[-2] = param_2;
    __ZdlPv();
    do {
      param_1 = unaff_x20;
      if (param_1 == unaff_x21) {
        *(long **)(unaff_x19 + 0x10) = unaff_x21;
        *(undefined1 *)(unaff_x19 + 0x5d) = 1;
        while (in_stack_00000020 != (long *)0x0) {
          in_stack_00000020 = (long *)*in_stack_00000020;
          __ZdlPv();
        }
        if (in_stack_00000010 != 0) {
          __ZdlPv();
        }
        func_0x0014a65c(&uStack0000000000000038,in_stack_00000040);
        return;
      }
      unaff_x20 = param_1 + -3;
      param_2 = *unaff_x20;
    } while (param_2 == 0);
  } while( true );
}

