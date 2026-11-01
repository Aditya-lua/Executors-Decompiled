
long FUN_00563558(long *param_1,long *param_2)

{
  long *plVar1;
  ulong uVar2;
  byte bVar3;
  bool bVar4;
  ulong uVar5;
  long in_x9;
  byte bVar6;
  ulong in_x12;
  ulong extraout_x12;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  long unaff_x19;
  long unaff_x20;
  byte bVar10;
  char cVar12;
  char cVar13;
  char cVar14;
  char cVar15;
  char cVar16;
  char cVar17;
  long lVar11;
  long *in_stack_00000000;
  
  if (in_x9 == 0) {
    func_0x007a7f9c(param_2,1,param_2 + 4,1);
    param_1 = in_stack_00000000;
    in_x12 = extraout_x12;
  }
  lVar7 = 0;
  bVar4 = false;
  uVar9 = (unaff_x20 + 8) * 0x517cc1b727220a95;
  plVar1 = (long *)*param_2;
  uVar2 = param_2[1];
  bVar3 = (byte)(uVar9 >> 0x38);
  bVar6 = bVar3 >> 1;
  uVar9 = uVar9 & uVar2;
  lVar11 = *(long *)((long)plVar1 + uVar9);
  uVar8 = CONCAT17(-((byte)((ulong)lVar11 >> 0x38) == bVar6),
                   CONCAT16(-((byte)((ulong)lVar11 >> 0x30) == bVar6),
                            CONCAT15(-((byte)((ulong)lVar11 >> 0x28) == bVar6),
                                     CONCAT14(-((byte)((ulong)lVar11 >> 0x20) == bVar6),
                                              CONCAT13(-((byte)((ulong)lVar11 >> 0x18) == bVar6),
                                                       CONCAT12(-((byte)((ulong)lVar11 >> 0x10) ==
                                                                 bVar6),CONCAT11(-((byte)((ulong)
                                                  lVar11 >> 8) == bVar6),-((byte)lVar11 == bVar6))))
                                             ))));
  while( true ) {
    for (uVar8 = uVar8 & 0x8080808080808080; uVar8 != 0; uVar8 = uVar8 - 1 & uVar8) {
      uVar5 = (uVar8 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar8 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
      uVar5 = uVar9 + ((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3) & uVar2;
      if (param_1 == (long *)plVar1[uVar5 * -2 + -2]) {
        lVar11 = plVar1[uVar5 * -2 + -1];
        plVar1[uVar5 * -2 + -1] = unaff_x19;
        lVar7 = *in_stack_00000000;
        *in_stack_00000000 = lVar7 + -1;
        LORelease();
        if (lVar7 == 1) {
          func_0x005d2ac4();
          return lVar11;
        }
        return lVar11;
      }
    }
    cVar12 = (char)((ulong)lVar11 >> 8);
    cVar13 = (char)((ulong)lVar11 >> 0x10);
    cVar14 = (char)((ulong)lVar11 >> 0x18);
    cVar15 = (char)((ulong)lVar11 >> 0x20);
    cVar16 = (char)((ulong)lVar11 >> 0x28);
    cVar17 = (char)((ulong)lVar11 >> 0x30);
    uVar5 = CONCAT17(-(lVar11 < 0),
                     CONCAT16(-(cVar17 < '\0'),
                              CONCAT15(-(cVar16 < '\0'),
                                       CONCAT14(-(cVar15 < '\0'),
                                                CONCAT13(-(cVar14 < '\0'),
                                                         CONCAT12(-(cVar13 < '\0'),
                                                                  CONCAT11(-(cVar12 < '\0'),
                                                                           -((char)lVar11 < '\0'))))
                                               ))));
    uVar8 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
    uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
    uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
    uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
    if (!bVar4) {
      in_x12 = uVar9 + ((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3) & uVar2;
    }
    bVar4 = bVar4 || uVar5 != 0;
    bVar10 = NEON_umaxv(CONCAT17(-((char)((ulong)lVar11 >> 0x38) == -1),
                                 CONCAT16(-(cVar17 == -1),
                                          CONCAT15(-(cVar16 == -1),
                                                   CONCAT14(-(cVar15 == -1),
                                                            CONCAT13(-(cVar14 == -1),
                                                                     CONCAT12(-(cVar13 == -1),
                                                                              CONCAT11(-(cVar12 ==
                                                                                        -1),-((char)
                                                  lVar11 == -1)))))))),1);
    if ((bVar10 & 1) != 0) break;
    lVar7 = lVar7 + 8;
    uVar9 = uVar9 + lVar7 & uVar2;
    lVar11 = *(long *)((long)plVar1 + uVar9);
    uVar8 = CONCAT17(-((byte)((ulong)lVar11 >> 0x38) == bVar6),
                     CONCAT16(-((byte)((ulong)lVar11 >> 0x30) == bVar6),
                              CONCAT15(-((byte)((ulong)lVar11 >> 0x28) == bVar6),
                                       CONCAT14(-((byte)((ulong)lVar11 >> 0x20) == bVar6),
                                                CONCAT13(-((byte)((ulong)lVar11 >> 0x18) == bVar6),
                                                         CONCAT12(-((byte)((ulong)lVar11 >> 0x10) ==
                                                                   bVar6),CONCAT11(-((byte)((ulong)
                                                  lVar11 >> 8) == bVar6),-((byte)lVar11 == bVar6))))
                                               ))));
  }
  uVar8 = (ulong)*(char *)((long)plVar1 + in_x12);
  if (-1 < *(char *)((long)plVar1 + in_x12)) {
    lVar7 = *plVar1;
    uVar8 = CONCAT17(-(lVar7 < 0),
                     CONCAT16(-((char)((ulong)lVar7 >> 0x30) < '\0'),
                              CONCAT15(-((char)((ulong)lVar7 >> 0x28) < '\0'),
                                       CONCAT14(-((char)((ulong)lVar7 >> 0x20) < '\0'),
                                                CONCAT13(-((char)((ulong)lVar7 >> 0x18) < '\0'),
                                                         CONCAT12(-((char)((ulong)lVar7 >> 0x10) <
                                                                   '\0'),CONCAT11(-((char)((ulong)
                                                  lVar7 >> 8) < '\0'),-((char)lVar7 < '\0'))))))));
    uVar8 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
    uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
    uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
    uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
    in_x12 = (ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3;
    uVar8 = (ulong)*(byte *)((long)plVar1 + in_x12);
  }
  *(byte *)((long)plVar1 + in_x12) = bVar3 >> 1;
  *(byte *)((long)plVar1 + (in_x12 - 8 & uVar2) + 8) = bVar3 >> 1;
  param_2[2] = param_2[2] - (uVar8 & 1);
  param_2[3] = param_2[3] + 1;
  plVar1[in_x12 * -2 + -2] = (long)param_1;
  plVar1[in_x12 * -2 + -1] = unaff_x19;
  return 0;
}

