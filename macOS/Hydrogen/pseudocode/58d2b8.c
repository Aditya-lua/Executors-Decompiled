
void FUN_0058d2b8(undefined *param_1)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  uint uVar7;
  code *pcVar8;
  long *plVar9;
  byte bVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  undefined8 *unaff_x19;
  long unaff_x20;
  ulong uVar17;
  long *unaff_x21;
  ulong uVar18;
  ulong unaff_x28;
  ulong uVar19;
  byte bVar20;
  byte bVar21;
  byte bVar22;
  byte bVar23;
  byte bVar24;
  byte bVar25;
  byte bVar26;
  undefined8 uVar27;
  long lStack0000000000000000;
  long lStack0000000000000010;
  ulong uStack0000000000000018;
  long lStack0000000000000020;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  long lStack0000000000000038;
  
  uVar19 = unaff_x28 & 0xffffffffffff | 0x517c000000000000;
  plVar9 = (long *)*unaff_x19;
  lVar2 = *unaff_x21;
  uVar5 = unaff_x21[1];
  uVar18 = (long)(plVar9 + 1) * uVar19;
  bVar10 = (byte)(uVar18 >> 0x39);
  lStack0000000000000020 = lVar2 + -200;
  lVar3 = *(long *)(unaff_x20 + 0x38);
  uVar6 = *(ulong *)(unaff_x20 + 0x40);
  lStack0000000000000010 = lVar2 + -0x20;
  lStack0000000000000000 = *(long *)(unaff_x20 + 0x20);
  uStack0000000000000018 = *(ulong *)(unaff_x20 + 0x28);
  lStack0000000000000038 = 1;
