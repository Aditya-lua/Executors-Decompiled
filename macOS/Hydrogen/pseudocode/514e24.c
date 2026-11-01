
void FUN_00514e24(void)

{
  double *pdVar1;
  double dVar2;
  code *pcVar3;
  int iVar4;
  undefined8 uVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  long in_x3;
  long in_x4;
  long in_x5;
  ulong in_x6;
  ulong in_x7;
  ulong *extraout_x8;
  ulong *puVar9;
  ulong uVar10;
  long *plVar11;
  ulong uVar12;
  ulong uVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  undefined8 *puVar17;
  long unaff_x23;
  long lVar18;
  undefined8 uVar19;
  double unaff_x28;
  double dVar20;
  undefined1 auVar21 [16];
  undefined1 uStack0000000000000018;
  undefined8 uStack_1d8;
  undefined8 uStack_1a0;
  long lStack_188;
  long lStack_180;
  long lStack_178;
  ulong uStack_170;
  long lStack_168;
  ulong uStack_160;
  ulong uStack_158;
  ulong uStack_150;
  ulong uStack_148;
  ulong uStack_140;
  ulong uStack_138;
  ulong uStack_130;
  long lStack_128;
  ulong uStack_120;
  long lStack_e8;
  long lStack_e0;
  ulong uStack_d8;
  ulong uStack_d0;
  ulong uStack_c8;
  long lStack_c0;
  long lStack_b8;
  long lStack_b0;
  ulong uStack_a8;
  ulong uStack_a0;
  undefined1 auStack_98 [16];
  long lStack_88;
  long lStack_80;
  
  lVar8 = 1;
  func_0x00187bd4();
  func_0x00513d08(&uStack0000000000000018);
  uVar5 = __Unwind_Resume();
  func_0x00513d08(&uStack0000000000000018);
  auVar21 = __Unwind_Resume(uVar5);
  lVar14 = auVar21._8_8_;
  uVar5 = auVar21._0_8_;
  uStack_170 = 0;
  lStack_168 = 8;
  uStack_160 = 0;
  if (in_x4 != in_x5) {
    uStack_1a0 = 1;
    do {
      uVar19 = *(undefined8 *)(in_x4 + 8);
      dVar2 = *(double *)(in_x4 + 0x10);
      dVar20 = (double)func_0x005320d4(uVar5,lVar14,uVar19,dVar2);
      if (0.7 < dVar20) {
        if ((long)dVar2 < 0) {
          uStack_1a0 = 0;
code_r0x005153c4:
          func_0x007a1f00(uStack_1a0,unaff_x28,&UNK_009e9838);
FUN_005153fc:
                    /* WARNING: Does not return */
          pcVar3 = (code *)SoftwareBreakpoint(1,0x515400);
          (*pcVar3)();
        }
        if (dVar2 == 0.0) {
          unaff_x28 = 4.94065645841247e-324;
          _memcpy(1,uVar19,0);
          if (uStack_160 != 0) goto LAB_00514f44;
LAB_00514f70:
          uVar12 = uStack_160;
          uVar13 = uStack_160;
          if (uStack_160 == uStack_170) goto LAB_00514fcc;
        }
        else {
          unaff_x28 = (double)func_0x00187bd0(dVar2,1);
          if (unaff_x28 == 0.0) {
            unaff_x28 = dVar2;
            goto code_r0x005153c4;
          }
          _memcpy(unaff_x28,uVar19,dVar2);
          if (uStack_160 == 0) goto LAB_00514f70;
LAB_00514f44:
          if (uStack_160 == 1) {
            uVar12 = 0;
          }
          else {
            uVar12 = 0;
            uVar13 = uStack_160;
            do {
              uVar7 = (uVar13 >> 1) + uVar12;
              if (*(double *)(lStack_168 + uVar7 * 0x20) <= dVar20) {
                uVar12 = uVar7;
              }
              uVar13 = uVar13 - (uVar13 >> 1);
            } while (1 < uVar13);
          }
          if (*(double *)(lStack_168 + uVar12 * 0x20) <= dVar20) {
            uVar12 = uVar12 + 1;
          }
          uVar13 = uStack_160;
          if (uStack_160 == uStack_170) {
LAB_00514fcc:
            uVar13 = uStack_160;
            func_0x0050c2ec(&uStack_170,&UNK_009e9850);
          }
        }
        pdVar1 = (double *)(lStack_168 + uVar12 * 0x20);
        if (uVar12 <= uVar13 && uVar13 - uVar12 != 0) {
          _memmove(pdVar1 + 4,pdVar1,(uVar13 - uVar12) * 0x20);
        }
        *pdVar1 = dVar20;
        pdVar1[1] = dVar2;
        pdVar1[2] = unaff_x28;
        pdVar1[3] = dVar2;
        uStack_160 = uVar13 + 1;
      }
      in_x4 = in_x4 + 0x18;
      unaff_x23 = lVar14;
    } while (in_x4 != in_x5);
  }
  uStack_d0 = lStack_168 + uStack_160 * 0x20;
  lStack_e8 = lStack_168;
  lStack_e0 = lStack_168;
  uStack_d8 = uStack_170;
  func_0x0051601c(&lStack_188,&lStack_e8,&UNK_009e7fb0);
  if (lStack_178 == 0) {
    if (in_x6 != in_x7) {
      if (in_x3 == 0) {
        do {
          func_0x00500450(in_x6,0);
          func_0x00514b20(&uStack_a8,uVar5,lVar14,*(long *)(in_x6 + 0xa0),
                          *(long *)(in_x6 + 0xa0) + *(long *)(in_x6 + 0xa8) * 0x20);
          uVar13 = uStack_a0;
          uVar12 = uStack_a8;
          if (auStack_98._0_8_ == 0) {
            if (uStack_a8 != 0) {
              lVar8 = uStack_a8 * 0x18;
              uVar19 = 8;
              uVar7 = uStack_a0;
              goto code_r0x005152cc;
            }
          }
          else {
            lVar18 = auStack_98._0_8_ + -1;
            plVar11 = (long *)(uStack_a0 + lVar18 * 0x18);
            lVar8 = *plVar11;
            uVar7 = plVar11[1];
            if (lVar18 != 0) {
              puVar17 = (undefined8 *)(uStack_a0 + 8);
              do {
                if (puVar17[-1] != 0) {
                  func_0x00187bd4(*puVar17,puVar17[-1],1);
                }
                puVar17 = puVar17 + 3;
                lVar18 = lVar18 + -1;
              } while (lVar18 != 0);
            }
            func_0x00187bd4(uVar13,uVar12 * 0x18,8);
            if (lVar8 != 0) {
              uVar19 = 1;
code_r0x005152cc:
              func_0x00187bd4(uVar7,lVar8,uVar19);
            }
          }
          in_x6 = in_x6 + 0x2c8;
        } while (in_x6 != in_x7);
      }
      else {
        uStack_1d8 = 1;
        do {
          func_0x00500450(in_x6,0);
          uVar19 = *(undefined8 *)(in_x6 + 0x230);
          lVar18 = *(long *)(in_x6 + 0x238);
          func_0x00514b20(&uStack_a8,uVar5,lVar14,*(long *)(in_x6 + 0xa0),
                          *(long *)(in_x6 + 0xa0) + *(long *)(in_x6 + 0xa8) * 0x20);
          uVar13 = uStack_a0;
          uVar12 = uStack_a8;
          in_x6 = in_x6 + 0x2c8;
          if (auStack_98._0_8_ == 0) {
            if (uStack_a8 != 0) {
              uVar7 = uStack_a8 * 0x18;
              uVar19 = 8;
              uVar6 = uStack_a0;
              goto code_r0x005150c4;
            }
          }
          else {
            lVar15 = auStack_98._0_8_ + -1;
            puVar9 = (ulong *)(uStack_a0 + lVar15 * 0x18);
            uVar7 = *puVar9;
            uVar6 = puVar9[1];
            uVar10 = puVar9[2];
            if (lVar15 != 0) {
              puVar17 = (undefined8 *)(uStack_a0 + 8);
              do {
                if (puVar17[-1] != 0) {
                  func_0x00187bd4(*puVar17,puVar17[-1],1);
                }
                puVar17 = puVar17 + 3;
                lVar15 = lVar15 + -1;
              } while (lVar15 != 0);
            }
            func_0x00187bd4(uVar13,uVar12 * 0x18,8);
            lVar15 = 0;
            lVar16 = in_x3 << 4;
            plVar11 = (long *)(lVar8 + 8);
            do {
              if ((*plVar11 == lVar18) && (iVar4 = _memcmp(plVar11[-1],uVar19,lVar18), iVar4 == 0))
              {
                if (lVar18 < 0) {
                  uStack_1d8 = 0;
code_r0x005153e8:
                  func_0x007a1f00(uStack_1d8,unaff_x23,&UNK_009e9838);
                  goto FUN_005153fc;
                }
                if (lVar18 == 0) {
                  unaff_x23 = 1;
                }
                else {
                  unaff_x23 = func_0x00187bd0(lVar18,1);
                  if (unaff_x23 == 0) {
                    unaff_x23 = lVar18;
                    goto code_r0x005153e8;
                  }
                }
                _memcpy(unaff_x23,uVar19,lVar18);
                if (uVar7 == 0x8000000000000000) goto code_r0x005150c8;
                lStack_e8 = lVar15;
                lStack_e0 = lVar15;
                uStack_d8 = uVar7;
                uStack_d0 = uVar6;
                uStack_c8 = uVar10;
                lStack_c0 = lVar18;
                lStack_b8 = unaff_x23;
                lStack_b0 = lVar18;
                uStack_a8 = in_x6;
                uStack_a0 = in_x7;
                lStack_88 = lVar8;
                lStack_80 = in_x3;
                auStack_98 = auVar21;
                func_0x0051ebd4(&uStack_170,&uStack_a8,&lStack_e8);
                if (uStack_160 == 0x8000000000000000) goto code_r0x00515274;
                extraout_x8[1] = uStack_158;
                *extraout_x8 = uStack_160;
                extraout_x8[3] = uStack_148;
                extraout_x8[2] = uStack_150;
                extraout_x8[5] = uStack_138;
                extraout_x8[4] = uStack_140;
                lStack_128 = lStack_168;
                uStack_130 = uStack_170;
                uStack_120 = uStack_160;
                goto joined_r0x005153b0;
              }
              lVar15 = lVar15 + 1;
              lVar16 = lVar16 + -0x10;
              plVar11 = plVar11 + 2;
            } while (lVar16 != 0);
            if (uVar7 != 0) {
              uVar19 = 1;
code_r0x005150c4:
              func_0x00187bd4(uVar6,uVar7,uVar19);
            }
          }
code_r0x005150c8:
        } while (in_x6 != in_x7);
      }
    }
code_r0x00515274:
    *extraout_x8 = 0x8000000000000000;
  }
  else {
    lVar14 = lStack_178 + -1;
    puVar9 = (ulong *)(lStack_180 + lVar14 * 0x18);
    uVar12 = *puVar9;
    extraout_x8[1] = puVar9[1];
    *extraout_x8 = uVar12;
    extraout_x8[2] = puVar9[2];
    extraout_x8[3] = 0x8000000000000000;
    if (lVar14 != 0) {
      puVar17 = (undefined8 *)(lStack_180 + 8);
      do {
        if (puVar17[-1] != 0) {
          func_0x00187bd4(*puVar17,puVar17[-1],1);
        }
        puVar17 = puVar17 + 3;
        lVar14 = lVar14 + -1;
      } while (lVar14 != 0);
    }
  }
joined_r0x005153b0:
  if (lStack_188 != 0) {
    func_0x00187bd4(lStack_180,lStack_188 * 0x18,8);
  }
  return;
}

