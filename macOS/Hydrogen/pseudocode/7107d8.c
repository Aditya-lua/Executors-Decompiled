
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

int * FUN_007107d8(undefined8 param_1,undefined8 param_2,int *param_3)

{
  int *piVar1;
  ulong *puVar2;
  char *pcVar3;
  undefined8 *puVar4;
  int iVar5;
  uint uVar6;
  undefined8 uVar7;
  long lVar8;
  undefined8 *puVar9;
  int *piVar10;
  char *******pppppppcVar11;
  int *extraout_x1;
  ulong uVar12;
  int *piVar13;
  long lVar14;
  char *******pppppppcVar15;
  int *piVar16;
  undefined8 *puVar17;
  long lVar18;
  int *piVar19;
  char *pcVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  long unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  long *plVar26;
  long *unaff_x25;
  long *unaff_x26;
  int *piVar27;
  char *pcVar28;
  char ******ppppppcVar29;
  undefined8 uVar30;
  char ******ppppppcVar31;
  char ******ppppppcVar32;
  char ******ppppppcVar33;
  char ******ppppppcVar34;
  char ******ppppppcVar35;
  char ******ppppppcVar36;
  undefined1 auVar37 [16];
  long *in_stack_00000018;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined4 uStack_b0;
  char *******pppppppcStack_a8;
  ulong uStack_a0;
  undefined8 uStack_98;
  
  func_0x00057f4c();
  uVar7 = __Unwind_Resume();
  plVar26 = (long *)(unaff_x19 + 0x418);
  if (*plVar26 != 0) goto LAB_00710910;
  if (*(char *)(unaff_x19 + 0x417) < '\0') goto LAB_00710920;
code_r0x00710800:
  lVar8 = *(long *)(unaff_x19 + 1000);
  if (lVar8 != 0) goto LAB_00710930;
code_r0x00710808:
  lVar8 = *(long *)(unaff_x19 + 0x3d0);
  if (lVar8 != 0) goto LAB_00710940;
code_r0x00710810:
  lVar8 = *(long *)(unaff_x19 + 0x3b8);
  if (lVar8 != 0) goto LAB_00710950;
code_r0x00710818:
  lVar8 = *(long *)(unaff_x19 + 0x3a0);
  if (lVar8 != 0) goto code_r0x00710960;
code_r0x00710820:
  lVar8 = *(long *)(unaff_x19 + 0x388);
  if (lVar8 != 0) goto code_r0x00710970;
code_r0x00710828:
  lVar8 = *(long *)(unaff_x19 + 0x370);
  if (lVar8 != 0) goto code_r0x00710980;
LAB_00710830:
  lVar8 = *(long *)(unaff_x19 + 0x358);
  if (lVar8 != 0) goto code_r0x00710990;
LAB_00710838:
  lVar8 = *(long *)(unaff_x19 + 0x340);
  if (lVar8 != 0) goto code_r0x007109a0;
LAB_00710840:
  lVar8 = *(long *)(unaff_x19 + 0x328);
  if (lVar8 != 0) goto code_r0x007109b0;
LAB_00710848:
  lVar8 = *(long *)(unaff_x19 + 0x310);
  if (lVar8 != 0) goto code_r0x007109c0;
LAB_00710850:
  lVar8 = *(long *)(unaff_x19 + 0x2f8);
  if (lVar8 != 0) goto code_r0x007109d0;
LAB_00710858:
  lVar8 = *(long *)(unaff_x19 + 0x2e0);
  if (lVar8 != 0) goto code_r0x007109e0;
LAB_00710860:
  lVar8 = *(long *)(unaff_x19 + 0x2c8);
  if (lVar8 != 0) goto code_r0x007109f0;
LAB_00710868:
  lVar8 = *(long *)(unaff_x19 + 0x2b0);
  if (lVar8 != 0) goto code_r0x00710a00;
LAB_00710870:
  lVar8 = *(long *)(unaff_x19 + 0x298);
  if (lVar8 != 0) goto code_r0x00710a10;
LAB_00710878:
  lVar8 = *(long *)(unaff_x19 + 0x280);
  if (lVar8 != 0) goto code_r0x00710a20;
LAB_00710880:
  lVar8 = *(long *)(unaff_x19 + 0x268);
  if (lVar8 != 0) goto code_r0x00710a30;
LAB_00710888:
  lVar8 = *(long *)(unaff_x19 + 0x250);
  if (lVar8 != 0) goto code_r0x00710a40;
LAB_00710890:
  lVar8 = *(long *)(unaff_x19 + 0x238);
  if (lVar8 != 0) goto code_r0x00710a50;
LAB_00710898:
  lVar8 = *(long *)(unaff_x19 + 0x220);
  if (lVar8 != 0) goto code_r0x00710a60;
LAB_007108a0:
  lVar8 = *(long *)(unaff_x19 + 0x208);
  if (lVar8 != 0) goto code_r0x00710a70;
LAB_007108a8:
  lVar8 = *(long *)(unaff_x19 + 0x1f0);
  if (lVar8 != 0) goto code_r0x00710a80;
LAB_007108b0:
  lVar8 = *(long *)(unaff_x19 + 0x1d8);
  if (lVar8 != 0) goto FUN_00710a94;
LAB_007108bc:
  lVar8 = *unaff_x21;
  if (lVar8 != 0) goto code_r0x00710aa4;
LAB_007108c4:
  func_0x0062069c(unaff_x19 + 0x1a8);
  lVar8 = *unaff_x20;
  if (lVar8 != 0) goto code_r0x00710abc;
LAB_007108d4:
  if (*in_stack_00000018 != 0) goto code_r0x00710ad0;
LAB_007108e0:
  lVar8 = *unaff_x26;
  if (lVar8 != 0) goto code_r0x00710ae4;
LAB_007108e8:
  func_0x0070f928(unaff_x25 + 3);
  lVar8 = *unaff_x25;
  if (lVar8 != 0) goto code_r0x00710afc;
  while (lVar8 = *(long *)(unaff_x19 + 0xc0), lVar8 == 0) {
    while( true ) {
      plVar26 = (long *)(unaff_x19 + 0x1a8);
      func_0x00057f4c();
      __Unwind_Resume(uVar7);
LAB_00710910:
      __ZdlPv();
      *plVar26 = 0;
      plVar26[1] = 0;
      if (-1 < *(char *)(unaff_x19 + 0x417)) goto code_r0x00710800;
LAB_00710920:
      __ZdlPv(*(undefined8 *)(unaff_x19 + 0x400));
      lVar8 = *(long *)(unaff_x19 + 1000);
      if (lVar8 == 0) goto code_r0x00710808;
LAB_00710930:
      *(long *)(unaff_x19 + 0x3f0) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x3d0);
      if (lVar8 == 0) goto code_r0x00710810;
LAB_00710940:
      *(long *)(unaff_x19 + 0x3d8) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x3b8);
      if (lVar8 == 0) goto code_r0x00710818;
LAB_00710950:
      *(long *)(unaff_x19 + 0x3c0) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x3a0);
      if (lVar8 == 0) goto code_r0x00710820;
