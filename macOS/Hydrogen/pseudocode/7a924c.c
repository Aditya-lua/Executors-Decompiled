
undefined8 FUN_007a924c(undefined8 param_1)

{
  long *plVar1;
  ulong uVar2;
  byte bVar3;
  long *plVar4;
  undefined8 uVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  long *plVar12;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  long lVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  
  lVar6 = func_0x00187bd0(param_1,8);
  if (lVar6 == 0) {
    uVar5 = func_0x004584ec();
  }
  else {
    plVar1 = (long *)(lVar6 + unaff_x26);
    _memset(plVar1,0xff);
    uVar10 = unaff_x24 - 1;
    uVar11 = uVar10;
    if (8 < unaff_x24) {
      uVar11 = (unaff_x24 >> 3) * 7;
    }
    if (unaff_x22 == 0) {
      plVar12 = (long *)*unaff_x25;
    }
    else {
      lVar6 = 0;
      plVar12 = (long *)*unaff_x25;
      lVar13 = *plVar12;
      uVar7 = CONCAT17(-(-1 < lVar13),
                       CONCAT16(-(-1 < (char)((ulong)lVar13 >> 0x30)),
                                CONCAT15(-(-1 < (char)((ulong)lVar13 >> 0x28)),
                                         CONCAT14(-(-1 < (char)((ulong)lVar13 >> 0x20)),
                                                  CONCAT13(-(-1 < (char)((ulong)lVar13 >> 0x18)),
                                                           CONCAT12(-(-1 < (char)((ulong)lVar13 >>
                                                                                 0x10)),
                                                                    CONCAT11(-(-1 < (char)((ulong)
                                                  lVar13 >> 8)),-(-1 < (char)lVar13)))))))) &
              0x8080808080808080;
      plVar4 = plVar12;
      lVar13 = unaff_x22;
      do {
        while (uVar7 == 0) {
          lVar14 = plVar4[1];
          lVar6 = lVar6 + 8;
          plVar4 = plVar4 + 1;
          uVar7 = CONCAT17(-(-1 < lVar14),
                           CONCAT16(-(-1 < (char)((ulong)lVar14 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar14 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar14 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar14 >> 0x18))
                                                               ,CONCAT12(-(-1 < (char)((ulong)lVar14
                                                                                      >> 0x10)),
                                                                         CONCAT11(-(-1 < (char)((
                                                  ulong)lVar14 >> 8)),-(-1 < (char)lVar14)))))))) &
                  0x8080808080808080;
        }
        uVar2 = (uVar7 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
        uVar2 = lVar6 + ((ulong)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) >> 3);
        uVar8 = (ulong)*(uint *)((long)plVar12 + uVar2 * -4 + -4) * 0x517cc1b727220a95;
        uVar9 = uVar8 & uVar10;
        lVar14 = *(long *)((long)plVar1 + uVar9);
        uVar15 = CONCAT17(-(lVar14 < 0),
                          CONCAT16(-((char)((ulong)lVar14 >> 0x30) < '\0'),
                                   CONCAT15(-((char)((ulong)lVar14 >> 0x28) < '\0'),
                                            CONCAT14(-((char)((ulong)lVar14 >> 0x20) < '\0'),
                                                     CONCAT13(-((char)((ulong)lVar14 >> 0x18) < '\0'
                                                               ),CONCAT12(-((char)((ulong)lVar14 >>
                                                                                  0x10) < '\0'),
                                                                          CONCAT11(-((char)((ulong)
                                                  lVar14 >> 8) < '\0'),-((char)lVar14 < '\0'))))))))
        ;
        if (uVar15 == 0) {
          lVar14 = 8;
          do {
            uVar9 = uVar9 + lVar14 & uVar10;
            lVar16 = *(long *)((long)plVar1 + uVar9);
            uVar15 = CONCAT17(-(lVar16 < 0),
                              CONCAT16(-((char)((ulong)lVar16 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar16 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar16 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar16 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar16 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar16 >> 8) < '\0'),
                                                           -((char)lVar16 < '\0'))))))));
            lVar14 = lVar14 + 8;
          } while (uVar15 == 0);
        }
        uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
        uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
        uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
        uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
        uVar9 = uVar9 + ((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) & uVar10;
        if (-1 < *(char *)((long)plVar1 + uVar9)) {
          lVar14 = *plVar1;
          uVar9 = CONCAT17(-(lVar14 < 0),
                           CONCAT16(-((char)((ulong)lVar14 >> 0x30) < '\0'),
                                    CONCAT15(-((char)((ulong)lVar14 >> 0x28) < '\0'),
                                             CONCAT14(-((char)((ulong)lVar14 >> 0x20) < '\0'),
                                                      CONCAT13(-((char)((ulong)lVar14 >> 0x18) <
                                                                '\0'),CONCAT12(-((char)((ulong)
                                                  lVar14 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar14 >> 8) < '\0'),
                                                           -((char)lVar14 < '\0'))))))));
          uVar9 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
          uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
          uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
          uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
          uVar9 = (ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3;
        }
        uVar7 = uVar7 - 1 & uVar7;
        bVar3 = (byte)(uVar8 >> 0x38);
        *(byte *)((long)plVar1 + uVar9) = bVar3 >> 1;
        *(byte *)((long)plVar1 + (uVar9 - 8 & uVar10) + 8) = bVar3 >> 1;
        *(undefined4 *)((long)plVar1 + ~uVar9 * 4) = *(undefined4 *)((long)plVar12 + ~uVar2 * 4);
        lVar13 = lVar13 + -1;
      } while (lVar13 != 0);
    }
    *unaff_x25 = (long)plVar1;
    unaff_x25[1] = uVar10;
    unaff_x25[2] = uVar11 - unaff_x22;
    if (unaff_x23 != 0) {
      uVar11 = unaff_x23 * 4 + 0xbU & 0xfffffffffffffff8;
      lVar6 = unaff_x23 + uVar11 + 9;
      if (lVar6 != 0) {
        func_0x00187bd4((long)plVar12 - uVar11,lVar6,8);
      }
    }
    uVar5 = 0x8000000000000001;
  }
  return uVar5;
}

