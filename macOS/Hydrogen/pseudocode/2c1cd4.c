
long * FUN_002c1cd4(void)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  int iVar4;
  long lVar5;
  long *plVar6;
  long lVar7;
  uint uVar8;
  long *plVar9;
  long *plVar10;
  ulong *puVar11;
  ulong *puVar12;
  long *plVar13;
  long *plVar14;
  long *unaff_x19;
  long *unaff_x21;
  long *unaff_x22;
  long *unaff_x23;
  long *unaff_x24;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined1 *unaff_x29;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  undefined1 auVar23 [16];
  
code_r0x002c1cd4:
  lVar5 = *unaff_x21;
  lVar16 = unaff_x21[3];
  lVar7 = unaff_x21[2];
  unaff_x19[3] = unaff_x21[1];
  unaff_x19[2] = lVar5;
  unaff_x19[5] = lVar16;
  unaff_x19[4] = lVar7;
  plVar9 = (long *)((long)&MACH_HEADER.magic + 1);
  *(undefined1 *)(unaff_x19 + 0x53) = 1;
  puVar1 = (undefined1 *)register0x00000008;
  do {
    func_0x0036e464(puVar1 + 0x80,0x80);
    func_0x0036e464(puVar1,0x80);
    puVar2 = puVar1;
    if ((int)plVar9 == 0) {
      func_0x0036e464(unaff_x19,0x2a0);
    }
LAB_002c1d14:
    puVar3 = puVar2;
    plVar14 = unaff_x19;
    plVar10 = unaff_x21;
    plVar13 = unaff_x22;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
      return plVar9;
    }
