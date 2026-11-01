
int * FUN_00710ee0(int *param_1,int *param_2)

{
  int *piVar1;
  char *pcVar2;
  undefined8 *puVar3;
  int iVar4;
  uint uVar5;
  undefined8 uVar6;
  int *extraout_x1;
  long lVar7;
  ulong uVar8;
  char *pcVar9;
  long lVar10;
  int *in_x9;
  char *pcVar11;
  char *pcVar12;
  ulong uVar13;
  ulong uVar14;
  long unaff_x19;
  ulong *unaff_x21;
  int unaff_w24;
  int *unaff_x25;
  int *piVar15;
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
  
code_r0x00710ee0:
  param_1 = param_1 + 5;
  *(int **)(unaff_x19 + 0xe0) = in_x9;
  *(int **)(unaff_x19 + 0xe8) = param_1;
  *(int **)(unaff_x19 + 0xf0) = param_2 + unaff_x27 * 5;
  if (unaff_x25 != (int *)0x0) {
    param_2 = (int *)__ZdlPv(unaff_x25);
  }
  do {
    *(int **)(unaff_x19 + 0xe8) = param_1;
    iVar4 = *(int *)(unaff_x19 + 0x80);
    do {
      if (iVar4 == 0x11a) {
        iVar4 = func_0x0070aa6c();
        if ((iVar4 != 0) && (pcVar16 = *(char **)(unaff_x19 + 0x98), *pcVar16 == '!')) {
          uVar5 = func_0x0070aa6c();
          if (uVar5 == 0) {
LAB_007110d4:
            uStack0000000000000020 =
                 CONCAT71(uStack0000000000000020._1_7_,*(undefined1 *)(unaff_x19 + 0x110));
            uVar6 = *unaff_x28;
            in_stack_00000018[1] = unaff_x28[1];
            *in_stack_00000018 = uVar6;
          }
          else {
            uVar8 = (ulong)uVar5;
            while( true ) {
              uVar8 = uVar8 - 1;
              if ((4 < (byte)pcVar16[uVar8 & 0xffffffff] - 9) &&
                 ((byte)pcVar16[uVar8 & 0xffffffff] != 0x20)) break;
              if ((uVar8 & 0xffffffff) == 0) goto LAB_007110d4;
            }
            uStack0000000000000020 =
                 CONCAT71(uStack0000000000000020._1_7_,*(undefined1 *)(unaff_x19 + 0x110));
            uVar6 = *unaff_x28;
            in_stack_00000018[1] = unaff_x28[1];
            *in_stack_00000018 = uVar6;
            if (uVar8 < 0x7ffffffffffffff8) {
              if (uVar8 < 0x17) {
                _uStack0000000000000048 = CONCAT17((char)uVar8,uStack0000000000000048);
                pcVar12 = in_stack_00000010;
                if (uVar8 == 0) goto code_r0x00711010;
code_r0x00710fa4:
                pcVar2 = pcVar16 + 1;
                if ((uVar8 < 0x40) || (pcVar12 + ~(ulong)pcVar16 < &segment_command_00000020.vmsize)
                   ) {
                  pcVar9 = pcVar12;
                  pcVar11 = pcVar2;
code_r0x00710fc8:
                  pcVar16 = pcVar9;
                  do {
                    pcVar12 = pcVar11 + 1;
                    pcVar9 = pcVar16 + 1;
                    *pcVar16 = *pcVar11;
                    pcVar16 = pcVar9;
                    pcVar11 = pcVar12;
                  } while (pcVar12 != pcVar2 + uVar8);
                }
                else {
                  uVar13 = uVar8 & 0xffffffffffffffc0;
                  pcVar11 = pcVar2 + uVar13;
                  pcVar9 = pcVar12 + uVar13;
                  pcVar16 = pcVar16 + 0x21;
                  pcVar12 = pcVar12 + 0x20;
                  uVar14 = uVar13;
                  do {
                    uVar6 = *(undefined8 *)(pcVar16 + -0x20);
                    uVar18 = *(undefined8 *)(pcVar16 + -8);
                    uVar17 = *(undefined8 *)(pcVar16 + -0x10);
                    uVar20 = *(undefined8 *)(pcVar16 + 8);
                    uVar19 = *(undefined8 *)pcVar16;
                    uVar22 = *(undefined8 *)(pcVar16 + 0x18);
                    uVar21 = *(undefined8 *)(pcVar16 + 0x10);
                    *(undefined8 *)(pcVar12 + -0x18) = *(undefined8 *)(pcVar16 + -0x18);
                    *(undefined8 *)(pcVar12 + -0x20) = uVar6;
                    *(undefined8 *)(pcVar12 + -8) = uVar18;
                    *(undefined8 *)(pcVar12 + -0x10) = uVar17;
                    *(undefined8 *)(pcVar12 + 8) = uVar20;
                    *(undefined8 *)pcVar12 = uVar19;
                    *(undefined8 *)(pcVar12 + 0x18) = uVar22;
                    *(undefined8 *)(pcVar12 + 0x10) = uVar21;
                    uVar14 = uVar14 - 0x40;
                    pcVar16 = pcVar16 + 0x40;
                    pcVar12 = pcVar12 + 0x40;
                  } while (uVar14 != 0);
                  if (uVar8 != uVar13) goto code_r0x00710fc8;
                }
              }
              else {
                uVar14 = (uVar8 & 0xfffffffffffffff8) + 8;
                if ((uVar8 | 7) != 0x17) {
                  uVar14 = uVar8 | 7;
                }
                pcVar12 = (char *)__Znwm(uVar14 + 1);
                _uStack0000000000000048 = uVar14 + 1 | 0x8000000000000000;
                in_stack_00000038 = pcVar12;
                in_stack_00000040 = uVar8;
                if (uVar8 != 0) goto code_r0x00710fa4;
code_r0x00711010:
                pcVar9 = pcVar12;
              }
              *pcVar9 = '\0';
              puVar3 = *(undefined8 **)(unaff_x19 + 0x100);
              if (puVar3 < *(undefined8 **)(unaff_x19 + 0x108)) {
                *(undefined4 *)(puVar3 + 2) = in_stack_00000030;
                puVar3[1] = in_stack_00000028;
                *puVar3 = uStack0000000000000020;
                uVar17 = *(undefined8 *)(in_stack_00000010 + 8);
                uVar6 = *(undefined8 *)in_stack_00000010;
                puVar3[5] = *(undefined8 *)(in_stack_00000010 + 0x10);
                puVar3[4] = uVar17;
                puVar3[3] = uVar6;
                *(undefined8 **)(unaff_x19 + 0x100) = puVar3 + 6;
              }
              else {
                uVar6 = func_0x00725bcc(in_stack_00000008,&uStack0000000000000020);
                *(undefined8 *)(unaff_x19 + 0x100) = uVar6;
                if ((long)_uStack0000000000000048 < 0) {
                  __ZdlPv(in_stack_00000038);
                }
              }
              goto LAB_00710dbc;
            }
          }
          func_0x0001748c(in_stack_00000010);
          goto code_r0x007110f0;
        }
      }
      else if (iVar4 == 0x11f) {
        return param_2;
      }
LAB_00710dbc:
      param_2 = (int *)func_0x0070ba50();
      if (5 < *param_2 - 0x11aU || (unaff_w24 << (ulong)(*param_2 - 0x11aU & 0x1f) & 0x23U) == 0) {
        return param_2;
      }
      iVar4 = *(int *)(unaff_x19 + 0x80);
    } while (*(char *)(unaff_x19 + 1) == '\0');
    in_stack_00000028 = unaff_x28[1];
    uStack0000000000000020 = *unaff_x28;
    unaff_x25 = *(int **)(unaff_x19 + 0xe8);
    if (*(int **)(unaff_x19 + 0xf0) <= unaff_x25) break;
    *unaff_x25 = iVar4;
    *(undefined8 *)(unaff_x25 + 3) = in_stack_00000028;
    *(undefined8 *)(unaff_x25 + 1) = uStack0000000000000020;
    param_1 = unaff_x25 + 5;
  } while( true );
  piVar15 = (int *)*unaff_x21;
  lVar10 = (long)unaff_x25 - (long)piVar15 >> 2;
  uVar8 = lVar10 * -0x3333333333333333 + 1;
  if (0xccccccccccccccc < uVar8) {
code_r0x007110f0:
    func_0x00017f90();
code_r0x007110f8:
    uVar6 = func_0x00017514();
    if ((long)_uStack0000000000000048 < 0) {
      __ZdlPv(in_stack_00000038);
    }
    __Unwind_Resume(uVar6);
    uVar5 = *extraout_x1 - 0x126;
    if (uVar5 < 0x11 && (1 << (ulong)(uVar5 & 0x1f) & 0x10007U) != 0 || *extraout_x1 == 0) {
      return (int *)((long)&MACH_HEADER.magic + 1);
    }
    return (int *)0x0;
  }
  lVar7 = (long)*(int **)(unaff_x19 + 0xf0) - (long)piVar15 >> 2;
  unaff_x27 = lVar7 * -0x6666666666666666;
  if (unaff_x27 <= uVar8) {
    unaff_x27 = uVar8;
  }
  if (0x666666666666665 < (ulong)(lVar7 * -0x3333333333333333)) {
    unaff_x27 = 0xccccccccccccccc;
  }
  if (unaff_x27 == 0) {
    param_2 = (int *)0x0;
  }
  else {
    if (0xccccccccccccccc < unaff_x27) goto code_r0x007110f8;
    param_2 = (int *)__Znwm(unaff_x27 * 0x14);
  }
  param_1 = param_2 + lVar10;
  *param_1 = iVar4;
  uVar6 = *unaff_x28;
  *(undefined8 *)(param_1 + 3) = unaff_x28[1];
  *(undefined8 *)(param_1 + 1) = uVar6;
  unaff_w24 = 1;
  in_x9 = param_1;
  if (unaff_x25 != piVar15) {
    do {
      uVar17 = *(undefined8 *)(unaff_x25 + -3);
      uVar6 = *(undefined8 *)(unaff_x25 + -5);
      piVar1 = unaff_x25 + -1;
      unaff_x25 = unaff_x25 + -5;
      in_x9[-1] = *piVar1;
      *(undefined8 *)(in_x9 + -3) = uVar17;
      *(undefined8 *)(in_x9 + -5) = uVar6;
      in_x9 = in_x9 + -5;
    } while (unaff_x25 != piVar15);
    unaff_x25 = (int *)*unaff_x21;
  }
  goto code_r0x00710ee0;
}

