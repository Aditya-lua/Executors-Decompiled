
/* WARNING: Removing unreachable block (ram,0x0006dc64) */

void FUN_0006db9c(void)

{
  char *pcVar1;
  undefined1 auVar2 [16];
  undefined8 uVar3;
  undefined1 *puVar4;
  long *plVar5;
  undefined1 *puVar6;
  long *plVar7;
  long *extraout_x9;
  ulong uVar8;
  ulong uVar9;
  undefined1 *puVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  ulong uVar13;
  undefined8 *unaff_x19;
  long *plVar14;
  char *unaff_x20;
  long *plVar15;
  undefined1 *unaff_x21;
  undefined1 *unaff_x22;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined1 auVar22 [16];
  long alStack_40 [3];
  long lStack_28;
  
  auVar2._8_8_ = unaff_x19;
  auVar2._0_8_ = unaff_x20;
  if ((undefined1 *)0x800000000000001d < unaff_x20 + -0x7ffffffffffffff8) {
    pcVar1 = unaff_x20;
    if (unaff_x20 < segment_command_00000020.segname + 5) {
      pcVar1 = segment_command_00000020.segname + 4;
    }
    uVar8 = ((ulong)pcVar1 & 0xfffffffffffffff8) + 8;
    if (((ulong)pcVar1 | 7) != 0x17) {
      uVar8 = (ulong)pcVar1 | 7;
    }
    uVar13 = 0x17;
    if ((undefined1 *)((long)&MACH_HEADER.sizeofcmds + 2) < pcVar1) {
      uVar13 = uVar8 + 1;
    }
    uVar3 = __Znwm(uVar13);
    unaff_x19[1] = 0;
    unaff_x19[2] = uVar13 | 0x8000000000000000;
    *unaff_x19 = uVar3;
    puVar10 = (undefined1 *)*unaff_x19;
    if (unaff_x22 == unaff_x21) {
      puVar4 = puVar10;
    }
    else {
      uVar8 = (long)unaff_x21 - (long)unaff_x22;
      if ((0x3f < uVar8) && (0x3f < (ulong)((long)puVar10 - (long)unaff_x22))) {
        uVar9 = uVar8 & 0xffffffffffffffc0;
        puVar4 = puVar10 + uVar9;
        puVar11 = (undefined8 *)(puVar10 + 0x20);
        puVar12 = (undefined8 *)(unaff_x22 + 0x20);
        uVar13 = uVar9;
        do {
          uVar3 = puVar12[-4];
          uVar17 = puVar12[-1];
          uVar16 = puVar12[-2];
          uVar19 = puVar12[1];
          uVar18 = *puVar12;
          uVar21 = puVar12[3];
          uVar20 = puVar12[2];
          puVar11[-3] = puVar12[-3];
          puVar11[-4] = uVar3;
          puVar11[-1] = uVar17;
          puVar11[-2] = uVar16;
          puVar11[1] = uVar19;
          *puVar11 = uVar18;
          puVar11[3] = uVar21;
          puVar11[2] = uVar20;
          uVar13 = uVar13 - 0x40;
          puVar11 = puVar11 + 8;
          puVar12 = puVar12 + 8;
        } while (uVar13 != 0);
        puVar10 = puVar4;
        unaff_x22 = unaff_x22 + uVar9;
        if (uVar8 == uVar9) goto LAB_0006dcf8;
      }
      do {
        puVar6 = unaff_x22 + 1;
        *puVar10 = *unaff_x22;
        puVar4 = puVar10 + 1;
        puVar10 = puVar10 + 1;
        unaff_x22 = puVar6;
      } while (puVar6 != unaff_x21);
    }
LAB_0006dcf8:
    *puVar4 = 0;
    if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
      unaff_x19[1] = unaff_x20;
      return;
    }
    *(byte *)((long)unaff_x19 + 0x17) = (byte)unaff_x20 & 0x7f;
    return;
  }
  auVar22 = func_0x0001748c();
  plVar15 = auVar22._8_8_;
  plVar14 = auVar22._0_8_;
  lStack_28 = *(long *)PTR____stack_chk_guard_009b01e8;
  if (plVar15 != plVar14) {
    plVar5 = (long *)plVar14[3];
    plVar7 = (long *)plVar15[3];
    if (plVar5 == plVar14) goto LAB_0006ddb4;
    if (plVar7 != plVar15) {
      plVar14[3] = (long)plVar7;
      plVar15[3] = (long)plVar5;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
        return;
      }
      goto FUN_0006ddb0;
    }
    (**(code **)(*plVar15 + 0x18))(plVar15,plVar14);
    (**(code **)(*(long *)plVar15[3] + 0x20))();
    plVar15[3] = plVar14[3];
    plVar14[3] = (long)plVar14;
    auVar2 = auVar22;
  }
  auVar22 = auVar2;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
    return;
  }
FUN_0006ddb0:
  do {
    ___stack_chk_fail();
    plVar7 = extraout_x9;
LAB_0006ddb4:
    plVar14 = auVar22._8_8_;
    plVar15 = auVar22._0_8_;
    if (plVar7 == plVar14) {
      (**(code **)(*plVar15 + 0x18))(plVar15,alStack_40);
      (**(code **)(*(long *)plVar15[3] + 0x20))();
      plVar15[3] = 0;
      (**(code **)(*(long *)plVar14[3] + 0x18))((long *)plVar14[3],plVar15);
      (**(code **)(*(long *)plVar14[3] + 0x20))();
      plVar14[3] = 0;
      plVar15[3] = (long)plVar15;
      (**(code **)(alStack_40[0] + 0x18))(alStack_40,plVar14);
      (**(code **)(alStack_40[0] + 0x20))(alStack_40);
    }
    else {
      (**(code **)(*plVar15 + 0x18))(plVar15,plVar14);
      (**(code **)(*(long *)plVar15[3] + 0x20))();
      plVar15[3] = plVar14[3];
    }
    plVar14[3] = (long)plVar14;
  } while (*(long *)PTR____stack_chk_guard_009b01e8 != lStack_28);
  return;
}

