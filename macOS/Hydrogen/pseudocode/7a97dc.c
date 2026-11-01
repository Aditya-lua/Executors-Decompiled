
undefined8 FUN_007a97dc(void)

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
  long *plVar10;
  ulong uVar11;
  ulong uVar12;
  long *plVar13;
  ulong uVar14;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  long lVar15;
  long lVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  
  lVar7 = func_0x00187bd0();
  if (lVar7 == 0) {
    uVar6 = func_0x004584ec();
  }
  else {
    plVar1 = (long *)(lVar7 + unaff_x26);
    _memset(plVar1,0xff);
    uVar14 = unaff_x24 - 1;
    uVar2 = uVar14;
    if (8 < unaff_x24) {
      uVar2 = (unaff_x24 >> 3) * 7;
    }
    if (unaff_x22 == 0) {
      plVar13 = (long *)*unaff_x25;
    }
    else {
      lVar7 = 0;
      plVar13 = (long *)*unaff_x25;
      lVar15 = *plVar13;
      uVar8 = CONCAT17(-(-1 < lVar15),
                       CONCAT16(-(-1 < (char)((ulong)lVar15 >> 0x30)),
                                CONCAT15(-(-1 < (char)((ulong)lVar15 >> 0x28)),
                                         CONCAT14(-(-1 < (char)((ulong)lVar15 >> 0x20)),
                                                  CONCAT13(-(-1 < (char)((ulong)lVar15 >> 0x18)),
                                                           CONCAT12(-(-1 < (char)((ulong)lVar15 >>
                                                                                 0x10)),
                                                                    CONCAT11(-(-1 < (char)((ulong)
                                                  lVar15 >> 8)),-(-1 < (char)lVar15)))))))) &
              0x8080808080808080;
      plVar5 = plVar13;
      lVar15 = unaff_x22;
      do {
        while (uVar8 == 0) {
          lVar16 = plVar5[1];
          lVar7 = lVar7 + 8;
          plVar5 = plVar5 + 1;
          uVar8 = CONCAT17(-(-1 < lVar16),
                           CONCAT16(-(-1 < (char)((ulong)lVar16 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar16 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar16 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar16 >> 0x18))
                                                               ,CONCAT12(-(-1 < (char)((ulong)lVar16
                                                                                      >> 0x10)),
                                                                         CONCAT11(-(-1 < (char)((
                                                  ulong)lVar16 >> 8)),-(-1 < (char)lVar16)))))))) &
                  0x8080808080808080;
        }
        uVar3 = (uVar8 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar8 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
        uVar3 = lVar7 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3);
        uVar11 = (ulong)*(uint *)(plVar13 + uVar3 * -9 + -9) * 0x517cc1b727220a95 & uVar14;
        lVar16 = *(long *)((long)plVar1 + uVar11);
        uVar12 = CONCAT17(-(lVar16 < 0),
                          CONCAT16(-((char)((ulong)lVar16 >> 0x30) < '\0'),
                                   CONCAT15(-((char)((ulong)lVar16 >> 0x28) < '\0'),
                                            CONCAT14(-((char)((ulong)lVar16 >> 0x20) < '\0'),
                                                     CONCAT13(-((char)((ulong)lVar16 >> 0x18) < '\0'
                                                               ),CONCAT12(-((char)((ulong)lVar16 >>
                                                                                  0x10) < '\0'),
                                                                          CONCAT11(-((char)((ulong)
                                                  lVar16 >> 8) < '\0'),-((char)lVar16 < '\0'))))))))
        ;
        if (uVar12 == 0) {
          lVar16 = 8;
          do {
            uVar11 = uVar11 + lVar16 & uVar14;
            lVar17 = *(long *)((long)plVar1 + uVar11);
            uVar12 = CONCAT17(-(lVar17 < 0),
                              CONCAT16(-((char)((ulong)lVar17 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar17 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar17 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar17 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar17 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar17 >> 8) < '\0'),
                                                           -((char)lVar17 < '\0'))))))));
            lVar16 = lVar16 + 8;
          } while (uVar12 == 0);
        }
        uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
        uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
        uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
        uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
        uVar11 = uVar11 + ((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3) & uVar14;
        if (-1 < *(char *)((long)plVar1 + uVar11)) {
          lVar16 = *plVar1;
          uVar11 = CONCAT17(-(lVar16 < 0),
                            CONCAT16(-((char)((ulong)lVar16 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar16 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar16 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar16 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar16 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar16 >> 8) < '\0'),
                                                           -((char)lVar16 < '\0'))))))));
          uVar11 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
          uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
          uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
          uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
          uVar11 = (ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >> 3;
        }
        uVar8 = uVar8 - 1 & uVar8;
        bVar4 = (byte)((ulong)*(uint *)(plVar13 + uVar3 * -9 + -9) * 0x517cc1b727220a95 >> 0x38);
        *(byte *)((long)plVar1 + uVar11) = bVar4 >> 1;
        *(byte *)((long)plVar1 + (uVar11 - 8 & uVar14) + 8) = bVar4 >> 1;
        plVar9 = plVar13 + ~uVar3 * 9;
        plVar10 = plVar1 + ~uVar11 * 9;
        lVar16 = *plVar9;
        plVar10[1] = plVar9[1];
        *plVar10 = lVar16;
        lVar17 = plVar9[3];
        lVar16 = plVar9[2];
        lVar19 = plVar9[5];
        lVar18 = plVar9[4];
        lVar21 = plVar9[7];
        lVar20 = plVar9[6];
        plVar10[8] = plVar9[8];
        plVar10[5] = lVar19;
        plVar10[4] = lVar18;
        plVar10[7] = lVar21;
        plVar10[6] = lVar20;
        plVar10[3] = lVar17;
        plVar10[2] = lVar16;
        lVar15 = lVar15 + -1;
      } while (lVar15 != 0);
    }
    *unaff_x25 = (long)plVar1;
    unaff_x25[1] = uVar14;
    unaff_x25[2] = uVar2 - unaff_x22;
    if (unaff_x23 != 0) {
      lVar15 = unaff_x23 * 0x48 + 0x48;
      lVar7 = unaff_x23 + lVar15 + 9;
      if (lVar7 != 0) {
        func_0x00187bd4((long)plVar13 - lVar15,lVar7,8);
      }
    }
    uVar6 = 0x8000000000000001;
  }
  return uVar6;
}

