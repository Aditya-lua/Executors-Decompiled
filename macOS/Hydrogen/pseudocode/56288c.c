
void FUN_0056288c(long *param_1,undefined8 param_2,undefined8 param_3,byte param_4,long param_5)

{
  ulong uVar1;
  bool bVar2;
  long *in_x9;
  undefined1 in_w10;
  ulong in_x11;
  ulong in_x12;
  long in_x13;
  ulong uVar3;
  ulong in_x14;
  ulong in_x15;
  long in_x16;
  ulong in_x17;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar4;
  long lVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 uVar8;
  long lVar9;
  char cVar10;
  char cVar12;
  char cVar13;
  char cVar14;
  char cVar15;
  char cVar16;
  char cVar17;
  long lVar11;
  char cVar18;
  undefined8 uStack0000000000000008;
  
  do {
    if ((param_4 & 1) != 0) {
      uVar3 = (ulong)*(char *)((long)in_x9 + in_x12);
      if (-1 < *(char *)((long)in_x9 + in_x12)) {
        lVar11 = *in_x9;
        uVar3 = CONCAT17(-(lVar11 < 0),
                         CONCAT16(-((char)((ulong)lVar11 >> 0x30) < '\0'),
                                  CONCAT15(-((char)((ulong)lVar11 >> 0x28) < '\0'),
                                           CONCAT14(-((char)((ulong)lVar11 >> 0x20) < '\0'),
                                                    CONCAT13(-((char)((ulong)lVar11 >> 0x18) < '\0')
                                                             ,CONCAT12(-((char)((ulong)lVar11 >>
                                                                               0x10) < '\0'),
                                                                       CONCAT11(-((char)((ulong)
                                                  lVar11 >> 8) < '\0'),-((char)lVar11 < '\0'))))))))
        ;
        uVar3 = (uVar3 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar3 & 0x5555555555555555) << 1;
        uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
        uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
        uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
        in_x12 = (ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3;
        uVar3 = (ulong)*(byte *)((long)in_x9 + in_x12);
      }
      lVar11 = *(long *)(param_5 + 0x10);
      lVar5 = *(long *)(param_5 + 0x18);
      *(undefined1 *)((long)in_x9 + in_x12) = in_w10;
      *(undefined1 *)((long)in_x9 + (in_x12 - 8 & in_x11) + 8) = in_w10;
      *(ulong *)(param_5 + 0x10) = lVar11 - (uVar3 & 1);
      *(long *)(param_5 + 0x18) = lVar5 + 1;
      in_x9[in_x12 * -5 + -5] = (long)param_1;
      lVar7 = *unaff_x19;
      lVar5 = unaff_x19[3];
      lVar11 = unaff_x19[2];
      in_x9[in_x12 * -5 + -3] = unaff_x19[1];
      in_x9[in_x12 * -5 + -4] = lVar7;
      in_x9[in_x12 * -5 + -1] = lVar5;
      in_x9[in_x12 * -5 + -2] = lVar11;
      unaff_x20[2] = 2;
      return;
    }
    in_x13 = in_x13 + 8;
    in_x17 = in_x17 + in_x13 & in_x11;
    lVar11 = *(long *)((long)in_x9 + in_x17);
    cVar10 = (char)lVar11;
    cVar12 = (char)((ulong)lVar11 >> 8);
    cVar13 = (char)((ulong)lVar11 >> 0x10);
    cVar14 = (char)((ulong)lVar11 >> 0x18);
    cVar15 = (char)((ulong)lVar11 >> 0x20);
    cVar16 = (char)((ulong)lVar11 >> 0x28);
    cVar17 = (char)((ulong)lVar11 >> 0x30);
    cVar18 = (char)((ulong)lVar11 >> 0x38);
    for (uVar3 = CONCAT17(-(cVar18 == (char)((ulong)param_2 >> 0x38)),
                          CONCAT16(-(cVar17 == (char)((ulong)param_2 >> 0x30)),
                                   CONCAT15(-(cVar16 == (char)((ulong)param_2 >> 0x28)),
                                            CONCAT14(-(cVar15 == (char)((ulong)param_2 >> 0x20)),
                                                     CONCAT13(-(cVar14 ==
                                                               (char)((ulong)param_2 >> 0x18)),
                                                              CONCAT12(-(cVar13 ==
                                                                        (char)((ulong)param_2 >>
                                                                              0x10)),
                                                                       CONCAT11(-(cVar12 ==
                                                                                 (char)((ulong)
                                                  param_2 >> 8)),-(cVar10 == (char)param_2)))))))) &
                 0x8080808080808080; uVar3 != 0; uVar3 = uVar3 - 1 & uVar3) {
      uVar1 = (uVar3 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar3 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
      lVar5 = (in_x17 + ((ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >> 3) & in_x11) * in_x16;
      if (param_1 == *(long **)((long)in_x9 + (-0x28 - lVar5))) {
        uVar4 = *(undefined8 *)((long)in_x9 + (-0x20 - lVar5));
        uVar8 = *(undefined8 *)((long)in_x9 + (-8 - lVar5));
        uVar6 = *(undefined8 *)((long)in_x9 + (-0x10 - lVar5));
        unaff_x20[1] = *(undefined8 *)((long)in_x9 + (-0x18 - lVar5));
        *unaff_x20 = uVar4;
        unaff_x20[3] = uVar8;
        unaff_x20[2] = uVar6;
        lVar11 = *unaff_x19;
        lVar9 = unaff_x19[3];
        lVar7 = unaff_x19[2];
        *(long *)((long)in_x9 + (-0x18 - lVar5)) = unaff_x19[1];
        *(long *)((long)in_x9 + (-0x20 - lVar5)) = lVar11;
        *(long *)((long)in_x9 + (-8 - lVar5)) = lVar9;
        *(long *)((long)in_x9 + (-0x10 - lVar5)) = lVar7;
        lVar11 = *param_1;
        *param_1 = lVar11 + -1;
        LORelease();
        if (lVar11 == 1) {
          func_0x005d2ac4(&uStack0000000000000008);
          return;
        }
        return;
      }
    }
    uVar1 = CONCAT17(-(lVar11 < 0),
                     CONCAT16(-(cVar17 < '\0'),
                              CONCAT15(-(cVar16 < '\0'),
                                       CONCAT14(-(cVar15 < '\0'),
                                                CONCAT13(-(cVar14 < '\0'),
                                                         CONCAT12(-(cVar13 < '\0'),
                                                                  CONCAT11(-(cVar12 < '\0'),
                                                                           -(cVar10 < '\0'))))))));
    uVar3 = (uVar1 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar1 & 0x5555555555555555) << 1;
    uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
    uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
    uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
    bVar2 = in_x14 != 1;
    in_x14 = in_x15;
    if (bVar2) {
      in_x14 = (ulong)(uVar1 != 0);
      in_x12 = in_x17 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3) & in_x11;
    }
    param_4 = NEON_umaxv(CONCAT17(-(cVar18 == (char)((ulong)param_3 >> 0x38)),
                                  CONCAT16(-(cVar17 == (char)((ulong)param_3 >> 0x30)),
                                           CONCAT15(-(cVar16 == (char)((ulong)param_3 >> 0x28)),
                                                    CONCAT14(-(cVar15 ==
                                                              (char)((ulong)param_3 >> 0x20)),
                                                             CONCAT13(-(cVar14 ==
                                                                       (char)((ulong)param_3 >> 0x18
                                                                             )),
                                                                      CONCAT12(-(cVar13 ==
                                                                                (char)((ulong)
                                                  param_3 >> 0x10)),
                                                  CONCAT11(-(cVar12 == (char)((ulong)param_3 >> 8)),
                                                           -(cVar10 == (char)param_3)))))))),1);
  } while( true );
}

