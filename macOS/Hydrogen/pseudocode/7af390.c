
undefined8 FUN_007af390(long param_1)

{
  long *plVar1;
  ulong uVar2;
  ulong uVar3;
  byte bVar4;
  long *plVar5;
  ulong uVar6;
  ulong uVar7;
  long *unaff_x19;
  ulong uVar8;
  long *plVar9;
  ulong unaff_x24;
  ulong uVar10;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long lVar11;
  long lVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  
  plVar1 = (long *)(param_1 + unaff_x25);
  _memset(plVar1,0xff);
  uVar8 = unaff_x24 - 1;
  uVar2 = uVar8;
  if (8 < unaff_x24) {
    uVar2 = (unaff_x24 >> 3) * 7;
  }
  if (unaff_x26 == 0) {
    plVar9 = (long *)*unaff_x19;
    *unaff_x19 = (long)plVar1;
    unaff_x19[1] = uVar8;
    unaff_x19[2] = uVar2;
  }
  else {
    lVar11 = 0;
    plVar9 = (long *)*unaff_x19;
    lVar12 = *plVar9;
    uVar10 = CONCAT17(-(-1 < lVar12),
                      CONCAT16(-(-1 < (char)((ulong)lVar12 >> 0x30)),
                               CONCAT15(-(-1 < (char)((ulong)lVar12 >> 0x28)),
                                        CONCAT14(-(-1 < (char)((ulong)lVar12 >> 0x20)),
                                                 CONCAT13(-(-1 < (char)((ulong)lVar12 >> 0x18)),
                                                          CONCAT12(-(-1 < (char)((ulong)lVar12 >>
                                                                                0x10)),
                                                                   CONCAT11(-(-1 < (char)((ulong)
                                                  lVar12 >> 8)),-(-1 < (char)lVar12)))))))) &
             0x8080808080808080;
    plVar5 = plVar9;
    lVar12 = unaff_x26;
    do {
      while (uVar10 == 0) {
        lVar13 = plVar5[1];
        lVar11 = lVar11 + 8;
        plVar5 = plVar5 + 1;
        uVar10 = CONCAT17(-(-1 < lVar13),
                          CONCAT16(-(-1 < (char)((ulong)lVar13 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar13 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar13 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar13 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar13
                                                                                    >> 0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar13 >> 8)),-(-1 < (char)lVar13)))))))) &
                 0x8080808080808080;
      }
      uVar3 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
      uVar6 = func_0x005763e4();
      uVar7 = uVar6 & uVar8;
      lVar13 = *(long *)((long)plVar1 + uVar7);
      uVar14 = CONCAT17(-(lVar13 < 0),
                        CONCAT16(-((char)((ulong)lVar13 >> 0x30) < '\0'),
                                 CONCAT15(-((char)((ulong)lVar13 >> 0x28) < '\0'),
                                          CONCAT14(-((char)((ulong)lVar13 >> 0x20) < '\0'),
                                                   CONCAT13(-((char)((ulong)lVar13 >> 0x18) < '\0'),
                                                            CONCAT12(-((char)((ulong)lVar13 >> 0x10)
                                                                      < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar13 >> 8) < '\0'),-((char)lVar13 < '\0'))
                                                  ))))));
      if (uVar14 == 0) {
        lVar13 = 8;
        do {
          uVar7 = uVar7 + lVar13 & uVar8;
          lVar15 = *(long *)((long)plVar1 + uVar7);
          uVar14 = CONCAT17(-(lVar15 < 0),
                            CONCAT16(-((char)((ulong)lVar15 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar15 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar15 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar15 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar15 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar15 >> 8) < '\0'),
                                                           -((char)lVar15 < '\0'))))))));
          lVar13 = lVar13 + 8;
        } while (uVar14 == 0);
      }
      uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
      uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
      uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
      uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
      uVar7 = uVar7 + ((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3) & uVar8;
      if (-1 < *(char *)((long)plVar1 + uVar7)) {
        lVar13 = *plVar1;
        uVar7 = CONCAT17(-(lVar13 < 0),
                         CONCAT16(-((char)((ulong)lVar13 >> 0x30) < '\0'),
                                  CONCAT15(-((char)((ulong)lVar13 >> 0x28) < '\0'),
                                           CONCAT14(-((char)((ulong)lVar13 >> 0x20) < '\0'),
                                                    CONCAT13(-((char)((ulong)lVar13 >> 0x18) < '\0')
                                                             ,CONCAT12(-((char)((ulong)lVar13 >>
                                                                               0x10) < '\0'),
                                                                       CONCAT11(-((char)((ulong)
                                                  lVar13 >> 8) < '\0'),-((char)lVar13 < '\0'))))))))
        ;
        uVar7 = (uVar7 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar7 & 0x5555555555555555) << 1;
        uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
        uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
        uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
        uVar7 = (ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3;
      }
      uVar10 = uVar10 - 1 & uVar10;
      bVar4 = (byte)(uVar6 >> 0x38);
      *(byte *)((long)plVar1 + uVar7) = bVar4 >> 1;
      *(byte *)((long)plVar1 + (uVar7 - 8 & uVar8) + 8) = bVar4 >> 1;
      plVar1[~uVar7] = plVar9[~(lVar11 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3))];
      lVar12 = lVar12 + -1;
    } while (lVar12 != 0);
    *unaff_x19 = (long)plVar1;
    unaff_x19[1] = uVar8;
    unaff_x19[2] = uVar2 - unaff_x26;
  }
  if (unaff_x27 != 0) {
    lVar12 = unaff_x27 * 8 + 8;
    lVar11 = unaff_x27 + lVar12 + 9;
    if (lVar11 != 0) {
      func_0x00187bd4((long)plVar9 - lVar12,lVar11,8);
    }
  }
  return 0x8000000000000001;
}

