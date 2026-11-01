
void FUN_0050e2fc(undefined8 param_1)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined1 uVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  code *pcVar7;
  long lVar8;
  undefined8 *puVar9;
  dword *pdVar10;
  dword *pdVar11;
  long lVar12;
  undefined8 *extraout_x8;
  undefined1 *puVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  undefined8 *puVar25;
  long lVar26;
  dword *pdVar27;
  ulong uVar28;
  long lVar29;
  ulong uVar30;
  undefined8 *puVar31;
  ulong uVar32;
  long *plVar33;
  undefined8 *puVar34;
  ulong uVar35;
  undefined8 uVar36;
  undefined1 uVar37;
  undefined8 *puVar38;
  undefined8 *puVar39;
  undefined8 *puVar40;
  undefined8 *puVar41;
  undefined8 *puVar42;
  undefined8 *puVar43;
  undefined8 uVar44;
  ulong uVar45;
  undefined8 uVar46;
  undefined8 uVar47;
  ulong uVar48;
  ulong uVar49;
  undefined8 uVar50;
  undefined8 *puVar51;
  undefined8 uVar52;
  undefined8 uVar53;
  undefined8 uVar54;
  undefined8 uVar55;
  undefined8 uVar56;
  undefined8 uVar57;
  undefined8 uVar58;
  undefined8 uVar59;
  undefined8 uVar60;
  undefined8 uVar61;
  undefined8 uVar62;
  undefined8 uVar63;
  undefined1 auVar64 [16];
  long in_stack_00000000;
  undefined8 in_stack_00000018;
  long in_stack_00000048;
  undefined8 in_stack_00000050;
  long in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 uStack_238;
  undefined8 uStack_230;
  ulong uStack_1f0;
  long lStack_1d0;
  long lStack_178;
  ulong uStack_150;
  ulong uStack_e8;
  undefined8 *puStack_d0;
  undefined8 *puStack_c8;
  dword *pdStack_c0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  ulong uStack_80;
  undefined1 auStack_78 [16];
  
  func_0x00187bd4(in_stack_00000018,in_stack_00000000 << 4,8);
  if (in_stack_00000098 != 0) {
    func_0x00187bd4(in_stack_000000a0,in_stack_00000098,1);
  }
  if (in_stack_00000048 != 0) {
    func_0x00187bd4(in_stack_00000050,in_stack_00000048,1);
  }
  auVar64 = __Unwind_Resume(param_1);
  puVar51 = auVar64._0_8_;
  uVar47 = puVar51[0x43];
  uVar44 = puVar51[0x44];
  if (puVar51[0x3d] == -0x8000000000000000) {
    uStack_a8 = 0x8000000000000000;
    if (puVar51[0x40] != -0x8000000000000000) goto LAB_0050e3a8;
LAB_0050e410:
    uVar37 = *(undefined1 *)((long)puVar51 + 0x254);
    uVar35 = puVar51[10];
    uStack_e8 = 0x8000000000000000;
    if (uVar35 == 5) goto LAB_0050e424;
LAB_0050e3d4:
    if (3 < uVar35) {
      auVar64 = (**(code **)(puVar51[0xc] + 0x38))(puVar51[0xb]);
    }
    uStack_80 = uVar35;
  }
  else {
    auVar64 = func_0x0045cd08(&uStack_a8,puVar51 + 0x3d);
    if (puVar51[0x40] == -0x8000000000000000) goto LAB_0050e410;
LAB_0050e3a8:
    auVar64 = func_0x0045cd08(&uStack_80,puVar51 + 0x40);
    uStack_238 = auStack_78._8_8_;
    uStack_230 = auStack_78._0_8_;
    uVar37 = *(undefined1 *)((long)puVar51 + 0x254);
    uVar35 = puVar51[10];
    uStack_e8 = uStack_80;
    if (uVar35 != 5) goto LAB_0050e3d4;
LAB_0050e424:
    auVar64._8_8_ = auStack_78._8_8_;
    auVar64._0_8_ = auStack_78._0_8_;
    uStack_80 = 5;
  }
  uVar36 = 0;
  uVar35 = puVar51[0xf];
  uVar49 = uVar35 * 0x10;
  auStack_78 = auVar64;
  if ((uVar35 >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar49)) {
LAB_0050f53c:
    func_0x007a1f00(uVar36,uVar49,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  if (uVar49 == 0) {
    puVar9 = (undefined8 *)0x8;
  }
  else {
    puVar38 = (undefined8 *)puVar51[0xe];
    uVar36 = 8;
    puVar9 = (undefined8 *)func_0x00187bd0(uVar49,8);
    if (puVar9 == (undefined8 *)0x0) goto LAB_0050f53c;
    auVar64 = auStack_78;
    if (uVar35 == 0) goto LAB_0050e550;
    uVar14 = uVar35 - 1;
    uVar49 = uVar35;
    if (uVar14 <= uVar35) {
      uVar49 = uVar14;
    }
    if (uVar49 < 8) {
LAB_0050e4c0:
      lVar26 = 0;
      uVar49 = uVar35;
      puVar39 = puVar38;
    }
    else {
      uVar15 = uVar35;
      if (uVar14 <= uVar35) {
        uVar15 = uVar14;
      }
      if ((puVar9 < puVar38 + uVar15 * 2 + 2) && (puVar38 < puVar9 + uVar15 * 2 + 2))
      goto LAB_0050e4c0;
      uVar14 = uVar49 + 1 & 3;
      uVar15 = 4;
      if (uVar14 != 0) {
        uVar15 = uVar14;
      }
      lVar26 = (uVar49 + 1) - uVar15;
      uVar49 = uVar35 - lVar26;
      puVar39 = puVar38 + lVar26 * 2;
      puVar40 = puVar9 + 4;
      puVar41 = puVar38 + 4;
      lVar29 = lVar26;
      do {
        uVar53 = puVar41[-3];
        uVar36 = puVar41[-2];
        uVar54 = puVar41[-1];
        uVar56 = *puVar41;
        uVar60 = puVar41[1];
        uVar58 = puVar41[2];
        uVar62 = puVar41[3];
        puVar40[-4] = puVar41[-4];
        puVar40[-3] = uVar53;
        puVar40[-2] = uVar36;
        puVar40[-1] = uVar54;
        *puVar40 = uVar56;
        puVar40[1] = uVar60;
        puVar40[2] = uVar58;
        puVar40[3] = uVar62;
        puVar40 = puVar40 + 8;
        puVar41 = puVar41 + 8;
        lVar29 = lVar29 + -4;
      } while (lVar29 != 0);
    }
    puVar40 = puVar9 + lVar26 * 2 + 1;
    do {
      if (puVar39 == puVar38 + uVar35 * 2) break;
      uVar36 = puVar39[1];
      puVar40[-1] = *puVar39;
      *puVar40 = uVar36;
      puVar40 = puVar40 + 2;
      uVar49 = uVar49 - 1;
      puVar39 = puVar39 + 2;
    } while (uVar49 != 0);
  }
LAB_0050e550:
  uVar14 = puVar51[0x12];
  uVar49 = uVar14 * 0x10;
  if (uVar14 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar49) {
    uVar36 = 0;
LAB_0050f5ac:
    auStack_78 = auVar64;
    func_0x007a1f00(uVar36,uVar49,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  uVar1 = *(undefined4 *)(puVar51 + 0x4a);
  if (uVar49 == 0) {
    puVar38 = (undefined8 *)0x8;
  }
  else {
    puVar39 = (undefined8 *)puVar51[0x11];
    uVar36 = 8;
    auStack_78 = auVar64;
    puVar38 = (undefined8 *)func_0x00187bd0(uVar49,8);
    auVar64 = auStack_78;
    if (puVar38 == (undefined8 *)0x0) goto LAB_0050f5ac;
    if (uVar14 == 0) goto LAB_0050e674;
    uVar15 = uVar14 - 1;
    uVar49 = uVar14;
    if (uVar15 <= uVar14) {
      uVar49 = uVar15;
    }
    if (uVar49 < 8) {
LAB_0050e640:
      lVar26 = 0;
      uVar49 = uVar14;
      puVar40 = puVar39;
    }
    else {
      uVar16 = uVar14;
      if (uVar15 <= uVar14) {
        uVar16 = uVar15;
      }
      if (puVar38 < puVar39 + uVar16 * 2 + 2 && puVar39 < puVar38 + uVar16 * 2 + 2)
      goto LAB_0050e640;
      uVar15 = uVar49 + 1 & 3;
      uVar16 = 4;
      if (uVar15 != 0) {
        uVar16 = uVar15;
      }
      lVar26 = (uVar49 + 1) - uVar16;
      uVar49 = uVar14 - lVar26;
      puVar40 = puVar39 + lVar26 * 2;
      puVar41 = puVar38 + 4;
      puVar42 = puVar39 + 4;
      lVar29 = lVar26;
      do {
        uVar53 = puVar42[-3];
        uVar36 = puVar42[-2];
        uVar54 = puVar42[-1];
        uVar56 = *puVar42;
        uVar60 = puVar42[1];
        uVar58 = puVar42[2];
        uVar62 = puVar42[3];
        puVar41[-4] = puVar42[-4];
        puVar41[-3] = uVar53;
        puVar41[-2] = uVar36;
        puVar41[-1] = uVar54;
        *puVar41 = uVar56;
        puVar41[1] = uVar60;
        puVar41[2] = uVar58;
        puVar41[3] = uVar62;
        puVar41 = puVar41 + 8;
        puVar42 = puVar42 + 8;
        lVar29 = lVar29 + -4;
      } while (lVar29 != 0);
    }
    puVar41 = puVar38 + lVar26 * 2 + 1;
    do {
      if (puVar40 == puVar39 + uVar14 * 2) break;
      uVar36 = puVar40[1];
      puVar41[-1] = *puVar40;
      *puVar41 = uVar36;
      puVar41 = puVar41 + 2;
      uVar49 = uVar49 - 1;
      puVar40 = puVar40 + 2;
    } while (uVar49 != 0);
  }
LAB_0050e674:
  uVar15 = puVar51[0x15];
  uVar49 = uVar15 * 0x10;
  if (uVar15 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar49) {
    uVar36 = 0;
LAB_0050f5c8:
    auStack_78 = auVar64;
    func_0x007a1f00(uVar36,uVar49,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  if (uVar49 == 0) {
    puVar39 = (undefined8 *)0x8;
  }
  else {
    puVar40 = (undefined8 *)puVar51[0x14];
    uVar36 = 8;
    auStack_78 = auVar64;
    puVar39 = (undefined8 *)func_0x00187bd0(uVar49,8);
    auVar64 = auStack_78;
    if (puVar39 == (undefined8 *)0x0) goto LAB_0050f5c8;
    if (uVar15 == 0) goto LAB_0050e78c;
    uVar16 = uVar15 - 1;
    uVar49 = uVar15;
    if (uVar16 <= uVar15) {
      uVar49 = uVar16;
    }
    if (uVar49 < 8) {
LAB_0050e758:
      lVar26 = 0;
      uVar49 = uVar15;
      puVar41 = puVar40;
    }
    else {
      uVar17 = uVar15;
      if (uVar16 <= uVar15) {
        uVar17 = uVar16;
      }
      if (puVar39 < puVar40 + uVar17 * 2 + 2 && puVar40 < puVar39 + uVar17 * 2 + 2)
      goto LAB_0050e758;
      uVar16 = uVar49 + 1 & 3;
      uVar17 = 4;
      if (uVar16 != 0) {
        uVar17 = uVar16;
      }
      lVar26 = (uVar49 + 1) - uVar17;
      uVar49 = uVar15 - lVar26;
      puVar41 = puVar40 + lVar26 * 2;
      puVar42 = puVar39 + 4;
      puVar43 = puVar40 + 4;
      lVar29 = lVar26;
      do {
        uVar53 = puVar43[-3];
        uVar36 = puVar43[-2];
        uVar54 = puVar43[-1];
        uVar56 = *puVar43;
        uVar60 = puVar43[1];
        uVar58 = puVar43[2];
        uVar62 = puVar43[3];
        puVar42[-4] = puVar43[-4];
        puVar42[-3] = uVar53;
        puVar42[-2] = uVar36;
        puVar42[-1] = uVar54;
        *puVar42 = uVar56;
        puVar42[1] = uVar60;
        puVar42[2] = uVar58;
        puVar42[3] = uVar62;
        puVar42 = puVar42 + 8;
        puVar43 = puVar43 + 8;
        lVar29 = lVar29 + -4;
      } while (lVar29 != 0);
    }
    puVar42 = puVar39 + lVar26 * 2 + 1;
    do {
      if (puVar41 == puVar40 + uVar15 * 2) break;
      uVar36 = puVar41[1];
      puVar42[-1] = *puVar41;
      *puVar42 = uVar36;
      puVar42 = puVar42 + 2;
      uVar49 = uVar49 - 1;
      puVar41 = puVar41 + 2;
    } while (uVar49 != 0);
  }
LAB_0050e78c:
  uVar16 = puVar51[0x18];
  uVar49 = uVar16 * 0x20;
  if (uVar16 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar49) {
    uVar36 = 0;
LAB_0050f5e4:
    auStack_78 = auVar64;
    func_0x007a1f00(uVar36,uVar49,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  if (uVar49 == 0) {
    pdVar10 = &MACH_HEADER.cpusubtype;
  }
  else {
    puVar40 = (undefined8 *)puVar51[0x17];
    uVar36 = 8;
    auStack_78 = auVar64;
    pdVar10 = (dword *)func_0x00187bd0(uVar49,8);
    auVar64 = auStack_78;
    if (pdVar10 == (dword *)0x0) goto LAB_0050f5e4;
    if (uVar16 == 0) goto LAB_0050e898;
    uVar17 = uVar16 - 1;
    uVar49 = uVar16;
    if (uVar17 <= uVar16) {
      uVar49 = uVar17;
    }
    if (uVar49 < 6) {
LAB_0050e85c:
      uVar49 = 0;
      uVar17 = uVar16;
      puVar41 = puVar40;
    }
    else {
      uVar18 = uVar16;
      if (uVar17 <= uVar16) {
        uVar18 = uVar17;
      }
      if (pdVar10 < puVar40 + uVar18 * 4 + 4 && puVar40 < pdVar10 + (uVar18 * 4 + 4) * 2)
      goto LAB_0050e85c;
      uVar49 = uVar49 & 0x7fffffffffffffe;
      uVar17 = uVar16 - uVar49;
      puVar41 = puVar40 + uVar49 * 4;
      uVar18 = uVar49;
      puVar42 = puVar40;
      pdVar11 = pdVar10;
      do {
        uVar56 = puVar42[5];
        uVar54 = puVar42[4];
        uVar53 = puVar42[7];
        uVar36 = puVar42[6];
        uVar62 = puVar42[1];
        uVar60 = puVar42[3];
        uVar58 = puVar42[2];
        *(undefined8 *)pdVar11 = *puVar42;
        *(undefined8 *)(pdVar11 + 2) = uVar62;
        *(undefined8 *)(pdVar11 + 4) = uVar58;
        *(undefined8 *)(pdVar11 + 6) = uVar60;
        *(undefined8 *)(pdVar11 + 8) = uVar54;
        *(undefined8 *)(pdVar11 + 10) = uVar56;
        *(undefined8 *)(pdVar11 + 0xc) = uVar36;
        *(undefined8 *)(pdVar11 + 0xe) = uVar53;
        pdVar11 = pdVar11 + 0x10;
        uVar18 = uVar18 - 2;
        puVar42 = puVar42 + 8;
      } while (uVar18 != 0);
    }
    pdVar11 = pdVar10 + (uVar49 * 4 + 2) * 2;
    do {
      if (puVar41 == puVar40 + uVar16 * 4) break;
      uVar56 = puVar41[1];
      uVar54 = *puVar41;
      uVar36 = puVar41[2];
      uVar53 = puVar41[3];
      ((mach_header *)(pdVar11 + -2))->magic = (int)uVar56;
      ((mach_header *)(pdVar11 + -2))->cputype = (int)((ulong)uVar56 >> 0x20);
      *(undefined8 *)(pdVar11 + -4) = uVar54;
      *(undefined8 *)pdVar11 = uVar36;
      *(undefined8 *)(pdVar11 + 2) = uVar53;
      puVar41 = puVar41 + 4;
      uVar17 = uVar17 - 1;
      pdVar11 = pdVar11 + 8;
    } while (uVar17 != 0);
  }
LAB_0050e898:
  uVar17 = puVar51[0x1b];
  uVar49 = uVar17 * 0x20;
  if (uVar17 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar49) {
    uVar36 = 0;
LAB_0050f600:
    auStack_78 = auVar64;
    func_0x007a1f00(uVar36,uVar49,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  if (uVar49 == 0) {
    pdVar11 = &MACH_HEADER.cpusubtype;
  }
  else {
    puVar40 = (undefined8 *)puVar51[0x1a];
    uVar36 = 8;
    auStack_78 = auVar64;
    pdVar11 = (dword *)func_0x00187bd0(uVar49,8);
    auVar64 = auStack_78;
    if (pdVar11 == (dword *)0x0) goto LAB_0050f600;
    if (uVar17 == 0) goto LAB_0050e9a8;
    uVar18 = uVar17 - 1;
    uVar49 = uVar17;
    if (uVar18 <= uVar17) {
      uVar49 = uVar18;
    }
    if (uVar49 < 6) {
LAB_0050e96c:
      uVar49 = 0;
      uVar18 = uVar17;
      puVar41 = puVar40;
    }
    else {
      uVar19 = uVar17;
      if (uVar18 <= uVar17) {
        uVar19 = uVar18;
      }
      if (pdVar11 < puVar40 + uVar19 * 4 + 4 && puVar40 < pdVar11 + (uVar19 * 4 + 4) * 2)
      goto LAB_0050e96c;
      uVar49 = uVar49 & 0x7fffffffffffffe;
      uVar18 = uVar49;
      puVar41 = puVar40;
      pdVar27 = pdVar11;
      do {
        uVar56 = puVar41[5];
        uVar54 = puVar41[4];
        uVar53 = puVar41[7];
        uVar36 = puVar41[6];
        uVar62 = puVar41[1];
        uVar60 = puVar41[3];
        uVar58 = puVar41[2];
        *(undefined8 *)pdVar27 = *puVar41;
        *(undefined8 *)(pdVar27 + 2) = uVar62;
        *(undefined8 *)(pdVar27 + 4) = uVar58;
        *(undefined8 *)(pdVar27 + 6) = uVar60;
        *(undefined8 *)(pdVar27 + 8) = uVar54;
        *(undefined8 *)(pdVar27 + 10) = uVar56;
        *(undefined8 *)(pdVar27 + 0xc) = uVar36;
        *(undefined8 *)(pdVar27 + 0xe) = uVar53;
        pdVar27 = pdVar27 + 0x10;
        uVar18 = uVar18 - 2;
        puVar41 = puVar41 + 8;
      } while (uVar18 != 0);
      uVar18 = uVar17 - uVar49;
      puVar41 = puVar40 + uVar49 * 4;
    }
    pdVar27 = pdVar11 + (uVar49 * 4 + 2) * 2;
    do {
      if (puVar41 == puVar40 + uVar17 * 4) break;
      uVar56 = puVar41[1];
      uVar54 = *puVar41;
      uVar36 = puVar41[2];
      uVar53 = puVar41[3];
      ((mach_header *)(pdVar27 + -2))->magic = (int)uVar56;
      ((mach_header *)(pdVar27 + -2))->cputype = (int)((ulong)uVar56 >> 0x20);
      *(undefined8 *)(pdVar27 + -4) = uVar54;
      *(undefined8 *)pdVar27 = uVar36;
      *(undefined8 *)(pdVar27 + 2) = uVar53;
      puVar41 = puVar41 + 4;
      uVar18 = uVar18 - 1;
      pdVar27 = pdVar27 + 8;
    } while (uVar18 != 0);
  }
LAB_0050e9a8:
  uVar18 = puVar51[0x1e];
  uVar49 = uVar18 * 0x20;
  if (uVar18 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar49) {
    uVar36 = 0;
LAB_0050f61c:
    auStack_78 = auVar64;
    func_0x007a1f00(uVar36,uVar49,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  if (uVar49 == 0) {
    pdStack_c0 = &MACH_HEADER.cpusubtype;
  }
  else {
    puVar40 = (undefined8 *)puVar51[0x1d];
    uVar36 = 8;
    auStack_78 = auVar64;
    pdStack_c0 = (dword *)func_0x00187bd0(uVar49,8);
    auVar64 = auStack_78;
    if (pdStack_c0 == (dword *)0x0) goto LAB_0050f61c;
    if (uVar18 == 0) goto LAB_0050eab4;
    uVar19 = uVar18 - 1;
    uVar49 = uVar18;
    if (uVar19 <= uVar18) {
      uVar49 = uVar19;
    }
    if (uVar49 < 6) {
LAB_0050ea74:
      uVar49 = 0;
      uVar19 = uVar18;
      puVar41 = puVar40;
    }
    else {
      uVar20 = uVar18;
      if (uVar19 <= uVar18) {
        uVar20 = uVar19;
      }
      if (pdStack_c0 < puVar40 + uVar20 * 4 + 4 && puVar40 < pdStack_c0 + (uVar20 * 4 + 4) * 2)
      goto LAB_0050ea74;
      uVar49 = uVar49 & 0x7fffffffffffffe;
      uVar19 = uVar18 - uVar49;
      puVar41 = puVar40 + uVar49 * 4;
      uVar20 = uVar49;
      puVar42 = puVar40;
      pdVar27 = pdStack_c0;
      do {
        uVar56 = puVar42[5];
        uVar54 = puVar42[4];
        uVar53 = puVar42[7];
        uVar36 = puVar42[6];
        uVar62 = puVar42[1];
        uVar60 = puVar42[3];
        uVar58 = puVar42[2];
        *(undefined8 *)pdVar27 = *puVar42;
        *(undefined8 *)(pdVar27 + 2) = uVar62;
        *(undefined8 *)(pdVar27 + 4) = uVar58;
        *(undefined8 *)(pdVar27 + 6) = uVar60;
        *(undefined8 *)(pdVar27 + 8) = uVar54;
        *(undefined8 *)(pdVar27 + 10) = uVar56;
        *(undefined8 *)(pdVar27 + 0xc) = uVar36;
        *(undefined8 *)(pdVar27 + 0xe) = uVar53;
        pdVar27 = pdVar27 + 0x10;
        uVar20 = uVar20 - 2;
        puVar42 = puVar42 + 8;
      } while (uVar20 != 0);
    }
    pdVar27 = pdStack_c0 + (uVar49 * 4 + 2) * 2;
    do {
      if (puVar41 == puVar40 + uVar18 * 4) break;
      uVar56 = puVar41[1];
      uVar54 = *puVar41;
      uVar36 = puVar41[2];
      uVar53 = puVar41[3];
      ((mach_header *)(pdVar27 + -2))->magic = (int)uVar56;
      ((mach_header *)(pdVar27 + -2))->cputype = (int)((ulong)uVar56 >> 0x20);
      *(undefined8 *)(pdVar27 + -4) = uVar54;
      *(undefined8 *)pdVar27 = uVar36;
      *(undefined8 *)(pdVar27 + 2) = uVar53;
      puVar41 = puVar41 + 4;
      uVar19 = uVar19 - 1;
      pdVar27 = pdVar27 + 8;
    } while (uVar19 != 0);
  }
LAB_0050eab4:
  uVar19 = puVar51[0x21];
  uVar49 = uVar19 * 0x10;
  if (uVar19 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar49) {
    uVar36 = 0;
LAB_0050f638:
    auStack_78 = auVar64;
    func_0x007a1f00(uVar36,uVar49,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  if (uVar49 == 0) {
    puVar40 = (undefined8 *)0x8;
  }
  else {
    puVar41 = (undefined8 *)puVar51[0x20];
    uVar36 = 8;
    auStack_78 = auVar64;
    puVar40 = (undefined8 *)func_0x00187bd0(uVar49,8);
    auVar64 = auStack_78;
    if (puVar40 == (undefined8 *)0x0) goto LAB_0050f638;
    if (uVar19 == 0) goto LAB_0050ebcc;
    uVar20 = uVar19 - 1;
    uVar49 = uVar19;
    if (uVar20 <= uVar19) {
      uVar49 = uVar20;
    }
    if (uVar49 < 8) {
LAB_0050eb98:
      lVar26 = 0;
      uVar49 = uVar19;
      puVar42 = puVar41;
    }
    else {
      uVar21 = uVar19;
      if (uVar20 <= uVar19) {
        uVar21 = uVar20;
      }
      if (puVar40 < puVar41 + uVar21 * 2 + 2 && puVar41 < puVar40 + uVar21 * 2 + 2)
      goto LAB_0050eb98;
      uVar20 = uVar49 + 1 & 3;
      uVar21 = 4;
      if (uVar20 != 0) {
        uVar21 = uVar20;
      }
      lVar26 = (uVar49 + 1) - uVar21;
      uVar49 = uVar19 - lVar26;
      puVar42 = puVar41 + lVar26 * 2;
      puVar43 = puVar40 + 4;
      puVar25 = puVar41 + 4;
      lVar29 = lVar26;
      do {
        uVar53 = puVar25[-3];
        uVar36 = puVar25[-2];
        uVar54 = puVar25[-1];
        uVar56 = *puVar25;
        uVar60 = puVar25[1];
        uVar58 = puVar25[2];
        uVar62 = puVar25[3];
        puVar43[-4] = puVar25[-4];
        puVar43[-3] = uVar53;
        puVar43[-2] = uVar36;
        puVar43[-1] = uVar54;
        *puVar43 = uVar56;
        puVar43[1] = uVar60;
        puVar43[2] = uVar58;
        puVar43[3] = uVar62;
        puVar43 = puVar43 + 8;
        puVar25 = puVar25 + 8;
        lVar29 = lVar29 + -4;
      } while (lVar29 != 0);
    }
    puVar43 = puVar40 + lVar26 * 2 + 1;
    do {
      if (puVar42 == puVar41 + uVar19 * 2) break;
      uVar36 = puVar42[1];
      puVar43[-1] = *puVar42;
      *puVar43 = uVar36;
      puVar43 = puVar43 + 2;
      uVar49 = uVar49 - 1;
      puVar42 = puVar42 + 2;
    } while (uVar49 != 0);
  }
LAB_0050ebcc:
  uVar20 = puVar51[0x24];
  uVar49 = uVar20 * 0x10;
  if (uVar20 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar49) {
    uVar36 = 0;
LAB_0050f654:
    auStack_78 = auVar64;
    func_0x007a1f00(uVar36,uVar49,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  if (uVar49 == 0) {
    puStack_d0 = (undefined8 *)0x8;
  }
  else {
    puVar41 = (undefined8 *)puVar51[0x23];
    uVar36 = 8;
    auStack_78 = auVar64;
    puStack_d0 = (undefined8 *)func_0x00187bd0(uVar49,8);
    auVar64 = auStack_78;
    if (puStack_d0 == (undefined8 *)0x0) goto LAB_0050f654;
    if (uVar20 != 0) {
      uVar21 = uVar20 - 1;
      uVar49 = uVar20;
      if (uVar21 <= uVar20) {
        uVar49 = uVar21;
      }
      uVar28 = uVar20;
      puVar42 = puVar41;
      if (uVar49 < 8) {
        lVar26 = 0;
      }
      else {
        uVar45 = uVar20;
        if (uVar21 <= uVar20) {
          uVar45 = uVar21;
        }
        if (puStack_d0 < puVar41 + uVar45 * 2 + 2 && puVar41 < puStack_d0 + uVar45 * 2 + 2) {
          lVar26 = 0;
        }
        else {
          uVar21 = uVar49 + 1 & 3;
          uVar28 = 4;
          if (uVar21 != 0) {
            uVar28 = uVar21;
          }
          lVar26 = (uVar49 + 1) - uVar28;
          uVar28 = uVar20 - lVar26;
          puVar42 = puVar41 + lVar26 * 2;
          puVar43 = puStack_d0 + 4;
          puVar25 = puVar41 + 4;
          lVar29 = lVar26;
          do {
            uVar53 = puVar25[-3];
            uVar36 = puVar25[-2];
            uVar54 = puVar25[-1];
            uVar56 = *puVar25;
            uVar60 = puVar25[1];
            uVar58 = puVar25[2];
            uVar62 = puVar25[3];
            puVar43[-4] = puVar25[-4];
            puVar43[-3] = uVar53;
            puVar43[-2] = uVar36;
            puVar43[-1] = uVar54;
            *puVar43 = uVar56;
            puVar43[1] = uVar60;
            puVar43[2] = uVar58;
            puVar43[3] = uVar62;
            puVar43 = puVar43 + 8;
            puVar25 = puVar25 + 8;
            lVar29 = lVar29 + -4;
          } while (lVar29 != 0);
        }
      }
      puVar43 = puStack_d0 + lVar26 * 2 + 1;
      do {
        if (puVar42 == puVar41 + uVar20 * 2) break;
        uVar36 = puVar42[1];
        puVar43[-1] = *puVar42;
        *puVar43 = uVar36;
        puVar43 = puVar43 + 2;
        uVar28 = uVar28 - 1;
        puVar42 = puVar42 + 2;
      } while (uVar28 != 0);
    }
  }
  uVar36 = 0;
  uVar21 = puVar51[0x27];
  auVar5._8_8_ = 0;
  auVar5._0_8_ = uVar21;
  uVar49 = uVar21 * 0x18;
  auStack_78 = auVar64;
  if ((SUB168(auVar5 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar49)) {
LAB_0050f554:
    func_0x007a1f00(uVar36,uVar49,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  uVar2 = *(undefined4 *)(puVar51 + 0x49);
  uVar53 = puVar51[0x45];
  uVar54 = puVar51[0x46];
  if (uVar49 == 0) {
    lStack_178 = 8;
  }
  else {
    puVar41 = (undefined8 *)puVar51[0x26];
    uVar36 = 8;
    lStack_178 = func_0x00187bd0(uVar49,8);
    if (lStack_178 == 0) goto LAB_0050f554;
    if (uVar21 != 0) {
      puVar13 = (undefined1 *)(lStack_178 + 0x10);
      uVar28 = uVar21;
      do {
        if (uVar49 == 0) break;
        uVar36 = *puVar41;
        uVar56 = puVar41[1];
        uVar4 = *(undefined1 *)(puVar41 + 2);
        puVar41 = puVar41 + 3;
        *(undefined8 *)(puVar13 + -0x10) = uVar36;
        *(undefined8 *)(puVar13 + -8) = uVar56;
        *puVar13 = uVar4;
        uVar49 = uVar49 - 0x18;
        uVar28 = uVar28 - 1;
        puVar13 = puVar13 + 0x18;
      } while (uVar28 != 0);
    }
  }
  uVar49 = puVar51[0x2a];
  uVar28 = uVar49 * 8;
  if (uVar49 >> 0x3d != 0 || 0x7ffffffffffffffc < uVar28) {
    uVar36 = 0;
LAB_0050f670:
    func_0x007a1f00(uVar36,uVar28,&UNK_009e7fe0);
    goto LAB_0050f6d8;
  }
  uVar56 = puVar51[0x29];
  if (uVar28 == 0) {
    uStack_150 = 0;
    lVar26 = 4;
  }
  else {
    uVar36 = 4;
    lVar26 = func_0x00187bd0(uVar28,4);
    if (lVar26 == 0) goto LAB_0050f670;
    uStack_150 = uVar49;
  }
  _memcpy(lVar26,uVar56,uVar28);
  uVar36 = 0;
  uVar45 = puVar51[0x2d];
  uVar28 = uVar45 * 0x10;
  if ((uVar45 >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar28)) {
LAB_0050f568:
    func_0x007a1f00(uVar36,uVar28,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  uVar56 = *puVar51;
  uVar58 = puVar51[1];
  if (uVar28 == 0) {
    puStack_c8 = (undefined8 *)0x8;
  }
  else {
    puVar41 = (undefined8 *)puVar51[0x2c];
    uVar36 = 8;
    puStack_c8 = (undefined8 *)func_0x00187bd0(uVar28,8);
    if (puStack_c8 == (undefined8 *)0x0) goto LAB_0050f568;
    if (uVar45 == 0) goto LAB_0050ef50;
    uVar22 = uVar45 - 1;
    uVar28 = uVar45;
    if (uVar22 <= uVar45) {
      uVar28 = uVar22;
    }
    if (uVar28 < 8) {
LAB_0050eeb8:
      lVar29 = 0;
      uVar28 = uVar45;
      puVar42 = puVar41;
    }
    else {
      uVar23 = uVar45;
      if (uVar22 <= uVar45) {
        uVar23 = uVar22;
      }
      if ((puStack_c8 < puVar41 + uVar23 * 2 + 2) && (puVar41 < puStack_c8 + uVar23 * 2 + 2))
      goto LAB_0050eeb8;
      uVar22 = uVar28 + 1 & 3;
      uVar23 = 4;
      if (uVar22 != 0) {
        uVar23 = uVar22;
      }
      lVar29 = (uVar28 + 1) - uVar23;
      uVar28 = uVar45 - lVar29;
      puVar42 = puVar41 + lVar29 * 2;
      puVar43 = puStack_c8 + 4;
      puVar25 = puVar41 + 4;
      lVar12 = lVar29;
      do {
        uVar60 = puVar25[-3];
        uVar36 = puVar25[-2];
        uVar62 = puVar25[-1];
        uVar55 = *puVar25;
        uVar59 = puVar25[1];
        uVar57 = puVar25[2];
        uVar61 = puVar25[3];
        puVar43[-4] = puVar25[-4];
        puVar43[-3] = uVar60;
        puVar43[-2] = uVar36;
        puVar43[-1] = uVar62;
        *puVar43 = uVar55;
        puVar43[1] = uVar59;
        puVar43[2] = uVar57;
        puVar43[3] = uVar61;
        puVar43 = puVar43 + 8;
        puVar25 = puVar25 + 8;
        lVar12 = lVar12 + -4;
      } while (lVar12 != 0);
    }
    puVar43 = puStack_c8 + lVar29 * 2 + 1;
    do {
      if (puVar42 == puVar41 + uVar45 * 2) break;
      uVar36 = puVar42[1];
      puVar43[-1] = *puVar42;
      *puVar43 = uVar36;
      puVar43 = puVar43 + 2;
      uVar28 = uVar28 - 1;
      puVar42 = puVar42 + 2;
    } while (uVar28 != 0);
  }
LAB_0050ef50:
  uVar36 = puVar51[2];
  if ((int)uVar36 == 1) {
    uStack_88 = puVar51[4];
    uStack_90 = puVar51[3];
  }
  else {
    uVar36 = 0;
  }
  uVar22 = puVar51[0x30];
  uVar28 = uVar22 * 0x10;
  if (uVar22 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar28) {
    uVar60 = 0;
code_r0x0050f68c:
    func_0x007a1f00(uVar60,uVar28,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  uVar3 = *(undefined4 *)((long)puVar51 + 0x24c);
  if (uVar28 == 0) {
    puVar41 = (undefined8 *)0x8;
  }
  else {
    puVar42 = (undefined8 *)puVar51[0x2f];
    uVar60 = 8;
    puVar41 = (undefined8 *)func_0x00187bd0(uVar28,8);
    if (puVar41 == (undefined8 *)0x0) goto code_r0x0050f68c;
    if (uVar22 == 0) goto code_r0x0050f0a8;
    uVar23 = uVar22 - 1;
    uVar28 = uVar22;
    if (uVar23 <= uVar22) {
      uVar28 = uVar23;
    }
    if (uVar28 < 8) {
code_r0x0050f004:
      lVar29 = 0;
      uVar28 = uVar22;
      puVar43 = puVar42;
    }
    else {
      uVar30 = uVar22;
      if (uVar23 <= uVar22) {
        uVar30 = uVar23;
      }
      if ((puVar41 < puVar42 + uVar30 * 2 + 2) && (puVar42 < puVar41 + uVar30 * 2 + 2))
      goto code_r0x0050f004;
      uVar23 = uVar28 + 1 & 3;
      uVar30 = 4;
      if (uVar23 != 0) {
        uVar30 = uVar23;
      }
      lVar29 = (uVar28 + 1) - uVar30;
      uVar28 = uVar22 - lVar29;
      puVar43 = puVar42 + lVar29 * 2;
      puVar25 = puVar41 + 4;
      puVar31 = puVar42 + 4;
      lVar12 = lVar29;
      do {
        uVar62 = puVar31[-3];
        uVar60 = puVar31[-2];
        uVar55 = puVar31[-1];
        uVar57 = *puVar31;
        uVar61 = puVar31[1];
        uVar59 = puVar31[2];
        uVar63 = puVar31[3];
        puVar25[-4] = puVar31[-4];
        puVar25[-3] = uVar62;
        puVar25[-2] = uVar60;
        puVar25[-1] = uVar55;
        *puVar25 = uVar57;
        puVar25[1] = uVar61;
        puVar25[2] = uVar59;
        puVar25[3] = uVar63;
        puVar25 = puVar25 + 8;
        puVar31 = puVar31 + 8;
        lVar12 = lVar12 + -4;
      } while (lVar12 != 0);
    }
    puVar25 = puVar41 + lVar29 * 2 + 1;
    do {
      if (puVar43 == puVar42 + uVar22 * 2) break;
      uVar60 = puVar43[1];
      puVar25[-1] = *puVar43;
      *puVar25 = uVar60;
      puVar25 = puVar25 + 2;
      uVar28 = uVar28 - 1;
      puVar43 = puVar43 + 2;
    } while (uVar28 != 0);
  }
code_r0x0050f0a8:
  uVar60 = 0;
  uVar23 = puVar51[0x33];
  auVar6._8_8_ = 0;
  auVar6._0_8_ = uVar23;
  uVar28 = uVar23 * 0x30;
  if ((SUB168(auVar6 * ZEXT816(0x30),8) != 0) || (0x7ffffffffffffff8 < uVar28)) {
LAB_0050f57c:
    func_0x007a1f00(uVar60,uVar28,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  if (uVar28 == 0) {
    lStack_1d0 = 8;
  }
  else {
    puVar42 = (undefined8 *)puVar51[0x32];
    uVar60 = 8;
    lStack_1d0 = func_0x00187bd0(uVar28,8);
    if (lStack_1d0 == 0) goto LAB_0050f57c;
    if (uVar23 != 0) {
      puVar43 = (undefined8 *)(lStack_1d0 + 0x18);
      uVar30 = uVar23;
      do {
        if (uVar28 == 0) break;
        puVar25 = puVar42 + 1;
        uVar55 = *puVar42;
        uVar59 = puVar42[3];
        uVar57 = puVar42[2];
        uVar60 = puVar42[4];
        uVar62 = puVar42[5];
        puVar42 = puVar42 + 6;
        puVar43[-2] = *puVar25;
        puVar43[-3] = uVar55;
        *puVar43 = uVar59;
        puVar43[-1] = uVar57;
        puVar43[1] = uVar60;
        puVar43[2] = uVar62;
        uVar28 = uVar28 - 0x30;
        puVar43 = puVar43 + 6;
        uVar30 = uVar30 - 1;
      } while (uVar30 != 0);
    }
  }
  uVar28 = puVar51[0x36];
  uVar30 = uVar28 * 0x10;
  if (uVar28 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar30) {
    uVar60 = 0;
LAB_0050f6a8:
    func_0x007a1f00(uVar60,uVar30,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  if (uVar30 == 0) {
    puVar42 = (undefined8 *)0x8;
  }
  else {
    puVar43 = (undefined8 *)puVar51[0x35];
    uVar60 = 8;
    puVar42 = (undefined8 *)func_0x00187bd0(uVar30,8);
    if (puVar42 == (undefined8 *)0x0) goto LAB_0050f6a8;
    if (uVar28 == 0) goto LAB_0050f270;
    uVar24 = uVar28 - 1;
    uVar30 = uVar28;
    if (uVar24 <= uVar28) {
      uVar30 = uVar24;
    }
    if (uVar30 < 8) {
LAB_0050f230:
      lVar29 = 0;
      uVar30 = uVar28;
      puVar25 = puVar43;
    }
    else {
      uVar48 = uVar28;
      if (uVar24 <= uVar28) {
        uVar48 = uVar24;
      }
      if (puVar42 < puVar43 + uVar48 * 2 + 2 && puVar43 < puVar42 + uVar48 * 2 + 2)
      goto LAB_0050f230;
      uVar24 = uVar30 + 1 & 3;
      uVar48 = 4;
      if (uVar24 != 0) {
        uVar48 = uVar24;
      }
      lVar29 = (uVar30 + 1) - uVar48;
      uVar30 = uVar28 - lVar29;
      puVar25 = puVar43 + lVar29 * 2;
      puVar31 = puVar42 + 4;
      puVar34 = puVar43 + 4;
      lVar12 = lVar29;
      do {
        uVar62 = puVar34[-3];
        uVar60 = puVar34[-2];
        uVar55 = puVar34[-1];
        uVar57 = *puVar34;
        uVar61 = puVar34[1];
        uVar59 = puVar34[2];
        uVar63 = puVar34[3];
        puVar31[-4] = puVar34[-4];
        puVar31[-3] = uVar62;
        puVar31[-2] = uVar60;
        puVar31[-1] = uVar55;
        *puVar31 = uVar57;
        puVar31[1] = uVar61;
        puVar31[2] = uVar59;
        puVar31[3] = uVar63;
        puVar31 = puVar31 + 8;
        puVar34 = puVar34 + 8;
        lVar12 = lVar12 + -4;
      } while (lVar12 != 0);
    }
    puVar31 = puVar42 + lVar29 * 2 + 1;
    do {
      if (puVar25 == puVar43 + uVar28 * 2) break;
      uVar60 = puVar25[1];
      puVar31[-1] = *puVar25;
      *puVar31 = uVar60;
      puVar31 = puVar31 + 2;
      uVar30 = uVar30 - 1;
      puVar25 = puVar25 + 2;
    } while (uVar30 != 0);
  }
LAB_0050f270:
  uVar30 = puVar51[0x39];
  uVar24 = uVar30 * 0x10;
  if (uVar30 >> 0x3c == 0 && uVar24 < 0x7ffffffffffffff9) {
    uVar63 = puVar51[0x47];
    uVar46 = puVar51[0x48];
    uVar62 = puVar51[5];
    uVar57 = puVar51[6];
    uVar55 = puVar51[7];
    uVar59 = puVar51[8];
    uVar61 = puVar51[9];
    uVar50 = puVar51[0x38];
    if (uVar24 == 0) {
      uStack_1f0 = 0;
      lVar29 = 8;
    }
    else {
      uVar60 = 8;
      lVar29 = func_0x00187bd0(uVar24,8);
      if (lVar29 == 0) goto LAB_0050f6c4;
      uStack_1f0 = uVar30;
    }
    _memcpy(lVar29,uVar50,uVar24);
    uVar60 = 0;
    uVar24 = puVar51[0x3c];
    uVar48 = uVar24 * 0x20;
    if ((uVar24 >> 0x3b == 0) && (uVar48 < 0x7ffffffffffffff9)) {
      if (uVar48 == 0) {
        lVar12 = 8;
LAB_0050f390:
        extraout_x8[0x43] = uVar47;
        extraout_x8[0x44] = uVar44;
        extraout_x8[0x41] = uStack_230;
        extraout_x8[0x42] = uStack_238;
        *(undefined1 *)((long)extraout_x8 + 0x254) = uVar37;
        extraout_x8[0xe] = puVar9;
        *(undefined4 *)(extraout_x8 + 0x4a) = uVar1;
        extraout_x8[0x14] = puVar39;
        extraout_x8[0x1a] = pdVar11;
        extraout_x8[0x20] = puVar40;
        *(undefined4 *)(extraout_x8 + 0x49) = uVar2;
        extraout_x8[0x45] = uVar53;
        extraout_x8[0x46] = uVar54;
        extraout_x8[0x26] = lStack_178;
        extraout_x8[0x28] = uStack_150;
        extraout_x8[0x29] = lVar26;
        extraout_x8[0x2a] = uVar49;
        *extraout_x8 = uVar56;
        extraout_x8[1] = uVar58;
        extraout_x8[0x2c] = puStack_c8;
        extraout_x8[2] = uVar36;
        *(undefined4 *)((long)extraout_x8 + 0x24c) = uVar3;
        extraout_x8[0x47] = uVar63;
        extraout_x8[0x48] = uVar46;
        extraout_x8[0x32] = lStack_1d0;
        extraout_x8[0x33] = uVar23;
        extraout_x8[0x3e] = uStack_a0;
        extraout_x8[0x3d] = uStack_a8;
        extraout_x8[0x3f] = uStack_98;
        extraout_x8[0x40] = uStack_e8;
        extraout_x8[0xb] = auStack_78._0_8_;
        extraout_x8[10] = uStack_80;
        extraout_x8[0xc] = auStack_78._8_8_;
        extraout_x8[0xd] = uVar35;
        extraout_x8[0xf] = uVar35;
        extraout_x8[0x10] = uVar14;
        extraout_x8[0x11] = puVar38;
        extraout_x8[0x12] = uVar14;
        extraout_x8[0x13] = uVar15;
        extraout_x8[0x15] = uVar15;
        extraout_x8[0x16] = uVar16;
        extraout_x8[0x17] = pdVar10;
        extraout_x8[0x18] = uVar16;
        extraout_x8[0x19] = uVar17;
        extraout_x8[0x1b] = uVar17;
        extraout_x8[0x1c] = uVar18;
        extraout_x8[0x1d] = pdStack_c0;
        extraout_x8[0x1e] = uVar18;
        extraout_x8[0x1f] = uVar19;
        extraout_x8[0x21] = uVar19;
        extraout_x8[0x22] = uVar20;
        extraout_x8[0x23] = puStack_d0;
        extraout_x8[0x24] = uVar20;
        extraout_x8[0x25] = uVar21;
        extraout_x8[0x27] = uVar21;
        extraout_x8[0x2b] = uVar45;
        extraout_x8[4] = uStack_88;
        extraout_x8[3] = uStack_90;
        extraout_x8[0x2d] = uVar45;
        extraout_x8[0x2e] = uVar22;
        extraout_x8[0x2f] = puVar41;
        extraout_x8[0x30] = uVar22;
        extraout_x8[0x31] = uVar23;
        extraout_x8[0x34] = uVar28;
        extraout_x8[0x35] = puVar42;
        extraout_x8[5] = uVar62;
        extraout_x8[6] = uVar57;
        extraout_x8[7] = uVar55;
        extraout_x8[8] = uVar59;
        extraout_x8[9] = uVar61;
        extraout_x8[0x36] = uVar28;
        extraout_x8[0x37] = uStack_1f0;
        extraout_x8[0x38] = lVar29;
        extraout_x8[0x39] = uVar30;
        extraout_x8[0x3a] = uVar24;
        extraout_x8[0x3b] = lVar12;
        extraout_x8[0x3c] = uVar24;
        return;
      }
      puVar51 = (undefined8 *)puVar51[0x3b];
      uVar60 = 8;
      lVar12 = func_0x00187bd0(uVar48,8);
      if (lVar12 != 0) {
        if (uVar24 != 0) {
          puVar43 = (undefined8 *)(lVar12 + 0x10);
          uVar32 = uVar24;
          do {
            if (uVar48 == 0) break;
            plVar33 = (long *)*puVar51;
            lVar8 = *plVar33;
            *plVar33 = lVar8 + 1;
            if (lVar8 < 0) goto LAB_0050f6d8;
            uVar60 = puVar51[1];
            uVar52 = puVar51[3];
            uVar50 = puVar51[2];
            puVar51 = puVar51 + 4;
            puVar43[-2] = plVar33;
            puVar43[-1] = uVar60;
            puVar43[1] = uVar52;
            *puVar43 = uVar50;
            uVar48 = uVar48 - 0x20;
            uVar32 = uVar32 - 1;
            puVar43 = puVar43 + 4;
          } while (uVar32 != 0);
        }
        goto LAB_0050f390;
      }
    }
    func_0x007a1f00(uVar60,uVar48,&UNK_009e7fc8);
  }
  else {
    uVar60 = 0;
LAB_0050f6c4:
    func_0x007a1f00(uVar60,uVar24,&UNK_009e7fe0);
  }
LAB_0050f6d8:
                    /* WARNING: Does not return */
  pcVar7 = (code *)SoftwareBreakpoint(1,0x50f6dc);
  (*pcVar7)();
}

