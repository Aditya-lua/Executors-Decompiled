
void FUN_00556c30(void)

{
  ulong uVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  byte bVar6;
  ulong uVar7;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  ulong unaff_x28;
  byte bVar8;
  byte bVar11;
  byte bVar12;
  byte bVar13;
  byte bVar14;
  byte bVar15;
  undefined8 uVar9;
  byte bVar16;
  long lVar10;
  long lVar17;
  long lVar18;
  long lVar19;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
code_r0x00556c30:
  func_0x005d2ac4(unaff_x20);
LAB_00556ad8:
  func_0x00553cb8(unaff_x20 + 1);
  do {
    if (unaff_x22 == in_stack_00000028) {
      *(long *)(unaff_x19 + 0x10) = in_stack_00000028 - unaff_x23;
      return;
    }
    unaff_x20 = (long *)(*(long *)(unaff_x19 + 8) + unaff_x22 * unaff_x26);
    plVar2 = unaff_x20;
    if (unaff_x27 == 0) {
      lVar3 = *unaff_x20;
    }
    else {
code_r0x00556bf4:
      lVar4 = 0;
      lVar3 = *plVar2;
      uVar5 = (lVar3 + 8) * unaff_x21;
      bVar6 = (byte)(uVar5 >> 0x39);
      while( true ) {
        uVar5 = uVar5 & unaff_x24;
        uVar9 = *(undefined8 *)(unaff_x25 + uVar5);
        bVar8 = (byte)((ulong)uVar9 >> 8);
        bVar11 = (byte)((ulong)uVar9 >> 0x10);
        bVar12 = (byte)((ulong)uVar9 >> 0x18);
        bVar13 = (byte)((ulong)uVar9 >> 0x20);
        bVar14 = (byte)((ulong)uVar9 >> 0x28);
        bVar15 = (byte)((ulong)uVar9 >> 0x30);
        bVar16 = (byte)((ulong)uVar9 >> 0x38);
        for (uVar1 = CONCAT17(-(bVar16 == bVar6),
                              CONCAT16(-(bVar15 == bVar6),
                                       CONCAT15(-(bVar14 == bVar6),
                                                CONCAT14(-(bVar13 == bVar6),
                                                         CONCAT13(-(bVar12 == bVar6),
                                                                  CONCAT12(-(bVar11 == bVar6),
                                                                           CONCAT11(-(bVar8 == bVar6
                                                                                     ),-((byte)uVar9
                                                                                        == bVar6))))
                                                        )))) & 0x8080808080808080; uVar1 != 0;
            uVar1 = uVar1 - 1 & uVar1) {
          uVar7 = (uVar1 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar1 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
          uVar7 = uVar5 + ((ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3) & unaff_x24;
          if (lVar3 == *(long *)(in_stack_00000020 + uVar7 * -0x10)) {
            plVar2 = (long *)(in_stack_00000018 + uVar7 * -0x10);
            goto code_r0x00556bf4;
          }
        }
        bVar8 = NEON_umaxv(CONCAT17(-(bVar16 == 0xff),
                                    CONCAT16(-(bVar15 == 0xff),
                                             CONCAT15(-(bVar14 == 0xff),
                                                      CONCAT14(-(bVar13 == 0xff),
                                                               CONCAT13(-(bVar12 == 0xff),
                                                                        CONCAT12(-(bVar11 == 0xff),
                                                                                 CONCAT11(-(bVar8 ==
                                                                                           0xff),-((
                                                  byte)uVar9 == 0xff)))))))),1);
        if ((bVar8 & 1) != 0) break;
        lVar4 = lVar4 + 8;
        uVar5 = uVar5 + lVar4;
      }
    }
    lVar4 = 0;
    uVar5 = (lVar3 + 8) * unaff_x21;
    bVar6 = (byte)(uVar5 >> 0x39);
    while( true ) {
      uVar5 = uVar5 & unaff_x28;
      uVar9 = *(undefined8 *)(in_stack_00000010 + uVar5);
      bVar8 = (byte)((ulong)uVar9 >> 8);
      bVar11 = (byte)((ulong)uVar9 >> 0x10);
      bVar12 = (byte)((ulong)uVar9 >> 0x18);
      bVar13 = (byte)((ulong)uVar9 >> 0x20);
      bVar14 = (byte)((ulong)uVar9 >> 0x28);
      bVar15 = (byte)((ulong)uVar9 >> 0x30);
      bVar16 = (byte)((ulong)uVar9 >> 0x38);
      for (uVar1 = CONCAT17(-(bVar16 == bVar6),
                            CONCAT16(-(bVar15 == bVar6),
                                     CONCAT15(-(bVar14 == bVar6),
                                              CONCAT14(-(bVar13 == bVar6),
                                                       CONCAT13(-(bVar12 == bVar6),
                                                                CONCAT12(-(bVar11 == bVar6),
                                                                         CONCAT11(-(bVar8 == bVar6),
                                                                                  -((byte)uVar9 ==
                                                                                   bVar6)))))))) &
                   0x8080808080808080; uVar1 != 0; uVar1 = uVar1 - 1 & uVar1) {
        uVar7 = (uVar1 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar1 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
        if (lVar3 == *(long *)(in_stack_00000008 +
                              (uVar5 + ((ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3) &
                              unaff_x28) * -8)) {
          unaff_x22 = unaff_x22 + 1;
          unaff_x23 = unaff_x23 + 1;
          lVar4 = *(long *)*unaff_x20;
          *(long *)*unaff_x20 = lVar4 + -1;
          LORelease();
          if (lVar4 == 1) goto code_r0x00556c30;
          goto LAB_00556ad8;
        }
      }
      bVar8 = NEON_umaxv(CONCAT17(-(bVar16 == 0xff),
                                  CONCAT16(-(bVar15 == 0xff),
                                           CONCAT15(-(bVar14 == 0xff),
                                                    CONCAT14(-(bVar13 == 0xff),
                                                             CONCAT13(-(bVar12 == 0xff),
                                                                      CONCAT12(-(bVar11 == 0xff),
                                                                               CONCAT11(-(bVar8 == 
                                                  0xff),-((byte)uVar9 == 0xff)))))))),1);
      if ((bVar8 & 1) != 0) break;
      lVar4 = lVar4 + 8;
      uVar5 = uVar5 + lVar4;
    }
    plVar2 = (long *)(*(long *)(unaff_x19 + 8) + (unaff_x22 - unaff_x23) * unaff_x26);
    lVar4 = *unaff_x20;
    plVar2[1] = unaff_x20[1];
    *plVar2 = lVar4;
    lVar3 = unaff_x20[3];
    lVar4 = unaff_x20[2];
    lVar17 = unaff_x20[5];
    lVar10 = unaff_x20[4];
    lVar19 = unaff_x20[7];
    lVar18 = unaff_x20[6];
    plVar2[8] = unaff_x20[8];
    plVar2[5] = lVar17;
    plVar2[4] = lVar10;
    plVar2[7] = lVar19;
    plVar2[6] = lVar18;
    plVar2[3] = lVar3;
    plVar2[2] = lVar4;
    unaff_x22 = unaff_x22 + 1;
  } while( true );
}

