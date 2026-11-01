
void FUN_004ff310(long param_1,ulong param_2)

{
  long lVar1;
  undefined1 auVar2 [16];
  code *pcVar3;
  long in_x9;
  long *in_x10;
  long in_x11;
  long in_x12;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  undefined1 auVar4 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  
  auVar2._8_8_ = unaff_x22;
  auVar2._0_8_ = unaff_x23;
  while (in_x9 = in_x9 + -0x10, in_x11 != unaff_x23 || in_x12 != unaff_x22) {
    if (in_x9 == 0) goto LAB_004ff380;
    in_x12 = in_x10[1];
    param_2 = param_2 + 1;
    param_1 = param_1 + 0x20;
    in_x11 = *in_x10;
    in_x10 = in_x10 + 2;
  }
  if (param_2 < *(ulong *)(unaff_x20 + 0x108)) {
    param_1 = *(long *)(unaff_x20 + 0x100) + param_1;
    lVar1 = *(long *)(param_1 + -0x18);
    auVar4 = (**(code **)(lVar1 + 0x18))
                       (*(long *)(param_1 + -0x20) +
                        (*(long *)(lVar1 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
    if (auVar4 == auVar2) {
LAB_004ff380:
      func_0x00523f08();
      unaff_x19[1] = in_stack_00000008;
      *unaff_x19 = in_stack_00000000;
      unaff_x19[2] = in_stack_00000010;
      return;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(param_2,*(ulong *)(unaff_x20 + 0x108),&UNK_009e9b68);
  }
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x4ff3e4);
  (*pcVar3)();
}

