
undefined1  [16] FUN_00563410(long param_1,undefined8 param_2,undefined1 param_3 [16],long param_4)

{
  bool bVar1;
  undefined8 uVar2;
  ulong uVar3;
  long *in_x9;
  undefined1 in_w10;
  ulong in_x11;
  ulong in_x12;
  long in_x13;
  ulong uVar4;
  ulong in_x14;
  ulong in_x15;
  ulong in_x16;
  undefined4 unaff_w19;
  ulong unaff_x20;
  byte bVar5;
  char cVar6;
  char cVar8;
  char cVar9;
  char cVar10;
  char cVar11;
  char cVar12;
  char cVar13;
  long lVar7;
  char cVar14;
  undefined1 auVar15 [16];
  undefined8 uStack0000000000000008;
  
  while( true ) {
    in_x16 = in_x16 + in_x13 & in_x11;
    lVar7 = *(long *)((long)in_x9 + in_x16);
    cVar6 = (char)lVar7;
    cVar8 = (char)((ulong)lVar7 >> 8);
    cVar9 = (char)((ulong)lVar7 >> 0x10);
    cVar10 = (char)((ulong)lVar7 >> 0x18);
    cVar11 = (char)((ulong)lVar7 >> 0x20);
    cVar12 = (char)((ulong)lVar7 >> 0x28);
    cVar13 = (char)((ulong)lVar7 >> 0x30);
    cVar14 = (char)((ulong)lVar7 >> 0x38);
    for (uVar4 = CONCAT17(-(cVar14 == (char)((ulong)param_2 >> 0x38)),
                          CONCAT16(-(cVar13 == (char)((ulong)param_2 >> 0x30)),
                                   CONCAT15(-(cVar12 == (char)((ulong)param_2 >> 0x28)),
                                            CONCAT14(-(cVar11 == (char)((ulong)param_2 >> 0x20)),
                                                     CONCAT13(-(cVar10 ==
                                                               (char)((ulong)param_2 >> 0x18)),
                                                              CONCAT12(-(cVar9 == (char)((ulong)
                                                  param_2 >> 0x10)),
                                                  CONCAT11(-(cVar8 == (char)((ulong)param_2 >> 8)),
                                                           -(cVar6 == (char)param_2)))))))) &
                 0x8080808080808080; uVar4 != 0; uVar4 = uVar4 - 1 & uVar4) {
      uVar3 = (uVar4 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar4 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
      uVar3 = in_x16 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3) & in_x11;
      if (param_1 == in_x9[uVar3 * -2 + -2]) {
        unaff_x20 = (ulong)*(uint *)(in_x9 + uVar3 * -2 + -1);
        *(undefined4 *)(in_x9 + uVar3 * -2 + -1) = unaff_w19;
        lVar7 = *uStack0000000000000008;
        *uStack0000000000000008 = lVar7 + -1;
        LORelease();
        if (lVar7 == 1) {
          func_0x005d2ac4(&uStack0000000000000008);
        }
        uVar2 = 1;
        goto code_r0x005634a4;
      }
    }
    uVar3 = CONCAT17(-(lVar7 < 0),
                     CONCAT16(-(cVar13 < '\0'),
                              CONCAT15(-(cVar12 < '\0'),
                                       CONCAT14(-(cVar11 < '\0'),
                                                CONCAT13(-(cVar10 < '\0'),
                                                         CONCAT12(-(cVar9 < '\0'),
                                                                  CONCAT11(-(cVar8 < '\0'),
                                                                           -(cVar6 < '\0'))))))));
    uVar4 = (uVar3 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar3 & 0x5555555555555555) << 1;
    uVar4 = (uVar4 & 0xcccccccccccccccc) >> 2 | (uVar4 & 0x3333333333333333) << 2;
    uVar4 = (uVar4 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar4 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar4 = (uVar4 & 0xff00ff00ff00ff00) >> 8 | (uVar4 & 0xff00ff00ff00ff) << 8;
    uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
    bVar1 = in_x14 != 1;
    in_x14 = in_x15;
    if (bVar1) {
      in_x14 = (ulong)(uVar3 != 0);
      in_x12 = in_x16 + ((ulong)LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) >> 3) & in_x11;
    }
    bVar5 = NEON_umaxv(CONCAT17(-(cVar14 == param_3[7]),
                                CONCAT16(-(cVar13 == param_3[6]),
                                         CONCAT15(-(cVar12 == param_3[5]),
                                                  CONCAT14(-(cVar11 == param_3[4]),
                                                           CONCAT13(-(cVar10 == param_3[3]),
                                                                    CONCAT12(-(cVar9 == param_3[2]),
                                                                             CONCAT11(-(cVar8 == 
                                                  param_3[1]),-(cVar6 == param_3[0])))))))),1);
    if ((bVar5 & 1) != 0) break;
    in_x13 = in_x13 + 8;
  }
  uVar4 = (ulong)*(char *)((long)in_x9 + in_x12);
  if (-1 < *(char *)((long)in_x9 + in_x12)) {
    lVar7 = *in_x9;
    uVar4 = CONCAT17(-(lVar7 < 0),
                     CONCAT16(-((char)((ulong)lVar7 >> 0x30) < '\0'),
                              CONCAT15(-((char)((ulong)lVar7 >> 0x28) < '\0'),
                                       CONCAT14(-((char)((ulong)lVar7 >> 0x20) < '\0'),
                                                CONCAT13(-((char)((ulong)lVar7 >> 0x18) < '\0'),
                                                         CONCAT12(-((char)((ulong)lVar7 >> 0x10) <
                                                                   '\0'),CONCAT11(-((char)((ulong)
                                                  lVar7 >> 8) < '\0'),-((char)lVar7 < '\0'))))))));
    uVar4 = (uVar4 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar4 & 0x5555555555555555) << 1;
    uVar4 = (uVar4 & 0xcccccccccccccccc) >> 2 | (uVar4 & 0x3333333333333333) << 2;
    uVar4 = (uVar4 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar4 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar4 = (uVar4 & 0xff00ff00ff00ff00) >> 8 | (uVar4 & 0xff00ff00ff00ff) << 8;
    uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
    in_x12 = (ulong)LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) >> 3;
    uVar4 = (ulong)*(byte *)((long)in_x9 + in_x12);
  }
  *(undefined1 *)((long)in_x9 + in_x12) = in_w10;
  *(undefined1 *)((long)in_x9 + (in_x12 - 8 & in_x11) + 8) = in_w10;
  *(ulong *)(param_4 + 0x10) = *(long *)(param_4 + 0x10) - (uVar4 & 1);
  *(long *)(param_4 + 0x18) = *(long *)(param_4 + 0x18) + 1;
  uVar2 = 0;
  in_x9[in_x12 * -2 + -2] = param_1;
  *(undefined4 *)(in_x9 + in_x12 * -2 + -1) = unaff_w19;
code_r0x005634a4:
  auVar15._8_8_ = unaff_x20;
  auVar15._0_8_ = uVar2;
  return auVar15;
}

