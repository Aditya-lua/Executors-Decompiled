
void FUN_0065e980(code *param_1)

{
  long *plVar1;
  long *plVar2;
  undefined8 uVar3;
  long *unaff_x19;
  long *unaff_x20;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  
  plVar1 = (long *)(*param_1)();
  plVar1 = (long *)((long)plVar1 + *(long *)(*plVar1 + -0x70));
  plVar2 = (long *)(**(code **)(*unaff_x20 + 0x10))();
  (**(code **)(*plVar1 + 0x18))(plVar1,(long)plVar2 + *(long *)(*plVar2 + -0x70));
  plVar1 = (long *)(**(code **)(*unaff_x20 + 0x10))();
  uVar3 = (**(code **)(*unaff_x20 + 0x20))();
  (**(code **)(*plVar1 + 0x78))(plVar1,uVar3);
  (**(code **)(*unaff_x19 + 0x28))();
  if (in_stack_00000038 <= in_stack_00000030) {
    in_stack_00000030 = in_stack_00000038;
  }
  if (in_stack_00000040 != 0) {
    if (in_stack_00000030 != 0) {
      do {
        *(undefined8 *)(in_stack_00000040 + -8 + in_stack_00000030 * 8) = 0;
        in_stack_00000030 = in_stack_00000030 - 1;
      } while (in_stack_00000030 != 0);
    }
    func_0x00611644();
  }
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
  return;
}

