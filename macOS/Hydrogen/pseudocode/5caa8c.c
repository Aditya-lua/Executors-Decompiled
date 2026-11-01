
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005caa8c(undefined8 param_1)

{
  char cVar1;
  code *pcVar2;
  undefined8 *puVar3;
  ulong uVar4;
  double *pdVar5;
  dword *pdVar6;
  dword *pdVar7;
  uint uVar8;
  undefined8 *extraout_x8;
  undefined1 uVar9;
  undefined8 uVar10;
  undefined1 auVar11 [16];
  dword *pdStack_250;
  dword *pdStack_248;
  dword *pdStack_240;
  double dStack_238;
  double dStack_230;
  double dStack_228;
  double dStack_220;
  double dStack_218;
  undefined1 uStack_210;
  double dStack_200;
  double dStack_1f8;
  double dStack_1f0;
  double dStack_1e8;
  double dStack_1e0;
  double dStack_1d8;
  double dStack_1d0;
  double dStack_1c8;
  dword *pdStack_1c0;
  undefined8 uStack_1b8;
  undefined8 uStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined1 auStack_180 [64];
  dword *pdStack_140;
  dword *pdStack_138;
  dword *pdStack_130;
  double dStack_128;
  double dStack_120;
  double dStack_118;
  double dStack_110;
  double dStack_108;
  dword *pdStack_100;
  undefined1 auStack_f8 [56];
  dword *pdStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  dword *pdStack_80;
  dword *pdStack_78;
  byte bStack_70;
  undefined7 uStack_6f;
  double dStack_68;
  double dStack_60;
  double dStack_58;
  double dStack_50;
  double dStack_48;
  
  auVar11 = func_0x007a1f18(param_1,8);
  uVar4 = auVar11._8_8_;
  puVar3 = auVar11._0_8_;
  pdStack_248 = (dword *)puVar3[1];
  pdStack_250 = (dword *)*puVar3;
  dStack_238 = (double)puVar3[3];
  pdStack_240 = (dword *)puVar3[2];
  dStack_228 = (double)puVar3[5];
  dStack_230 = (double)puVar3[4];
  dStack_218 = (double)puVar3[7];
  dStack_220 = (double)puVar3[6];
  func_0x005af248(&pdStack_80,&pdStack_250);
  pdStack_240 = (dword *)CONCAT71(uStack_6f,bStack_70);
  pdStack_248 = pdStack_78;
  pdStack_250 = pdStack_80;
  dStack_238 = dStack_68;
  dStack_228 = dStack_58;
  dStack_230 = dStack_60;
  dStack_218 = dStack_48;
  dStack_220 = dStack_50;
  uStack_210 = auVar11[8];
  if ((double *)pdStack_80 == (double *)((long)&MACH_HEADER.cputype + 2)) {
    if ((uVar4 & 0xff) == 0) {
      if (pdStack_78 == (dword *)0x8000000000000001) {
        *(byte *)(extraout_x8 + 2) = bStack_70 ^ 1;
        pdVar6 = _UNK_0089eb10;
        pdVar7 = _UNK_0089eb18;
LAB_005cac04:
        extraout_x8[1] = pdVar7;
        *extraout_x8 = pdVar6;
        goto LAB_005cacb8;
      }
LAB_005cadc4:
      uVar9 = 0;
    }
    else if ((auVar11._8_4_ & 0xff) == 1) {
      if (pdStack_78 == (dword *)0x8000000000000002) {
        extraout_x8[2] = -(double)pdStack_240;
        pdVar6 = _UNK_0089eb30;
        pdVar7 = _UNK_0089eb38;
        goto LAB_005cac04;
      }
      uVar9 = 1;
    }
    else {
      if (-0x7ffffffffffffffc < (long)pdStack_78) {
        uVar10 = NEON_ucvtf(dStack_68);
        extraout_x8[2] = uVar10;
        pdVar6 = _UNK_0089eb30;
        extraout_x8[1] = _UNK_0089eb38;
        *extraout_x8 = pdVar6;
        if (pdStack_78 != (dword *)0x0) {
          func_0x00187bd4(pdStack_240,pdStack_78,1);
        }
        goto LAB_005cacb8;
      }
      uVar9 = 2;
    }
LAB_005cadc8:
    pdStack_138 = pdStack_248;
    pdStack_140 = pdStack_250;
    dStack_128 = dStack_238;
    pdStack_130 = pdStack_240;
    dStack_118 = dStack_228;
    dStack_120 = dStack_230;
    dStack_108 = dStack_218;
    dStack_110 = dStack_220;
    pdVar5 = (double *)func_0x00187bd0(0x40,8);
    if (pdVar5 == (double *)0x0) {
      func_0x007a1f18(8,0x40);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x5caf58);
      (*pcVar2)();
    }
    pdVar5[1] = (double)pdStack_138;
    *pdVar5 = (double)pdStack_140;
    pdVar5[3] = dStack_128;
    pdVar5[2] = (double)pdStack_130;
    pdVar5[5] = dStack_118;
    pdVar5[4] = dStack_120;
    pdVar5[7] = dStack_108;
    pdVar5[6] = dStack_110;
    *(undefined1 *)(extraout_x8 + 2) = uVar9;
    *extraout_x8 = 8;
    extraout_x8[1] = pdVar5;
  }
  else {
    uVar9 = uStack_210;
    if (pdStack_80 == &MACH_HEADER.cpusubtype) {
      if ((uVar4 & 0xff) != 0 || bStack_70 != 0) goto LAB_005cadc8;
      dStack_1f8 = *(double *)(pdStack_78 + 2);
      dStack_200 = *(double *)pdStack_78;
      dStack_1e8 = *(double *)(pdStack_78 + 6);
      dStack_1f0 = *(double *)(pdStack_78 + 4);
      dStack_1d8 = *(double *)(pdStack_78 + 10);
      dStack_1e0 = *(double *)(pdStack_78 + 8);
      dStack_1c8 = *(double *)(pdStack_78 + 0xe);
      dStack_1d0 = *(double *)(pdStack_78 + 0xc);
      func_0x005af378(&pdStack_1c0,&dStack_200);
      uVar4 = func_0x005cb08c(&pdStack_1c0);
      pdVar7 = _UNK_0089eb18;
      pdVar6 = _UNK_0089eb10;
      if ((uVar4 & 1) == 0) {
        uStack_b8 = uStack_1b8;
        pdStack_c0 = pdStack_1c0;
        uStack_a8 = uStack_1a8;
        uStack_b0 = uStack_1b0;
        uStack_98 = uStack_198;
        uStack_a0 = uStack_1a0;
        uStack_88 = uStack_188;
        uStack_90 = uStack_190;
        bStack_70 = 1;
        pdStack_78 = _UNK_0089eb18;
        pdStack_80 = _UNK_0089eb10;
        func_0x005c1d84(auStack_f8,&pdStack_c0,&pdStack_80,0xd);
        pdStack_100 = (dword *)0x9;
        bStack_70 = 0;
        pdStack_78 = pdVar7;
        pdStack_80 = pdVar6;
        func_0x005c1d84(extraout_x8 + 1,&pdStack_100,&pdStack_80,0xe);
        *extraout_x8 = 9;
      }
      else {
        extraout_x8[1] = uStack_1b8;
        *extraout_x8 = pdStack_1c0;
        extraout_x8[3] = uStack_1a8;
        extraout_x8[2] = uStack_1b0;
        extraout_x8[5] = uStack_198;
        extraout_x8[4] = uStack_1a0;
        extraout_x8[7] = uStack_188;
        extraout_x8[6] = uStack_190;
      }
    }
    else {
      if (((double *)pdStack_80 != (double *)((long)&MACH_HEADER.cpusubtype + 1)) ||
         ((uVar4 & 0xff) != 0)) goto LAB_005cadc8;
      dStack_238._0_1_ = SUB81(dStack_68,0);
      uVar8 = (uint)dStack_238._0_1_;
      if (dStack_238._0_1_ < 10) {
        if (uVar8 == 7) {
          pdStack_80 = pdStack_78;
          bStack_70 = 8;
          pdStack_78 = pdStack_240;
          func_0x005c0d8c(extraout_x8,&pdStack_80);
        }
        else if (dStack_238._0_1_ == 8) {
          pdStack_80 = pdStack_78;
          bStack_70 = 7;
          pdStack_78 = pdStack_240;
          func_0x005c0d8c(extraout_x8,&pdStack_80);
        }
        else if (dStack_238._0_1_ == 9) {
          pdStack_80 = pdStack_78;
          bStack_70 = 0xc;
          pdStack_78 = pdStack_240;
          func_0x005c0d8c(extraout_x8,&pdStack_80);
        }
        else {
LAB_005cad88:
          if (1 < uVar8 - 0xd) goto LAB_005cadc4;
          pdStack_78 = (dword *)func_0x005c9fc0(pdStack_78);
          bStack_70 = 0;
          pdStack_80 = &MACH_HEADER.cpusubtype;
          uVar4 = func_0x005cb794(&pdStack_80);
          if ((uVar4 & 1) == 0) {
            func_0x005c926c(&pdStack_80);
            pdStack_78 = (dword *)func_0x005c9fc0(pdStack_240);
            bStack_70 = 0;
            pdStack_80 = &MACH_HEADER.cpusubtype;
            uVar4 = func_0x005cb794(&pdStack_80);
            if ((uVar4 & 1) == 0) {
              func_0x005c926c(&pdStack_80);
              uVar9 = uStack_210;
              goto LAB_005cadc8;
            }
            func_0x005c926c(&pdStack_80);
          }
          else {
            func_0x005c926c(&pdStack_80);
          }
          pdStack_100 = pdStack_240;
          cVar1 = dStack_238._0_1_;
          func_0x005cb1c8(&pdStack_80,pdStack_248,0);
          pdVar6 = (dword *)func_0x004afc0c();
          *(dword **)(pdVar6 + 2) = pdStack_78;
          *(dword **)pdVar6 = pdStack_80;
          *(double *)(pdVar6 + 6) = dStack_68;
          *(ulong *)(pdVar6 + 4) = CONCAT71(uStack_6f,bStack_70);
          *(double *)(pdVar6 + 10) = dStack_58;
          *(double *)(pdVar6 + 8) = dStack_60;
          *(double *)(pdVar6 + 0xe) = dStack_48;
          *(double *)(pdVar6 + 0xc) = dStack_50;
          pdStack_c0 = pdVar6;
          func_0x005cb1c8(&pdStack_80,pdStack_240,0);
          pdVar7 = (dword *)func_0x004afc0c();
          *(dword **)(pdVar7 + 2) = pdStack_78;
          *(dword **)pdVar7 = pdStack_80;
          *(double *)(pdVar7 + 6) = dStack_68;
          *(ulong *)(pdVar7 + 4) = CONCAT71(uStack_6f,bStack_70);
          *(double *)(pdVar7 + 10) = dStack_58;
          *(double *)(pdVar7 + 8) = dStack_60;
          *(double *)(pdVar7 + 0xe) = dStack_48;
          *(double *)(pdVar7 + 0xc) = dStack_50;
          bStack_70 = 0xd;
          if (cVar1 == '\r') {
            bStack_70 = 0xe;
          }
          pdStack_80 = pdVar6;
          pdStack_78 = pdVar7;
          func_0x005c16b4(auStack_180,&pdStack_80);
          func_0x005cb114(extraout_x8,auStack_180);
        }
      }
      else if (dStack_238._0_1_ == 10) {
        pdStack_80 = pdStack_78;
        bStack_70 = 0xb;
        pdStack_78 = pdStack_240;
        func_0x005c0d8c(extraout_x8,&pdStack_80);
      }
      else if (dStack_238._0_1_ == 0xb) {
        pdStack_80 = pdStack_78;
        bStack_70 = 10;
        pdStack_78 = pdStack_240;
        func_0x005c0d8c(extraout_x8,&pdStack_80);
      }
      else {
        if (uVar8 != 0xc) goto LAB_005cad88;
        pdStack_80 = pdStack_78;
        bStack_70 = 9;
        pdStack_78 = pdStack_240;
        func_0x005c0d8c(extraout_x8,&pdStack_80);
      }
    }
LAB_005cacb8:
    if ((double *)pdStack_250 != (double *)((long)&MACH_HEADER.cputype + 2)) {
      if (pdStack_250 == &MACH_HEADER.cpusubtype) {
        func_0x00187bd4(pdStack_248,0x40,8);
      }
      else if ((double *)pdStack_250 != (double *)((long)&MACH_HEADER.cpusubtype + 1)) {
        func_0x005c926c(&pdStack_250);
      }
    }
  }
  func_0x00187bd4(puVar3,0x40,8);
  return;
}