_aws_lc_0_24_0_EVP_DigestInit_ex:
    auVar23 = ___stack_chk_fail();
    lVar5 = auVar23._8_8_;
    plVar6 = auVar23._0_8_;
    plVar6[3] = 0;
    plVar6[2] = 0;
    plVar6[5] = 0;
    plVar6[4] = 0;
    plVar6[1] = 0;
    *plVar6 = 0;
    *(long **)(puVar3 + -0x20) = plVar9;
    *(long **)(puVar3 + -0x18) = plVar14;
    *(undefined1 **)(puVar3 + -0x10) = unaff_x29;
    *(undefined8 *)(puVar3 + -8) = 0x2c1d58;
    if ((*plVar6 != lVar5) && ((*plVar6 = lVar5, plVar6[5] != 0x800 || (plVar6[3] == 0)))) {
      if (*(int *)(lVar5 + 0x2c) == 0) goto code_r0x002c18bc;
      plVar6[2] = *(long *)(lVar5 + 0x18);
      lVar5 = func_0x0036e274();
      if (lVar5 == 0) {
        return (long *)0x0;
      }
      func_0x0036e3d8(plVar6[1]);
      plVar6[1] = lVar5;
    }
    lVar5 = plVar6[3];
    if (lVar5 == 0) {
code_r0x002c1888:
      (**(code **)(*plVar6 + 0x10))(plVar6);
      return (long *)((long)&MACH_HEADER.magic + 1);
    }
    if (plVar6[4] == 0) {
      func_0x0079e690();
code_r0x002c18bc:
      lVar5 = func_0x0079e6b8();
      if (*(long *)(lVar5 + 0x28) == 0x800) {
        return (long *)(ulong)(*(long *)(lVar5 + 0x18) != 0);
      }
      return (long *)0x0;
    }
    if (plVar6[5] != 0x800) goto code_r0x002c1888;
    plVar6 = *(long **)(lVar5 + 0x28);
    if (plVar6 == (long *)0x0) {
      return (long *)0x0;
    }
    if ((*(long *)(lVar5 + 0x10) == 0) ||
       (plVar9 = *(long **)(*(long *)(lVar5 + 0x10) + 8), plVar9 == (long *)0x0)) {
      return (long *)0x0;
    }
    unaff_x22 = (long *)*plVar9;
    unaff_x21 = (long *)plVar9[1];
    unaff_x19 = plVar6 + 1;
    lVar7 = *plVar6;
    lVar5 = *(long *)(lVar5 + 8);
    plVar9 = *(long **)(puVar3 + -0x20);
    plVar14 = *(long **)(puVar3 + -0x18);
    puVar2 = puVar3 + -0x160;
    register0x00000008 = (BADSPACEBASE *)(puVar3 + -0x160);
    puVar1 = puVar3 + -0x160;
    *(undefined8 *)(puVar3 + -0x50) = unaff_x28;
    *(undefined8 *)(puVar3 + -0x48) = unaff_x27;
    *(long **)(puVar3 + -0x40) = unaff_x24;
    *(long **)(puVar3 + -0x38) = unaff_x23;
    *(long **)(puVar3 + -0x30) = plVar13;
    *(long **)(puVar3 + -0x28) = plVar10;
    *(long **)(puVar3 + -0x20) = plVar9;
    *(long **)(puVar3 + -0x18) = plVar14;
    *(undefined8 *)(puVar3 + -0x10) = *(undefined8 *)(puVar3 + -0x10);
    *(undefined8 *)(puVar3 + -8) = *(undefined8 *)(puVar3 + -8);
    unaff_x29 = puVar3 + -0x10;
    *(undefined8 *)(puVar3 + -0x58) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    if (lVar5 != 0) {
      func_0x0079e730();
      goto code_r0x002c1d50;
    }
    uVar8 = (uint)*(byte *)(plVar6 + 0x54);
    if (*(byte *)(plVar6 + 0x54) - 3 < 2) {
      uVar8 = 1;
      *(undefined1 *)(plVar6 + 0x54) = 1;
    }
    if ((unaff_x22 == (long *)0x0) && (uVar8 == 1)) {
      if ((lVar7 == 0) || (*unaff_x19 == lVar7)) {
        plVar9 = (long *)((long)&MACH_HEADER.magic + 1);
        puVar2 = puVar3 + -0x160;
        goto LAB_002c1d14;
      }
code_r0x002c1974:
      func_0x00373e9c(0xa295e8,&DAT_0031c068);
      unaff_x24 = (long *)0xa3b258;
      if (((((lRam0000000000a3b258 != lVar7) &&
            (unaff_x24 = (long *)0xa3b290, lRam0000000000a3b290 != lVar7)) &&
           (unaff_x24 = (long *)0xa3b2c8, lRam0000000000a3b2c8 != lVar7)) &&
          ((unaff_x24 = (long *)0xa3b300, lRam0000000000a3b300 != lVar7 &&
           (unaff_x24 = (long *)0xa3b338, lRam0000000000a3b338 != lVar7)))) &&
         ((unaff_x24 = (long *)0xa3b370, lRam0000000000a3b370 != lVar7 &&
          ((unaff_x24 = (long *)0xa3b3a8, lRam0000000000a3b3a8 != lVar7 &&
           (unaff_x24 = (long *)0xa3b3e0, lRam0000000000a3b3e0 != lVar7)))))) {
        plVar9 = (long *)0x0;
        plVar6[2] = 0;
        puVar2 = puVar3 + -0x160;
        goto LAB_002c1d14;
      }
      *unaff_x19 = lVar7;
      plVar6[2] = (long)unaff_x24;
      uVar8 = *(uint *)(lVar7 + 0x28);
    }
    else {
      if ((lVar7 != 0) && ((uVar8 == 0 || (*unaff_x19 != lVar7)))) goto code_r0x002c1974;
      if (1 < uVar8 - 1) goto code_r0x002c1b1c;
      unaff_x24 = (long *)plVar6[2];
      uVar8 = *(uint *)(*unaff_x24 + 0x28);
    }
    if ((uVar8 & 7) != 0) break;
    plVar9 = (long *)(ulong)uVar8;
    plVar14 = unaff_x19;
    plVar10 = unaff_x21;
    plVar13 = unaff_x22;
    if (0x80 < uVar8) {
code_r0x002c1d50:
      func_0x0079e6e0();
      puVar3 = puVar3 + -0x160;
      goto _aws_lc_0_24_0_EVP_DigestInit_ex;
    }
    *(undefined8 *)(puVar3 + -0x78) = 0;
    *(undefined8 *)(puVar3 + -0x80) = 0;
    *(undefined8 *)(puVar3 + -0x68) = 0;
    *(undefined8 *)(puVar3 + -0x70) = 0;
    *(undefined8 *)(puVar3 + -0x98) = 0;
    *(undefined8 *)(puVar3 + -0xa0) = 0;
    *(undefined8 *)(puVar3 + -0x88) = 0;
    *(undefined8 *)(puVar3 + -0x90) = 0;
    *(undefined8 *)(puVar3 + -0xb8) = 0;
    *(undefined8 *)(puVar3 + -0xc0) = 0;
    *(undefined8 *)(puVar3 + -0xa8) = 0;
    *(undefined8 *)(puVar3 + -0xb0) = 0;
    *(undefined8 *)(puVar3 + -0xd8) = 0;
    *(undefined8 *)(puVar3 + -0xe0) = 0;
    *(undefined8 *)(puVar3 + -200) = 0;
    *(undefined8 *)(puVar3 + -0xd0) = 0;
    *(undefined8 *)(puVar3 + -0xf8) = 0;
    *(undefined8 *)(puVar3 + -0x100) = 0;
    *(undefined8 *)(puVar3 + -0xe8) = 0;
    *(undefined8 *)(puVar3 + -0xf0) = 0;
    *(undefined8 *)(puVar3 + -0x118) = 0;
    *(undefined8 *)(puVar3 + -0x120) = 0;
    *(undefined8 *)(puVar3 + -0x108) = 0;
    *(undefined8 *)(puVar3 + -0x110) = 0;
    *(undefined8 *)(puVar3 + -0x138) = 0;
    *(undefined8 *)(puVar3 + -0x140) = 0;
    *(undefined8 *)(puVar3 + -0x128) = 0;
    *(undefined8 *)(puVar3 + -0x130) = 0;
    *(undefined8 *)(puVar3 + -0x158) = 0;
    *(undefined8 *)(puVar3 + -0x160) = 0;
    *(undefined8 *)(puVar3 + -0x148) = 0;
    *(undefined8 *)(puVar3 + -0x150) = 0;
    if (plVar9 < unaff_x21) {
      unaff_x23 = plVar6 + 3;
      iVar4 = (*(code *)unaff_x24[2])(unaff_x23);
      if (((iVar4 == 0) ||
          (iVar4 = (*(code *)unaff_x24[3])(unaff_x23,unaff_x22,unaff_x21), iVar4 == 0)) ||
         (iVar4 = (*(code *)unaff_x24[4])(puVar3 + -0x160,unaff_x23), iVar4 == 0))
      goto code_r0x002c1ce8;
    }
    else if (unaff_x21 != (long *)0x0) {
      ___memcpy_chk(puVar3 + -0x160,unaff_x22,unaff_x21,0x80);
    }
    unaff_x22 = (long *)(ulong)(uVar8 >> 3);
    if (uVar8 < 8) goto code_r0x002c1ba4;
    plVar14 = unaff_x22;
    if (unaff_x22 < (long *)((long)&MACH_HEADER.magic + 2)) {
      plVar14 = (long *)((long)&MACH_HEADER.magic + 1);
    }
    if (plVar14 < &MACH_HEADER.cpusubtype) {
      plVar10 = (long *)0x0;
      goto code_r0x002c1b70;
    }
    plVar10 = (long *)((ulong)plVar14 & 0x1ffffff8);
    puVar11 = (ulong *)(puVar3 + -0xc0);
    puVar12 = (ulong *)(puVar3 + -0x140);
    plVar13 = plVar10;
    do {
      uVar15 = puVar12[-4];
      uVar18 = puVar12[-1];
      uVar17 = puVar12[-2];
      uVar20 = puVar12[1];
      uVar19 = *puVar12;
      uVar22 = puVar12[3];
      uVar21 = puVar12[2];
      puVar11[-3] = puVar12[-3] ^ 0x3636363636363636;
      puVar11[-4] = uVar15 ^ 0x3636363636363636;
      puVar11[-1] = uVar18 ^ 0x3636363636363636;
      puVar11[-2] = uVar17 ^ 0x3636363636363636;
      puVar11[1] = uVar20 ^ 0x3636363636363636;
      *puVar11 = uVar19 ^ 0x3636363636363636;
      puVar11[3] = uVar22 ^ 0x3636363636363636;
      puVar11[2] = uVar21 ^ 0x3636363636363636;
      plVar13 = plVar13 + -1;
      puVar11 = puVar11 + 8;
      puVar12 = puVar12 + 8;
    } while (plVar13 != (long *)0x0);
    if (plVar14 != plVar10) {
code_r0x002c1b70:
      lVar5 = (long)plVar14 - (long)plVar10;
      puVar11 = (ulong *)(puVar3 + (long)plVar10 * 8 + -0xe0);
      puVar12 = (ulong *)(puVar3 + (long)plVar10 * 8 + -0x160);
      do {
        *puVar11 = *puVar12 ^ 0x3636363636363636;
        lVar5 = lVar5 + -1;
        puVar11 = puVar11 + 1;
        puVar12 = puVar12 + 1;
      } while (lVar5 != 0);
    }