LAB_0058d36c:
  lVar11 = 0;
  lStack0000000000000038 = lStack0000000000000038 + -1;
  uVar7 = *(uint *)(in_stack_00000030 + lStack0000000000000038 * 4);
  uVar17 = (ulong)uVar7;
  bVar20 = (byte)(uVar17 * uVar19 >> 0x39);
  uVar13 = uVar17 * uVar19 & uVar5;
  uVar27 = *(undefined8 *)(lVar2 + uVar13);
  uVar16 = CONCAT17(-((byte)((ulong)uVar27 >> 0x38) == bVar20),
                    CONCAT16(-((byte)((ulong)uVar27 >> 0x30) == bVar20),
                             CONCAT15(-((byte)((ulong)uVar27 >> 0x28) == bVar20),
                                      CONCAT14(-((byte)((ulong)uVar27 >> 0x20) == bVar20),
                                               CONCAT13(-((byte)((ulong)uVar27 >> 0x18) == bVar20),
                                                        CONCAT12(-((byte)((ulong)uVar27 >> 0x10) ==
                                                                  bVar20),CONCAT11(-((byte)((ulong)
                                                  uVar27 >> 8) == bVar20),-((byte)uVar27 == bVar20))
                                                  )))))) & 0x8080808080808080;
  while( true ) {
    while (uVar16 == 0) {
      param_1 = &UNK_009f0f90;
      bVar26 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar27 >> 0x38) == -1),
                                   CONCAT16(-((char)((ulong)uVar27 >> 0x30) == -1),
                                            CONCAT15(-((char)((ulong)uVar27 >> 0x28) == -1),
                                                     CONCAT14(-((char)((ulong)uVar27 >> 0x20) == -1)
                                                              ,CONCAT13(-((char)((ulong)uVar27 >>
                                                                                0x18) == -1),
                                                                        CONCAT12(-((char)((ulong)
                                                  uVar27 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar27 >> 8) == -1),
                                                           -((char)uVar27 == -1)))))))),1);
      if ((bVar26 & 1) != 0) goto LAB_0058d7a8;
      lVar11 = lVar11 + 8;
      uVar13 = uVar13 + lVar11 & uVar5;
      uVar27 = *(undefined8 *)(lVar2 + uVar13);
      uVar16 = CONCAT17(-((byte)((ulong)uVar27 >> 0x38) == bVar20),
                        CONCAT16(-((byte)((ulong)uVar27 >> 0x30) == bVar20),
                                 CONCAT15(-((byte)((ulong)uVar27 >> 0x28) == bVar20),
                                          CONCAT14(-((byte)((ulong)uVar27 >> 0x20) == bVar20),
                                                   CONCAT13(-((byte)((ulong)uVar27 >> 0x18) ==
                                                             bVar20),CONCAT12(-((byte)((ulong)uVar27
                                                                                      >> 0x10) ==
                                                                               bVar20),CONCAT11(-((
                                                  byte)((ulong)uVar27 >> 8) == bVar20),
                                                  -((byte)uVar27 == bVar20)))))))) &
               0x8080808080808080;
    }
    uVar14 = (uVar16 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar16 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
    uVar14 = uVar13 + ((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3) & uVar5;
    if (uVar7 == *(uint *)(lStack0000000000000020 + uVar14 * -200)) break;
    uVar16 = uVar16 - 1 & uVar16;
  }
  lVar11 = lVar2 + uVar14 * -200;
  if (*(long *)(lVar11 + -0x88) != 0) {
    lVar12 = 0;
    uVar16 = uVar18;
    while( true ) {
      uVar16 = uVar16 & *(ulong *)(lVar11 + -0x98);
      uVar27 = *(undefined8 *)(*(long *)(lVar11 + -0xa0) + uVar16);
      bVar20 = (byte)((ulong)uVar27 >> 8);
      bVar26 = (byte)((ulong)uVar27 >> 0x10);
      bVar21 = (byte)((ulong)uVar27 >> 0x18);
      bVar22 = (byte)((ulong)uVar27 >> 0x20);
      bVar23 = (byte)((ulong)uVar27 >> 0x28);
      bVar24 = (byte)((ulong)uVar27 >> 0x30);
      bVar25 = (byte)((ulong)uVar27 >> 0x38);
      for (uVar13 = CONCAT17(-(bVar25 == bVar10),
                             CONCAT16(-(bVar24 == bVar10),
                                      CONCAT15(-(bVar23 == bVar10),
                                               CONCAT14(-(bVar22 == bVar10),
                                                        CONCAT13(-(bVar21 == bVar10),
                                                                 CONCAT12(-(bVar26 == bVar10),
                                                                          CONCAT11(-(bVar20 ==
                                                                                    bVar10),-((byte)
                                                  uVar27 == bVar10)))))))) & 0x8080808080808080;
          uVar13 != 0; uVar13 = uVar13 - 1 & uVar13) {
        uVar14 = (uVar13 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar13 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
        if (plVar9 == (long *)**(undefined8 **)
                                (*(long *)(lVar11 + -0xa0) + -8 +
                                (uVar16 + ((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3) &
                                *(ulong *)(lVar11 + -0x98)) * -8)) goto LAB_0058d738;
      }
      bVar20 = NEON_umaxv(CONCAT17(-(bVar25 == 0xff),
                                   CONCAT16(-(bVar24 == 0xff),
                                            CONCAT15(-(bVar23 == 0xff),
                                                     CONCAT14(-(bVar22 == 0xff),
                                                              CONCAT13(-(bVar21 == 0xff),
                                                                       CONCAT12(-(bVar26 == 0xff),
                                                                                CONCAT11(-(bVar20 ==
                                                                                          0xff),-((
                                                  byte)uVar27 == 0xff)))))))),1);
      if ((bVar20 & 1) != 0) break;
      lVar12 = lVar12 + 8;
      uVar16 = uVar16 + lVar12;
    }
  }
  if (*(long *)(lVar11 + -0x28) != 0) {
    lVar12 = 0;
    lVar4 = *(long *)(lVar11 + -0x40);
    uVar13 = *(ulong *)(lVar11 + -0x38);
    uVar14 = uVar18 & uVar13;
    uVar27 = *(undefined8 *)(lVar4 + uVar14);
    uVar16 = CONCAT17(-((byte)((ulong)uVar27 >> 0x38) == bVar10),
                      CONCAT16(-((byte)((ulong)uVar27 >> 0x30) == bVar10),
                               CONCAT15(-((byte)((ulong)uVar27 >> 0x28) == bVar10),
                                        CONCAT14(-((byte)((ulong)uVar27 >> 0x20) == bVar10),
                                                 CONCAT13(-((byte)((ulong)uVar27 >> 0x18) == bVar10)
                                                          ,CONCAT12(-((byte)((ulong)uVar27 >> 0x10)
                                                                     == bVar10),
                                                                    CONCAT11(-((byte)((ulong)uVar27
                                                                                     >> 8) == bVar10
                                                                              ),-((byte)uVar27 ==
                                                                                 bVar10)))))))) &
             0x8080808080808080;
    while( true ) {
      for (; uVar16 != 0; uVar16 = uVar16 - 1 & uVar16) {
        uVar15 = (uVar16 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar16 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
        if (plVar9 == *(long **)(lVar4 + -8 +
                                (uVar14 + ((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) &
                                uVar13) * -8)) goto LAB_0058d738;
      }
      bVar20 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar27 >> 0x38) == -1),
                                   CONCAT16(-((char)((ulong)uVar27 >> 0x30) == -1),
                                            CONCAT15(-((char)((ulong)uVar27 >> 0x28) == -1),
                                                     CONCAT14(-((char)((ulong)uVar27 >> 0x20) == -1)
                                                              ,CONCAT13(-((char)((ulong)uVar27 >>
                                                                                0x18) == -1),
                                                                        CONCAT12(-((char)((ulong)
                                                  uVar27 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar27 >> 8) == -1),
                                                           -((char)uVar27 == -1)))))))),1);
      if ((bVar20 & 1) != 0) break;
      lVar12 = lVar12 + 8;
      uVar14 = uVar14 + lVar12 & uVar13;
      uVar27 = *(undefined8 *)(lVar4 + uVar14);
      uVar16 = CONCAT17(-((byte)((ulong)uVar27 >> 0x38) == bVar10),
                        CONCAT16(-((byte)((ulong)uVar27 >> 0x30) == bVar10),
                                 CONCAT15(-((byte)((ulong)uVar27 >> 0x28) == bVar10),
                                          CONCAT14(-((byte)((ulong)uVar27 >> 0x20) == bVar10),
                                                   CONCAT13(-((byte)((ulong)uVar27 >> 0x18) ==
                                                             bVar10),CONCAT12(-((byte)((ulong)uVar27
                                                                                      >> 0x10) ==
                                                                               bVar10),CONCAT11(-((
                                                  byte)((ulong)uVar27 >> 8) == bVar10),
                                                  -((byte)uVar27 == bVar10)))))))) &
               0x8080808080808080;
    }
  }
  lVar12 = *plVar9;
  *plVar9 = lVar12 + 1;
  if (-1 < lVar12) {
    param_1 = (undefined *)func_0x00563744(lVar11 + -0x40);
    if (*(long *)(lVar11 + -0x48) != 0) {
      lVar12 = 0;
      lVar4 = *(long *)(lVar11 + -0x60);
      uVar13 = *(ulong *)(lVar11 + -0x58);
      uVar14 = uVar18 & uVar13;
      uVar27 = *(undefined8 *)(lVar4 + uVar14);
      uVar16 = CONCAT17(-((byte)((ulong)uVar27 >> 0x38) == bVar10),
                        CONCAT16(-((byte)((ulong)uVar27 >> 0x30) == bVar10),
                                 CONCAT15(-((byte)((ulong)uVar27 >> 0x28) == bVar10),
                                          CONCAT14(-((byte)((ulong)uVar27 >> 0x20) == bVar10),
                                                   CONCAT13(-((byte)((ulong)uVar27 >> 0x18) ==
                                                             bVar10),CONCAT12(-((byte)((ulong)uVar27
                                                                                      >> 0x10) ==
                                                                               bVar10),CONCAT11(-((
                                                  byte)((ulong)uVar27 >> 8) == bVar10),
                                                  -((byte)uVar27 == bVar10)))))))) &
               0x8080808080808080;
      while( true ) {
        for (; uVar16 != 0; uVar16 = uVar16 - 1 & uVar16) {
          uVar15 = (uVar16 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar16 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
          if (plVar9 == (long *)**(undefined8 **)
                                  (lVar4 + -8 +
                                  (uVar14 + ((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) &
                                  uVar13) * -8)) goto LAB_0058d738;
        }
        bVar20 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar27 >> 0x38) == -1),
                                     CONCAT16(-((char)((ulong)uVar27 >> 0x30) == -1),
                                              CONCAT15(-((char)((ulong)uVar27 >> 0x28) == -1),
                                                       CONCAT14(-((char)((ulong)uVar27 >> 0x20) ==
                                                                 -1),CONCAT13(-((char)((ulong)uVar27
                                                                                      >> 0x18) == -1
                                                                               ),CONCAT12(-((char)((
                                                  ulong)uVar27 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar27 >> 8) == -1),
                                                           -((char)uVar27 == -1)))))))),1);
        if ((bVar20 & 1) != 0) break;
        lVar12 = lVar12 + 8;
        uVar14 = uVar14 + lVar12 & uVar13;
        uVar27 = *(undefined8 *)(lVar4 + uVar14);
        uVar16 = CONCAT17(-((byte)((ulong)uVar27 >> 0x38) == bVar10),
                          CONCAT16(-((byte)((ulong)uVar27 >> 0x30) == bVar10),
                                   CONCAT15(-((byte)((ulong)uVar27 >> 0x28) == bVar10),
                                            CONCAT14(-((byte)((ulong)uVar27 >> 0x20) == bVar10),
                                                     CONCAT13(-((byte)((ulong)uVar27 >> 0x18) ==
                                                               bVar10),CONCAT12(-((byte)((ulong)
                                                  uVar27 >> 0x10) == bVar10),
                                                  CONCAT11(-((byte)((ulong)uVar27 >> 8) == bVar10),
                                                           -((byte)uVar27 == bVar10)))))))) &
                 0x8080808080808080;
      }
    }
    if (uVar17 < uStack0000000000000018) {
      plVar1 = (long *)(lStack0000000000000000 + uVar17 * 0x20);
      if (*plVar1 == -0x8000000000000000) {
        uVar16 = 0xffffffff;
      }
      else {
        uVar16 = (ulong)*(uint *)((long)plVar1 + 0x1c);
      }
    }
    else {
      uVar16 = 0xffffffff;
    }
    uVar13 = 0xffffffff;
    if (uVar6 < 0x100000000) goto LAB_0058d5f0;
    do {
      lVar11 = lVar3 + uVar13 * 0x30;
      uVar13 = (ulong)*(uint *)(lVar11 + 0x20);
      uVar7 = *(uint *)(lVar11 + 0x2c);
      while( true ) {
        lVar11 = 0;
        uVar14 = uVar7 * uVar19;
        bVar20 = (byte)(uVar14 >> 0x39);
        uVar14 = uVar14 & uVar5;
        uVar27 = *(undefined8 *)(lVar2 + uVar14);
        uVar17 = CONCAT17(-((byte)((ulong)uVar27 >> 0x38) == bVar20),
                          CONCAT16(-((byte)((ulong)uVar27 >> 0x30) == bVar20),
                                   CONCAT15(-((byte)((ulong)uVar27 >> 0x28) == bVar20),
                                            CONCAT14(-((byte)((ulong)uVar27 >> 0x20) == bVar20),
                                                     CONCAT13(-((byte)((ulong)uVar27 >> 0x18) ==
                                                               bVar20),CONCAT12(-((byte)((ulong)
                                                  uVar27 >> 0x10) == bVar20),
                                                  CONCAT11(-((byte)((ulong)uVar27 >> 8) == bVar20),
                                                           -((byte)uVar27 == bVar20)))))))) &
                 0x8080808080808080;
        while( true ) {
          while (uVar17 == 0) {
            bVar26 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar27 >> 0x38) == -1),
                                         CONCAT16(-((char)((ulong)uVar27 >> 0x30) == -1),
                                                  CONCAT15(-((char)((ulong)uVar27 >> 0x28) == -1),
                                                           CONCAT14(-((char)((ulong)uVar27 >> 0x20)
                                                                     == -1),CONCAT13(-((char)((ulong
                                                  )uVar27 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar27 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar27 >> 8) ==
                                                                     -1),-((char)uVar27 == -1)))))))
                                        ),1);
            param_1 = &UNK_009f0fa8;
            if ((bVar26 & 1) != 0) goto LAB_0058d7a8;
            lVar11 = lVar11 + 8;
            uVar14 = uVar14 + lVar11 & uVar5;
            uVar27 = *(undefined8 *)(lVar2 + uVar14);
            uVar17 = CONCAT17(-((byte)((ulong)uVar27 >> 0x38) == bVar20),
                              CONCAT16(-((byte)((ulong)uVar27 >> 0x30) == bVar20),
                                       CONCAT15(-((byte)((ulong)uVar27 >> 0x28) == bVar20),
                                                CONCAT14(-((byte)((ulong)uVar27 >> 0x20) == bVar20),
                                                         CONCAT13(-((byte)((ulong)uVar27 >> 0x18) ==
                                                                   bVar20),CONCAT12(-((byte)((ulong)
                                                  uVar27 >> 0x10) == bVar20),
                                                  CONCAT11(-((byte)((ulong)uVar27 >> 8) == bVar20),
                                                           -((byte)uVar27 == bVar20)))))))) &
                     0x8080808080808080;
          }
          uVar15 = (uVar17 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar17 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
          uVar15 = uVar14 + ((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) & uVar5;
          if ((ulong)uVar7 == (ulong)*(uint *)(lStack0000000000000020 + uVar15 * -200)) break;
          uVar17 = uVar17 - 1 & uVar17;
        }
        lVar11 = *plVar9;
        *plVar9 = lVar11 + 1;
        if (lVar11 < 0) goto LAB_0058d794;
        param_1 = (undefined *)func_0x00563744(lStack0000000000000010 + uVar15 * -200);
        lVar11 = lStack0000000000000038;
        if (lStack0000000000000038 == uStack0000000000000028) {
          param_1 = (undefined *)func_0x005bcf2c(&uStack0000000000000028,&UNK_009f0fc0);
        }
        *(uint *)(in_stack_00000030 + lVar11 * 4) = uVar7;
        lStack0000000000000038 = lVar11 + 1;
        if (uVar13 < uVar6) break;
LAB_0058d5f0:
        do {
          if (uVar6 <= uVar16) goto LAB_0058d738;
          lVar11 = lVar3 + uVar16 * 0x30;
          uVar16 = (ulong)*(uint *)(lVar11 + 0x24);
          uVar7 = *(uint *)(lVar11 + 0x28);
        } while (uVar7 == 0xffffffff);
      }
    } while( true );
  }
LAB_0058d794:
  func_0x007a05dc(param_1);
  goto LAB_0058d7ac;
LAB_0058d738:
  if (lStack0000000000000038 == 0) {
    if (uStack0000000000000028 != 0) {
      func_0x00187bd4(in_stack_00000030,uStack0000000000000028 << 2,4);
    }
    return;
  }
  goto LAB_0058d36c;
LAB_0058d7a8:
  func_0x007a23bc();
LAB_0058d7ac:
                    /* WARNING: Does not return */
  pcVar8 = (code *)SoftwareBreakpoint(1,0x58d7b0);
  (*pcVar8)();
}

