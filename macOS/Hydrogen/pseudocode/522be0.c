
undefined8 FUN_00522be0(long param_1)

{
  undefined1 auVar1 [16];
  code *pcVar2;
  undefined8 uVar3;
  long in_x9;
  undefined8 *puVar4;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  long unaff_x29;
  undefined1 auVar5 [16];
  long in_stack_00000060;
  undefined8 in_stack_00000068;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  undefined8 uStack00000000000000e0;
  
  auVar1._8_8_ = unaff_x25;
  auVar1._0_8_ = unaff_x26;
  auVar5 = (**(code **)(param_1 + 0x18))
                     (in_x9 + (*(long *)(param_1 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
  if (auVar5 != auVar1) {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x523028);
    (*pcVar2)();
  }
  func_0x00525f7c(unaff_x29 + -0x70,&uStack00000000000000e0,8,0);
  uVar3 = func_0x0051c7e8();
  if (in_stack_00000060 != 0) {
    func_0x00187bd4(in_stack_00000068,in_stack_00000060 << 4,8);
  }
  if (in_stack_00000088 != 0) {
    puVar4 = (undefined8 *)(in_stack_00000080 + 8);
    do {
      if (puVar4[-1] != 0) {
        func_0x00187bd4(*puVar4,puVar4[-1] << 4,8);
      }
      puVar4 = puVar4 + 3;
      in_stack_00000088 = in_stack_00000088 + -1;
    } while (in_stack_00000088 != 0);
  }
  if (in_stack_00000078 != 0) {
    func_0x00187bd4(in_stack_00000080,in_stack_00000078 * 0x18,8);
  }
  return uVar3;
}

