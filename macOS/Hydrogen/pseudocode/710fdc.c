
int * thunk_FUN_00711014(char *param_1)

{
  int *piVar1;
  char *pcVar2;
  undefined8 *puVar3;
  int iVar4;
  uint uVar5;
  int *piVar6;
  undefined8 uVar7;
  int *extraout_x1;
  long lVar8;
  ulong uVar9;
  long lVar10;
  int *piVar11;
  char *pcVar12;
  char *pcVar13;
  ulong uVar14;
  ulong uVar15;
  long unaff_x19;
  ulong *unaff_x21;
  int *piVar16;
  int unaff_w24;
  int *piVar17;
  int *piVar18;
  char *pcVar19;
  ulong unaff_x27;
  undefined8 *unaff_x28;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 in_stack_00000008;
  char *in_stack_00000010;
  undefined8 *in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined4 in_stack_00000030;
  char *in_stack_00000038;
  ulong in_stack_00000040;
  undefined7 uStack0000000000000048;
  
FUN_00711014:
  while( true ) {
    *param_1 = '\0';
    puVar3 = *(undefined8 **)(unaff_x19 + 0x100);
    if (puVar3 < *(undefined8 **)(unaff_x19 + 0x108)) {
      *(undefined4 *)(puVar3 + 2) = in_stack_00000030;
      puVar3[1] = in_stack_00000028;
      *puVar3 = uStack0000000000000020;
      uVar20 = *(undefined8 *)(in_stack_00000010 + 8);
      uVar7 = *(undefined8 *)in_stack_00000010;
      puVar3[5] = *(undefined8 *)(in_stack_00000010 + 0x10);
      puVar3[4] = uVar20;
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
    do {
      while( true ) {
        piVar6 = (int *)func_0x0070ba50();
        if (5 < *piVar6 - 0x11aU || (unaff_w24 << (ulong)(*piVar6 - 0x11aU & 0x1f) & 0x23U) == 0) {
          return piVar6;
        }
        iVar4 = *(int *)(unaff_x19 + 0x80);
        if (*(char *)(unaff_x19 + 1) != '\0') {
          in_stack_00000028 = unaff_x28[1];
          uStack0000000000000020 = *unaff_x28;
          piVar17 = *(int **)(unaff_x19 + 0xe8);
          if (piVar17 < *(int **)(unaff_x19 + 0xf0)) {
            *piVar17 = iVar4;
            *(undefined8 *)(piVar17 + 3) = in_stack_00000028;
            *(undefined8 *)(piVar17 + 1) = uStack0000000000000020;
            piVar16 = piVar17 + 5;
          }
          else {
            piVar18 = (int *)*unaff_x21;
            lVar10 = (long)piVar17 - (long)piVar18 >> 2;
            uVar9 = lVar10 * -0x3333333333333333 + 1;
            if (unaff_x27 < uVar9) goto FUN_007110f0;
            lVar8 = (long)*(int **)(unaff_x19 + 0xf0) - (long)piVar18 >> 2;
            uVar14 = lVar8 * -0x6666666666666666;
            if (uVar14 <= uVar9) {
              uVar14 = uVar9;
            }
            if (0x666666666666665 < (ulong)(lVar8 * -0x3333333333333333)) {
              uVar14 = 0xccccccccccccccc;
            }
            if (uVar14 == 0) {
              piVar6 = (int *)0x0;
            }
            else {
              if (0xccccccccccccccc < uVar14) goto code_r0x007110f8;
              piVar6 = (int *)__Znwm(uVar14 * 0x14);
            }
            piVar16 = piVar6 + lVar10;
            *piVar16 = iVar4;
            uVar7 = *unaff_x28;
            *(undefined8 *)(piVar16 + 3) = unaff_x28[1];
            *(undefined8 *)(piVar16 + 1) = uVar7;
            unaff_w24 = 1;
            piVar11 = piVar16;
            if (piVar17 != piVar18) {
              do {
                uVar20 = *(undefined8 *)(piVar17 + -3);
                uVar7 = *(undefined8 *)(piVar17 + -5);
                piVar1 = piVar17 + -1;
                piVar17 = piVar17 + -5;
                piVar11[-1] = *piVar1;
                *(undefined8 *)(piVar11 + -3) = uVar20;
                *(undefined8 *)(piVar11 + -5) = uVar7;
                piVar11 = piVar11 + -5;
              } while (piVar17 != piVar18);
              piVar17 = (int *)*unaff_x21;
            }
            piVar16 = piVar16 + 5;
            *(int **)(unaff_x19 + 0xe0) = piVar11;
            *(int **)(unaff_x19 + 0xe8) = piVar16;
            *(int **)(unaff_x19 + 0xf0) = piVar6 + uVar14 * 5;
            if (piVar17 != (int *)0x0) {
              piVar6 = (int *)__ZdlPv(piVar17);
            }
            unaff_x27 = 0xccccccccccccccc;
          }
          *(int **)(unaff_x19 + 0xe8) = piVar16;
          iVar4 = *(int *)(unaff_x19 + 0x80);
        }
        if (iVar4 == 0x11a) break;
        if (iVar4 == 0x11f) {
          return piVar6;
        }
      }
      iVar4 = func_0x0070aa6c();
    } while ((iVar4 == 0) || (pcVar19 = *(char **)(unaff_x19 + 0x98), *pcVar19 != '!'));
    uVar5 = func_0x0070aa6c();
    if (uVar5 == 0) break;
    uVar9 = (ulong)uVar5;
    while( true ) {
      uVar9 = uVar9 - 1;
      if ((4 < (byte)pcVar19[uVar9 & 0xffffffff] - 9) && ((byte)pcVar19[uVar9 & 0xffffffff] != 0x20)
         ) break;
      if ((uVar9 & 0xffffffff) == 0) goto code_r0x007110d4;
    }
    uStack0000000000000020 =
         CONCAT71(uStack0000000000000020._1_7_,*(undefined1 *)(unaff_x19 + 0x110));
    uVar7 = *unaff_x28;
    in_stack_00000018[1] = unaff_x28[1];
    *in_stack_00000018 = uVar7;
    if (0x7ffffffffffffff7 < uVar9) goto code_r0x007110e8;
    if (uVar9 < 0x17) {
      _uStack0000000000000048 = CONCAT17((char)uVar9,uStack0000000000000048);
      pcVar13 = in_stack_00000010;
      if (uVar9 == 0) goto code_r0x00711010;
code_r0x00710fa4:
      pcVar2 = pcVar19 + 1;
      if ((0x3f < uVar9) &&
         ((char *)((long)&segment_command_00000020.vmaddr + 7) < pcVar13 + ~(ulong)pcVar19))
      goto code_r0x00711078;
      param_1 = pcVar13;
      pcVar12 = pcVar2;
      goto code_r0x00710fc8;
    }
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
    param_1 = pcVar13;
  }
code_r0x007110d4:
  uStack0000000000000020 = CONCAT71(uStack0000000000000020._1_7_,*(undefined1 *)(unaff_x19 + 0x110))
  ;
  uVar7 = *unaff_x28;
  in_stack_00000018[1] = unaff_x28[1];
  *in_stack_00000018 = uVar7;
code_r0x007110e8:
  func_0x0001748c(in_stack_00000010);
FUN_007110f0:
  func_0x00017f90();
code_r0x007110f8:
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
code_r0x00711078:
  uVar15 = uVar9 & 0xffffffffffffffc0;
  pcVar12 = pcVar2 + uVar15;
  param_1 = pcVar13 + uVar15;
  pcVar19 = pcVar19 + 0x21;
  pcVar13 = pcVar13 + 0x20;
  uVar14 = uVar15;
  do {
    uVar7 = *(undefined8 *)(pcVar19 + -0x20);
    uVar21 = *(undefined8 *)(pcVar19 + -8);
    uVar20 = *(undefined8 *)(pcVar19 + -0x10);
    uVar23 = *(undefined8 *)(pcVar19 + 8);
    uVar22 = *(undefined8 *)pcVar19;
    uVar25 = *(undefined8 *)(pcVar19 + 0x18);
    uVar24 = *(undefined8 *)(pcVar19 + 0x10);
    *(undefined8 *)(pcVar13 + -0x18) = *(undefined8 *)(pcVar19 + -0x18);
    *(undefined8 *)(pcVar13 + -0x20) = uVar7;
    *(undefined8 *)(pcVar13 + -8) = uVar21;
    *(undefined8 *)(pcVar13 + -0x10) = uVar20;
    *(undefined8 *)(pcVar13 + 8) = uVar23;
    *(undefined8 *)pcVar13 = uVar22;
    *(undefined8 *)(pcVar13 + 0x18) = uVar25;
    *(undefined8 *)(pcVar13 + 0x10) = uVar24;
    uVar14 = uVar14 - 0x40;
    pcVar19 = pcVar19 + 0x40;
    pcVar13 = pcVar13 + 0x40;
  } while (uVar14 != 0);
  if (uVar9 != uVar15) {
code_r0x00710fc8:
    pcVar19 = param_1;
    do {
      pcVar13 = pcVar12 + 1;
      param_1 = pcVar19 + 1;
      *pcVar19 = *pcVar12;
      pcVar19 = param_1;
      pcVar12 = pcVar13;
    } while (pcVar13 != pcVar2 + uVar9);
  }
  goto FUN_00711014;
}

