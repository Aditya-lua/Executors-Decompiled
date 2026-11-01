
void FUN_004e7c94(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 *puVar1;
  long lVar2;
  byte *pbVar3;
  uint uVar4;
  code *pcVar5;
  int iVar6;
  long *plVar7;
  undefined8 *puVar8;
  long *plVar9;
  ulong *extraout_x8;
  ulong uVar10;
  long *extraout_x8_00;
  long *extraout_x8_01;
  undefined8 uVar11;
  long lVar12;
  long lVar13;
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 uStack0000000000000008;
  long lStack_190;
  long *plStack_188;
  long lStack_180;
  long lStack_178;
  long lStack_170;
  long lStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  long lStack_148;
  long lStack_140;
  long lStack_138;
  byte *pbStack_130;
  undefined8 *puStack_128;
  long lStack_120;
  undefined8 uStack_118;
  long *plStack_110;
  undefined8 uStack_108;
  undefined1 **ppuStack_100;
  undefined *puStack_f8;
  long lStack_e8;
  long *plStack_e0;
  long lStack_d8;
  undefined1 *puStack_90;
  undefined *puStack_88;
  ulong uStack_80;
  ulong uStack_78;
  ulong uStack_70;
  ulong *puStack_68;
  undefined8 uStack_60;
  ulong uStack_58;
  undefined1 auStack_6 [6];
  
  func_0x0016b01c(&uStack0000000000000008);
  auVar14 = __Unwind_Resume();
  uVar11 = 0;
  uVar10 = auVar14._8_8_ - auVar14._0_8_;
  uStack_80 = uVar10 >> 4;
  uVar10 = (uStack_80 + (uVar10 >> 3)) * 8;
  auVar15._8_8_ = 0;
  auVar15._0_8_ = uStack_80;
  if ((SUB168(auVar15 * ZEXT816(0x18),8) == 0) && (uVar10 < 0x7ffffffffffffff9)) {
    if (uVar10 == 0) {
      uStack_80 = 0;
      uStack_78 = 8;
    }
    else {
      uVar11 = 8;
      uStack_78 = func_0x00187bd0(uVar10,8);
      if (uStack_78 == 0) goto LAB_004e7d84;
    }
    puStack_68 = &uStack_70;
    uStack_70 = 0;
    uStack_60 = 0;
    uStack_58 = uStack_78;
    func_0x0051f3e4(auVar14._0_8_,auVar14._8_8_,&puStack_68);
    extraout_x8[1] = uStack_78;
    *extraout_x8 = uStack_80;
    extraout_x8[2] = uStack_70;
    return;
  }
LAB_004e7d84:
  uVar11 = func_0x007a1f00(uVar11,uVar10,param_3);
  func_0x0016b144(&uStack_80);
  auVar15 = __Unwind_Resume(uVar11);
  plVar9 = auVar15._0_8_;
  puStack_88 = &DAT_004e7da8;
  lVar12 = *plVar9;
  lVar2 = plVar9[1];
  if (lVar12 != lVar2) {
    puVar1 = (undefined8 *)plVar9[2];
    pbVar3 = (byte *)plVar9[3];
    puStack_90 = auStack_6 + -10;
    do {
      if (((((*(int *)(lVar12 + 0x38) == 1) && (*(long *)(lVar12 + 0x40) != 0)) &&
           (*(long *)(lVar12 + 0x48) == puVar1[1])) &&
          ((iVar6 = _memcmp(*(long *)(lVar12 + 0x40),*puVar1), iVar6 == 0 &&
           (uVar4 = *(uint *)(lVar12 + 0x250), (uVar4 >> 2 & 1) == 0)))) &&
         ((((uVar4 >> 0xd & 1) == 0 && ((*pbVar3 & 1) != 0)) ||
          (((uVar4 >> 3 & 1) != 0 || ((*pbVar3 & 1) == 0 && (uVar4 & 0x1000) == 0)))))) {
        lVar13 = lVar12 + 600;
        *plVar9 = lVar13;
        plVar7 = (long *)func_0x00187bd0(0x20,8);
        if (plVar7 == (long *)0x0) {
          uVar11 = func_0x007a1f00(8,0x20,auVar15._8_8_);
          if (lStack_e8 != 0) {
            func_0x00187bd4(plStack_e0,lStack_e8 << 3,8);
          }
          auVar14 = __Unwind_Resume(uVar11);
          puVar8 = auVar14._0_8_;
          puStack_f8 = &DAT_004e7fa8;
          pbStack_130 = pbVar3;
          puStack_128 = puVar1;
          lStack_120 = lVar2;
          uStack_118 = auVar15._8_8_;
          plStack_110 = plVar9;
          uStack_108 = uVar11;
          ppuStack_100 = &puStack_90;
          func_0x004dec3c(&lStack_178,puVar8);
          if (lStack_178 == -0x8000000000000000) {
            *extraout_x8_01 = 0;
            extraout_x8_01[1] = 8;
            extraout_x8_01[2] = 0;
          }
          else {
            plVar9 = (long *)func_0x00187bd0(0x60,8);
            if (plVar9 == (long *)0x0) {
              func_0x007a1f00(8,0x60,auVar14._8_8_);
                    /* WARNING: Does not return */
              pcVar5 = (code *)SoftwareBreakpoint(1,0x4e80fc);
              (*pcVar5)();
            }
            plVar9[1] = lStack_170;
            *plVar9 = lStack_178;
            plVar9[2] = lStack_168;
            lStack_190 = 4;
            lStack_180 = 1;
            uStack_158 = puVar8[1];
            uStack_160 = *puVar8;
            uStack_150 = puVar8[2];
            lVar12 = 0x18;
            plStack_188 = plVar9;
            while( true ) {
              lVar2 = lStack_180;
              func_0x004dec3c(&lStack_148,&uStack_160);
              if (lStack_148 == -0x8000000000000000) break;
              if (lVar2 == lStack_190) {
                func_0x007a5594(&lStack_190,lVar2,1,8,0x18);
                plVar9 = plStack_188;
              }
              plVar7 = (long *)((long)plVar9 + lVar12);
              plVar7[2] = lStack_138;
              plVar7[1] = lStack_140;
              *plVar7 = lStack_148;
              lStack_180 = lVar2 + 1;
              lVar12 = lVar12 + 0x18;
            }
            extraout_x8_01[1] = (long)plStack_188;
            *extraout_x8_01 = lStack_190;
            extraout_x8_01[2] = lStack_180;
          }
          return;
        }
        *plVar7 = lVar12;
        lStack_e8 = 4;
        lStack_d8 = 1;
        plStack_e0 = plVar7;
        lVar12 = lStack_d8;
        for (; lStack_d8 = lVar12, lVar13 != lVar2; lVar13 = lVar13 + 600) {
          while (((((*(int *)(lVar13 + 0x38) != 1 || (*(long *)(lVar13 + 0x40) == 0)) ||
                   (*(long *)(lVar13 + 0x48) != puVar1[1])) ||
                  ((iVar6 = _memcmp(*(long *)(lVar13 + 0x40),*puVar1), iVar6 != 0 ||
                   (uVar4 = *(uint *)(lVar13 + 0x250), (uVar4 >> 2 & 1) != 0)))) ||
                 ((((uVar4 >> 0xd & 1) != 0 || ((*pbVar3 & 1) == 0)) &&
                  (((uVar4 >> 3 & 1) == 0 && ((*pbVar3 & 1) != 0 || (uVar4 & 0x1000) != 0))))))) {
            lVar13 = lVar13 + 600;
            if (lVar13 == lVar2) goto code_r0x004e7f34;
          }
          if (lVar12 == lStack_e8) {
            func_0x007a5594(&lStack_e8,lVar12,1,8,8);
            plVar7 = plStack_e0;
          }
          plVar7[lVar12] = lVar13;
          lVar12 = lVar12 + 1;
        }
code_r0x004e7f34:
        extraout_x8_00[1] = (long)plStack_e0;
        *extraout_x8_00 = lStack_e8;
        extraout_x8_00[2] = lStack_d8;
        return;
      }
      lVar12 = lVar12 + 600;
    } while (lVar12 != lVar2);
    *plVar9 = lVar12;
  }
  *extraout_x8_00 = 0;
  extraout_x8_00[1] = 8;
  extraout_x8_00[2] = 0;
  return;
}