code_r0x00710960:
      *(long *)(unaff_x19 + 0x3a8) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x388);
      if (lVar8 == 0) goto code_r0x00710828;
code_r0x00710970:
      *(long *)(unaff_x19 + 0x390) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x370);
      if (lVar8 == 0) goto LAB_00710830;
code_r0x00710980:
      *(long *)(unaff_x19 + 0x378) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x358);
      if (lVar8 == 0) goto LAB_00710838;
code_r0x00710990:
      *(long *)(unaff_x19 + 0x360) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x340);
      if (lVar8 == 0) goto LAB_00710840;
code_r0x007109a0:
      *(long *)(unaff_x19 + 0x348) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x328);
      if (lVar8 == 0) goto LAB_00710848;
code_r0x007109b0:
      *(long *)(unaff_x19 + 0x330) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x310);
      if (lVar8 == 0) goto LAB_00710850;
code_r0x007109c0:
      *(long *)(unaff_x19 + 0x318) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x2f8);
      if (lVar8 == 0) goto LAB_00710858;
code_r0x007109d0:
      *(long *)(unaff_x19 + 0x300) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x2e0);
      if (lVar8 == 0) goto LAB_00710860;
code_r0x007109e0:
      *(long *)(unaff_x19 + 0x2e8) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x2c8);
      if (lVar8 == 0) goto LAB_00710868;
