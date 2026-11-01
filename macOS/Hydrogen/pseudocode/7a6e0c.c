
undefined8 FUN_007a6e0c(void)

{
  long *plVar1;
  ulong uVar2;
  ulong uVar3;
  byte bVar4;
  long *plVar5;
  undefined8 uVar6;
  long lVar7;
  ulong uVar8;
  long *plVar9;
  ulong uVar10;
  long *plVar11;
  ulong uVar12;
  ulong uVar13;
  long *plVar14;
  ulong uVar15;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  long lVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  
  lVar7 = func_0x00187bd0();
  if (lVar7 == 0) {
    uVar6 = func_0x004584ec();
  }
  else {
    plVar1 = (long *)(lVar7 + unaff_x26);
    _memset(plVar1,0xff);
    uVar15 = unaff_x24 - 1;
    uVar2 = uVar15;
    if (8 < unaff_x24) {
      uVar2 = (unaff_x24 >> 3) * 7;
    }
    if (unaff_x22 == 0) {
      plVar14 = (long *)*unaff_x25;
    }
    else {
      lVar7 = 0;
      plVar14 = (long *)*unaff_x25;
      lVar16 = *plVar14;
      uVar8 = CONCAT17(-(-1 < lVar16),
                       CONCAT16(-(-1 < (char)((ulong)lVar16 >> 0x30)),
                                CONCAT15(-(-1 < (char)((ulong)lVar16 >> 0x28)),
                                         CONCAT14(-(-1 < (char)((ulong)lVar16 >> 0x20)),
                                                  CONCAT13(-(-1 < (char)((ulong)lVar16 >> 0x18)),
                                                           CONCAT12(-(-1 < (char)((ulong)lVar16 >>
                                                                                 0x10)),
                                                                    CONCAT11(-(-1 < (char)((ulong)
                                                  lVar16 >> 8)),-(-1 < (char)lVar16)))))))) &
              0x8080808080808080;
      plVar5 = plVar14;
      lVar16 = unaff_x22;
      do {
        while (uVar8 == 0) {
          lVar17 = plVar5[1];
          lVar7 = lVar7 + 8;
          plVar5 = plVar5 + 1;
          uVar8 = CONCAT17(-(-1 < lVar17),
                           CONCAT16(-(-1 < (char)((ulong)lVar17 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar17 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar17 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar17 >> 0x18))
                                                               ,CONCAT12(-(-1 < (char)((ulong)lVar17
                                                                                      >> 0x10)),
                                                                         CONCAT11(-(-1 < (char)((
                                                  ulong)lVar17 >> 8)),-(-1 < (char)lVar17)))))))) &
                  0x8080808080808080;
        }
        uVar3 = (uVar8 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar8 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
        uVar3 = lVar7 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3);
        uVar10 = (plVar14[uVar3 * -5 + -5] + 8) * 0x517cc1b727220a95;
        uVar12 = uVar10 & uVar15;
        lVar17 = *(long *)((long)plVar1 + uVar12);
        uVar13 = CONCAT17(-(lVar17 < 0),
                          CONCAT16(-((char)((ulong)lVar17 >> 0x30) < '\0'),
                                   CONCAT15(-((char)((ulong)lVar17 >> 0x28) < '\0'),
                                            CONCAT14(-((char)((ulong)lVar17 >> 0x20) < '\0'),
                                                     CONCAT13(-((char)((ulong)lVar17 >> 0x18) < '\0'
                                                               ),CONCAT12(-((char)((ulong)lVar17 >>
                                                                                  0x10) < '\0'),
                                                                          CONCAT11(-((char)((ulong)
                                                  lVar17 >> 8) < '\0'),-((char)lVar17 < '\0'))))))))
        ;
        if (uVar13 == 0) {
          lVar17 = 8;
          do {
            uVar12 = uVar12 + lVar17 & uVar15;
            lVar18 = *(long *)((long)plVar1 + uVar12);
            uVar13 = CONCAT17(-(lVar18 < 0),
                              CONCAT16(-((char)((ulong)lVar18 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar18 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar18 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar18 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar18 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar18 >> 8) < '\0'),
                                                           -((char)lVar18 < '\0'))))))));
            lVar17 = lVar17 + 8;
          } while (uVar13 == 0);
        }
        uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
        uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
        uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
        uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
        uVar12 = uVar12 + ((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3) & uVar15;
        if (-1 < *(char *)((long)plVar1 + uVar12)) {
          lVar17 = *plVar1;
          uVar12 = CONCAT17(-(lVar17 < 0),
                            CONCAT16(-((char)((ulong)lVar17 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar17 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar17 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar17 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar17 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar17 >> 8) < '\0'),
                                                           -((char)lVar17 < '\0'))))))));
          uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
          uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
          uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
          uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
          uVar12 = (ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3;
        }
        bVar4 = (byte)(uVar10 >> 0x38);
        *(byte *)((long)plVar1 + uVar12) = bVar4 >> 1;
        *(byte *)((long)plVar1 + (uVar12 - 8 & uVar15) + 8) = bVar4 >> 1;
        uVar8 = uVar8 - 1 & uVar8;
        plVar9 = plVar14 + ~uVar3 * 5;
        lVar18 = plVar9[1];
        lVar17 = *plVar9;
        lVar20 = plVar9[3];
        lVar19 = plVar9[2];
        plVar11 = plVar1 + ~uVar12 * 5;
        plVar11[4] = plVar9[4];
        plVar11[1] = lVar18;
        *plVar11 = lVar17;
        plVar11[3] = lVar20;
        plVar11[2] = lVar19;
        lVar16 = lVar16 + -1;
      } while (lVar16 != 0);
    }
    *unaff_x25 = (long)plVar1;
    unaff_x25[1] = uVar15;
    unaff_x25[2] = uVar2 - unaff_x22;
    if (unaff_x23 != 0) {
      lVar16 = unaff_x23 * 0x28 + 0x28;
      lVar7 = unaff_x23 + lVar16 + 9;
      if (lVar7 != 0) {
        func_0x00187bd4((long)plVar14 - lVar16,lVar7,8);
      }
    }
    uVar6 = 0x8000000000000001;
  }
  return uVar6;
}

