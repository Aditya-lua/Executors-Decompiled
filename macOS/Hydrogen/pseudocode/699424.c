
long FUN_00699424(long param_1)

{
  bool bVar1;
  long lVar2;
  long *plVar3;
  int extraout_w1;
  long *plVar4;
  ulong *puVar5;
  ulong *puVar6;
  undefined *puVar7;
  ulong uVar8;
  long lVar9;
  ulong uVar10;
  ulong unaff_x19;
  long *unaff_x20;
  long *plVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  long unaff_x29;
  undefined1 auVar16 [16];
  long lStack0000000000000000;
  long lStack0000000000000008;
  long lStack0000000000000010;
  undefined8 uStack0000000000000030;
  undefined *puStack_b0;
  undefined *puStack_a8;
  long *plStack_98;
  long *plStack_90;
  long lStack_88;
  long lStack_80;
  ulong *puStack_78;
  ulong uStack_70;
  long lStack_68;
  
  lStack0000000000000008 = param_1 + 0x10;
  lStack0000000000000010 = param_1 + 0x1a0;
  uStack0000000000000030 = 0;
  lStack0000000000000000 = 0;
  puVar7 = &UNK_008ba5c8;
  puVar5 = (ulong *)register0x00000008;
  (**(code **)(*unaff_x20 + 0x120))();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return lStack0000000000000000;
  }
  ___stack_chk_fail(lStack0000000000000000);
  auVar16 = __Unwind_Resume();
  plVar4 = auVar16._8_8_;
  plVar3 = auVar16._0_8_;
  lStack_68 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar8 = unaff_x19;
  if ((int)puVar7 == 0) {
    func_0x005edf2c(&puStack_b0,0);
    puStack_b0 = &UNK_00a14d10;
    puStack_a8 = &UNK_00a14ea0;
    lStack_88 = 0;
    plStack_90 = (long *)0x0;
    puStack_78 = (ulong *)0x0;
    lStack_80 = 0;
    uStack_70 = 0;
    puVar6 = (ulong *)0xffffffff;
    plStack_98 = plVar3;
    func_0x005f0510(&puStack_b0,uRam0000000000a33570);
    uVar13 = *puVar5;
    if (plStack_90 == (long *)0x0) {
LAB_006997a8:
      if ((uVar13 == 0) || (uStack_70 == 0)) {
        lVar12 = 0;
      }
      else {
        uVar10 = uStack_70;
        if (uVar13 <= uStack_70) {
          uVar10 = uVar13;
        }
        puVar7 = (undefined *)0x0;
        puVar6 = puStack_78;
        uVar8 = uVar10;
        lVar12 = (**(code **)(*plVar4 + 0x130))(plVar4,unaff_x19,puStack_78,uVar10,0,0);
        if (lVar12 == 0) {
          puStack_78 = (ulong *)((long)puStack_78 + uVar10);
          uStack_70 = uStack_70 - uVar10;
          uVar13 = uVar13 - uVar10;
        }
      }
    }
    else {
      uVar15 = plStack_90[6] - (lStack_80 + plStack_90[5]);
      uVar10 = uVar15;
      if (uVar13 <= uVar15) {
        uVar10 = uVar13;
      }
      puVar6 = (ulong *)(plStack_90[4] + plStack_90[5] + lStack_80);
      puVar7 = (undefined *)0x0;
      uVar8 = uVar10;
      lVar12 = (**(code **)(*plVar4 + 0x130))(plVar4,unaff_x19,puVar6,uVar10,0,0);
      if (lVar12 == 0) {
        lStack_88 = lStack_88 + uVar10;
        uVar14 = uVar13 - uVar10;
        if (uVar15 < uVar13) {
          plStack_90 = (long *)*plStack_90;
          lStack_80 = 0;
          uVar13 = uVar14;
          if (plStack_90 == (long *)0x0) {
          }
          else {
            do {
              lStack_80 = 0;
              uVar15 = plStack_90[6] - plStack_90[5];
              uVar10 = uVar15;
              if (uVar13 <= uVar15) {
                uVar10 = uVar13;
              }
              puVar6 = (ulong *)(plStack_90[4] + plStack_90[5]);
              puVar7 = (undefined *)0x0;
              uVar8 = uVar10;
              lVar12 = (**(code **)(*plVar4 + 0x130))(plVar4,unaff_x19,puVar6,uVar10,0,0);
              if (lVar12 != 0) goto LAB_00699804;
              lStack_88 = lStack_88 + uVar10;
              uVar14 = uVar13 - uVar10;
              bVar1 = uVar13 <= uVar15;
              uVar13 = uVar14;
              if (bVar1) goto LAB_00699790;
              plStack_90 = (long *)*plStack_90;
              lStack_80 = 0;
            } while (plStack_90 != (long *)0x0);
          }
          goto LAB_006997a8;
        }
        uVar13 = uVar14;
LAB_00699790:
        lVar12 = 0;
        lStack_80 = lStack_80 + uVar10;
      }
    }
LAB_00699804:
    *puVar5 = *puVar5 - uVar13;
    (**(code **)(*plVar3 + 200))(plVar3);
  }
  else {
    uVar13 = *puVar5;
    plVar11 = (long *)plVar3[3];
    puVar6 = puVar5;
    if (uVar13 != 0 && plVar11 != (long *)0x0) {
      do {
        uVar8 = plVar11[6] - plVar11[5];
        uVar10 = uVar13;
        if (uVar8 <= uVar13) {
          uVar10 = uVar8;
        }
        puVar6 = (ulong *)(plVar11[4] + plVar11[5]);
        puVar7 = (undefined *)0x0;
        uVar8 = uVar10;
        (**(code **)(*plVar4 + 0x138))(plVar4,unaff_x19,puVar6,uVar10,0,1);
        plVar11[5] = plVar11[5] + uVar10;
        uVar13 = uVar13 - uVar10;
        plVar11 = (long *)*plVar11;
      } while (uVar13 != 0 && plVar11 != (long *)0x0);
      plVar11 = (long *)plVar3[3];
    }
    while (plVar11 != (long *)0x0) {
      if ((plVar11 == (long *)plVar3[4]) || (plVar11[5] != plVar11[3])) {
        if (plVar11[6] == plVar11[5]) {
          plVar11[5] = 0;
          plVar11[6] = 0;
        }
        break;
      }
      plVar3[3] = *plVar11;
      lVar12 = plVar11[4];
      uVar10 = plVar11[2];
      if ((ulong)plVar11[3] <= (ulong)plVar11[2]) {
        uVar10 = plVar11[3];
      }
      if (lVar12 != 0) {
        if (uVar10 != 0) {
          do {
            *(undefined1 *)(lVar12 + -1 + uVar10) = 0;
            uVar10 = uVar10 - 1;
          } while (uVar10 != 0);
        }
        func_0x00611644();
      }
      __ZdlPv(plVar11);
      plVar11 = (long *)plVar3[3];
    }
    uVar10 = plVar3[6];
    if (uVar13 <= (ulong)plVar3[6]) {
      uVar10 = uVar13;
    }
    if (uVar10 != 0) {
      puVar6 = (ulong *)plVar3[5];
      lVar12 = 0x130;
      if ((char)plVar3[8] != '\0') {
        lVar12 = 0x138;
      }
      puVar7 = (undefined *)0x0;
      uVar8 = uVar10;
      (**(code **)(*plVar4 + lVar12))(plVar4,unaff_x19,puVar6,uVar10,0,1);
      plVar3[5] = plVar3[5] + uVar10;
      plVar3[6] = plVar3[6] - uVar10;
      uVar13 = uVar13 - uVar10;
    }
    lVar12 = 0;
    *puVar5 = *puVar5 - uVar13;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_68) {
    return lVar12;
  }
  ___stack_chk_fail();
  if (extraout_w1 != 0) {
    func_0x0001753c();
  }
  auVar16 = __Unwind_Resume();
  plVar3 = auVar16._8_8_;
  lVar12 = auVar16._0_8_;
  uVar13 = *puVar6;
  lVar9 = *(long *)(lVar12 + 0x20);
  if (lVar9 != 0) {
    lVar2 = *(long *)(lVar9 + 0x28) + *(long *)(lVar12 + 0x30);
    uVar15 = *(long *)(lVar9 + 0x30) - lVar2;
    uVar10 = uVar15;
    if (uVar13 <= uVar15) {
      uVar10 = uVar13;
    }
    lVar9 = (**(code **)(*plVar3 + 0x130))
                      (plVar3,uVar8,lVar2 + *(long *)(lVar9 + 0x20),uVar10,0,puVar7);
    if (lVar9 != 0) goto LAB_00699a04;
    *(ulong *)(lVar12 + 0x28) = *(long *)(lVar12 + 0x28) + uVar10;
    uVar14 = uVar13 - uVar10;
    if (uVar13 <= uVar15) {
      uVar13 = uVar14;
LAB_00699994:
      lVar9 = 0;
      *(ulong *)(lVar12 + 0x30) = *(long *)(lVar12 + 0x30) + uVar10;
      goto LAB_00699a04;
    }
    lVar9 = **(long **)(lVar12 + 0x20);
    *(long *)(lVar12 + 0x20) = lVar9;
    *(undefined8 *)(lVar12 + 0x30) = 0;
    uVar13 = uVar14;
    if (lVar9 == 0) {
    }
    else {
      do {
        uVar15 = *(long *)(lVar9 + 0x30) - *(long *)(lVar9 + 0x28);
        uVar10 = uVar15;
        if (uVar13 <= uVar15) {
          uVar10 = uVar13;
        }
        lVar9 = (**(code **)(*plVar3 + 0x130))
                          (plVar3,uVar8,*(long *)(lVar9 + 0x20) + *(long *)(lVar9 + 0x28),uVar10,0,
                           puVar7);
        if (lVar9 != 0) goto LAB_00699a04;
        *(ulong *)(lVar12 + 0x28) = *(long *)(lVar12 + 0x28) + uVar10;
        uVar14 = uVar13 - uVar10;
        bVar1 = uVar13 <= uVar15;
        uVar13 = uVar14;
        if (bVar1) goto LAB_00699994;
        lVar9 = **(long **)(lVar12 + 0x20);
        *(long *)(lVar12 + 0x20) = lVar9;
        *(undefined8 *)(lVar12 + 0x30) = 0;
      } while (lVar9 != 0);
    }
  }
  if ((uVar13 == 0) || (uVar10 = *(ulong *)(lVar12 + 0x40), uVar10 == 0)) {
    lVar9 = 0;
  }
  else {
    if (uVar13 <= uVar10) {
      uVar10 = uVar13;
    }
    lVar9 = (**(code **)(*plVar3 + 0x130))
                      (plVar3,uVar8,*(undefined8 *)(lVar12 + 0x38),uVar10,0,puVar7);
    if (lVar9 == 0) {
      *(ulong *)(lVar12 + 0x38) = *(long *)(lVar12 + 0x38) + uVar10;
      *(ulong *)(lVar12 + 0x40) = *(long *)(lVar12 + 0x40) - uVar10;
      uVar13 = uVar13 - uVar10;
    }
  }
LAB_00699a04:
  *puVar6 = *puVar6 - uVar13;
  return lVar9;
}

