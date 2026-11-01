
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

void FUN_00059a38(void)

{
  undefined1 *puVar1;
  long lVar2;
  undefined1 auVar3 [16];
  long *plVar4;
  long *plVar5;
  long *plVar6;
  long *plVar7;
  long lVar8;
  long *extraout_x9;
  undefined *puVar9;
  undefined1 auVar10 [16];
  long alStack_e0 [3];
  long lStack_c8;
  long *plStack_c0;
  long *plStack_b8;
  undefined1 *puStack_b0;
  undefined *puStack_a8;
  long lStack_98;
  char cStack_90;
  long alStack_88 [3];
  long *plStack_70;
  long alStack_68 [3];
  long *plStack_50;
  long lStack_48;
  undefined1 auStack_6 [6];
  
  plVar4 = (long *)__Unwind_Resume();
  puVar1 = auStack_6 + -10;
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  plStack_70 = (long *)0x0;
  lStack_98 = *plVar4 + 0x78;
  cStack_90 = '\x01';
  __ZNSt3__15mutex4lockEv();
  lVar8 = *plVar4;
  if (*(long *)(lVar8 + 0x30) == 0) {
    lVar2 = lVar8 + 0x48;
    do {
      if (*(char *)(lVar8 + 0x38) != '\0') break;
      __ZNSt3__118condition_variable4waitERNS_11unique_lockINS_5mutexEEE(lVar2,&lStack_98);
      lVar8 = *plVar4;
    } while (*(long *)(lVar8 + 0x30) == 0);
  }
  if ((*(char *)(lVar8 + 0x38) == '\0') || (*(long *)(lVar8 + 0x30) != 0)) {
    plVar5 = *(long **)(*(long *)(lVar8 + 0x28) + 0x28);
    plStack_50 = (long *)0x0;
    if (plVar5 == (long *)0x0) {
code_r0x00059b0c:
    }
    else {
      plVar6 = (long *)(*(long *)(lVar8 + 0x28) + 0x10);
      if (plVar5 != plVar6) {
        plStack_50 = (long *)(**(code **)(*plVar5 + 0x10))();
        goto code_r0x00059b0c;
      }
      plStack_50 = alStack_68;
      (**(code **)(*plVar6 + 0x18))(plVar6,alStack_68);
    }
    plVar5 = alStack_68;
    auVar10._8_8_ = alStack_88;
    auVar10._0_8_ = alStack_68;
    puVar9 = &UNK_00059b50;
  }
  else {
    if (cStack_90 != '\0') {
      __ZNSt3__15mutex6unlockEv(lStack_98);
    }
    plVar5 = (long *)((long)&MACH_HEADER.magic + 2);
    if (plStack_70 == alStack_88) {
      plVar4 = alStack_88;
      lVar8 = 4;
code_r0x00059a80:
      (**(code **)(*plVar4 + lVar8 * 8))();
    }
    else if (plStack_70 != (long *)0x0) {
      lVar8 = 5;
      plVar4 = plStack_70;
      goto code_r0x00059a80;
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
      return;
    }
    plVar4 = (long *)___stack_chk_fail();
    if (cStack_90 != '\0') {
      __ZNSt3__15mutex6unlockEv(lStack_98);
    }
    if (plStack_70 == alStack_88) {
      lVar8 = 4;
      plVar6 = alStack_88;
code_r0x00059cac:
      (**(code **)(*plVar6 + lVar8 * 8))();
    }
    else if (plStack_70 != (long *)0x0) {
      lVar8 = 5;
      plVar6 = plStack_70;
      goto code_r0x00059cac;
    }
    puVar9 = &DAT_00059cc0;
    auVar10 = __Unwind_Resume(plVar4);
  }
  auVar3._8_8_ = plVar4;
  auVar3._0_8_ = plVar5;
  plVar7 = auVar10._8_8_;
  plVar6 = auVar10._0_8_;
  lStack_c8 = *(long *)PTR____stack_chk_guard_009b01e8;
  plStack_c0 = plVar5;
  plStack_b8 = plVar4;
  puStack_b0 = puVar1;
  puStack_a8 = puVar9;
  if (plVar7 != plVar6) {
    plVar5 = (long *)plVar6[3];
    plVar4 = (long *)plVar7[3];
    if (plVar5 == plVar6) goto code_r0x00059d2c;
    if (plVar4 != plVar7) {
      plVar6[3] = (long)plVar4;
      plVar7[3] = (long)plVar5;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_c8) {
        return;
      }
      goto code_r0x00059d28;
    }
    (**(code **)(*plVar7 + 0x18))(plVar7,plVar6);
    (**(code **)(*(long *)plVar7[3] + 0x20))();
    plVar7[3] = plVar6[3];
    plVar6[3] = (long)plVar6;
    auVar3 = auVar10;
  }
  auVar10 = auVar3;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_c8) {
    return;
  }
code_r0x00059d28:
  do {
    ___stack_chk_fail();
    plVar4 = extraout_x9;
code_r0x00059d2c:
    plVar5 = auVar10._8_8_;
    plVar6 = auVar10._0_8_;
    if (plVar4 == plVar5) {
      (**(code **)(*plVar6 + 0x18))(plVar6,alStack_e0);
      (**(code **)(*(long *)plVar6[3] + 0x20))();
      plVar6[3] = 0;
      (**(code **)(*(long *)plVar5[3] + 0x18))((long *)plVar5[3],plVar6);
      (**(code **)(*(long *)plVar5[3] + 0x20))();
      plVar5[3] = 0;
      plVar6[3] = (long)plVar6;
      (**(code **)(alStack_e0[0] + 0x18))(alStack_e0,plVar5);
      (**(code **)(alStack_e0[0] + 0x20))(alStack_e0);
    }
    else {
      (**(code **)(*plVar6 + 0x18))(plVar6,plVar5);
      (**(code **)(*(long *)plVar6[3] + 0x20))();
      plVar6[3] = plVar5[3];
    }
    plVar5[3] = (long)plVar5;
  } while (*(long *)PTR____stack_chk_guard_009b01e8 != lStack_c8);
  return;
}

