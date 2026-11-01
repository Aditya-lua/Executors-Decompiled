
void FUN_00683d1c(void)

{
  uint uVar1;
  undefined4 in_w8;
  ulong uVar2;
  uint *puVar3;
  long lVar4;
  long in_x9;
  ulong uVar5;
  ulong uVar6;
  ulong in_x10;
  undefined8 *puVar7;
  uint *puVar8;
  undefined1 (*pauVar9) [16];
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x22;
  long *unaff_x23;
  long unaff_x24;
  int unaff_w25;
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  long in_stack_00000000;
  
  *(undefined4 *)(unaff_x24 + (~in_x10 + in_x9) * 4) = in_w8;
  (**(code **)(unaff_x19[1] + 0x50))();
  (**(code **)(*unaff_x19 + 0xd0))();
  if ((((uint)unaff_x20 | (uint)unaff_x22) & 3) == 0) {
    if (unaff_w25 != 0) {
      if (3 < unaff_x22) {
        uVar2 = 0;
        uVar6 = unaff_x22 >> 2;
        if ((0x3f < unaff_x22) && (0x3f < (ulong)(unaff_x20 - in_stack_00000000))) {
          uVar2 = uVar6 & 0x3ffffffffffffff0;
          puVar7 = (undefined8 *)(unaff_x20 + 0x20);
          pauVar9 = (undefined1 (*) [16])(in_stack_00000000 + 0x20);
          uVar5 = uVar2;
          do {
            auVar10 = NEON_rev32(pauVar9[-2],1);
            auVar11 = NEON_rev32(pauVar9[-1],1);
            auVar12 = NEON_rev32(*pauVar9,1);
            auVar13 = NEON_rev32(pauVar9[1],1);
            puVar7[-3] = auVar10._8_8_;
            puVar7[-4] = auVar10._0_8_;
            puVar7[-1] = auVar11._8_8_;
            puVar7[-2] = auVar11._0_8_;
            puVar7[1] = auVar12._8_8_;
            *puVar7 = auVar12._0_8_;
            puVar7[3] = auVar13._8_8_;
            puVar7[2] = auVar13._0_8_;
            uVar5 = uVar5 - 0x10;
            puVar7 = puVar7 + 8;
            pauVar9 = pauVar9 + 4;
          } while (uVar5 != 0);
          if (uVar6 == uVar2) goto LAB_00683e88;
        }
        lVar4 = uVar6 - uVar2;
        puVar3 = (uint *)(unaff_x20 + uVar2 * 4);
        puVar8 = (uint *)(in_stack_00000000 + uVar2 * 4);
        do {
          uVar1 = (*puVar8 & 0xff00ff00) >> 8 | (*puVar8 & 0xff00ff) << 8;
          *puVar3 = uVar1 >> 0x10 | uVar1 << 0x10;
          lVar4 = lVar4 + -1;
          puVar3 = puVar3 + 1;
          puVar8 = puVar8 + 1;
        } while (lVar4 != 0);
      }
      goto LAB_00683e88;
    }
    if (((in_stack_00000000 == unaff_x20) || (unaff_x20 == 0)) || (in_stack_00000000 == 0))
    goto LAB_00683e88;
  }
  else {
    uVar1 = (**(code **)(*unaff_x23 + 0x48))();
    if ((unaff_w25 != 0) && (3 < uVar1)) {
      uVar2 = (ulong)(uVar1 >> 2);
      if (uVar1 < 0x40) {
        uVar5 = 0;
      }
      else {
        uVar5 = uVar2 & 0x3ffffff0;
        pauVar9 = (undefined1 (*) [16])(in_stack_00000000 + 0x20);
        uVar6 = uVar5;
        do {
          auVar10 = NEON_rev32(pauVar9[-2],1);
          auVar11 = NEON_rev32(pauVar9[-1],1);
          auVar12 = NEON_rev32(*pauVar9,1);
          auVar13 = NEON_rev32(pauVar9[1],1);
          *(long *)(pauVar9[-2] + 8) = auVar10._8_8_;
          *(long *)pauVar9[-2] = auVar10._0_8_;
          *(long *)(pauVar9[-1] + 8) = auVar11._8_8_;
          *(long *)pauVar9[-1] = auVar11._0_8_;
          *(long *)(*pauVar9 + 8) = auVar12._8_8_;
          *(long *)*pauVar9 = auVar12._0_8_;
          *(long *)(pauVar9[1] + 8) = auVar13._8_8_;
          *(long *)pauVar9[1] = auVar13._0_8_;
          uVar6 = uVar6 - 0x10;
          pauVar9 = pauVar9 + 4;
        } while (uVar6 != 0);
        if (uVar5 == uVar2) goto LAB_00683e7c;
      }
      lVar4 = uVar2 - uVar5;
      puVar3 = (uint *)(in_stack_00000000 + uVar5 * 4);
      do {
        uVar1 = (*puVar3 & 0xff00ff00) >> 8 | (*puVar3 & 0xff00ff) << 8;
        *puVar3 = uVar1 >> 0x10 | uVar1 << 0x10;
        lVar4 = lVar4 + -1;
        puVar3 = puVar3 + 1;
      } while (lVar4 != 0);
    }
  }
LAB_00683e7c:
  _memcpy();
LAB_00683e88:
                    /* WARNING: Could not recover jumptable at 0x00683eb0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*unaff_x19 + 0xa0))();
  return;
}

