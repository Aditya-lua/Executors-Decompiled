
void FUN_00564010(undefined8 param_1,undefined8 param_2,long *param_3)

{
  long *plVar1;
  ulong uVar2;
  byte bVar3;
  bool bVar4;
  long *plVar5;
  ulong uVar6;
  long *extraout_x8;
  byte bVar7;
  ulong extraout_x11;
  ulong extraout_x11_00;
  ulong uVar8;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  long lVar12;
  byte bVar13;
  char cVar15;
  char cVar16;
  char cVar17;
  char cVar18;
  char cVar19;
  char cVar20;
  long lVar14;
  undefined1 auVar21 [16];
  undefined4 uStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  undefined4 uStack_48;
  undefined4 uStack_44;
  undefined4 uStack_40;
  undefined4 uStack_3c;
  undefined4 uStack_38;
  undefined4 uStack_34;
  
  __Unwind_Resume();
  auVar21 = func_0x007a2668();
  plVar5 = auVar21._0_8_;
  uVar8 = extraout_x11;
  if (plVar5[2] == 0) {
    func_0x007ab0a0(plVar5,1,plVar5 + 4,1);
    uVar8 = extraout_x11_00;
  }
  lVar9 = 0;
  bVar4 = false;
  uVar11 = (auVar21._8_8_ & 0xffffffff) * 0x517cc1b727220a95;
  plVar1 = (long *)*plVar5;
  uVar2 = plVar5[1];
  bVar3 = (byte)(uVar11 >> 0x38);
  bVar7 = bVar3 >> 1;
  uVar11 = uVar11 & uVar2;
  lVar14 = *(long *)((long)plVar1 + uVar11);
  uVar10 = CONCAT17(-((byte)((ulong)lVar14 >> 0x38) == bVar7),
                    CONCAT16(-((byte)((ulong)lVar14 >> 0x30) == bVar7),
                             CONCAT15(-((byte)((ulong)lVar14 >> 0x28) == bVar7),
                                      CONCAT14(-((byte)((ulong)lVar14 >> 0x20) == bVar7),
                                               CONCAT13(-((byte)((ulong)lVar14 >> 0x18) == bVar7),
                                                        CONCAT12(-((byte)((ulong)lVar14 >> 0x10) ==
                                                                  bVar7),CONCAT11(-((byte)((ulong)
                                                  lVar14 >> 8) == bVar7),-((byte)lVar14 == bVar7))))
                                              ))));
  while( true ) {
    for (uVar10 = uVar10 & 0x8080808080808080; uVar10 != 0; uVar10 = uVar10 - 1 & uVar10) {
      uVar6 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
      uVar6 = uVar11 + ((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3) & uVar2;
      if (auVar21._8_4_ == (int)plVar1[uVar6 * -5 + -5]) {
        lVar9 = plVar1[uVar6 * -5 + -4];
        lVar12 = plVar1[uVar6 * -5 + -1];
        lVar14 = plVar1[uVar6 * -5 + -2];
        extraout_x8[1] = plVar1[uVar6 * -5 + -3];
        *extraout_x8 = lVar9;
        extraout_x8[3] = lVar12;
        extraout_x8[2] = lVar14;
        lVar9 = *param_3;
        lVar12 = param_3[3];
        lVar14 = param_3[2];
        plVar1[uVar6 * -5 + -3] = param_3[1];
        plVar1[uVar6 * -5 + -4] = lVar9;
        plVar1[uVar6 * -5 + -1] = lVar12;
        plVar1[uVar6 * -5 + -2] = lVar14;
        return;
      }
    }
    cVar15 = (char)((ulong)lVar14 >> 8);
    cVar16 = (char)((ulong)lVar14 >> 0x10);
    cVar17 = (char)((ulong)lVar14 >> 0x18);
    cVar18 = (char)((ulong)lVar14 >> 0x20);
    cVar19 = (char)((ulong)lVar14 >> 0x28);
    cVar20 = (char)((ulong)lVar14 >> 0x30);
    uVar6 = CONCAT17(-(lVar14 < 0),
                     CONCAT16(-(cVar20 < '\0'),
                              CONCAT15(-(cVar19 < '\0'),
                                       CONCAT14(-(cVar18 < '\0'),
                                                CONCAT13(-(cVar17 < '\0'),
                                                         CONCAT12(-(cVar16 < '\0'),
                                                                  CONCAT11(-(cVar15 < '\0'),
                                                                           -((char)lVar14 < '\0'))))
                                               ))));
    uVar10 = (uVar6 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar6 & 0x5555555555555555) << 1;
    uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
    uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
    uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
    if (!bVar4) {
      uVar8 = uVar11 + ((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) & uVar2;
    }
    bVar4 = bVar4 || uVar6 != 0;
    bVar13 = NEON_umaxv(CONCAT17(-((char)((ulong)lVar14 >> 0x38) == -1),
                                 CONCAT16(-(cVar20 == -1),
                                          CONCAT15(-(cVar19 == -1),
                                                   CONCAT14(-(cVar18 == -1),
                                                            CONCAT13(-(cVar17 == -1),
                                                                     CONCAT12(-(cVar16 == -1),
                                                                              CONCAT11(-(cVar15 ==
                                                                                        -1),-((char)
                                                  lVar14 == -1)))))))),1);
    if ((bVar13 & 1) != 0) break;
    lVar9 = lVar9 + 8;
    uVar11 = uVar11 + lVar9 & uVar2;
    lVar14 = *(long *)((long)plVar1 + uVar11);
    uVar10 = CONCAT17(-((byte)((ulong)lVar14 >> 0x38) == bVar7),
                      CONCAT16(-((byte)((ulong)lVar14 >> 0x30) == bVar7),
                               CONCAT15(-((byte)((ulong)lVar14 >> 0x28) == bVar7),
                                        CONCAT14(-((byte)((ulong)lVar14 >> 0x20) == bVar7),
                                                 CONCAT13(-((byte)((ulong)lVar14 >> 0x18) == bVar7),
                                                          CONCAT12(-((byte)((ulong)lVar14 >> 0x10)
                                                                    == bVar7),
                                                                   CONCAT11(-((byte)((ulong)lVar14
                                                                                    >> 8) == bVar7),
                                                                            -((byte)lVar14 == bVar7)
                                                                           )))))));
  }
  uVar10 = (ulong)*(char *)((long)plVar1 + uVar8);
  if (-1 < *(char *)((long)plVar1 + uVar8)) {
    lVar9 = *plVar1;
    uVar8 = CONCAT17(-(lVar9 < 0),
                     CONCAT16(-((char)((ulong)lVar9 >> 0x30) < '\0'),
                              CONCAT15(-((char)((ulong)lVar9 >> 0x28) < '\0'),
                                       CONCAT14(-((char)((ulong)lVar9 >> 0x20) < '\0'),
                                                CONCAT13(-((char)((ulong)lVar9 >> 0x18) < '\0'),
                                                         CONCAT12(-((char)((ulong)lVar9 >> 0x10) <
                                                                   '\0'),CONCAT11(-((char)((ulong)
                                                  lVar9 >> 8) < '\0'),-((char)lVar9 < '\0'))))))));
    uVar8 = (uVar8 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar8 & 0x5555555555555555) << 1;
    uVar8 = (uVar8 & 0xcccccccccccccccc) >> 2 | (uVar8 & 0x3333333333333333) << 2;
    uVar8 = (uVar8 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar8 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar8 = (uVar8 & 0xff00ff00ff00ff00) >> 8 | (uVar8 & 0xff00ff00ff00ff) << 8;
    uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
    uVar8 = (ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3;
    uVar10 = (ulong)*(byte *)((long)plVar1 + uVar8);
  }
  uStack_48 = (undefined4)param_3[1];
  uStack_44 = (undefined4)((ulong)param_3[1] >> 0x20);
  uStack_50 = (undefined4)*param_3;
  uStack_4c = (undefined4)((ulong)*param_3 >> 0x20);
  uStack_38 = (undefined4)param_3[3];
  uStack_34 = (undefined4)((ulong)param_3[3] >> 0x20);
  uStack_40 = (undefined4)param_3[2];
  uStack_3c = (undefined4)((ulong)param_3[2] >> 0x20);
  *(byte *)((long)plVar1 + uVar8) = bVar3 >> 1;
  *(byte *)((long)plVar1 + (uVar8 - 8 & uVar2) + 8) = bVar3 >> 1;
  *(ulong *)((long)plVar1 + uVar8 * -0x28 + -0x1c) = CONCAT44(uStack_48,uStack_4c);
  *(ulong *)((long)plVar1 + uVar8 * -0x28 + -0x24) = CONCAT44(uStack_50,uStack_54);
  plVar5[2] = plVar5[2] - (uVar10 & 1);
  plVar5[3] = plVar5[3] + 1;
  *(int *)(plVar1 + uVar8 * -5 + -5) = auVar21._8_4_;
  *(ulong *)((long)plVar1 + uVar8 * -0x28 + -0xc) = CONCAT44(uStack_38,uStack_3c);
  *(ulong *)((long)plVar1 + uVar8 * -0x28 + -0x14) = CONCAT44(uStack_40,uStack_44);
  *(undefined4 *)((long)plVar1 + uVar8 * -0x28 + -4) = uStack_34;
  *extraout_x8 = 0;
  return;
}

