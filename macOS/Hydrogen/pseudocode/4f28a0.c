
undefined8 thunk_FUN_004f29bc(undefined8 param_1)

{
  undefined8 *puVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  ulong *puVar5;
  long lVar6;
  undefined8 in_x7;
  long lVar7;
  ulong uVar8;
  long *plVar9;
  long lVar10;
  long *plVar11;
  long lVar12;
  long lVar13;
  long *plVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  long *plVar18;
  undefined8 *puVar19;
  undefined8 *puVar20;
  long unaff_x24;
  long lVar21;
  undefined8 uVar22;
  ulong uVar23;
  long lVar24;
  undefined1 auVar25 [16];
  undefined1 uStack0000000000000070;
  undefined8 uStack_180;
  undefined8 uStack_130;
  ulong *puStack_128;
  undefined8 uStack_120;
  undefined1 auStack_118 [24];
  ulong uStack_100;
  long lStack_f8;
  undefined8 uStack_f0;
  long lStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  long lStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  ulong uStack_b8;
  long lStack_b0;
  undefined8 uStack_a8;
  long lStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  long lStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  
  func_0x0016b01c(&uStack0000000000000070);
  if (unaff_x24 == 0) {
    func_0x0016b01c();
  }
  auVar25 = __Unwind_Resume(param_1);
  lVar6 = auVar25._8_8_;
  lVar4 = auVar25._0_8_;
  lVar7 = *(long *)(*(long *)(lVar4 + 0x10) + 0x90);
  if (lVar7 == 0) {
    return 0;
  }
  lVar15 = *(long *)(*(long *)(lVar4 + 0x10) + 0x88);
  lVar7 = lVar15 + lVar7 * 600;
  uStack_180 = 1;
LAB_004f2b30:
  lVar10 = *(long *)(lVar15 + 0x198);
  plVar9 = &lStack_f8;
  if ((lVar10 != 0) && (*(long *)(lVar6 + 0x50) != 0)) {
    lVar21 = *(long *)(lVar15 + 0x220);
    uVar22 = *(undefined8 *)(lVar15 + 0x218);
    plVar14 = (long *)(*(long *)(lVar6 + 0x48) + 8);
    lVar13 = *(long *)(lVar6 + 0x50) << 4;
    lVar16 = lVar13;
    plVar18 = plVar14;
    do {
      if ((*plVar18 == lVar21) && (iVar3 = _memcmp(plVar18[-1],uVar22,lVar21), iVar3 == 0))
      goto LAB_004f2b94;
      plVar18 = plVar18 + 2;
      lVar16 = lVar16 + -0x10;
    } while (lVar16 != 0);
    puVar19 = *(undefined8 **)(lVar15 + 400);
    lVar16 = *(long *)(lVar6 + 0x60);
    uVar8 = *(ulong *)(lVar6 + 0x68);
    puVar20 = puVar19;
    do {
      uVar23 = 0;
      puVar1 = puVar20 + 6;
      uVar22 = *puVar20;
      lVar21 = puVar20[1];
      plVar11 = (long *)(lVar16 + 0x58);
      lVar12 = lVar13;
      plVar18 = plVar14;
      do {
        if ((*plVar18 == lVar21) && (iVar3 = _memcmp(plVar18[-1],uVar22,lVar21), iVar3 == 0)) {
          if (uVar8 <= uVar23) goto code_r0x004f2f3c;
          uVar23 = puVar20[2];
          if (uVar23 == 0) goto code_r0x004f2dac;
          if (*plVar11 != 0) {
            lVar21 = plVar11[-1];
            lVar12 = lVar21 + *plVar11 * 0x18;
            do {
              if (*(long *)(lVar21 + 0x10) != 0) {
                lVar24 = puVar20[3];
                lVar17 = *(long *)(lVar21 + 0x10) * 0x18;
                plVar18 = (long *)(*(long *)(lVar21 + 8) + 0x10);
                do {
                  if ((lVar24 == *plVar18) &&
                     (iVar3 = _memcmp(uVar23,plVar18[-1],lVar24), iVar3 == 0))
                  goto code_r0x004f2dac;
                  lVar17 = lVar17 + -0x18;
                  plVar18 = plVar18 + 3;
                } while (lVar17 != 0);
              }
              lVar21 = lVar21 + 0x18;
            } while (lVar21 != lVar12);
          }
          break;
        }
        plVar18 = plVar18 + 2;
        plVar11 = plVar11 + 0xd;
        uVar23 = uVar23 + 1;
        lVar12 = lVar12 + -0x10;
      } while (lVar12 != 0);
      puVar20 = puVar1;
    } while (puVar1 != puVar19 + lVar10 * 6);
  }
LAB_004f2b94:
  lVar10 = *(long *)(lVar15 + 0x180);
  if (lVar10 != 0) {
    if (*(long *)(lVar6 + 0x50) != 0) {
      lVar13 = *(long *)(lVar15 + 0x220);
      uVar22 = *(undefined8 *)(lVar15 + 0x218);
      plVar14 = (long *)(*(long *)(lVar6 + 0x48) + 8);
      lVar16 = *(long *)(lVar6 + 0x50) << 4;
      do {
        if ((*plVar14 == lVar13) && (iVar3 = _memcmp(plVar14[-1],uVar22,lVar13), iVar3 == 0))
        goto LAB_004f2b20;
        plVar14 = plVar14 + 2;
        lVar16 = lVar16 + -0x10;
      } while (lVar16 != 0);
    }
    func_0x004e8a1c(auStack_118,*(long *)(lVar15 + 0x178),*(long *)(lVar15 + 0x178) + lVar10 * 0x10,
                    &UNK_009e8050);
    func_0x004f17d0(&uStack_b8,lVar4,3,0,lVar15,auStack_118,0,in_x7,lVar6);
    if (uStack_b8 == 0x8000000000000009) {
      return lStack_b0;
    }
    lStack_f8 = lStack_b0;
    uStack_100 = uStack_b8;
    lStack_e8 = lStack_a0;
    uStack_f0 = uStack_a8;
    uStack_d8 = uStack_90;
    uStack_e0 = uStack_98;
    uStack_c8 = uStack_80;
    lStack_d0 = lStack_88;
    uStack_c0 = uStack_78;
    uVar8 = uStack_b8 ^ 0x8000000000000000;
    if (8 < uVar8) {
      uVar8 = 4;
    }
    if (1 < uVar8 - 6) {
      if (uVar8 == 4) goto LAB_004f2ebc;
      goto code_r0x004f2c98;
    }
    goto LAB_004f2eec;
  }
  goto LAB_004f2b20;
code_r0x004f2dac:
  if (puVar20[4] == 0) {
LAB_004f2b20:
    lVar15 = lVar15 + 600;
    if (lVar15 == lVar7) {
      return 0;
    }
    goto LAB_004f2b30;
  }
  puVar5 = (ulong *)func_0x00187bd0(0x18,8);
  if (puVar5 == (ulong *)0x0) {
    func_0x007a1f18(8,0x18);
code_r0x004f2f3c:
    func_0x007a2570(uVar23,uVar8,&UNK_009e9b68);
  }
  else {
    uVar23 = puVar20[5];
    if (-1 < (long)uVar23) {
      uVar22 = puVar20[4];
      if (uVar23 == 0) {
        uVar8 = 1;
      }
      else {
        uVar8 = func_0x00187bd0(uVar23,1);
        if (uVar8 == 0) goto code_r0x004f2f54;
      }
      _memcpy(uVar8,uVar22,uVar23);
      *puVar5 = uVar23;
      puVar5[1] = uVar8;
      puVar5[2] = uVar23;
      uStack_130 = 1;
      uStack_120 = 1;
      puStack_128 = puVar5;
      func_0x004f17d0(&uStack_b8,lVar4,3,0,lVar15,&uStack_130,0,in_x7,lVar6);
      if (uStack_b8 == 0x8000000000000009) {
        return lStack_b0;
      }
      lStack_f8 = lStack_b0;
      uStack_100 = uStack_b8;
      lStack_e8 = lStack_a0;
      uStack_f0 = uStack_a8;
      uStack_d8 = uStack_90;
      uStack_e0 = uStack_98;
      uStack_c8 = uStack_80;
      lStack_d0 = lStack_88;
      uStack_c0 = uStack_78;
      uVar8 = uStack_b8 ^ 0x8000000000000000;
      if (8 < uVar8) {
        uVar8 = 4;
      }
      if (1 < uVar8 - 6) {
        if (uVar8 == 4) {
LAB_004f2ebc:
          uStack_100 = uStack_b8;
          lStack_f8 = lStack_b0;
          uStack_f0 = uStack_a8;
          lStack_e8 = lStack_a0;
          uStack_e0 = uStack_98;
          uStack_d8 = uStack_90;
          lStack_d0 = lStack_88;
          uStack_c8 = uStack_80;
          uStack_c0 = uStack_78;
          if (uStack_b8 != 0) {
            func_0x00187bd4(lStack_b0,uStack_b8,1);
          }
          plVar9 = &lStack_d0;
          if (lStack_e8 != 0) {
            func_0x00187bd4(uStack_e0,lStack_e8 << 4,8);
          }
        }
        else {
code_r0x004f2c98:
          uStack_100 = uStack_b8;
          lStack_f8 = lStack_b0;
          uStack_f0 = uStack_a8;
          lStack_e8 = lStack_a0;
          uStack_e0 = uStack_98;
          uStack_d8 = uStack_90;
          lStack_d0 = lStack_88;
          uStack_c8 = uStack_80;
          uStack_c0 = uStack_78;
          if (uVar8 != 0) goto LAB_004f2b20;
        }
      }
LAB_004f2eec:
      if (*plVar9 != 0) {
        func_0x00187bd4(plVar9[1],*plVar9,1);
      }
      goto LAB_004f2b20;
    }
  }
  uStack_180 = 0;
code_r0x004f2f54:
  func_0x007a1f00(uStack_180,uVar23,&UNK_009e8da8);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4f2f6c);
  (*pcVar2)();
}

