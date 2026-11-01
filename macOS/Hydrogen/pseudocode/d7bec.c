
void FUN_000d7bec(void)

{
  int *piVar1;
  undefined4 *puVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  short sVar6;
  int iVar7;
  long lVar8;
  long lVar9;
  undefined4 uVar10;
  long lVar11;
  int *piVar12;
  long lVar13;
  long *plVar14;
  code *unaff_x20;
  long unaff_x22;
  int *unaff_x23;
  long unaff_x24;
  long unaff_x25;
  short *psVar15;
  long unaff_x27;
  float fVar16;
  float fVar17;
  undefined8 uVar18;
  long in_stack_00000018;
  
  do {
    func_0x00126b68();
  } while (*(long *)(&UNK_00004e80 + unaff_x27) != 0);
  lVar8 = unaff_x25 + -1;
  if (0 < *(int *)(unaff_x24 + 0x198)) {
    if (unaff_x20 == (code *)0x0) {
      do {
        func_0x00123710();
      } while (0 < *(int *)(unaff_x24 + 0x198));
    }
    else {
      do {
        (*unaff_x20)();
        func_0x00123710();
      } while (0 < *(int *)(unaff_x24 + 0x198));
    }
  }
  psVar15 = (short *)(in_stack_00000018 + lVar8 * 0x68 + 0x5e);
  if ((int)*psVar15 < unaff_x23[0x14]) {
    if (unaff_x20 == (code *)0x0) {
      do {
        func_0x000d818c();
      } while ((int)*psVar15 < unaff_x23[0x14]);
    }
    else {
      do {
        (*unaff_x20)();
        func_0x000d818c();
      } while ((int)*psVar15 < unaff_x23[0x14]);
    }
  }
  iVar7 = *(int *)(unaff_x24 + 0x100);
  while (1 < iVar7) {
    if (unaff_x20 != (code *)0x0) {
      (*unaff_x20)();
    }
    lVar9 = *(long *)(*(long *)(unaff_x22 + 0x4c0) + 0x4000);
    *(int *)(lVar9 + 0x100) = *(int *)(lVar9 + 0x100) + -1;
    iVar7 = *(int *)(unaff_x24 + 0x100);
  }
  psVar15 = (short *)(in_stack_00000018 + lVar8 * 0x68 + 100);
  if (*psVar15 < (short)unaff_x23[0x50d]) {
    do {
      if (unaff_x20 != (code *)0x0) {
        (*unaff_x20)();
      }
      lVar9 = *(long *)(unaff_x22 + 0x4c0);
      *(short *)(&UNK_00005ea4 + lVar9) = *(short *)(&UNK_00005ea4 + lVar9) + -1;
      uVar3 = *(uint *)(&UNK_0000497c + lVar9);
      iVar7 = *(int *)(&UNK_00004ab0 + lVar9);
      *(int *)(&UNK_00004ab0 + lVar9) = iVar7 + -1;
      uVar4 = *(uint *)(*(long *)(&UNK_00004ab8 + lVar9) + (long)(iVar7 + -2) * 4);
      *(uint *)(&UNK_0000497c + lVar9) = uVar4;
      if (((uVar3 >> 2 & 1) != 0) && ((uVar4 >> 2 & 1) == 0)) {
        *(undefined4 *)(&UNK_000038e8 + lVar9) = *(undefined4 *)(&UNK_00005ea0 + lVar9);
      }
    } while (*psVar15 < (short)unaff_x23[0x50d]);
  }
  psVar15 = (short *)(in_stack_00000018 + lVar8 * 0x68 + 0x56);
  iVar7 = *unaff_x23;
  if (*psVar15 < iVar7) {
    do {
      if (unaff_x20 != (code *)0x0) {
        func_0x000bc0c4(*(undefined4 *)
                         (*(long *)(&UNK_00004a78 + unaff_x27) + (long)(iVar7 + -1) * 0x14));
        (*unaff_x20)();
      }
      lVar9 = *(long *)(unaff_x22 + 0x4c0);
      piVar1 = (int *)(&UNK_00004a70 + lVar9);
      if (0 < *piVar1) {
        piVar12 = (int *)(*(long *)(&UNK_00004a78 + lVar9) + (ulong)(*piVar1 - 1) * 0x14);
        lVar9 = lVar9 + (long)*piVar12 * 0x10;
        uVar18 = *(undefined8 *)(piVar12 + 1);
        *(undefined8 *)(&UNK_000039d4 + lVar9) = *(undefined8 *)(piVar12 + 3);
        *(undefined8 *)(&UNK_000039cc + lVar9) = uVar18;
        *piVar1 = *piVar1 + -1;
      }
      iVar7 = *unaff_x23;
    } while (*psVar15 < iVar7);
  }
  psVar15 = (short *)(in_stack_00000018 + lVar8 * 0x68 + 0x60);
  sVar6 = *psVar15;
  if ((int)sVar6 < unaff_x23[0x10]) {
    do {
      if (unaff_x20 != (code *)0x0) {
        (*unaff_x20)();
        sVar6 = *psVar15;
      }
      lVar9 = *(long *)(unaff_x22 + 0x4c0);
      iVar7 = *(int *)(&UNK_00004ab0 + lVar9);
      *(int *)(&UNK_00004ab0 + lVar9) = iVar7 + -1;
      *(undefined4 *)(&UNK_0000497c + lVar9) =
           *(undefined4 *)(*(long *)(&UNK_00004ab8 + lVar9) + (long)(iVar7 + -2) * 4);
    } while ((int)sVar6 < unaff_x23[0x10]);
  }
  psVar15 = (short *)(in_stack_00000018 + lVar8 * 0x68 + 0x58);
  if ((int)*psVar15 < unaff_x23[4]) {
    do {
      if (unaff_x20 != (code *)0x0) {
        (*unaff_x20)();
      }
      lVar9 = *(long *)(unaff_x22 + 0x4c0);
      uVar3 = *(uint *)(&UNK_00004a80 + lVar9);
      if (0 < (int)uVar3) {
        lVar13 = *(long *)(&UNK_00004a88 + lVar9);
        lVar11 = (ulong)uVar3 - 1;
        iVar7 = *(int *)(lVar13 + lVar11 * 0xc);
        puVar2 = (undefined4 *)
                 (&UNK_000038e8 + (ulong)*(uint *)(&UNK_0080c87c + (long)iVar7 * 0xc) + lVar9);
        if ((0x4fd379bU >> ((long)iVar7 & 0x3fU) & 1) == 0) {
          if ((0x1b02c864U >> ((long)iVar7 & 0x3fU) & 1) != 0) {
            lVar13 = lVar13 + lVar11 * 0xc;
            *puVar2 = *(undefined4 *)(lVar13 + 4);
            puVar2[1] = *(undefined4 *)(lVar13 + 8);
          }
        }
        else {
          *puVar2 = *(undefined4 *)(lVar13 + lVar11 * 0xc + 4);
        }
        *(uint *)(&UNK_00004a80 + lVar9) = (uint)lVar11;
      }
    } while ((int)*psVar15 < unaff_x23[4]);
  }
  psVar15 = (short *)(in_stack_00000018 + lVar8 * 0x68 + 0x5a);
  if ((int)*psVar15 < unaff_x23[8]) {
    do {
      if (unaff_x20 != (code *)0x0) {
        (*unaff_x20)();
      }
      lVar9 = *(long *)(unaff_x22 + 0x4c0);
      func_0x000f0c0c(*(undefined8 *)(*(long *)(lVar9 + 0x4000) + 0x2a8));
      iVar7 = *(int *)(&UNK_00004a90 + lVar9);
      iVar5 = iVar7 + -1;
      *(int *)(&UNK_00004a90 + lVar9) = iVar5;
      if (iVar5 == 0) {
        lVar9 = *(long *)(unaff_x22 + 0x4c0);
        lVar11 = *(long *)(lVar9 + 0x48);
        if (lVar11 == 0) {
          lVar11 = **(long **)(*(long *)(lVar9 + 0x38) + 0x60);
        }
      }
      else {
        lVar11 = *(long *)(*(long *)(&UNK_00004a98 + lVar9) + (long)(iVar7 + -2) * 8);
        lVar9 = *(long *)(unaff_x22 + 0x4c0);
      }
      *(long *)(&UNK_00003d30 + lVar9) = lVar11;
      fVar16 = *(float *)(lVar9 + 0x40) * *(float *)(lVar11 + 0x14) * *(float *)(lVar11 + 100);
      fVar17 = 1.0;
      if (1.0 < fVar16) {
        fVar17 = fVar16;
      }
      *(float *)(&UNK_00003d3c + lVar9) = fVar17;
      plVar14 = *(long **)(lVar9 + 0x4000);
      if (plVar14 == (long *)0x0) {
        fVar17 = 0.0;
      }
      else {
        fVar17 = *(float *)(&UNK_00003d3c + *plVar14) * *(float *)(plVar14 + 0x54);
        if (plVar14[0x6f] != 0) {
          fVar17 = fVar17 * *(float *)(plVar14[0x6f] + 0x2a0);
        }
      }
      *(float *)(&UNK_00003d38 + lVar9) = fVar17;
      lVar13 = *(long *)(lVar11 + 0x40);
      *(undefined8 *)(&UNK_00003d40 + lVar9) = *(undefined8 *)(lVar13 + 0x50);
      *(long *)(&UNK_00003f48 + lVar9) = lVar13 + 0x88;
      *(long *)(&UNK_00003d48 + lVar9) = lVar11;
      *(float *)(&UNK_00003d50 + lVar9) = fVar17;
    } while ((int)*psVar15 < unaff_x23[8]);
  }
  psVar15 = (short *)(in_stack_00000018 + lVar8 * 0x68 + 0x5c);
  if (*psVar15 + 1 < unaff_x23[0xc]) {
    do {
      if (unaff_x20 != (code *)0x0) {
        (*unaff_x20)();
      }
      lVar8 = *(long *)(unaff_x22 + 0x4c0);
      iVar7 = *(int *)(&UNK_00004aa0 + lVar8);
      if (iVar7 != 0) {
        *(int *)(&UNK_00004aa0 + lVar8) = iVar7 + -1;
        if (iVar7 + -1 == 0) {
          uVar10 = 0;
        }
        else {
          uVar10 = *(undefined4 *)
                    (*(long *)(&UNK_00004aa8 + lVar8) +
                    (-(ulong)(iVar7 - 2U >> 0x1f) & 0xfffffff800000000 | (ulong)(iVar7 - 2U) << 3));
        }
        *(undefined4 *)(&UNK_00004978 + lVar8) = uVar10;
      }
    } while (*psVar15 + 1 < unaff_x23[0xc]);
  }
  return;
}

