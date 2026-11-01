
undefined8
FUN_007aa71c(long param_1,long *param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5)

{
  ulong uVar1;
  long *plVar2;
  byte bVar3;
  long *plVar4;
  undefined8 uVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  long in_x9;
  long *plVar12;
  long unaff_x22;
  long unaff_x23;
  ulong uVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  
  if ((in_x9 == 0) &&
     (uVar11 = 0xffffffffffffffff >> (LZCOUNT((ulong)(param_1 * 8) / 7 - 1) & 0x3fU),
     uVar11 < 0xfffffffffffffff)) {
    uVar7 = uVar11 + 1;
    uVar13 = uVar7 * 0x10;
    uVar1 = uVar11 + 9;
    if ((!CARRY8(uVar13,uVar1)) && (uVar8 = uVar13 + uVar1, uVar8 < 0x7ffffffffffffff9)) {
      lVar6 = func_0x00187bd0(uVar8,8);
      if (lVar6 == 0) {
        uVar5 = func_0x004584ec(param_5,8,uVar8);
        return uVar5;
      }
      plVar2 = (long *)(lVar6 + uVar13);
      _memset(plVar2,0xff,uVar1);
      uVar1 = uVar11;
      if (8 < uVar7) {
        uVar1 = (uVar7 >> 3) * 7;
      }
      if (unaff_x22 == 0) {
        plVar12 = (long *)*param_2;
      }
      else {
        lVar6 = 0;
        plVar12 = (long *)*param_2;
        lVar14 = *plVar12;
        uVar7 = CONCAT17(-(-1 < lVar14),
                         CONCAT16(-(-1 < (char)((ulong)lVar14 >> 0x30)),
                                  CONCAT15(-(-1 < (char)((ulong)lVar14 >> 0x28)),
                                           CONCAT14(-(-1 < (char)((ulong)lVar14 >> 0x20)),
                                                    CONCAT13(-(-1 < (char)((ulong)lVar14 >> 0x18)),
                                                             CONCAT12(-(-1 < (char)((ulong)lVar14 >>
                                                                                   0x10)),
                                                                      CONCAT11(-(-1 < (char)((ulong)
                                                  lVar14 >> 8)),-(-1 < (char)lVar14)))))))) &
                0x8080808080808080;
        plVar4 = plVar12;
        lVar14 = unaff_x22;
        do {
          while (uVar7 == 0) {
            lVar15 = plVar4[1];
            lVar6 = lVar6 + 8;
            plVar4 = plVar4 + 1;
            uVar7 = CONCAT17(-(-1 < lVar15),
                             CONCAT16(-(-1 < (char)((ulong)lVar15 >> 0x30)),
                                      CONCAT15(-(-1 < (char)((ulong)lVar15 >> 0x28)),
                                               CONCAT14(-(-1 < (char)((ulong)lVar15 >> 0x20)),
                                                        CONCAT13(-(-1 < (char)((ulong)lVar15 >> 0x18
                                                                              )),
                                                                 CONCAT12(-(-1 < (char)((ulong)
                                                  lVar15 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar15 >> 8)),
                                                           -(-1 < (char)lVar15)))))))) &
                    0x8080808080808080;
          }
          uVar13 = (uVar7 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
          uVar13 = lVar6 + ((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3);
          uVar8 = (plVar12[uVar13 * -2 + -2] + 8) * 0x517cc1b727220a95;
          uVar9 = uVar8 & uVar11;
          lVar15 = *(long *)((long)plVar2 + uVar9);
          uVar10 = CONCAT17(-(lVar15 < 0),
                            CONCAT16(-((char)((ulong)lVar15 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar15 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar15 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar15 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar15 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar15 >> 8) < '\0'),
                                                           -((char)lVar15 < '\0'))))))));
          if (uVar10 == 0) {
            lVar15 = 8;
            do {
              uVar9 = uVar9 + lVar15 & uVar11;
              lVar16 = *(long *)((long)plVar2 + uVar9);
              uVar10 = CONCAT17(-(lVar16 < 0),
                                CONCAT16(-((char)((ulong)lVar16 >> 0x30) < '\0'),
                                         CONCAT15(-((char)((ulong)lVar16 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)((ulong)lVar16 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)((ulong)lVar16 >> 0x18)
                                                                     < '\0'),CONCAT12(-((char)((
                                                  ulong)lVar16 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar16 >> 8) < '\0'),
                                                           -((char)lVar16 < '\0'))))))));
              lVar15 = lVar15 + 8;
            } while (uVar10 == 0);
          }
          uVar10 = (uVar10 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar10 & 0x5555555555555555) << 1;
          uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
          uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
          uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
          uVar9 = uVar9 + ((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) & uVar11;
          if (-1 < *(char *)((long)plVar2 + uVar9)) {
            lVar15 = *plVar2;
            uVar9 = CONCAT17(-(lVar15 < 0),
                             CONCAT16(-((char)((ulong)lVar15 >> 0x30) < '\0'),
                                      CONCAT15(-((char)((ulong)lVar15 >> 0x28) < '\0'),
                                               CONCAT14(-((char)((ulong)lVar15 >> 0x20) < '\0'),
                                                        CONCAT13(-((char)((ulong)lVar15 >> 0x18) <
                                                                  '\0'),CONCAT12(-((char)((ulong)
                                                  lVar15 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar15 >> 8) < '\0'),
                                                           -((char)lVar15 < '\0'))))))));
            uVar9 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
            uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
            uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
            uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
            uVar9 = (ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3;
          }
          uVar7 = uVar7 - 1 & uVar7;
          bVar3 = (byte)(uVar8 >> 0x38);
          *(byte *)((long)plVar2 + uVar9) = bVar3 >> 1;
          *(byte *)((long)plVar2 + (uVar9 - 8 & uVar11) + 8) = bVar3 >> 1;
          lVar15 = plVar12[~uVar13 * 2];
          (plVar2 + ~uVar9 * 2)[1] = (plVar12 + ~uVar13 * 2)[1];
          plVar2[~uVar9 * 2] = lVar15;
          lVar14 = lVar14 + -1;
        } while (lVar14 != 0);
      }
      *param_2 = (long)plVar2;
      param_2[1] = uVar11;
      param_2[2] = uVar1 - unaff_x22;
      if (unaff_x23 != 0) {
        lVar14 = unaff_x23 * 0x10 + 0x10;
        lVar6 = unaff_x23 + lVar14 + 9;
        if (lVar6 != 0) {
          func_0x00187bd4((long)plVar12 - lVar14,lVar6,8);
        }
      }
      return 0x8000000000000001;
    }
  }
  uVar5 = func_0x004584a8(param_5);
  return uVar5;
}

