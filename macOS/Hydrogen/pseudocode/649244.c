
undefined8 FUN_00649244(void)

{
  long *plVar1;
  undefined8 uVar2;
  ulong uVar3;
  code *in_x9;
  long *unaff_x20;
  long *unaff_x22;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  undefined *in_stack_00000060;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  
  (*in_x9)();
  plVar1 = (long *)(**(code **)(*unaff_x22 + 0x80))();
  uVar2 = (**(code **)(*unaff_x22 + 0x88))();
  (**(code **)(*plVar1 + 0x18))(plVar1,uVar2,&uStack0000000000000030);
  (**(code **)(*unaff_x20 + 200))();
  if (in_stack_00000018 <= in_stack_00000010) {
    in_stack_00000010 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (in_stack_00000010 != 0) {
      do {
        *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
        in_stack_00000010 = in_stack_00000010 - 1;
      } while (in_stack_00000010 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000030 = &UNK_009f5d60;
  uVar3 = in_stack_00000040;
  if (in_stack_00000048 <= in_stack_00000040) {
    uVar3 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  in_stack_00000060 = &UNK_009f5d60;
  uVar3 = in_stack_00000070;
  if (in_stack_00000078 <= in_stack_00000070) {
    uVar3 = in_stack_00000078;
  }
  if (in_stack_00000080 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_00000080 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  return 1;
}

