
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0079c8ec(long param_1)

{
  ulong uVar1;
  long *plVar2;
  long *plVar3;
  long *plVar4;
  byte bVar5;
  undefined8 uVar6;
  long lVar7;
  ulong uVar8;
  undefined8 in_x3;
  ulong uVar9;
  long *plVar10;
  ulong uVar11;
  long in_x9;
  ulong uVar12;
  long *unaff_x19;
  ulong uVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  
  uVar9 = 0xffffffffffffffff >>
          (LZCOUNT((in_x9 + ((ulong)(param_1 - in_x9) >> 1) >> 2) - 1) & 0x3fU);
  if (uVar9 < 0x7ffffffffffffff) {
    uVar15 = uVar9 + 1;
    uVar13 = uVar15 * 0x20;
    uVar1 = uVar9 + 9;
    if ((!CARRY8(uVar13,uVar1)) && (uVar8 = uVar13 + uVar1, uVar8 < 0x7ffffffffffffff9)) {
      lVar7 = func_0x00187bd0(uVar8,8);
      if (lVar7 == 0) {
        uVar6 = func_0x004584ec(in_x3,8,uVar8);
        return uVar6;
      }
      plVar2 = (long *)(lVar7 + uVar13);
      _memset(plVar2,0xff,uVar1);
      uVar1 = uVar9;
      if (8 < uVar15) {
        uVar1 = (uVar15 >> 3) * 7;
      }
      lVar7 = unaff_x19[3];
      if (lVar7 == 0) {
        lVar16 = *unaff_x19;
        lVar7 = unaff_x19[1];
        *unaff_x19 = (long)plVar2;
        unaff_x19[1] = uVar9;
        unaff_x19[2] = uVar1;
        unaff_x19[3] = 0;
      }
      else {
        lVar14 = 0;
        plVar10 = (long *)*unaff_x19;
        lVar16 = *plVar10;
        uVar15 = CONCAT17(-(-1 < lVar16),
                          CONCAT16(-(-1 < (char)((ulong)lVar16 >> 0x30)),
                                   CONCAT15(-(-1 < (char)((ulong)lVar16 >> 0x28)),
                                            CONCAT14(-(-1 < (char)((ulong)lVar16 >> 0x20)),
                                                     CONCAT13(-(-1 < (char)((ulong)lVar16 >> 0x18)),
                                                              CONCAT12(-(-1 < (char)((ulong)lVar16
                                                                                    >> 0x10)),
                                                                       CONCAT11(-(-1 < (char)((ulong
                                                  )lVar16 >> 8)),-(-1 < (char)lVar16)))))))) &
                 0x8080808080808080;
        do {
          while (uVar15 == 0) {
            plVar10 = plVar10 + 1;
            lVar16 = *plVar10;
            lVar14 = lVar14 + 8;
            uVar15 = CONCAT17(-(-1 < lVar16),
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
          uVar13 = (uVar15 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar15 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
          uVar8 = func_0x00192570();
          uVar11 = uVar8 & uVar9;
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
              uVar11 = uVar11 + lVar16 & uVar9;
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
          uVar11 = uVar11 + ((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3) & uVar9;
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
          uVar15 = uVar15 - 1 & uVar15;
          bVar5 = (byte)(uVar8 >> 0x38);
          *(byte *)((long)plVar2 + uVar11) = bVar5 >> 1;
          *(byte *)((long)plVar2 + (uVar11 - 8 & uVar9) + 8) = bVar5 >> 1;
          lVar16 = *unaff_x19;
          plVar3 = (long *)(lVar16 + ~(lVar14 + ((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >>
                                                3)) * 0x20);
          lVar19 = *plVar3;
          lVar18 = plVar3[3];
          lVar17 = plVar3[2];
          plVar4 = plVar2 + ~uVar11 * 4;
          plVar4[1] = plVar3[1];
          *plVar4 = lVar19;
          plVar4[3] = lVar18;
          plVar4[2] = lVar17;
          lVar7 = lVar7 + -1;
        } while (lVar7 != 0);
        lVar7 = unaff_x19[1];
        *unaff_x19 = (long)plVar2;
        unaff_x19[1] = uVar9;
        unaff_x19[2] = uVar1 - unaff_x19[3];
        unaff_x19[3] = unaff_x19[3];
      }
      if (lVar7 != 0) {
        lVar14 = lVar7 * 0x20 + 0x20;
        lVar7 = lVar7 + lVar14 + 9;
        if (lVar7 != 0) {
          func_0x00187bd4(lVar16 - lVar14,lVar7,8);
        }
      }
      return 0x8000000000000001;
    }
  }
  uVar6 = func_0x004584a8(in_x3);
  return uVar6;
}

