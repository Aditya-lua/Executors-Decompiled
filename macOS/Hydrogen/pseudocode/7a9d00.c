
undefined8
FUN_007a9d00(ulong param_1,long *param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5)

{
  ulong uVar1;
  long *plVar2;
  long *plVar3;
  long *plVar4;
  ulong uVar5;
  byte bVar6;
  long *plVar7;
  undefined8 uVar8;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  long *plVar14;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x26;
  long lVar15;
  long lVar16;
  long lVar17;
  long lVar18;
  
  uVar1 = unaff_x26 + unaff_x20;
  if (param_1 < uVar1) {
    uVar8 = func_0x004584a8(param_5);
  }
  else {
    lVar9 = func_0x00187bd0(uVar1,8);
    if (lVar9 == 0) {
      uVar8 = func_0x004584ec(param_5,8,uVar1);
    }
    else {
      plVar2 = (long *)(lVar9 + unaff_x26);
      _memset(plVar2,0xff);
      uVar13 = unaff_x24 - 1;
      uVar1 = uVar13;
      if (8 < unaff_x24) {
        uVar1 = (unaff_x24 >> 3) * 7;
      }
      if (unaff_x22 == 0) {
        plVar14 = (long *)*param_2;
      }
      else {
        lVar9 = 0;
        plVar14 = (long *)*param_2;
        lVar15 = *plVar14;
        uVar10 = CONCAT17(-(-1 < lVar15),
                          CONCAT16(-(-1 < (char)((ulong)lVar15 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar15 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar15 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar15 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar15
                                                                                    >> 0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar15 >> 8)),-(-1 < (char)lVar15)))))))) &
                 0x8080808080808080;
        plVar7 = plVar14;
        lVar15 = unaff_x22;
        do {
          while (uVar10 == 0) {
            lVar16 = plVar7[1];
            lVar9 = lVar9 + 8;
            plVar7 = plVar7 + 1;
            uVar10 = CONCAT17(-(-1 < lVar16),
                              CONCAT16(-(-1 < (char)((ulong)lVar16 >> 0x30)),
                                       CONCAT15(-(-1 < (char)((ulong)lVar16 >> 0x28)),
                                                CONCAT14(-(-1 < (char)((ulong)lVar16 >> 0x20)),
                                                         CONCAT13(-(-1 < (char)((ulong)lVar16 >>
                                                                               0x18)),
                                                                  CONCAT12(-(-1 < (char)((ulong)
                                                  lVar16 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar16 >> 8)),
                                                           -(-1 < (char)lVar16)))))))) &
                     0x8080808080808080;
          }
          uVar5 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
          uVar5 = lVar9 + ((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3);
          uVar11 = (ulong)*(uint *)(plVar14 + uVar5 * -4 + -4) * 0x517cc1b727220a95 & uVar13;
          lVar16 = *(long *)((long)plVar2 + uVar11);
          uVar12 = CONCAT17(-(lVar16 < 0),
                            CONCAT16(-((char)((ulong)lVar16 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar16 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar16 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar16 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar16 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar16 >> 8) < '\0'),
                                                           -((char)lVar16 < '\0'))))))));
          if (uVar12 == 0) {
            lVar16 = 8;
            do {
              uVar11 = uVar11 + lVar16 & uVar13;
              lVar17 = *(long *)((long)plVar2 + uVar11);
              uVar12 = CONCAT17(-(lVar17 < 0),
                                CONCAT16(-((char)((ulong)lVar17 >> 0x30) < '\0'),
                                         CONCAT15(-((char)((ulong)lVar17 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)((ulong)lVar17 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)((ulong)lVar17 >> 0x18)
                                                                     < '\0'),CONCAT12(-((char)((
                                                  ulong)lVar17 >> 0x10) < '\0'),
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
          uVar11 = uVar11 + ((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3) & uVar13;
          if (-1 < *(char *)((long)plVar2 + uVar11)) {
            lVar16 = *plVar2;
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
          uVar10 = uVar10 - 1 & uVar10;
          bVar6 = (byte)((ulong)*(uint *)(plVar14 + uVar5 * -4 + -4) * 0x517cc1b727220a95 >> 0x38);
          *(byte *)((long)plVar2 + uVar11) = bVar6 >> 1;
          *(byte *)((long)plVar2 + (uVar11 - 8 & uVar13) + 8) = bVar6 >> 1;
          plVar3 = plVar14 + ~uVar5 * 4;
          lVar16 = *plVar3;
          lVar18 = plVar3[3];
          lVar17 = plVar3[2];
          plVar4 = plVar2 + ~uVar11 * 4;
          plVar4[1] = plVar3[1];
          *plVar4 = lVar16;
          plVar4[3] = lVar18;
          plVar4[2] = lVar17;
          lVar15 = lVar15 + -1;
        } while (lVar15 != 0);
      }
      *param_2 = (long)plVar2;
      param_2[1] = uVar13;
      param_2[2] = uVar1 - unaff_x22;
      if (unaff_x23 != 0) {
        lVar15 = unaff_x23 * 0x20 + 0x20;
        lVar9 = unaff_x23 + lVar15 + 9;
        if (lVar9 != 0) {
          func_0x00187bd4((long)plVar14 - lVar15,lVar9,8);
        }
      }
      uVar8 = 0x8000000000000001;
    }
  }
  return uVar8;
}

