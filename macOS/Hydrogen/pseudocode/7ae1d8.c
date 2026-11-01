
undefined8 FUN_007ae1d8(void)

{
  long *plVar1;
  ulong uVar2;
  byte bVar3;
  long *plVar4;
  bool in_CY;
  undefined8 uVar5;
  long lVar6;
  ulong uVar7;
  undefined8 in_x3;
  ulong uVar8;
  ulong uVar9;
  ulong in_x9;
  ulong in_x10;
  long *unaff_x19;
  long *plVar10;
  ulong uVar11;
  ulong uVar12;
  long unaff_x26;
  long unaff_x27;
  long lVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  
  if (in_CY) {
    in_x10 = in_x9;
  }
  if (in_x10 >> 0x3e == 0 && in_x10 * 4 < 0xfffffffffffffff9) {
    uVar12 = in_x10 * 4 + 7 & 0xfffffffffffffff8;
    uVar9 = in_x10 + 8;
    if ((!CARRY8(uVar12,uVar9)) && (uVar11 = uVar12 + uVar9, uVar11 < 0x7ffffffffffffff9)) {
      lVar6 = func_0x00187bd0(uVar11,8);
      if (lVar6 == 0) {
        uVar5 = func_0x004584ec(in_x3,8,uVar11);
        return uVar5;
      }
      plVar1 = (long *)(lVar6 + uVar12);
      _memset(plVar1,0xff,uVar9);
      uVar12 = in_x10 - 1;
      uVar9 = uVar12;
      if (8 < in_x10) {
        uVar9 = (in_x10 >> 3) * 7;
      }
      if (unaff_x26 == 0) {
        plVar10 = (long *)*unaff_x19;
        *unaff_x19 = (long)plVar1;
        unaff_x19[1] = uVar12;
        unaff_x19[2] = uVar9;
      }
      else {
        lVar6 = 0;
        plVar10 = (long *)*unaff_x19;
        lVar13 = *plVar10;
        uVar11 = CONCAT17(-(-1 < lVar13),
                          CONCAT16(-(-1 < (char)((ulong)lVar13 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar13 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar13 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar13 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar13
                                                                                    >> 0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar13 >> 8)),-(-1 < (char)lVar13)))))))) &
                 0x8080808080808080;
        plVar4 = plVar10;
        lVar13 = unaff_x26;
        do {
          while (uVar11 == 0) {
            lVar14 = plVar4[1];
            lVar6 = lVar6 + 8;
            plVar4 = plVar4 + 1;
            uVar11 = CONCAT17(-(-1 < lVar14),
                              CONCAT16(-(-1 < (char)((ulong)lVar14 >> 0x30)),
                                       CONCAT15(-(-1 < (char)((ulong)lVar14 >> 0x28)),
                                                CONCAT14(-(-1 < (char)((ulong)lVar14 >> 0x20)),
                                                         CONCAT13(-(-1 < (char)((ulong)lVar14 >>
                                                                               0x18)),
                                                                  CONCAT12(-(-1 < (char)((ulong)
                                                  lVar14 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar14 >> 8)),
                                                           -(-1 < (char)lVar14)))))))) &
                     0x8080808080808080;
          }
          uVar2 = (uVar11 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar11 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
          uVar7 = func_0x005763e4();
          uVar8 = uVar7 & uVar12;
          lVar14 = *(long *)((long)plVar1 + uVar8);
          uVar15 = CONCAT17(-(lVar14 < 0),
                            CONCAT16(-((char)((ulong)lVar14 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar14 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar14 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar14 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar14 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar14 >> 8) < '\0'),
                                                           -((char)lVar14 < '\0'))))))));
          if (uVar15 == 0) {
            lVar14 = 8;
            do {
              uVar8 = uVar8 + lVar14 & uVar12;
              lVar16 = *(long *)((long)plVar1 + uVar8);
              uVar15 = CONCAT17(-(lVar16 < 0),
                                CONCAT16(-((char)((ulong)lVar16 >> 0x30) < '\0'),
                                         CONCAT15(-((char)((ulong)lVar16 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)((ulong)lVar16 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)((ulong)lVar16 >> 0x18)
                                                                     < '\0'),CONCAT12(-((char)((
                                                  ulong)lVar16 >> 0x10) < '\0'),
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
          uVar8 = uVar8 + ((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) & uVar12;
          if (-1 < *(char *)((long)plVar1 + uVar8)) {
            lVar14 = *plVar1;
            uVar8 = CONCAT17(-(lVar14 < 0),
                             CONCAT16(-((char)((ulong)lVar14 >> 0x30) < '\0'),
                                      CONCAT15(-((char)((ulong)lVar14 >> 0x28) < '\0'),
                                               CONCAT14(-((char)((ulong)lVar14 >> 0x20) < '\0'),
                                                        CONCAT13(-((char)((ulong)lVar14 >> 0x18) <
                                                                  '\0'),CONCAT12(-((char)((ulong)
                                                  lVar14 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar14 >> 8) < '\0'),
                                                           -((char)lVar14 < '\0'))))))));
            uVar8 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
            uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
            uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
            uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
            uVar8 = (ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3;
          }
          uVar11 = uVar11 - 1 & uVar11;
          bVar3 = (byte)(uVar7 >> 0x38);
          *(byte *)((long)plVar1 + uVar8) = bVar3 >> 1;
          *(byte *)((long)plVar1 + (uVar8 - 8 & uVar12) + 8) = bVar3 >> 1;
          *(undefined4 *)((long)plVar1 + ~uVar8 * 4) =
               *(undefined4 *)
                ((long)plVar10 + ~(lVar6 + ((ulong)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) >> 3)) * 4
                );
          lVar13 = lVar13 + -1;
        } while (lVar13 != 0);
        *unaff_x19 = (long)plVar1;
        unaff_x19[1] = uVar12;
        unaff_x19[2] = uVar9 - unaff_x26;
      }
      if (unaff_x27 != 0) {
        uVar9 = unaff_x27 * 4 + 0xbU & 0xfffffffffffffff8;
        lVar6 = unaff_x27 + uVar9 + 9;
        if (lVar6 != 0) {
          func_0x00187bd4((long)plVar10 - uVar9,lVar6,8);
        }
      }
      return 0x8000000000000001;
    }
  }
  uVar5 = func_0x004584a8(in_x3);
  return uVar5;
}

