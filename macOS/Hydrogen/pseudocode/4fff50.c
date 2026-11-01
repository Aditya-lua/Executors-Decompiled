
undefined8 FUN_004fff50(undefined8 param_1)

{
  undefined8 *puVar1;
  long *plVar2;
  undefined8 uVar3;
  int iVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 extraout_x1;
  ulong uVar7;
  ulong extraout_x1_00;
  undefined *puVar8;
  undefined8 extraout_x8;
  ulong uVar9;
  ulong extraout_x8_00;
  undefined8 *extraout_x8_01;
  long lVar10;
  long lVar11;
  long *plVar12;
  undefined8 *puVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  undefined1 auVar18 [16];
  long alStack_198 [2];
  long lStack_188;
  long lStack_180;
  long lStack_178;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 auStack_120 [2];
  long lStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  long lStack_f8;
  long lStack_f0;
  long lStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  
  func_0x007a23d8(param_1,0x22);
  lVar5 = func_0x007a2570(extraout_x8,extraout_x1,&UNK_009e9b68);
  lVar10 = 0;
  lVar11 = *(long *)(lVar5 + 0xf0) << 4;
  uVar9 = 0xffffffffffffffff;
  plVar12 = *(long **)(lVar5 + 0xe8);
  do {
    if (lVar11 == 0) goto LAB_00500018;
    lVar17 = *plVar12;
    plVar2 = plVar12 + 1;
    lVar10 = lVar10 + 0x20;
    uVar9 = uVar9 + 1;
    lVar11 = lVar11 + -0x10;
    plVar12 = plVar12 + 2;
  } while (lVar17 != 0x7e4eeee09022dc8a || *plVar2 != -0x1771d961439572bf);
  uVar7 = *(ulong *)(lVar5 + 0x108);
  if (uVar9 < uVar7) {
    lVar10 = *(long *)(lVar5 + 0x100) + lVar10;
    lVar5 = *(long *)(lVar10 + -0x18);
    lVar10 = *(long *)(lVar10 + -0x20) + (*(long *)(lVar5 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10;
    auVar18 = (**(code **)(lVar5 + 0x18))(lVar10);
    if (auVar18._0_8_ == 0x7e4eeee09022dc8a && auVar18._8_8_ == -0x1771d961439572bf) {
      if (lVar10 == 0) {
LAB_00500018:
        uVar6 = 0;
      }
      else {
        uVar6 = 1;
      }
      return uVar6;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    uVar7 = extraout_x1_00;
    uVar9 = extraout_x8_00;
  }
  puVar8 = &UNK_009e9b68;
  auVar18 = func_0x007a2570(uVar9,uVar7,&UNK_009e9b68);
  lVar10 = auVar18._0_8_;
  func_0x00500450(lVar10,0);
  uStack_150 = 8;
  uStack_148 = 0;
  uStack_140 = 0;
  uStack_138 = 8;
  uStack_130 = 0;
  uStack_128 = 0;
  uStack_158 = 0;
  alStack_198[0] = 2;
  uStack_108 = 0;
  auStack_120[0] = 0;
  uStack_100 = 0;
  lStack_110 = lVar10;
  lVar5 = func_0x004eb004(auStack_120,alStack_198,auVar18._8_8_,puVar8);
  puVar13 = &uStack_158;
  if (lVar5 != 0) {
    if ((((*(byte *)(lVar10 + 700) & 1) == 0) && ((*(byte *)(lVar10 + 0x2c0) & 1) == 0)) ||
       ((*(byte *)(lVar5 + 0xdd) | 2) == 0xe)) {
      *extraout_x8_01 = 0x8000000000000000;
      extraout_x8_01[1] = lVar5;
      uVar6 = func_0x004fe048(puVar13);
      if (alStack_198[0] == 2) {
        return uVar6;
      }
      if (lStack_178 != 0) {
        puVar13 = (undefined8 *)(lStack_180 + 8);
        lVar10 = lStack_178;
        do {
          if (puVar13[-1] != 0) {
            uVar6 = func_0x00187bd4(*puVar13,puVar13[-1],1);
          }
          puVar13 = puVar13 + 3;
          lVar10 = lVar10 + -1;
        } while (lVar10 != 0);
      }
      if (lStack_188 == 0) {
        return uVar6;
      }
      lStack_188 = lStack_188 * 0x18;
      lVar10 = lStack_180;
      goto LAB_00500354;
    }
    func_0x004fd344();
  }
  lVar5 = 0;
  lVar11 = 8;
  lStack_f8 = 0;
  lStack_f0 = 8;
  lStack_e8 = 0;
LAB_00500174:
  lVar17 = *(long *)(lVar10 + 0x88);
  lVar14 = lVar17 + *(long *)(lVar10 + 0x90) * 600;
  do {
    do {
      lVar15 = lVar17;
      if (lVar15 == lVar14) {
        lVar17 = puVar13[6];
        if ((lVar17 == 0) || (plVar12 = (long *)(lVar10 + 0xc0), *plVar12 == 0)) goto LAB_00500280;
        uVar6 = *(undefined8 *)(lVar17 + 8);
        lVar14 = *(long *)(lVar17 + 0x10);
        lVar10 = *(long *)(lVar10 + 0xb8);
        lVar15 = lVar10 + *plVar12 * 0x2c8;
        goto LAB_0050020c;
      }
      lVar17 = lVar15 + 600;
    } while ((*(byte *)(lVar15 + 0x250) >> 1 & 1) == 0);
    uVar6 = *(undefined8 *)(lVar15 + 0x218);
    uVar3 = *(undefined8 *)(lVar15 + 0x220);
    if (lVar5 == lStack_f8) {
      func_0x007a5594(&lStack_f8,lVar5,1,8,0x10);
      lVar11 = lStack_f0;
    }
    puVar1 = (undefined8 *)(lVar11 + lVar5 * 0x10);
    *puVar1 = uVar6;
    puVar1[1] = uVar3;
    lVar5 = lVar5 + 1;
    lStack_e8 = lVar5;
  } while( true );
LAB_0050020c:
  if ((lVar14 == *(long *)(lVar10 + 0x238)) &&
     (iVar4 = _memcmp(uVar6,*(undefined8 *)(lVar10 + 0x230),lVar14), iVar4 == 0)) goto LAB_00500278;
  if (*(long *)(lVar10 + 0x48) != 0) {
    lVar16 = *(long *)(lVar10 + 0x48) * 0x18;
    plVar12 = (long *)(*(long *)(lVar10 + 0x40) + 8);
    do {
      if ((lVar14 == *plVar12) && (iVar4 = _memcmp(uVar6,plVar12[-1],lVar14), iVar4 == 0))
      goto LAB_00500278;
      lVar16 = lVar16 + -0x18;
      plVar12 = plVar12 + 3;
    } while (lVar16 != 0);
  }
  lVar10 = lVar10 + 0x2c8;
  if (lVar10 == lVar15) goto LAB_00500280;
  goto LAB_0050020c;
LAB_00500278:
  puVar13 = (undefined8 *)(lVar17 + 0x18);
  goto LAB_00500174;
LAB_00500280:
  lVar10 = lStack_f0;
  uStack_e0 = 0;
  uStack_d8 = 8;
  uStack_d0 = 0;
  uStack_c8 = 0;
  uStack_c0 = 8;
  uStack_b8 = 0;
  func_0x00516bb0(alStack_198,lStack_f0,lVar5,&uStack_e0);
  uVar6 = func_0x00515b4c(&uStack_e0);
  uStack_d8 = uStack_150;
  uStack_e0 = uStack_158;
  uStack_c8 = uStack_140;
  uStack_d0 = uStack_148;
  uStack_b8 = uStack_130;
  uStack_c0 = uStack_138;
  uStack_b0 = uStack_128;
  if (alStack_198[0] != 2) {
    if (lStack_178 != 0) {
      puVar13 = (undefined8 *)(lStack_180 + 8);
      lVar5 = lStack_178;
      do {
        if (puVar13[-1] != 0) {
          uVar6 = func_0x00187bd4(*puVar13,puVar13[-1],1);
        }
        puVar13 = puVar13 + 3;
        lVar5 = lVar5 + -1;
      } while (lVar5 != 0);
    }
    if (lStack_188 != 0) {
      uVar6 = func_0x00187bd4(lStack_180,lStack_188 * 0x18,8);
    }
  }
  extraout_x8_01[1] = uStack_d8;
  *extraout_x8_01 = uStack_e0;
  extraout_x8_01[3] = uStack_c8;
  extraout_x8_01[2] = uStack_d0;
  extraout_x8_01[5] = uStack_b8;
  extraout_x8_01[4] = uStack_c0;
  extraout_x8_01[6] = uStack_b0;
  if (lStack_f8 == 0) {
    return uVar6;
  }
  lStack_188 = lStack_f8 << 4;
LAB_00500354:
  uVar6 = func_0x00187bd4(lVar10,lStack_188,8);
  return uVar6;
}

