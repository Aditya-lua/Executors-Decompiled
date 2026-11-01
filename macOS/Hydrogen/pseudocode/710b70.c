
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

int * FUN_00710b70(ulong param_1)

{
  int *piVar1;
  ulong *puVar2;
  undefined8 *puVar3;
  char *pcVar4;
  undefined8 *puVar5;
  int iVar6;
  uint uVar7;
  int *piVar8;
  long lVar9;
  int *piVar10;
  char *******pppppppcVar11;
  undefined8 uVar12;
  int *extraout_x1;
  long lVar13;
  char *******pppppppcVar14;
  undefined8 *puVar15;
  long lVar16;
  int *piVar17;
  char *pcVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  undefined8 *unaff_x19;
  int *unaff_x20;
  ulong unaff_x21;
  int *piVar22;
  int *piVar23;
  char *pcVar24;
  char ******ppppppcVar25;
  undefined8 uVar26;
  char ******ppppppcVar27;
  char ******ppppppcVar28;
  char ******ppppppcVar29;
  char ******ppppppcVar30;
  char ******ppppppcVar31;
  char ******ppppppcVar32;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined4 uStack_80;
  char *******pppppppcStack_78;
  ulong uStack_70;
  undefined8 uStack_68;
  
  if (unaff_x21 >> 0x3e != 0) {
LAB_00710d40:
    lVar9 = func_0x00017f90();
    piVar10 = (int *)func_0x0070ba50(lVar9 + 0x60,0,1);
    puVar2 = (ulong *)(lVar9 + 0xe0);
    puVar3 = (undefined8 *)(lVar9 + 0x84);
    puVar15 = (undefined8 *)((ulong)&uStack_90 | 4);
    while( true ) {
      if (5 < *piVar10 - 0x11aU || (1 << (ulong)(*piVar10 - 0x11aU & 0x1f) & 0x23U) == 0) {
        return piVar10;
      }
      iVar6 = *(int *)(lVar9 + 0x80);
      if (*(char *)(lVar9 + 1) != '\0') break;
code_r0x00710f10:
      if (iVar6 == 0x11a) {
        iVar6 = func_0x0070aa6c(lVar9 + 0x80);
        if ((iVar6 != 0) && (pcVar24 = *(char **)(lVar9 + 0x98), *pcVar24 == '!')) {
          uVar7 = func_0x0070aa6c(lVar9 + 0x80);
          if (uVar7 == 0) {
LAB_007110d4:
            uStack_90 = CONCAT71(uStack_90._1_7_,*(undefined1 *)(lVar9 + 0x110));
            uVar12 = *puVar3;
            puVar15[1] = *(undefined8 *)(lVar9 + 0x8c);
            *puVar15 = uVar12;
          }
          else {
            uVar20 = (ulong)uVar7;
            while( true ) {
              uVar20 = uVar20 - 1;
              if ((4 < (byte)pcVar24[uVar20 & 0xffffffff] - 9) &&
                 ((byte)pcVar24[uVar20 & 0xffffffff] != 0x20)) break;
              if ((uVar20 & 0xffffffff) == 0) goto LAB_007110d4;
            }
            uStack_90 = CONCAT71(uStack_90._1_7_,*(undefined1 *)(lVar9 + 0x110));
            uVar12 = *puVar3;
            puVar15[1] = *(undefined8 *)(lVar9 + 0x8c);
            *puVar15 = uVar12;
            if (uVar20 < 0x7ffffffffffffff8) {
              if (uVar20 < 0x17) {
                uStack_68 = CONCAT17((char)uVar20,(undefined7)uStack_68);
                pppppppcVar11 = (char *******)&pppppppcStack_78;
                if (uVar20 == 0) goto code_r0x00711010;
code_r0x00710fa4:
                pcVar4 = pcVar24 + 1;
                if ((uVar20 < 0x40) ||
                   ((char *)((long)pppppppcVar11 + ~(ulong)pcVar24) <
                    &segment_command_00000020.vmsize)) {
                  pppppppcVar14 = pppppppcVar11;
                  pcVar18 = pcVar4;
code_r0x00710fc8:
                  pppppppcVar11 = pppppppcVar14;
                  do {
                    pcVar24 = pcVar18 + 1;
                    pppppppcVar14 = (char *******)((long)pppppppcVar11 + 1);
                    *(char *)pppppppcVar11 = *pcVar18;
                    pppppppcVar11 = pppppppcVar14;
                    pcVar18 = pcVar24;
                  } while (pcVar24 != pcVar4 + uVar20);
                }
                else {
                  uVar21 = uVar20 & 0xffffffffffffffc0;
                  pcVar18 = pcVar4 + uVar21;
                  pppppppcVar14 = (char *******)((long)pppppppcVar11 + uVar21);
                  pcVar24 = pcVar24 + 0x21;
                  pppppppcVar11 = pppppppcVar11 + 4;
                  uVar19 = uVar21;
                  do {
                    ppppppcVar25 = *(char *******)(pcVar24 + -0x20);
                    ppppppcVar28 = *(char *******)(pcVar24 + -8);
                    ppppppcVar27 = *(char *******)(pcVar24 + -0x10);
                    ppppppcVar30 = *(char *******)(pcVar24 + 8);
                    ppppppcVar29 = *(char *******)pcVar24;
                    ppppppcVar32 = *(char *******)(pcVar24 + 0x18);
                    ppppppcVar31 = *(char *******)(pcVar24 + 0x10);
                    pppppppcVar11[-3] = *(char *******)(pcVar24 + -0x18);
                    pppppppcVar11[-4] = ppppppcVar25;
                    pppppppcVar11[-1] = ppppppcVar28;
                    pppppppcVar11[-2] = ppppppcVar27;
                    pppppppcVar11[1] = ppppppcVar30;
                    *pppppppcVar11 = ppppppcVar29;
                    pppppppcVar11[3] = ppppppcVar32;
                    pppppppcVar11[2] = ppppppcVar31;
                    uVar19 = uVar19 - 0x40;
                    pcVar24 = pcVar24 + 0x40;
                    pppppppcVar11 = pppppppcVar11 + 8;
                  } while (uVar19 != 0);
                  if (uVar20 != uVar21) goto code_r0x00710fc8;
                }
              }
              else {
                uVar19 = (uVar20 & 0xfffffffffffffff8) + 8;
                if ((uVar20 | 7) != 0x17) {
                  uVar19 = uVar20 | 7;
                }
                pppppppcVar11 = (char *******)__Znwm(uVar19 + 1);
                uStack_68 = uVar19 + 1 | 0x8000000000000000;
                pppppppcStack_78 = pppppppcVar11;
                uStack_70 = uVar20;
                if (uVar20 != 0) goto code_r0x00710fa4;
code_r0x00711010:
                pppppppcVar14 = pppppppcVar11;
              }
              *(char *)pppppppcVar14 = '\0';
              puVar5 = *(undefined8 **)(lVar9 + 0x100);
              if (puVar5 < *(undefined8 **)(lVar9 + 0x108)) {
                *(undefined4 *)(puVar5 + 2) = uStack_80;
                puVar5[1] = uStack_88;
                *puVar5 = uStack_90;
                puVar5[5] = uStack_68;
                puVar5[4] = uStack_70;
                puVar5[3] = pppppppcStack_78;
                *(undefined8 **)(lVar9 + 0x100) = puVar5 + 6;
              }
              else {
                uVar12 = func_0x00725bcc(lVar9 + 0xf8,&uStack_90);
                *(undefined8 *)(lVar9 + 0x100) = uVar12;
                if ((long)uStack_68 < 0) {
                  __ZdlPv(pppppppcStack_78);
                }
              }
              goto LAB_00710dbc;
            }
          }
          func_0x0001748c(&pppppppcStack_78);
          goto LAB_007110f0;
        }
      }
      else if (iVar6 == 0x11f) {
        return piVar10;
      }
LAB_00710dbc:
      piVar10 = (int *)func_0x0070ba50(lVar9 + 0x60,0,0);
    }
    uStack_88 = *(undefined8 *)(lVar9 + 0x8c);
    uStack_90 = *puVar3;
    piVar8 = *(int **)(lVar9 + 0xe8);
    if (piVar8 < *(int **)(lVar9 + 0xf0)) {
      *piVar8 = iVar6;
      *(undefined8 *)(piVar8 + 3) = uStack_88;
      *(undefined8 *)(piVar8 + 1) = uStack_90;
      piVar22 = piVar8 + 5;
code_r0x00710f08:
      *(int **)(lVar9 + 0xe8) = piVar22;
      iVar6 = *(int *)(lVar9 + 0x80);
      goto code_r0x00710f10;
    }
    piVar23 = (int *)*puVar2;
    lVar16 = (long)piVar8 - (long)piVar23 >> 2;
    uVar20 = lVar16 * -0x3333333333333333 + 1;
    if (uVar20 < 0xccccccccccccccd) {
      lVar13 = (long)*(int **)(lVar9 + 0xf0) - (long)piVar23 >> 2;
      uVar19 = lVar13 * -0x6666666666666666;
      if (uVar19 <= uVar20) {
        uVar19 = uVar20;
      }
      if (0x666666666666665 < (ulong)(lVar13 * -0x3333333333333333)) {
        uVar19 = 0xccccccccccccccc;
      }
      if (uVar19 == 0) {
        piVar10 = (int *)0x0;
      }
      else {
        if (0xccccccccccccccc < uVar19) goto LAB_007110f8;
        piVar10 = (int *)__Znwm(uVar19 * 0x14);
      }
      piVar22 = piVar10 + lVar16;
      *piVar22 = iVar6;
      uVar12 = *puVar3;
      *(undefined8 *)(piVar22 + 3) = *(undefined8 *)(lVar9 + 0x8c);
      *(undefined8 *)(piVar22 + 1) = uVar12;
      piVar17 = piVar22;
      if (piVar8 != piVar23) {
        do {
          uVar26 = *(undefined8 *)(piVar8 + -3);
          uVar12 = *(undefined8 *)(piVar8 + -5);
          piVar1 = piVar8 + -1;
          piVar8 = piVar8 + -5;
          piVar17[-1] = *piVar1;
          *(undefined8 *)(piVar17 + -3) = uVar26;
          *(undefined8 *)(piVar17 + -5) = uVar12;
          piVar17 = piVar17 + -5;
        } while (piVar8 != piVar23);
        piVar8 = (int *)*puVar2;
      }
      piVar22 = piVar22 + 5;
      *(int **)(lVar9 + 0xe0) = piVar17;
      *(int **)(lVar9 + 0xe8) = piVar22;
      *(int **)(lVar9 + 0xf0) = piVar10 + uVar19 * 5;
      if (piVar8 != (int *)0x0) {
        piVar10 = (int *)__ZdlPv(piVar8);
      }
      goto code_r0x00710f08;
    }
LAB_007110f0:
    func_0x00017f90(puVar2);
LAB_007110f8:
    uVar12 = func_0x00017514();
    if ((long)uStack_68 < 0) {
      __ZdlPv(pppppppcStack_78);
    }
    __Unwind_Resume(uVar12);
    uVar7 = *extraout_x1 - 0x126;
    if (uVar7 < 0x11 && (1 << (ulong)(uVar7 & 0x1f) & 0x10007U) != 0 || *extraout_x1 == 0) {
      return (int *)((long)&MACH_HEADER.magic + 1);
    }
    return (int *)0x0;
  }
  uVar20 = (long)param_1 >> 1;
  if ((ulong)((long)param_1 >> 1) <= unaff_x21) {
    uVar20 = unaff_x21;
  }
  if (0x7ffffffffffffffb < param_1) {
    uVar20 = 0x3fffffffffffffff;
  }
  if (uVar20 >> 0x3e != 0) goto LAB_00710d40;
  piVar8 = (int *)__Znwm(uVar20 * 4);
  *unaff_x19 = piVar8;
  unaff_x19[2] = piVar8 + uVar20;
  iVar6 = *unaff_x20;
  uVar20 = unaff_x21 - 1 & 0x3fffffffffffffff;
  piVar10 = piVar8;
  if (0xe < uVar20) {
    uVar20 = uVar20 + 1;
    uVar21 = uVar20 & 0x7ffffffffffffff0;
    uVar12 = CONCAT44(iVar6,iVar6);
    uVar26 = CONCAT44(iVar6,iVar6);
    piVar10 = piVar8 + 8;
    uVar19 = uVar21;
    do {
      *(undefined8 *)(piVar10 + -6) = uVar26;
      *(undefined8 *)(piVar10 + -8) = uVar12;
      *(undefined8 *)(piVar10 + -2) = uVar26;
      *(undefined8 *)(piVar10 + -4) = uVar12;
      *(undefined8 *)(piVar10 + 2) = uVar26;
      *(undefined8 *)piVar10 = uVar12;
      *(undefined8 *)(piVar10 + 6) = uVar26;
      *(undefined8 *)(piVar10 + 4) = uVar12;
      uVar19 = uVar19 - 0x10;
      piVar10 = piVar10 + 0x10;
    } while (uVar19 != 0);
    piVar10 = piVar8 + uVar21;
    if (uVar20 == uVar21) goto code_r0x00710d2c;
  }
  do {
    piVar22 = piVar10 + 1;
    *piVar10 = iVar6;
    piVar10 = piVar22;
  } while (piVar22 != piVar8 + unaff_x21);
code_r0x00710d2c:
  unaff_x19[1] = piVar8 + unaff_x21;
  return piVar8;
}

