
undefined8
FUN_007a4cec(ulong param_1,long *param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5)

{
  ulong uVar1;
  long *plVar2;
  long *plVar3;
  long *plVar4;
  byte bVar5;
  long *plVar6;
  undefined8 uVar7;
  long lVar8;
  ulong *puVar9;
  ulong *puVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  long *plVar15;
  ulong uVar16;
  long unaff_x22;
  long unaff_x23;
  ulong uVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  
  if ((param_1 >> 0x3d == 0) &&
     (uVar14 = 0xffffffffffffffff >> (LZCOUNT((param_1 * 8) / 7 - 1) & 0x3fU),
     uVar14 < 0x7ffffffffffffff)) {
    uVar16 = uVar14 + 1;
    uVar17 = uVar16 * 0x20;
    uVar1 = uVar14 + 9;
    if ((!CARRY8(uVar17,uVar1)) && (uVar11 = uVar17 + uVar1, uVar11 < 0x7ffffffffffffff9)) {
      lVar8 = func_0x00187bd0(uVar11,8);
      if (lVar8 == 0) {
        uVar7 = func_0x004584ec(param_5,8,uVar11);
        return uVar7;
      }
      plVar2 = (long *)(lVar8 + uVar17);
      _memset(plVar2,0xff,uVar1);
      uVar1 = uVar14;
      if (8 < uVar16) {
        uVar1 = (uVar16 >> 3) * 7;
      }
      if (unaff_x22 == 0) {
        plVar15 = (long *)*param_2;
      }
      else {
        lVar8 = 0;
        plVar15 = (long *)*param_2;
        lVar18 = *plVar15;
        uVar16 = CONCAT17(-(-1 < lVar18),
                          CONCAT16(-(-1 < (char)((ulong)lVar18 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar18 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar18 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar18 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar18
                                                                                    >> 0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar18 >> 8)),-(-1 < (char)lVar18)))))))) &
                 0x8080808080808080;
        plVar6 = plVar15;
        lVar18 = unaff_x22;
        do {
          while (uVar16 == 0) {
            lVar19 = plVar6[1];
            lVar8 = lVar8 + 8;
            plVar6 = plVar6 + 1;
            uVar16 = CONCAT17(-(-1 < lVar19),
                              CONCAT16(-(-1 < (char)((ulong)lVar19 >> 0x30)),
                                       CONCAT15(-(-1 < (char)((ulong)lVar19 >> 0x28)),
                                                CONCAT14(-(-1 < (char)((ulong)lVar19 >> 0x20)),
                                                         CONCAT13(-(-1 < (char)((ulong)lVar19 >>
                                                                               0x18)),
                                                                  CONCAT12(-(-1 < (char)((ulong)
                                                  lVar19 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar19 >> 8)),
                                                           -(-1 < (char)lVar19)))))))) &
                     0x8080808080808080;
          }
          uVar17 = (uVar16 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar16 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar17 = (uVar17 & 0xffff0000ffff0000) >> 0x10 | (uVar17 & 0xffff0000ffff) << 0x10;
          uVar17 = lVar8 + ((ulong)LZCOUNT(uVar17 >> 0x20 | uVar17 << 0x20) >> 3);
          puVar10 = (ulong *)plVar15[uVar17 * -4 + -3];
          uVar11 = plVar15[uVar17 * -4 + -2];
          if (uVar11 < 8) {
            uVar12 = 0;
            if (uVar11 < 4) goto code_r0x007a4e4c;
code_r0x007a4ee8:
            puVar9 = (ulong *)((long)puVar10 + 4);
            uVar12 = ((ulong)(uint)*puVar10 ^ (uVar12 >> 0x3b | uVar12 << 5)) * 0x517cc1b727220a95;
            uVar11 = uVar11 - 4;
            if (uVar11 < 2) goto code_r0x007a4e54;
code_r0x007a4f00:
            puVar10 = (ulong *)((long)puVar9 + 2);
            uVar12 = ((ulong)(ushort)*puVar9 ^ (uVar12 >> 0x3b | uVar12 << 5)) * 0x517cc1b727220a95;
            if (uVar11 != 2) goto code_r0x007a4e58;
          }
          else {
            uVar12 = 0;
            puVar9 = puVar10;
            do {
              puVar10 = puVar9 + 1;
              uVar12 = (*puVar9 ^ (uVar12 >> 0x3b | uVar12 << 5)) * 0x517cc1b727220a95;
              uVar11 = uVar11 - 8;
              puVar9 = puVar10;
            } while (7 < uVar11);
            if (3 < uVar11) goto code_r0x007a4ee8;
code_r0x007a4e4c:
            puVar9 = puVar10;
            if (1 < uVar11) goto code_r0x007a4f00;
code_r0x007a4e54:
            puVar10 = puVar9;
            if (uVar11 != 0) {
code_r0x007a4e58:
              uVar12 = ((ulong)(byte)*puVar10 ^ (uVar12 >> 0x3b | uVar12 << 5)) * 0x517cc1b727220a95
              ;
            }
          }
          uVar11 = ((uVar12 >> 0x3b | uVar12 << 5) ^ 0xff) * 0x517cc1b727220a95;
          uVar12 = uVar11 & uVar14;
          lVar19 = *(long *)((long)plVar2 + uVar12);
          uVar13 = CONCAT17(-(lVar19 < 0),
                            CONCAT16(-((char)((ulong)lVar19 >> 0x30) < '\0'),
                                     CONCAT15(-((char)((ulong)lVar19 >> 0x28) < '\0'),
                                              CONCAT14(-((char)((ulong)lVar19 >> 0x20) < '\0'),
                                                       CONCAT13(-((char)((ulong)lVar19 >> 0x18) <
                                                                 '\0'),CONCAT12(-((char)((ulong)
                                                  lVar19 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar19 >> 8) < '\0'),
                                                           -((char)lVar19 < '\0'))))))));
          if (uVar13 == 0) {
            lVar19 = 8;
            do {
              uVar12 = uVar12 + lVar19 & uVar14;
              lVar20 = *(long *)((long)plVar2 + uVar12);
              uVar13 = CONCAT17(-(lVar20 < 0),
                                CONCAT16(-((char)((ulong)lVar20 >> 0x30) < '\0'),
                                         CONCAT15(-((char)((ulong)lVar20 >> 0x28) < '\0'),
                                                  CONCAT14(-((char)((ulong)lVar20 >> 0x20) < '\0'),
                                                           CONCAT13(-((char)((ulong)lVar20 >> 0x18)
                                                                     < '\0'),CONCAT12(-((char)((
                                                  ulong)lVar20 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar20 >> 8) < '\0'),
                                                           -((char)lVar20 < '\0'))))))));
              lVar19 = lVar19 + 8;
            } while (uVar13 == 0);
          }
          uVar13 = (uVar13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar13 & 0x5555555555555555) << 1;
          uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
          uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
          uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
          uVar12 = uVar12 + ((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3) & uVar14;
          if (-1 < *(char *)((long)plVar2 + uVar12)) {
            lVar19 = *plVar2;
            uVar12 = CONCAT17(-(lVar19 < 0),
                              CONCAT16(-((char)((ulong)lVar19 >> 0x30) < '\0'),
                                       CONCAT15(-((char)((ulong)lVar19 >> 0x28) < '\0'),
                                                CONCAT14(-((char)((ulong)lVar19 >> 0x20) < '\0'),
                                                         CONCAT13(-((char)((ulong)lVar19 >> 0x18) <
                                                                   '\0'),CONCAT12(-((char)((ulong)
                                                  lVar19 >> 0x10) < '\0'),
                                                  CONCAT11(-((char)((ulong)lVar19 >> 8) < '\0'),
                                                           -((char)lVar19 < '\0'))))))));
            uVar12 = (uVar12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar12 & 0x5555555555555555) << 1;
            uVar12 = (uVar12 & 0xcccccccccccccccc) >> 2 | (uVar12 & 0x3333333333333333) << 2;
            uVar12 = (uVar12 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar12 & 0xf0f0f0f0f0f0f0f) << 4;
            uVar12 = (uVar12 & 0xff00ff00ff00ff00) >> 8 | (uVar12 & 0xff00ff00ff00ff) << 8;
            uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
            uVar12 = (ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3;
          }
          uVar16 = uVar16 - 1 & uVar16;
          bVar5 = (byte)(uVar11 >> 0x38);
          *(byte *)((long)plVar2 + uVar12) = bVar5 >> 1;
          *(byte *)((long)plVar2 + (uVar12 - 8 & uVar14) + 8) = bVar5 >> 1;
          plVar3 = plVar15 + ~uVar17 * 4;
          lVar19 = *plVar3;
          lVar21 = plVar3[3];
          lVar20 = plVar3[2];
          plVar4 = plVar2 + ~uVar12 * 4;
          plVar4[1] = plVar3[1];
          *plVar4 = lVar19;
          plVar4[3] = lVar21;
          plVar4[2] = lVar20;
          lVar18 = lVar18 + -1;
        } while (lVar18 != 0);
      }
      *param_2 = (long)plVar2;
      param_2[1] = uVar14;
      param_2[2] = uVar1 - unaff_x22;
      param_2[3] = unaff_x22;
      if (unaff_x23 != 0) {
        lVar18 = unaff_x23 * 0x20 + 0x20;
        lVar8 = unaff_x23 + lVar18 + 9;
        if (lVar8 != 0) {
          func_0x00187bd4((long)plVar15 - lVar18,lVar8,8);
        }
      }
      return 0x8000000000000001;
    }
  }
  uVar7 = func_0x004584a8(param_5);
  return uVar7;
}

