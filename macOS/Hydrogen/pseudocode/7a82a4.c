
undefined8 FUN_007a82a4(void)

{
  long *plVar1;
  ulong uVar2;
  ulong uVar3;
  byte bVar4;
  long *plVar5;
  undefined8 uVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  long *plVar13;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  long lVar14;
  long lVar15;
  long lVar16;
  
  lVar7 = func_0x00187bd0();
  if (lVar7 == 0) {
    uVar6 = func_0x004584ec();
  }
  else {
    plVar1 = (long *)(lVar7 + unaff_x26);
    _memset(plVar1,0xff);
    uVar12 = unaff_x24 - 1;
    uVar2 = uVar12;
    if (8 < unaff_x24) {
      uVar2 = (unaff_x24 >> 3) * 7;
    }
    if (unaff_x22 == 0) {
      plVar13 = (long *)*unaff_x25;
    }
    else {
      lVar7 = 0;
      plVar13 = (long *)*unaff_x25;
      lVar14 = *plVar13;
      uVar8 = CONCAT17(-(-1 < lVar14),
                       CONCAT16(-(-1 < (char)((ulong)lVar14 >> 0x30)),
                                CONCAT15(-(-1 < (char)((ulong)lVar14 >> 0x28)),
                                         CONCAT14(-(-1 < (char)((ulong)lVar14 >> 0x20)),
                                                  CONCAT13(-(-1 < (char)((ulong)lVar14 >> 0x18)),
                                                           CONCAT12(-(-1 < (char)((ulong)lVar14 >>
                                                                                 0x10)),
                                                                    CONCAT11(-(-1 < (char)((ulong)
                                                  lVar14 >> 8)),-(-1 < (char)lVar14)))))))) &
              0x8080808080808080;
      plVar5 = plVar13;
      lVar14 = unaff_x22;
      do {
        while (uVar8 == 0) {
          lVar15 = plVar5[1];
          lVar7 = lVar7 + 8;
          plVar5 = plVar5 + 1;
          uVar8 = CONCAT17(-(-1 < lVar15),
                           CONCAT16(-(-1 < (char)((ulong)lVar15 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar15 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar15 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar15 >> 0x18))
                                                               ,CONCAT12(-(-1 < (char)((ulong)lVar15
                                                                                      >> 0x10)),
                                                                         CONCAT11(-(-1 < (char)((
                                                  ulong)lVar15 >> 8)),-(-1 < (char)lVar15)))))))) &
                  0x8080808080808080;
        }
        uVar3 = (uVar8 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar8 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
        uVar3 = lVar7 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3);
        uVar9 = (plVar13[uVar3 * -2 + -2] + 8) * 0x517cc1b727220a95;
        uVar10 = uVar9 & uVar12;
        lVar15 = *(long *)((long)plVar1 + uVar10);
        uVar11 = CONCAT17(-(lVar15 < 0),
                          CONCAT16(-((char)((ulong)lVar15 >> 0x30) < '\0'),
                                   CONCAT15(-((char)((ulong)lVar15 >> 0x28) < '\0'),
                                            CONCAT14(-((char)((ulong)lVar15 >> 0x20) < '\0'),
                                                     CONCAT13(-((char)((ulong)lVar15 >> 0x18) < '\0'
                                                               ),CONCAT12(-((char)((ulong)lVar15 >>
                                                                                  0x10) < '\0'),
                                                                          CONCAT11(-((char)((ulong)
                                                  lVar15 >> 8) < '\0'),-((char)lVar15 < '\0'))))))))
        ;
        if (uVar11 == 0) {
          lVar15 = 8;
          do {
            uVar10 = uVar10 + lVar15 & uVar12;
            lVar16 = *(long *)((long)plVar1 + uVar10);
            uVar11 = CONCAT17(-(lVar16 < 0),
                              CONCAT16(-((char)((ulong)lVar16 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar16 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar16 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar16 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar16 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar16 >> 8) < '\0'),
                                                           -((char)lVar16 < '\0'))))))));
            lVar15 = lVar15 + 8;
          } while (uVar11 == 0);
        }
        uVar11 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
        uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
        uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
        uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
        uVar10 = uVar10 + ((ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >> 3) & uVar12;
        if (-1 < *(char *)((long)plVar1 + uVar10)) {
          lVar15 = *plVar1;
          uVar10 = CONCAT17(-(lVar15 < 0),
                            CONCAT16(-((char)((ulong)lVar15 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar15 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar15 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar15 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar15 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar15 >> 8) < '\0'),
                                                           -((char)lVar15 < '\0'))))))));
          uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
          uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
          uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
          uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
          uVar10 = (ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3;
        }
        uVar8 = uVar8 - 1 & uVar8;
        bVar4 = (byte)(uVar9 >> 0x38);
        *(byte *)((long)plVar1 + uVar10) = bVar4 >> 1;
        *(byte *)((long)plVar1 + (uVar10 - 8 & uVar12) + 8) = bVar4 >> 1;
        lVar15 = plVar13[~uVar3 * 2];
        (plVar1 + ~uVar10 * 2)[1] = (plVar13 + ~uVar3 * 2)[1];
        plVar1[~uVar10 * 2] = lVar15;
        lVar14 = lVar14 + -1;
      } while (lVar14 != 0);
    }
    *unaff_x25 = (long)plVar1;
    unaff_x25[1] = uVar12;
    unaff_x25[2] = uVar2 - unaff_x22;
    if (unaff_x23 != 0) {
      lVar14 = unaff_x23 * 0x10 + 0x10;
      lVar7 = unaff_x23 + lVar14 + 9;
      if (lVar7 != 0) {
        func_0x00187bd4((long)plVar13 - lVar14,lVar7,8);
      }
    }
    uVar6 = 0x8000000000000001;
  }
  return uVar6;
}

