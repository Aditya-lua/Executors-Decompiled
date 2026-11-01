
void FUN_0004b0b4(undefined8 param_1)

{
  long *unaff_x19;
  long unaff_x29;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  long in_stack_00000068;
  
  func_0x0003fcac(param_1,"Terminator");
  (**(code **)(*unaff_x19 + 0x58))();
  if (in_stack_00000028 <= in_stack_00000020) {
    in_stack_00000020 = in_stack_00000028;
  }
  if (in_stack_00000030 != 0) {
    if (in_stack_00000020 != 0) {
      do {
        *(undefined1 *)(in_stack_00000030 + -1 + in_stack_00000020) = 0;
        in_stack_00000020 = in_stack_00000020 - 1;
      } while (in_stack_00000020 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000060 <= in_stack_00000058) {
    in_stack_00000058 = in_stack_00000060;
  }
  if (in_stack_00000068 != 0) {
    if (in_stack_00000058 != 0) {
      do {
        *(undefined1 *)(in_stack_00000068 + -1 + in_stack_00000058) = 0;
        in_stack_00000058 = in_stack_00000058 - 1;
      } while (in_stack_00000058 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(unaff_x29 + -0x60) = &UNK_009f6820;
  if (*(long **)(unaff_x29 + -0x58) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x29 + -0x58) + 8))();
  }
  return;
}

