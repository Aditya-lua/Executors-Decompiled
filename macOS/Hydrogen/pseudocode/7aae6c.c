
undefined8 FUN_007aae6c(long param_1)

{
  long *plVar1;
  ulong uVar2;
  ulong uVar3;
  byte bVar4;
  long *plVar5;
  ulong uVar6;
  long *plVar7;
  long *plVar8;
  ulong uVar9;
  ulong uVar10;
  long *plVar11;
  ulong uVar12;
  long lVar13;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  long lVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  
  plVar1 = (long *)(param_1 + unaff_x26);
  _memset(plVar1,0xff);
  uVar12 = unaff_x24 - 1;
  uVar2 = uVar12;
  if (8 < unaff_x24) {
    uVar2 = (unaff_x24 >> 3) * 7;
  }
  if (unaff_x22 == 0) {
    plVar11 = (long *)*unaff_x25;
  }
  else {
    lVar13 = 0;
    plVar11 = (long *)*unaff_x25;
    lVar14 = *plVar11;
    uVar6 = CONCAT17(-(-1 < lVar14),
                     CONCAT16(-(-1 < (char)((ulong)lVar14 >> 0x30)),
                              CONCAT15(-(-1 < (char)((ulong)lVar14 >> 0x28)),
                                       CONCAT14(-(-1 < (char)((ulong)lVar14 >> 0x20)),
                                                CONCAT13(-(-1 < (char)((ulong)lVar14 >> 0x18)),
                                                         CONCAT12(-(-1 < (char)((ulong)lVar14 >>
                                                                               0x10)),
                                                                  CONCAT11(-(-1 < (char)((ulong)
                                                  lVar14 >> 8)),-(-1 < (char)lVar14)))))))) &
            0x8080808080808080;
    plVar5 = plVar11;
    lVar14 = unaff_x22;
    do {
      while (uVar6 == 0) {
        lVar15 = plVar5[1];
        lVar13 = lVar13 + 8;
        plVar5 = plVar5 + 1;
        uVar6 = CONCAT17(-(-1 < lVar15),
                         CONCAT16(-(-1 < (char)((ulong)lVar15 >> 0x30)),
                                  CONCAT15(-(-1 < (char)((ulong)lVar15 >> 0x28)),
                                           CONCAT14(-(-1 < (char)((ulong)lVar15 >> 0x20)),
                                                    CONCAT13(-(-1 < (char)((ulong)lVar15 >> 0x18)),
                                                             CONCAT12(-(-1 < (char)((ulong)lVar15 >>
                                                                                   0x10)),
                                                                      CONCAT11(-(-1 < (char)((ulong)
                                                  lVar15 >> 8)),-(-1 < (char)lVar15)))))))) &
                0x8080808080808080;
      }
      uVar3 = (uVar6 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar6 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
      uVar3 = lVar13 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3);
      uVar9 = (ulong)*(uint *)(plVar11 + uVar3 * -0x19 + -0x19) * 0x517cc1b727220a95 & uVar12;
      lVar15 = *(long *)((long)plVar1 + uVar9);
      uVar10 = CONCAT17(-(lVar15 < 0),
                        CONCAT16(-((char)((ulong)lVar15 >> 0x30) < '\0'),
                                 CONCAT15(-((char)((ulong)lVar15 >> 0x28) < '\0'),
                                          CONCAT14(-((char)((ulong)lVar15 >> 0x20) < '\0'),
                                                   CONCAT13(-((char)((ulong)lVar15 >> 0x18) < '\0'),
                                                            CONCAT12(-((char)((ulong)lVar15 >> 0x10)
                                                                      < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar15 >> 8) < '\0'),-((char)lVar15 < '\0'))
                                                  ))))));
      if (uVar10 == 0) {
        lVar15 = 8;
        do {
          uVar9 = uVar9 + lVar15 & uVar12;
          lVar16 = *(long *)((long)plVar1 + uVar9);
          uVar10 = CONCAT17(-(lVar16 < 0),
                            CONCAT16(-((char)((ulong)lVar16 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar16 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar16 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar16 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar16 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar16 >> 8) < '\0'),
                                                           -((char)lVar16 < '\0'))))))));
          lVar15 = lVar15 + 8;
        } while (uVar10 == 0);
      }
      uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
      uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
      uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
      uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
      uVar9 = uVar9 + ((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) & uVar12;
      if (-1 < *(char *)((long)plVar1 + uVar9)) {
        lVar15 = *plVar1;
        uVar9 = CONCAT17(-(lVar15 < 0),
                         CONCAT16(-((char)((ulong)lVar15 >> 0x30) < '\0'),
                                  CONCAT15(-((char)((ulong)lVar15 >> 0x28) < '\0'),
                                           CONCAT14(-((char)((ulong)lVar15 >> 0x20) < '\0'),
                                                    CONCAT13(-((char)((ulong)lVar15 >> 0x18) < '\0')
                                                             ,CONCAT12(-((char)((ulong)lVar15 >>
                                                                               0x10) < '\0'),
                                                                       CONCAT11(-((char)((ulong)
                                                  lVar15 >> 8) < '\0'),-((char)lVar15 < '\0'))))))))
        ;
        uVar9 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
        uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
        uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
        uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
        uVar9 = (ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3;
      }
      uVar6 = uVar6 - 1 & uVar6;
      bVar4 = (byte)((ulong)*(uint *)(plVar11 + uVar3 * -0x19 + -0x19) * 0x517cc1b727220a95 >> 0x38)
      ;
      *(byte *)((long)plVar1 + uVar9) = bVar4 >> 1;
      *(byte *)((long)plVar1 + (uVar9 - 8 & uVar12) + 8) = bVar4 >> 1;
      plVar7 = plVar11 + ~uVar3 * 0x19;
      plVar8 = plVar1 + ~uVar9 * 0x19;
      lVar15 = *plVar7;
      plVar8[1] = plVar7[1];
      *plVar8 = lVar15;
      lVar16 = plVar7[3];
      lVar15 = plVar7[2];
      lVar18 = plVar7[5];
      lVar17 = plVar7[4];
      lVar19 = plVar7[6];
      lVar21 = plVar7[9];
      lVar20 = plVar7[8];
      plVar8[7] = plVar7[7];
      plVar8[6] = lVar19;
      plVar8[9] = lVar21;
      plVar8[8] = lVar20;
      plVar8[3] = lVar16;
      plVar8[2] = lVar15;
      plVar8[5] = lVar18;
      plVar8[4] = lVar17;
      lVar16 = plVar7[0xb];
      lVar15 = plVar7[10];
      lVar18 = plVar7[0xd];
      lVar17 = plVar7[0xc];
      lVar19 = plVar7[0xe];
      lVar21 = plVar7[0x11];
      lVar20 = plVar7[0x10];
      plVar8[0xf] = plVar7[0xf];
      plVar8[0xe] = lVar19;
      plVar8[0x11] = lVar21;
      plVar8[0x10] = lVar20;
      plVar8[0xb] = lVar16;
      plVar8[10] = lVar15;
      plVar8[0xd] = lVar18;
      plVar8[0xc] = lVar17;
      lVar16 = plVar7[0x13];
      lVar15 = plVar7[0x12];
      lVar18 = plVar7[0x15];
      lVar17 = plVar7[0x14];
      lVar20 = plVar7[0x17];
      lVar19 = plVar7[0x16];
      plVar8[0x18] = plVar7[0x18];
      plVar8[0x15] = lVar18;
      plVar8[0x14] = lVar17;
      plVar8[0x17] = lVar20;
      plVar8[0x16] = lVar19;
      plVar8[0x13] = lVar16;
      plVar8[0x12] = lVar15;
      lVar14 = lVar14 + -1;
    } while (lVar14 != 0);
  }
  *unaff_x25 = (long)plVar1;
  unaff_x25[1] = uVar12;
  unaff_x25[2] = uVar2 - unaff_x22;
  if (unaff_x23 != 0) {
    lVar14 = unaff_x23 * 200 + 200;
    lVar13 = unaff_x23 + lVar14 + 9;
    if (lVar13 != 0) {
      func_0x00187bd4((long)plVar11 - lVar14,lVar13,8);
    }
  }
  return 0x8000000000000001;
}

