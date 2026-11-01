
undefined8 FUN_004baec8(void)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  long *plVar6;
  byte bVar7;
  ulong uVar8;
  byte bVar9;
  undefined8 uVar10;
  undefined1 auVar11 [16];
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000028;
  
  func_0x005ec378(&uStack0000000000000010,&uStack0000000000000028);
  func_0x004b8af4(&uStack0000000000000010);
  __Unwind_Resume();
  auVar11 = func_0x007a2668();
  plVar6 = *(long **)*auVar11._0_8_;
  if (plVar6[3] != 0) {
    lVar5 = 0;
    uVar8 = (ulong)*auVar11._8_8_ * 0x517cc1b727220a95;
    lVar1 = *plVar6;
    uVar2 = plVar6[1];
    bVar7 = (byte)(uVar8 >> 0x39);
    uVar8 = uVar8 & uVar2;
    uVar10 = *(undefined8 *)(lVar1 + uVar8);
    uVar4 = CONCAT17(-((byte)((ulong)uVar10 >> 0x38) == bVar7),
                     CONCAT16(-((byte)((ulong)uVar10 >> 0x30) == bVar7),
                              CONCAT15(-((byte)((ulong)uVar10 >> 0x28) == bVar7),
                                       CONCAT14(-((byte)((ulong)uVar10 >> 0x20) == bVar7),
                                                CONCAT13(-((byte)((ulong)uVar10 >> 0x18) == bVar7),
                                                         CONCAT12(-((byte)((ulong)uVar10 >> 0x10) ==
                                                                   bVar7),CONCAT11(-((byte)((ulong)
                                                  uVar10 >> 8) == bVar7),-((byte)uVar10 == bVar7))))
                                               ))));
    while( true ) {
      for (uVar4 = uVar4 & 0x8080808080808080; uVar4 != 0; uVar4 = uVar4 - 1 & uVar4) {
        uVar3 = (uVar4 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar4 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
        if (*auVar11._8_8_ ==
            *(uint *)(lVar1 + -4 +
                     (uVar8 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3) & uVar2) * -4)) {
          return 0;
        }
      }
      bVar9 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar10 >> 0x38) == -1),
                                  CONCAT16(-((char)((ulong)uVar10 >> 0x30) == -1),
                                           CONCAT15(-((char)((ulong)uVar10 >> 0x28) == -1),
                                                    CONCAT14(-((char)((ulong)uVar10 >> 0x20) == -1),
                                                             CONCAT13(-((char)((ulong)uVar10 >> 0x18
                                                                              ) == -1),
                                                                      CONCAT12(-((char)((ulong)
                                                  uVar10 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar10 >> 8) == -1),
                                                           -((char)uVar10 == -1)))))))),1);
      if ((bVar9 & 1) != 0) break;
      lVar5 = lVar5 + 8;
      uVar8 = uVar8 + lVar5 & uVar2;
      uVar10 = *(undefined8 *)(lVar1 + uVar8);
      uVar4 = CONCAT17(-((byte)((ulong)uVar10 >> 0x38) == bVar7),
                       CONCAT16(-((byte)((ulong)uVar10 >> 0x30) == bVar7),
                                CONCAT15(-((byte)((ulong)uVar10 >> 0x28) == bVar7),
                                         CONCAT14(-((byte)((ulong)uVar10 >> 0x20) == bVar7),
                                                  CONCAT13(-((byte)((ulong)uVar10 >> 0x18) == bVar7)
                                                           ,CONCAT12(-((byte)((ulong)uVar10 >> 0x10)
                                                                      == bVar7),
                                                                     CONCAT11(-((byte)((ulong)uVar10
                                                                                      >> 8) == bVar7
                                                                               ),-((byte)uVar10 ==
                                                                                  bVar7))))))));
    }
  }
  return 1;
}

