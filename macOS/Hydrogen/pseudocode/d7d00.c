
void FUN_000d7d00(void)

{
  int *piVar1;
  undefined4 *puVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  short sVar6;
  int iVar7;
  long lVar8;
  undefined4 uVar9;
  long lVar10;
  int *piVar11;
  long lVar12;
  long *plVar13;
  code *unaff_x20;
  long unaff_x22;
  int *unaff_x23;
  long unaff_x24;
  short *psVar14;
  long unaff_x27;
  float fVar15;
  float fVar16;
  undefined8 uVar17;
  long in_stack_00000010;
  long in_stack_00000018;
  
  do {
    (*unaff_x20)();
    do {
      lVar8 = *(long *)(*(long *)(unaff_x22 + 0x4c0) + 0x4000);
      *(int *)(lVar8 + 0x100) = *(int *)(lVar8 + 0x100) + -1;
      if (*(int *)(unaff_x24 + 0x100) < 2) {
        psVar14 = (short *)(in_stack_00000018 + in_stack_00000010 * 0x68 + 100);
        if (*psVar14 < (short)unaff_x23[0x50d]) {
          do {
            if (unaff_x20 != (code *)0x0) {
              (*unaff_x20)();
            }
            lVar8 = *(long *)(unaff_x22 + 0x4c0);
            *(short *)(&UNK_00005ea4 + lVar8) = *(short *)(&UNK_00005ea4 + lVar8) + -1;
            uVar3 = *(uint *)(&UNK_0000497c + lVar8);
            iVar7 = *(int *)(&UNK_00004ab0 + lVar8);
            *(int *)(&UNK_00004ab0 + lVar8) = iVar7 + -1;
            uVar4 = *(uint *)(*(long *)(&UNK_00004ab8 + lVar8) + (long)(iVar7 + -2) * 4);
            *(uint *)(&UNK_0000497c + lVar8) = uVar4;
            if (((uVar3 >> 2 & 1) != 0) && ((uVar4 >> 2 & 1) == 0)) {
              *(undefined4 *)(&UNK_000038e8 + lVar8) = *(undefined4 *)(&UNK_00005ea0 + lVar8);
            }
          } while (*psVar14 < (short)unaff_x23[0x50d]);
        }
        psVar14 = (short *)(in_stack_00000018 + in_stack_00000010 * 0x68 + 0x56);
        iVar7 = *unaff_x23;
        if (*psVar14 < iVar7) {
          do {
            if (unaff_x20 != (code *)0x0) {
              func_0x000bc0c4(*(undefined4 *)
                               (*(long *)(&UNK_00004a78 + unaff_x27) + (long)(iVar7 + -1) * 0x14));
              (*unaff_x20)();
            }
            lVar8 = *(long *)(unaff_x22 + 0x4c0);
            piVar1 = (int *)(&UNK_00004a70 + lVar8);
            if (0 < *piVar1) {
              piVar11 = (int *)(*(long *)(&UNK_00004a78 + lVar8) + (ulong)(*piVar1 - 1) * 0x14);
              lVar8 = lVar8 + (long)*piVar11 * 0x10;
              uVar17 = *(undefined8 *)(piVar11 + 1);
              *(undefined8 *)(&UNK_000039d4 + lVar8) = *(undefined8 *)(piVar11 + 3);
              *(undefined8 *)(&UNK_000039cc + lVar8) = uVar17;
              *piVar1 = *piVar1 + -1;
            }
            iVar7 = *unaff_x23;
          } while (*psVar14 < iVar7);
        }
        psVar14 = (short *)(in_stack_00000018 + in_stack_00000010 * 0x68 + 0x60);
        sVar6 = *psVar14;
        if ((int)sVar6 < unaff_x23[0x10]) {
          do {
            if (unaff_x20 != (code *)0x0) {
              (*unaff_x20)();
              sVar6 = *psVar14;
            }
            lVar8 = *(long *)(unaff_x22 + 0x4c0);
            iVar7 = *(int *)(&UNK_00004ab0 + lVar8);
            *(int *)(&UNK_00004ab0 + lVar8) = iVar7 + -1;
            *(undefined4 *)(&UNK_0000497c + lVar8) =
                 *(undefined4 *)(*(long *)(&UNK_00004ab8 + lVar8) + (long)(iVar7 + -2) * 4);
          } while ((int)sVar6 < unaff_x23[0x10]);
        }
        psVar14 = (short *)(in_stack_00000018 + in_stack_00000010 * 0x68 + 0x58);
        if ((int)*psVar14 < unaff_x23[4]) {
          do {
            if (unaff_x20 != (code *)0x0) {
              (*unaff_x20)();
            }
            lVar8 = *(long *)(unaff_x22 + 0x4c0);
            uVar3 = *(uint *)(&UNK_00004a80 + lVar8);
            if (0 < (int)uVar3) {
              lVar12 = *(long *)(&UNK_00004a88 + lVar8);
              lVar10 = (ulong)uVar3 - 1;
              iVar7 = *(int *)(lVar12 + lVar10 * 0xc);
              puVar2 = (undefined4 *)
                       (&UNK_000038e8 + (ulong)*(uint *)(&UNK_0080c87c + (long)iVar7 * 0xc) + lVar8)
              ;
              if ((0x4fd379bU >> ((long)iVar7 & 0x3fU) & 1) == 0) {
                if ((0x1b02c864U >> ((long)iVar7 & 0x3fU) & 1) != 0) {
                  lVar12 = lVar12 + lVar10 * 0xc;
                  *puVar2 = *(undefined4 *)(lVar12 + 4);
                  puVar2[1] = *(undefined4 *)(lVar12 + 8);
                }
              }
              else {
                *puVar2 = *(undefined4 *)(lVar12 + lVar10 * 0xc + 4);
              }
              *(uint *)(&UNK_00004a80 + lVar8) = (uint)lVar10;
            }
          } while ((int)*psVar14 < unaff_x23[4]);
        }
        psVar14 = (short *)(in_stack_00000018 + in_stack_00000010 * 0x68 + 0x5a);
        if ((int)*psVar14 < unaff_x23[8]) {
          do {
            if (unaff_x20 != (code *)0x0) {
              (*unaff_x20)();
            }
            lVar8 = *(long *)(unaff_x22 + 0x4c0);
            func_0x000f0c0c(*(undefined8 *)(*(long *)(lVar8 + 0x4000) + 0x2a8));
            iVar7 = *(int *)(&UNK_00004a90 + lVar8);
            iVar5 = iVar7 + -1;
            *(int *)(&UNK_00004a90 + lVar8) = iVar5;
            if (iVar5 == 0) {
              lVar8 = *(long *)(unaff_x22 + 0x4c0);
              lVar10 = *(long *)(lVar8 + 0x48);
              if (lVar10 == 0) {
                lVar10 = **(long **)(*(long *)(lVar8 + 0x38) + 0x60);
              }
            }
            else {
              lVar10 = *(long *)(*(long *)(&UNK_00004a98 + lVar8) + (long)(iVar7 + -2) * 8);
              lVar8 = *(long *)(unaff_x22 + 0x4c0);
            }
            *(long *)(&UNK_00003d30 + lVar8) = lVar10;
            fVar15 = *(float *)(lVar8 + 0x40) * *(float *)(lVar10 + 0x14) * *(float *)(lVar10 + 100)
            ;
            fVar16 = 1.0;
            if (1.0 < fVar15) {
              fVar16 = fVar15;
            }
            *(float *)(&UNK_00003d3c + lVar8) = fVar16;
            plVar13 = *(long **)(lVar8 + 0x4000);
            if (plVar13 == (long *)0x0) {
              fVar16 = 0.0;
            }
            else {
              fVar16 = *(float *)(&UNK_00003d3c + *plVar13) * *(float *)(plVar13 + 0x54);
              if (plVar13[0x6f] != 0) {
                fVar16 = fVar16 * *(float *)(plVar13[0x6f] + 0x2a0);
              }
            }
            *(float *)(&UNK_00003d38 + lVar8) = fVar16;
            lVar12 = *(long *)(lVar10 + 0x40);
            *(undefined8 *)(&UNK_00003d40 + lVar8) = *(undefined8 *)(lVar12 + 0x50);
            *(long *)(&UNK_00003f48 + lVar8) = lVar12 + 0x88;
            *(long *)(&UNK_00003d48 + lVar8) = lVar10;
            *(float *)(&UNK_00003d50 + lVar8) = fVar16;
          } while ((int)*psVar14 < unaff_x23[8]);
        }
        psVar14 = (short *)(in_stack_00000018 + in_stack_00000010 * 0x68 + 0x5c);
        if (*psVar14 + 1 < unaff_x23[0xc]) {
          do {
            if (unaff_x20 != (code *)0x0) {
              (*unaff_x20)();
            }
            lVar8 = *(long *)(unaff_x22 + 0x4c0);
            iVar7 = *(int *)(&UNK_00004aa0 + lVar8);
            if (iVar7 != 0) {
              *(int *)(&UNK_00004aa0 + lVar8) = iVar7 + -1;
              if (iVar7 + -1 == 0) {
                uVar9 = 0;
              }
              else {
                uVar9 = *(undefined4 *)
                         (*(long *)(&UNK_00004aa8 + lVar8) +
                         (-(ulong)(iVar7 - 2U >> 0x1f) & 0xfffffff800000000 |
                         (ulong)(iVar7 - 2U) << 3));
              }
              *(undefined4 *)(&UNK_00004978 + lVar8) = uVar9;
            }
          } while (*psVar14 + 1 < unaff_x23[0xc]);
        }
        return;
      }
    } while (unaff_x20 == (code *)0x0);
  } while( true );
}

