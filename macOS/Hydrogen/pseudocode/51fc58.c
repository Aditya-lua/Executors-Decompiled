
long * FUN_0051fc58(long *param_1,long *param_2)

{
  long *plVar1;
  long lVar2;
  code *pcVar3;
  int iVar4;
  long lVar5;
  long *plVar6;
  ulong uVar7;
  long *plVar8;
  long lVar9;
  int *piVar11;
  int *piVar10;
  long *plVar12;
  long *unaff_x21;
  long lVar13;
  long unaff_x24;
  long *plVar14;
  long *plVar15;
  undefined8 *unaff_x26;
  long unaff_x28;
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long lStack_120;
  long lStack_118;
  long lStack_110;
  long *plStack_108;
  undefined *puStack_100;
  undefined8 uStack_f8;
  long lStack_f0;
  long lStack_e8;
  long alStack_e0 [2];
  long lStack_d0;
  long lStack_c8;
  undefined8 *puStack_c0;
  long lStack_b8;
  long lStack_b0;
  long *plStack_a8;
  long lStack_a0;
  long *plStack_98;
  long *plStack_90;
  long *plStack_88;
  long *plStack_80;
  undefined *puStack_78;
  long *plStack_68;
  long lStack_10;
  undefined *puStack_8;
  
  if ((int *)*param_2 != (int *)param_2[1]) {
    piVar10 = (int *)*param_2;
    do {
      piVar11 = piVar10 + 8;
      if (*piVar10 == 1) {
        *param_2 = (long)(piVar10 + 8);
        param_2 = (long *)func_0x0045b558(&uStack0000000000000008,*(undefined8 *)(piVar10 + 2),
                                          *(undefined8 *)(piVar10 + 4));
        lVar9 = in_stack_00000018;
        lVar2 = in_stack_00000010;
        lVar5 = in_stack_00000010;
        if (uStack0000000000000008 == -0x8000000000000000) {
          if (in_stack_00000018 < 0) {
            lVar13 = 0;
LAB_0051fd40:
            plVar8 = (long *)&UNK_009e80a0;
            auVar16 = func_0x007a1f00(lVar13,lVar9);
            plVar6 = auVar16._0_8_;
            puStack_8 = &DAT_0051fd54;
            plStack_68 = (long *)plVar6[1];
            if ((long *)*plVar6 == plStack_68) {
              plVar12 = (long *)0x0;
            }
            else {
              lVar5 = *auVar16._8_8_;
              lVar2 = plVar6[3];
              lVar9 = plVar6[2];
              plVar12 = (long *)*plVar6;
              lStack_10 = (long)register0x00000008 + 0x50;
              do {
                plVar1 = plVar12 + 2;
                if (lVar9 == lVar2) {
                  *plVar6 = (long)plVar1;
                  auVar16 = func_0x007a23bc(&UNK_009e9bf8);
                  lVar9 = auVar16._0_8_;
                  puStack_78 = &DAT_0051fe60;
                  plVar14 = *(long **)(lVar9 + 0x18);
                  plVar15 = *(long **)(lVar9 + 8);
                  plStack_80 = &lStack_10;
                  lStack_b8 = lVar5;
                  lStack_c8 = lVar2;
                  plStack_a8 = plVar1;
                  plStack_88 = plVar6;
                  plStack_98 = unaff_x21;
                  lStack_a0 = lVar13;
                  plStack_90 = plVar12;
                  lStack_b0 = unaff_x24;
                  puStack_c0 = unaff_x26;
                  lStack_d0 = unaff_x28;
                  do {
                    if (plVar15 == plVar14) {
                      return auVar16._8_8_;
                    }
                    lVar2 = *plVar15;
                    lVar5 = plVar15[1];
                    lStack_e8 = plVar15[2];
                    plVar15 = plVar15 + 3;
                    *(long **)(lVar9 + 8) = plVar15;
                    lStack_120 = 0;
                    lStack_118 = 1;
                    puStack_100 = &UNK_009eb030;
                    uStack_f8 = 0xe0000020;
                    plStack_108 = &lStack_120;
                    lStack_110 = 0;
                    uVar7 = (ulong)alStack_e0[0] >> 8;
                    alStack_e0[0] = CONCAT71((int7)uVar7,0xc);
                    lStack_f0 = lVar5;
                    while( true ) {
                      auVar17 = func_0x0051110c(&lStack_f0,alStack_e0);
                      if (auVar17._0_8_ == 0) break;
                      uVar7 = func_0x0046adc0(auVar17._0_8_,auVar17._8_8_,&plStack_108);
                      if ((uVar7 & 1) != 0) {
                        func_0x007a2810(&UNK_008a839e,0x37,&lStack_f0,&UNK_009eb078,&UNK_009eb060);
                    /* WARNING: Does not return */
                        pcVar3 = (code *)SoftwareBreakpoint(1,0x52ecbc);
                        (*pcVar3)();
                      }
                    }
                    lStack_e8 = lStack_118;
                    lStack_f0 = lStack_120;
                    alStack_e0[0] = lStack_110;
                    if (lVar2 != 0) {
                      func_0x00187bd4(lVar5,lVar2,1);
                    }
                    plVar8[1] = lStack_e8;
                    *plVar8 = lStack_f0;
                    plVar8[2] = alStack_e0[0];
                    plVar8 = plVar8 + 3;
                  } while( true );
                }
                unaff_x28 = lVar9 + 0x68;
                plVar6[2] = unaff_x28;
                if ((*(char *)(lVar9 + 0x61) != '\0') && (*(long *)(lVar5 + 0x90) != 0)) {
                  lVar13 = *plVar12;
                  unaff_x21 = (long *)plVar12[1];
                  unaff_x26 = (undefined8 *)(*(long *)(lVar5 + 0x88) + 0x218);
                  unaff_x24 = *(long *)(lVar5 + 0x90) * 600;
                  do {
                    if ((long *)unaff_x26[1] == unaff_x21) {
                      plVar8 = unaff_x21;
                      iVar4 = _memcmp(*unaff_x26,lVar13);
                      if (iVar4 == 0) {
                        if ((*(byte *)(unaff_x26 + 7) >> 2 & 1) == 0) goto code_r0x0051fe20;
                        break;
                      }
                    }
                    unaff_x26 = unaff_x26 + 0x4b;
                    unaff_x24 = unaff_x24 + -600;
                  } while (unaff_x24 != 0);
                }
                lVar9 = unaff_x28;
                plVar12 = plVar1;
              } while (plVar1 != plStack_68);
              plVar12 = (long *)0x0;
code_r0x0051fe20:
              *plVar6 = (long)plVar1;
            }
            return plVar12;
          }
          if (in_stack_00000018 == 0) {
            lVar5 = 1;
          }
          else {
            lVar13 = 1;
            lVar5 = func_0x00187bd0(in_stack_00000018,1);
            if (lVar5 == 0) goto LAB_0051fd40;
          }
          param_2 = (long *)_memcpy(lVar5,lVar2,lVar9);
          uStack0000000000000008 = lVar9;
        }
        param_1[1] = lVar5;
        param_1[2] = lVar9;
        goto LAB_0051fd20;
      }
      piVar10 = piVar11;
    } while (piVar11 != (int *)param_2[1]);
    *param_2 = (long)piVar11;
  }
  uStack0000000000000008 = -0x8000000000000000;
LAB_0051fd20:
  *param_1 = uStack0000000000000008;
  return param_2;
}

