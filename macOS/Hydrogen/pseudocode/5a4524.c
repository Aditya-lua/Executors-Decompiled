
/* WARNING: Possible PIC construction at 0x005a4548: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a4668: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a4a04: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0059e08c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0059e0cc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005a4a08) */
/* WARNING: Type propagation algorithm not settling */

void thunk_FUN_005a4528(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  long *plVar7;
  code *pcVar8;
  undefined1 *puVar9;
  bool bVar10;
  ulong *puVar11;
  undefined8 *puVar12;
  dword *pdVar13;
  long lVar14;
  long lVar15;
  long *extraout_x8;
  undefined8 *extraout_x8_00;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong *puVar19;
  long *plVar20;
  long *plVar21;
  undefined8 uVar22;
  ulong unaff_x25;
  undefined8 *******pppppppuVar23;
  undefined8 *******unaff_x29;
  undefined *puVar24;
  undefined1 uVar25;
  undefined1 uVar26;
  undefined1 uVar27;
  undefined1 uVar28;
  undefined1 uVar29;
  undefined1 uVar30;
  undefined1 uVar31;
  undefined1 uVar32;
  undefined1 uVar33;
  undefined1 uVar34;
  undefined1 uVar35;
  undefined1 uVar36;
  ulong uVar37;
  long lVar38;
  ulong uVar40;
  undefined1 auVar39 [16];
  long lVar41;
  long lVar42;
  undefined1 auVar43 [16];
  long in_stack_00000008;
  ulong in_stack_00000010;
  undefined1 uStack0000000000000020;
  undefined1 auStack_190 [8];
  long lStack_188;
  dword *pdStack_180;
  long lStack_178;
  ulong uStack_170;
  ulong uStack_168;
  ulong uStack_160;
  ulong uStack_158;
  ulong uStack_150;
  ulong uStack_148;
  ulong uStack_140;
  ulong uStack_138;
  ulong uStack_130;
  ulong uStack_128;
  ulong uStack_120;
  ulong uStack_118;
  ulong uStack_110;
  undefined1 uStack_108;
  undefined7 uStack_107;
  ulong uStack_100;
  ulong uStack_f8;
  undefined1 uStack_f0;
  undefined7 uStack_ef;
  ulong uStack_e8;
  ulong uStack_e0;
  ulong uStack_d8;
  ulong uStack_d0;
  ulong uStack_c8;
  ulong uStack_c0;
  ulong uStack_b8;
  undefined8 *******pppppppuStack_60;
  undefined *puStack_58;
  undefined1 auStack_50 [8];
  long lStack_48;
  undefined8 *puStack_40;
  long lStack_38;
  
  func_0x0059e308(&uStack0000000000000020);
  if (in_stack_00000008 != 0) {
    lVar15 = in_stack_00000008 << 3;
    puVar24 = (undefined *)0x5a454c;
    puVar9 = (undefined1 *)register0x00000008;
    puVar12 = (undefined8 *)in_stack_00000010;
    goto code_r0x00187bd4;
  }
  auVar43 = __Unwind_Resume(param_1);
  plVar20 = auVar43._8_8_;
  puVar9 = auStack_50;
  unaff_x29 = (undefined8 *******)(auStack_50 + 0x40);
  plVar7 = auVar43._0_8_;
  do {
    plVar21 = plVar7;
    if (plVar21 == plVar20) {
      *extraout_x8 = 0;
      extraout_x8[1] = 8;
      extraout_x8[2] = 0;
      return;
    }
    plVar7 = plVar21 + 0x10;
  } while (*plVar21 == 0xc);
  puVar12 = (undefined8 *)func_0x00187bd0(0x20,8);
  if (puVar12 != (undefined8 *)0x0) {
    *puVar12 = plVar21;
    lStack_48 = 4;
    lVar15 = 1;
    puStack_40 = puVar12;
    while (plVar21 = plVar7, plVar21 != plVar20) {
      plVar7 = plVar21 + 0x10;
      if (*plVar21 != 0xc) {
        if (lVar15 == lStack_48) {
          lStack_38 = lVar15;
          func_0x007af5a0(&lStack_48,lVar15,1,8,8);
          puVar12 = puStack_40;
        }
        puVar12[lVar15] = plVar21;
        lVar15 = lVar15 + 1;
      }
    }
    extraout_x8[1] = (long)puStack_40;
    *extraout_x8 = lStack_48;
    extraout_x8[2] = lVar15;
    return;
  }
  puVar12 = (undefined8 *)func_0x007a1f00(8,0x20,param_3);
  if (lStack_48 != 0) {
    lVar15 = lStack_48 << 3;
    puVar24 = &UNK_005a466c;
    puVar9 = auStack_50;
    puVar12 = puStack_40;
    goto code_r0x00187bd4;
  }
  auVar43 = __Unwind_Resume(puVar12);
  puVar11 = auVar43._0_8_;
  puStack_58 = &DAT_005a4674;
  pppppppuStack_60 = unaff_x29;
  lVar15 = func_0x0059c000();
  if (lVar15 == 0) {
    *extraout_x8_00 = 0;
    extraout_x8_00[1] = 8;
    extraout_x8_00[2] = 0;
    pppppppuVar23 = pppppppuStack_60;
    puVar24 = puStack_58;
  }
  else {
    if ((int)*puVar11 == 1) {
      if ((puVar11[0xb] & 1) == 0) {
        uVar18 = puVar11[2];
        uVar17 = puVar11[5];
        auVar2[9] = (char)(uVar18 >> 8);
        auVar2._0_9_ = *(unkbyte9 *)(puVar11 + 1);
        auVar2[10] = (char)(uVar18 >> 0x10);
        auVar2[0xb] = (char)(uVar18 >> 0x18);
        auVar2[0xc] = (char)(uVar18 >> 0x20);
        auVar2[0xd] = (char)(uVar18 >> 0x28);
        auVar2[0xe] = (char)(uVar18 >> 0x30);
        auVar2[0xf] = (char)(uVar18 >> 0x38);
        auVar5[9] = (char)(uVar17 >> 8);
        auVar5._0_9_ = *(unkbyte9 *)(puVar11 + 4);
        auVar5[10] = (char)(uVar17 >> 0x10);
        auVar5[0xb] = (char)(uVar17 >> 0x18);
        auVar5[0xc] = (char)(uVar17 >> 0x20);
        auVar5[0xd] = (char)(uVar17 >> 0x28);
        auVar5[0xe] = (char)(uVar17 >> 0x30);
        auVar5[0xf] = (char)(uVar17 >> 0x38);
        auVar39 = NEON_ext(auVar5,auVar2,8,1);
        lVar14 = -(ulong)(auVar39._0_8_ == 0);
        lVar38 = -(ulong)(auVar39._8_8_ == 0);
        uVar18 = puVar11[4] - uVar18;
        uVar17 = puVar11[8] - puVar11[6] >> 3;
        uVar16 = uVar18 >> 3;
        uVar16 = CONCAT17((byte)(puVar11[8] - puVar11[6] >> 0x3b) & ~(byte)((ulong)lVar14 >> 0x38),
                          CONCAT16((byte)(uVar17 >> 0x30) & ~(byte)((ulong)lVar14 >> 0x30),
                                   CONCAT15((byte)(uVar17 >> 0x28) & ~(byte)((ulong)lVar14 >> 0x28),
                                            CONCAT14((byte)(uVar17 >> 0x20) &
                                                     ~(byte)((ulong)lVar14 >> 0x20),
                                                     CONCAT13((byte)(uVar17 >> 0x18) &
                                                              ~(byte)((ulong)lVar14 >> 0x18),
                                                              CONCAT12((byte)(uVar17 >> 0x10) &
                                                                       ~(byte)((ulong)lVar14 >> 0x10
                                                                              ),CONCAT11((byte)(
                                                  uVar17 >> 8) & ~(byte)((ulong)lVar14 >> 8),
                                                  (byte)uVar17 & ~(byte)lVar14))))))) +
                 CONCAT17((byte)(uVar18 >> 0x3b) & ~(byte)((ulong)lVar38 >> 0x38),
                          CONCAT16((byte)(uVar16 >> 0x30) & ~(byte)((ulong)lVar38 >> 0x30),
                                   CONCAT15((byte)(uVar16 >> 0x28) & ~(byte)((ulong)lVar38 >> 0x28),
                                            CONCAT14((byte)(uVar16 >> 0x20) &
                                                     ~(byte)((ulong)lVar38 >> 0x20),
                                                     CONCAT13((byte)(uVar16 >> 0x18) &
                                                              ~(byte)((ulong)lVar38 >> 0x18),
                                                              CONCAT12((byte)(uVar16 >> 0x10) &
                                                                       ~(byte)((ulong)lVar38 >> 0x10
                                                                              ),CONCAT11((byte)(
                                                  uVar16 >> 8) & ~(byte)((ulong)lVar38 >> 8),
                                                  (byte)uVar16 & ~(byte)lVar38)))))));
        uVar17 = puVar11[9];
        uVar18 = puVar11[10];
        goto code_r0x005a47e0;
      }
      lVar41 = -(ulong)(puVar11[0xc] == 0);
      lVar42 = -(ulong)((long)*(unkbyte9 *)(puVar11 + 1) == 0);
      uVar18 = (long)*(unkbyte9 *)(puVar11 + 4) - puVar11[2];
      uVar17 = puVar11[0xf] - puVar11[0xd] >> 3;
      uVar16 = uVar18 >> 3;
      lVar14 = -(ulong)(puVar11[0x10] == 0);
      lVar38 = -(ulong)(puVar11[5] == 0);
      uVar37 = puVar11[0x13] - puVar11[0x11] >> 3;
      uVar40 = puVar11[8] - puVar11[6] >> 3;
      uVar16 = CONCAT17((byte)(puVar11[0x13] - puVar11[0x11] >> 0x3b) &
                        ~(byte)((ulong)lVar14 >> 0x38),
                        CONCAT16((byte)(uVar37 >> 0x30) & ~(byte)((ulong)lVar14 >> 0x30),
                                 CONCAT15((byte)(uVar37 >> 0x28) & ~(byte)((ulong)lVar14 >> 0x28),
                                          CONCAT14((byte)(uVar37 >> 0x20) &
                                                   ~(byte)((ulong)lVar14 >> 0x20),
                                                   CONCAT13((byte)(uVar37 >> 0x18) &
                                                            ~(byte)((ulong)lVar14 >> 0x18),
                                                            CONCAT12((byte)(uVar37 >> 0x10) &
                                                                     ~(byte)((ulong)lVar14 >> 0x10),
                                                                     CONCAT11((byte)(uVar37 >> 8) &
                                                                              ~(byte)((ulong)lVar14
                                                                                     >> 8),
                                                                              (byte)uVar37 &
                                                                              ~(byte)lVar14))))))) +
               CONCAT17((byte)(puVar11[0xf] - puVar11[0xd] >> 0x3b) & ~(byte)((ulong)lVar41 >> 0x38)
                        ,CONCAT16((byte)(uVar17 >> 0x30) & ~(byte)((ulong)lVar41 >> 0x30),
                                  CONCAT15((byte)(uVar17 >> 0x28) & ~(byte)((ulong)lVar41 >> 0x28),
                                           CONCAT14((byte)(uVar17 >> 0x20) &
                                                    ~(byte)((ulong)lVar41 >> 0x20),
                                                    CONCAT13((byte)(uVar17 >> 0x18) &
                                                             ~(byte)((ulong)lVar41 >> 0x18),
                                                             CONCAT12((byte)(uVar17 >> 0x10) &
                                                                      ~(byte)((ulong)lVar41 >> 0x10)
                                                                      ,CONCAT11((byte)(uVar17 >> 8)
                                                                                & ~(byte)((ulong)
                                                  lVar41 >> 8),(byte)uVar17 & ~(byte)lVar41))))))) +
               CONCAT17((byte)(puVar11[8] - puVar11[6] >> 0x3b) & ~(byte)((ulong)lVar38 >> 0x38),
                        CONCAT16((byte)(uVar40 >> 0x30) & ~(byte)((ulong)lVar38 >> 0x30),
                                 CONCAT15((byte)(uVar40 >> 0x28) & ~(byte)((ulong)lVar38 >> 0x28),
                                          CONCAT14((byte)(uVar40 >> 0x20) &
                                                   ~(byte)((ulong)lVar38 >> 0x20),
                                                   CONCAT13((byte)(uVar40 >> 0x18) &
                                                            ~(byte)((ulong)lVar38 >> 0x18),
                                                            CONCAT12((byte)(uVar40 >> 0x10) &
                                                                     ~(byte)((ulong)lVar38 >> 0x10),
                                                                     CONCAT11((byte)(uVar40 >> 8) &
                                                                              ~(byte)((ulong)lVar38
                                                                                     >> 8),
                                                                              (byte)uVar40 &
                                                                              ~(byte)lVar38))))))) +
               CONCAT17((byte)(uVar18 >> 0x3b) & ~(byte)((ulong)lVar42 >> 0x38),
                        CONCAT16((byte)(uVar16 >> 0x30) & ~(byte)((ulong)lVar42 >> 0x30),
                                 CONCAT15((byte)(uVar16 >> 0x28) & ~(byte)((ulong)lVar42 >> 0x28),
                                          CONCAT14((byte)(uVar16 >> 0x20) &
                                                   ~(byte)((ulong)lVar42 >> 0x20),
                                                   CONCAT13((byte)(uVar16 >> 0x18) &
                                                            ~(byte)((ulong)lVar42 >> 0x18),
                                                            CONCAT12((byte)(uVar16 >> 0x10) &
                                                                     ~(byte)((ulong)lVar42 >> 0x10),
                                                                     CONCAT11((byte)(uVar16 >> 8) &
                                                                              ~(byte)((ulong)lVar42
                                                                                     >> 8),
                                                                              (byte)uVar16 &
                                                                              ~(byte)lVar42)))))));
      puVar19 = &uStack_b8;
      uVar17 = uVar16;
    }
    else if ((puVar11[0xb] & 1) == 0) {
      uVar16 = 0;
      uVar17 = 0;
      puVar19 = &uStack_b8;
    }
    else {
      uVar18 = puVar11[0xd];
      uVar17 = puVar11[0x10];
      auVar39[9] = (char)(uVar18 >> 8);
      auVar39._0_9_ = *(unkbyte9 *)(puVar11 + 0xc);
      auVar39[10] = (char)(uVar18 >> 0x10);
      auVar39[0xb] = (char)(uVar18 >> 0x18);
      auVar39[0xc] = (char)(uVar18 >> 0x20);
      auVar39[0xd] = (char)(uVar18 >> 0x28);
      auVar39[0xe] = (char)(uVar18 >> 0x30);
      auVar39[0xf] = (char)(uVar18 >> 0x38);
      auVar6[9] = (char)(uVar17 >> 8);
      auVar6._0_9_ = *(unkbyte9 *)(puVar11 + 0xf);
      auVar6[10] = (char)(uVar17 >> 0x10);
      auVar6[0xb] = (char)(uVar17 >> 0x18);
      auVar6[0xc] = (char)(uVar17 >> 0x20);
      auVar6[0xd] = (char)(uVar17 >> 0x28);
      auVar6[0xe] = (char)(uVar17 >> 0x30);
      auVar6[0xf] = (char)(uVar17 >> 0x38);
      auVar39 = NEON_ext(auVar6,auVar39,8,1);
      lVar14 = -(ulong)(auVar39._0_8_ == 0);
      lVar38 = -(ulong)(auVar39._8_8_ == 0);
      uVar18 = puVar11[0xf] - uVar18;
      uVar17 = puVar11[0x13] - puVar11[0x11] >> 3;
      uVar16 = uVar18 >> 3;
      uVar16 = CONCAT17((byte)(puVar11[0x13] - puVar11[0x11] >> 0x3b) &
                        ~(byte)((ulong)lVar14 >> 0x38),
                        CONCAT16((byte)(uVar17 >> 0x30) & ~(byte)((ulong)lVar14 >> 0x30),
                                 CONCAT15((byte)(uVar17 >> 0x28) & ~(byte)((ulong)lVar14 >> 0x28),
                                          CONCAT14((byte)(uVar17 >> 0x20) &
                                                   ~(byte)((ulong)lVar14 >> 0x20),
                                                   CONCAT13((byte)(uVar17 >> 0x18) &
                                                            ~(byte)((ulong)lVar14 >> 0x18),
                                                            CONCAT12((byte)(uVar17 >> 0x10) &
                                                                     ~(byte)((ulong)lVar14 >> 0x10),
                                                                     CONCAT11((byte)(uVar17 >> 8) &
                                                                              ~(byte)((ulong)lVar14
                                                                                     >> 8),
                                                                              (byte)uVar17 &
                                                                              ~(byte)lVar14))))))) +
               CONCAT17((byte)(uVar18 >> 0x3b) & ~(byte)((ulong)lVar38 >> 0x38),
                        CONCAT16((byte)(uVar16 >> 0x30) & ~(byte)((ulong)lVar38 >> 0x30),
                                 CONCAT15((byte)(uVar16 >> 0x28) & ~(byte)((ulong)lVar38 >> 0x28),
                                          CONCAT14((byte)(uVar16 >> 0x20) &
                                                   ~(byte)((ulong)lVar38 >> 0x20),
                                                   CONCAT13((byte)(uVar16 >> 0x18) &
                                                            ~(byte)((ulong)lVar38 >> 0x18),
                                                            CONCAT12((byte)(uVar16 >> 0x10) &
                                                                     ~(byte)((ulong)lVar38 >> 0x10),
                                                                     CONCAT11((byte)(uVar16 >> 8) &
                                                                              ~(byte)((ulong)lVar38
                                                                                     >> 8),
                                                                              (byte)uVar16 &
                                                                              ~(byte)lVar38)))))));
      uVar17 = puVar11[0x14];
      uVar18 = puVar11[0x15];
code_r0x005a47e0:
      uVar17 = (ulong)(uVar17 == 0 || uVar18 == uVar17);
      puVar19 = &uStack_170;
    }
    uVar22 = 0;
    *puVar19 = uVar17;
    uVar17 = uVar16;
    if (uVar16 < 4) {
      uVar17 = 3;
    }
    if (0x1ffffffffffffffe < uVar16) {
code_r0x005a4a38:
      func_0x007a1f00(uVar22,unaff_x25,auVar43._8_8_);
                    /* WARNING: Does not return */
      pcVar8 = (code *)SoftwareBreakpoint(1,0x5a4a4c);
      (*pcVar8)();
    }
    lVar14 = uVar17 + 1;
    unaff_x25 = lVar14 * 8;
    if (0x7ffffffffffffff8 < unaff_x25) goto code_r0x005a4a38;
    if (unaff_x25 == 0) {
      lVar14 = 0;
      pdVar13 = &MACH_HEADER.cpusubtype;
    }
    else {
      uVar22 = 8;
      pdVar13 = (dword *)func_0x00187bd0(unaff_x25,8);
      if (pdVar13 == (dword *)0x0) goto code_r0x005a4a38;
    }
    *(long *)pdVar13 = lVar15;
    lStack_178 = 1;
    uStack_e8 = puVar11[0x11];
    uStack_d8 = puVar11[0x13];
    uStack_e0 = puVar11[0x12];
    uStack_110 = puVar11[0xc];
    uStack_100 = puVar11[0xe];
    uStack_f8 = puVar11[0xf];
    uStack_f0 = (undefined1)puVar11[0x10];
    uStack_ef = (undefined7)(puVar11[0x10] >> 8);
    uStack_c8 = puVar11[0x15];
    uStack_d0 = puVar11[0x14];
    uStack_128 = puVar11[9];
    uStack_130 = puVar11[8];
    uStack_118 = puVar11[0xb];
    uStack_120 = puVar11[10];
    uStack_108 = (undefined1)puVar11[0xd];
    uStack_107 = (undefined7)(puVar11[0xd] >> 8);
    uStack_168 = puVar11[1];
    uStack_170 = *puVar11;
    uStack_158 = puVar11[3];
    uStack_160 = puVar11[2];
    uStack_148 = puVar11[5];
    uStack_150 = puVar11[4];
    uStack_138 = puVar11[7];
    uStack_140 = puVar11[6];
    lStack_188 = lVar14;
    pdStack_180 = pdVar13;
    while( true ) {
      lVar15 = lStack_178;
      lVar14 = func_0x0059c000(&uStack_170);
      if (lVar14 == 0) break;
      if (lVar15 == lStack_188) {
        uVar25 = (undefined1)((uint7)uStack_107 >> 8);
        uVar26 = (undefined1)((uint7)uStack_107 >> 0x10);
        uVar27 = (undefined1)((uint7)uStack_107 >> 0x18);
        uVar28 = (undefined1)((uint7)uStack_107 >> 0x20);
        uVar29 = (undefined1)((uint7)uStack_107 >> 0x28);
        uVar30 = (undefined1)((uint7)uStack_107 >> 0x30);
        uVar31 = (undefined1)((uint7)uStack_ef >> 8);
        uVar32 = (undefined1)((uint7)uStack_ef >> 0x10);
        uVar33 = (undefined1)((uint7)uStack_ef >> 0x18);
        uVar34 = (undefined1)((uint7)uStack_ef >> 0x20);
        uVar35 = (undefined1)((uint7)uStack_ef >> 0x28);
        uVar36 = (undefined1)((uint7)uStack_ef >> 0x30);
        if ((int)uStack_170 == 1) {
          uVar18 = 0;
          if (uStack_168 != 0) {
            uVar18 = uStack_150 - uStack_160 >> 3;
          }
          uVar17 = 0;
          if (uStack_148 != 0) {
            uVar17 = uStack_130 - uStack_140 >> 3;
          }
          uVar17 = uVar17 + uVar18;
          bVar10 = uStack_128 == 0 || uStack_120 == uStack_128;
          if ((uStack_118 & 1) == 0) goto LAB_005a49c8;
          auVar1[8] = uStack_108;
          auVar1._0_8_ = uStack_110;
          auVar3[8] = uStack_f0;
          auVar3._0_8_ = uStack_f8;
          auVar1[9] = (char)uStack_107;
          auVar1[10] = uVar25;
          auVar1[0xb] = uVar26;
          auVar1[0xc] = uVar27;
          auVar1[0xd] = uVar28;
          auVar1[0xe] = uVar29;
          auVar1[0xf] = uVar30;
          auVar3[9] = (char)uStack_ef;
          auVar3[10] = uVar31;
          auVar3[0xb] = uVar32;
          auVar3[0xc] = uVar33;
          auVar3[0xd] = uVar34;
          auVar3[0xe] = uVar35;
          auVar3[0xf] = uVar36;
          auVar43 = NEON_ext(auVar3,auVar1,8,1);
          lVar38 = -(ulong)(auVar43._0_8_ == 0);
          lVar41 = -(ulong)(auVar43._8_8_ == 0);
          uVar16 = uStack_f8 - CONCAT71(uStack_107,uStack_108);
          uVar18 = uStack_d8 - uStack_e8 >> 3;
          uVar37 = uVar16 >> 3;
          uVar17 = CONCAT17((byte)(uStack_d8 - uStack_e8 >> 0x3b) & ~(byte)((ulong)lVar38 >> 0x38),
                            CONCAT16((byte)(uVar18 >> 0x30) & ~(byte)((ulong)lVar38 >> 0x30),
                                     CONCAT15((byte)(uVar18 >> 0x28) &
                                              ~(byte)((ulong)lVar38 >> 0x28),
                                              CONCAT14((byte)(uVar18 >> 0x20) &
                                                       ~(byte)((ulong)lVar38 >> 0x20),
                                                       CONCAT13((byte)(uVar18 >> 0x18) &
                                                                ~(byte)((ulong)lVar38 >> 0x18),
                                                                CONCAT12((byte)(uVar18 >> 0x10) &
                                                                         ~(byte)((ulong)lVar38 >>
                                                                                0x10),
                                                                         CONCAT11((byte)(uVar18 >> 8
                                                                                        ) & ~(byte)(
                                                  (ulong)lVar38 >> 8),(byte)uVar18 & ~(byte)lVar38))
                                                  ))))) +
                   CONCAT17((byte)(uVar16 >> 0x3b) & ~(byte)((ulong)lVar41 >> 0x38),
                            CONCAT16((byte)(uVar37 >> 0x30) & ~(byte)((ulong)lVar41 >> 0x30),
                                     CONCAT15((byte)(uVar37 >> 0x28) &
                                              ~(byte)((ulong)lVar41 >> 0x28),
                                              CONCAT14((byte)(uVar37 >> 0x20) &
                                                       ~(byte)((ulong)lVar41 >> 0x20),
                                                       CONCAT13((byte)(uVar37 >> 0x18) &
                                                                ~(byte)((ulong)lVar41 >> 0x18),
                                                                CONCAT12((byte)(uVar37 >> 0x10) &
                                                                         ~(byte)((ulong)lVar41 >>
                                                                                0x10),
                                                                         CONCAT11((byte)(uVar37 >> 8
                                                                                        ) & ~(byte)(
                                                  (ulong)lVar41 >> 8),(byte)uVar37 & ~(byte)lVar41))
                                                  ))))) + uVar17;
          puVar11 = &uStack_c0;
          uVar18 = uVar17;
        }
        else if ((uStack_118 & 1) == 0) {
          uVar17 = 0;
          uVar18 = 0;
          puVar11 = &uStack_c0;
        }
        else {
          auVar43[8] = uStack_108;
          auVar43._0_8_ = uStack_110;
          auVar4[8] = uStack_f0;
          auVar4._0_8_ = uStack_f8;
          auVar43[9] = (char)uStack_107;
          auVar43[10] = uVar25;
          auVar43[0xb] = uVar26;
          auVar43[0xc] = uVar27;
          auVar43[0xd] = uVar28;
          auVar43[0xe] = uVar29;
          auVar43[0xf] = uVar30;
          auVar4[9] = (char)uStack_ef;
          auVar4[10] = uVar31;
          auVar4[0xb] = uVar32;
          auVar4[0xc] = uVar33;
          auVar4[0xd] = uVar34;
          auVar4[0xe] = uVar35;
          auVar4[0xf] = uVar36;
          auVar43 = NEON_ext(auVar4,auVar43,8,1);
          lVar38 = -(ulong)(auVar43._0_8_ == 0);
          lVar41 = -(ulong)(auVar43._8_8_ == 0);
          uVar18 = uStack_f8 - CONCAT71(uStack_107,uStack_108);
          uVar17 = uStack_d8 - uStack_e8 >> 3;
          uVar16 = uVar18 >> 3;
          uVar17 = CONCAT17((byte)(uStack_d8 - uStack_e8 >> 0x3b) & ~(byte)((ulong)lVar38 >> 0x38),
                            CONCAT16((byte)(uVar17 >> 0x30) & ~(byte)((ulong)lVar38 >> 0x30),
                                     CONCAT15((byte)(uVar17 >> 0x28) &
                                              ~(byte)((ulong)lVar38 >> 0x28),
                                              CONCAT14((byte)(uVar17 >> 0x20) &
                                                       ~(byte)((ulong)lVar38 >> 0x20),
                                                       CONCAT13((byte)(uVar17 >> 0x18) &
                                                                ~(byte)((ulong)lVar38 >> 0x18),
                                                                CONCAT12((byte)(uVar17 >> 0x10) &
                                                                         ~(byte)((ulong)lVar38 >>
                                                                                0x10),
                                                                         CONCAT11((byte)(uVar17 >> 8
                                                                                        ) & ~(byte)(
                                                  (ulong)lVar38 >> 8),(byte)uVar17 & ~(byte)lVar38))
                                                  ))))) +
                   CONCAT17((byte)(uVar18 >> 0x3b) & ~(byte)((ulong)lVar41 >> 0x38),
                            CONCAT16((byte)(uVar16 >> 0x30) & ~(byte)((ulong)lVar41 >> 0x30),
                                     CONCAT15((byte)(uVar16 >> 0x28) &
                                              ~(byte)((ulong)lVar41 >> 0x28),
                                              CONCAT14((byte)(uVar16 >> 0x20) &
                                                       ~(byte)((ulong)lVar41 >> 0x20),
                                                       CONCAT13((byte)(uVar16 >> 0x18) &
                                                                ~(byte)((ulong)lVar41 >> 0x18),
                                                                CONCAT12((byte)(uVar16 >> 0x10) &
                                                                         ~(byte)((ulong)lVar41 >>
                                                                                0x10),
                                                                         CONCAT11((byte)(uVar16 >> 8
                                                                                        ) & ~(byte)(
                                                  (ulong)lVar41 >> 8),(byte)uVar16 & ~(byte)lVar41))
                                                  )))));
          bVar10 = uStack_d0 == 0 || uStack_c8 == uStack_d0;
LAB_005a49c8:
          uVar18 = (ulong)bVar10;
          puVar11 = &uStack_b8;
        }
        *puVar11 = uVar18;
        func_0x007af5a0(&lStack_188,lVar15,uVar17 + 1,8,8);
        pdVar13 = pdStack_180;
      }
      *(long *)(pdVar13 + lVar15 * 2) = lVar14;
      lStack_178 = lVar15 + 1;
    }
    puVar11 = &uStack_170;
    plVar20 = (long *)0x0;
    puVar9 = auStack_190;
    puVar12 = extraout_x8_00;
    pppppppuVar23 = &pppppppuStack_60;
    puVar24 = &UNK_005a4a08;
  }
  *(long **)(puVar9 + -0x20) = plVar20;
  *(undefined8 **)(puVar9 + -0x18) = puVar12;
  *(undefined8 ********)(puVar9 + -0x10) = pppppppuVar23;
  *(undefined **)(puVar9 + -8) = puVar24;
  unaff_x29 = (undefined8 *******)(puVar9 + -0x10);
  if (*puVar11 != 0) {
    puVar12 = (undefined8 *)puVar11[1];
    if ((puVar12 != (undefined8 *)0x0) && (puVar11[3] != 0)) {
      lVar15 = puVar11[3] << 3;
      puVar24 = &UNK_0059e090;
      puVar9 = puVar9 + -0x20;
      goto code_r0x00187bd4;
    }
    if ((puVar11[5] != 0) && (puVar11[7] != 0)) {
      func_0x00187bd4(puVar11[5],puVar11[7] << 3,8);
    }
  }
  if (puVar11[0xb] == 0) {
    return;
  }
  puVar12 = (undefined8 *)puVar11[0xc];
  if ((puVar12 == (undefined8 *)0x0) || (puVar11[0xe] == 0)) {
    puVar12 = (undefined8 *)puVar11[0x10];
    if (puVar12 == (undefined8 *)0x0) {
      return;
    }
    if (puVar11[0x12] == 0) {
      return;
    }
    lVar15 = puVar11[0x12] << 3;
    unaff_x29 = *(undefined8 ********)(puVar9 + -0x10);
    puVar24 = *(undefined **)(puVar9 + -8);
  }
  else {
    lVar15 = puVar11[0xe] << 3;
    puVar24 = &UNK_0059e0d0;
    puVar9 = puVar9 + -0x20;
  }
code_r0x00187bd4:
  *(undefined8 ********)(puVar9 + -0x10) = unaff_x29;
  *(undefined **)(puVar9 + -8) = puVar24;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(puVar12,lVar15,8);
  return;
}

