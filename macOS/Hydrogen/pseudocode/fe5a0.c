
void FUN_000fe5a0(long param_1,undefined8 param_2)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  int *piVar9;
  int *piVar10;
  int iVar11;
  int iVar12;
  int iVar13;
  int iVar14;
  uint *puVar15;
  long lVar16;
  long in_x10;
  int in_w11;
  int iVar17;
  int iVar18;
  int *piVar19;
  int *in_x12;
  int *in_x13;
  int *piVar20;
  int *in_x15;
  int *piVar21;
  long unaff_x19;
  int unaff_w20;
  int *unaff_x21;
  int unaff_w22;
  long unaff_x23;
  int iVar22;
  int iVar23;
  int iVar24;
  int *piVar25;
  uint in_stack_00000010;
  int *in_stack_00000018;
  
code_r0x000fe5a0:
  piVar21 = in_x12 + 2;
  in_x12 = *(int **)piVar21;
  if (in_x12 != (int *)0x0) goto LAB_000fe580;
LAB_000fe5b4:
  *(int **)(in_x13 + 2) = in_x15;
  if (in_w11 <= *in_x15) goto LAB_000fe5c8;
code_r0x000fe5c4:
  *in_x15 = in_w11;
LAB_000fe5c8:
  lVar16 = unaff_x19 + param_1 * in_x10;
  *(int *)(lVar16 + 0xc) = unaff_w20;
  *(int *)(lVar16 + 0x10) = unaff_w22;
  do {
    while( true ) {
      param_1 = param_1 + 1;
      if (param_1 == unaff_x23) {
        if (1 < in_stack_00000010) {
          _qsort();
        }
        if (0 < (int)in_stack_00000010) {
          puVar15 = (uint *)(unaff_x19 + 0x14);
          do {
            if (puVar15[-2] == 0x7fffffff) {
              *puVar15 = (uint)(puVar15[-1] != 0x7fffffff);
            }
            else {
              *puVar15 = 1;
            }
            unaff_x23 = unaff_x23 + -1;
            puVar15 = puVar15 + 6;
          } while (unaff_x23 != 0);
        }
        return;
      }
      iVar1 = *(int *)(unaff_x19 + param_1 * in_x10 + 4);
      if ((iVar1 != 0) && (iVar2 = *(int *)(unaff_x19 + param_1 * in_x10 + 8), iVar2 != 0)) break;
      lVar16 = unaff_x19 + param_1 * in_x10;
      *(undefined4 *)(lVar16 + 0xc) = 0;
      *(undefined4 *)(lVar16 + 0x10) = 0;
    }
    iVar3 = unaff_x21[2];
    iVar7 = 0;
    if (iVar3 != 0) {
      iVar7 = (iVar1 + iVar3 + -1) / iVar3;
    }
    iVar7 = iVar7 * iVar3;
    iVar3 = *unaff_x21;
    if ((iVar7 <= iVar3) && (iVar4 = unaff_x21[1], iVar2 <= iVar4)) {
      piVar21 = *(int **)in_stack_00000018;
      iVar11 = *piVar21;
      iVar12 = iVar11 + iVar7;
      if (iVar3 < iVar12) {
        piVar20 = (int *)0x0;
        unaff_w20 = 0;
        iVar14 = unaff_x21[4];
        unaff_w22 = 0x40000000;
        iVar8 = 0x40000000;
joined_r0x000fe3e4:
        if (iVar14 == 1) {
          piVar10 = piVar21;
          if (iVar11 < iVar7) {
            do {
              piVar10 = *(int **)(piVar10 + 2);
            } while (*piVar10 < iVar7);
          }
          piVar9 = in_stack_00000018;
          do {
            iVar3 = *piVar10;
            iVar12 = iVar3 - iVar7;
            piVar25 = piVar9;
            piVar19 = piVar21;
            do {
              piVar21 = piVar19;
              piVar9 = piVar25;
              piVar19 = *(int **)(piVar21 + 2);
              piVar25 = piVar21 + 2;
            } while (*piVar19 <= iVar12);
            if (*piVar21 < iVar3) {
              iVar11 = 0;
              iVar22 = 0;
              piVar25 = piVar21;
              iVar23 = *piVar21;
              iVar24 = 0;
              do {
                while( true ) {
                  iVar14 = piVar25[1];
                  if (iVar14 - iVar24 == 0 || iVar14 < iVar24) break;
                  piVar25 = *(int **)(piVar25 + 2);
                  iVar13 = *piVar25;
                  if (iVar23 < iVar12) {
                    iVar23 = iVar12;
                  }
                  iVar11 = (iVar14 - iVar24) * iVar22 + iVar11;
                  iVar22 = (iVar13 - iVar23) + iVar22;
                  iVar23 = iVar13;
                  iVar24 = iVar14;
                  if (iVar3 <= iVar13) goto code_r0x000fe4f8;
                }
                piVar25 = *(int **)(piVar25 + 2);
                iVar17 = *piVar25;
                iVar13 = iVar7 - iVar22;
                if ((iVar17 - iVar23) + iVar22 <= iVar7) {
                  iVar13 = iVar17 - iVar23;
                }
                iVar11 = iVar13 * (iVar24 - iVar14) + iVar11;
                iVar22 = iVar13 + iVar22;
                iVar23 = iVar17;
                iVar14 = iVar24;
              } while (iVar17 < iVar3);
            }
            else {
              iVar14 = 0;
              iVar11 = 0;
            }
code_r0x000fe4f8:
            if (iVar14 + iVar2 <= iVar4) {
              if (iVar14 <= unaff_w22) {
                if ((unaff_w22 <= iVar14) && (iVar8 <= iVar11)) {
                  if ((iVar11 != iVar8) || (unaff_w20 <= iVar12)) goto code_r0x000fe420;
                }
                piVar20 = piVar9;
                unaff_w20 = iVar12;
                unaff_w22 = iVar14;
                iVar8 = iVar11;
              }
            }
code_r0x000fe420:
            piVar10 = *(int **)(piVar10 + 2);
          } while (piVar10 != (int *)0x0);
        }
        if (piVar20 == (int *)0x0) goto code_r0x000fe5e8;
        iVar2 = unaff_w22 + iVar2;
      }
      else {
        iVar14 = unaff_x21[4];
        if (0 < iVar7) {
          unaff_w22 = 0x40000000;
          iVar8 = 0x40000000;
          piVar10 = piVar21;
          piVar9 = in_stack_00000018;
          piVar25 = (int *)0x0;
          iVar22 = iVar11;
          do {
            iVar23 = 0;
            iVar24 = 0;
            piVar20 = piVar10;
            iVar13 = iVar22;
            iVar17 = 0;
            do {
              while( true ) {
                iVar18 = piVar20[1];
                if (iVar18 - iVar17 != 0 && iVar17 <= iVar18) break;
                piVar20 = *(int **)(piVar20 + 2);
                iVar6 = *piVar20;
                iVar5 = iVar7 - iVar24;
                if ((iVar6 - iVar13) + iVar24 <= iVar7) {
                  iVar5 = iVar6 - iVar13;
                }
                iVar23 = iVar5 * (iVar17 - iVar18) + iVar23;
                iVar24 = iVar5 + iVar24;
                iVar13 = iVar6;
                iVar18 = iVar17;
                if (iVar12 <= iVar6) goto code_r0x000fe334;
              }
              piVar20 = *(int **)(piVar20 + 2);
              iVar5 = *piVar20;
              iVar6 = iVar22;
              if (iVar22 <= iVar13) {
                iVar6 = iVar13;
              }
              iVar23 = (iVar18 - iVar17) * iVar24 + iVar23;
              iVar24 = (iVar5 - iVar6) + iVar24;
              iVar13 = iVar5;
              iVar17 = iVar18;
            } while (iVar5 < iVar12);
code_r0x000fe334:
            piVar20 = piVar25;
            if (iVar14 == 0) {
              piVar20 = piVar9;
              if (unaff_w22 <= iVar18) {
                piVar20 = piVar25;
                iVar18 = unaff_w22;
              }
              unaff_w22 = iVar18;
            }
            else if (iVar18 + iVar2 <= iVar4) {
              if (iVar18 < unaff_w22) {
code_r0x000fe358:
                piVar20 = piVar9;
                unaff_w22 = iVar18;
                iVar8 = iVar23;
              }
              else if (iVar18 == unaff_w22) {
                if (iVar23 < iVar8) goto code_r0x000fe358;
              }
            }
            piVar9 = piVar10 + 2;
            piVar10 = *(int **)piVar9;
            iVar22 = *piVar10;
            iVar12 = iVar22 + iVar7;
            piVar25 = piVar20;
          } while (iVar12 <= iVar3);
code_r0x000fe3c4:
          if (piVar20 == (int *)0x0) {
            unaff_w20 = 0;
          }
          else {
            unaff_w20 = **(int **)piVar20;
          }
          goto joined_r0x000fe3e4;
        }
        if (iVar14 != 0) {
          piVar20 = (int *)0x0;
          unaff_w22 = 0x40000000;
          iVar8 = 0x40000000;
          piVar10 = piVar21;
          piVar9 = in_stack_00000018;
          do {
            if ((unaff_w22 != 0) || (iVar8 != 0)) {
              iVar8 = 0;
              unaff_w22 = 0;
              piVar20 = piVar9;
            }
            piVar9 = piVar10 + 2;
            piVar10 = *(int **)piVar9;
          } while (*piVar10 + iVar7 <= iVar3);
          goto code_r0x000fe3c4;
        }
        unaff_w22 = 0;
        unaff_w20 = iVar11;
        piVar20 = in_stack_00000018;
      }
      if ((iVar2 <= iVar4) && (in_x13 = *(int **)(unaff_x21 + 8), in_x13 != (int *)0x0)) break;
    }
code_r0x000fe5e8:
    *(undefined8 *)(unaff_x19 + param_1 * in_x10 + 0xc) = param_2;
  } while( true );
  *in_x13 = unaff_w20;
  in_x13[1] = iVar2;
  *(undefined8 *)(unaff_x21 + 8) = *(undefined8 *)(in_x13 + 2);
  in_x15 = *(int **)piVar20;
  if (*in_x15 < unaff_w20) {
    piVar20 = in_x15 + 2;
    in_x15 = *(int **)piVar20;
  }
  *(int **)piVar20 = in_x13;
  piVar21 = in_x15 + 2;
  in_x12 = *(int **)piVar21;
  in_w11 = unaff_w20 + iVar1;
  if (in_x12 == (int *)0x0) goto LAB_000fe5b4;
LAB_000fe580:
  if (*in_x12 <= in_w11) {
    *(undefined8 *)piVar21 = *(undefined8 *)(unaff_x21 + 8);
    *(int **)(unaff_x21 + 8) = in_x15;
    in_x15 = in_x12;
    goto code_r0x000fe5a0;
  }
  *(int **)(in_x13 + 2) = in_x15;
  if (*in_x15 < in_w11) goto code_r0x000fe5c4;
  goto LAB_000fe5c8;
}

