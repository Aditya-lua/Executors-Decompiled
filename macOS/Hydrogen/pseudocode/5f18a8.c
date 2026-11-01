
void FUN_005f18a8(code *param_1)

{
  ulong uVar1;
  int iVar2;
  long lVar3;
  long *plVar4;
  long *plVar5;
  long *unaff_x19;
  ulong *unaff_x20;
  int unaff_w21;
  undefined1 auVar6 [16];
  ulong in_stack_00000000;
  long in_stack_00000008;
  
  (*param_1)();
  if (unaff_w21 == 1) {
    uVar1 = (in_stack_00000000 & 0xff00ff00ff00ff00) >> 8 |
            (in_stack_00000000 & 0xff00ff00ff00ff) << 8;
    uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
    in_stack_00000000 = uVar1 >> 0x20 | uVar1 << 0x20;
  }
  *unaff_x20 = in_stack_00000000;
  (**(code **)(*unaff_x19 + 200))();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000008) {
    return;
  }
  auVar6 = ___stack_chk_fail();
  plVar5 = auVar6._0_8_;
  lVar3 = (**(code **)(*plVar5 + 0x160))();
  if (lVar3 != 0) {
    plVar4 = (long *)(**(code **)(*plVar5 + 0x160))(plVar5);
    iVar2 = (**(code **)(*plVar4 + 0x158))();
    if (iVar2 != 0) {
      plVar5 = (long *)(**(code **)(*plVar5 + 0x160))(plVar5);
      lVar3 = 0x2f;
      goto LAB_005f1978;
    }
  }
  lVar3 = 0x2e;
LAB_005f1978:
                    /* WARNING: Could not recover jumptable at 0x005f1990. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar5 + lVar3 * 8))(plVar5,auVar6._8_8_);
  return;
}