code_r0x007109f0:
      *(long *)(unaff_x19 + 0x2d0) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x2b0);
      if (lVar8 == 0) goto LAB_00710870;
code_r0x00710a00:
      *(long *)(unaff_x19 + 0x2b8) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x298);
      if (lVar8 == 0) goto LAB_00710878;
code_r0x00710a10:
      *(long *)(unaff_x19 + 0x2a0) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x280);
      if (lVar8 == 0) goto LAB_00710880;
code_r0x00710a20:
      *(long *)(unaff_x19 + 0x288) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x268);
      if (lVar8 == 0) goto LAB_00710888;
code_r0x00710a30:
      *(long *)(unaff_x19 + 0x270) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x250);
      if (lVar8 == 0) goto LAB_00710890;
code_r0x00710a40:
      *(long *)(unaff_x19 + 600) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x238);
      if (lVar8 == 0) goto LAB_00710898;
code_r0x00710a50:
      *(long *)(unaff_x19 + 0x240) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x220);
      if (lVar8 == 0) goto LAB_007108a0;
code_r0x00710a60:
      *(long *)(unaff_x19 + 0x228) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x208);
      if (lVar8 == 0) goto LAB_007108a8;
code_r0x00710a70:
      *(long *)(unaff_x19 + 0x210) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x1f0);
      if (lVar8 == 0) goto LAB_007108b0;
code_r0x00710a80:
      *(long *)(unaff_x19 + 0x1f8) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0x1d8);
      if (lVar8 == 0) goto LAB_007108bc;
FUN_00710a94:
      *(long *)(unaff_x19 + 0x1e0) = lVar8;
      __ZdlPv();
      lVar8 = *unaff_x21;
      if (lVar8 == 0) goto LAB_007108c4;
code_r0x00710aa4:
      *(long *)(unaff_x19 + 0x1c8) = lVar8;
      __ZdlPv();
      func_0x0062069c(unaff_x19 + 0x1a8);
      lVar8 = *unaff_x20;
      if (lVar8 == 0) goto LAB_007108d4;
code_r0x00710abc:
      *(long *)(unaff_x19 + 0x198) = lVar8;
      __ZdlPv();
      if (*in_stack_00000018 == 0) goto LAB_007108e0;
code_r0x00710ad0:
      __ZdlPv();
      *in_stack_00000018 = 0;
      in_stack_00000018[1] = 0;
      lVar8 = *unaff_x26;
      if (lVar8 == 0) goto LAB_007108e8;
code_r0x00710ae4:
      *(long *)(unaff_x19 + 0x150) = lVar8;
      __ZdlPv();
      func_0x0070f928(unaff_x25 + 3);
      lVar8 = *unaff_x25;
      if (lVar8 == 0) break;
code_r0x00710afc:
      *(long *)(unaff_x19 + 0xe8) = lVar8;
      __ZdlPv();
      lVar8 = *(long *)(unaff_x19 + 0xc0);
      if (lVar8 != 0) goto code_r0x00710b0c;
    }
  }
