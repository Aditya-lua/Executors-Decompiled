
void FUN_005619cc(void)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  long *plVar4;
  ulong uVar5;
  int iVar6;
  undefined8 *extraout_x8;
  long lVar7;
  byte bVar8;
  ulong uVar9;
  ulong uVar10;
  byte bVar11;
  undefined8 uVar12;
  undefined1 auVar13 [12];
  undefined1 uStack0000000000000008;
  int iStack_34;
  
  func_0x005d2ac4(&uStack0000000000000008);
  __Unwind_Resume();
  auVar13 = func_0x007a2668();
  iVar6 = auVar13._8_4_;
  plVar4 = auVar13._0_8_;
  iStack_34 = iVar6;
  uVar5 = func_0x005763e4(plVar4 + 4,&iStack_34);
  lVar7 = 0;
  lVar1 = *plVar4;
  uVar2 = plVar4[1];
  bVar8 = (byte)(uVar5 >> 0x39);
  uVar9 = uVar5 & uVar2;
  uVar12 = *(undefined8 *)(lVar1 + uVar9);
  uVar3 = CONCAT17(-((byte)((ulong)uVar12 >> 0x38) == bVar8),
                   CONCAT16(-((byte)((ulong)uVar12 >> 0x30) == bVar8),
                            CONCAT15(-((byte)((ulong)uVar12 >> 0x28) == bVar8),
                                     CONCAT14(-((byte)((ulong)uVar12 >> 0x20) == bVar8),
                                              CONCAT13(-((byte)((ulong)uVar12 >> 0x18) == bVar8),
                                                       CONCAT12(-((byte)((ulong)uVar12 >> 0x10) ==
                                                                 bVar8),CONCAT11(-((byte)((ulong)
                                                  uVar12 >> 8) == bVar8),-((byte)uVar12 == bVar8))))
                                             ))));
  while( true ) {
    for (uVar3 = uVar3 & 0x8080808080808080; uVar3 != 0; uVar3 = uVar3 - 1 & uVar3) {
      uVar10 = (uVar3 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar3 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
      uVar10 = uVar9 + ((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) & uVar2;
      if (*(int *)(lVar1 + -0x38 + uVar10 * -0x38) == iVar6) {
        extraout_x8[1] = lVar1 + uVar10 * -0x38;
        extraout_x8[2] = plVar4;
        *extraout_x8 = 0;
        return;
      }
    }
    bVar11 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar12 >> 0x38) == -1),
                                 CONCAT16(-((char)((ulong)uVar12 >> 0x30) == -1),
                                          CONCAT15(-((char)((ulong)uVar12 >> 0x28) == -1),
                                                   CONCAT14(-((char)((ulong)uVar12 >> 0x20) == -1),
                                                            CONCAT13(-((char)((ulong)uVar12 >> 0x18)
                                                                      == -1),CONCAT12(-((char)((
                                                  ulong)uVar12 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar12 >> 8) == -1),
                                                           -((char)uVar12 == -1)))))))),1);
    if ((bVar11 & 1) != 0) break;
    lVar7 = lVar7 + 8;
    uVar9 = uVar9 + lVar7 & uVar2;
    uVar12 = *(undefined8 *)(lVar1 + uVar9);
    uVar3 = CONCAT17(-((byte)((ulong)uVar12 >> 0x38) == bVar8),
                     CONCAT16(-((byte)((ulong)uVar12 >> 0x30) == bVar8),
                              CONCAT15(-((byte)((ulong)uVar12 >> 0x28) == bVar8),
                                       CONCAT14(-((byte)((ulong)uVar12 >> 0x20) == bVar8),
                                                CONCAT13(-((byte)((ulong)uVar12 >> 0x18) == bVar8),
                                                         CONCAT12(-((byte)((ulong)uVar12 >> 0x10) ==
                                                                   bVar8),CONCAT11(-((byte)((ulong)
                                                  uVar12 >> 8) == bVar8),-((byte)uVar12 == bVar8))))
                                               ))));
  }
  if (plVar4[2] == 0) {
    func_0x007ad168(plVar4,1,plVar4 + 4,1);
  }
  *extraout_x8 = plVar4;
  extraout_x8[1] = uVar5;
  *(int *)(extraout_x8 + 2) = iVar6;
  return;
}

