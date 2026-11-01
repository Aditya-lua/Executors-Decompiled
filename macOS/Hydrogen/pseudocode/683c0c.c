
void FUN_00683c0c(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  uint uVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  uint *puVar9;
  ulong uVar10;
  ulong uVar11;
  undefined8 *puVar12;
  uint *puVar13;
  undefined1 (*pauVar14) [16];
  long *unaff_x19;
  uint uVar15;
  ulong unaff_x22;
  long *unaff_x23;
  long unaff_x24;
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  long in_stack_00000008;
  
  lVar6 = (**(code **)(*unaff_x19 + 0xe0))();
  uVar2 = (**(code **)(unaff_x19[1] + 0x50))();
  uVar3 = (**(code **)(*unaff_x19 + 0xc0))();
  uVar15 = uVar2 - 8;
  iVar4 = (**(code **)(unaff_x19[1] + 0x50))();
  uVar5 = 0;
  if (iVar4 != 0) {
    uVar5 = iVar4 - 1;
  }
  uVar5 = uVar5 & *(uint *)(unaff_x19 + 2);
  lVar7 = (**(code **)(*unaff_x19 + 0xd8))();
  uVar1 = uVar5 + 1;
  *(undefined1 *)(lVar7 + (ulong)uVar5) = 0x80;
  if (uVar5 < uVar15) {
    uVar15 = uVar15 - uVar1;
    lVar7 = lVar7 + (ulong)uVar1;
  }
  else {
    _bzero(lVar7 + (ulong)uVar1,iVar4 - uVar1);
    (**(code **)(unaff_x19[1] + 0x50))();
    (**(code **)(*unaff_x19 + 0xd0))();
  }
  _bzero(lVar7,uVar15);
  uVar5 = (int)unaff_x19[2] << 3;
  uVar15 = (uVar5 & 0xff00ff00) >> 8 | (uVar5 & 0xff00ff) << 8;
  if (uVar3 != 0) {
    uVar5 = uVar15 >> 0x10 | uVar15 << 0x10;
  }
  *(uint *)(unaff_x24 + ((ulong)(uVar2 >> 2) + (ulong)uVar3) * 4 + -8) = uVar5;
  uVar5 = (uint)((ulong)unaff_x19[2] >> 0x1d);
  uVar15 = (uVar5 & 0xff00ff00) >> 8 | (uVar5 & 0xff00ff) << 8;
  if (uVar3 != 0) {
    uVar5 = uVar15 >> 0x10 | uVar15 << 0x10;
  }
  *(uint *)(unaff_x24 + (~(ulong)uVar3 + (ulong)(uVar2 >> 2)) * 4) = uVar5;
  (**(code **)(unaff_x19[1] + 0x50))();
  (**(code **)(*unaff_x19 + 0xd0))();
  if ((((uint)in_stack_00000008 | (uint)unaff_x22) & 3) == 0) {
    if (uVar3 != 0) {
      if (3 < unaff_x22) {
        uVar8 = 0;
        uVar11 = unaff_x22 >> 2;
        if ((0x3f < unaff_x22) && (0x3f < (ulong)(in_stack_00000008 - lVar6))) {
          uVar8 = uVar11 & 0x3ffffffffffffff0;
          puVar12 = (undefined8 *)(in_stack_00000008 + 0x20);
          pauVar14 = (undefined1 (*) [16])(lVar6 + 0x20);
          uVar10 = uVar8;
          do {
            auVar16 = NEON_rev32(pauVar14[-2],1);
            auVar17 = NEON_rev32(pauVar14[-1],1);
            auVar18 = NEON_rev32(*pauVar14,1);
            auVar19 = NEON_rev32(pauVar14[1],1);
            puVar12[-3] = auVar16._8_8_;
            puVar12[-4] = auVar16._0_8_;
            puVar12[-1] = auVar17._8_8_;
            puVar12[-2] = auVar17._0_8_;
            puVar12[1] = auVar18._8_8_;
            *puVar12 = auVar18._0_8_;
            puVar12[3] = auVar19._8_8_;
            puVar12[2] = auVar19._0_8_;
            uVar10 = uVar10 - 0x10;
            puVar12 = puVar12 + 8;
            pauVar14 = pauVar14 + 4;
          } while (uVar10 != 0);
          if (uVar11 == uVar8) goto LAB_00683e88;
        }
        lVar7 = uVar11 - uVar8;
        puVar9 = (uint *)(in_stack_00000008 + uVar8 * 4);
        puVar13 = (uint *)(lVar6 + uVar8 * 4);
        do {
          uVar5 = (*puVar13 & 0xff00ff00) >> 8 | (*puVar13 & 0xff00ff) << 8;
          *puVar9 = uVar5 >> 0x10 | uVar5 << 0x10;
          lVar7 = lVar7 + -1;
          puVar9 = puVar9 + 1;
          puVar13 = puVar13 + 1;
        } while (lVar7 != 0);
      }
      goto LAB_00683e88;
    }
    if (((lVar6 == in_stack_00000008) || (in_stack_00000008 == 0)) || (lVar6 == 0))
    goto LAB_00683e88;
  }
  else {
    uVar5 = (**(code **)(*unaff_x23 + 0x48))();
    if ((uVar3 != 0) && (3 < uVar5)) {
      uVar8 = (ulong)(uVar5 >> 2);
      if (uVar5 < 0x40) {
        uVar10 = 0;
      }
      else {
        uVar10 = uVar8 & 0x3ffffff0;
        pauVar14 = (undefined1 (*) [16])(lVar6 + 0x20);
        uVar11 = uVar10;
        do {
          auVar16 = NEON_rev32(pauVar14[-2],1);
          auVar17 = NEON_rev32(pauVar14[-1],1);
          auVar18 = NEON_rev32(*pauVar14,1);
          auVar19 = NEON_rev32(pauVar14[1],1);
          *(long *)(pauVar14[-2] + 8) = auVar16._8_8_;
          *(long *)pauVar14[-2] = auVar16._0_8_;
          *(long *)(pauVar14[-1] + 8) = auVar17._8_8_;
          *(long *)pauVar14[-1] = auVar17._0_8_;
          *(long *)(*pauVar14 + 8) = auVar18._8_8_;
          *(long *)*pauVar14 = auVar18._0_8_;
          *(long *)(pauVar14[1] + 8) = auVar19._8_8_;
          *(long *)pauVar14[1] = auVar19._0_8_;
          uVar11 = uVar11 - 0x10;
          pauVar14 = pauVar14 + 4;
        } while (uVar11 != 0);
        if (uVar10 == uVar8) goto LAB_00683e7c;
      }
      lVar7 = uVar8 - uVar10;
      puVar9 = (uint *)(lVar6 + uVar10 * 4);
      do {
        uVar5 = (*puVar9 & 0xff00ff00) >> 8 | (*puVar9 & 0xff00ff) << 8;
        *puVar9 = uVar5 >> 0x10 | uVar5 << 0x10;
        lVar7 = lVar7 + -1;
        puVar9 = puVar9 + 1;
      } while (lVar7 != 0);
    }
  }
LAB_00683e7c:
  _memcpy(in_stack_00000008);
LAB_00683e88:
                    /* WARNING: Could not recover jumptable at 0x00683eb0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*unaff_x19 + 0xa0))();
  return;
}

