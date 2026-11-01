
undefined8 FUN_007a87dc(void)

{
  long *plVar1;
  long *plVar2;
  long *plVar3;
  ulong uVar4;
  ulong uVar5;
  byte bVar6;
  long *plVar7;
  undefined8 uVar8;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  long *plVar15;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  long lVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  
  lVar9 = func_0x00187bd0();
  if (lVar9 == 0) {
    uVar8 = func_0x004584ec();
  }
  else {
    plVar1 = (long *)(lVar9 + unaff_x26);
    _memset(plVar1,0xff);
    uVar14 = unaff_x24 - 1;
    uVar4 = uVar14;
    if (8 < unaff_x24) {
      uVar4 = (unaff_x24 >> 3) * 7;
    }
    if (unaff_x22 == 0) {
      plVar15 = (long *)*unaff_x25;
    }
    else {
      lVar9 = 0;
      plVar15 = (long *)*unaff_x25;
      lVar16 = *plVar15;
      uVar10 = CONCAT17(-(-1 < lVar16),
                        CONCAT16(-(-1 < (char)((ulong)lVar16 >> 0x30)),
                                 CONCAT15(-(-1 < (char)((ulong)lVar16 >> 0x28)),
                                          CONCAT14(-(-1 < (char)((ulong)lVar16 >> 0x20)),
                                                   CONCAT13(-(-1 < (char)((ulong)lVar16 >> 0x18)),
                                                            CONCAT12(-(-1 < (char)((ulong)lVar16 >>
                                                                                  0x10)),
                                                                     CONCAT11(-(-1 < (char)((ulong)
                                                  lVar16 >> 8)),-(-1 < (char)lVar16)))))))) &
               0x8080808080808080;
      plVar7 = plVar15;
      lVar16 = unaff_x22;
      do {
        while (uVar10 == 0) {
          lVar17 = plVar7[1];
          lVar9 = lVar9 + 8;
          plVar7 = plVar7 + 1;
          uVar10 = CONCAT17(-(-1 < lVar17),
                            CONCAT16(-(-1 < (char)((ulong)lVar17 >> 0x30)),
                                     CONCAT15(-(-1 < (char)((ulong)lVar17 >> 0x28)),
                                              CONCAT14(-(-1 < (char)((ulong)lVar17 >> 0x20)),
                                                       CONCAT13(-(-1 < (char)((ulong)lVar17 >> 0x18)
                                                                 ),CONCAT12(-(-1 < (char)((ulong)
                                                  lVar17 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar17 >> 8)),
                                                           -(-1 < (char)lVar17)))))))) &
                   0x8080808080808080;
        }
        uVar5 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        uVar5 = lVar9 + ((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3);
        uVar11 = (plVar15[uVar5 * -4 + -4] + 8) * 0x517cc1b727220a95;
        uVar12 = uVar11 & uVar14;
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
            uVar12 = uVar12 + lVar17 & uVar14;
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
        uVar12 = uVar12 + ((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3) & uVar14;
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
        uVar10 = uVar10 - 1 & uVar10;
        bVar6 = (byte)(uVar11 >> 0x38);
        *(byte *)((long)plVar1 + uVar12) = bVar6 >> 1;
        *(byte *)((long)plVar1 + (uVar12 - 8 & uVar14) + 8) = bVar6 >> 1;
        plVar2 = plVar15 + ~uVar5 * 4;
        lVar17 = *plVar2;
        lVar19 = plVar2[3];
        lVar18 = plVar2[2];
        plVar3 = plVar1 + ~uVar12 * 4;
        plVar3[1] = plVar2[1];
        *plVar3 = lVar17;
        plVar3[3] = lVar19;
        plVar3[2] = lVar18;
        lVar16 = lVar16 + -1;
      } while (lVar16 != 0);
    }
    *unaff_x25 = (long)plVar1;
    unaff_x25[1] = uVar14;
    unaff_x25[2] = uVar4 - unaff_x22;
    if (unaff_x23 != 0) {
      lVar16 = unaff_x23 * 0x20 + 0x20;
      lVar9 = unaff_x23 + lVar16 + 9;
      if (lVar9 != 0) {
        func_0x00187bd4((long)plVar15 - lVar16,lVar9,8);
      }
    }
    uVar8 = 0x8000000000000001;
  }
  return uVar8;
}

