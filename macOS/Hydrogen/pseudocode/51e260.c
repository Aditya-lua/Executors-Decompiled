
/* WARNING: Possible PIC construction at 0x0051e32c: Changing call to branch */

void FUN_0051e260(long param_1,ulong param_2)

{
  long lVar1;
  undefined1 auVar2 [16];
  code *pcVar3;
  long in_x9;
  long *in_x10;
  long in_x11;
  long in_x12;
  long *unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x22;
  long unaff_x23;
  undefined8 *unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 unaff_x29;
  undefined8 uVar4;
  undefined1 auVar5 [16];
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined1 uStack0000000000000080;
  
  auVar2._8_8_ = unaff_x27;
  auVar2._0_8_ = unaff_x28;
  while (in_x9 = in_x9 + -0x10, in_x11 != unaff_x28 || in_x12 != unaff_x27) {
    if (in_x9 == 0) goto LAB_0051e2d0;
    in_x12 = in_x10[1];
    param_2 = param_2 + 1;
    param_1 = param_1 + 0x20;
    in_x11 = *in_x10;
    in_x10 = in_x10 + 2;
  }
  if (param_2 < *(ulong *)(unaff_x23 + 0x108)) {
    param_1 = *(long *)(unaff_x23 + 0x100) + param_1;
    lVar1 = *(long *)(param_1 + -0x18);
    auVar5 = (**(code **)(lVar1 + 0x18))
                       (*(long *)(param_1 + -0x20) +
                        (*(long *)(lVar1 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
    if (auVar5 == auVar2) {
LAB_0051e2d0:
      func_0x00530ac4(&uStack0000000000000008);
      *unaff_x22 = 1;
      unaff_x26[1] = in_stack_00000010;
      *unaff_x26 = uStack0000000000000008;
      unaff_x26[2] = in_stack_00000018;
      if (unaff_x20 == 0) {
        if (*unaff_x19 == -0x8000000000000000 || *unaff_x19 == 0) {
          return;
        }
        register0x00000008 = (BADSPACEBASE *)&uStack0000000000000080;
        unaff_x29 = in_stack_00000070;
        uVar4 = in_stack_00000078;
      }
      else {
        uVar4 = 0x51e330;
      }
      *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined8 *)((long)register0x00000008 + -8) = uVar4;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)();
      return;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(param_2,*(ulong *)(unaff_x23 + 0x108),&UNK_009e9b68);
  }
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x51e39c);
  (*pcVar3)();
}

