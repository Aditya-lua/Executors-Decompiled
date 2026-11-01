
ulong FUN_002f5498(undefined1 *param_1,undefined8 param_2,dword *param_3,dword *param_4,
                  undefined8 param_5,dword *param_6,dword *param_7)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 *puVar13;
  undefined1 *puVar14;
  int iVar15;
  dword *pdVar16;
  dword *pdVar17;
  uint uVar18;
  undefined8 *puVar19;
  long lVar20;
  undefined8 *puVar21;
  byte *pbVar22;
  undefined1 *puVar23;
  byte *pbVar24;
  dword *unaff_x19;
  ulong uVar25;
  dword *unaff_x20;
  dword *pdVar26;
  ulong unaff_x21;
  undefined8 *unaff_x22;
  dword *unaff_x23;
  dword *pdVar27;
  dword *pdVar28;
  dword *unaff_x24;
  dword *unaff_x25;
  dword *unaff_x26;
  dword *unaff_x27;
  undefined8 *unaff_x28;
  undefined1 *unaff_x29;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  undefined8 uVar41;
  undefined8 uVar42;
  undefined8 uVar43;
  undefined8 uVar44;
  undefined1 auVar45 [16];
  
  do {
    auVar5._8_8_ = unaff_x26;
    auVar5._0_8_ = unaff_x27;
    auVar4._8_8_ = unaff_x26;
    auVar4._0_8_ = unaff_x27;
    auVar3._8_8_ = unaff_x26;
    auVar3._0_8_ = unaff_x27;
    auVar2._8_8_ = unaff_x26;
    auVar2._0_8_ = unaff_x27;
    auVar1._8_8_ = unaff_x26;
    auVar1._0_8_ = unaff_x27;
    auVar45._8_8_ = unaff_x26;
    auVar45._0_8_ = unaff_x27;
    pdVar17 = (dword *)0x0;
    iVar15 = func_0x002c18e4(param_1,param_2);
    pdVar26 = unaff_x20;
    pdVar27 = unaff_x23;
    pdVar28 = unaff_x24;
    if (iVar15 == 0) goto LAB_002f5890;
    auVar45 = auVar1;
    if (1 < *(byte *)((long)register0x00000008 + 0x338) - 1) goto LAB_002f5890;
    *(undefined1 *)((long)register0x00000008 + 0x338) = 2;
    param_3 = *(dword **)((long)register0x00000008 + 0x50);
    iVar15 = (**(code **)(*(long *)((long)register0x00000008 + 0xa8) + 0x18))
                       (unaff_x25,*(undefined8 *)((long)register0x00000008 + 0x48));
    auVar45 = auVar2;
    if (iVar15 == 0) goto LAB_002f5890;
    auVar45 = auVar3;
    if (1 < *(byte *)((long)register0x00000008 + 0x338) - 1) goto LAB_002f5890;
    *(undefined1 *)((long)register0x00000008 + 0x338) = 2;
    param_3 = &MACH_HEADER.cputype;
    iVar15 = (**(code **)(*(long *)((long)register0x00000008 + 0xa8) + 0x18))
                       (unaff_x25,(undefined1 *)((long)register0x00000008 + 0x5c));
    auVar45 = auVar4;
    if (iVar15 == 0) goto LAB_002f5890;
    auVar45 = auVar5;
    if (1 < *(byte *)((long)register0x00000008 + 0x338) - 1) goto LAB_002f5890;
    unaff_x21 = *(ulong *)((long)register0x00000008 + 0xa8);
    unaff_x27 = (dword *)(long)*(int *)(*(long *)((long)register0x00000008 + 0xa0) + 4);
    auVar7._8_8_ = unaff_x26;
    auVar7._0_8_ = unaff_x27;
    auVar6._8_8_ = unaff_x26;
    auVar6._0_8_ = unaff_x27;
    auVar45._0_8_ = unaff_x27;
    iVar15 = (**(code **)(unaff_x21 + 0x20))(unaff_x29 + -0xa0,unaff_x25);
    if (iVar15 == 0) goto LAB_002f5890;
    uVar30 = unaff_x28[8];
    uVar31 = unaff_x28[0xb];
    uVar29 = unaff_x28[10];
    *(undefined8 *)(unaff_x25 + 0x12) = unaff_x28[9];
    *(undefined8 *)(unaff_x25 + 0x10) = uVar30;
    *(undefined8 *)(unaff_x25 + 0x16) = uVar31;
    *(undefined8 *)(unaff_x25 + 0x14) = uVar29;
    uVar30 = unaff_x28[4];
    uVar31 = unaff_x28[7];
    uVar29 = unaff_x28[6];
    *(undefined8 *)(unaff_x25 + 10) = unaff_x28[5];
    *(undefined8 *)(unaff_x25 + 8) = uVar30;
    *(undefined8 *)(unaff_x25 + 0xe) = uVar31;
    *(undefined8 *)(unaff_x25 + 0xc) = uVar29;
    uVar30 = unaff_x28[0x10];
    uVar31 = unaff_x28[0x13];
    uVar29 = unaff_x28[0x12];
    *(undefined8 *)(unaff_x25 + 0x22) = unaff_x28[0x11];
    *(undefined8 *)(unaff_x25 + 0x20) = uVar30;
    *(undefined8 *)(unaff_x25 + 0x26) = uVar31;
    *(undefined8 *)(unaff_x25 + 0x24) = uVar29;
    uVar30 = unaff_x28[0xc];
    uVar31 = unaff_x28[0xf];
    uVar29 = unaff_x28[0xe];
    *(undefined8 *)(unaff_x25 + 0x1a) = unaff_x28[0xd];
    *(undefined8 *)(unaff_x25 + 0x18) = uVar30;
    *(undefined8 *)(unaff_x25 + 0x1e) = uVar31;
    *(undefined8 *)(unaff_x25 + 0x1c) = uVar29;
    *(undefined8 *)(unaff_x25 + 0x34) = unaff_x28[0x1a];
    uVar33 = unaff_x28[0x19];
    uVar32 = unaff_x28[0x18];
    uVar30 = unaff_x28[0x15];
    uVar31 = unaff_x28[0x14];
    uVar29 = unaff_x28[0x16];
    *(undefined8 *)(unaff_x25 + 0x2e) = unaff_x28[0x17];
    *(undefined8 *)(unaff_x25 + 0x2c) = uVar29;
    *(undefined8 *)(unaff_x25 + 0x32) = uVar33;
    *(undefined8 *)(unaff_x25 + 0x30) = uVar32;
    *(undefined8 *)(unaff_x25 + 0x2a) = uVar30;
    *(undefined8 *)(unaff_x25 + 0x28) = uVar31;
    uVar29 = *unaff_x28;
    uVar30 = unaff_x28[3];
    uVar31 = unaff_x28[2];
    *(undefined8 *)(unaff_x25 + 2) = unaff_x28[1];
    *(undefined8 *)unaff_x25 = uVar29;
    *(undefined8 *)(unaff_x25 + 6) = uVar30;
    *(undefined8 *)(unaff_x25 + 4) = uVar31;
    param_3 = unaff_x27;
    iVar15 = (**(code **)(*(long *)((long)register0x00000008 + 0xa8) + 0x18))
                       (unaff_x25,unaff_x29 + -0xa0);
    auVar45 = auVar6;
    if (iVar15 == 0) goto LAB_002f5890;
    iVar15 = (**(code **)(unaff_x21 + 0x20))
                       ((undefined1 *)((long)register0x00000008 + 0x60),unaff_x25);
    uVar29 = unaff_x22[0x14];
    uVar30 = unaff_x22[0x17];
    uVar31 = unaff_x22[0x16];
    *(undefined8 *)(unaff_x25 + 0x2a) = unaff_x22[0x15];
    *(undefined8 *)(unaff_x25 + 0x28) = uVar29;
    *(undefined8 *)(unaff_x25 + 0x2e) = uVar30;
    *(undefined8 *)(unaff_x25 + 0x2c) = uVar31;
    uVar29 = unaff_x22[0x18];
    *(undefined8 *)(unaff_x25 + 0x32) = unaff_x22[0x19];
    *(undefined8 *)(unaff_x25 + 0x30) = uVar29;
    *(undefined8 *)(unaff_x25 + 0x34) = unaff_x22[0x1a];
    uVar29 = unaff_x22[0xc];
    uVar30 = unaff_x22[0xf];
    uVar31 = unaff_x22[0xe];
    *(undefined8 *)(unaff_x25 + 0x1a) = unaff_x22[0xd];
    *(undefined8 *)(unaff_x25 + 0x18) = uVar29;
    *(undefined8 *)(unaff_x25 + 0x1e) = uVar30;
    *(undefined8 *)(unaff_x25 + 0x1c) = uVar31;
    uVar29 = unaff_x22[0x10];
    uVar30 = unaff_x22[0x13];
    uVar31 = unaff_x22[0x12];
    *(undefined8 *)(unaff_x25 + 0x22) = unaff_x22[0x11];
    *(undefined8 *)(unaff_x25 + 0x20) = uVar29;
    *(undefined8 *)(unaff_x25 + 0x26) = uVar30;
    *(undefined8 *)(unaff_x25 + 0x24) = uVar31;
    uVar29 = unaff_x22[4];
    uVar30 = unaff_x22[7];
    uVar31 = unaff_x22[6];
    *(undefined8 *)(unaff_x25 + 10) = unaff_x22[5];
    *(undefined8 *)(unaff_x25 + 8) = uVar29;
    *(undefined8 *)(unaff_x25 + 0xe) = uVar30;
    *(undefined8 *)(unaff_x25 + 0xc) = uVar31;
    uVar29 = unaff_x22[8];
    uVar30 = unaff_x22[0xb];
    uVar31 = unaff_x22[10];
    *(undefined8 *)(unaff_x25 + 0x12) = unaff_x22[9];
    *(undefined8 *)(unaff_x25 + 0x10) = uVar29;
    *(undefined8 *)(unaff_x25 + 0x16) = uVar30;
    *(undefined8 *)(unaff_x25 + 0x14) = uVar31;
    uVar29 = *unaff_x22;
    uVar30 = unaff_x22[3];
    uVar31 = unaff_x22[2];
    *(undefined8 *)(unaff_x25 + 2) = unaff_x22[1];
    *(undefined8 *)unaff_x25 = uVar29;
    *(undefined8 *)(unaff_x25 + 6) = uVar30;
    *(undefined8 *)(unaff_x25 + 4) = uVar31;
    *(undefined1 *)((long)register0x00000008 + 0x338) = 3;
    auVar45 = auVar7;
    if (iVar15 == 0) goto LAB_002f5890;
    if (unaff_x26 != (dword *)0x0) {
      param_3 = unaff_x26;
      _memcpy(unaff_x19,(undefined1 *)((long)register0x00000008 + 0x60));
    }
    if (1 < (uint)unaff_x23) {
      *(ulong *)((long)register0x00000008 + 0x30) = (ulong)unaff_x26 & 0xffffffc0;
      *(ulong *)((long)register0x00000008 + 8) = (ulong)unaff_x26 & 0x38;
      *(dword **)((long)register0x00000008 + 0x10) = unaff_x19 + 8;
      *(ulong *)((long)register0x00000008 + 0x18) = -((ulong)unaff_x26 & 0xfffffffffffffff8);
      *(ulong *)((long)register0x00000008 + 0x20) = (ulong)unaff_x26 & 0xfffffff8;
      unaff_x21 = 1;
      do {
        auVar10._8_8_ = unaff_x26;
        auVar10._0_8_ = unaff_x27;
        auVar9._8_8_ = unaff_x26;
        auVar9._0_8_ = unaff_x27;
        auVar8._8_8_ = unaff_x26;
        auVar8._0_8_ = unaff_x27;
        auVar45._0_8_ = unaff_x27;
        param_3 = (dword *)0x0;
        param_4 = (dword *)0x0;
        pdVar17 = (dword *)0x0;
        iVar15 = func_0x002c18e4((undefined1 *)((long)register0x00000008 + 0xa0),0);
        pdVar26 = unaff_x20;
        pdVar27 = unaff_x23;
        pdVar28 = unaff_x24;
        if (iVar15 == 0) goto LAB_002f5890;
        auVar45 = auVar8;
        if (1 < *(byte *)((long)register0x00000008 + 0x338) - 1) goto LAB_002f5890;
        *(undefined1 *)((long)register0x00000008 + 0x338) = 2;
        param_3 = unaff_x24;
        iVar15 = (**(code **)(*(long *)((long)register0x00000008 + 0xa8) + 0x18))
                           (unaff_x25,(undefined1 *)((long)register0x00000008 + 0x60));
        auVar45 = auVar9;
        if (iVar15 == 0) goto LAB_002f5890;
        auVar45 = auVar10;
        if (1 < *(byte *)((long)register0x00000008 + 0x338) - 1) goto LAB_002f5890;
        pdVar27 = *(dword **)((long)register0x00000008 + 0xa8);
        unaff_x27 = (dword *)(long)*(int *)(*(long *)((long)register0x00000008 + 0xa0) + 4);
        auVar12._8_8_ = unaff_x26;
        auVar12._0_8_ = unaff_x27;
        auVar11._8_8_ = unaff_x26;
        auVar11._0_8_ = unaff_x27;
        auVar45._0_8_ = unaff_x27;
        iVar15 = (**(code **)(pdVar27 + 8))(unaff_x29 + -0xa0,unaff_x25);
        pdVar26 = unaff_x19;
        pdVar28 = unaff_x23;
        if (iVar15 == 0) goto LAB_002f5890;
        uVar30 = unaff_x28[8];
        uVar31 = unaff_x28[0xb];
        uVar29 = unaff_x28[10];
        *(undefined8 *)(unaff_x25 + 0x12) = unaff_x28[9];
        *(undefined8 *)(unaff_x25 + 0x10) = uVar30;
        *(undefined8 *)(unaff_x25 + 0x16) = uVar31;
        *(undefined8 *)(unaff_x25 + 0x14) = uVar29;
        uVar30 = unaff_x28[4];
        uVar31 = unaff_x28[7];
        uVar29 = unaff_x28[6];
        *(undefined8 *)(unaff_x25 + 10) = unaff_x28[5];
        *(undefined8 *)(unaff_x25 + 8) = uVar30;
        *(undefined8 *)(unaff_x25 + 0xe) = uVar31;
        *(undefined8 *)(unaff_x25 + 0xc) = uVar29;
        uVar30 = unaff_x28[0x10];
        uVar31 = unaff_x28[0x13];
        uVar29 = unaff_x28[0x12];
        *(undefined8 *)(unaff_x25 + 0x22) = unaff_x28[0x11];
        *(undefined8 *)(unaff_x25 + 0x20) = uVar30;
        *(undefined8 *)(unaff_x25 + 0x26) = uVar31;
        *(undefined8 *)(unaff_x25 + 0x24) = uVar29;
        uVar30 = unaff_x28[0xc];
        uVar31 = unaff_x28[0xf];
        uVar29 = unaff_x28[0xe];
        *(undefined8 *)(unaff_x25 + 0x1a) = unaff_x28[0xd];
        *(undefined8 *)(unaff_x25 + 0x18) = uVar30;
        *(undefined8 *)(unaff_x25 + 0x1e) = uVar31;
        *(undefined8 *)(unaff_x25 + 0x1c) = uVar29;
        *(undefined8 *)(unaff_x25 + 0x34) = unaff_x28[0x1a];
        uVar33 = unaff_x28[0x19];
        uVar32 = unaff_x28[0x18];
        uVar30 = unaff_x28[0x15];
        uVar31 = unaff_x28[0x14];
        uVar29 = unaff_x28[0x16];
        *(undefined8 *)(unaff_x25 + 0x2e) = unaff_x28[0x17];
        *(undefined8 *)(unaff_x25 + 0x2c) = uVar29;
        *(undefined8 *)(unaff_x25 + 0x32) = uVar33;
        *(undefined8 *)(unaff_x25 + 0x30) = uVar32;
        *(undefined8 *)(unaff_x25 + 0x2a) = uVar30;
        *(undefined8 *)(unaff_x25 + 0x28) = uVar31;
        uVar29 = *unaff_x28;
        uVar30 = unaff_x28[3];
        uVar31 = unaff_x28[2];
        *(undefined8 *)(unaff_x25 + 2) = unaff_x28[1];
        *(undefined8 *)unaff_x25 = uVar29;
        *(undefined8 *)(unaff_x25 + 6) = uVar30;
        *(undefined8 *)(unaff_x25 + 4) = uVar31;
        param_3 = unaff_x27;
        iVar15 = (**(code **)(*(long *)((long)register0x00000008 + 0xa8) + 0x18))
                           (unaff_x25,unaff_x29 + -0xa0);
        auVar45 = auVar11;
        if (iVar15 == 0) goto LAB_002f5890;
        iVar15 = (**(code **)(pdVar27 + 8))
                           ((undefined1 *)((long)register0x00000008 + 0x60),unaff_x25);
        uVar29 = unaff_x22[0x14];
        uVar30 = unaff_x22[0x17];
        uVar31 = unaff_x22[0x16];
        *(undefined8 *)(unaff_x25 + 0x2a) = unaff_x22[0x15];
        *(undefined8 *)(unaff_x25 + 0x28) = uVar29;
        *(undefined8 *)(unaff_x25 + 0x2e) = uVar30;
        *(undefined8 *)(unaff_x25 + 0x2c) = uVar31;
        uVar29 = unaff_x22[0x18];
        *(undefined8 *)(unaff_x25 + 0x32) = unaff_x22[0x19];
        *(undefined8 *)(unaff_x25 + 0x30) = uVar29;
        *(undefined8 *)(unaff_x25 + 0x34) = unaff_x22[0x1a];
        uVar29 = unaff_x22[0xc];
        uVar30 = unaff_x22[0xf];
        uVar31 = unaff_x22[0xe];
        *(undefined8 *)(unaff_x25 + 0x1a) = unaff_x22[0xd];
        *(undefined8 *)(unaff_x25 + 0x18) = uVar29;
        *(undefined8 *)(unaff_x25 + 0x1e) = uVar30;
        *(undefined8 *)(unaff_x25 + 0x1c) = uVar31;
        uVar29 = unaff_x22[0x10];
        uVar30 = unaff_x22[0x13];
        uVar31 = unaff_x22[0x12];
        *(undefined8 *)(unaff_x25 + 0x22) = unaff_x22[0x11];
        *(undefined8 *)(unaff_x25 + 0x20) = uVar29;
        *(undefined8 *)(unaff_x25 + 0x26) = uVar30;
        *(undefined8 *)(unaff_x25 + 0x24) = uVar31;
        uVar29 = unaff_x22[4];
        uVar30 = unaff_x22[7];
        uVar31 = unaff_x22[6];
        *(undefined8 *)(unaff_x25 + 10) = unaff_x22[5];
        *(undefined8 *)(unaff_x25 + 8) = uVar29;
        *(undefined8 *)(unaff_x25 + 0xe) = uVar30;
        *(undefined8 *)(unaff_x25 + 0xc) = uVar31;
        uVar29 = unaff_x22[8];
        uVar30 = unaff_x22[0xb];
        uVar31 = unaff_x22[10];
        *(undefined8 *)(unaff_x25 + 0x12) = unaff_x22[9];
        *(undefined8 *)(unaff_x25 + 0x10) = uVar29;
        *(undefined8 *)(unaff_x25 + 0x16) = uVar30;
        *(undefined8 *)(unaff_x25 + 0x14) = uVar31;
        uVar29 = *unaff_x22;
        uVar30 = unaff_x22[3];
        uVar31 = unaff_x22[2];
        *(undefined8 *)(unaff_x25 + 2) = unaff_x22[1];
        *(undefined8 *)unaff_x25 = uVar29;
        *(undefined8 *)(unaff_x25 + 6) = uVar30;
        *(undefined8 *)(unaff_x25 + 4) = uVar31;
        *(undefined1 *)((long)register0x00000008 + 0x338) = 3;
        auVar45 = auVar12;
        if (iVar15 == 0) goto LAB_002f5890;
        if (unaff_x26 != (dword *)0x0) {
          if ((undefined1 *)((long)&MACH_HEADER.cputype + 3) < unaff_x26) {
            if ((undefined1 *)((long)&segment_command_00000020.vmaddr + 7) < unaff_x26) {
              lVar20 = *(long *)((long)register0x00000008 + 0x30);
              puVar19 = *(undefined8 **)((long)register0x00000008 + 0x28);
              puVar21 = *(undefined8 **)((long)register0x00000008 + 0x10);
              do {
                uVar31 = puVar19[-3];
                uVar29 = puVar19[-4];
                uVar32 = puVar19[-1];
                uVar30 = puVar19[-2];
                uVar34 = puVar19[1];
                uVar33 = *puVar19;
                uVar36 = puVar19[3];
                uVar35 = puVar19[2];
                uVar38 = puVar21[-3];
                uVar37 = puVar21[-4];
                uVar40 = puVar21[-1];
                uVar39 = puVar21[-2];
                uVar42 = puVar21[1];
                uVar41 = *puVar21;
                uVar44 = puVar21[3];
                uVar43 = puVar21[2];
                puVar21[-3] = CONCAT17((byte)((ulong)uVar38 >> 0x38) ^ (byte)((ulong)uVar31 >> 0x38)
                                       ,CONCAT16((byte)((ulong)uVar38 >> 0x30) ^
                                                 (byte)((ulong)uVar31 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar38 >> 0x28) ^
                                                          (byte)((ulong)uVar31 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar38 >> 0x20) ^
                                                                   (byte)((ulong)uVar31 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar38 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar31 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar38 >> 0x10) ^ (byte)((ulong)uVar31 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar38 >> 8) ^
                                                           (byte)((ulong)uVar31 >> 8),
                                                           (byte)uVar38 ^ (byte)uVar31)))))));
                puVar21[-4] = CONCAT17((byte)((ulong)uVar37 >> 0x38) ^ (byte)((ulong)uVar29 >> 0x38)
                                       ,CONCAT16((byte)((ulong)uVar37 >> 0x30) ^
                                                 (byte)((ulong)uVar29 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar37 >> 0x28) ^
                                                          (byte)((ulong)uVar29 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar37 >> 0x20) ^
                                                                   (byte)((ulong)uVar29 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar37 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar29 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar37 >> 0x10) ^ (byte)((ulong)uVar29 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar37 >> 8) ^
                                                           (byte)((ulong)uVar29 >> 8),
                                                           (byte)uVar37 ^ (byte)uVar29)))))));
                puVar21[-1] = CONCAT17((byte)((ulong)uVar40 >> 0x38) ^ (byte)((ulong)uVar32 >> 0x38)
                                       ,CONCAT16((byte)((ulong)uVar40 >> 0x30) ^
                                                 (byte)((ulong)uVar32 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar40 >> 0x28) ^
                                                          (byte)((ulong)uVar32 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar40 >> 0x20) ^
                                                                   (byte)((ulong)uVar32 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar40 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar32 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar40 >> 0x10) ^ (byte)((ulong)uVar32 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar40 >> 8) ^
                                                           (byte)((ulong)uVar32 >> 8),
                                                           (byte)uVar40 ^ (byte)uVar32)))))));
                puVar21[-2] = CONCAT17((byte)((ulong)uVar39 >> 0x38) ^ (byte)((ulong)uVar30 >> 0x38)
                                       ,CONCAT16((byte)((ulong)uVar39 >> 0x30) ^
                                                 (byte)((ulong)uVar30 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar39 >> 0x28) ^
                                                          (byte)((ulong)uVar30 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar39 >> 0x20) ^
                                                                   (byte)((ulong)uVar30 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar39 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar30 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar39 >> 0x10) ^ (byte)((ulong)uVar30 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar39 >> 8) ^
                                                           (byte)((ulong)uVar30 >> 8),
                                                           (byte)uVar39 ^ (byte)uVar30)))))));
                puVar21[1] = CONCAT17((byte)((ulong)uVar42 >> 0x38) ^ (byte)((ulong)uVar34 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar42 >> 0x30) ^
                                               (byte)((ulong)uVar34 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar42 >> 0x28) ^
                                                        (byte)((ulong)uVar34 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar42 >> 0x20) ^
                                                                 (byte)((ulong)uVar34 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar42 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar34 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar42 >> 0x10) ^ (byte)((ulong)uVar34 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar42 >> 8) ^
                                                           (byte)((ulong)uVar34 >> 8),
                                                           (byte)uVar42 ^ (byte)uVar34)))))));
                *puVar21 = CONCAT17((byte)((ulong)uVar41 >> 0x38) ^ (byte)((ulong)uVar33 >> 0x38),
                                    CONCAT16((byte)((ulong)uVar41 >> 0x30) ^
                                             (byte)((ulong)uVar33 >> 0x30),
                                             CONCAT15((byte)((ulong)uVar41 >> 0x28) ^
                                                      (byte)((ulong)uVar33 >> 0x28),
                                                      CONCAT14((byte)((ulong)uVar41 >> 0x20) ^
                                                               (byte)((ulong)uVar33 >> 0x20),
                                                               CONCAT13((byte)((ulong)uVar41 >> 0x18
                                                                              ) ^ (byte)((ulong)
                                                  uVar33 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar41 >> 0x10) ^
                                                           (byte)((ulong)uVar33 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar41 >> 8) ^
                                                                    (byte)((ulong)uVar33 >> 8),
                                                                    (byte)uVar41 ^ (byte)uVar33)))))
                                            ));
                puVar21[3] = CONCAT17((byte)((ulong)uVar44 >> 0x38) ^ (byte)((ulong)uVar36 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar44 >> 0x30) ^
                                               (byte)((ulong)uVar36 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar44 >> 0x28) ^
                                                        (byte)((ulong)uVar36 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar44 >> 0x20) ^
                                                                 (byte)((ulong)uVar36 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar44 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar36 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar44 >> 0x10) ^ (byte)((ulong)uVar36 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar44 >> 8) ^
                                                           (byte)((ulong)uVar36 >> 8),
                                                           (byte)uVar44 ^ (byte)uVar36)))))));
                puVar21[2] = CONCAT17((byte)((ulong)uVar43 >> 0x38) ^ (byte)((ulong)uVar35 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar43 >> 0x30) ^
                                               (byte)((ulong)uVar35 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar43 >> 0x28) ^
                                                        (byte)((ulong)uVar35 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar43 >> 0x20) ^
                                                                 (byte)((ulong)uVar35 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar43 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar35 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar43 >> 0x10) ^ (byte)((ulong)uVar35 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar43 >> 8) ^
                                                           (byte)((ulong)uVar35 >> 8),
                                                           (byte)uVar43 ^ (byte)uVar35)))))));
                lVar20 = lVar20 + -0x40;
                puVar19 = puVar19 + 8;
                puVar21 = puVar21 + 8;
              } while (lVar20 != 0);
              if (unaff_x26 == (dword *)*(undefined1 **)((long)register0x00000008 + 0x30))
              goto LAB_002f5634;
              puVar23 = *(undefined1 **)((long)register0x00000008 + 0x30);
              if (*(long *)((long)register0x00000008 + 8) == 0) goto LAB_002f5840;
            }
            else {
              puVar23 = (undefined1 *)0x0;
            }
            puVar13 = puVar23 + *(long *)((long)register0x00000008 + 0x18);
            puVar19 = (undefined8 *)
                      ((undefined1 *)((long)register0x00000008 + 0x60) + (long)puVar23);
            puVar21 = (undefined8 *)((long)unaff_x19 + (long)puVar23);
            do {
              uVar29 = *puVar19;
              uVar31 = *puVar21;
              *puVar21 = CONCAT17((byte)((ulong)uVar31 >> 0x38) ^ (byte)((ulong)uVar29 >> 0x38),
                                  CONCAT16((byte)((ulong)uVar31 >> 0x30) ^
                                           (byte)((ulong)uVar29 >> 0x30),
                                           CONCAT15((byte)((ulong)uVar31 >> 0x28) ^
                                                    (byte)((ulong)uVar29 >> 0x28),
                                                    CONCAT14((byte)((ulong)uVar31 >> 0x20) ^
                                                             (byte)((ulong)uVar29 >> 0x20),
                                                             CONCAT13((byte)((ulong)uVar31 >> 0x18)
                                                                      ^ (byte)((ulong)uVar29 >> 0x18
                                                                              ),
                                                                      CONCAT12((byte)((ulong)uVar31
                                                                                     >> 0x10) ^
                                                                               (byte)((ulong)uVar29
                                                                                     >> 0x10),
                                                                               CONCAT11((byte)((
                                                  ulong)uVar31 >> 8) ^ (byte)((ulong)uVar29 >> 8),
                                                  (byte)uVar31 ^ (byte)uVar29)))))));
              puVar13 = puVar13 + 8;
              puVar19 = puVar19 + 1;
              puVar21 = puVar21 + 1;
            } while (puVar13 != (undefined1 *)0x0);
            puVar23 = *(undefined1 **)((long)register0x00000008 + 0x20);
            if (unaff_x26 == (dword *)puVar23) goto LAB_002f5634;
          }
          else {
            puVar23 = (undefined1 *)0x0;
          }
