
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

void FUN_00059a8c(void)

{
  long lVar1;
  undefined1 auVar2 [16];
  long *plVar3;
  long *plVar4;
  long lVar5;
  long *plVar6;
  long *plVar7;
  long *extraout_x9;
  long *unaff_x19;
  undefined1 *unaff_x20;
  char unaff_w21;
  long unaff_x29;
  undefined1 auVar8 [16];
  undefined8 uStack0000000000000008;
  char in_stack_00000010;
  long lStack0000000000000018;
  long *in_stack_00000030;
  undefined1 uStack0000000000000038;
  long alStack_40 [3];
  long lStack_28;
  undefined1 *puStack_20;
  long *plStack_18;
  
code_r0x00059a8c:
  if ((int)unaff_x20 == 0) {
    in_stack_00000030 = (long *)0x0;
    uStack0000000000000008 = *unaff_x19 + 0x78;
    in_stack_00000010 = unaff_w21;
    __ZNSt3__15mutex4lockEv();
    lVar5 = *unaff_x19;
    if (*(long *)(lVar5 + 0x30) == 0) {
      lVar1 = lVar5 + 0x48;
      do {
        if (*(char *)(lVar5 + 0x38) != '\0') break;
        __ZNSt3__118condition_variable4waitERNS_11unique_lockINS_5mutexEEE
                  (lVar1,&uStack0000000000000008);
        lVar5 = *unaff_x19;
      } while (*(long *)(lVar5 + 0x30) == 0);
    }
    if ((*(char *)(lVar5 + 0x38) != '\0') && (*(long *)(lVar5 + 0x30) == 0)) {
      if (in_stack_00000010 != '\0') {
        __ZNSt3__15mutex6unlockEv(uStack0000000000000008);
      }
      unaff_x20 = (undefined1 *)((long)&MACH_HEADER.magic + 2);
      if (in_stack_00000030 != &lStack0000000000000018) goto code_r0x00059c1c;
      plVar3 = &lStack0000000000000018;
      lVar5 = 4;
      goto code_r0x00059a80;
    }
    plVar3 = *(long **)(*(long *)(lVar5 + 0x28) + 0x28);
    if (plVar3 != (long *)0x0) {
      plVar4 = (long *)(*(long *)(lVar5 + 0x28) + 0x10);
      if (plVar3 == plVar4) {
        (**(code **)(*plVar4 + 0x18))(plVar4,&uStack0000000000000038);
      }
      else {
        (**(code **)(*plVar3 + 0x10))();
      }
    }
    unaff_x20 = &uStack0000000000000038;
    auVar8._8_8_ = &lStack0000000000000018;
    auVar8._0_8_ = &uStack0000000000000038;
    goto code_r0x00059cc0;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return;
  }
  unaff_x19 = (long *)___stack_chk_fail();
  if (in_stack_00000010 != '\0') {
    __ZNSt3__15mutex6unlockEv(uStack0000000000000008);
  }
  if (in_stack_00000030 == &lStack0000000000000018) {
    lVar5 = 4;
    plVar3 = &lStack0000000000000018;
code_r0x00059cac:
    (**(code **)(*plVar3 + lVar5 * 8))();
  }
  else if (in_stack_00000030 != (long *)0x0) {
    lVar5 = 5;
    plVar3 = in_stack_00000030;
    goto code_r0x00059cac;
  }
  auVar8 = __Unwind_Resume(unaff_x19);
code_r0x00059cc0:
  auVar2._8_8_ = unaff_x19;
  auVar2._0_8_ = unaff_x20;
  plVar4 = auVar8._8_8_;
  plVar3 = auVar8._0_8_;
  lStack_28 = *(long *)PTR____stack_chk_guard_009b01e8;
  puStack_20 = unaff_x20;
  plStack_18 = unaff_x19;
  if (plVar4 != plVar3) {
    plVar6 = (long *)plVar3[3];
    plVar7 = (long *)plVar4[3];
    if (plVar6 == plVar3) goto code_r0x00059d2c;
    if (plVar7 != plVar4) {
      plVar3[3] = (long)plVar7;
      plVar4[3] = (long)plVar6;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
        return;
      }
      goto code_r0x00059d28;
    }
    (**(code **)(*plVar4 + 0x18))(plVar4,plVar3);
    (**(code **)(*(long *)plVar4[3] + 0x20))();
    plVar4[3] = plVar3[3];
    plVar3[3] = (long)plVar3;
    auVar2 = auVar8;
  }
  auVar8 = auVar2;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
    return;
  }
code_r0x00059d28:
  do {
    ___stack_chk_fail();
    plVar7 = extraout_x9;
code_r0x00059d2c:
    plVar3 = auVar8._8_8_;
    plVar4 = auVar8._0_8_;
    if (plVar7 == plVar3) {
      (**(code **)(*plVar4 + 0x18))(plVar4,alStack_40);
      (**(code **)(*(long *)plVar4[3] + 0x20))();
      plVar4[3] = 0;
      (**(code **)(*(long *)plVar3[3] + 0x18))((long *)plVar3[3],plVar4);
      (**(code **)(*(long *)plVar3[3] + 0x20))();
      plVar3[3] = 0;
      plVar4[3] = (long)plVar4;
      (**(code **)(alStack_40[0] + 0x18))(alStack_40,plVar3);
      (**(code **)(alStack_40[0] + 0x20))(alStack_40);
    }
    else {
      (**(code **)(*plVar4 + 0x18))(plVar4,plVar3);
      (**(code **)(*(long *)plVar4[3] + 0x20))();
      plVar4[3] = plVar3[3];
    }
    plVar3[3] = (long)plVar3;
  } while (*(long *)PTR____stack_chk_guard_009b01e8 != lStack_28);
  return;
code_r0x00059c1c:
  if (in_stack_00000030 != (long *)0x0) {
    lVar5 = 5;
    plVar3 = in_stack_00000030;
code_r0x00059a80:
    (**(code **)(*plVar3 + lVar5 * 8))();
  }
  goto code_r0x00059a8c;
}

