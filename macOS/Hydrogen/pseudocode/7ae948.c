
undefined8 FUN_007ae948(long *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  ulong uVar1;
  long *plVar2;
  ulong uVar3;
  byte bVar4;
  long *plVar5;
  bool in_CY;
  undefined8 uVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  long *plVar12;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x26;
  long lVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  
  if ((in_CY) || (uVar1 = unaff_x26 + unaff_x20, 0x7ffffffffffffff8 < uVar1)) {
    uVar6 = func_0x004584a8(param_4);
  }
  else {
    lVar7 = func_0x00187bd0(uVar1,8);
    if (lVar7 == 0) {
      uVar6 = func_0x004584ec(param_4,8,uVar1);
    }
    else {
      plVar2 = (long *)(lVar7 + unaff_x26);
      _memset(plVar2,0xff);
      uVar11 = unaff_x24 - 1;
      uVar1 = uVar11;
      if (8 < unaff_x24) {
        uVar1 = (unaff_x24 >> 3) * 7;
      }
      if (unaff_x22 == 0) {
        plVar12 = (long *)*param_1;
      }
      else {
        lVar7 = 0;
        plVar12 = (long *)*param_1;
        lVar13 = *plVar12;
        uVar8 = CONCAT17(-(-1 < lVar13),
                         CONCAT16(-(-1 < (char)((ulong)lVar13 >> 0x30)),
                                  CONCAT15(-(-1 < (char)((ulong)lVar13 >> 0x28)),
                                           CONCAT14(-(-1 < (char)((ulong)lVar13 >> 0x20)),
                                                    CONCAT13(-(-1 < (char)((ulong)lVar13 >> 0x18)),
                                                             CONCAT12(-(-1 < (char)((ulong)lVar13 >>
                                                                                   0x10)),
                                                                      CONCAT11(-(-1 < (char)((ulong)
                                                  lVar13 >> 8)),-(-1 < (char)lVar13)))))))) &
                0x8080808080808080;
        plVar5 = plVar12;
        lVar13 = unaff_x22;
        do {
          while (uVar8 == 0) {
            lVar14 = plVar5[1];
            lVar7 = lVar7 + 8;
            plVar5 = plVar5 + 1;
            uVar8 = CONCAT17(-(-1 < lVar14),
                             CONCAT16(-(-1 < (char)((ulong)lVar14 >> 0x30)),
                                      CONCAT15(-(-1 < (char)((ulong)lVar14 >> 0x28)),
                                               CONCAT14(-(-1 < (char)((ulong)lVar14 >> 0x20)),
                                                        CONCAT13(-(-1 < (char)((ulong)lVar14 >> 0x18
                                                                              )),
                                                                 CONCAT12(-(-1 < (char)((ulong)
                                                  lVar14 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar14 >> 8)),
                                                           -(-1 < (char)lVar14)))))))) &
                    0x8080808080808080;
          }
          uVar3 = (uVar8 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar8 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
          uVar3 = lVar7 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3);
          uVar9 = (plVar12[-1 - uVar3] + 8) * 0x517cc1b727220a95;
          uVar10 = uVar9 & uVar11;
          lVar14 = *(long *)((long)plVar2 + uVar10);
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
              uVar10 = uVar10 + lVar14 & uVar11;
              lVar16 = *(long *)((long)plVar2 + uVar10);
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
          uVar10 = uVar10 + ((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) & uVar11;
          if (-1 < *(char *)((long)plVar2 + uVar10)) {
            lVar14 = *plVar2;
            uVar10 = CONCAT17(-(lVar14 < 0),
                              CONCAT16(-((char)((ulong)lVar14 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar14 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar14 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar14 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar14 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar14 >> 8) < '\0'),
                                                           -((char)lVar14 < '\0'))))))));
            uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
            uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
            uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
            uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
            uVar10 = (ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3;
          }
          uVar8 = uVar8 - 1 & uVar8;
          bVar4 = (byte)(uVar9 >> 0x38);
          *(byte *)((long)plVar2 + uVar10) = bVar4 >> 1;
          *(byte *)((long)plVar2 + (uVar10 - 8 & uVar11) + 8) = bVar4 >> 1;
          plVar2[~uVar10] = plVar12[~uVar3];
          lVar13 = lVar13 + -1;
        } while (lVar13 != 0);
      }
      *param_1 = (long)plVar2;
      param_1[1] = uVar11;
      param_1[2] = uVar1 - unaff_x22;
      if (unaff_x23 != 0) {
        lVar13 = unaff_x23 * 8 + 8;
        lVar7 = unaff_x23 + lVar13 + 9;
        if (lVar7 != 0) {
          func_0x00187bd4((long)plVar12 - lVar13,lVar7,8);
        }
      }
      uVar6 = 0x8000000000000001;
    }
  }
  return uVar6;
}

