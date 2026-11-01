
void FUN_005351fc(void)

{
  ulong uVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  int *extraout_x8;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  byte bVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  long lVar13;
  byte bVar14;
  undefined8 uVar15;
  undefined1 auVar16 [16];
  
  lVar4 = 8;
  func_0x00187bd4();
  auVar16 = __Unwind_Resume();
  plVar3 = auVar16._0_8_;
  lVar5 = 0;
  uVar10 = plVar3[5] ^ 0x646f72616e646f6d;
  uVar9 = auVar16._8_8_ & 0xffffffff | lVar4 << 0x20;
  uVar7 = uVar9 ^ plVar3[5] ^ 0x7465646279746573;
  uVar6 = uVar10 + (plVar3[4] ^ 0x736f6d6570736575U);
  uVar11 = uVar6 ^ (uVar10 >> 0x33 | uVar10 << 0xd);
  uVar10 = uVar7 + (plVar3[4] ^ 0x6c7967656e657261U);
  uVar1 = uVar11 + uVar10;
  uVar10 = uVar10 ^ (uVar7 >> 0x30 | uVar7 << 0x10);
  uVar12 = uVar1 ^ (uVar11 >> 0x2f | uVar11 << 0x11);
  uVar6 = uVar10 + (uVar6 >> 0x20 | uVar6 << 0x20);
  uVar7 = uVar6 ^ (uVar10 >> 0x2b | uVar10 << 0x15);
  uVar11 = uVar7 ^ 0x800000000000000;
  uVar6 = (uVar6 ^ uVar9) + uVar12;
  uVar9 = uVar6 ^ (uVar12 >> 0x33 | uVar12 << 0xd);
  uVar10 = uVar11 + (uVar1 >> 0x20 | uVar1 << 0x20);
  uVar1 = uVar10 + uVar9;
  uVar10 = uVar10 ^ (uVar11 >> 0x30 | uVar7 << 0x10);
  uVar6 = uVar10 + (uVar6 >> 0x20 | uVar6 << 0x20);
  uVar11 = uVar1 ^ (uVar9 >> 0x2f | uVar9 << 0x11);
  uVar7 = uVar6 ^ (uVar10 >> 0x2b | uVar10 << 0x15);
  uVar6 = (uVar6 ^ 0x800000000000000) + uVar11;
  uVar11 = uVar6 ^ (uVar11 >> 0x33 | uVar11 << 0xd);
  uVar10 = uVar7 + ((uVar1 >> 0x20 | uVar1 << 0x20) ^ 0xff);
  uVar1 = uVar11 + uVar10;
  uVar10 = uVar10 ^ (uVar7 >> 0x30 | uVar7 << 0x10);
  uVar11 = uVar1 ^ (uVar11 >> 0x2f | uVar11 << 0x11);
  uVar6 = uVar10 + (uVar6 >> 0x20 | uVar6 << 0x20);
  uVar7 = uVar11 + uVar6;
  uVar6 = uVar6 ^ (uVar10 >> 0x2b | uVar10 << 0x15);
  uVar11 = uVar7 ^ (uVar11 >> 0x33 | uVar11 << 0xd);
  uVar10 = uVar6 + (uVar1 >> 0x20 | uVar1 << 0x20);
  uVar1 = uVar11 + uVar10;
  uVar10 = uVar10 ^ (uVar6 >> 0x30 | uVar6 << 0x10);
  uVar11 = uVar1 ^ (uVar11 >> 0x2f | uVar11 << 0x11);
  uVar6 = uVar10 + (uVar7 >> 0x20 | uVar7 << 0x20);
  uVar7 = uVar6 ^ (uVar10 >> 0x2b | uVar10 << 0x15);
  uVar11 = uVar11 + uVar6 ^ (uVar11 >> 0x33 | uVar11 << 0xd);
  uVar6 = uVar7 + (uVar1 >> 0x20 | uVar1 << 0x20);
  uVar10 = uVar11 + uVar6;
  uVar6 = uVar6 ^ (uVar7 >> 0x30 | uVar7 << 0x10);
  uVar10 = (uVar6 >> 0x2b | uVar6 << 0x15) ^ (uVar11 >> 0x2f | uVar11 << 0x11) ^
           (uVar10 >> 0x20 | uVar10 << 0x20) ^ uVar10;
  lVar2 = *plVar3;
  uVar1 = plVar3[1];
  bVar8 = (byte)(uVar10 >> 0x39);
  uVar7 = uVar10 & uVar1;
  uVar15 = *(undefined8 *)(lVar2 + uVar7);
  uVar6 = CONCAT17(-((byte)((ulong)uVar15 >> 0x38) == bVar8),
                   CONCAT16(-((byte)((ulong)uVar15 >> 0x30) == bVar8),
                            CONCAT15(-((byte)((ulong)uVar15 >> 0x28) == bVar8),
                                     CONCAT14(-((byte)((ulong)uVar15 >> 0x20) == bVar8),
                                              CONCAT13(-((byte)((ulong)uVar15 >> 0x18) == bVar8),
                                                       CONCAT12(-((byte)((ulong)uVar15 >> 0x10) ==
                                                                 bVar8),CONCAT11(-((byte)((ulong)
                                                  uVar15 >> 8) == bVar8),-((byte)uVar15 == bVar8))))
                                             )))) & 0x8080808080808080;
  while( true ) {
    while (uVar6 == 0) {
      bVar14 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar15 >> 0x38) == -1),
                                   CONCAT16(-((char)((ulong)uVar15 >> 0x30) == -1),
                                            CONCAT15(-((char)((ulong)uVar15 >> 0x28) == -1),
                                                     CONCAT14(-((char)((ulong)uVar15 >> 0x20) == -1)
                                                              ,CONCAT13(-((char)((ulong)uVar15 >>
                                                                                0x18) == -1),
                                                                        CONCAT12(-((char)((ulong)
                                                  uVar15 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar15 >> 8) == -1),
                                                           -((char)uVar15 == -1)))))))),1);
      if ((bVar14 & 1) != 0) {
        if (plVar3[2] == 0) {
          func_0x007a5690(plVar3,1,plVar3 + 4,1);
        }
        *extraout_x8 = auVar16._8_4_;
        extraout_x8[1] = (int)lVar4;
        *(long **)(extraout_x8 + 2) = plVar3;
        *(ulong *)(extraout_x8 + 4) = uVar10;
        return;
      }
      lVar5 = lVar5 + 8;
      uVar7 = uVar7 + lVar5 & uVar1;
      uVar15 = *(undefined8 *)(lVar2 + uVar7);
      uVar6 = CONCAT17(-((byte)((ulong)uVar15 >> 0x38) == bVar8),
                       CONCAT16(-((byte)((ulong)uVar15 >> 0x30) == bVar8),
                                CONCAT15(-((byte)((ulong)uVar15 >> 0x28) == bVar8),
                                         CONCAT14(-((byte)((ulong)uVar15 >> 0x20) == bVar8),
                                                  CONCAT13(-((byte)((ulong)uVar15 >> 0x18) == bVar8)
                                                           ,CONCAT12(-((byte)((ulong)uVar15 >> 0x10)
                                                                      == bVar8),
                                                                     CONCAT11(-((byte)((ulong)uVar15
                                                                                      >> 8) == bVar8
                                                                               ),-((byte)uVar15 ==
                                                                                  bVar8)))))))) &
              0x8080808080808080;
    }
    uVar11 = (uVar6 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar6 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
    lVar13 = lVar2 + (uVar7 + ((ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >> 3) & uVar1) *
                     -0x10;
    if (*(int *)(lVar13 + -0x10) == auVar16._8_4_ && *(int *)(lVar13 + -0xc) == (int)lVar4) break;
    uVar6 = uVar6 - 1 & uVar6;
  }
  *(long *)(extraout_x8 + 2) = lVar13;
  *(long **)(extraout_x8 + 4) = plVar3;
  *extraout_x8 = 0x110000;
  return;
}

