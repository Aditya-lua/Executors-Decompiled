
/* WARNING: Possible PIC construction at 0x00218f58: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00219070: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002192a8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00219054: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002192ac) */
/* WARNING: Removing unreachable block (ram,0x00219074) */
/* WARNING: Removing unreachable block (ram,0x00218f5c) */
/* WARNING: Removing unreachable block (ram,0x00219058) */

void FUN_00218e74(void)

{
  ulong uVar1;
  long *plVar2;
  long *plVar3;
  long lVar4;
  undefined8 uVar5;
  long *extraout_x8;
  long *plVar6;
  long *plVar7;
  long lVar8;
  long lVar9;
  long *plVar10;
  long lVar11;
  long *plVar12;
  long *plVar13;
  long *plVar14;
  long lVar15;
  long lVar16;
  long unaff_x29;
  undefined1 auStack_c0 [8];
  long *plStack_b8;
  long lStack_b0;
  long *plStack_a8;
  long *plStack_a0;
  long *plStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  long *plStack_68;
  undefined8 uStack_8;
  
  plStack_a0 = (long *)__Unwind_Resume();
  plVar2 = (long *)auStack_c0;
  uStack_8 = 0x218e78;
  lVar16 = (long)register0x00000008 + -0x10;
  lStack_b0 = plStack_a0[2];
  plStack_98 = (long *)plStack_a0[3];
  plVar12 = (long *)*plStack_a0;
  plVar14 = (long *)plStack_a0[1];
  plStack_b8 = plVar12;
  plStack_a8 = extraout_x8;
  if (plVar14 != plStack_98) {
    do {
      lStack_88 = plVar14[1];
      lStack_90 = *plVar14;
      lStack_78 = plVar14[3];
      lStack_80 = plVar14[2];
      plStack_68 = (long *)plVar14[5];
      lStack_70 = plVar14[4];
      plVar3 = (long *)plVar14[1];
      lVar11 = plVar14[2];
      if (lVar11 != 0) {
        lVar8 = 0;
        plVar13 = plVar3;
        do {
          lVar4 = *plVar13;
          if (lVar4 != -0x8000000000000000) {
            plVar6 = plVar13;
            if (lVar4 == -0x7fffffffffffffff) {
              lVar4 = plVar13[1];
              if (lVar4 == -0x8000000000000000) goto LAB_00218f10;
              plVar6 = plVar3 + lVar8 * 4 + 1;
            }
            if (lVar4 != 0) {
              plVar3 = (long *)plVar6[1];
              uVar5 = 1;
              uStack_8 = 0x218f5c;
              plVar2 = (long *)auStack_c0;
              goto code_r0x00187bd4;
            }
          }
LAB_00218f10:
          plVar13 = plVar13 + 4;
          lVar8 = lVar8 + 1;
          lVar11 = lVar11 + -1;
        } while (lVar11 != 0);
      }
      if (*plVar14 != 0) {
        func_0x00187bd4(plVar3,*plVar14 << 5,8);
      }
      plVar14 = plVar14 + 6;
      plVar12[1] = lStack_70;
      *plVar12 = lStack_78;
      plVar12[2] = (long)plStack_68;
      plVar12 = plVar12 + 3;
    } while (plVar14 != plStack_98);
  }
  *plStack_a0 = 8;
  plStack_a0[1] = 8;
  plStack_a0[2] = 0;
  plStack_a0[3] = 8;
  if ((long)plStack_98 - (long)plVar14 != 0) {
    plVar13 = (long *)0x0;
    plStack_98 = (long *)(((ulong)((long)plStack_98 - (long)plVar14) >> 4) * -0x5555555555555555);
    do {
      plVar6 = plVar14 + (long)plVar13 * 6;
      lVar11 = plVar6[3];
      if (lVar11 == -0x8000000000000000 || lVar11 == 0) {
        plVar3 = (long *)plVar6[1];
        lVar11 = plVar6[2];
      }
      else {
        func_0x00187bd4(plVar6[4],lVar11,1);
        plVar3 = (long *)plVar6[1];
        lVar11 = plVar6[2];
      }
      if (lVar11 != 0) {
        lVar8 = 0;
        plVar10 = plVar3;
        do {
          lVar4 = *plVar10;
          if (lVar4 != -0x8000000000000000) {
            plVar7 = plVar10;
            if (lVar4 == -0x7fffffffffffffff) {
              lVar4 = plVar10[1];
              if (lVar4 == -0x8000000000000000) goto LAB_0021900c;
              plVar7 = plVar3 + lVar8 * 4 + 1;
            }
            if (lVar4 != 0) {
              plVar3 = (long *)plVar7[1];
              uVar5 = 1;
              uStack_8 = 0x219058;
              goto code_r0x00187bd4;
            }
          }
LAB_0021900c:
          plVar10 = plVar10 + 4;
          lVar8 = lVar8 + 1;
          lVar11 = lVar11 + -1;
        } while (lVar11 != 0);
      }
      if (*plVar6 != 0) {
        lVar4 = *plVar6 << 5;
        uVar5 = 8;
        uStack_8 = 0x219074;
        plVar2 = (long *)auStack_c0;
        goto code_r0x00187bd4;
      }
      plVar13 = (long *)((long)plVar13 + 1);
    } while (plVar13 != plStack_98);
  }
  *plStack_a8 = lStack_b0 << 1;
  plStack_a8[1] = (long)plStack_b8;
  plStack_a8[2] = ((ulong)((long)plVar12 - (long)plStack_b8) >> 3) * -0x5555555555555555;
  plVar2 = &lStack_70;
  lVar16 = (long)register0x00000008 + -0x10;
  lVar11 = plStack_a0[1];
  plStack_68 = plStack_a0;
  uVar1 = plStack_a0[3] - lVar11;
  if (uVar1 != 0) {
    lVar8 = 0;
    do {
      plVar14 = (long *)(lVar11 + lVar8 * 0x30);
      lVar4 = plVar14[3];
      if (lVar4 == -0x8000000000000000 || lVar4 == 0) {
        plVar12 = (long *)plVar14[1];
        lVar15 = plVar14[2];
      }
      else {
        func_0x00187bd4(plVar14[4],lVar4,1);
        plVar12 = (long *)plVar14[1];
        lVar15 = plVar14[2];
      }
      if (lVar15 != 0) {
        lVar9 = 0;
        plVar3 = plVar12;
        do {
          lVar4 = *plVar3;
          if (lVar4 != -0x8000000000000000) {
            plVar13 = plVar3;
            if (lVar4 == -0x7fffffffffffffff) {
              lVar4 = plVar3[1];
              if (lVar4 == -0x8000000000000000) goto LAB_00219260;
              plVar13 = plVar12 + lVar9 * 4 + 1;
            }
            if (lVar4 != 0) {
              plVar3 = (long *)plVar13[1];
              uVar5 = 1;
              uStack_8 = 0x2192ac;
              goto code_r0x00187bd4;
            }
          }
LAB_00219260:
          plVar3 = plVar3 + 4;
          lVar9 = lVar9 + 1;
          lVar15 = lVar15 + -1;
        } while (lVar15 != 0);
      }
      if (*plVar14 != 0) {
        func_0x00187bd4(plVar12,*plVar14 << 5,8);
      }
      lVar8 = lVar8 + 1;
    } while (lVar8 != (uVar1 >> 4) * -0x5555555555555555);
  }
  if (plStack_68[2] == 0) {
    return;
  }
  plVar3 = (long *)*plStack_68;
  lVar4 = plStack_68[2] * 0x30;
  uVar5 = 8;
  plVar2 = (long *)register0x00000008;
  lVar16 = unaff_x29;
code_r0x00187bd4:
  *(long *)((long)plVar2 + -0x10) = lVar16;
  *(undefined8 *)((long)plVar2 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar3,lVar4,uVar5);
  return;
}

