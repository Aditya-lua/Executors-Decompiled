
undefined8 FUN_004ef6f4(long param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  undefined1 auVar2 [16];
  code *pcVar3;
  bool in_CY;
  undefined8 uVar4;
  long unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  long unaff_x29;
  undefined1 auVar5 [16];
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000020;
  
  auVar2._8_8_ = unaff_x25;
  auVar2._0_8_ = unaff_x26;
  if (in_CY) {
    func_0x007a2570(param_2,param_3,&UNK_009e9b68);
  }
  else {
    param_1 = *(long *)(unaff_x24 + 0x100) + param_1;
    lVar1 = *(long *)(param_1 + -0x18);
    auVar5 = (**(code **)(lVar1 + 0x18))
                       (*(long *)(param_1 + -0x20) +
                        (*(long *)(lVar1 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
    if (auVar5 == auVar2) {
      func_0x00525f7c(unaff_x29 + -0x70,&uStack0000000000000020,8,0);
      uVar4 = func_0x0051c36c();
      if ((*(ulong *)(unaff_x29 + -0x88) | 0x8000000000000000) != 0x8000000000000000) {
        func_0x00187bd4();
      }
      if (in_stack_00000008 != 0) {
        func_0x00187bd4(in_stack_00000010,in_stack_00000008 * 0x18,8);
      }
      return uVar4;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x4ef8e8);
  (*pcVar3)();
}

