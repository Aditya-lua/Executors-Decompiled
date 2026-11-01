
/* WARNING: Possible PIC construction at 0x00720cfc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00720d00) */

int * FUN_00720be0(long *param_1,undefined8 param_2,undefined8 param_3,int *param_4)

{
  int *piVar1;
  ulong *puVar2;
  char *pcVar3;
  char cVar4;
  int iVar5;
  uint uVar6;
  char *pcVar7;
  undefined8 uVar8;
  long lVar9;
  int *piVar10;
  int *extraout_x1;
  long lVar11;
  ulong uVar12;
  undefined8 *puVar13;
  char *pcVar14;
  undefined8 *puVar15;
  long *plVar16;
  undefined8 *extraout_x8;
  long lVar17;
  int *piVar18;
  char *pcVar19;
  undefined8 *puVar20;
  long in_x9;
  ulong uVar21;
  long in_x10;
  ulong uVar22;
  long in_x11;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  int *piVar23;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  int *piVar24;
  undefined8 unaff_x25;
  int *piVar25;
  char *pcVar26;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  char *unaff_x29;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  long *in_stack_00000088;
  long in_stack_00000090;
  long *in_stack_000000a0;
  long in_stack_000000a8;
  char acStack_d0 [144];
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_8;
  
code_r0x00720be0:
  lVar9 = in_x11 + in_x9 * 0x10;
  if (lVar9 == in_x10) {
    do {
      unaff_x19 = (undefined8 *)__Unwind_Resume(unaff_x19);
      lVar9 = *in_stack_00000088 + in_stack_00000090 * 8;
      if (lVar9 == in_stack_00000088[1]) {
        lVar9 = *in_stack_000000a0 + in_stack_000000a8 * 8;
        if (lVar9 != in_stack_000000a0[1]) goto code_r0x00720c7c;
code_r0x00720bc4:
        plVar16 = *(long **)(unaff_x29 + -0x88);
        lVar9 = *plVar16 + *(long *)(unaff_x29 + -0x80) * 0x10;
        if (lVar9 == plVar16[1]) goto code_r0x00720bd8;
      }
      else {
        in_stack_00000088[1] = lVar9;
        lVar9 = *in_stack_000000a0 + in_stack_000000a8 * 8;
        if (lVar9 == in_stack_000000a0[1]) goto code_r0x00720bc4;
code_r0x00720c7c:
        in_stack_000000a0[1] = lVar9;
        plVar16 = *(long **)(unaff_x29 + -0x88);
        lVar9 = *plVar16 + *(long *)(unaff_x29 + -0x80) * 0x10;
        if (lVar9 == plVar16[1]) goto code_r0x00720bd8;
      }
      plVar16[1] = lVar9;
      param_1 = *(long **)(unaff_x29 + -0x70);
      lVar9 = *param_1 + *(long *)(unaff_x29 + -0x68) * 0x10;
      if (lVar9 != param_1[1]) break;
    } while( true );
  }
  param_1[1] = lVar9;
  lVar9 = __Unwind_Resume(unaff_x19);
  uStack_8 = 0x720cc4;
  pcVar26 = acStack_d0;
  if (*(int *)(lVar9 + 0x80) == 0x119) {
    unaff_x21 = *(undefined8 *)(lVar9 + 0x98);
    uStack_38 = *(undefined8 *)(lVar9 + 0x8c);
    uStack_40 = *(undefined8 *)(lVar9 + 0x84);
    uStack_8 = 0x720d00;
    register0x00000008 = (BADSPACEBASE *)&uStack_40;
    unaff_x19 = extraout_x8;
    unaff_x20 = lVar9;
    unaff_x29 = pcVar26 + 0xc0;
  }
  else {
    piVar10 = (int *)func_0x0072415c(lVar9);
    if ((0x14 < *(int *)(lVar9 + 0x80) - 0x123U) || (*(int *)(lVar9 + 0x84) != *param_4)) {
      uVar8 = *(undefined8 *)(lVar9 + 0x84);
      *extraout_x8 = *(undefined8 *)(lVar9 + 0x128);
      extraout_x8[1] = uVar8;
      extraout_x8[2] = uVar8;
      return piVar10;
    }
    *extraout_x8 = *(undefined8 *)(lVar9 + 0x98);
    uVar8 = *(undefined8 *)(lVar9 + 0x84);
    extraout_x8[2] = *(undefined8 *)(lVar9 + 0x8c);
    extraout_x8[1] = uVar8;
  }
  *(undefined8 *)((long)register0x00000008 + -0x60) = unaff_x28;
  *(undefined8 *)((long)register0x00000008 + -0x58) = unaff_x27;
  *(undefined8 *)((long)register0x00000008 + -0x50) = unaff_x26;
  *(undefined8 *)((long)register0x00000008 + -0x48) = unaff_x25;
  *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
  *(undefined8 *)((long)register0x00000008 + -0x38) = unaff_x23;
  *(undefined8 *)((long)register0x00000008 + -0x30) = unaff_x22;
  *(undefined8 *)((long)register0x00000008 + -0x28) = unaff_x21;
  *(long *)((long)register0x00000008 + -0x20) = unaff_x20;
  *(undefined8 **)((long)register0x00000008 + -0x18) = unaff_x19;
  *(char **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
  piVar10 = (int *)func_0x0070ba50(lVar9 + 0x60,0,1);
  puVar2 = (ulong *)(lVar9 + 0xe0);
  puVar15 = (undefined8 *)(lVar9 + 0x84);
  *(ulong *)((long)register0x00000008 + -0x98) = (ulong)((long)register0x00000008 + -0x90) | 4;
  *(long *)((long)register0x00000008 + -0xa8) = lVar9 + 0xf8;
  *(undefined1 **)((long)register0x00000008 + -0xa0) =
       (undefined1 *)((long)register0x00000008 + -0x78);
  while( true ) {
    if (5 < *piVar10 - 0x11aU || (1 << (ulong)(*piVar10 - 0x11aU & 0x1f) & 0x23U) == 0) {
      return piVar10;
    }
    iVar5 = *(int *)(lVar9 + 0x80);
    if (*(char *)(lVar9 + 1) != '\0') break;
code_r0x00710f10:
    if (iVar5 == 0x11a) {
      iVar5 = func_0x0070aa6c(lVar9 + 0x80);
      if ((iVar5 != 0) && (pcVar26 = *(char **)(lVar9 + 0x98), *pcVar26 == '!')) {
        uVar6 = func_0x0070aa6c(lVar9 + 0x80);
        if (uVar6 == 0) {
code_r0x007110d4:
          *(undefined1 *)((long)register0x00000008 + -0x90) = *(undefined1 *)(lVar9 + 0x110);
          uVar8 = *puVar15;
          puVar15 = *(undefined8 **)((long)register0x00000008 + -0x98);
          puVar15[1] = *(undefined8 *)(lVar9 + 0x8c);
          *puVar15 = uVar8;
        }
        else {
          uVar12 = (ulong)uVar6;
          while( true ) {
            uVar12 = uVar12 - 1;
            if ((4 < (byte)pcVar26[uVar12 & 0xffffffff] - 9) &&
               ((byte)pcVar26[uVar12 & 0xffffffff] != 0x20)) break;
            if ((uVar12 & 0xffffffff) == 0) goto code_r0x007110d4;
          }
          *(undefined1 *)((long)register0x00000008 + -0x90) = *(undefined1 *)(lVar9 + 0x110);
          uVar8 = *puVar15;
          puVar13 = *(undefined8 **)((long)register0x00000008 + -0x98);
          puVar13[1] = *(undefined8 *)(lVar9 + 0x8c);
          *puVar13 = uVar8;
          if (uVar12 < 0x7ffffffffffffff8) {
            if (uVar12 < 0x17) {
              *(char *)((long)register0x00000008 + -0x61) = (char)uVar12;
              pcVar7 = *(char **)((long)register0x00000008 + -0xa0);
              if (uVar12 == 0) goto code_r0x00711010;
code_r0x00710fa4:
              pcVar3 = pcVar26 + 1;
              if ((uVar12 < 0x40) || (pcVar7 + ~(ulong)pcVar26 < &segment_command_00000020.vmsize))
              {
                pcVar14 = pcVar7;
                pcVar19 = pcVar3;
code_r0x00710fc8:
                pcVar26 = pcVar14;
                do {
                  pcVar7 = pcVar19 + 1;
                  pcVar14 = pcVar26 + 1;
                  *pcVar26 = *pcVar19;
                  pcVar26 = pcVar14;
                  pcVar19 = pcVar7;
                } while (pcVar7 != pcVar3 + uVar12);
              }
              else {
                uVar22 = uVar12 & 0xffffffffffffffc0;
                pcVar19 = pcVar3 + uVar22;
                pcVar14 = pcVar7 + uVar22;
                pcVar26 = pcVar26 + 0x21;
                pcVar7 = pcVar7 + 0x20;
                uVar21 = uVar22;
                do {
                  uVar8 = *(undefined8 *)(pcVar26 + -0x20);
                  uVar28 = *(undefined8 *)(pcVar26 + -8);
                  uVar27 = *(undefined8 *)(pcVar26 + -0x10);
                  uVar30 = *(undefined8 *)(pcVar26 + 8);
                  uVar29 = *(undefined8 *)pcVar26;
                  uVar32 = *(undefined8 *)(pcVar26 + 0x18);
                  uVar31 = *(undefined8 *)(pcVar26 + 0x10);
                  *(undefined8 *)(pcVar7 + -0x18) = *(undefined8 *)(pcVar26 + -0x18);
                  *(undefined8 *)(pcVar7 + -0x20) = uVar8;
                  *(undefined8 *)(pcVar7 + -8) = uVar28;
                  *(undefined8 *)(pcVar7 + -0x10) = uVar27;
                  *(undefined8 *)(pcVar7 + 8) = uVar30;
                  *(undefined8 *)pcVar7 = uVar29;
                  *(undefined8 *)(pcVar7 + 0x18) = uVar32;
                  *(undefined8 *)(pcVar7 + 0x10) = uVar31;
                  uVar21 = uVar21 - 0x40;
                  pcVar26 = pcVar26 + 0x40;
                  pcVar7 = pcVar7 + 0x40;
                } while (uVar21 != 0);
                if (uVar12 != uVar22) goto code_r0x00710fc8;
              }
            }
            else {
              uVar21 = (uVar12 & 0xfffffffffffffff8) + 8;
              if ((uVar12 | 7) != 0x17) {
                uVar21 = uVar12 | 7;
              }
              pcVar7 = (char *)__Znwm(uVar21 + 1);
              *(ulong *)((long)register0x00000008 + -0x70) = uVar12;
              *(ulong *)((long)register0x00000008 + -0x68) = uVar21 + 1 | 0x8000000000000000;
              *(char **)((long)register0x00000008 + -0x78) = pcVar7;
              if (uVar12 != 0) goto code_r0x00710fa4;
code_r0x00711010:
              pcVar14 = pcVar7;
            }
            *pcVar14 = '\0';
            puVar13 = *(undefined8 **)(lVar9 + 0x100);
            if (puVar13 < *(undefined8 **)(lVar9 + 0x108)) {
              uVar27 = *(undefined8 *)((long)register0x00000008 + -0x88);
              uVar8 = *(undefined8 *)((long)register0x00000008 + -0x90);
              *(undefined4 *)(puVar13 + 2) = *(undefined4 *)((long)register0x00000008 + -0x80);
              puVar13[1] = uVar27;
              *puVar13 = uVar8;
              puVar20 = *(undefined8 **)((long)register0x00000008 + -0xa0);
              uVar27 = puVar20[1];
              uVar8 = *puVar20;
              puVar13[5] = puVar20[2];
              puVar13[4] = uVar27;
              puVar13[3] = uVar8;
              *(undefined8 **)(lVar9 + 0x100) = puVar13 + 6;
            }
            else {
              uVar8 = func_0x00725bcc(*(undefined8 *)((long)register0x00000008 + -0xa8),
                                      (undefined1 *)((long)register0x00000008 + -0x90));
              cVar4 = *(char *)((long)register0x00000008 + -0x61);
              *(undefined8 *)(lVar9 + 0x100) = uVar8;
              if (cVar4 < '\0') {
                __ZdlPv(*(undefined8 *)((long)register0x00000008 + -0x78));
              }
            }
            goto code_r0x00710dbc;
          }
        }
        func_0x0001748c(*(undefined8 *)((long)register0x00000008 + -0xa0));
        goto code_r0x007110f0;
      }
    }
    else if (iVar5 == 0x11f) {
      return piVar10;
    }
code_r0x00710dbc:
    piVar10 = (int *)func_0x0070ba50(lVar9 + 0x60,0,0);
  }
  uVar8 = *puVar15;
  *(undefined8 *)((long)register0x00000008 + -0x88) = *(undefined8 *)(lVar9 + 0x8c);
  *(undefined8 *)((long)register0x00000008 + -0x90) = uVar8;
  piVar24 = *(int **)(lVar9 + 0xe8);
  if (piVar24 < *(int **)(lVar9 + 0xf0)) {
    *piVar24 = iVar5;
    uVar8 = *(undefined8 *)((long)register0x00000008 + -0x90);
    *(undefined8 *)(piVar24 + 3) = *(undefined8 *)((long)register0x00000008 + -0x88);
    *(undefined8 *)(piVar24 + 1) = uVar8;
    piVar23 = piVar24 + 5;
code_r0x00710f08:
    *(int **)(lVar9 + 0xe8) = piVar23;
    iVar5 = *(int *)(lVar9 + 0x80);
    goto code_r0x00710f10;
  }
  piVar25 = (int *)*puVar2;
  lVar17 = (long)piVar24 - (long)piVar25 >> 2;
  uVar12 = lVar17 * -0x3333333333333333 + 1;
  if (uVar12 < 0xccccccccccccccd) {
    lVar11 = (long)*(int **)(lVar9 + 0xf0) - (long)piVar25 >> 2;
    uVar21 = lVar11 * -0x6666666666666666;
    if (uVar21 <= uVar12) {
      uVar21 = uVar12;
    }
    if (0x666666666666665 < (ulong)(lVar11 * -0x3333333333333333)) {
      uVar21 = 0xccccccccccccccc;
    }
    if (uVar21 == 0) {
      piVar10 = (int *)0x0;
    }
    else {
      if (0xccccccccccccccc < uVar21) goto code_r0x007110f8;
      piVar10 = (int *)__Znwm(uVar21 * 0x14);
    }
    piVar23 = piVar10 + lVar17;
    *piVar23 = iVar5;
    uVar8 = *puVar15;
    *(undefined8 *)(piVar23 + 3) = *(undefined8 *)(lVar9 + 0x8c);
    *(undefined8 *)(piVar23 + 1) = uVar8;
    piVar18 = piVar23;
    if (piVar24 != piVar25) {
      do {
        uVar27 = *(undefined8 *)(piVar24 + -3);
        uVar8 = *(undefined8 *)(piVar24 + -5);
        piVar1 = piVar24 + -1;
        piVar24 = piVar24 + -5;
        piVar18[-1] = *piVar1;
        *(undefined8 *)(piVar18 + -3) = uVar27;
        *(undefined8 *)(piVar18 + -5) = uVar8;
        piVar18 = piVar18 + -5;
      } while (piVar24 != piVar25);
      piVar24 = (int *)*puVar2;
    }
    piVar23 = piVar23 + 5;
    *(int **)(lVar9 + 0xe0) = piVar18;
    *(int **)(lVar9 + 0xe8) = piVar23;
    *(int **)(lVar9 + 0xf0) = piVar10 + uVar21 * 5;
    if (piVar24 != (int *)0x0) {
      piVar10 = (int *)__ZdlPv(piVar24);
    }
    goto code_r0x00710f08;
  }
code_r0x007110f0:
  func_0x00017f90(puVar2);
code_r0x007110f8:
  uVar8 = func_0x00017514();
  if (*(char *)((long)register0x00000008 + -0x61) < '\0') {
    __ZdlPv(*(undefined8 *)((long)register0x00000008 + -0x78));
  }
  __Unwind_Resume(uVar8);
  uVar6 = *extraout_x1 - 0x126;
  if (uVar6 < 0x11 && (1 << (ulong)(uVar6 & 0x1f) & 0x10007U) != 0 || *extraout_x1 == 0) {
    return (int *)((long)&MACH_HEADER.magic + 1);
  }
  return (int *)0x0;
code_r0x00720bd8:
  param_1 = *(long **)(unaff_x29 + -0x70);
  in_x9 = *(long *)(unaff_x29 + -0x68);
  in_x11 = *param_1;
  in_x10 = param_1[1];
  goto code_r0x00720be0;
}