LAB_002f5840:
          lVar20 = (long)unaff_x26 - (long)puVar23;
          pbVar22 = (byte *)((long)unaff_x19 + (long)puVar23);
          pbVar24 = (undefined1 *)((long)register0x00000008 + 0x60) + (long)puVar23;
          do {
            *pbVar22 = *pbVar22 ^ *pbVar24;
            lVar20 = lVar20 + -1;
            pbVar22 = pbVar22 + 1;
            pbVar24 = pbVar24 + 1;
          } while (lVar20 != 0);
        }
LAB_002f5634:
        uVar18 = (int)unaff_x21 + 1;
        unaff_x21 = (ulong)uVar18;
        unaff_x20 = unaff_x19;
      } while (uVar18 != (uint)unaff_x23);
    }
    auVar45._0_8_ = unaff_x27;
    unaff_x19 = (dword *)((long)unaff_x19 + (long)unaff_x26);
    uVar18 = *(int *)((long)register0x00000008 + 0x3c) + 1;
    unaff_x20 = (dword *)(*(long *)((long)register0x00000008 + 0x40) - (long)unaff_x26);
    puVar23 = (undefined1 *)register0x00000008;
    puVar13 = (undefined1 *)register0x00000008;
    pdVar26 = unaff_x20;
    pdVar27 = unaff_x23;
    pdVar28 = unaff_x24;
    if (unaff_x20 == (dword *)0x0) {
      do {
        uVar25 = (ulong)((int)pdVar27 != 0);
        puVar14 = puVar23;
        pdVar16 = param_3;
        unaff_x23 = pdVar17;
        unaff_x20 = param_6;
        unaff_x19 = param_7;
        while( true ) {
          uVar29 = auVar45._8_8_;
          uVar31 = auVar45._0_8_;
          func_0x0036e464(puVar14 + 0xa0,0x2a0);
          if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
            return uVar25;
          }
          auVar45 = ___stack_chk_fail();
          param_3 = auVar45._8_8_;
          unaff_x27 = auVar45._0_8_;
          *(undefined8 *)(puVar14 + -0x50) = uVar29;
          *(dword **)(puVar14 + -0x48) = unaff_x25;
          *(dword **)(puVar14 + -0x40) = pdVar28;
          *(dword **)(puVar14 + -0x38) = pdVar27;
          *(undefined8 **)(puVar14 + -0x30) = unaff_x22;
          *(ulong *)(puVar14 + -0x28) = unaff_x21;
          *(dword **)(puVar14 + -0x20) = pdVar26;
          *(ulong *)(puVar14 + -0x18) = uVar25;
          *(undefined1 **)(puVar14 + -0x10) = unaff_x29;
          *(undefined8 *)(puVar14 + -8) = 0x2f58e0;
          func_0x00373e9c(0xa296a8,&DAT_002c20f4);
          unaff_x25 = (dword *)0xa3a6b8;
          unaff_x22 = *(undefined8 **)(puVar14 + -0x30);
          unaff_x21 = *(ulong *)(puVar14 + -0x28);
          *(undefined8 **)(puVar14 + -0x60) = unaff_x28;
          *(undefined8 *)(puVar14 + -0x58) = uVar31;
          *(undefined8 *)(puVar14 + -0x50) = *(undefined8 *)(puVar14 + -0x50);
          *(undefined8 *)(puVar14 + -0x48) = *(undefined8 *)(puVar14 + -0x48);
          *(undefined8 *)(puVar14 + -0x40) = *(undefined8 *)(puVar14 + -0x40);
          *(undefined8 *)(puVar14 + -0x38) = *(undefined8 *)(puVar14 + -0x38);
          *(undefined8 **)(puVar14 + -0x30) = unaff_x22;
          *(ulong *)(puVar14 + -0x28) = unaff_x21;
          *(undefined8 *)(puVar14 + -0x20) = *(undefined8 *)(puVar14 + -0x20);
          *(undefined8 *)(puVar14 + -0x18) = *(undefined8 *)(puVar14 + -0x18);
          *(undefined8 *)(puVar14 + -0x10) = *(undefined8 *)(puVar14 + -0x10);
          *(undefined8 *)(puVar14 + -8) = *(undefined8 *)(puVar14 + -8);
          unaff_x29 = puVar14 + -0x10;
          register0x00000008 = (BADSPACEBASE *)(puVar14 + -0x3f0);
          puVar23 = puVar14 + -0x3f0;
          puVar13 = puVar14 + -0x3f0;
          *(dword **)(puVar14 + -0x3a8) = pdVar16;
          *(dword **)(puVar14 + -0x3a0) = param_4;
          *(undefined8 *)(puVar14 + -0x70) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
          pdVar28 = (dword *)(ulong)uRam0000000000a3a6bc;
          param_6 = unaff_x25;
          param_7 = unaff_x20;
          _bzero(puVar14 + -0x350,0x2a0);
          pdVar17 = (dword *)0x0;
          param_4 = unaff_x25;
          iVar15 = func_0x002c18e4(puVar14 + -0x350,unaff_x27);
          pdVar26 = unaff_x20;
          pdVar27 = unaff_x23;
          if (iVar15 != 0) break;
LAB_002f5890:
          uVar25 = 0;
          puVar14 = (undefined1 *)register0x00000008;
          pdVar16 = param_3;
          unaff_x23 = pdVar17;
          unaff_x20 = param_6;
          unaff_x19 = param_7;
        }
      } while (unaff_x20 == (dword *)0x0);
      unaff_x25 = (dword *)(puVar14 + -0x340);
      unaff_x28 = (undefined8 *)(puVar14 + -400);
      unaff_x22 = (undefined8 *)(puVar14 + -0x268);
      *(undefined1 **)(puVar14 + -0x3c8) = puVar14 + -0x370;
      uVar18 = 1;
    }
    *(dword **)(puVar13 + 0x40) = unaff_x20;
    unaff_x26 = unaff_x20;
    if (pdVar28 <= unaff_x20) {
      unaff_x26 = pdVar28;
    }
    *(uint *)(puVar13 + 0x3c) = uVar18;
    uVar18 = (uVar18 & 0xff00ff00) >> 8 | (uVar18 & 0xff00ff) << 8;
    *(uint *)(puVar13 + 0x5c) = uVar18 >> 0x10 | uVar18 << 0x10;
    param_1 = puVar13 + 0xa0;
    param_2 = 0;
    param_3 = (dword *)0x0;
    param_4 = (dword *)0x0;
    register0x00000008 = (BADSPACEBASE *)puVar13;
    unaff_x24 = pdVar28;
  } while( true );
}

