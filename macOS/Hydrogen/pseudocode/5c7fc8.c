
/* WARNING: Possible PIC construction at 0x005c87cc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005c87d0) */
/* WARNING: Removing unreachable block (ram,0x005c88bc) */
/* WARNING: Removing unreachable block (ram,0x005c87d4) */

ulong FUN_005c7fc8(long param_1)

{
  char cVar1;
  ulong *puVar2;
  ulong uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  bool bVar6;
  int iVar7;
  long lVar8;
  ulong *puVar9;
  ulong uVar10;
  undefined1 *puVar11;
  undefined1 *in_x9;
  undefined8 uVar12;
  long *plVar13;
  ulong uVar14;
  undefined1 *unaff_x19;
  undefined1 *puVar15;
  ulong uVar16;
  undefined1 *puVar17;
  undefined1 *puVar18;
  long lVar19;
  ulong uVar20;
  undefined1 *unaff_x28;
  undefined1 *unaff_x29;
  undefined *puVar21;
  undefined1 auVar22 [16];
  long lStack0000000000000000;
  undefined1 *puStack0000000000000008;
  long in_stack_00000010;
  undefined1 *in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  lStack0000000000000000 = param_1;
  puStack0000000000000008 = in_x9;
  do {
    lVar8 = func_0x005c5904(&uStack0000000000000030);
    in_stack_00000020._4_4_ = (uint)(lVar8 == 0);
    if (lVar8 == 0) break;
    uVar12 = *(undefined8 *)(lVar8 + 8);
    uVar10 = *(ulong *)(lVar8 + 0x10);
    in_stack_00000028 = in_stack_00000010;
    puVar15 = in_stack_00000018;
    while( true ) {
      uVar16 = (ulong)*(ushort *)(puVar15 + 0x322);
      lVar19 = uVar16 * 0x18;
      puVar17 = puVar15 + -0x30;
      uVar20 = 0xffffffffffffffff;
      puVar18 = puVar15 + 0x218;
      do {
        if (lVar19 == 0) {
          uVar20 = uVar16;
          goto LAB_005c8160;
        }
        unaff_x28 = puVar18 + 0x18;
        uVar3 = *(ulong *)(puVar18 + 0x10);
        unaff_x19 = (undefined1 *)(uVar10 - uVar3);
        uVar14 = uVar10;
        if (uVar3 <= uVar10) {
          uVar14 = uVar3;
        }
        iVar7 = _memcmp(uVar12,*(undefined8 *)(puVar18 + 8),uVar14);
        puVar18 = unaff_x19;
        if (iVar7 != 0) {
          puVar18 = (undefined1 *)(long)iVar7;
        }
        cVar1 = 0 < (long)puVar18;
        if ((long)puVar18 < 0) {
          cVar1 = -1;
        }
        lVar19 = lVar19 + -0x18;
        uVar20 = uVar20 + 1;
        puVar17 = puVar17 + 0x30;
        puVar18 = unaff_x28;
      } while (cVar1 == '\x01');
      if (cVar1 == '\0') break;
LAB_005c8160:
      if (in_stack_00000028 == 0) {
        func_0x007a23d8(&UNK_008b57ce,0x16,&UNK_009f2810);
        goto LAB_005c832c;
      }
      puVar15 = *(undefined1 **)(puVar15 + uVar20 * 8 + 0x328);
      in_stack_00000028 = in_stack_00000028 + -1;
    }
    uVar12 = *(undefined8 *)(lVar8 + 8);
    uVar10 = *(ulong *)(lVar8 + 0x10);
    in_stack_00000028 = lStack0000000000000000;
    puVar15 = puStack0000000000000008;
    while( true ) {
      uVar16 = (ulong)*(ushort *)(puVar15 + 0x322);
      lVar8 = uVar16 * 0x18;
      puVar18 = puVar15 + -0x30;
      uVar20 = 0xffffffffffffffff;
      puVar11 = puVar15 + 0x218;
      do {
        if (lVar8 == 0) {
          uVar20 = uVar16;
          goto LAB_005c81fc;
        }
        unaff_x19 = puVar11 + 0x18;
        uVar3 = *(ulong *)(puVar11 + 0x10);
        unaff_x28 = (undefined1 *)(uVar10 - uVar3);
        uVar14 = uVar10;
        if (uVar3 <= uVar10) {
          uVar14 = uVar3;
        }
        iVar7 = _memcmp(uVar12,*(undefined8 *)(puVar11 + 8),uVar14);
        puVar11 = unaff_x28;
        if (iVar7 != 0) {
          puVar11 = (undefined1 *)(long)iVar7;
        }
        cVar1 = 0 < (long)puVar11;
        if ((long)puVar11 < 0) {
          cVar1 = -1;
        }
        lVar8 = lVar8 + -0x18;
        uVar20 = uVar20 + 1;
        puVar18 = puVar18 + 0x30;
        puVar11 = unaff_x19;
      } while (cVar1 == '\x01');
      if (cVar1 == '\0') break;
LAB_005c81fc:
      if (in_stack_00000028 == 0) goto LAB_005c832c;
      puVar15 = *(undefined1 **)(puVar15 + uVar20 * 8 + 0x328);
      in_stack_00000028 = in_stack_00000028 + -1;
    }
    uVar10 = func_0x005c7ee4(puVar17,puVar18);
  } while ((uVar10 & 1) != 0);
  return (ulong)in_stack_00000020._4_4_;
LAB_005c832c:
  auVar5._8_8_ = unaff_x19;
  auVar5._0_8_ = puVar17;
  puVar21 = (undefined *)0x5c8344;
  auVar22 = func_0x007a23d8(&UNK_008b57ce,0x16,&UNK_009f2828);
  puVar17 = (undefined1 *)register0x00000008;
__ZN61__LT_ast__type_system__Type_u20_as_u20_core__fmt__Display_GT_3fmt17hba7027c6e9528beaE:
  auVar4 = auVar22;
  puVar9 = auVar4._0_8_;
  *(undefined1 **)(puVar17 + -0x40) = unaff_x28;
  *(ulong *)(puVar17 + -0x38) = uVar10;
  *(long *)(puVar17 + -0x30) = auVar5._0_8_;
  *(ulong *)(puVar17 + -0x28) = uVar16;
  *(undefined1 **)(puVar17 + -0x20) = puVar15;
  *(long *)(puVar17 + -0x18) = auVar5._8_8_;
  *(undefined1 **)(puVar17 + -0x10) = unaff_x29;
  *(undefined **)(puVar17 + -8) = puVar21;
  unaff_x29 = puVar17 + -0x10;
  puVar15 = puVar17 + -0xd0;
  uVar20 = *puVar9 ^ 0x8000000000000000;
  if (0xb < uVar20) {
    uVar20 = 6;
  }
  if (5 < (long)uVar20) {
    if ((long)uVar20 < 9) {
      if (uVar20 == 6) {
        uVar10 = puVar9[1];
        uVar20 = puVar9[2];
        *(ulong *)(puVar17 + -0xb0) = uVar10;
        *(ulong *)(puVar17 + -0xa8) = uVar10 + uVar20 * 0x30;
        func_0x005bde2c(puVar17 + -0xd0,puVar17 + -0xb0,&UNK_008b5821,2);
        puVar2 = (ulong *)puVar9[4];
        uVar10 = puVar9[5];
        if ((uVar10 == 0) ||
           (((uVar10 == 1 && ((long)*puVar2 < -0x7ffffffffffffff4)) &&
            ((*puVar2 & 0xfffffffffffffffe) == 0x8000000000000008)))) {
          *(ulong **)(puVar17 + -0x88) = puVar2;
          *(ulong **)(puVar17 + -0x80) = puVar2 + uVar10 * 6;
          func_0x005bde2c(puVar17 + -0xa0,puVar17 + -0x88,&UNK_008b5821,2);
        }
        else {
          *(ulong **)(puVar17 + -0xa0) = puVar2;
          *(ulong **)(puVar17 + -0x98) = puVar2 + uVar10 * 6;
          func_0x005bde2c(puVar17 + -0x100,puVar17 + -0xa0,&UNK_008b5821,2);
          *(undefined1 **)(puVar17 + -0x148) = puVar17 + -0x100;
          *(undefined **)(puVar17 + -0x140) = &DAT_005c73c0;
          *(undefined **)(puVar17 + -0x88) = &UNK_009f28a0;
          *(undefined8 *)(puVar17 + -0x80) = 2;
          *(undefined1 **)(puVar17 + -0x78) = puVar17 + -0x148;
          *(undefined8 *)(puVar17 + -0x70) = 1;
          *(undefined8 *)(puVar17 + -0x68) = 0;
          func_0x00459f08(puVar17 + -0x130,puVar17 + -0x88);
          if (*(long *)(puVar17 + -0x100) != 0) {
            func_0x00187bd4(*(undefined8 *)(puVar17 + -0xf8),*(long *)(puVar17 + -0x100),1);
          }
          *(undefined8 *)(puVar17 + -0x98) = *(undefined8 *)(puVar17 + -0x128);
          *(undefined8 *)(puVar17 + -0xa0) = *(undefined8 *)(puVar17 + -0x130);
          *(undefined8 *)(puVar17 + -0x90) = *(undefined8 *)(puVar17 + -0x120);
        }
        *(undefined1 **)(puVar17 + -0x100) = puVar17 + -0xd0;
        *(undefined **)(puVar17 + -0xf8) = &DAT_005c73c0;
        *(undefined1 **)(puVar17 + -0xf0) = puVar17 + -0xa0;
        *(undefined **)(puVar17 + -0xe8) = &DAT_005c73c0;
        *(undefined **)(puVar17 + -0x88) = &UNK_009f28c0;
        *(undefined8 *)(puVar17 + -0x80) = 2;
        *(undefined8 *)(puVar17 + -0x70) = 2;
        *(undefined8 *)(puVar17 + -0x68) = 0;
        *(undefined1 **)(puVar17 + -0x78) = puVar17 + -0x100;
        func_0x00459f08(puVar17 + -0x130,puVar17 + -0x88);
        if (*(long *)(puVar17 + -0xa0) != 0) {
          func_0x00187bd4(*(undefined8 *)(puVar17 + -0x98),*(long *)(puVar17 + -0xa0),1);
        }
        if (*(long *)(puVar17 + -0xd0) != 0) {
          func_0x00187bd4(*(undefined8 *)(puVar17 + -200),*(long *)(puVar17 + -0xd0),1);
        }
        *(undefined8 *)(puVar17 + -0xf8) = *(undefined8 *)(puVar17 + -0x128);
        *(undefined8 *)(puVar17 + -0x100) = *(undefined8 *)(puVar17 + -0x130);
        *(undefined8 *)(puVar17 + -0xf0) = *(undefined8 *)(puVar17 + -0x120);
        goto LAB_005c8630;
      }
      if (uVar20 == 7) {
        *(ulong **)(puVar17 + -0xa0) = puVar9 + 1;
        *(undefined1 **)(puVar17 + -0x130) = puVar17 + -0xa0;
        *(undefined **)(puVar17 + -0x128) = &DAT_005bff94;
        *(undefined **)(puVar17 + -0x88) = &UNK_009f28e0;
        *(undefined8 *)(puVar17 + -0x80) = 2;
        *(undefined1 **)(puVar17 + -0x78) = puVar17 + -0x130;
        *(undefined8 *)(puVar17 + -0x70) = 1;
        *(undefined8 *)(puVar17 + -0x68) = 0;
        func_0x00459f08(puVar17 + -0x100,puVar17 + -0x88);
        goto LAB_005c8630;
      }
      uVar10 = puVar9[1];
      bVar6 = uVar10 != 0;
      *(ulong *)(puVar17 + -0x88) = (ulong)bVar6;
      *(undefined8 *)(puVar17 + -0x80) = 0;
      *(ulong *)(puVar17 + -0x78) = uVar10;
      *(ulong *)(puVar17 + -0x68) = (ulong)bVar6;
      *(undefined8 *)(puVar17 + -0x60) = 0;
      *(ulong *)(puVar17 + -0x58) = uVar10;
      uVar20 = puVar9[3];
      uVar10 = puVar9[2];
      lVar8 = -(ulong)((long)((ulong)CONCAT14(bVar6,(uint)bVar6) << 0x3f) < 0);
      lVar19 = -(ulong)((long)((ulong)bVar6 << 0x3f) < 0);
      uVar12 = CONCAT17((byte)(uVar10 >> 0x38) & (byte)((ulong)lVar8 >> 0x38),
                        CONCAT16((byte)(uVar10 >> 0x30) & (byte)((ulong)lVar8 >> 0x30),
                                 CONCAT15((byte)(uVar10 >> 0x28) & (byte)((ulong)lVar8 >> 0x28),
                                          CONCAT14((byte)(uVar10 >> 0x20) &
                                                   (byte)((ulong)lVar8 >> 0x20),
                                                   CONCAT13((byte)(uVar10 >> 0x18) &
                                                            (byte)((ulong)lVar8 >> 0x18),
                                                            CONCAT12((byte)(uVar10 >> 0x10) &
                                                                     (byte)((ulong)lVar8 >> 0x10),
                                                                     CONCAT11((byte)(uVar10 >> 8) &
                                                                              (byte)((ulong)lVar8 >>
                                                                                    8),(byte)uVar10
                                                                                       & (byte)lVar8
                                                                             )))))));
      *(undefined8 *)(puVar17 + -0x70) = uVar12;
      *(ulong *)(puVar17 + -0x48) =
           CONCAT17((byte)(uVar20 >> 0x38) & (byte)((ulong)lVar19 >> 0x38),
                    CONCAT16((byte)(uVar20 >> 0x30) & (byte)((ulong)lVar19 >> 0x30),
                             CONCAT15((byte)(uVar20 >> 0x28) & (byte)((ulong)lVar19 >> 0x28),
                                      CONCAT14((byte)(uVar20 >> 0x20) &
                                               (byte)((ulong)lVar19 >> 0x20),
                                               CONCAT13((byte)(uVar20 >> 0x18) &
                                                        (byte)((ulong)lVar19 >> 0x18),
                                                        CONCAT12((byte)(uVar20 >> 0x10) &
                                                                 (byte)((ulong)lVar19 >> 0x10),
                                                                 CONCAT11((byte)(uVar20 >> 8) &
                                                                          (byte)((ulong)lVar19 >> 8)
                                                                          ,(byte)uVar20 &
                                                                           (byte)lVar19)))))));
      *(undefined8 *)(puVar17 + -0x50) = uVar12;
      puVar21 = &UNK_008b582d;
    }
    else {
      if (uVar20 != 9) {
        if (uVar20 != 10) {
          puVar21 = &UNK_008b5836;
          goto LAB_005c8620;
        }
        puVar21 = &UNK_008b5833;
        uVar12 = 3;
        goto LAB_005c8624;
      }
      uVar10 = puVar9[1];
      bVar6 = uVar10 != 0;
      *(ulong *)(puVar17 + -0x88) = (ulong)bVar6;
      *(undefined8 *)(puVar17 + -0x80) = 0;
      *(ulong *)(puVar17 + -0x78) = uVar10;
      *(ulong *)(puVar17 + -0x68) = (ulong)bVar6;
      *(undefined8 *)(puVar17 + -0x60) = 0;
      *(ulong *)(puVar17 + -0x58) = uVar10;
      uVar20 = puVar9[3];
      uVar10 = puVar9[2];
      lVar8 = -(ulong)((long)((ulong)CONCAT14(bVar6,(uint)bVar6) << 0x3f) < 0);
      lVar19 = -(ulong)((long)((ulong)bVar6 << 0x3f) < 0);
      uVar12 = CONCAT17((byte)(uVar10 >> 0x38) & (byte)((ulong)lVar8 >> 0x38),
                        CONCAT16((byte)(uVar10 >> 0x30) & (byte)((ulong)lVar8 >> 0x30),
                                 CONCAT15((byte)(uVar10 >> 0x28) & (byte)((ulong)lVar8 >> 0x28),
                                          CONCAT14((byte)(uVar10 >> 0x20) &
                                                   (byte)((ulong)lVar8 >> 0x20),
                                                   CONCAT13((byte)(uVar10 >> 0x18) &
                                                            (byte)((ulong)lVar8 >> 0x18),
                                                            CONCAT12((byte)(uVar10 >> 0x10) &
                                                                     (byte)((ulong)lVar8 >> 0x10),
                                                                     CONCAT11((byte)(uVar10 >> 8) &
                                                                              (byte)((ulong)lVar8 >>
                                                                                    8),(byte)uVar10
                                                                                       & (byte)lVar8
                                                                             )))))));
      *(undefined8 *)(puVar17 + -0x70) = uVar12;
      *(ulong *)(puVar17 + -0x48) =
           CONCAT17((byte)(uVar20 >> 0x38) & (byte)((ulong)lVar19 >> 0x38),
                    CONCAT16((byte)(uVar20 >> 0x30) & (byte)((ulong)lVar19 >> 0x30),
                             CONCAT15((byte)(uVar20 >> 0x28) & (byte)((ulong)lVar19 >> 0x28),
                                      CONCAT14((byte)(uVar20 >> 0x20) &
                                               (byte)((ulong)lVar19 >> 0x20),
                                               CONCAT13((byte)(uVar20 >> 0x18) &
                                                        (byte)((ulong)lVar19 >> 0x18),
                                                        CONCAT12((byte)(uVar20 >> 0x10) &
                                                                 (byte)((ulong)lVar19 >> 0x10),
                                                                 CONCAT11((byte)(uVar20 >> 8) &
                                                                          (byte)((ulong)lVar19 >> 8)
                                                                          ,(byte)uVar20 &
                                                                           (byte)lVar19)))))));
      *(undefined8 *)(puVar17 + -0x50) = uVar12;
      puVar21 = &UNK_008b5830;
    }
    func_0x005d33ac(puVar17 + -0x100,puVar17 + -0x88,puVar21,3);
    goto LAB_005c8630;
  }
  if ((long)uVar20 < 3) {
    if (uVar20 == 0) {
      puVar21 = &UNK_008b5804;
      uVar12 = 3;
    }
    else if (uVar20 == 1) {
      puVar21 = &UNK_008b5807;
      uVar12 = 3;
    }
    else {
      puVar21 = &UNK_008b580a;
      uVar12 = 7;
    }
LAB_005c8624:
    *(undefined **)(puVar17 + -0xf8) = puVar21;
    *(undefined8 *)(puVar17 + -0xf0) = uVar12;
    *(undefined8 *)(puVar17 + -0x100) = 0x8000000000000000;
    goto LAB_005c8630;
  }
  if (uVar20 == 3) {
    puVar21 = &UNK_008b5811;
LAB_005c8620:
    uVar12 = 6;
    goto LAB_005c8624;
  }
  if (uVar20 == 4) {
    puVar21 = &UNK_008b5817;
    goto LAB_005c8620;
  }
  plVar13 = (long *)puVar9[1];
  *(long **)(puVar17 + -0x158) = plVar13;
  *(long **)(puVar17 + -0x150) = plVar13 + 6;
  uVar16 = puVar9[4];
  if (*plVar13 != -0x7ffffffffffffffd || uVar16 != 0) {
    *(undefined1 **)(puVar17 + -0x100) = puVar17 + -0x158;
    *(undefined **)(puVar17 + -0xf8) = &DAT_005c5dd8;
    *(undefined1 **)(puVar17 + -0xf0) = puVar17 + -0x150;
    *(undefined **)(puVar17 + -0xe8) = &DAT_005c5dd8;
    uVar12 = 2;
    *(undefined **)(puVar17 + -0x88) = &UNK_009f2840;
    *(undefined8 *)(puVar17 + -0x80) = 2;
    *(undefined8 *)(puVar17 + -0x70) = 2;
    *(undefined8 *)(puVar17 + -0x68) = 0;
    *(undefined1 **)(puVar17 + -0x78) = puVar17 + -0x100;
    func_0x00459f08(puVar17 + -0xd0,puVar17 + -0x88);
    if (uVar16 == 0) {
      uVar12 = 0;
      puVar21 = (undefined *)0x1;
    }
    else {
      puVar21 = &UNK_008b5821;
    }
    *(undefined **)(puVar17 + -0xb0) = puVar21;
    *(undefined8 *)(puVar17 + -0xa8) = uVar12;
    uVar10 = puVar9[2];
    uVar20 = puVar9[3];
    if (uVar10 == 0) {
      uVar16 = 0;
    }
    uVar14 = (ulong)(uVar10 != 0);
    *(ulong *)(puVar17 + -0x88) = uVar14;
    *(undefined8 *)(puVar17 + -0x80) = 0;
    *(ulong *)(puVar17 + -0x78) = uVar10;
    *(ulong *)(puVar17 + -0x70) = uVar20;
    *(ulong *)(puVar17 + -0x68) = uVar14;
    *(undefined8 *)(puVar17 + -0x60) = 0;
    *(ulong *)(puVar17 + -0x58) = uVar10;
    *(ulong *)(puVar17 + -0x50) = uVar20;
    *(ulong *)(puVar17 + -0x48) = uVar16;
    func_0x005d3050(puVar17 + -0xa0,puVar17 + -0x88,&UNK_008b5821,2);
    *(undefined1 **)(puVar17 + -0x100) = puVar17 + -0xd0;
    *(undefined **)(puVar17 + -0xf8) = &DAT_005c73c0;
    *(undefined1 **)(puVar17 + -0xf0) = puVar17 + -0xb0;
    *(undefined **)(puVar17 + -0xe8) = &DAT_005d1a0c;
    *(undefined1 **)(puVar17 + -0xe0) = puVar17 + -0xa0;
    *(undefined **)(puVar17 + -0xd8) = &DAT_005c73c0;
    *(undefined **)(puVar17 + -0x130) = &UNK_009f2860;
    *(undefined8 *)(puVar17 + -0x128) = 4;
    *(undefined1 **)(puVar17 + -0x120) = puVar17 + -0x100;
    *(undefined8 *)(puVar17 + -0x118) = 3;
    *(undefined8 *)(puVar17 + -0x110) = 0;
    func_0x00459f08(puVar17 + -0x148,puVar17 + -0x130);
    if (*(long *)(puVar17 + -0xa0) != 0) {
      func_0x00187bd4(*(undefined8 *)(puVar17 + -0x98),*(long *)(puVar17 + -0xa0),1);
    }
    if (*(long *)(puVar17 + -0xd0) != 0) {
      func_0x00187bd4(*(undefined8 *)(puVar17 + -200),*(long *)(puVar17 + -0xd0),1);
    }
    *(undefined8 *)(puVar17 + -0xf8) = *(undefined8 *)(puVar17 + -0x140);
    *(undefined8 *)(puVar17 + -0x100) = *(undefined8 *)(puVar17 + -0x148);
    *(undefined8 *)(puVar17 + -0xf0) = *(undefined8 *)(puVar17 + -0x138);
LAB_005c8630:
    *(undefined1 **)(puVar17 + -0x130) = puVar17 + -0x100;
    *(undefined **)(puVar17 + -0x128) = &DAT_005d2920;
    *(undefined **)(puVar17 + -0x88) = &UNK_007fc120;
    *(undefined8 *)(puVar17 + -0x80) = 1;
    *(undefined8 *)(puVar17 + -0x70) = 1;
    *(undefined8 *)(puVar17 + -0x68) = 0;
    *(undefined1 **)(puVar17 + -0x78) = puVar17 + -0x130;
    uVar10 = func_0x0046849c(*auVar4._8_8_,auVar4._8_8_[1],puVar17 + -0x88);
    lVar8 = *(long *)(puVar17 + -0x100);
    if ((lVar8 != -0x8000000000000000) && (lVar8 != 0)) {
      func_0x00187bd4(*(undefined8 *)(puVar17 + -0xf8),lVar8,1);
    }
    return uVar10;
  }
  *(undefined8 *)(puVar17 + -0x100) = 0;
  *(undefined8 *)(puVar17 + -0xf8) = 1;
  *(undefined8 *)(puVar17 + -0xf0) = 0;
  *(undefined8 *)(puVar17 + -0x78) = 0xe0000020;
  *(undefined1 **)(puVar17 + -0x88) = puVar17 + -0x100;
  *(undefined **)(puVar17 + -0x80) = &UNK_009f2700;
  auVar22._8_8_ = puVar17 + -0x88;
  auVar22._0_8_ = plVar13 + 6;
  puVar21 = &UNK_005c87d0;
  puVar17 = puVar17 + -0x160;
  auVar5 = auVar4;
  goto __ZN61__LT_ast__type_system__Type_u20_as_u20_core__fmt__Display_GT_3fmt17hba7027c6e9528beaE;
}

