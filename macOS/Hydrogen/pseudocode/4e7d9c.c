
void FUN_004e7d9c(void)

{
  undefined8 *puVar1;
  long lVar2;
  byte *pbVar3;
  uint uVar4;
  code *pcVar5;
  int iVar6;
  long *plVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  long *plVar10;
  long *extraout_x8;
  long *extraout_x8_00;
  long lVar11;
  long lVar12;
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  long lStack_110;
  long *plStack_108;
  long lStack_100;
  long lStack_f8;
  long lStack_f0;
  long lStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  long lStack_c8;
  long lStack_c0;
  long lStack_b8;
  byte *pbStack_b0;
  undefined8 *puStack_a8;
  long lStack_a0;
  undefined8 uStack_98;
  long *plStack_90;
  undefined8 uStack_88;
  undefined1 *puStack_80;
  undefined *puStack_78;
  long lStack_68;
  long *plStack_60;
  long lStack_58;
  undefined1 auStack_6 [6];
  
  func_0x0016b144();
  auVar13 = __Unwind_Resume();
  plVar10 = auVar13._0_8_;
  lVar11 = *plVar10;
  lVar2 = plVar10[1];
  if (lVar11 != lVar2) {
    puVar1 = (undefined8 *)plVar10[2];
    pbVar3 = (byte *)plVar10[3];
    do {
      if (((((*(int *)(lVar11 + 0x38) == 1) && (*(long *)(lVar11 + 0x40) != 0)) &&
           (*(long *)(lVar11 + 0x48) == puVar1[1])) &&
          ((iVar6 = _memcmp(*(long *)(lVar11 + 0x40),*puVar1), iVar6 == 0 &&
           (uVar4 = *(uint *)(lVar11 + 0x250), (uVar4 >> 2 & 1) == 0)))) &&
         ((((uVar4 >> 0xd & 1) == 0 && ((*pbVar3 & 1) != 0)) ||
          (((uVar4 >> 3 & 1) != 0 || ((*pbVar3 & 1) == 0 && (uVar4 & 0x1000) == 0)))))) {
        lVar12 = lVar11 + 600;
        *plVar10 = lVar12;
        plVar7 = (long *)func_0x00187bd0(0x20,8);
        if (plVar7 == (long *)0x0) {
          uVar8 = func_0x007a1f00(8,0x20,auVar13._8_8_);
          if (lStack_68 != 0) {
            func_0x00187bd4(plStack_60,lStack_68 << 3,8);
          }
          auVar14 = __Unwind_Resume(uVar8);
          puVar9 = auVar14._0_8_;
          puStack_78 = &DAT_004e7fa8;
          pbStack_b0 = pbVar3;
          puStack_a8 = puVar1;
          lStack_a0 = lVar2;
          uStack_98 = auVar13._8_8_;
          plStack_90 = plVar10;
          uStack_88 = uVar8;
          puStack_80 = auStack_6 + -10;
          func_0x004dec3c(&lStack_f8,puVar9);
          if (lStack_f8 == -0x8000000000000000) {
            *extraout_x8_00 = 0;
            extraout_x8_00[1] = 8;
            extraout_x8_00[2] = 0;
          }
          else {
            plVar10 = (long *)func_0x00187bd0(0x60,8);
            if (plVar10 == (long *)0x0) {
              func_0x007a1f00(8,0x60,auVar14._8_8_);
                    /* WARNING: Does not return */
              pcVar5 = (code *)SoftwareBreakpoint(1,0x4e80fc);
              (*pcVar5)();
            }
            plVar10[1] = lStack_f0;
            *plVar10 = lStack_f8;
            plVar10[2] = lStack_e8;
            lStack_110 = 4;
            lStack_100 = 1;
            uStack_d8 = puVar9[1];
            uStack_e0 = *puVar9;
            uStack_d0 = puVar9[2];
            lVar11 = 0x18;
            plStack_108 = plVar10;
            while( true ) {
              lVar2 = lStack_100;
              func_0x004dec3c(&lStack_c8,&uStack_e0);
              if (lStack_c8 == -0x8000000000000000) break;
              if (lVar2 == lStack_110) {
                func_0x007a5594(&lStack_110,lVar2,1,8,0x18);
                plVar10 = plStack_108;
              }
              plVar7 = (long *)((long)plVar10 + lVar11);
              plVar7[2] = lStack_b8;
              plVar7[1] = lStack_c0;
              *plVar7 = lStack_c8;
              lStack_100 = lVar2 + 1;
              lVar11 = lVar11 + 0x18;
            }
            extraout_x8_00[1] = (long)plStack_108;
            *extraout_x8_00 = lStack_110;
            extraout_x8_00[2] = lStack_100;
          }
          return;
        }
        *plVar7 = lVar11;
        lStack_68 = 4;
        lStack_58 = 1;
        plStack_60 = plVar7;
        lVar11 = lStack_58;
        for (; lStack_58 = lVar11, lVar12 != lVar2; lVar12 = lVar12 + 600) {
          while (((((*(int *)(lVar12 + 0x38) != 1 || (*(long *)(lVar12 + 0x40) == 0)) ||
                   (*(long *)(lVar12 + 0x48) != puVar1[1])) ||
                  ((iVar6 = _memcmp(*(long *)(lVar12 + 0x40),*puVar1), iVar6 != 0 ||
                   (uVar4 = *(uint *)(lVar12 + 0x250), (uVar4 >> 2 & 1) != 0)))) ||
                 ((((uVar4 >> 0xd & 1) != 0 || ((*pbVar3 & 1) == 0)) &&
                  (((uVar4 >> 3 & 1) == 0 && ((*pbVar3 & 1) != 0 || (uVar4 & 0x1000) != 0))))))) {
            lVar12 = lVar12 + 600;
            if (lVar12 == lVar2) goto LAB_004e7f34;
          }
          if (lVar11 == lStack_68) {
            func_0x007a5594(&lStack_68,lVar11,1,8,8);
            plVar7 = plStack_60;
          }
          plVar7[lVar11] = lVar12;
          lVar11 = lVar11 + 1;
        }
LAB_004e7f34:
        extraout_x8[1] = (long)plStack_60;
        *extraout_x8 = lStack_68;
        extraout_x8[2] = lStack_58;
        return;
      }
      lVar11 = lVar11 + 600;
    } while (lVar11 != lVar2);
    *plVar10 = lVar11;
  }
  *extraout_x8 = 0;
  extraout_x8[1] = 8;
  extraout_x8[2] = 0;
  return;
}

