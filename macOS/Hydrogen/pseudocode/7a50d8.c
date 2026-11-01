
undefined8 FUN_007a50d8(long *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  long *plVar1;
  ulong uVar2;
  ulong uVar3;
  byte bVar4;
  long *plVar5;
  bool in_ZR;
  bool in_CY;
  undefined8 uVar6;
  long lVar7;
  ulong uVar8;
  long *plVar9;
  long *plVar10;
  ulong *puVar11;
  ulong *puVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  long *plVar16;
  ulong uVar17;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x26;
  long lVar18;
  long lVar19;
  long lVar20;
  
  if (!in_CY || in_ZR) {
    lVar7 = func_0x00187bd0();
    if (lVar7 == 0) {
      uVar6 = func_0x004584ec(param_4,8);
    }
    else {
      plVar1 = (long *)(lVar7 + unaff_x26);
      _memset(plVar1,0xff);
      uVar17 = unaff_x24 - 1;
      uVar2 = uVar17;
      if (8 < unaff_x24) {
        uVar2 = (unaff_x24 >> 3) * 7;
      }
      if (unaff_x23 == 0) {
        plVar16 = (long *)*param_1;
      }
      else {
        lVar7 = 0;
        plVar16 = (long *)*param_1;
        lVar18 = *plVar16;
        uVar8 = CONCAT17(-(-1 < lVar18),
                         CONCAT16(-(-1 < (char)((ulong)lVar18 >> 0x30)),
                                  CONCAT15(-(-1 < (char)((ulong)lVar18 >> 0x28)),
                                           CONCAT14(-(-1 < (char)((ulong)lVar18 >> 0x20)),
                                                    CONCAT13(-(-1 < (char)((ulong)lVar18 >> 0x18)),
                                                             CONCAT12(-(-1 < (char)((ulong)lVar18 >>
                                                                                   0x10)),
                                                                      CONCAT11(-(-1 < (char)((ulong)
                                                  lVar18 >> 8)),-(-1 < (char)lVar18)))))))) &
                0x8080808080808080;
        plVar5 = plVar16;
        lVar18 = unaff_x23;
        do {
          while (uVar8 == 0) {
            lVar19 = plVar5[1];
            lVar7 = lVar7 + 8;
            plVar5 = plVar5 + 1;
            uVar8 = CONCAT17(-(-1 < lVar19),
                             CONCAT16(-(-1 < (char)((ulong)lVar19 >> 0x30)),
                                      CONCAT15(-(-1 < (char)((ulong)lVar19 >> 0x28)),
                                               CONCAT14(-(-1 < (char)((ulong)lVar19 >> 0x20)),
                                                        CONCAT13(-(-1 < (char)((ulong)lVar19 >> 0x18
                                                                              )),
                                                                 CONCAT12(-(-1 < (char)((ulong)
                                                  lVar19 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar19 >> 8)),
                                                           -(-1 < (char)lVar19)))))))) &
                    0x8080808080808080;
          }
          uVar3 = (uVar8 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar8 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
          uVar3 = lVar7 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3);
          puVar12 = (ulong *)plVar16[uVar3 * -3 + -2];
          uVar13 = plVar16[uVar3 * -3 + -1];
          if (uVar13 < 8) {
            uVar14 = 0;
            if (3 < uVar13) goto LAB_007a527c;
LAB_007a51d8:
            puVar11 = puVar12;
            if (uVar13 < 2) goto LAB_007a51e0;
LAB_007a5294:
            puVar12 = (ulong *)((long)puVar11 + 2);
            uVar14 = ((ulong)(ushort)*puVar11 ^ (uVar14 >> 0x3b | uVar14 << 5)) * 0x517cc1b727220a95
            ;
            if (uVar13 != 2) goto LAB_007a51e4;
          }
          else {
            uVar14 = 0;
            puVar11 = puVar12;
            do {
              puVar12 = puVar11 + 1;
              uVar14 = (*puVar11 ^ (uVar14 >> 0x3b | uVar14 << 5)) * 0x517cc1b727220a95;
              uVar13 = uVar13 - 8;
              puVar11 = puVar12;
            } while (7 < uVar13);
            if (uVar13 < 4) goto LAB_007a51d8;
LAB_007a527c:
            puVar11 = (ulong *)((long)puVar12 + 4);
            uVar14 = ((ulong)(uint)*puVar12 ^ (uVar14 >> 0x3b | uVar14 << 5)) * 0x517cc1b727220a95;
            uVar13 = uVar13 - 4;
            if (1 < uVar13) goto LAB_007a5294;
LAB_007a51e0:
            puVar12 = puVar11;
            if (uVar13 != 0) {
LAB_007a51e4:
              uVar14 = ((ulong)(byte)*puVar12 ^ (uVar14 >> 0x3b | uVar14 << 5)) * 0x517cc1b727220a95
              ;
            }
          }
          uVar13 = ((uVar14 >> 0x3b | uVar14 << 5) ^ 0xff) * 0x517cc1b727220a95;
          uVar14 = uVar13 & uVar17;
          lVar19 = *(long *)((long)plVar1 + uVar14);
          uVar15 = CONCAT17(-(lVar19 < 0),
                            CONCAT16(-((char)((ulong)lVar19 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar19 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar19 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar19 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar19 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar19 >> 8) < '\0'),
                                                           -((char)lVar19 < '\0'))))))));
          if (uVar15 == 0) {
            lVar19 = 8;
            do {
              uVar14 = uVar14 + lVar19 & uVar17;
              lVar20 = *(long *)((long)plVar1 + uVar14);
              uVar15 = CONCAT17(-(lVar20 < 0),
                                CONCAT16(-((char)((ulong)lVar20 >> 0x30) < '\0'),
                                         CONCAT15(-((char)((ulong)lVar20 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)((ulong)lVar20 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)((ulong)lVar20 >> 0x18)
                                                                     < '\0'),CONCAT12(-((char)((
                                                  ulong)lVar20 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar20 >> 8) < '\0'),
                                                           -((char)lVar20 < '\0'))))))));
              lVar19 = lVar19 + 8;
            } while (uVar15 == 0);
          }
          uVar15 = (uVar15 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar15 & 0x5555555555555555) << 1;
          uVar15 = (uVar15 & 0xcccccccccccccccc) >> 2 | (uVar15 & 0x3333333333333333) << 2;
          uVar15 = (uVar15 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar15 = (uVar15 & 0xff00ff00ff00ff00) >> 8 | (uVar15 & 0xff00ff00ff00ff) << 8;
          uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
          uVar14 = uVar14 + ((ulong)LZCOUNT(uVar15 >> 0x20 | uVar15 << 0x20) >> 3) & uVar17;
          if (-1 < *(char *)((long)plVar1 + uVar14)) {
            lVar19 = *plVar1;
            uVar14 = CONCAT17(-(lVar19 < 0),
                              CONCAT16(-((char)((ulong)lVar19 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar19 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar19 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar19 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar19 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar19 >> 8) < '\0'),
                                                           -((char)lVar19 < '\0'))))))));
            uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
            uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
            uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
            uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
            uVar14 = (ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3;
          }
          uVar8 = uVar8 - 1 & uVar8;
          bVar4 = (byte)(uVar13 >> 0x38);
          *(byte *)((long)plVar1 + uVar14) = bVar4 >> 1;
          *(byte *)((long)plVar1 + (uVar14 - 8 & uVar17) + 8) = bVar4 >> 1;
          plVar9 = plVar16 + ~uVar3 * 3;
          lVar20 = plVar9[1];
          lVar19 = *plVar9;
          plVar10 = plVar1 + ~uVar14 * 3;
          plVar10[2] = plVar9[2];
          plVar10[1] = lVar20;
          *plVar10 = lVar19;
          lVar18 = lVar18 + -1;
        } while (lVar18 != 0);
      }
      *param_1 = (long)plVar1;
      param_1[1] = uVar17;
      param_1[2] = uVar2 - unaff_x23;
      param_1[3] = unaff_x23;
      if (unaff_x22 != 0) {
        lVar18 = unaff_x22 * 0x18 + 0x18;
        lVar7 = unaff_x22 + lVar18 + 9;
        if (lVar7 != 0) {
          func_0x00187bd4((long)plVar16 - lVar18,lVar7,8);
        }
      }
      uVar6 = 0x8000000000000001;
    }
  }
  else {
    uVar6 = func_0x004584a8(param_4);
  }
  return uVar6;
}