code_r0x00710b0c:
  *(long *)(unaff_x19 + 200) = lVar8;
  __ZdlPv();
  func_0x00057f4c();
  auVar37 = __Unwind_Resume(uVar7);
  uVar21 = auVar37._8_8_;
  puVar9 = auVar37._0_8_;
  uVar12 = puVar9[2];
  piVar16 = (int *)*puVar9;
  if ((ulong)((long)(uVar12 - (long)piVar16) >> 2) < uVar21) {
    if (piVar16 != (int *)0x0) {
      puVar9[1] = piVar16;
      __ZdlPv();
      uVar12 = 0;
      *puVar9 = 0;
      puVar9[1] = 0;
      puVar9[2] = 0;
    }
    if (uVar21 >> 0x3e != 0) {
LAB_00710d40:
      lVar8 = func_0x00017f90(puVar9);
      piVar16 = (int *)func_0x0070ba50(lVar8 + 0x60,0,1);
      puVar2 = (ulong *)(lVar8 + 0xe0);
      puVar9 = (undefined8 *)(lVar8 + 0x84);
      puVar17 = (undefined8 *)((ulong)&uStack_c0 | 4);
      while( true ) {
        if (5 < *piVar16 - 0x11aU || (1 << (ulong)(*piVar16 - 0x11aU & 0x1f) & 0x23U) == 0) {
          return piVar16;
        }
        iVar5 = *(int *)(lVar8 + 0x80);
        if (*(char *)(lVar8 + 1) != '\0') break;
code_r0x00710f10:
        if (iVar5 == 0x11a) {
          iVar5 = func_0x0070aa6c(lVar8 + 0x80);
          if ((iVar5 != 0) && (pcVar28 = *(char **)(lVar8 + 0x98), *pcVar28 == '!')) {
            uVar6 = func_0x0070aa6c(lVar8 + 0x80);
            if (uVar6 == 0) {
LAB_007110d4:
              uStack_c0 = CONCAT71(uStack_c0._1_7_,*(undefined1 *)(lVar8 + 0x110));
              uVar7 = *puVar9;
              puVar17[1] = *(undefined8 *)(lVar8 + 0x8c);
              *puVar17 = uVar7;
            }
            else {
              uVar21 = (ulong)uVar6;
              while( true ) {
                uVar21 = uVar21 - 1;
                if ((4 < (byte)pcVar28[uVar21 & 0xffffffff] - 9) &&
                   ((byte)pcVar28[uVar21 & 0xffffffff] != 0x20)) break;
                if ((uVar21 & 0xffffffff) == 0) goto LAB_007110d4;
              }
              uStack_c0 = CONCAT71(uStack_c0._1_7_,*(undefined1 *)(lVar8 + 0x110));
              uVar7 = *puVar9;
              puVar17[1] = *(undefined8 *)(lVar8 + 0x8c);
              *puVar17 = uVar7;
              if (uVar21 < 0x7ffffffffffffff8) {
                if (uVar21 < 0x17) {
                  uStack_98 = CONCAT17((char)uVar21,(undefined7)uStack_98);
                  pppppppcVar11 = (char *******)&pppppppcStack_a8;
                  if (uVar21 == 0) goto code_r0x00711010;
code_r0x00710fa4:
                  pcVar3 = pcVar28 + 1;
                  if ((uVar21 < 0x40) ||
                     ((char *)((long)pppppppcVar11 + ~(ulong)pcVar28) <
                      &segment_command_00000020.vmsize)) {
                    pppppppcVar15 = pppppppcVar11;
                    pcVar20 = pcVar3;
code_r0x00710fc8:
                    pppppppcVar11 = pppppppcVar15;
                    do {
                      pcVar28 = pcVar20 + 1;
                      pppppppcVar15 = (char *******)((long)pppppppcVar11 + 1);
                      *(char *)pppppppcVar11 = *pcVar20;
                      pppppppcVar11 = pppppppcVar15;
                      pcVar20 = pcVar28;
                    } while (pcVar28 != pcVar3 + uVar21);
                  }
                  else {
                    uVar23 = uVar21 & 0xffffffffffffffc0;
                    pcVar20 = pcVar3 + uVar23;
                    pppppppcVar15 = (char *******)((long)pppppppcVar11 + uVar23);
                    pcVar28 = pcVar28 + 0x21;
                    pppppppcVar11 = pppppppcVar11 + 4;
                    uVar12 = uVar23;
                    do {
                      ppppppcVar29 = *(char *******)(pcVar28 + -0x20);
                      ppppppcVar32 = *(char *******)(pcVar28 + -8);
                      ppppppcVar31 = *(char *******)(pcVar28 + -0x10);
                      ppppppcVar34 = *(char *******)(pcVar28 + 8);
                      ppppppcVar33 = *(char *******)pcVar28;
                      ppppppcVar36 = *(char *******)(pcVar28 + 0x18);
                      ppppppcVar35 = *(char *******)(pcVar28 + 0x10);
                      pppppppcVar11[-3] = *(char *******)(pcVar28 + -0x18);
                      pppppppcVar11[-4] = ppppppcVar29;
                      pppppppcVar11[-1] = ppppppcVar32;
                      pppppppcVar11[-2] = ppppppcVar31;
                      pppppppcVar11[1] = ppppppcVar34;
                      *pppppppcVar11 = ppppppcVar33;
                      pppppppcVar11[3] = ppppppcVar36;
                      pppppppcVar11[2] = ppppppcVar35;
                      uVar12 = uVar12 - 0x40;
                      pcVar28 = pcVar28 + 0x40;
                      pppppppcVar11 = pppppppcVar11 + 8;
                    } while (uVar12 != 0);
                    if (uVar21 != uVar23) goto code_r0x00710fc8;
                  }
                }
                else {
                  uVar12 = (uVar21 & 0xfffffffffffffff8) + 8;
                  if ((uVar21 | 7) != 0x17) {
                    uVar12 = uVar21 | 7;
                  }
                  pppppppcVar11 = (char *******)__Znwm(uVar12 + 1);
                  uStack_98 = uVar12 + 1 | 0x8000000000000000;
                  pppppppcStack_a8 = pppppppcVar11;
                  uStack_a0 = uVar21;
                  if (uVar21 != 0) goto code_r0x00710fa4;
code_r0x00711010:
                  pppppppcVar15 = pppppppcVar11;
                }
                *(char *)pppppppcVar15 = '\0';
                puVar4 = *(undefined8 **)(lVar8 + 0x100);
                if (puVar4 < *(undefined8 **)(lVar8 + 0x108)) {
                  *(undefined4 *)(puVar4 + 2) = uStack_b0;
                  puVar4[1] = uStack_b8;
                  *puVar4 = uStack_c0;
                  puVar4[5] = uStack_98;
                  puVar4[4] = uStack_a0;
                  puVar4[3] = pppppppcStack_a8;
                  *(undefined8 **)(lVar8 + 0x100) = puVar4 + 6;
                }
                else {
                  uVar7 = func_0x00725bcc(lVar8 + 0xf8,&uStack_c0);
                  *(undefined8 *)(lVar8 + 0x100) = uVar7;
                  if ((long)uStack_98 < 0) {
                    __ZdlPv(pppppppcStack_a8);
                  }
                }
                goto LAB_00710dbc;
              }
            }
            func_0x0001748c(&pppppppcStack_a8);
            goto LAB_007110f0;
          }
        }
        else if (iVar5 == 0x11f) {
          return piVar16;
        }
LAB_00710dbc:
        piVar16 = (int *)func_0x0070ba50(lVar8 + 0x60,0,0);
      }
      uStack_b8 = *(undefined8 *)(lVar8 + 0x8c);
      uStack_c0 = *puVar9;
      piVar10 = *(int **)(lVar8 + 0xe8);
      if (piVar10 < *(int **)(lVar8 + 0xf0)) {
        *piVar10 = iVar5;
        *(undefined8 *)(piVar10 + 3) = uStack_b8;
        *(undefined8 *)(piVar10 + 1) = uStack_c0;
        piVar13 = piVar10 + 5;
code_r0x00710f08:
        *(int **)(lVar8 + 0xe8) = piVar13;
        iVar5 = *(int *)(lVar8 + 0x80);
        goto code_r0x00710f10;
      }
      piVar27 = (int *)*puVar2;
      lVar18 = (long)piVar10 - (long)piVar27 >> 2;
      uVar21 = lVar18 * -0x3333333333333333 + 1;
      if (uVar21 < 0xccccccccccccccd) {
        lVar14 = (long)*(int **)(lVar8 + 0xf0) - (long)piVar27 >> 2;
        uVar12 = lVar14 * -0x6666666666666666;
        if (uVar12 <= uVar21) {
          uVar12 = uVar21;
        }
        if (0x666666666666665 < (ulong)(lVar14 * -0x3333333333333333)) {
          uVar12 = 0xccccccccccccccc;
        }
        if (uVar12 == 0) {
          piVar16 = (int *)0x0;
        }
        else {
          if (0xccccccccccccccc < uVar12) goto LAB_007110f8;
          piVar16 = (int *)__Znwm(uVar12 * 0x14);
        }
        piVar13 = piVar16 + lVar18;
        *piVar13 = iVar5;
        uVar7 = *puVar9;
        *(undefined8 *)(piVar13 + 3) = *(undefined8 *)(lVar8 + 0x8c);
        *(undefined8 *)(piVar13 + 1) = uVar7;
        piVar19 = piVar13;
        if (piVar10 != piVar27) {
          do {
            uVar30 = *(undefined8 *)(piVar10 + -3);
            uVar7 = *(undefined8 *)(piVar10 + -5);
            piVar1 = piVar10 + -1;
            piVar10 = piVar10 + -5;
            piVar19[-1] = *piVar1;
            *(undefined8 *)(piVar19 + -3) = uVar30;
            *(undefined8 *)(piVar19 + -5) = uVar7;
            piVar19 = piVar19 + -5;
          } while (piVar10 != piVar27);
          piVar10 = (int *)*puVar2;
        }
        piVar13 = piVar13 + 5;
        *(int **)(lVar8 + 0xe0) = piVar19;
        *(int **)(lVar8 + 0xe8) = piVar13;
        *(int **)(lVar8 + 0xf0) = piVar16 + uVar12 * 5;
        if (piVar10 != (int *)0x0) {
          piVar16 = (int *)__ZdlPv(piVar10);
        }
        goto code_r0x00710f08;
      }
LAB_007110f0:
      func_0x00017f90(puVar2);
LAB_007110f8:
      uVar7 = func_0x00017514();
      if ((long)uStack_98 < 0) {
        __ZdlPv(pppppppcStack_a8);
      }
      __Unwind_Resume(uVar7);
      uVar6 = *extraout_x1 - 0x126;
      if (uVar6 < 0x11 && (1 << (ulong)(uVar6 & 0x1f) & 0x10007U) != 0 || *extraout_x1 == 0) {
        return (int *)((long)&MACH_HEADER.magic + 1);
      }
      return (int *)0x0;
    }
    uVar23 = (long)uVar12 >> 1;
    if ((ulong)((long)uVar12 >> 1) <= uVar21) {
      uVar23 = uVar21;
    }
    if (0x7ffffffffffffffb < uVar12) {
      uVar23 = 0x3fffffffffffffff;
    }
    if (uVar23 >> 0x3e != 0) goto LAB_00710d40;
    piVar10 = (int *)__Znwm(uVar23 * 4);
    *puVar9 = piVar10;
    puVar9[2] = piVar10 + uVar23;
    piVar16 = piVar10 + uVar21;
    iVar5 = *param_3;
    uVar21 = uVar21 - 1 & 0x3fffffffffffffff;
    piVar13 = piVar10;
    if (0xe < uVar21) {
      uVar21 = uVar21 + 1;
      uVar23 = uVar21 & 0x7ffffffffffffff0;
      uVar7 = CONCAT44(iVar5,iVar5);
      uVar30 = CONCAT44(iVar5,iVar5);
      piVar13 = piVar10 + 8;
      uVar12 = uVar23;
      do {
        *(undefined8 *)(piVar13 + -6) = uVar30;
        *(undefined8 *)(piVar13 + -8) = uVar7;
        *(undefined8 *)(piVar13 + -2) = uVar30;
        *(undefined8 *)(piVar13 + -4) = uVar7;
        *(undefined8 *)(piVar13 + 2) = uVar30;
        *(undefined8 *)piVar13 = uVar7;
        *(undefined8 *)(piVar13 + 6) = uVar30;
        *(undefined8 *)(piVar13 + 4) = uVar7;
        uVar12 = uVar12 - 0x10;
        piVar13 = piVar13 + 0x10;
      } while (uVar12 != 0);
      piVar13 = piVar10 + uVar23;
      if (uVar21 == uVar23) goto code_r0x00710d2c;
    }
    do {
      piVar27 = piVar13 + 1;
      *piVar13 = iVar5;
      piVar13 = piVar27;
    } while (piVar27 != piVar16);
    goto code_r0x00710d2c;
  }
  piVar13 = (int *)puVar9[1];
  uVar23 = (long)piVar13 - (long)piVar16 >> 2;
  uVar12 = uVar23;
  if (uVar21 <= uVar23) {
    uVar12 = uVar21;
  }
  piVar10 = piVar16;
  if (uVar12 != 0) {
    piVar27 = piVar16;
    uVar25 = uVar12;
    if ((0xf < uVar12) && ((param_3 + 1 <= piVar16 || (piVar16 + uVar12 <= param_3)))) {
      uVar24 = uVar12 & 0xfffffffffffffff0;
      piVar10 = piVar16 + uVar24;
      uVar25 = uVar12 & 0xf;
      iVar5 = *param_3;
      uVar7 = CONCAT44(iVar5,iVar5);
      uVar30 = CONCAT44(iVar5,iVar5);
      piVar27 = piVar16 + 8;
      uVar22 = uVar24;
      do {
        *(undefined8 *)(piVar27 + -6) = uVar30;
        *(undefined8 *)(piVar27 + -8) = uVar7;
        *(undefined8 *)(piVar27 + -2) = uVar30;
        *(undefined8 *)(piVar27 + -4) = uVar7;
        *(undefined8 *)(piVar27 + 2) = uVar30;
        *(undefined8 *)piVar27 = uVar7;
        *(undefined8 *)(piVar27 + 6) = uVar30;
        *(undefined8 *)(piVar27 + 4) = uVar7;
        uVar22 = uVar22 - 0x10;
        piVar27 = piVar27 + 0x10;
      } while (uVar22 != 0);
      piVar27 = piVar10;
      if (uVar12 == uVar24) goto code_r0x00710c8c;
    }
    do {
      piVar10 = piVar27 + 1;
      *piVar27 = *param_3;
      uVar25 = uVar25 - 1;
      piVar27 = piVar10;
    } while (uVar25 != 0);
  }
