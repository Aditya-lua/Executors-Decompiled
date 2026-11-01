
/* WARNING: Possible PIC construction at 0x00059b4c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00059b50) */
/* WARNING: Removing unreachable block (ram,0x00059b68) */
/* WARNING: Removing unreachable block (ram,0x00059b5c) */
/* WARNING: Removing unreachable block (ram,0x00059b60) */
/* WARNING: Removing unreachable block (ram,0x00059b70) */
/* WARNING: Removing unreachable block (ram,0x00059b7c) */
/* WARNING: Removing unreachable block (ram,0x00059bbc) */
/* WARNING: Removing unreachable block (ram,0x00059bb0) */
/* WARNING: Removing unreachable block (ram,0x00059bb4) */
/* WARNING: Removing unreachable block (ram,0x00059bc4) */
/* WARNING: Removing unreachable block (ram,0x00059bd0) */
/* WARNING: Removing unreachable block (ram,0x00059bf4) */
/* WARNING: Removing unreachable block (ram,0x00059c58) */
/* WARNING: Removing unreachable block (ram,0x00059bfc) */
/* WARNING: Removing unreachable block (ram,0x00059a90) */
/* WARNING: Removing unreachable block (ram,0x00059ab4) */
/* WARNING: Removing unreachable block (ram,0x00059ab8) */
/* WARNING: Removing unreachable block (ram,0x00059ac0) */
/* WARNING: Removing unreachable block (ram,0x00059ad8) */

void FUN_00059ae0(long param_1)

{
  undefined1 auVar1 [16];
  long *plVar2;
  long *plVar3;
  long lVar4;
  long *plVar5;
  long *plVar6;
  long *extraout_x9;
  undefined8 unaff_x19;
  undefined1 *puVar7;
  long unaff_x29;
  undefined1 auVar8 [16];
  undefined8 in_stack_00000008;
  char in_stack_00000010;
  long lStack0000000000000018;
  long *in_stack_00000030;
  undefined1 uStack0000000000000038;
  long alStack_40 [3];
  long lStack_28;
  undefined1 *puStack_20;
  undefined8 uStack_18;
  
  if (*(long *)(param_1 + 0x30) == 0) {
    if (in_stack_00000010 != '\0') {
      __ZNSt3__15mutex6unlockEv(in_stack_00000008);
    }
    puVar7 = (undefined1 *)((long)&MACH_HEADER.magic + 2);
    if (in_stack_00000030 == &lStack0000000000000018) {
      plVar2 = &lStack0000000000000018;
      lVar4 = 4;
LAB_00059a80:
      (**(code **)(*plVar2 + lVar4 * 8))();
    }
    else if (in_stack_00000030 != (long *)0x0) {
      lVar4 = 5;
      plVar2 = in_stack_00000030;
      goto LAB_00059a80;
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
      return;
    }
    unaff_x19 = ___stack_chk_fail();
    if (in_stack_00000010 != '\0') {
      __ZNSt3__15mutex6unlockEv(in_stack_00000008);
    }
    if (in_stack_00000030 == &lStack0000000000000018) {
      lVar4 = 4;
      plVar2 = &lStack0000000000000018;
code_r0x00059cac:
      (**(code **)(*plVar2 + lVar4 * 8))();
    }
    else if (in_stack_00000030 != (long *)0x0) {
      lVar4 = 5;
      plVar2 = in_stack_00000030;
      goto code_r0x00059cac;
    }
    auVar8 = __Unwind_Resume(unaff_x19);
  }
  else {
    plVar2 = *(long **)(*(long *)(param_1 + 0x28) + 0x28);
    if (plVar2 != (long *)0x0) {
      plVar3 = (long *)(*(long *)(param_1 + 0x28) + 0x10);
      if (plVar2 == plVar3) {
        (**(code **)(*plVar3 + 0x18))(plVar3,&uStack0000000000000038);
      }
      else {
        (**(code **)(*plVar2 + 0x10))();
      }
    }
    puVar7 = &uStack0000000000000038;
    auVar8._8_8_ = &lStack0000000000000018;
    auVar8._0_8_ = &uStack0000000000000038;
  }
  auVar1._8_8_ = unaff_x19;
  auVar1._0_8_ = puVar7;
  plVar3 = auVar8._8_8_;
  plVar2 = auVar8._0_8_;
  lStack_28 = *(long *)PTR____stack_chk_guard_009b01e8;
  puStack_20 = puVar7;
  uStack_18 = unaff_x19;
  if (plVar3 != plVar2) {
    plVar5 = (long *)plVar2[3];
    plVar6 = (long *)plVar3[3];
    if (plVar5 == plVar2) goto code_r0x00059d2c;
    if (plVar6 != plVar3) {
      plVar2[3] = (long)plVar6;
      plVar3[3] = (long)plVar5;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
        return;
      }
      goto code_r0x00059d28;
    }
    (**(code **)(*plVar3 + 0x18))(plVar3,plVar2);
    (**(code **)(*(long *)plVar3[3] + 0x20))();
    plVar3[3] = plVar2[3];
    plVar2[3] = (long)plVar2;
    auVar1 = auVar8;
  }
  auVar8 = auVar1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
    return;
  }
code_r0x00059d28:
  do {
    ___stack_chk_fail();
    plVar6 = extraout_x9;
code_r0x00059d2c:
    plVar2 = auVar8._8_8_;
    plVar3 = auVar8._0_8_;
    if (plVar6 == plVar2) {
      (**(code **)(*plVar3 + 0x18))(plVar3,alStack_40);
      (**(code **)(*(long *)plVar3[3] + 0x20))();
      plVar3[3] = 0;
      (**(code **)(*(long *)plVar2[3] + 0x18))((long *)plVar2[3],plVar3);
      (**(code **)(*(long *)plVar2[3] + 0x20))();
      plVar2[3] = 0;
      plVar3[3] = (long)plVar3;
      (**(code **)(alStack_40[0] + 0x18))(alStack_40,plVar2);
      (**(code **)(alStack_40[0] + 0x20))(alStack_40);
    }
    else {
      (**(code **)(*plVar3 + 0x18))(plVar3,plVar2);
      (**(code **)(*(long *)plVar3[3] + 0x20))();
      plVar3[3] = plVar2[3];
    }
    plVar2[3] = (long)plVar2;
  } while (*(long *)PTR____stack_chk_guard_009b01e8 != lStack_28);
  return;
}

