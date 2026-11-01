
long FUN_006652f0(void)

{
  long lVar1;
  undefined8 uVar2;
  long unaff_x19;
  long *plVar3;
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  long in_stack_00000018;
  
  func_0x00677180();
  uVar2 = (**(code **)(**(long **)(unaff_x19 + 0x10) + 0x90))();
  lVar1 = unaff_x19 + 0x60;
  func_0x00677180(lVar1,uVar2);
  (**(code **)(**(long **)(unaff_x19 + 0x10) + 0x48))(*(long **)(unaff_x19 + 0x10),lVar1);
  (**(code **)(**(long **)(unaff_x19 + 0x10) + 0x48))
            (*(long **)(unaff_x19 + 0x10),lVar1,unaff_x19 + 0x18);
  plVar3 = *(long **)(unaff_x19 + 0x10);
  (**(code **)(*plVar3 + 0x80))(plVar3);
  (**(code **)(*plVar3 + 0x48))(plVar3);
  (**(code **)(**(long **)(unaff_x19 + 0x10) + 0x48))();
  *(undefined1 *)(unaff_x19 + 0xa0) = 0;
  if (in_stack_00000010 <= in_stack_00000008) {
    in_stack_00000008 = in_stack_00000010;
  }
  if (in_stack_00000018 != 0) {
    if (in_stack_00000008 != 0) {
      do {
        *(undefined8 *)(in_stack_00000018 + -8 + in_stack_00000008 * 8) = 0;
        in_stack_00000008 = in_stack_00000008 - 1;
      } while (in_stack_00000008 != 0);
    }
    func_0x00611644();
  }
  return unaff_x19 + 0x58;
}