code_r0x00710c8c:
  if (uVar21 < uVar23 || uVar21 - uVar23 == 0) {
    piVar16 = piVar16 + uVar21;
code_r0x00710d2c:
    puVar9[1] = piVar16;
    return piVar10;
  }
  lVar8 = uVar21 * 4 - ((long)piVar13 - (long)piVar16 & 0xfffffffffffffffcU);
  uVar12 = lVar8 - 4;
  piVar16 = piVar13;
  if ((0x4b < uVar12) && ((param_3 + 1 <= piVar13 || ((int *)((long)piVar13 + lVar8) <= param_3))))
  {
    uVar12 = (uVar12 >> 2) + 1;
    uVar22 = uVar12 & 0x7ffffffffffffff0;
    iVar5 = *param_3;
    uVar7 = CONCAT44(iVar5,iVar5);
    uVar30 = CONCAT44(iVar5,iVar5);
    piVar16 = piVar13 + 8;
    uVar25 = uVar22;
    do {
      *(undefined8 *)(piVar16 + -6) = uVar30;
      *(undefined8 *)(piVar16 + -8) = uVar7;
      *(undefined8 *)(piVar16 + -2) = uVar30;
      *(undefined8 *)(piVar16 + -4) = uVar7;
      *(undefined8 *)(piVar16 + 2) = uVar30;
      *(undefined8 *)piVar16 = uVar7;
      *(undefined8 *)(piVar16 + 6) = uVar30;
      *(undefined8 *)(piVar16 + 4) = uVar7;
      uVar25 = uVar25 - 0x10;
      piVar16 = piVar16 + 0x10;
    } while (uVar25 != 0);
    piVar16 = piVar13 + uVar22;
    if (uVar12 == uVar22) goto code_r0x00710d14;
  }
  do {
    piVar27 = piVar16 + 1;
    *piVar16 = *param_3;
    piVar16 = piVar27;
  } while (piVar27 != piVar13 + (uVar21 - uVar23));
code_r0x00710d14:
  puVar9[1] = piVar13 + (uVar21 - uVar23);
  return piVar10;
}

