
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_001a568c(void)

{
  ulong uVar1;
  long lVar2;
  short sVar3;
  short sVar4;
  undefined8 *puVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  undefined4 uVar13;
  undefined8 uVar14;
  ulong uVar15;
  short *psVar16;
  long lVar17;
  dword *pdVar18;
  ulong *extraout_x8;
  ulong uVar19;
  long *extraout_x8_00;
  long *extraout_x8_01;
  ulong *extraout_x8_02;
  ulong *extraout_x8_03;
  undefined2 *puVar20;
  undefined2 *puVar21;
  dword *pdVar22;
  long *plVar23;
  ulong uVar24;
  undefined2 uVar25;
  undefined2 uVar26;
  short *psVar27;
  short *psVar28;
  undefined8 unaff_x22;
  long lVar29;
  long lVar30;
  undefined8 uVar31;
  long lVar32;
  undefined8 *puVar33;
  undefined8 *puVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined1 auVar40 [16];
  undefined8 uStack_200;
  undefined8 uStack_1f8;
  undefined8 uStack_1f0;
  undefined8 uStack_1e8;
  long *plStack_1e0;
  long lStack_1d8;
  undefined8 uStack_1d0;
  ulong uStack_1c8;
  long lStack_1c0;
  long *****ppppplStack_1b0;
  undefined *puStack_1a8;
  long ****pppplStack_160;
  undefined *puStack_158;
  long ***ppplStack_100;
  undefined *puStack_f8;
  long **pplStack_b0;
  undefined *puStack_a8;
  long lStack_98;
  short *psStack_90;
  long lStack_88;
  long *plStack_50;
  undefined *puStack_48;
  
  uVar14 = func_0x007a1f00();
  func_0x0016b01c();
  auVar40 = __Unwind_Resume(uVar14);
  uVar19 = auVar40._8_8_ - auVar40._0_8_;
  if (uVar19 == 0) {
    uVar19 = 0;
    uVar15 = 2;
  }
  else {
    uVar15 = func_0x00187bd0(uVar19 >> 4,2);
    if (uVar15 == 0) {
      auVar40 = func_0x007a1f00(2,uVar19 >> 4);
      puStack_48 = &DAT_001a5848;
      psVar16 = auVar40._0_8_;
      do {
        psVar27 = psVar16;
        if (psVar27 == auVar40._8_8_) {
          *extraout_x8_00 = 0;
          extraout_x8_00[1] = 2;
          extraout_x8_00[2] = 0;
          return;
        }
        sVar3 = *psVar27;
        psVar16 = psVar27 + 2;
      } while (sVar3 == 3);
      sVar4 = psVar27[1];
      plStack_50 = (long *)((long)register0x00000008 + -0x10);
      psVar16 = (short *)func_0x00187bd0(0x10,2);
      if (psVar16 != (short *)0x0) {
        *psVar16 = sVar3;
        psVar16[1] = sVar4;
        lStack_98 = 4;
        lVar29 = 1;
        psVar27 = psVar27 + 2;
        psStack_90 = psVar16;
        while (psVar28 = psVar27, psVar28 != auVar40._8_8_) {
          sVar3 = *psVar28;
          psVar27 = psVar28 + 2;
          if (sVar3 != 3) {
            sVar4 = psVar28[1];
            if (lVar29 == lStack_98) {
              lStack_88 = lVar29;
              func_0x0079b61c(&lStack_98,lVar29,1,2,4);
              psVar16 = psStack_90;
            }
            psVar16[lVar29 * 2] = sVar3;
            (psVar16 + lVar29 * 2)[1] = sVar4;
            lVar29 = lVar29 + 1;
          }
        }
        extraout_x8_00[1] = (long)psStack_90;
        *extraout_x8_00 = lStack_98;
        extraout_x8_00[2] = lVar29;
        return;
      }
      uVar14 = func_0x007a1f00(2,0x10);
      if (lStack_98 != 0) {
        unaff_x22 = 2;
        func_0x00187bd4(psStack_90,lStack_98 << 2);
      }
      auVar40 = __Unwind_Resume(uVar14);
      lVar29 = auVar40._0_8_;
      puStack_a8 = &DAT_001a597c;
      uVar19 = auVar40._8_8_ - lVar29;
      if (uVar19 == 0) {
        lVar32 = 0;
        uVar19 = 0;
        lVar17 = 8;
      }
      else {
        lVar32 = (uVar19 >> 3) * -0x79435e50d79435e5;
        lVar30 = (uVar19 >> 3) * 0x35e50d79435e50d8;
        pplStack_b0 = &plStack_50;
        lVar17 = func_0x00187bd0(lVar30,8);
        lVar12 = _UNK_0081d8f8;
        lVar11 = _UNK_0081d8f0;
        lVar10 = _UNK_0081d8e8;
        lVar9 = _UNK_0081d8e0;
        lVar8 = _UNK_0081d8d8;
        lVar7 = _UNK_0081d8d0;
        lVar6 = _UNK_0081d8c8;
        lVar2 = _UNK_0081d8c0;
        if (lVar17 == 0) {
          auVar40 = func_0x007a1f00(8,lVar30,unaff_x22);
          plVar23 = auVar40._0_8_;
          puStack_f8 = &DAT_001a5ad4;
          lVar29 = *plVar23;
          uVar19 = plVar23[1] - lVar29;
          if (uVar19 == 0) {
            uVar15 = 8;
            uVar19 = 0;
          }
          else {
            ppplStack_100 = &pplStack_b0;
            uVar15 = func_0x00187bd0(uVar19 >> 2,8);
            if (uVar15 == 0) {
              auVar40 = func_0x007a1f00(8,uVar19 >> 2,auVar40._8_8_);
              uVar14 = auVar40._8_8_;
              lVar17 = auVar40._0_8_;
              puStack_158 = &DAT_001a5ba4;
              puVar34 = *(undefined8 **)(lVar17 + 8);
              puVar33 = *(undefined8 **)(lVar17 + 0x18);
              uVar19 = (long)puVar33 - (long)puVar34;
              pppplStack_160 = &ppplStack_100;
              if (uVar19 < 0x7ffffffffffffff9) {
                if (puVar33 == puVar34) {
                  uVar19 = 0;
                  uVar15 = 0;
                  pdVar18 = &MACH_HEADER.cpusubtype;
                }
                else {
                  uVar31 = 8;
                  pdVar18 = (dword *)func_0x00187bd0(uVar19,8);
                  lVar29 = lVar17;
                  if (pdVar18 == (dword *)0x0) goto code_r0x001a5c70;
                  uVar15 = 0;
                  uVar19 = uVar19 >> 6;
                  pdVar22 = pdVar18;
                  do {
                    uVar31 = puVar34[1];
                    uVar14 = *puVar34;
                    uVar36 = puVar34[3];
                    uVar35 = puVar34[2];
                    puVar5 = puVar34 + 5;
                    uVar37 = puVar34[4];
                    uVar39 = puVar34[7];
                    uVar38 = puVar34[6];
                    puVar34 = puVar34 + 8;
                    *(undefined8 *)(pdVar22 + 10) = *puVar5;
                    *(undefined8 *)(pdVar22 + 8) = uVar37;
                    *(undefined8 *)(pdVar22 + 0xe) = uVar39;
                    *(undefined8 *)(pdVar22 + 0xc) = uVar38;
                    *(undefined8 *)(pdVar22 + 2) = uVar31;
                    *(undefined8 *)pdVar22 = uVar14;
                    *(undefined8 *)(pdVar22 + 6) = uVar36;
                    *(undefined8 *)(pdVar22 + 4) = uVar35;
                    uVar15 = uVar15 + 1;
                    pdVar22 = pdVar22 + 0x10;
                  } while (puVar34 != puVar33);
                  *(undefined8 **)(lVar17 + 8) = puVar34;
                }
                *extraout_x8_03 = uVar19;
                extraout_x8_03[1] = (ulong)pdVar18;
                extraout_x8_03[2] = uVar15;
                return;
              }
              uVar31 = 0;
code_r0x001a5c70:
              auVar40 = func_0x007a1f00(uVar31,uVar19,uVar14);
              plVar23 = auVar40._8_8_;
              puStack_1a8 = &DAT_001a5c80;
              lStack_1d8 = plVar23[2];
              lVar17 = lStack_1d8;
              uStack_1d0 = uVar14;
              uStack_1c8 = uVar19;
              lStack_1c0 = lVar29;
              ppppplStack_1b0 = &pppplStack_160;
              if ((ulong)(*plVar23 - lStack_1d8) < 2) {
                func_0x0079b61c(plVar23,lStack_1d8,2,1,1);
                lVar17 = plVar23[2];
              }
              *(undefined2 *)(plVar23[1] + lVar17) = 0xffff;
              plVar23[2] = lVar17 + 2;
              uStack_1f8 = 0x1616161616161616;
              uStack_200 = 0x1616161616161616;
              uStack_1e8 = 0x1616161616161616;
              uStack_1f0 = 0x1616161616161616;
              lVar29 = *(long *)(auVar40._0_8_ + 0x10);
              plStack_1e0 = plVar23;
              if (lVar29 != 0) {
                lVar17 = *(long *)(auVar40._0_8_ + 8);
                lVar29 = lVar29 * 0x28;
                do {
                  func_0x001ade14(lVar17,plVar23);
                  lVar17 = lVar17 + 0x28;
                  lVar29 = lVar29 + -0x28;
                } while (lVar29 != 0);
              }
              func_0x0024031c(&uStack_200);
              return;
            }
            uVar19 = uVar19 >> 6;
            lVar32 = plVar23[2];
            lVar2 = plVar23[3];
            lVar17 = plVar23[4];
            plVar23 = (long *)(uVar15 + 8);
            uVar24 = uVar19;
            do {
              uVar13 = func_0x0025a330(lVar32,lVar2,lVar29);
              *(undefined4 *)(plVar23 + -1) = uVar13;
              *plVar23 = lVar17;
              lVar17 = lVar17 + 1;
              lVar29 = lVar29 + 0x40;
              uVar24 = uVar24 - 1;
              plVar23 = plVar23 + 2;
            } while (uVar24 != 0);
          }
          *extraout_x8_02 = uVar19;
          extraout_x8_02[1] = uVar15;
          extraout_x8_02[2] = uVar19;
          return;
        }
        if (uVar19 - 0x98 < 0x428) {
          uVar19 = 0;
          lVar30 = lVar29;
        }
        else {
          uVar15 = (uVar19 - 0x98) / 0x98 + 1;
          uVar19 = uVar15 & 0x3fffffffffffff8;
          lVar30 = lVar29 + uVar19 * 0x98;
          plVar23 = (long *)(lVar17 + 0x20);
          uVar24 = uVar19;
          do {
            plVar23[-3] = lVar29 + lVar6;
            plVar23[-4] = lVar29 + lVar2;
            plVar23[-1] = lVar29 + lVar8;
            plVar23[-2] = lVar29 + lVar7;
            plVar23[1] = lVar29 + lVar10;
            *plVar23 = lVar29 + lVar9;
            plVar23[3] = lVar29 + lVar12;
            plVar23[2] = lVar29 + lVar11;
            lVar29 = lVar29 + 0x4c0;
            uVar24 = uVar24 - 8;
            plVar23 = plVar23 + 8;
          } while (uVar24 != 0);
          if (uVar15 == uVar19) goto code_r0x001a5aa4;
        }
        do {
          *(long *)(lVar17 + uVar19 * 8) = lVar30;
          lVar30 = lVar30 + 0x98;
          uVar19 = uVar19 + 1;
        } while (lVar30 != auVar40._8_8_);
      }
code_r0x001a5aa4:
      *extraout_x8_01 = lVar32;
      extraout_x8_01[1] = lVar17;
      extraout_x8_01[2] = uVar19;
      return;
    }
    uVar19 = uVar19 >> 6;
    puVar20 = (undefined2 *)(auVar40._0_8_ + 0x22);
    puVar21 = (undefined2 *)(uVar15 + 2);
    uVar24 = uVar19;
code_r0x001a5714:
    do {
      uVar1 = *(long *)(puVar20 + -0x11) + 0x7fffffffffffffff;
      if (0x16 < uVar1) {
        uVar1 = 0x13;
      }
      uVar26 = (undefined2)uVar1;
      uVar25 = 0xb;
      switch(*(long *)(puVar20 + -0x11)) {
      case -0x7fffffffffffffff:
        goto code_r0x001a57e0;
      case -0x7ffffffffffffffe:
        uVar25 = 10;
        break;
      case -0x7ffffffffffffffd:
        uVar25 = 0xd;
        break;
      case -0x7ffffffffffffffc:
        uVar25 = 0;
        break;
      case -0x7ffffffffffffffb:
        uVar25 = 0x17;
        break;
      case -0x7ffffffffffffffa:
        uVar25 = 0x10;
        break;
      case -0x7ffffffffffffff9:
        uVar25 = 0x1a;
        break;
      case -0x7ffffffffffffff8:
        uVar25 = 0x22;
        break;
      case -0x7ffffffffffffff7:
        uVar25 = 0x1c;
        break;
      case -0x7ffffffffffffff6:
        uVar25 = 0x18;
        break;
      case -0x7ffffffffffffff5:
        uVar25 = 0x1b;
        break;
      case -0x7ffffffffffffff4:
        uVar25 = 0x15;
        break;
      case -0x7ffffffffffffff3:
        uVar25 = 5;
        break;
      case -0x7ffffffffffffff2:
        uVar25 = 0x13;
        break;
      case -0x7ffffffffffffff1:
        uVar25 = 0x12;
        break;
      case -0x7ffffffffffffff0:
        uVar25 = 0x23;
        break;
      case -0x7fffffffffffffef:
        uVar25 = 0x27;
        break;
      case -0x7fffffffffffffee:
        uVar25 = 0x19;
        break;
      case -0x7fffffffffffffed:
        uVar25 = 0x16;
        break;
      default:
        uVar25 = 0x28;
        break;
      case -0x7fffffffffffffeb:
        uVar25 = 0x29;
        break;
      case -0x7fffffffffffffea:
        uVar25 = 0x1e;
        break;
      case -0x7fffffffffffffe9:
        uVar25 = puVar20[-1];
        uVar26 = *puVar20;
code_r0x001a57e0:
        puVar21[-1] = uVar25;
        *puVar21 = uVar26;
        puVar20 = puVar20 + 0x20;
        uVar24 = uVar24 - 1;
        puVar21 = puVar21 + 2;
        if (uVar24 == 0) goto code_r0x001a581c;
        goto code_r0x001a5714;
      }
      puVar21[-1] = uVar25;
      *puVar21 = uVar26;
      puVar20 = puVar20 + 0x20;
      uVar24 = uVar24 - 1;
      puVar21 = puVar21 + 2;
    } while (uVar24 != 0);
  }
code_r0x001a581c:
  *extraout_x8 = uVar19;
  extraout_x8[1] = uVar15;
  extraout_x8[2] = uVar19;
  return;
}

