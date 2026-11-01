
undefined8 FUN_007a47f4(long param_1)

{
  long *plVar1;
  ulong uVar2;
  ulong uVar3;
  byte bVar4;
  long *plVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  long *plVar11;
  long lVar12;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  long lVar13;
  long lVar14;
  long lVar15;
  
  plVar1 = (long *)(param_1 + unaff_x26);
  _memset(plVar1,0xff);
  uVar10 = unaff_x24 - 1;
  uVar2 = uVar10;
  if (8 < unaff_x24) {
    uVar2 = (unaff_x24 >> 3) * 7;
  }
  if (unaff_x22 == 0) {
    plVar11 = (long *)*unaff_x25;
  }
  else {
    lVar12 = 0;
    plVar11 = (long *)*unaff_x25;
    lVar13 = *plVar11;
    uVar6 = CONCAT17(-(-1 < lVar13),
                     CONCAT16(-(-1 < (char)((ulong)lVar13 >> 0x30)),
                              CONCAT15(-(-1 < (char)((ulong)lVar13 >> 0x28)),
                                       CONCAT14(-(-1 < (char)((ulong)lVar13 >> 0x20)),
                                                CONCAT13(-(-1 < (char)((ulong)lVar13 >> 0x18)),
                                                         CONCAT12(-(-1 < (char)((ulong)lVar13 >>
                                                                               0x10)),
                                                                  CONCAT11(-(-1 < (char)((ulong)
                                                  lVar13 >> 8)),-(-1 < (char)lVar13)))))))) &
            0x8080808080808080;
    plVar5 = plVar11;
    lVar13 = unaff_x22;
    do {
      while (uVar6 == 0) {
        lVar14 = plVar5[1];
        lVar12 = lVar12 + 8;
        plVar5 = plVar5 + 1;
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
      }
      uVar3 = (uVar6 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar6 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
      uVar3 = lVar12 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3);
      uVar7 = (plVar11[uVar3 * -2 + -2] + 8) * 0x517cc1b727220a95;
      uVar8 = uVar7 & uVar10;
      lVar14 = *(long *)((long)plVar1 + uVar8);
      uVar9 = CONCAT17(-(lVar14 < 0),
                       CONCAT16(-((char)((ulong)lVar14 >> 0x30) < '\0'),
                                CONCAT15(-((char)((ulong)lVar14 >> 0x28) < '\0'),
                                         CONCAT14(-((char)((ulong)lVar14 >> 0x20) < '\0'),
                                                  CONCAT13(-((char)((ulong)lVar14 >> 0x18) < '\0'),
                                                           CONCAT12(-((char)((ulong)lVar14 >> 0x10)
                                                                     < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar14 >> 8) < '\0'),-((char)lVar14 < '\0'))
                                                  ))))));
      if (uVar9 == 0) {
        lVar14 = 8;
        do {
          uVar8 = uVar8 + lVar14 & uVar10;
          lVar15 = *(long *)((long)plVar1 + uVar8);
          uVar9 = CONCAT17(-(lVar15 < 0),
                           CONCAT16(-((char)((ulong)lVar15 >> 0x30) < '\0'),
                                    CONCAT15(-((char)((ulong)lVar15 >> 0x28) < '\0'),
                                             CONCAT14(-((char)((ulong)lVar15 >> 0x20) < '\0'),
                                                      CONCAT13(-((char)((ulong)lVar15 >> 0x18) <
                                                                '\0'),CONCAT12(-((char)((ulong)
                                                  lVar15 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar15 >> 8) < '\0'),
                                                           -((char)lVar15 < '\0'))))))));
          lVar14 = lVar14 + 8;
        } while (uVar9 == 0);
      }
      uVar9 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
      uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
      uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
      uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
      uVar8 = uVar8 + ((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) & uVar10;
      if (-1 < *(char *)((long)plVar1 + uVar8)) {
        lVar14 = *plVar1;
        uVar8 = CONCAT17(-(lVar14 < 0),
                         CONCAT16(-((char)((ulong)lVar14 >> 0x30) < '\0'),
                                  CONCAT15(-((char)((ulong)lVar14 >> 0x28) < '\0'),
                                           CONCAT14(-((char)((ulong)lVar14 >> 0x20) < '\0'),
                                                    CONCAT13(-((char)((ulong)lVar14 >> 0x18) < '\0')
                                                             ,CONCAT12(-((char)((ulong)lVar14 >>
                                                                               0x10) < '\0'),
                                                                       CONCAT11(-((char)((ulong)
                                                  lVar14 >> 8) < '\0'),-((char)lVar14 < '\0'))))))))
        ;
        uVar8 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
        uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
        uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
        uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
        uVar8 = (ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3;
      }
      uVar6 = uVar6 - 1 & uVar6;
      bVar4 = (byte)(uVar7 >> 0x38);
      *(byte *)((long)plVar1 + uVar8) = bVar4 >> 1;
      *(byte *)((long)plVar1 + (uVar8 - 8 & uVar10) + 8) = bVar4 >> 1;
      lVar14 = plVar11[~uVar3 * 2];
      (plVar1 + ~uVar8 * 2)[1] = (plVar11 + ~uVar3 * 2)[1];
      plVar1[~uVar8 * 2] = lVar14;
      lVar13 = lVar13 + -1;
    } while (lVar13 != 0);
  }
  *unaff_x25 = (long)plVar1;
  unaff_x25[1] = uVar10;
  unaff_x25[2] = uVar2 - unaff_x22;
  if (unaff_x23 != 0) {
    lVar13 = unaff_x23 * 0x10 + 0x10;
    lVar12 = unaff_x23 + lVar13 + 9;
    if (lVar12 != 0) {
      func_0x00187bd4((long)plVar11 - lVar13,lVar12,8);
    }
  }
  return 0x8000000000000001;
}

