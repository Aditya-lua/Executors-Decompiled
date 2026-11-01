
undefined8 FUN_007a8d48(void)

{
  ulong uVar1;
  ulong uVar2;
  byte bVar3;
  long *plVar4;
  ulong uVar5;
  long *plVar6;
  ulong uVar7;
  long *plVar8;
  ulong uVar9;
  ulong uVar10;
  long *plVar11;
  ulong uVar12;
  long lVar13;
  long *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long *unaff_x25;
  long lVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  long lVar18;
  
  _memset();
  uVar12 = unaff_x24 - 1;
  uVar1 = uVar12;
  if (8 < unaff_x24) {
    uVar1 = (unaff_x24 >> 3) * 7;
  }
  if (unaff_x22 == 0) {
    plVar11 = (long *)*unaff_x25;
  }
  else {
    lVar13 = 0;
    plVar11 = (long *)*unaff_x25;
    lVar14 = *plVar11;
    uVar5 = CONCAT17(-(-1 < lVar14),
                     CONCAT16(-(-1 < (char)((ulong)lVar14 >> 0x30)),
                              CONCAT15(-(-1 < (char)((ulong)lVar14 >> 0x28)),
                                       CONCAT14(-(-1 < (char)((ulong)lVar14 >> 0x20)),
                                                CONCAT13(-(-1 < (char)((ulong)lVar14 >> 0x18)),
                                                         CONCAT12(-(-1 < (char)((ulong)lVar14 >>
                                                                               0x10)),
                                                                  CONCAT11(-(-1 < (char)((ulong)
                                                  lVar14 >> 8)),-(-1 < (char)lVar14)))))))) &
            0x8080808080808080;
    plVar4 = plVar11;
    lVar14 = unaff_x22;
    do {
      while (uVar5 == 0) {
        lVar15 = plVar4[1];
        lVar13 = lVar13 + 8;
        plVar4 = plVar4 + 1;
        uVar5 = CONCAT17(-(-1 < lVar15),
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
      uVar2 = (uVar5 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar5 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
      uVar2 = lVar13 + ((ulong)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) >> 3);
      uVar7 = (plVar11[uVar2 * -5 + -5] + 8) * 0x517cc1b727220a95;
      uVar9 = uVar7 & uVar12;
      lVar15 = *(long *)((long)unaff_x19 + uVar9);
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
          lVar16 = *(long *)((long)unaff_x19 + uVar9);
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
      if (-1 < *(char *)((long)unaff_x19 + uVar9)) {
        lVar15 = *unaff_x19;
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
      bVar3 = (byte)(uVar7 >> 0x38);
      *(byte *)((long)unaff_x19 + uVar9) = bVar3 >> 1;
      *(byte *)((long)unaff_x19 + (uVar9 - 8 & uVar12) + 8) = bVar3 >> 1;
      uVar5 = uVar5 - 1 & uVar5;
      plVar6 = plVar11 + ~uVar2 * 5;
      lVar16 = plVar6[1];
      lVar15 = *plVar6;
      lVar18 = plVar6[3];
      lVar17 = plVar6[2];
      plVar8 = unaff_x19 + ~uVar9 * 5;
      plVar8[4] = plVar6[4];
      plVar8[1] = lVar16;
      *plVar8 = lVar15;
      plVar8[3] = lVar18;
      plVar8[2] = lVar17;
      lVar14 = lVar14 + -1;
    } while (lVar14 != 0);
  }
  *unaff_x25 = (long)unaff_x19;
  unaff_x25[1] = uVar12;
  unaff_x25[2] = uVar1 - unaff_x22;
  if (unaff_x23 != 0) {
    lVar14 = unaff_x23 * 0x28 + 0x28;
    lVar13 = unaff_x23 + lVar14 + 9;
    if (lVar13 != 0) {
      func_0x00187bd4((long)plVar11 - lVar14,lVar13,8);
    }
  }
  return 0x8000000000000001;
}

