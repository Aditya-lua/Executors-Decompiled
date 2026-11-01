
long FUN_00667464(long param_1)

{
  undefined8 uVar1;
  ulong uVar2;
  long unaff_x19;
  long *plVar3;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  
  uVar1 = (**(code **)(param_1 + 0x98))();
  func_0x005ffccc(&uStack0000000000000030,uVar1);
  plVar3 = *(long **)(unaff_x19 + 0x10);
  uVar1 = (**(code **)(*plVar3 + 0x90))(plVar3,&uStack0000000000000030);
  uVar1 = (**(code **)(*plVar3 + 0x40))(plVar3,uVar1);
  (**(code **)(*plVar3 + 0x40))(plVar3,uVar1);
  func_0x005fe0b4();
  plVar3 = *(long **)(unaff_x19 + 0x10);
  uVar1 = (**(code **)(*plVar3 + 0x40))(plVar3);
  uVar1 = (**(code **)(*plVar3 + 0x80))(plVar3,&uStack0000000000000030,uVar1);
  uVar1 = (**(code **)(*plVar3 + 0x40))(plVar3,uVar1);
  func_0x005ffccc(unaff_x19 + 0xb0,uVar1);
  func_0x00600180(unaff_x19 + 0x80);
  *(undefined1 *)(unaff_x19 + 0xe0) = 0;
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
  uVar2 = in_stack_00000040;
  if (in_stack_00000048 <= in_stack_00000040) {
    uVar2 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  return unaff_x19 + 0x78;
}

