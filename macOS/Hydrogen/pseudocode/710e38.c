
int * FUN_00710e38(int *param_1)

{
  int *piVar1;
  char *pcVar2;
  undefined8 *puVar3;
  int iVar4;
  uint uVar5;
  int *piVar6;
  undefined8 uVar7;
  int *extraout_x1;
  ulong uVar8;
  ulong uVar9;
  char *pcVar10;
  int *piVar11;
  char *pcVar12;
  char *pcVar13;
  long in_x10;
  ulong uVar14;
  long unaff_x19;
  ulong *unaff_x21;
  int unaff_w23;
  int *piVar15;
  long unaff_x24;
  int *unaff_x25;
  int *unaff_x26;
  char *pcVar16;
  ulong unaff_x27;
  undefined8 *unaff_x28;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 in_stack_00000008;
  char *in_stack_00000010;
  undefined8 *in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined4 in_stack_00000030;
  char *in_stack_00000038;
  ulong in_stack_00000040;
  undefined7 uStack0000000000000048;
  
code_r0x00710e38:
  uVar9 = unaff_x24 + 1;
  if (unaff_x27 < uVar9) {
LAB_007110f0:
    func_0x00017f90();
LAB_007110f8:
    uVar7 = func_0x00017514();
    if ((long)_uStack0000000000000048 < 0) {
      __ZdlPv(in_stack_00000038);
    }
    __Unwind_Resume(uVar7);
    uVar5 = *extraout_x1 - 0x126;
    if (uVar5 < 0x11 && (1 << (ulong)(uVar5 & 0x1f) & 0x10007U) != 0 || *extraout_x1 == 0) {
      return (int *)((long)&MACH_HEADER.magic + 1);
    }
    return (int *)0x0;
  }
  uVar8 = ((long)param_1 - (long)unaff_x26 >> 2) * in_x10;
  uVar14 = uVar8 * 2;
  if (uVar14 <= uVar9) {
    uVar14 = uVar9;
  }
  if (0x666666666666665 < uVar8) {
    uVar14 = 0xccccccccccccccc;
  }
  if (uVar14 == 0) {
    piVar6 = (int *)0x0;
  }
  else {
    if (0xccccccccccccccc < uVar14) goto LAB_007110f8;
    piVar6 = (int *)__Znwm(uVar14 * 0x14);
  }
  piVar15 = piVar6 + unaff_x24 * 5;
  *piVar15 = unaff_w23;
  uVar7 = *unaff_x28;
  *(undefined8 *)(piVar15 + 3) = unaff_x28[1];
  *(undefined8 *)(piVar15 + 1) = uVar7;
  piVar11 = piVar15;
  if (unaff_x25 != unaff_x26) {
    do {
      uVar17 = *(undefined8 *)(unaff_x25 + -3);
      uVar7 = *(undefined8 *)(unaff_x25 + -5);
      piVar1 = unaff_x25 + -1;
      unaff_x25 = unaff_x25 + -5;
      piVar11[-1] = *piVar1;
      *(undefined8 *)(piVar11 + -3) = uVar17;
      *(undefined8 *)(piVar11 + -5) = uVar7;
      piVar11 = piVar11 + -5;
    } while (unaff_x25 != unaff_x26);
    unaff_x25 = (int *)*unaff_x21;
  }
  piVar15 = piVar15 + 5;
  *(int **)(unaff_x19 + 0xe0) = piVar11;
  *(int **)(unaff_x19 + 0xe8) = piVar15;
  *(int **)(unaff_x19 + 0xf0) = piVar6 + uVar14 * 5;
  if (unaff_x25 != (int *)0x0) {
    piVar6 = (int *)__ZdlPv(unaff_x25);
  }
  unaff_x27 = 0xccccccccccccccc;
  do {
    *(int **)(unaff_x19 + 0xe8) = piVar15;
    unaff_w23 = *(int *)(unaff_x19 + 0x80);
    do {
      if (unaff_w23 == 0x11a) {
        iVar4 = func_0x0070aa6c();
        if ((iVar4 != 0) && (pcVar16 = *(char **)(unaff_x19 + 0x98), *pcVar16 == '!')) {
          uVar5 = func_0x0070aa6c();
          if (uVar5 == 0) {
LAB_007110d4:
            uStack0000000000000020 =
                 CONCAT71(uStack0000000000000020._1_7_,*(undefined1 *)(unaff_x19 + 0x110));
            uVar7 = *unaff_x28;
            in_stack_00000018[1] = unaff_x28[1];
            *in_stack_00000018 = uVar7;
          }
          else {
            uVar9 = (ulong)uVar5;
            while( true ) {
              uVar9 = uVar9 - 1;
              if ((4 < (byte)pcVar16[uVar9 & 0xffffffff] - 9) &&
                 ((byte)pcVar16[uVar9 & 0xffffffff] != 0x20)) break;
              if ((uVar9 & 0xffffffff) == 0) goto LAB_007110d4;
            }
            uStack0000000000000020 =
                 CONCAT71(uStack0000000000000020._1_7_,*(undefined1 *)(unaff_x19 + 0x110));
            uVar7 = *unaff_x28;
            in_stack_00000018[1] = unaff_x28[1];
            *in_stack_00000018 = uVar7;
            if (uVar9 < 0x7ffffffffffffff8) {
              if (uVar9 < 0x17) {
                _uStack0000000000000048 = CONCAT17((char)uVar9,uStack0000000000000048);
                pcVar13 = in_stack_00000010;
                if (uVar9 == 0) goto code_r0x00711010;
code_r0x00710fa4:
                pcVar2 = pcVar16 + 1;
                if ((uVar9 < 0x40) || (pcVar13 + ~(ulong)pcVar16 < &segment_command_00000020.vmsize)
                   ) {
                  pcVar10 = pcVar13;
                  pcVar12 = pcVar2;
code_r0x00710fc8:
                  pcVar16 = pcVar10;
                  do {
                    pcVar13 = pcVar12 + 1;
                    pcVar10 = pcVar16 + 1;
                    *pcVar16 = *pcVar12;
                    pcVar16 = pcVar10;
                    pcVar12 = pcVar13;
                  } while (pcVar13 != pcVar2 + uVar9);
                }
                else {
                  uVar8 = uVar9 & 0xffffffffffffffc0;
                  pcVar12 = pcVar2 + uVar8;
                  pcVar10 = pcVar13 + uVar8;
                  pcVar16 = pcVar16 + 0x21;
                  pcVar13 = pcVar13 + 0x20;
                  uVar14 = uVar8;
                  do {
                    uVar7 = *(undefined8 *)(pcVar16 + -0x20);
                    uVar18 = *(undefined8 *)(pcVar16 + -8);
                    uVar17 = *(undefined8 *)(pcVar16 + -0x10);
                    uVar20 = *(undefined8 *)(pcVar16 + 8);
                    uVar19 = *(undefined8 *)pcVar16;
                    uVar22 = *(undefined8 *)(pcVar16 + 0x18);
                    uVar21 = *(undefined8 *)(pcVar16 + 0x10);
                    *(undefined8 *)(pcVar13 + -0x18) = *(undefined8 *)(pcVar16 + -0x18);
                    *(undefined8 *)(pcVar13 + -0x20) = uVar7;
                    *(undefined8 *)(pcVar13 + -8) = uVar18;
                    *(undefined8 *)(pcVar13 + -0x10) = uVar17;
                    *(undefined8 *)(pcVar13 + 8) = uVar20;
                    *(undefined8 *)pcVar13 = uVar19;
                    *(undefined8 *)(pcVar13 + 0x18) = uVar22;
                    *(undefined8 *)(pcVar13 + 0x10) = uVar21;
                    uVar14 = uVar14 - 0x40;
                    pcVar16 = pcVar16 + 0x40;
                    pcVar13 = pcVar13 + 0x40;
                  } while (uVar14 != 0);
                  if (uVar9 != uVar8) goto code_r0x00710fc8;
                }
              }
              else {
                uVar14 = (uVar9 & 0xfffffffffffffff8) + 8;
                if ((uVar9 | 7) != 0x17) {
                  uVar14 = uVar9 | 7;
                }
                pcVar13 = (char *)__Znwm(uVar14 + 1);
                _uStack0000000000000048 = uVar14 + 1 | 0x8000000000000000;
                in_stack_00000038 = pcVar13;
                in_stack_00000040 = uVar9;
                if (uVar9 != 0) goto code_r0x00710fa4;
code_r0x00711010:
                pcVar10 = pcVar13;
              }
              *pcVar10 = '\0';
              puVar3 = *(undefined8 **)(unaff_x19 + 0x100);
              if (puVar3 < *(undefined8 **)(unaff_x19 + 0x108)) {
                *(undefined4 *)(puVar3 + 2) = in_stack_00000030;
                puVar3[1] = in_stack_00000028;
                *puVar3 = uStack0000000000000020;
                uVar17 = *(undefined8 *)(in_stack_00000010 + 8);
                uVar7 = *(undefined8 *)in_stack_00000010;
                puVar3[5] = *(undefined8 *)(in_stack_00000010 + 0x10);
                puVar3[4] = uVar17;
                puVar3[3] = uVar7;
                *(undefined8 **)(unaff_x19 + 0x100) = puVar3 + 6;
              }
              else {
                uVar7 = func_0x00725bcc(in_stack_00000008,&uStack0000000000000020);
                *(undefined8 *)(unaff_x19 + 0x100) = uVar7;
                if ((long)_uStack0000000000000048 < 0) {
                  __ZdlPv(in_stack_00000038);
                }
              }
              goto LAB_00710dbc;
            }
          }
          func_0x0001748c(in_stack_00000010);
          goto LAB_007110f0;
        }
      }
      else if (unaff_w23 == 0x11f) {
        return piVar6;
      }
LAB_00710dbc:
      piVar6 = (int *)func_0x0070ba50();
      if (5 < *piVar6 - 0x11aU || (1 << (ulong)(*piVar6 - 0x11aU & 0x1f) & 0x23U) == 0) {
        return piVar6;
      }
      unaff_w23 = *(int *)(unaff_x19 + 0x80);
    } while (*(char *)(unaff_x19 + 1) == '\0');
    in_stack_00000028 = unaff_x28[1];
    uStack0000000000000020 = *unaff_x28;
    unaff_x25 = *(int **)(unaff_x19 + 0xe8);
    param_1 = *(int **)(unaff_x19 + 0xf0);
    in_x10 = -0x3333333333333333;
    if (param_1 <= unaff_x25) break;
    *unaff_x25 = unaff_w23;
    *(undefined8 *)(unaff_x25 + 3) = in_stack_00000028;
    *(undefined8 *)(unaff_x25 + 1) = uStack0000000000000020;
    piVar15 = unaff_x25 + 5;
  } while( true );
  unaff_x26 = (int *)*unaff_x21;
  unaff_x24 = ((long)unaff_x25 - (long)unaff_x26 >> 2) * -0x3333333333333333;
  goto code_r0x00710e38;
}

