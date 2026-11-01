
/* WARNING: Removing unreachable block (ram,0x004c4fc4) */
/* WARNING: Removing unreachable block (ram,0x004c4fcc) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint FUN_004c3338(long param_1)

{
  char cVar1;
  uint uVar2;
  code *pcVar3;
  bool bVar4;
  undefined8 *puVar5;
  dword *pdVar6;
  undefined *puVar7;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  undefined8 extraout_x1_02;
  undefined8 extraout_x1_03;
  undefined8 extraout_x1_04;
  undefined8 extraout_x1_05;
  undefined8 extraout_x1_06;
  undefined8 extraout_x1_07;
  undefined8 extraout_x1_08;
  undefined8 extraout_x1_09;
  undefined8 extraout_x1_10;
  undefined8 extraout_x1_11;
  undefined8 extraout_x1_12;
  ulong uVar8;
  byte bVar9;
  int *piVar10;
  long lVar11;
  dword *in_x9;
  long *plVar12;
  undefined1 *puVar13;
  undefined1 *in_x11;
  ulong uVar14;
  undefined1 *puVar15;
  int iVar16;
  ulong uVar17;
  ulong uVar18;
  long lVar19;
  int iVar20;
  ulong uVar21;
  ulong uVar22;
  bool bVar23;
  ulong uVar24;
  long unaff_x19;
  dword dVar25;
  ulong unaff_x20;
  uint uVar26;
  long unaff_x23;
  ulong unaff_x25;
  long lVar27;
  char *pcVar28;
  long *unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 in_xzr;
  byte bVar30;
  byte bVar31;
  byte bVar32;
  byte bVar33;
  byte bVar34;
  long lVar29;
  long *plVar35;
  long *plVar36;
  long lVar37;
  byte bVar38;
  undefined8 uVar39;
  byte bVar40;
  byte bVar41;
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [12];
  undefined *in_stack_00000000;
  undefined *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  dword *in_stack_00000048;
  undefined8 in_stack_00000060;
  ulong in_stack_00000068;
  dword in_stack_00000070;
  dword *in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  undefined8 in_stack_00000098;
  ulong in_stack_000000a0;
  long in_stack_000000a8;
  ulong in_stack_000000b0;
  long in_stack_000000b8;
  ulong in_stack_000000c0;
  int in_stack_000000c8;
  ulong in_stack_000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  long in_stack_000000f0;
  undefined8 in_stack_000000f8;
  ulong in_stack_00000100;
  undefined8 in_stack_00000118;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined8 in_stack_00000138;
  long in_stack_000001a0;
  undefined8 in_stack_000001a8;
  long in_stack_000001f0;
  dword *in_stack_000001f8;
  long in_stack_00000410;
  int *in_stack_00000418;
  dword dVar45;
  long in_stack_00000420;
  long in_stack_00000530;
  ulong in_stack_00000538;
  long in_stack_00000548;
  ulong in_stack_00000550;
  long in_stack_00000670;
  dword *in_stack_00000678;
  ulong in_stack_00000680;
  uint uVar46;
  int iVar47;
  long in_stack_00000688;
  undefined8 in_stack_00000690;
  int iVar48;
  undefined8 in_stack_00000698;
  undefined8 in_stack_000006a0;
  undefined8 in_stack_000006a8;
  undefined1 auStack_7ffffffe [6];
  undefined8 auStack_7ffffff8 [268435455];
  
code_r0x004c3338:
  iVar47 = (int)in_stack_00000688;
  uVar26 = (uint)(in_stack_00000680 >> 0x20);
  iVar48 = (int)in_stack_000000b0;
  dVar45 = (dword)in_stack_000000a0;
  if (in_stack_00000088 == 0) {
    puVar15 = (undefined1 *)(ulong)uVar26;
    do {
      for (; in_x11 < in_x9;
          in_x11 = (undefined1 *)(ulong)*(uint *)(param_1 + (long)in_x11 * unaff_x19 + 0x20)) {
      }
      do {
        if (in_x9 <= puVar15) goto LAB_004c3920;
        lVar19 = param_1 + (long)puVar15 * unaff_x19;
        puVar15 = (undefined1 *)(ulong)*(uint *)(lVar19 + 0x24);
      } while (*(int *)(lVar19 + 0x28) == iVar47);
    } while( true );
  }
  uVar14 = (in_stack_000000a0 | 0x400000000000000) ^ in_stack_00000068;
  uVar17 = uVar14 + in_stack_000000e8 ^ (uVar14 >> 0x30 | uVar14 << 0x10);
  uVar14 = uVar14 + in_stack_000000d8;
  uVar21 = uVar14 ^ in_stack_000000d0;
  uVar18 = uVar17 + in_stack_000000e0 ^ (uVar17 >> 0x2b | uVar17 << 0x15);
  uVar17 = (uVar17 + in_stack_000000e0 ^ (in_stack_000000a0 | 0x400000000000000)) + uVar21;
  uVar22 = uVar17 ^ (uVar21 >> 0x33 | uVar21 << 0xd);
  uVar14 = ((uVar14 >> 0x20 | uVar14 << 0x20) ^ 0xff) + uVar18;
  uVar21 = uVar22 + uVar14;
  uVar14 = uVar14 ^ (uVar18 >> 0x30 | uVar18 << 0x10);
  uVar22 = uVar21 ^ (uVar22 >> 0x2f | uVar22 << 0x11);
  uVar17 = uVar14 + (uVar17 >> 0x20 | uVar17 << 0x20);
  uVar18 = uVar22 + uVar17;
  uVar17 = uVar17 ^ (uVar14 >> 0x2b | uVar14 << 0x15);
  uVar22 = uVar18 ^ (uVar22 >> 0x33 | uVar22 << 0xd);
  uVar14 = uVar17 + (uVar21 >> 0x20 | uVar21 << 0x20);
  uVar21 = uVar22 + uVar14;
  uVar14 = uVar14 ^ (uVar17 >> 0x30 | uVar17 << 0x10);
  uVar22 = uVar21 ^ (uVar22 >> 0x2f | uVar22 << 0x11);
  uVar17 = uVar14 + (uVar18 >> 0x20 | uVar18 << 0x20);
  uVar18 = uVar17 ^ (uVar14 >> 0x2b | uVar14 << 0x15);
  uVar22 = uVar22 + uVar17 ^ (uVar22 >> 0x33 | uVar22 << 0xd);
  uVar14 = uVar18 + (uVar21 >> 0x20 | uVar21 << 0x20);
  uVar17 = uVar22 + uVar14;
  uVar14 = uVar14 ^ (uVar18 >> 0x30 | uVar18 << 0x10);
  uVar17 = (uVar22 >> 0x2f | uVar22 << 0x11) ^ (uVar14 >> 0x2b | uVar14 << 0x15) ^
           (uVar17 >> 0x20 | uVar17 << 0x20) ^ uVar17;
  bVar9 = (byte)(uVar17 >> 0x39);
  puVar15 = (undefined1 *)(ulong)uVar26;
LAB_004c3408:
  do {
    if (in_x11 < in_x9) {
      lVar19 = param_1 + (long)in_x11 * unaff_x19;
      in_x11 = (undefined1 *)(ulong)*(uint *)(lVar19 + 0x20);
      iVar16 = *(int *)(lVar19 + 0x2c);
    }
    else {
      do {
        if (in_x9 <= puVar15) goto LAB_004c3920;
        lVar19 = param_1 + (long)puVar15 * unaff_x19;
        puVar15 = (undefined1 *)(ulong)*(uint *)(lVar19 + 0x24);
        iVar16 = *(int *)(lVar19 + 0x28);
      } while (iVar16 == iVar47);
    }
    if (iVar16 != iVar48) {
      lVar19 = 0;
      uVar14 = uVar17;
      while( true ) {
        uVar14 = uVar14 & in_stack_00000100;
        uVar39 = *(undefined8 *)(in_stack_000000f0 + uVar14);
        bVar38 = (byte)((ulong)uVar39 >> 8);
        bVar40 = (byte)((ulong)uVar39 >> 0x10);
        bVar30 = (byte)((ulong)uVar39 >> 0x18);
        bVar31 = (byte)((ulong)uVar39 >> 0x20);
        bVar32 = (byte)((ulong)uVar39 >> 0x28);
        bVar33 = (byte)((ulong)uVar39 >> 0x30);
        bVar34 = (byte)((ulong)uVar39 >> 0x38);
        for (uVar21 = CONCAT17(-(bVar34 == bVar9),
                               CONCAT16(-(bVar33 == bVar9),
                                        CONCAT15(-(bVar32 == bVar9),
                                                 CONCAT14(-(bVar31 == bVar9),
                                                          CONCAT13(-(bVar30 == bVar9),
                                                                   CONCAT12(-(bVar40 == bVar9),
                                                                            CONCAT11(-(bVar38 ==
                                                                                      bVar9),-((byte
                                                  )uVar39 == bVar9)))))))) & 0x8080808080808080;
            uVar21 != 0; uVar21 = uVar21 - 1 & uVar21) {
          uVar18 = (uVar21 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar21 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
          if (dVar45 == *(dword *)(in_stack_000000b8 +
                                  (uVar14 + ((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3) &
                                  in_stack_00000100) * -8)) {
            uVar14 = in_stack_000000a0;
            goto LAB_004c3568;
          }
        }
        bVar38 = NEON_umaxv(CONCAT17(-(bVar34 == 0xff),
                                     CONCAT16(-(bVar33 == 0xff),
                                              CONCAT15(-(bVar32 == 0xff),
                                                       CONCAT14(-(bVar31 == 0xff),
                                                                CONCAT13(-(bVar30 == 0xff),
                                                                         CONCAT12(-(bVar40 == 0xff),
                                                                                  CONCAT11(-(bVar38 
                                                  == 0xff),-((byte)uVar39 == 0xff)))))))),1);
        if ((bVar38 & 1) != 0) break;
        lVar19 = lVar19 + 8;
        uVar14 = uVar14 + lVar19;
      }
    }
  } while( true );
LAB_004c3920:
  bVar4 = true;
LAB_004c3924:
  func_0x0058485c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,unaff_x25);
  puVar13 = (undefined1 *)(in_stack_00000680 & 0xffffffff);
  puVar15 = (undefined1 *)(ulong)uVar26;
  dVar25 = (dword)unaff_x20;
  if (in_stack_00000088 == 0) {
    do {
      for (; puVar13 < in_stack_00000678;
          puVar13 = (undefined1 *)
                    (ulong)*(uint *)(in_stack_00000670 + (long)puVar13 * unaff_x19 + 0x20)) {
      }
      do {
        if (in_stack_00000678 <= puVar15) goto LAB_004c3d4c;
        lVar19 = in_stack_00000670 + (long)puVar15 * unaff_x19;
        puVar15 = (undefined1 *)(ulong)*(uint *)(lVar19 + 0x24);
      } while (*(int *)(lVar19 + 0x28) == iVar47);
    } while( true );
  }
  uVar14 = (unaff_x20 | 0x400000000000000) ^ in_stack_00000068;
  uVar17 = uVar14 + in_stack_000000e8 ^ (uVar14 >> 0x30 | uVar14 << 0x10);
  uVar14 = uVar14 + in_stack_000000d8;
  uVar21 = uVar14 ^ in_stack_000000d0;
  uVar18 = uVar17 + in_stack_000000e0 ^ (uVar17 >> 0x2b | uVar17 << 0x15);
  uVar17 = (uVar17 + in_stack_000000e0 ^ (unaff_x20 | 0x400000000000000)) + uVar21;
  uVar22 = uVar17 ^ (uVar21 >> 0x33 | uVar21 << 0xd);
  uVar14 = ((uVar14 >> 0x20 | uVar14 << 0x20) ^ 0xff) + uVar18;
  uVar21 = uVar22 + uVar14;
  uVar14 = uVar14 ^ (uVar18 >> 0x30 | uVar18 << 0x10);
  uVar22 = uVar21 ^ (uVar22 >> 0x2f | uVar22 << 0x11);
  uVar17 = uVar14 + (uVar17 >> 0x20 | uVar17 << 0x20);
  uVar18 = uVar22 + uVar17;
  uVar17 = uVar17 ^ (uVar14 >> 0x2b | uVar14 << 0x15);
  uVar22 = uVar18 ^ (uVar22 >> 0x33 | uVar22 << 0xd);
  uVar14 = uVar17 + (uVar21 >> 0x20 | uVar21 << 0x20);
  uVar21 = uVar22 + uVar14;
  uVar14 = uVar14 ^ (uVar17 >> 0x30 | uVar17 << 0x10);
  uVar22 = uVar21 ^ (uVar22 >> 0x2f | uVar22 << 0x11);
  uVar17 = uVar14 + (uVar18 >> 0x20 | uVar18 << 0x20);
  uVar18 = uVar17 ^ (uVar14 >> 0x2b | uVar14 << 0x15);
  uVar22 = uVar22 + uVar17 ^ (uVar22 >> 0x33 | uVar22 << 0xd);
  uVar14 = uVar18 + (uVar21 >> 0x20 | uVar21 << 0x20);
  uVar17 = uVar22 + uVar14;
  uVar14 = uVar14 ^ (uVar18 >> 0x30 | uVar18 << 0x10);
  uVar17 = (uVar22 >> 0x2f | uVar22 << 0x11) ^ (uVar14 >> 0x2b | uVar14 << 0x15) ^
           (uVar17 >> 0x20 | uVar17 << 0x20) ^ uVar17;
  bVar9 = (byte)(uVar17 >> 0x39);
LAB_004c3a0c:
  do {
    if (puVar13 < in_stack_00000678) {
      lVar19 = in_stack_00000670 + (long)puVar13 * unaff_x19;
      puVar13 = (undefined1 *)(ulong)*(uint *)(lVar19 + 0x20);
      iVar16 = *(int *)(lVar19 + 0x2c);
    }
    else {
      do {
        if (in_stack_00000678 <= puVar15) goto LAB_004c3d4c;
        lVar19 = in_stack_00000670 + (long)puVar15 * unaff_x19;
        puVar15 = (undefined1 *)(ulong)*(uint *)(lVar19 + 0x24);
        iVar16 = *(int *)(lVar19 + 0x28);
      } while (iVar16 == iVar47);
    }
    if (iVar16 != iVar48) {
      lVar19 = 0;
      uVar14 = uVar17;
      while( true ) {
        uVar14 = uVar14 & in_stack_00000100;
        uVar39 = *(undefined8 *)(in_stack_000000f0 + uVar14);
        bVar38 = (byte)((ulong)uVar39 >> 8);
        bVar40 = (byte)((ulong)uVar39 >> 0x10);
        bVar30 = (byte)((ulong)uVar39 >> 0x18);
        bVar31 = (byte)((ulong)uVar39 >> 0x20);
        bVar32 = (byte)((ulong)uVar39 >> 0x28);
        bVar33 = (byte)((ulong)uVar39 >> 0x30);
        bVar34 = (byte)((ulong)uVar39 >> 0x38);
        for (uVar21 = CONCAT17(-(bVar34 == bVar9),
                               CONCAT16(-(bVar33 == bVar9),
                                        CONCAT15(-(bVar32 == bVar9),
                                                 CONCAT14(-(bVar31 == bVar9),
                                                          CONCAT13(-(bVar30 == bVar9),
                                                                   CONCAT12(-(bVar40 == bVar9),
                                                                            CONCAT11(-(bVar38 ==
                                                                                      bVar9),-((byte
                                                  )uVar39 == bVar9)))))))) & 0x8080808080808080;
            uVar21 != 0; uVar21 = uVar21 - 1 & uVar21) {
          uVar18 = (uVar21 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar21 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
          if (dVar25 == *(dword *)(in_stack_000000b8 +
                                  (uVar14 + ((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3) &
                                  in_stack_00000100) * -8)) {
            uVar14 = unaff_x20;
            goto LAB_004c3b60;
          }
        }
        bVar38 = NEON_umaxv(CONCAT17(-(bVar34 == 0xff),
                                     CONCAT16(-(bVar33 == 0xff),
                                              CONCAT15(-(bVar32 == 0xff),
                                                       CONCAT14(-(bVar31 == 0xff),
                                                                CONCAT13(-(bVar30 == 0xff),
                                                                         CONCAT12(-(bVar40 == 0xff),
                                                                                  CONCAT11(-(bVar38 
                                                  == 0xff),-((byte)uVar39 == 0xff)))))))),1);
        if ((bVar38 & 1) != 0) break;
        lVar19 = lVar19 + 8;
        uVar14 = uVar14 + lVar19;
      }
    }
  } while( true );
LAB_004c3568:
  do {
    iVar20 = (int)uVar14;
    if (iVar20 == in_stack_000000c8) {
      if (in_stack_000000c8 == iVar16) {
LAB_004c3650:
        bVar4 = false;
        goto LAB_004c3924;
      }
      break;
    }
    lVar19 = 0;
    uVar21 = uVar14 & 0xffffffff ^ in_stack_000000c0;
    uVar18 = uVar21 + in_stack_000000e8 ^ (in_stack_000000c0 >> 0x30 | uVar21 << 0x10);
    uVar21 = uVar21 + in_stack_000000d8;
    uVar8 = uVar21 ^ in_stack_000000d0;
    uVar22 = uVar18 + in_stack_000000e0 ^ (uVar18 >> 0x2b | uVar18 << 0x15);
    uVar14 = (uVar18 + in_stack_000000e0 ^ (uVar14 & 0xffffffff | 0x400000000000000)) + uVar8;
    uVar8 = uVar14 ^ (uVar8 >> 0x33 | uVar8 << 0xd);
    uVar21 = ((uVar21 >> 0x20 | uVar21 << 0x20) ^ 0xff) + uVar22;
    uVar18 = uVar8 + uVar21;
    uVar21 = uVar21 ^ (uVar22 >> 0x30 | uVar22 << 0x10);
    uVar8 = uVar18 ^ (uVar8 >> 0x2f | uVar8 << 0x11);
    uVar14 = uVar21 + (uVar14 >> 0x20 | uVar14 << 0x20);
    uVar22 = uVar8 + uVar14;
    uVar14 = uVar14 ^ (uVar21 >> 0x2b | uVar21 << 0x15);
    uVar8 = uVar22 ^ (uVar8 >> 0x33 | uVar8 << 0xd);
    uVar21 = uVar14 + (uVar18 >> 0x20 | uVar18 << 0x20);
    uVar18 = uVar8 + uVar21;
    uVar21 = uVar21 ^ (uVar14 >> 0x30 | uVar14 << 0x10);
    uVar8 = uVar18 ^ (uVar8 >> 0x2f | uVar8 << 0x11);
    uVar14 = uVar21 + (uVar22 >> 0x20 | uVar22 << 0x20);
    uVar24 = uVar14 ^ (uVar21 >> 0x2b | uVar21 << 0x15);
    uVar22 = uVar8 + uVar14 ^ (uVar8 >> 0x33 | uVar8 << 0xd);
    uVar21 = uVar24 + (uVar18 >> 0x20 | uVar18 << 0x20);
    uVar14 = uVar22 + uVar21;
    uVar21 = uVar21 ^ (uVar24 >> 0x30 | uVar24 << 0x10);
    uVar14 = (uVar22 >> 0x2f | uVar22 << 0x11) ^ (uVar21 >> 0x2b | uVar21 << 0x15) ^
             (uVar14 >> 0x20 | uVar14 << 0x20) ^ uVar14;
    bVar38 = (byte)(uVar14 >> 0x39);
    while( true ) {
      uVar14 = uVar14 & in_stack_00000100;
      uVar39 = *(undefined8 *)(in_stack_000000f0 + uVar14);
      bVar40 = (byte)((ulong)uVar39 >> 8);
      bVar30 = (byte)((ulong)uVar39 >> 0x10);
      bVar31 = (byte)((ulong)uVar39 >> 0x18);
      bVar32 = (byte)((ulong)uVar39 >> 0x20);
      bVar33 = (byte)((ulong)uVar39 >> 0x28);
      bVar34 = (byte)((ulong)uVar39 >> 0x30);
      bVar41 = (byte)((ulong)uVar39 >> 0x38);
      for (uVar21 = CONCAT17(-(bVar41 == bVar38),
                             CONCAT16(-(bVar34 == bVar38),
                                      CONCAT15(-(bVar33 == bVar38),
                                               CONCAT14(-(bVar32 == bVar38),
                                                        CONCAT13(-(bVar31 == bVar38),
                                                                 CONCAT12(-(bVar30 == bVar38),
                                                                          CONCAT11(-(bVar40 ==
                                                                                    bVar38),-((byte)
                                                  uVar39 == bVar38)))))))) & 0x8080808080808080;
          uVar21 != 0; uVar21 = uVar21 - 1 & uVar21) {
        uVar18 = (uVar21 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar21 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
        uVar18 = uVar14 + ((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3) & in_stack_00000100
        ;
        if (iVar20 == *(int *)(in_stack_000000b8 + uVar18 * -8)) {
          uVar14 = (ulong)*(uint *)(in_stack_000000a8 + uVar18 * -8);
          bVar4 = true;
          goto joined_r0x004c355c;
        }
      }
      bVar40 = NEON_umaxv(CONCAT17(-(bVar41 == 0xff),
                                   CONCAT16(-(bVar34 == 0xff),
                                            CONCAT15(-(bVar33 == 0xff),
                                                     CONCAT14(-(bVar32 == 0xff),
                                                              CONCAT13(-(bVar31 == 0xff),
                                                                       CONCAT12(-(bVar30 == 0xff),
                                                                                CONCAT11(-(bVar40 ==
                                                                                          0xff),-((
                                                  byte)uVar39 == 0xff)))))))),1);
      if ((bVar40 & 1) != 0) break;
      lVar19 = lVar19 + 8;
      uVar14 = uVar14 + lVar19;
    }
    bVar4 = false;
joined_r0x004c355c:
    if (iVar20 == iVar16) goto LAB_004c3650;
  } while (bVar4);
  goto LAB_004c3408;
LAB_004c3d4c:
  bVar23 = true;
LAB_004c3d50:
  func_0x00584800(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,unaff_x25);
  func_0x004d0228(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x8000066e,&UNK_009e5910);
  auVar42 = func_0x005847cc(in_stack_000000f8,in_stack_000000b0);
  uVar39 = auVar42._8_8_;
  lVar19 = auVar42._0_8_;
  if (lVar19 == 0) {
LAB_004c54fc:
    func_0x007a23bc(in_stack_00000008);
    goto LAB_004c5940;
  }
  if ((*(long *)(lVar19 + 0x10) == 0) ||
     (lVar19 = *(long *)(lVar19 + 8) + *(long *)(lVar19 + 0x10) * 0x108, lVar19 == 0x108)) {
    in_stack_00000008 = &UNK_009e5f10;
    goto LAB_004c54fc;
  }
  plVar12 = (long *)(lVar19 + -0xe8);
  if (plVar12 == (long *)0x0 || *(long *)(lVar19 + -0xf0) != 0x10) {
    uVar26 = 0;
    goto LAB_004c43c8;
  }
  if (dVar45 == (dword)unaff_x25) {
    lVar11 = in_stack_00000420 << 2;
    piVar10 = in_stack_00000418;
    do {
      if (lVar11 == 0) {
        if (!bVar4) {
          in_stack_00000688 = func_0x00187bd0(0x108,8);
          uVar39 = 0x108;
          if (in_stack_00000688 == 0) goto LAB_004c4fe0;
          *(undefined8 *)(in_stack_00000688 + 0x18) = 0x1c;
          auVar42 = func_0x00187bd0(0x28,8);
          plVar35 = auVar42._0_8_;
          if (plVar35 == (long *)0x0) {
            func_0x007a1f18(8,0x28);
            goto LAB_004c5940;
          }
          plVar35[1] = (long)in_stack_00000048;
          *plVar35 = in_stack_00000040;
          plVar35[3] = in_stack_00000688;
          plVar35[2] = 1;
          plVar35[4] = 1;
          puVar5 = (undefined8 *)(lVar19 + -0xa8);
          lVar11 = *(long *)*puVar5;
          *(long *)*puVar5 = lVar11 + -1;
          LORelease();
          if (lVar11 == 1) {
            in_xzr = *(undefined8 *)*puVar5;
            func_0x005d2c74(puVar5);
            auVar42._8_8_ = extraout_x1_00;
            auVar42._0_8_ = plVar35;
          }
          goto LAB_004c3f5c;
        }
        break;
      }
      iVar47 = *piVar10;
      lVar11 = lVar11 + -4;
      piVar10 = piVar10 + 1;
    } while (iVar47 != iVar48);
  }
  uVar26 = 0;
  if (dVar45 == in_stack_00000070) {
    uVar26 = in_stack_00000060._4_4_;
  }
  if ((uVar26 & 1) == 0) {
    uVar26 = 0;
  }
  else {
    in_stack_00000688 = func_0x00187bd0(0x108,8);
    uVar39 = 0x108;
    if (in_stack_00000688 == 0) goto LAB_004c4fe0;
    *(undefined8 *)(in_stack_00000688 + 0x18) = 0x1d;
    auVar42 = func_0x00187bd0(0x28,8);
    plVar35 = auVar42._0_8_;
    if (plVar35 == (long *)0x0) {
      func_0x007a1f18(8,0x28);
      goto LAB_004c5940;
    }
    plVar35[1] = (long)in_stack_00000048;
    *plVar35 = in_stack_00000040;
    plVar35[3] = in_stack_00000688;
    plVar35[2] = 1;
    plVar35[4] = 1;
    puVar5 = (undefined8 *)(lVar19 + -0xa8);
    lVar11 = *(long *)*puVar5;
    *(long *)*puVar5 = lVar11 + -1;
    LORelease();
    if (lVar11 == 1) {
      in_xzr = *(undefined8 *)*puVar5;
      func_0x005d2c74(puVar5);
      auVar42._8_8_ = extraout_x1;
      auVar42._0_8_ = plVar35;
    }
LAB_004c3f5c:
    uVar39 = auVar42._8_8_;
    in_stack_00000690 = 1;
    in_stack_00000680 = 1;
    *(long *)(lVar19 + -0xa8) = auVar42._0_8_;
    uVar26 = 1;
    in_stack_00000670 = in_stack_00000040;
    in_stack_00000678 = in_stack_00000048;
  }
  if (dVar25 == (dword)unaff_x25) {
    lVar11 = in_stack_00000420 << 2;
    piVar10 = in_stack_00000418;
    do {
      if (lVar11 == 0) {
        if (!bVar23) {
          in_stack_00000688 = func_0x00187bd0(0x108,8);
          uVar39 = 0x108;
          if (in_stack_00000688 == 0) goto LAB_004c4fe0;
          *(undefined8 *)(in_stack_00000688 + 0x18) = 0x1c;
          auVar43 = func_0x00187bd0(0x28,8);
          plVar35 = auVar43._0_8_;
          if (plVar35 == (long *)0x0) {
            func_0x007a1f18(8,0x28);
            goto LAB_004c5940;
          }
          plVar35[1] = (long)in_stack_00000048;
          *plVar35 = in_stack_00000040;
          plVar35[3] = in_stack_00000688;
          plVar35[2] = 1;
          plVar35[4] = 1;
          puVar5 = (undefined8 *)(lVar19 + -0xa0);
          lVar11 = *(long *)*puVar5;
          *(long *)*puVar5 = lVar11 + -1;
          LORelease();
          if (lVar11 == 1) {
            in_xzr = *(undefined8 *)*puVar5;
            func_0x005d2c74(puVar5);
            auVar43._8_8_ = extraout_x1_02;
            auVar43._0_8_ = plVar35;
          }
          goto code_r0x004c40dc;
        }
        break;
      }
      iVar47 = *piVar10;
      lVar11 = lVar11 + -4;
      piVar10 = piVar10 + 1;
    } while (iVar47 != iVar48);
  }
  uVar46 = 0;
  if (dVar25 == in_stack_00000070) {
    uVar46 = in_stack_00000060._4_4_;
  }
  if ((uVar46 & 1) != 0) {
    in_stack_00000688 = func_0x00187bd0(0x108,8);
    uVar39 = 0x108;
    if (in_stack_00000688 == 0) goto LAB_004c4fe0;
    *(undefined8 *)(in_stack_00000688 + 0x18) = 0x1d;
    auVar43 = func_0x00187bd0(0x28,8);
    plVar35 = auVar43._0_8_;
    if (plVar35 == (long *)0x0) {
      func_0x007a1f18(8,0x28);
      goto LAB_004c5940;
    }
    plVar35[1] = (long)in_stack_00000048;
    *plVar35 = in_stack_00000040;
    plVar35[3] = in_stack_00000688;
    plVar35[2] = 1;
    plVar35[4] = 1;
    puVar5 = (undefined8 *)(lVar19 + -0xa0);
    lVar11 = *(long *)*puVar5;
    *(long *)*puVar5 = lVar11 + -1;
    LORelease();
    if (lVar11 == 1) {
      in_xzr = *(undefined8 *)*puVar5;
      func_0x005d2c74(puVar5);
      auVar43._8_8_ = extraout_x1_01;
      auVar43._0_8_ = plVar35;
    }
code_r0x004c40dc:
    uVar39 = auVar43._8_8_;
    in_stack_00000690 = 1;
    in_stack_00000680 = 1;
    *(long *)(lVar19 + -0xa0) = auVar43._0_8_;
    uVar26 = 1;
    in_stack_00000670 = in_stack_00000040;
    in_stack_00000678 = in_stack_00000048;
  }
  lVar11 = *(long *)(lVar19 + -0xa8);
  pcVar28 = (char *)(lVar11 + 8);
  if (*pcVar28 == '\0') {
    *pcVar28 = '\x01';
  }
  else {
    func_0x007aff64(pcVar28,uVar39,1000000000);
    uVar39 = extraout_x1_03;
  }
  cVar1 = *pcVar28;
  if (cVar1 == '\x01') {
    *pcVar28 = (char)in_xzr;
  }
  bVar4 = cVar1 == '\x01';
  if (*(long *)(lVar11 + 0x20) == 0) {
code_r0x004c4154:
    if (!bVar4) {
      func_0x007b05dc(pcVar28,0);
      uVar39 = extraout_x1_04;
    }
    lVar11 = *(long *)(lVar19 + -0xa8);
    pcVar28 = (char *)(lVar11 + 8);
    if (*pcVar28 == '\0') {
      *pcVar28 = '\x01';
    }
    else {
      func_0x007aff64(pcVar28,uVar39,1000000000);
      uVar39 = extraout_x1_05;
    }
    cVar1 = *pcVar28;
    if (cVar1 == '\x01') {
      *pcVar28 = (char)in_xzr;
    }
    bVar4 = cVar1 == '\x01';
    if (*(long *)(lVar11 + 0x20) == 0) {
      if (!bVar4) {
        func_0x007b05dc(pcVar28,0);
        uVar39 = extraout_x1_11;
      }
      lVar11 = *(long *)(lVar19 + -0xa0);
      pcVar28 = (char *)(lVar11 + 8);
      if (*pcVar28 == '\0') {
        *pcVar28 = '\x01';
      }
      else {
        func_0x007aff64(pcVar28,uVar39,1000000000);
        uVar39 = extraout_x1_12;
      }
      cVar1 = *pcVar28;
      if (cVar1 == '\x01') {
        *pcVar28 = (char)in_xzr;
      }
      bVar4 = cVar1 == '\x01';
      if (*(long *)(lVar11 + 0x20) != 0) {
        if (!bVar4) {
          func_0x007b05dc(pcVar28,0);
        }
        func_0x004bd098(auStack_7ffffffe + 0x8000066e,plVar12);
        func_0x005cb804(auStack_7ffffffe + 0x8000066e,0);
        func_0x005cb1c8(auStack_7ffffffe + 0x8000066e);
        func_0x004bb4f4(plVar12);
        *(dword **)(lVar19 + -0xe0) = in_stack_00000678;
        *plVar12 = in_stack_00000670;
        *(long *)(lVar19 + -0xd0) = in_stack_00000688;
        *(ulong *)(lVar19 + -0xd8) = in_stack_00000680;
        *(undefined8 *)(lVar19 + -0xc0) = in_stack_00000698;
        *(undefined8 *)(lVar19 + -200) = in_stack_00000690;
        *(undefined8 *)(lVar19 + -0xb0) = in_stack_000006a8;
        *(undefined8 *)(lVar19 + -0xb8) = in_stack_000006a0;
        uVar39 = *(undefined8 *)(lVar19 + -0xa8);
        *(undefined8 *)(lVar19 + -0xa8) = *(undefined8 *)(lVar19 + -0xa0);
        *(undefined8 *)(lVar19 + -0xa0) = uVar39;
        in_stack_00000678 = (dword *)func_0x00187bd0(0x28,8);
        uVar39 = 0x28;
        if (in_stack_00000678 == (dword *)0x0) {
LAB_004c4fe0:
          func_0x007a1f18(8,uVar39);
          goto LAB_004c5940;
        }
        *in_stack_00000678 = dVar45;
        *(undefined8 *)(in_stack_00000678 + 2) = 0;
        *(undefined8 *)(in_stack_00000678 + 4) = 8;
        *(undefined8 *)(in_stack_00000678 + 6) = 0;
        *(undefined1 *)(in_stack_00000678 + 8) = 0;
        func_0x00584c34(&stack0x000001f0,in_stack_000000f8,in_stack_000000b0,
                        auStack_7ffffffe + 0x8000066e);
        func_0x004ce364(&stack0x000001f0);
        goto code_r0x004c43a4;
      }
    }
    if (!bVar4) {
      func_0x007b05dc(pcVar28,0);
      uVar39 = extraout_x1_08;
    }
    lVar11 = *(long *)(lVar19 + -0xa8);
    pcVar28 = (char *)(lVar11 + 8);
    if (*pcVar28 == '\0') {
      *pcVar28 = '\x01';
    }
    else {
      func_0x007aff64(pcVar28,uVar39,1000000000);
      uVar39 = extraout_x1_09;
    }
    cVar1 = *pcVar28;
    if (cVar1 == '\x01') {
      *pcVar28 = (char)in_xzr;
    }
    bVar4 = cVar1 == '\x01';
    if (*(long *)(lVar11 + 0x20) != 0) {
      if (!bVar4) {
        func_0x007b05dc(pcVar28,0);
        uVar39 = extraout_x1_10;
      }
      lVar19 = *(long *)(lVar19 + -0xa0);
      pcVar28 = (char *)(lVar19 + 8);
      if (*pcVar28 == '\0') {
        *pcVar28 = '\x01';
      }
      else {
        func_0x007aff64(pcVar28,uVar39,1000000000);
      }
      cVar1 = *pcVar28;
      if (cVar1 == '\x01') {
        *pcVar28 = (char)in_xzr;
      }
      bVar4 = cVar1 == '\x01';
      if (*(long *)(lVar19 + 0x20) != 0) {
        if (!bVar4) {
          func_0x007b05dc(pcVar28,0);
        }
        func_0x0058497c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,in_stack_000000b0);
        func_0x004ce364(auStack_7ffffffe + 0x8000066e);
        if (in_stack_00000670 != 0) {
          pdVar6 = in_stack_00000678;
          lVar19 = in_stack_00000670;
          goto code_r0x004c43b4;
        }
        goto code_r0x004c43c4;
      }
    }
    if (!bVar4) {
      func_0x007b05dc(pcVar28,0);
    }
  }
  else {
    if (!bVar4) {
      func_0x007b05dc(pcVar28,0);
      uVar39 = extraout_x1_06;
    }
    lVar11 = *(long *)(lVar19 + -0xa0);
    pcVar28 = (char *)(lVar11 + 8);
    if (*pcVar28 == '\0') {
      *pcVar28 = '\x01';
    }
    else {
      func_0x007aff64(pcVar28,uVar39,1000000000);
      uVar39 = extraout_x1_07;
    }
    cVar1 = *pcVar28;
    if (cVar1 == '\x01') {
      *pcVar28 = (char)in_xzr;
    }
    bVar4 = cVar1 == '\x01';
    if (*(long *)(lVar11 + 0x20) != 0) goto code_r0x004c4154;
    if (!bVar4) {
      func_0x007b05dc(pcVar28,0);
    }
    in_stack_00000678 = (dword *)func_0x00187bd0(0x28,8);
    uVar39 = 0x28;
    if (in_stack_00000678 == (dword *)0x0) goto LAB_004c4fe0;
    *in_stack_00000678 = dVar25;
    *(undefined8 *)(in_stack_00000678 + 2) = 0;
    *(undefined8 *)(in_stack_00000678 + 4) = 8;
    in_stack_00000678[6] = 0;
    in_stack_00000678[7] = 0;
    *(undefined1 *)(in_stack_00000678 + 8) = 0;
    func_0x00584c34(&stack0x000001f0,in_stack_000000f8,in_stack_000000b0,
                    auStack_7ffffffe + 0x8000066e);
    func_0x004ce364(&stack0x000001f0);
code_r0x004c43a4:
    in_stack_00000680 = 1;
    in_stack_00000670 = 1;
    if (in_stack_000001f0 != 0) {
      pdVar6 = in_stack_000001f8;
      lVar19 = in_stack_000001f0;
code_r0x004c43b4:
      func_0x00187bd4(pdVar6,lVar19 * 0x28,8);
    }
code_r0x004c43c4:
    uVar26 = 1;
  }
LAB_004c43c8:
  param_1 = in_stack_00000670;
  in_x9 = in_stack_00000678;
  if (in_stack_00000410 != 0) {
    func_0x00187bd4(in_stack_00000418,in_stack_00000410 << 2,4);
  }
code_r0x004c3298:
  unaff_x28 = unaff_x28 - 1 & unaff_x28;
  in_stack_00000098._4_4_ = in_stack_00000098._4_4_ | uVar26;
  in_stack_00000090 = in_stack_00000090 + -1;
  uVar26 = (uint)(in_stack_00000680 >> 0x20);
  uVar46 = (uint)in_stack_00000688;
  if (in_stack_00000090 == 0) {
    if ((in_stack_00000030 != 0) && (in_stack_00000020 != 0)) {
      func_0x00187bd4(in_stack_00000010,in_stack_00000020,in_stack_00000018);
    }
    func_0x00584800(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,in_stack_00000138._4_4_);
    puVar15 = (undefined1 *)(in_stack_00000680 & 0xffffffff);
    if (in_x9 <= puVar15) goto joined_r0x004c4548;
    lVar19 = param_1 + (long)puVar15 * 0x30;
    puVar15 = (undefined1 *)(ulong)*(uint *)(lVar19 + 0x20);
    uVar2 = *(uint *)(lVar19 + 0x2c);
    goto joined_r0x004c4578;
  }
  while (unaff_x28 == 0) {
    lVar19 = *unaff_x27;
    unaff_x23 = unaff_x23 + -0x20;
    unaff_x27 = unaff_x27 + 1;
    unaff_x28 = CONCAT17(-(-1 < lVar19),
                         CONCAT16(-(-1 < (char)((ulong)lVar19 >> 0x30)),
                                  CONCAT15(-(-1 < (char)((ulong)lVar19 >> 0x28)),
                                           CONCAT14(-(-1 < (char)((ulong)lVar19 >> 0x20)),
                                                    CONCAT13(-(-1 < (char)((ulong)lVar19 >> 0x18)),
                                                             CONCAT12(-(-1 < (char)((ulong)lVar19 >>
                                                                                   0x10)),
                                                                      CONCAT11(-(-1 < (char)((ulong)
                                                  lVar19 >> 8)),-(-1 < (char)lVar19)))))))) &
                0x8080808080808080;
  }
  uVar14 = (unaff_x28 & 0xaaaaaaaaaaaaaaaa) >> 1 | (unaff_x28 & 0x5555555555555555) << 1;
  uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
  uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
  uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
  uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
  uVar2 = *(uint *)((unaff_x23 - ((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 1 & 0x3c)) + -4
                   );
  in_stack_000000b0 = (ulong)uVar2;
  func_0x00584d50(auStack_7ffffffe + 0x8000052e,in_stack_000000f8);
  if (in_stack_00000530 == 0) {
    func_0x00584ec0(auStack_7ffffffe + 0x8000040e,in_stack_000000f8,in_stack_000000b0);
    if (in_stack_00000410 != 0) {
      dVar45 = (dword)((ulong)in_stack_00000418 >> 0x20);
      if (dVar45 == in_stack_00000118._4_4_) {
        func_0x0058485c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8);
        puVar13 = (undefined1 *)(in_stack_00000680 & 0xffffffff);
        puVar15 = (undefined1 *)(ulong)uVar26;
        if (in_stack_00000088 == 0) {
          do {
            for (; puVar13 < in_x9;
                puVar13 = (undefined1 *)(ulong)*(uint *)(param_1 + (long)puVar13 * unaff_x19 + 0x20)
                ) {
            }
            do {
              if (in_x9 <= puVar15) goto code_r0x004c3294;
              lVar19 = param_1 + (long)puVar15 * unaff_x19;
              puVar15 = (undefined1 *)(ulong)*(uint *)(lVar19 + 0x24);
            } while (*(uint *)(lVar19 + 0x28) == uVar46);
          } while( true );
        }
        uVar14 = (in_stack_000000b0 | 0x400000000000000) ^ in_stack_00000068;
        uVar17 = uVar14 + in_stack_000000e8 ^ (uVar14 >> 0x30 | uVar14 << 0x10);
        uVar14 = uVar14 + in_stack_000000d8;
        uVar21 = uVar14 ^ in_stack_000000d0;
        uVar18 = uVar17 + in_stack_000000e0 ^ (uVar17 >> 0x2b | uVar17 << 0x15);
        uVar17 = (uVar17 + in_stack_000000e0 ^ (in_stack_000000b0 | 0x400000000000000)) + uVar21;
        uVar22 = uVar17 ^ (uVar21 >> 0x33 | uVar21 << 0xd);
        uVar14 = ((uVar14 >> 0x20 | uVar14 << 0x20) ^ 0xff) + uVar18;
        uVar21 = uVar22 + uVar14;
        uVar14 = uVar14 ^ (uVar18 >> 0x30 | uVar18 << 0x10);
        uVar22 = uVar21 ^ (uVar22 >> 0x2f | uVar22 << 0x11);
        uVar17 = uVar14 + (uVar17 >> 0x20 | uVar17 << 0x20);
        uVar18 = uVar22 + uVar17;
        uVar17 = uVar17 ^ (uVar14 >> 0x2b | uVar14 << 0x15);
        uVar22 = uVar18 ^ (uVar22 >> 0x33 | uVar22 << 0xd);
        uVar14 = uVar17 + (uVar21 >> 0x20 | uVar21 << 0x20);
        uVar21 = uVar22 + uVar14;
        uVar14 = uVar14 ^ (uVar17 >> 0x30 | uVar17 << 0x10);
        uVar22 = uVar21 ^ (uVar22 >> 0x2f | uVar22 << 0x11);
        uVar17 = uVar14 + (uVar18 >> 0x20 | uVar18 << 0x20);
        uVar18 = uVar17 ^ (uVar14 >> 0x2b | uVar14 << 0x15);
        uVar22 = uVar22 + uVar17 ^ (uVar22 >> 0x33 | uVar22 << 0xd);
        uVar14 = uVar18 + (uVar21 >> 0x20 | uVar21 << 0x20);
        uVar17 = uVar22 + uVar14;
        uVar14 = uVar14 ^ (uVar18 >> 0x30 | uVar18 << 0x10);
        uVar17 = (uVar22 >> 0x2f | uVar22 << 0x11) ^ (uVar14 >> 0x2b | uVar14 << 0x15) ^
                 (uVar17 >> 0x20 | uVar17 << 0x20) ^ uVar17;
        bVar9 = (byte)(uVar17 >> 0x39);
code_r0x004c376c:
        do {
          if (puVar13 < in_x9) {
            lVar19 = param_1 + (long)puVar13 * unaff_x19;
            puVar13 = (undefined1 *)(ulong)*(uint *)(lVar19 + 0x20);
            uVar26 = *(uint *)(lVar19 + 0x2c);
          }
          else {
            do {
              if (in_x9 <= puVar15) goto code_r0x004c3294;
              lVar19 = param_1 + (long)puVar15 * unaff_x19;
              puVar15 = (undefined1 *)(ulong)*(uint *)(lVar19 + 0x24);
              uVar26 = *(uint *)(lVar19 + 0x28);
            } while (uVar26 == uVar46);
          }
          if (uVar26 != uVar2) {
            lVar19 = 0;
            uVar14 = uVar17;
            while( true ) {
              uVar14 = uVar14 & in_stack_00000100;
              uVar39 = *(undefined8 *)(in_stack_000000f0 + uVar14);
              bVar38 = (byte)((ulong)uVar39 >> 8);
              bVar40 = (byte)((ulong)uVar39 >> 0x10);
              bVar30 = (byte)((ulong)uVar39 >> 0x18);
              bVar31 = (byte)((ulong)uVar39 >> 0x20);
              bVar32 = (byte)((ulong)uVar39 >> 0x28);
              bVar33 = (byte)((ulong)uVar39 >> 0x30);
              bVar34 = (byte)((ulong)uVar39 >> 0x38);
              for (uVar21 = CONCAT17(-(bVar34 == bVar9),
                                     CONCAT16(-(bVar33 == bVar9),
                                              CONCAT15(-(bVar32 == bVar9),
                                                       CONCAT14(-(bVar31 == bVar9),
                                                                CONCAT13(-(bVar30 == bVar9),
                                                                         CONCAT12(-(bVar40 == bVar9)
                                                                                  ,CONCAT11(-(bVar38
                                                                                             == 
                                                  bVar9),-((byte)uVar39 == bVar9)))))))) &
                            0x8080808080808080; uVar21 != 0; uVar21 = uVar21 - 1 & uVar21) {
                uVar18 = (uVar21 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                         (uVar21 >> 7 & 0xff00ff00ff00ff) << 8;
                uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
                if (uVar2 == *(uint *)(in_stack_000000b8 +
                                      (uVar14 + ((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >>
                                                3) & in_stack_00000100) * -8)) {
                  in_stack_000001f0 = CONCAT44(uVar2,1);
                  goto code_r0x004c383c;
                }
              }
              bVar38 = NEON_umaxv(CONCAT17(-(bVar34 == 0xff),
                                           CONCAT16(-(bVar33 == 0xff),
                                                    CONCAT15(-(bVar32 == 0xff),
                                                             CONCAT14(-(bVar31 == 0xff),
                                                                      CONCAT13(-(bVar30 == 0xff),
                                                                               CONCAT12(-(bVar40 ==
                                                                                         0xff),
                                                  CONCAT11(-(bVar38 == 0xff),-((byte)uVar39 == 0xff)
                                                          ))))))),1);
              if ((bVar38 & 1) != 0) break;
              lVar19 = lVar19 + 8;
              uVar14 = uVar14 + lVar19;
            }
          }
        } while( true );
      }
      uVar26 = 0;
      if (dVar45 == in_stack_00000070) {
        uVar26 = in_stack_00000060._4_4_;
      }
      if ((uVar26 & 1) != 0) {
        plVar12 = (long *)func_0x005847cc(in_stack_000000f8,in_stack_000000b0);
        if (plVar12 != (long *)0x0) {
          in_stack_00000688 = 0x1d;
          lVar19 = plVar12[2];
          if (lVar19 == *plVar12) {
            func_0x005bd0a4(plVar12,&UNK_009e5eb0);
          }
          _memcpy(plVar12[1] + lVar19 * 0x108,auStack_7ffffffe + 0x8000066e,0x108);
          plVar12[2] = lVar19 + 1;
          goto code_r0x004c3ccc;
        }
        goto code_r0x004c53fc;
      }
      goto code_r0x004c3ccc;
    }
    func_0x007a247c(&UNK_008a2482,0x28,&UNK_009e6540);
    goto LAB_004c5940;
  }
  in_stack_000000a0 = in_stack_00000538 >> 0x20;
  unaff_x20 = in_stack_00000550 >> 0x20;
  unaff_x25 = (ulong)in_stack_00000118._4_4_;
  func_0x0058485c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,unaff_x25);
  in_x11 = (undefined1 *)(in_stack_00000680 & 0xffffffff);
  in_stack_00000670 = param_1;
  in_stack_00000678 = in_x9;
  goto code_r0x004c3338;
LAB_004c3b60:
  do {
    iVar20 = (int)uVar14;
    if (iVar20 == in_stack_000000c8) {
      if (in_stack_000000c8 == iVar16) {
code_r0x004c3c48:
        bVar23 = false;
        goto LAB_004c3d50;
      }
      break;
    }
    lVar19 = 0;
    uVar21 = uVar14 & 0xffffffff ^ in_stack_000000c0;
    uVar18 = uVar21 + in_stack_000000e8 ^ (in_stack_000000c0 >> 0x30 | uVar21 << 0x10);
    uVar21 = uVar21 + in_stack_000000d8;
    uVar8 = uVar21 ^ in_stack_000000d0;
    uVar22 = uVar18 + in_stack_000000e0 ^ (uVar18 >> 0x2b | uVar18 << 0x15);
    uVar14 = (uVar18 + in_stack_000000e0 ^ (uVar14 & 0xffffffff | 0x400000000000000)) + uVar8;
    uVar8 = uVar14 ^ (uVar8 >> 0x33 | uVar8 << 0xd);
    uVar21 = ((uVar21 >> 0x20 | uVar21 << 0x20) ^ 0xff) + uVar22;
    uVar18 = uVar8 + uVar21;
    uVar21 = uVar21 ^ (uVar22 >> 0x30 | uVar22 << 0x10);
    uVar8 = uVar18 ^ (uVar8 >> 0x2f | uVar8 << 0x11);
    uVar14 = uVar21 + (uVar14 >> 0x20 | uVar14 << 0x20);
    uVar22 = uVar8 + uVar14;
    uVar14 = uVar14 ^ (uVar21 >> 0x2b | uVar21 << 0x15);
    uVar8 = uVar22 ^ (uVar8 >> 0x33 | uVar8 << 0xd);
    uVar21 = uVar14 + (uVar18 >> 0x20 | uVar18 << 0x20);
    uVar18 = uVar8 + uVar21;
    uVar21 = uVar21 ^ (uVar14 >> 0x30 | uVar14 << 0x10);
    uVar8 = uVar18 ^ (uVar8 >> 0x2f | uVar8 << 0x11);
    uVar14 = uVar21 + (uVar22 >> 0x20 | uVar22 << 0x20);
    uVar24 = uVar14 ^ (uVar21 >> 0x2b | uVar21 << 0x15);
    uVar22 = uVar8 + uVar14 ^ (uVar8 >> 0x33 | uVar8 << 0xd);
    uVar21 = uVar24 + (uVar18 >> 0x20 | uVar18 << 0x20);
    uVar14 = uVar22 + uVar21;
    uVar21 = uVar21 ^ (uVar24 >> 0x30 | uVar24 << 0x10);
    uVar14 = (uVar22 >> 0x2f | uVar22 << 0x11) ^ (uVar21 >> 0x2b | uVar21 << 0x15) ^
             (uVar14 >> 0x20 | uVar14 << 0x20) ^ uVar14;
    bVar38 = (byte)(uVar14 >> 0x39);
    while( true ) {
      uVar14 = uVar14 & in_stack_00000100;
      uVar39 = *(undefined8 *)(in_stack_000000f0 + uVar14);
      bVar40 = (byte)((ulong)uVar39 >> 8);
      bVar30 = (byte)((ulong)uVar39 >> 0x10);
      bVar31 = (byte)((ulong)uVar39 >> 0x18);
      bVar32 = (byte)((ulong)uVar39 >> 0x20);
      bVar33 = (byte)((ulong)uVar39 >> 0x28);
      bVar34 = (byte)((ulong)uVar39 >> 0x30);
      bVar41 = (byte)((ulong)uVar39 >> 0x38);
      for (uVar21 = CONCAT17(-(bVar41 == bVar38),
                             CONCAT16(-(bVar34 == bVar38),
                                      CONCAT15(-(bVar33 == bVar38),
                                               CONCAT14(-(bVar32 == bVar38),
                                                        CONCAT13(-(bVar31 == bVar38),
                                                                 CONCAT12(-(bVar30 == bVar38),
                                                                          CONCAT11(-(bVar40 ==
                                                                                    bVar38),-((byte)
                                                  uVar39 == bVar38)))))))) & 0x8080808080808080;
          uVar21 != 0; uVar21 = uVar21 - 1 & uVar21) {
        uVar18 = (uVar21 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar21 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
        uVar18 = uVar14 + ((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3) & in_stack_00000100
        ;
        if (iVar20 == *(int *)(in_stack_000000b8 + uVar18 * -8)) {
          uVar14 = (ulong)*(uint *)(in_stack_000000a8 + uVar18 * -8);
          bVar23 = true;
          goto joined_r0x004c3b54;
        }
      }
      bVar40 = NEON_umaxv(CONCAT17(-(bVar41 == 0xff),
                                   CONCAT16(-(bVar34 == 0xff),
                                            CONCAT15(-(bVar33 == 0xff),
                                                     CONCAT14(-(bVar32 == 0xff),
                                                              CONCAT13(-(bVar31 == 0xff),
                                                                       CONCAT12(-(bVar30 == 0xff),
                                                                                CONCAT11(-(bVar40 ==
                                                                                          0xff),-((
                                                  byte)uVar39 == 0xff)))))))),1);
      if ((bVar40 & 1) != 0) break;
      lVar19 = lVar19 + 8;
      uVar14 = uVar14 + lVar19;
    }
    bVar23 = false;
joined_r0x004c3b54:
    if (iVar20 == iVar16) goto code_r0x004c3c48;
  } while (bVar23);
  goto LAB_004c3a0c;
code_r0x004c3294:
  uVar26 = 0;
  goto code_r0x004c3298;
  while (auVar44._8_4_ != uVar26) {
code_r0x004c383c:
    auVar44 = func_0x004d3904(&stack0x000001f0);
    if ((auVar44._0_8_ & 1) == 0) break;
  }
  in_stack_000001f8 = in_stack_00000080;
  if ((auVar44._0_8_ & 1) != 0) goto code_r0x004c3854;
  goto code_r0x004c376c;
code_r0x004c3854:
  plVar12 = (long *)func_0x005847cc(in_stack_000000f8,in_stack_000000b0);
  if (plVar12 == (long *)0x0) {
    in_stack_00000000 = &UNK_009e5ec8;
code_r0x004c53fc:
    func_0x007a23bc(in_stack_00000000);
    goto LAB_004c5940;
  }
  in_stack_00000688 = 0x1c;
  lVar19 = plVar12[2];
  if (lVar19 == *plVar12) {
    func_0x005bd0a4(plVar12,&UNK_009e5ee0);
  }
  _memcpy(plVar12[1] + lVar19 * 0x108,auStack_7ffffffe + 0x8000066e,0x108);
  plVar12[2] = lVar19 + 1;
code_r0x004c3ccc:
  param_1 = 0;
  in_x9 = &MACH_HEADER.cpusubtype;
  in_stack_00000680 = 0;
  func_0x00584c34(&stack0x000001f0,in_stack_000000f8,in_stack_000000b0,auStack_7ffffffe + 0x8000066e
                 );
  func_0x004ce364(&stack0x000001f0);
  if (in_stack_000001f0 != 0) {
    func_0x00187bd4(in_stack_000001f8,in_stack_000001f0 * 0x28,8);
  }
  uVar26 = 1;
  goto code_r0x004c3298;
  while( true ) {
    lVar19 = param_1 + (long)(ulong)uVar26 * 0x30;
    uVar26 = *(uint *)(lVar19 + 0x24);
    uVar2 = *(uint *)(lVar19 + 0x28);
    if (uVar2 != uVar46) break;
joined_r0x004c4548:
    if (in_x9 <= (undefined1 *)(ulong)uVar26) goto code_r0x004c48f0;
  }
  in_stack_00000680 = (ulong)uVar26 << 0x20;
joined_r0x004c4578:
  if (in_x9 <= puVar15) {
    puVar15 = (undefined1 *)(in_stack_00000680 >> 0x20);
    while (puVar15 < in_x9) {
      lVar19 = param_1 + (long)puVar15 * 0x30;
      if (*(uint *)(lVar19 + 0x28) != uVar46) goto code_r0x004c48f0;
      puVar15 = (undefined1 *)(ulong)*(uint *)(lVar19 + 0x24);
    }
    uVar26 = 0;
    if (uVar2 == in_stack_00000028._4_4_) {
      uVar26 = in_stack_00000060._4_4_;
    }
    if ((uVar26 & 1) != 0) {
      lVar19 = func_0x005847cc(in_stack_000000f8,in_stack_00000118._4_4_);
      if (lVar19 == 0) {
        puVar7 = &UNK_009e6330;
      }
      else {
        if (*(long *)(lVar19 + 0x10) != 0) {
          lVar11 = *(long *)(lVar19 + 0x10) + -1;
          *(long *)(lVar19 + 0x10) = lVar11;
          lVar19 = *(long *)(lVar19 + 8) + lVar11 * 0x108;
          uVar14 = *(ulong *)(lVar19 + 0x18);
          plVar35 = *(long **)(lVar19 + 0xa8);
          lVar11 = *(long *)(lVar19 + 0xa0);
          lVar29 = *(long *)(lVar19 + 0xb0);
          plVar36 = *(long **)(lVar19 + 0x68);
          plVar12 = *(long **)(lVar19 + 0x60);
          lVar27 = *(long *)(lVar19 + 0x20);
          uVar39 = *(undefined8 *)(lVar19 + 0x40);
          if (uVar14 != 0x21) {
            if (uVar14 != 0x10) {
              puVar5 = (undefined8 *)func_0x005847cc(in_stack_000000f8,in_stack_00000118._4_4_);
              if (puVar5 == (undefined8 *)0x0) {
                func_0x007a23bc(&UNK_009e6420);
                goto LAB_004c5940;
              }
              lVar37 = puVar5[1];
              lVar19 = puVar5[2];
              *puVar5 = 0;
              puVar5[1] = 8;
              puVar5[2] = 0;
              auVar42 = func_0x004bf9d8(in_stack_000000f8,in_stack_00000118._4_4_);
              uVar39 = auVar42._0_8_;
              func_0x00584fc4(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,
                              in_stack_00000138._4_4_);
              if (lVar27 == -0x8000000000000000) {
                func_0x007a23bc(&UNK_009e6438);
                goto LAB_004c5940;
              }
              lVar27 = lVar37 + lVar19 * 0x108;
              func_0x004cc814(auStack_7ffffffe + 0x8000031e,lVar37,lVar27,&UNK_009e6450);
              lVar19 = func_0x005847cc(in_stack_000000f8,uVar39);
              if (lVar19 == 0) {
                func_0x007a23bc(&UNK_009e6468);
                goto LAB_004c5940;
              }
              func_0x004ca0e0(lVar19,auStack_7ffffffe + 0x8000066e,&UNK_009e6480);
              if (uVar14 == 0x16) {
                func_0x004cc974(auStack_7ffffffe + 0x8000066e,lVar19,auVar42._8_8_,&UNK_009e6498);
                _memcpy(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x8000066e,0x108);
                if (lVar27 - 0xcU < 0x15) {
                  _memcpy(auStack_7ffffffe + 0x8000066e,auStack_7ffffffe + 0x8000052e,0x108);
                  func_0x007a2810(&UNK_008a2019,0x2b,auStack_7ffffffe + 0x8000066e,&UNK_009e5948,
                                  &UNK_009e64b0);
                  goto LAB_004c5940;
                }
                _memcpy(auStack_7ffffffe + 0x8000066e,auStack_7ffffffe + 0x8000052e,0x108);
                if (lVar11 != -0x8000000000000000) {
                  func_0x007a23bc(&UNK_009e64c8);
                  goto LAB_004c5940;
                }
                lVar11 = *plVar35;
                *plVar35 = lVar11 + 1;
                if (lVar11 < 0) {
                  func_0x007a05dc();
                  goto LAB_004c5940;
                }
                func_0x005db1b4(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x800004ee,
                                unaff_x29 + -0xd0,auStack_7ffffffe + 0x8000033e,plVar35,
                                unaff_x29 + -0xf0);
                func_0x004bb3f8(auStack_7ffffffe + 0x8000066e);
                func_0x004bb3f8(auStack_7ffffffe + 0x800006c6);
                func_0x004bb3f8(auStack_7ffffffe + 0x8000071e);
                func_0x004bc41c(auStack_7ffffffe + 0x8000040e);
              }
              else {
                if (uVar14 != 0x19) {
                  func_0x007a247c(&UNK_008a2482,0x28,&UNK_009e6528);
                  goto LAB_004c5940;
                }
                func_0x004cc974(auStack_7ffffffe + 0x8000052e,lVar19,auVar42._8_8_,&UNK_009e64e0);
                if (in_stack_00000548 != 0x18) {
                  func_0x007a2810(&UNK_008a2019,0x2b,auStack_7ffffffe + 0x8000066e,&UNK_009e5948,
                                  &UNK_009e64f8);
                  goto LAB_004c5940;
                }
                func_0x004cea94(unaff_x29 + -0xd0,plVar35,plVar35 + lVar29 * 3,&UNK_009e5910);
                func_0x005dc404(auStack_7ffffffe + 0x8000066e,unaff_x29 + -0xd0,
                                auStack_7ffffffe + 0x80000546,auStack_7ffffffe + 0x8000033e);
                func_0x004bc9dc(auStack_7ffffffe + 0x8000052e);
                func_0x004bc780(auStack_7ffffffe + 0x8000040e);
              }
              func_0x004bdba4(lVar19,auStack_7ffffffe + 0x8000066e,&UNK_009e6510);
              func_0x00584fc4(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,
                              in_stack_00000118._4_4_);
              func_0x004bcba8(auStack_7ffffffe + 0x8000066e);
              pdVar6 = (dword *)func_0x00187bd0(0x28,8);
              if (pdVar6 == (dword *)0x0) {
                func_0x007a1f18(8,0x28);
                goto LAB_004c5940;
              }
              *pdVar6 = in_stack_00000070;
              pdVar6[2] = 0;
              pdVar6[3] = 0;
              pdVar6[4] = 8;
              pdVar6[5] = 0;
              pdVar6[6] = 0;
              pdVar6[7] = 0;
              *(undefined1 *)(pdVar6 + 8) = 0;
              func_0x00584c34(auStack_7ffffffe + 0x8000052e,in_stack_000000f8,uVar39,
                              auStack_7ffffffe + 0x8000066e);
              func_0x004bb068(auStack_7ffffffe + 0x8000052e);
              func_0x004bea24(in_stack_000000f8,uVar39,1,in_stack_00000070);
code_r0x004c4f70:
              if ((0x19 < uVar14) || ((1L << (uVar14 & 0x3f) & 0x2410000U) == 0)) {
                func_0x004bba74(&stack0x000001f0);
              }
              in_stack_00000098._4_4_ = 1;
              if (((in_stack_00000038 & 0x100000000) != 0) && (in_stack_000001a0 != 0)) {
                func_0x00187bd4(in_stack_000001a8,in_stack_000001a0 << 2,4);
              }
              goto code_r0x004c2eb0;
            }
            func_0x00584d50(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,in_stack_00000118._4_4_)
            ;
            if (lVar27 == 0) {
              puVar7 = &UNK_009e6360;
            }
            else {
              iVar48 = (int)((ulong)uVar39 >> 0x20);
              func_0x00584fc4(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,
                              in_stack_00000138._4_4_);
              if (lVar27 != -0x8000000000000000) {
                lVar19 = func_0x005847cc(in_stack_000000f8,in_stack_00000118._4_4_);
                if (lVar19 == 0) {
                  puVar7 = &UNK_009e6390;
code_r0x004c5498:
                  func_0x007a23bc(puVar7);
                  goto LAB_004c5940;
                }
                if (*(long *)(lVar19 + 0x10) == 0) {
                  if (iVar48 == in_stack_00000138._4_4_) {
                    func_0x005cb804(auStack_7ffffffe + 0x8000066e,0);
                    func_0x005cb1c8(auStack_7ffffffe + 0x8000066e);
                  }
                  func_0x005cf78c(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x8000033e,
                                  unaff_x29 + -0xf0);
                }
                else {
                  puVar5 = (undefined8 *)func_0x005847cc(in_stack_000000f8,in_stack_00000118._4_4_);
                  if (puVar5 == (undefined8 *)0x0) {
                    puVar7 = &UNK_009e63a8;
                    goto code_r0x004c5498;
                  }
                  puVar5[2] = 0;
                  puVar5[1] = 8;
                  *puVar5 = 0;
                  if (iVar48 != in_stack_00000138._4_4_) {
                    func_0x005cb804(auStack_7ffffffe + 0x8000066e,0);
                    func_0x005cb1c8(auStack_7ffffffe + 0x8000066e);
                  }
                  lVar19 = func_0x00187bd0(0x108,8);
                  if (lVar19 == 0) {
                    func_0x007a1f18(8,0x108);
                    goto LAB_004c5940;
                  }
                  *(undefined8 *)(lVar19 + 0x18) = 0x1d;
                  func_0x005cee30(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x8000033e,
                                  unaff_x29 + -0xd0,auStack_7ffffffe + 0x80000656);
                  func_0x004bdba4(auStack_7ffffffe + 0x800004ee,auStack_7ffffffe + 0x8000066e,
                                  &UNK_009e63c0);
                  func_0x004ca0e0(auStack_7ffffffe + 0x800004ee,auStack_7ffffffe + 0x8000066e,
                                  &UNK_009e63d8);
                  func_0x005cf78c(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x8000066e,
                                  unaff_x29 + -0xd0);
                }
                lVar19 = func_0x005847cc(in_stack_000000f8,in_stack_00000118._4_4_);
                if (lVar19 == 0) {
                  func_0x007a23bc(&UNK_009e63f0);
                  goto LAB_004c5940;
                }
                func_0x004bdba4(lVar19,auStack_7ffffffe + 0x8000066e,&UNK_009e6408);
                pdVar6 = (dword *)func_0x00187bd0(0x28,8);
                if (pdVar6 == (dword *)0x0) {
                  func_0x007a1f18(8,0x28);
                  goto LAB_004c5940;
                }
                *pdVar6 = in_stack_00000070;
                pdVar6[2] = 0;
                pdVar6[3] = 0;
                pdVar6[4] = 8;
                pdVar6[5] = 0;
                pdVar6[6] = 0;
                pdVar6[7] = 0;
                *(undefined1 *)(pdVar6 + 8) = 0;
                func_0x00584c34(unaff_x29 + -0xd0,in_stack_000000f8,in_stack_00000118._4_4_,
                                auStack_7ffffffe + 0x8000066e);
                func_0x004bb068(unaff_x29 + -0xd0);
                func_0x004bea24(in_stack_000000f8,in_stack_00000118._4_4_,1,in_stack_00000070);
                lVar19 = *plVar12;
                *plVar12 = lVar19 + -1;
                LORelease();
                if (lVar19 == 1) {
                  func_0x005d2c74(auStack_7ffffffe + 0x8000044e);
                }
                lVar19 = *plVar36;
                *plVar36 = lVar19 + -1;
                LORelease();
                if (lVar19 == 1) {
                  func_0x005d2c74(auStack_7ffffffe + 0x80000456);
                }
                goto code_r0x004c4f70;
              }
              puVar7 = &UNK_009e6378;
            }
            func_0x007a23bc(puVar7);
            goto LAB_004c5940;
          }
        }
        puVar7 = &UNK_009e6348;
      }
      func_0x007a23bc(puVar7);
LAB_004c5940:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x4c5944);
      (*pcVar3)();
    }
  }
code_r0x004c48f0:
  if (((in_stack_00000038 & 0x100000000) != 0) && (in_stack_000001a0 != 0)) {
    func_0x00187bd4(in_stack_000001a8,in_stack_000001a0 << 2,4);
  }
code_r0x004c2eb0:
  if (in_stack_00000120 != 0) {
    func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
  }
  return in_stack_00000098._4_4_ & 1;
}

