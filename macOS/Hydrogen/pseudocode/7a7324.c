
undefined8 FUN_007a7324(long param_1)

{
  long *plVar1;
  ulong uVar2;
  ulong uVar3;
  byte bVar4;
  long *plVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  long *plVar9;
  long lVar10;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  long lVar11;
  long lVar12;
  ulong uVar13;
  long lVar14;
  
  plVar1 = (long *)(param_1 + unaff_x26);
  _memset(plVar1,0xff);
  uVar8 = unaff_x24 - 1;
  uVar2 = uVar8;
  if (8 < unaff_x24) {
    uVar2 = (unaff_x24 >> 3) * 7;
  }
  if (unaff_x22 == 0) {
    plVar9 = (long *)*unaff_x25;
  }
  else {
    lVar10 = 0;
    plVar9 = (long *)*unaff_x25;
    lVar11 = *plVar9;
    uVar6 = CONCAT17(-(-1 < lVar11),
                     CONCAT16(-(-1 < (char)((ulong)lVar11 >> 0x30)),
                              CONCAT15(-(-1 < (char)((ulong)lVar11 >> 0x28)),
                                       CONCAT14(-(-1 < (char)((ulong)lVar11 >> 0x20)),
                                                CONCAT13(-(-1 < (char)((ulong)lVar11 >> 0x18)),
                                                         CONCAT12(-(-1 < (char)((ulong)lVar11 >>
                                                                               0x10)),
                                                                  CONCAT11(-(-1 < (char)((ulong)
                                                  lVar11 >> 8)),-(-1 < (char)lVar11)))))))) &
            0x8080808080808080;
    plVar5 = plVar9;
    lVar11 = unaff_x22;
    do {
      while (uVar6 == 0) {
        lVar12 = plVar5[1];
        lVar10 = lVar10 + 8;
        plVar5 = plVar5 + 1;
        uVar6 = CONCAT17(-(-1 < lVar12),
                         CONCAT16(-(-1 < (char)((ulong)lVar12 >> 0x30)),
                                  CONCAT15(-(-1 < (char)((ulong)lVar12 >> 0x28)),
                                           CONCAT14(-(-1 < (char)((ulong)lVar12 >> 0x20)),
                                                    CONCAT13(-(-1 < (char)((ulong)lVar12 >> 0x18)),
                                                             CONCAT12(-(-1 < (char)((ulong)lVar12 >>
                                                                                   0x10)),
                                                                      CONCAT11(-(-1 < (char)((ulong)
                                                  lVar12 >> 8)),-(-1 < (char)lVar12)))))))) &
                0x8080808080808080;
      }
      uVar3 = (uVar6 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar6 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
      uVar3 = lVar10 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3);
      uVar7 = plVar9[-1 - uVar3] * 0x517cc1b727220a95 & uVar8;
      lVar12 = *(long *)((long)plVar1 + uVar7);
      uVar13 = CONCAT17(-(lVar12 < 0),
                        CONCAT16(-((char)((ulong)lVar12 >> 0x30) < '\0'),
                                 CONCAT15(-((char)((ulong)lVar12 >> 0x28) < '\0'),
                                          CONCAT14(-((char)((ulong)lVar12 >> 0x20) < '\0'),
                                                   CONCAT13(-((char)((ulong)lVar12 >> 0x18) < '\0'),
                                                            CONCAT12(-((char)((ulong)lVar12 >> 0x10)
                                                                      < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar12 >> 8) < '\0'),-((char)lVar12 < '\0'))
                                                  ))))));
      if (uVar13 == 0) {
        lVar12 = 8;
        do {
          uVar7 = uVar7 + lVar12 & uVar8;
          lVar14 = *(long *)((long)plVar1 + uVar7);
          uVar13 = CONCAT17(-(lVar14 < 0),
                            CONCAT16(-((char)((ulong)lVar14 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar14 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar14 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar14 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar14 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar14 >> 8) < '\0'),
                                                           -((char)lVar14 < '\0'))))))));
          lVar12 = lVar12 + 8;
        } while (uVar13 == 0);
      }
      uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
      uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
      uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
      uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
      uVar7 = uVar7 + ((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3) & uVar8;
      if (-1 < *(char *)((long)plVar1 + uVar7)) {
        lVar12 = *plVar1;
        uVar7 = CONCAT17(-(lVar12 < 0),
                         CONCAT16(-((char)((ulong)lVar12 >> 0x30) < '\0'),
                                  CONCAT15(-((char)((ulong)lVar12 >> 0x28) < '\0'),
                                           CONCAT14(-((char)((ulong)lVar12 >> 0x20) < '\0'),
                                                    CONCAT13(-((char)((ulong)lVar12 >> 0x18) < '\0')
                                                             ,CONCAT12(-((char)((ulong)lVar12 >>
                                                                               0x10) < '\0'),
                                                                       CONCAT11(-((char)((ulong)
                                                  lVar12 >> 8) < '\0'),-((char)lVar12 < '\0'))))))))
        ;
        uVar7 = (uVar7 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar7 & 0x5555555555555555) << 1;
        uVar7 = (uVar7 & 0xcccccccccccccccc) >> 2 | (uVar7 & 0x3333333333333333) << 2;
        uVar7 = (uVar7 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar7 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
        uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
        uVar7 = (ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3;
      }
      uVar6 = uVar6 - 1 & uVar6;
      bVar4 = (byte)((ulong)(plVar9[-1 - uVar3] * 0x517cc1b727220a95) >> 0x38);
      *(byte *)((long)plVar1 + uVar7) = bVar4 >> 1;
      *(byte *)((long)plVar1 + (uVar7 - 8 & uVar8) + 8) = bVar4 >> 1;
      plVar1[~uVar7] = plVar9[~uVar3];
      lVar11 = lVar11 + -1;
    } while (lVar11 != 0);
  }
  *unaff_x25 = (long)plVar1;
  unaff_x25[1] = uVar8;
  unaff_x25[2] = uVar2 - unaff_x22;
  if (unaff_x23 != 0) {
    lVar11 = unaff_x23 * 8 + 8;
    lVar10 = unaff_x23 + lVar11 + 9;
    if (lVar10 != 0) {
      func_0x00187bd4((long)plVar9 - lVar11,lVar10,8);
    }
  }
  return 0x8000000000000001;
}