code_r0x002c1ba4:
    unaff_x21 = plVar6 + 0x1e;
    iVar4 = (*(code *)unaff_x24[2])(unaff_x21);
    if ((iVar4 != 0) &&
       (iVar4 = (*(code *)unaff_x24[3])(unaff_x21,puVar3 + -0xe0,plVar9), iVar4 != 0)) {
      if (7 < uVar8) {
        if (unaff_x22 < (long *)((long)&MACH_HEADER.magic + 2)) {
          unaff_x22 = (long *)((long)&MACH_HEADER.magic + 1);
        }
        if ((long *)((long)&MACH_HEADER.cputype + 3) < unaff_x22) {
          plVar10 = (long *)((ulong)unaff_x22 & 0x1ffffff8);
          puVar11 = (ulong *)(puVar3 + -0xc0);
          puVar12 = (ulong *)(puVar3 + -0x140);
          plVar14 = plVar10;
          do {
            uVar15 = puVar12[-4];
            uVar18 = puVar12[-1];
            uVar17 = puVar12[-2];
            uVar20 = puVar12[1];
            uVar19 = *puVar12;
            uVar22 = puVar12[3];
            uVar21 = puVar12[2];
            puVar11[-3] = puVar12[-3] ^ 0x5c5c5c5c5c5c5c5c;
            puVar11[-4] = uVar15 ^ 0x5c5c5c5c5c5c5c5c;
            puVar11[-1] = uVar18 ^ 0x5c5c5c5c5c5c5c5c;
            puVar11[-2] = uVar17 ^ 0x5c5c5c5c5c5c5c5c;
            puVar11[1] = uVar20 ^ 0x5c5c5c5c5c5c5c5c;
            *puVar11 = uVar19 ^ 0x5c5c5c5c5c5c5c5c;
            puVar11[3] = uVar22 ^ 0x5c5c5c5c5c5c5c5c;
            puVar11[2] = uVar21 ^ 0x5c5c5c5c5c5c5c5c;
            plVar14 = plVar14 + -1;
            puVar11 = puVar11 + 8;
            puVar12 = puVar12 + 8;
          } while (plVar14 != (long *)0x0);
          if (unaff_x22 == plVar10) goto code_r0x002c1c70;
        }
        else {
          plVar10 = (long *)0x0;
        }
        lVar5 = (long)unaff_x22 - (long)plVar10;
        puVar11 = (ulong *)(puVar3 + (long)plVar10 * 8 + -0xe0);
        puVar12 = (ulong *)(puVar3 + (long)plVar10 * 8 + -0x160);
        do {
          *puVar11 = *puVar12 ^ 0x5c5c5c5c5c5c5c5c;
          lVar5 = lVar5 + -1;
          puVar11 = puVar11 + 1;
          puVar12 = puVar12 + 1;
        } while (lVar5 != 0);
      }
code_r0x002c1c70:
      unaff_x22 = plVar6 + 0x39;
      iVar4 = (*(code *)unaff_x24[2])(unaff_x22);
      if ((iVar4 != 0) &&
         (iVar4 = (*(code *)unaff_x24[3])(unaff_x22,puVar3 + -0xe0,plVar9), iVar4 != 0))
      goto code_r0x002c1c9c;
    }
