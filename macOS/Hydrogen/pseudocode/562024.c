
void FUN_00562024(void)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  long *plVar4;
  undefined8 *extraout_x8;
  long lVar5;
  byte bVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  byte bVar10;
  undefined8 uVar11;
  undefined1 auVar12 [16];
  undefined1 uStack0000000000000008;
  long *plStack_38;
  
  func_0x005d2ac4(&uStack0000000000000008);
  __Unwind_Resume();
  auVar12 = func_0x007a2668();
  plStack_38 = auVar12._8_8_;
  plVar4 = auVar12._0_8_;
  lVar5 = 0;
  uVar9 = (long)(plStack_38 + 1) * 0x517cc1b727220a95;
  lVar1 = *plVar4;
  uVar2 = plVar4[1];
  bVar6 = (byte)(uVar9 >> 0x39);
  uVar7 = uVar9 & uVar2;
  uVar11 = *(undefined8 *)(lVar1 + uVar7);
  uVar3 = CONCAT17(-((byte)((ulong)uVar11 >> 0x38) == bVar6),
                   CONCAT16(-((byte)((ulong)uVar11 >> 0x30) == bVar6),
                            CONCAT15(-((byte)((ulong)uVar11 >> 0x28) == bVar6),
                                     CONCAT14(-((byte)((ulong)uVar11 >> 0x20) == bVar6),
                                              CONCAT13(-((byte)((ulong)uVar11 >> 0x18) == bVar6),
                                                       CONCAT12(-((byte)((ulong)uVar11 >> 0x10) ==
                                                                 bVar6),CONCAT11(-((byte)((ulong)
                                                  uVar11 >> 8) == bVar6),-((byte)uVar11 == bVar6))))
                                             ))));
  while( true ) {
    for (uVar3 = uVar3 & 0x8080808080808080; uVar3 != 0; uVar3 = uVar3 - 1 & uVar3) {
      uVar8 = (uVar3 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar3 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
      uVar8 = uVar7 + ((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3) & uVar2;
      if (*(long **)(lVar1 + -0x28 + uVar8 * -0x28) == plStack_38) {
        extraout_x8[1] = lVar1 + uVar8 * -0x28;
        extraout_x8[2] = plVar4;
        *extraout_x8 = 0;
        lVar5 = *plStack_38;
        *plStack_38 = lVar5 + -1;
        LORelease();
        if (lVar5 == 1) {
          func_0x005d2ac4(&plStack_38);
          return;
        }
        return;
      }
    }
    bVar10 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar11 >> 0x38) == -1),
                                 CONCAT16(-((char)((ulong)uVar11 >> 0x30) == -1),
                                          CONCAT15(-((char)((ulong)uVar11 >> 0x28) == -1),
                                                   CONCAT14(-((char)((ulong)uVar11 >> 0x20) == -1),
                                                            CONCAT13(-((char)((ulong)uVar11 >> 0x18)
                                                                      == -1),CONCAT12(-((char)((
                                                  ulong)uVar11 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar11 >> 8) == -1),
                                                           -((char)uVar11 == -1)))))))),1);
    if ((bVar10 & 1) != 0) break;
    lVar5 = lVar5 + 8;
    uVar7 = uVar7 + lVar5 & uVar2;
    uVar11 = *(undefined8 *)(lVar1 + uVar7);
    uVar3 = CONCAT17(-((byte)((ulong)uVar11 >> 0x38) == bVar6),
                     CONCAT16(-((byte)((ulong)uVar11 >> 0x30) == bVar6),
                              CONCAT15(-((byte)((ulong)uVar11 >> 0x28) == bVar6),
                                       CONCAT14(-((byte)((ulong)uVar11 >> 0x20) == bVar6),
                                                CONCAT13(-((byte)((ulong)uVar11 >> 0x18) == bVar6),
                                                         CONCAT12(-((byte)((ulong)uVar11 >> 0x10) ==
                                                                   bVar6),CONCAT11(-((byte)((ulong)
                                                  uVar11 >> 8) == bVar6),-((byte)uVar11 == bVar6))))
                                               ))));
  }
  if (plVar4[2] == 0) {
    func_0x007a89dc(plVar4,1,plVar4 + 4,1);
  }
  *extraout_x8 = plStack_38;
  extraout_x8[1] = plVar4;
  extraout_x8[2] = uVar9;
  return;
}

