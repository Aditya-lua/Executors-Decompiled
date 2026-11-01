
void FUN_006818c4(long *param_1,long param_2,undefined8 param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  undefined4 uVar5;
  uint uVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  ulong *puVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 *puVar14;
  ulong *puVar15;
  undefined1 (*pauVar16) [16];
  ulong unaff_x22;
  uint uVar17;
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  
  func_0x005f01d4(param_1,param_3);
  lVar7 = (**(code **)(*param_1 + 0xc0))(param_1);
  lVar8 = (**(code **)(*param_1 + 200))(param_1);
  uVar2 = (**(code **)(*param_1 + 0x50))(param_1);
  uVar3 = (**(code **)(*param_1 + 0xa8))(param_1);
  uVar17 = uVar2 - 0x10;
  iVar4 = (**(code **)(*param_1 + 0x50))(param_1);
  uVar6 = 0;
  if (iVar4 != 0) {
    uVar6 = iVar4 - 1;
  }
  uVar6 = uVar6 & *(uint *)(param_1 + 1);
  lVar9 = (**(code **)(*param_1 + 0xc0))(param_1);
  uVar1 = uVar6 + 1;
  *(undefined1 *)(lVar9 + (ulong)uVar6) = 0x80;
  if (uVar6 < uVar17) {
    uVar17 = uVar17 - uVar1;
    lVar9 = lVar9 + (ulong)uVar1;
  }
  else {
    _bzero(lVar9 + (ulong)uVar1,iVar4 - uVar1);
    uVar5 = (**(code **)(*param_1 + 0x50))(param_1);
    (**(code **)(*param_1 + 0xb8))(param_1,lVar9,uVar5);
  }
  _bzero(lVar9,uVar17);
  lVar9 = *param_1;
  uVar10 = param_1[1] << 3;
  uVar13 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
  uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
  if (uVar3 != 0) {
    uVar10 = uVar13 >> 0x20 | uVar13 << 0x20;
  }
  *(ulong *)(lVar7 + ((ulong)(uVar2 >> 3) + (ulong)uVar3) * 8 + -0x10) = uVar10;
  uVar10 = param_1[2] << 3;
  uVar13 = (uVar10 & 0xff00ff00ff00ff00) >> 8 |
           ((ulong)param_1[1] >> 0x3d | uVar10 & 0xff00ff00ff00ff) << 8;
  uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
  uVar10 = (ulong)param_1[1] >> 0x3d | uVar10;
  if (uVar3 != 0) {
    uVar10 = uVar13 >> 0x20 | uVar13 << 0x20;
  }
  *(ulong *)(lVar7 + (~(ulong)uVar3 + (ulong)(uVar2 >> 3)) * 8) = uVar10;
  uVar5 = (**(code **)(lVar9 + 0x50))(param_1);
  (**(code **)(*param_1 + 0xb8))(param_1,lVar7,uVar5);
  if ((((uint)param_2 | (uint)unaff_x22) & 7) == 0) {
    if (uVar3 != 0) {
      if (7 < unaff_x22) {
        uVar10 = 0;
        uVar13 = unaff_x22 >> 3;
        if ((0x3f < unaff_x22) && (0x3f < (ulong)(param_2 - lVar8))) {
          uVar10 = uVar13 & 0x1ffffffffffffff8;
          puVar14 = (undefined8 *)(param_2 + 0x20);
          pauVar16 = (undefined1 (*) [16])(lVar8 + 0x20);
          uVar12 = uVar10;
          do {
            auVar18 = NEON_rev64(pauVar16[-2],1);
            auVar19 = NEON_rev64(pauVar16[-1],1);
            auVar20 = NEON_rev64(*pauVar16,1);
            auVar21 = NEON_rev64(pauVar16[1],1);
            puVar14[-3] = auVar18._8_8_;
            puVar14[-4] = auVar18._0_8_;
            puVar14[-1] = auVar19._8_8_;
            puVar14[-2] = auVar19._0_8_;
            puVar14[1] = auVar20._8_8_;
            *puVar14 = auVar20._0_8_;
            puVar14[3] = auVar21._8_8_;
            puVar14[2] = auVar21._0_8_;
            uVar12 = uVar12 - 8;
            puVar14 = puVar14 + 8;
            pauVar16 = pauVar16 + 4;
          } while (uVar12 != 0);
          if (uVar13 == uVar10) goto LAB_00681b60;
        }
        lVar7 = uVar13 - uVar10;
        puVar11 = (ulong *)(param_2 + uVar10 * 8);
        puVar15 = (ulong *)(lVar8 + uVar10 * 8);
        do {
          uVar10 = (*puVar15 & 0xff00ff00ff00ff00) >> 8 | (*puVar15 & 0xff00ff00ff00ff) << 8;
          uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
          *puVar11 = uVar10 >> 0x20 | uVar10 << 0x20;
          lVar7 = lVar7 + -1;
          puVar11 = puVar11 + 1;
          puVar15 = puVar15 + 1;
        } while (lVar7 != 0);
      }
      goto LAB_00681b60;
    }
    if (((lVar8 == param_2) || (param_2 == 0)) || (lVar8 == 0)) goto LAB_00681b60;
  }
  else {
    uVar6 = (**(code **)(*param_1 + 0x48))(param_1);
    if ((uVar3 != 0) && (7 < uVar6)) {
      uVar10 = (ulong)(uVar6 >> 3);
      if (uVar6 < 0x40) {
        uVar12 = 0;
      }
      else {
        uVar12 = uVar10 & 0x1ffffff8;
        pauVar16 = (undefined1 (*) [16])(lVar8 + 0x20);
        uVar13 = uVar12;
        do {
          auVar18 = NEON_rev64(pauVar16[-2],1);
          auVar19 = NEON_rev64(pauVar16[-1],1);
          auVar20 = NEON_rev64(*pauVar16,1);
          auVar21 = NEON_rev64(pauVar16[1],1);
          *(long *)(pauVar16[-2] + 8) = auVar18._8_8_;
          *(long *)pauVar16[-2] = auVar18._0_8_;
          *(long *)(pauVar16[-1] + 8) = auVar19._8_8_;
          *(long *)pauVar16[-1] = auVar19._0_8_;
          *(long *)(*pauVar16 + 8) = auVar20._8_8_;
          *(long *)*pauVar16 = auVar20._0_8_;
          *(long *)(pauVar16[1] + 8) = auVar21._8_8_;
          *(long *)pauVar16[1] = auVar21._0_8_;
          uVar13 = uVar13 - 8;
          pauVar16 = pauVar16 + 4;
        } while (uVar13 != 0);
        if (uVar12 == uVar10) goto LAB_00681b54;
      }
      lVar7 = uVar10 - uVar12;
      puVar11 = (ulong *)(lVar8 + uVar12 * 8);
      do {
        uVar10 = (*puVar11 & 0xff00ff00ff00ff00) >> 8 | (*puVar11 & 0xff00ff00ff00ff) << 8;
        uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
        *puVar11 = uVar10 >> 0x20 | uVar10 << 0x20;
        lVar7 = lVar7 + -1;
        puVar11 = puVar11 + 1;
      } while (lVar7 != 0);
    }
  }
LAB_00681b54:
  _memcpy(param_2);
LAB_00681b60:
                    /* WARNING: Could not recover jumptable at 0x00681b88. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x40))(param_1);
  return;
}