code_r0x002c1ce8:
    plVar9 = (long *)0x0;
  } while( true );
  func_0x0079e708();
code_r0x002c1b1c:
  plVar9 = (long *)0x0;
  goto LAB_002c1d14;
code_r0x002c1c9c:
  plVar6[0x18] = plVar6[0x33];
  plVar6[0x17] = plVar6[0x32];
  plVar6[0x1a] = plVar6[0x35];
  plVar6[0x19] = plVar6[0x34];
  plVar6[0x1c] = plVar6[0x37];
  plVar6[0x1b] = plVar6[0x36];
  plVar6[0x1d] = plVar6[0x38];
  plVar6[0x10] = plVar6[0x2b];
  plVar6[0xf] = plVar6[0x2a];
  plVar6[0x12] = plVar6[0x2d];
  plVar6[0x11] = plVar6[0x2c];
  plVar6[0x14] = plVar6[0x2f];
  plVar6[0x13] = plVar6[0x2e];
  plVar6[0x16] = plVar6[0x31];
  plVar6[0x15] = plVar6[0x30];
  plVar6[8] = plVar6[0x23];
  plVar6[7] = plVar6[0x22];
  plVar6[10] = plVar6[0x25];
  plVar6[9] = plVar6[0x24];
  plVar6[0xc] = plVar6[0x27];
  plVar6[0xb] = plVar6[0x26];
  plVar6[0xe] = plVar6[0x29];
  plVar6[0xd] = plVar6[0x28];
  goto code_r0x002c1cd4;
}

