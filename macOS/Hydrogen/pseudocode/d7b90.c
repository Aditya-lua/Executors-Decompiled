
void FUN_000d7b90(void)

{
  int *piVar1;
  int *piVar2;
  undefined4 *puVar3;
  uint uVar4;
  uint uVar5;
  int iVar6;
  short sVar7;
  int iVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  undefined4 uVar12;
  int *piVar13;
  long lVar14;
  long *plVar15;
  code *unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long lVar16;
  short *psVar17;
  long unaff_x27;
  float fVar18;
  float fVar19;
  undefined8 uVar20;
  
  do {
    (*unaff_x20)();
    do {
      func_0x0012f400();
      lVar9 = *(long *)(&UNK_00004e18 + unaff_x27);
      if ((lVar9 == 0) ||
         ((*(long *)(lVar9 + 0x180) != *(long *)(unaff_x27 + 0x4000) &&
          (*(long *)(lVar9 + 0x188) != *(long *)(unaff_x27 + 0x4000))))) {
        piVar1 = (int *)(unaff_x27 + unaff_x23);
        lVar16 = *(long *)(unaff_x27 + 0x4000);
        lVar9 = *(long *)(&UNK_00003fd8 + unaff_x27);
        iVar8 = *(int *)(&UNK_00003fd0 + unaff_x27);
        if (*(long *)(&UNK_00004e80 + unaff_x27) != 0) {
          if (unaff_x20 == (code *)0x0) {
            do {
              func_0x00126b68();
            } while (*(long *)(&UNK_00004e80 + unaff_x27) != 0);
          }
          else {
            do {
              (*unaff_x20)();
              func_0x00126b68();
            } while (*(long *)(&UNK_00004e80 + unaff_x27) != 0);
          }
        }
        lVar10 = (long)iVar8 + -1;
        if (0 < *(int *)(lVar16 + 0x198)) {
          if (unaff_x20 == (code *)0x0) {
            do {
              func_0x00123710();
            } while (0 < *(int *)(lVar16 + 0x198));
          }
          else {
            do {
              (*unaff_x20)();
              func_0x00123710();
            } while (0 < *(int *)(lVar16 + 0x198));
          }
        }
        psVar17 = (short *)(lVar9 + lVar10 * 0x68 + 0x5e);
        if ((int)*psVar17 < piVar1[0x14]) {
          if (unaff_x20 == (code *)0x0) {
            do {
              func_0x000d818c();
            } while ((int)*psVar17 < piVar1[0x14]);
          }
          else {
            do {
              (*unaff_x20)();
              func_0x000d818c();
            } while ((int)*psVar17 < piVar1[0x14]);
          }
        }
        iVar8 = *(int *)(lVar16 + 0x100);
        while (1 < iVar8) {
          if (unaff_x20 != (code *)0x0) {
            (*unaff_x20)();
          }
          lVar11 = *(long *)(*(long *)(unaff_x22 + 0x4c0) + 0x4000);
          *(int *)(lVar11 + 0x100) = *(int *)(lVar11 + 0x100) + -1;
          iVar8 = *(int *)(lVar16 + 0x100);
        }
        psVar17 = (short *)(lVar9 + lVar10 * 0x68 + 100);
        if (*psVar17 < (short)piVar1[0x50d]) {
          do {
            if (unaff_x20 != (code *)0x0) {
              (*unaff_x20)();
            }
            lVar16 = *(long *)(unaff_x22 + 0x4c0);
            *(short *)(&UNK_00005ea4 + lVar16) = *(short *)(&UNK_00005ea4 + lVar16) + -1;
            uVar4 = *(uint *)(&UNK_0000497c + lVar16);
            iVar8 = *(int *)(&UNK_00004ab0 + lVar16);
            *(int *)(&UNK_00004ab0 + lVar16) = iVar8 + -1;
            uVar5 = *(uint *)(*(long *)(&UNK_00004ab8 + lVar16) + (long)(iVar8 + -2) * 4);
            *(uint *)(&UNK_0000497c + lVar16) = uVar5;
            if (((uVar4 >> 2 & 1) != 0) && ((uVar5 >> 2 & 1) == 0)) {
              *(undefined4 *)(&UNK_000038e8 + lVar16) = *(undefined4 *)(&UNK_00005ea0 + lVar16);
            }
          } while (*psVar17 < (short)piVar1[0x50d]);
        }
        psVar17 = (short *)(lVar9 + lVar10 * 0x68 + 0x56);
        iVar8 = *piVar1;
        if (*psVar17 < iVar8) {
          do {
            if (unaff_x20 != (code *)0x0) {
              func_0x000bc0c4(*(undefined4 *)
                               (*(long *)(&UNK_00004a78 + unaff_x27) + (long)(iVar8 + -1) * 0x14));
              (*unaff_x20)();
            }
            lVar16 = *(long *)(unaff_x22 + 0x4c0);
            piVar2 = (int *)(&UNK_00004a70 + lVar16);
            if (0 < *piVar2) {
              piVar13 = (int *)(*(long *)(&UNK_00004a78 + lVar16) + (ulong)(*piVar2 - 1) * 0x14);
              lVar16 = lVar16 + (long)*piVar13 * 0x10;
              uVar20 = *(undefined8 *)(piVar13 + 1);
              *(undefined8 *)(&UNK_000039d4 + lVar16) = *(undefined8 *)(piVar13 + 3);
              *(undefined8 *)(&UNK_000039cc + lVar16) = uVar20;
              *piVar2 = *piVar2 + -1;
            }
            iVar8 = *piVar1;
          } while (*psVar17 < iVar8);
        }
        psVar17 = (short *)(lVar9 + lVar10 * 0x68 + 0x60);
        sVar7 = *psVar17;
        if ((int)sVar7 < piVar1[0x10]) {
          do {
            if (unaff_x20 != (code *)0x0) {
              (*unaff_x20)();
              sVar7 = *psVar17;
            }
            lVar16 = *(long *)(unaff_x22 + 0x4c0);
            iVar8 = *(int *)(&UNK_00004ab0 + lVar16);
            *(int *)(&UNK_00004ab0 + lVar16) = iVar8 + -1;
            *(undefined4 *)(&UNK_0000497c + lVar16) =
                 *(undefined4 *)(*(long *)(&UNK_00004ab8 + lVar16) + (long)(iVar8 + -2) * 4);
          } while ((int)sVar7 < piVar1[0x10]);
        }
        psVar17 = (short *)(lVar9 + lVar10 * 0x68 + 0x58);
        if ((int)*psVar17 < piVar1[4]) {
          do {
            if (unaff_x20 != (code *)0x0) {
              (*unaff_x20)();
            }
            lVar16 = *(long *)(unaff_x22 + 0x4c0);
            uVar4 = *(uint *)(&UNK_00004a80 + lVar16);
            if (0 < (int)uVar4) {
              lVar14 = *(long *)(&UNK_00004a88 + lVar16);
              lVar11 = (ulong)uVar4 - 1;
              iVar8 = *(int *)(lVar14 + lVar11 * 0xc);
              puVar3 = (undefined4 *)
                       (&UNK_000038e8 + (ulong)*(uint *)(&UNK_0080c87c + (long)iVar8 * 0xc) + lVar16
                       );
              if ((0x4fd379bU >> ((long)iVar8 & 0x3fU) & 1) == 0) {
                if ((0x1b02c864U >> ((long)iVar8 & 0x3fU) & 1) != 0) {
                  lVar14 = lVar14 + lVar11 * 0xc;
                  *puVar3 = *(undefined4 *)(lVar14 + 4);
                  puVar3[1] = *(undefined4 *)(lVar14 + 8);
                }
              }
              else {
                *puVar3 = *(undefined4 *)(lVar14 + lVar11 * 0xc + 4);
              }
              *(uint *)(&UNK_00004a80 + lVar16) = (uint)lVar11;
            }
          } while ((int)*psVar17 < piVar1[4]);
        }
        psVar17 = (short *)(lVar9 + lVar10 * 0x68 + 0x5a);
        if ((int)*psVar17 < piVar1[8]) {
          do {
            if (unaff_x20 != (code *)0x0) {
              (*unaff_x20)();
            }
            lVar16 = *(long *)(unaff_x22 + 0x4c0);
            func_0x000f0c0c(*(undefined8 *)(*(long *)(lVar16 + 0x4000) + 0x2a8));
            iVar8 = *(int *)(&UNK_00004a90 + lVar16);
            iVar6 = iVar8 + -1;
            *(int *)(&UNK_00004a90 + lVar16) = iVar6;
            if (iVar6 == 0) {
              lVar16 = *(long *)(unaff_x22 + 0x4c0);
              lVar11 = *(long *)(lVar16 + 0x48);
              if (lVar11 == 0) {
                lVar11 = **(long **)(*(long *)(lVar16 + 0x38) + 0x60);
              }
            }
            else {
              lVar11 = *(long *)(*(long *)(&UNK_00004a98 + lVar16) + (long)(iVar8 + -2) * 8);
              lVar16 = *(long *)(unaff_x22 + 0x4c0);
            }
            *(long *)(&UNK_00003d30 + lVar16) = lVar11;
            fVar18 = *(float *)(lVar16 + 0x40) * *(float *)(lVar11 + 0x14) *
                     *(float *)(lVar11 + 100);
            fVar19 = 1.0;
            if (1.0 < fVar18) {
              fVar19 = fVar18;
            }
            *(float *)(&UNK_00003d3c + lVar16) = fVar19;
            plVar15 = *(long **)(lVar16 + 0x4000);
            if (plVar15 == (long *)0x0) {
              fVar19 = 0.0;
            }
            else {
              fVar19 = *(float *)(&UNK_00003d3c + *plVar15) * *(float *)(plVar15 + 0x54);
              if (plVar15[0x6f] != 0) {
                fVar19 = fVar19 * *(float *)(plVar15[0x6f] + 0x2a0);
              }
            }
            *(float *)(&UNK_00003d38 + lVar16) = fVar19;
            lVar14 = *(long *)(lVar11 + 0x40);
            *(undefined8 *)(&UNK_00003d40 + lVar16) = *(undefined8 *)(lVar14 + 0x50);
            *(long *)(&UNK_00003f48 + lVar16) = lVar14 + 0x88;
            *(long *)(&UNK_00003d48 + lVar16) = lVar11;
            *(float *)(&UNK_00003d50 + lVar16) = fVar19;
          } while ((int)*psVar17 < piVar1[8]);
        }
        psVar17 = (short *)(lVar9 + lVar10 * 0x68 + 0x5c);
        if (*psVar17 + 1 < piVar1[0xc]) {
          do {
            if (unaff_x20 != (code *)0x0) {
              (*unaff_x20)();
            }
            lVar9 = *(long *)(unaff_x22 + 0x4c0);
            iVar8 = *(int *)(&UNK_00004aa0 + lVar9);
            if (iVar8 != 0) {
              *(int *)(&UNK_00004aa0 + lVar9) = iVar8 + -1;
              if (iVar8 + -1 == 0) {
                uVar12 = 0;
              }
              else {
                uVar12 = *(undefined4 *)
                          (*(long *)(&UNK_00004aa8 + lVar9) +
                          (-(ulong)(iVar8 - 2U >> 0x1f) & 0xfffffff800000000 |
                          (ulong)(iVar8 - 2U) << 3));
              }
              *(undefined4 *)(&UNK_00004978 + lVar9) = uVar12;
            }
          } while (*psVar17 + 1 < piVar1[0xc]);
        }
        return;
      }
    } while (unaff_x20 == (code *)0x0);
  } while( true );
}

