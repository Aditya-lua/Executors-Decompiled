
void FUN_00683160(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  uint uVar5;
  long lVar6;
  ulong uVar7;
  uint *puVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 *puVar11;
  uint *puVar12;
  undefined1 (*pauVar13) [16];
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x22;
  long unaff_x23;
  uint uVar14;
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  long in_stack_00000008;
  
  uVar2 = (**(code **)(*unaff_x19 + 0x50))();
  uVar3 = (**(code **)(*unaff_x19 + 0xa8))();
  uVar14 = uVar2 - 8;
  iVar4 = (**(code **)(*unaff_x19 + 0x50))();
  uVar5 = 0;
  if (iVar4 != 0) {
    uVar5 = iVar4 - 1;
  }
  uVar5 = uVar5 & *(uint *)(unaff_x19 + 1);
  lVar6 = (**(code **)(*unaff_x19 + 0xc0))();
  uVar1 = uVar5 + 1;
  *(undefined1 *)(lVar6 + (ulong)uVar5) = 0x80;
  if (uVar5 < uVar14) {
    uVar14 = uVar14 - uVar1;
    lVar6 = lVar6 + (ulong)uVar1;
  }
  else {
    _bzero(lVar6 + (ulong)uVar1,iVar4 - uVar1);
    (**(code **)(*unaff_x19 + 0x50))();
    (**(code **)(*unaff_x19 + 0xb8))();
  }
  _bzero(lVar6,uVar14);
  uVar5 = (int)unaff_x19[1] << 3;
  uVar14 = (uVar5 & 0xff00ff00) >> 8 | (uVar5 & 0xff00ff) << 8;
  if (uVar3 != 0) {
    uVar5 = uVar14 >> 0x10 | uVar14 << 0x10;
  }
  *(uint *)(unaff_x23 + ((ulong)(uVar2 >> 2) + (ulong)uVar3) * 4 + -8) = uVar5;
  uVar5 = (uint)((ulong)unaff_x19[1] >> 0x1d);
  uVar14 = (uVar5 & 0xff00ff00) >> 8 | (uVar5 & 0xff00ff) << 8;
  if (uVar3 != 0) {
    uVar5 = uVar14 >> 0x10 | uVar14 << 0x10;
  }
  *(uint *)(unaff_x23 + (~(ulong)uVar3 + (ulong)(uVar2 >> 2)) * 4) = uVar5;
  (**(code **)(*unaff_x19 + 0x50))();
  (**(code **)(*unaff_x19 + 0xb8))();
  if ((((uint)unaff_x20 | (uint)unaff_x22) & 3) == 0) {
    if (uVar3 != 0) {
      if (3 < unaff_x22) {
        uVar7 = 0;
        uVar10 = unaff_x22 >> 2;
        if ((0x3f < unaff_x22) && (0x3f < (ulong)(unaff_x20 - in_stack_00000008))) {
          uVar7 = uVar10 & 0x3ffffffffffffff0;
          puVar11 = (undefined8 *)(unaff_x20 + 0x20);
          pauVar13 = (undefined1 (*) [16])(in_stack_00000008 + 0x20);
          uVar9 = uVar7;
          do {
            auVar15 = NEON_rev32(pauVar13[-2],1);
            auVar16 = NEON_rev32(pauVar13[-1],1);
            auVar17 = NEON_rev32(*pauVar13,1);
            auVar18 = NEON_rev32(pauVar13[1],1);
            puVar11[-3] = auVar15._8_8_;
            puVar11[-4] = auVar15._0_8_;
            puVar11[-1] = auVar16._8_8_;
            puVar11[-2] = auVar16._0_8_;
            puVar11[1] = auVar17._8_8_;
            *puVar11 = auVar17._0_8_;
            puVar11[3] = auVar18._8_8_;
            puVar11[2] = auVar18._0_8_;
            uVar9 = uVar9 - 0x10;
            puVar11 = puVar11 + 8;
            pauVar13 = pauVar13 + 4;
          } while (uVar9 != 0);
          if (uVar10 == uVar7) goto LAB_006833c8;
        }
        lVar6 = uVar10 - uVar7;
        puVar8 = (uint *)(unaff_x20 + uVar7 * 4);
        puVar12 = (uint *)(in_stack_00000008 + uVar7 * 4);
        do {
          uVar5 = (*puVar12 & 0xff00ff00) >> 8 | (*puVar12 & 0xff00ff) << 8;
          *puVar8 = uVar5 >> 0x10 | uVar5 << 0x10;
          lVar6 = lVar6 + -1;
          puVar8 = puVar8 + 1;
          puVar12 = puVar12 + 1;
        } while (lVar6 != 0);
      }
      goto LAB_006833c8;
    }
    if (((in_stack_00000008 == unaff_x20) || (unaff_x20 == 0)) || (in_stack_00000008 == 0))
    goto LAB_006833c8;
  }
  else {
    uVar5 = (**(code **)(*unaff_x19 + 0x48))();
    if ((uVar3 != 0) && (3 < uVar5)) {
      uVar7 = (ulong)(uVar5 >> 2);
      if (uVar5 < 0x40) {
        uVar9 = 0;
      }
      else {
        uVar9 = uVar7 & 0x3ffffff0;
        pauVar13 = (undefined1 (*) [16])(in_stack_00000008 + 0x20);
        uVar10 = uVar9;
        do {
          auVar15 = NEON_rev32(pauVar13[-2],1);
          auVar16 = NEON_rev32(pauVar13[-1],1);
          auVar17 = NEON_rev32(*pauVar13,1);
          auVar18 = NEON_rev32(pauVar13[1],1);
          *(long *)(pauVar13[-2] + 8) = auVar15._8_8_;
          *(long *)pauVar13[-2] = auVar15._0_8_;
          *(long *)(pauVar13[-1] + 8) = auVar16._8_8_;
          *(long *)pauVar13[-1] = auVar16._0_8_;
          *(long *)(*pauVar13 + 8) = auVar17._8_8_;
          *(long *)*pauVar13 = auVar17._0_8_;
          *(long *)(pauVar13[1] + 8) = auVar18._8_8_;
          *(long *)pauVar13[1] = auVar18._0_8_;
          uVar10 = uVar10 - 0x10;
          pauVar13 = pauVar13 + 4;
        } while (uVar10 != 0);
        if (uVar9 == uVar7) goto LAB_006833bc;
      }
      lVar6 = uVar7 - uVar9;
      puVar8 = (uint *)(in_stack_00000008 + uVar9 * 4);
      do {
        uVar5 = (*puVar8 & 0xff00ff00) >> 8 | (*puVar8 & 0xff00ff) << 8;
        *puVar8 = uVar5 >> 0x10 | uVar5 << 0x10;
        lVar6 = lVar6 + -1;
        puVar8 = puVar8 + 1;
      } while (lVar6 != 0);
    }
  }
LAB_006833bc:
  _memcpy();
LAB_006833c8:
                    /* WARNING: Could not recover jumptable at 0x006833f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*unaff_x19 + 0x40))();
  return;
}

