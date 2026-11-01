
void FUN_006825cc(code *param_1)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  ulong uVar5;
  ulong *puVar6;
  ulong uVar7;
  ulong uVar8;
  undefined8 *puVar9;
  ulong *puVar10;
  undefined1 (*pauVar11) [16];
  long *unaff_x19;
  uint unaff_w21;
  ulong unaff_x22;
  long *unaff_x23;
  long unaff_x24;
  uint unaff_w25;
  ulong unaff_x26;
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  long in_stack_00000000;
  long in_stack_00000008;
  
  iVar2 = (*param_1)();
  uVar3 = 0;
  if (iVar2 != 0) {
    uVar3 = iVar2 - 1;
  }
  uVar3 = uVar3 & *(uint *)(unaff_x19 + 2);
  lVar4 = (**(code **)(*unaff_x19 + 0xd8))();
  uVar1 = uVar3 + 1;
  *(undefined1 *)(lVar4 + (ulong)uVar3) = 0x80;
  if (uVar3 < unaff_w21) {
    unaff_w21 = unaff_w21 - uVar1;
    lVar4 = lVar4 + (ulong)uVar1;
  }
  else {
    _bzero(lVar4 + (ulong)uVar1,iVar2 - uVar1);
    (**(code **)(unaff_x19[1] + 0x50))();
    (**(code **)(*unaff_x19 + 0xd0))();
  }
  _bzero(lVar4,unaff_w21);
  lVar4 = unaff_x19[1];
  uVar5 = unaff_x19[2] << 3;
  uVar7 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
  uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
  if (unaff_w25 != 0) {
    uVar5 = uVar7 >> 0x20 | uVar7 << 0x20;
  }
  uVar8 = unaff_x26 >> 3 & 0x1fffffff;
  *(ulong *)(unaff_x24 + (uVar8 + unaff_w25) * 8 + -0x10) = uVar5;
  uVar5 = unaff_x19[3] << 3;
  uVar7 = (uVar5 & 0xff00ff00ff00ff00) >> 8 |
          ((ulong)unaff_x19[2] >> 0x3d | uVar5 & 0xff00ff00ff00ff) << 8;
  uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
  uVar5 = (ulong)unaff_x19[2] >> 0x3d | uVar5;
  if (unaff_w25 != 0) {
    uVar5 = uVar7 >> 0x20 | uVar7 << 0x20;
  }
  *(ulong *)(unaff_x24 + (~(ulong)unaff_w25 + uVar8) * 8) = uVar5;
  (**(code **)(lVar4 + 0x50))();
  (**(code **)(*unaff_x19 + 0xd0))();
  if ((((uint)in_stack_00000008 | (uint)unaff_x22) & 7) == 0) {
    if (unaff_w25 != 0) {
      if (7 < unaff_x22) {
        uVar5 = 0;
        uVar7 = unaff_x22 >> 3;
        if ((0x3f < unaff_x22) && (0x3f < (ulong)(in_stack_00000008 - in_stack_00000000))) {
          uVar5 = uVar7 & 0x1ffffffffffffff8;
          puVar9 = (undefined8 *)(in_stack_00000008 + 0x20);
          pauVar11 = (undefined1 (*) [16])(in_stack_00000000 + 0x20);
          uVar8 = uVar5;
          do {
            auVar12 = NEON_rev64(pauVar11[-2],1);
            auVar13 = NEON_rev64(pauVar11[-1],1);
            auVar14 = NEON_rev64(*pauVar11,1);
            auVar15 = NEON_rev64(pauVar11[1],1);
            puVar9[-3] = auVar12._8_8_;
            puVar9[-4] = auVar12._0_8_;
            puVar9[-1] = auVar13._8_8_;
            puVar9[-2] = auVar13._0_8_;
            puVar9[1] = auVar14._8_8_;
            *puVar9 = auVar14._0_8_;
            puVar9[3] = auVar15._8_8_;
            puVar9[2] = auVar15._0_8_;
            uVar8 = uVar8 - 8;
            puVar9 = puVar9 + 8;
            pauVar11 = pauVar11 + 4;
          } while (uVar8 != 0);
          if (uVar7 == uVar5) goto code_r0x006827f8;
        }
        lVar4 = uVar7 - uVar5;
        puVar6 = (ulong *)(in_stack_00000008 + uVar5 * 8);
        puVar10 = (ulong *)(in_stack_00000000 + uVar5 * 8);
        do {
          uVar5 = (*puVar10 & 0xff00ff00ff00ff00) >> 8 | (*puVar10 & 0xff00ff00ff00ff) << 8;
          uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
          *puVar6 = uVar5 >> 0x20 | uVar5 << 0x20;
          lVar4 = lVar4 + -1;
          puVar6 = puVar6 + 1;
          puVar10 = puVar10 + 1;
        } while (lVar4 != 0);
      }
      goto code_r0x006827f8;
    }
    if (((in_stack_00000000 == in_stack_00000008) || (in_stack_00000008 == 0)) ||
       (in_stack_00000000 == 0)) goto code_r0x006827f8;
  }
  else {
    uVar3 = (**(code **)(*unaff_x23 + 0x48))();
    if ((unaff_w25 != 0) && (7 < uVar3)) {
      uVar5 = (ulong)(uVar3 >> 3);
      if (uVar3 < 0x40) {
        uVar8 = 0;
      }
      else {
        uVar8 = uVar5 & 0x1ffffff8;
        pauVar11 = (undefined1 (*) [16])(in_stack_00000000 + 0x20);
        uVar7 = uVar8;
        do {
          auVar12 = NEON_rev64(pauVar11[-2],1);
          auVar13 = NEON_rev64(pauVar11[-1],1);
          auVar14 = NEON_rev64(*pauVar11,1);
          auVar15 = NEON_rev64(pauVar11[1],1);
          *(long *)(pauVar11[-2] + 8) = auVar12._8_8_;
          *(long *)pauVar11[-2] = auVar12._0_8_;
          *(long *)(pauVar11[-1] + 8) = auVar13._8_8_;
          *(long *)pauVar11[-1] = auVar13._0_8_;
          *(long *)(*pauVar11 + 8) = auVar14._8_8_;
          *(long *)*pauVar11 = auVar14._0_8_;
          *(long *)(pauVar11[1] + 8) = auVar15._8_8_;
          *(long *)pauVar11[1] = auVar15._0_8_;
          uVar7 = uVar7 - 8;
          pauVar11 = pauVar11 + 4;
        } while (uVar7 != 0);
        if (uVar8 == uVar5) goto code_r0x006827ec;
      }
      lVar4 = uVar5 - uVar8;
      puVar6 = (ulong *)(in_stack_00000000 + uVar8 * 8);
      do {
        uVar5 = (*puVar6 & 0xff00ff00ff00ff00) >> 8 | (*puVar6 & 0xff00ff00ff00ff) << 8;
        uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        *puVar6 = uVar5 >> 0x20 | uVar5 << 0x20;
        lVar4 = lVar4 + -1;
        puVar6 = puVar6 + 1;
      } while (lVar4 != 0);
    }
  }
code_r0x006827ec:
  _memcpy(in_stack_00000008);
code_r0x006827f8:
                    /* WARNING: Could not recover jumptable at 0x00682820. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*unaff_x19 + 0xa0))();
  return;
}

