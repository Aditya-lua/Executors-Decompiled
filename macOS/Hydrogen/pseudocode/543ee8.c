
bool FUN_00543ee8(long param_1)

{
  bool bVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  ulong extraout_x8;
  long lVar5;
  long lVar6;
  ulong extraout_x9;
  ulong uVar7;
  byte bVar8;
  long lVar9;
  ulong extraout_x11;
  ulong extraout_x12;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  long unaff_x19;
  long unaff_x29;
  byte bVar13;
  undefined8 uVar14;
  undefined1 auVar15 [16];
  undefined1 auStack_7ffffffe [2147483630];
  
  lVar3 = 4;
  func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xd0),param_1 << 2);
  if (*(long *)(unaff_x29 + -0xf0) != 0) {
    lVar3 = 8;
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xe8),*(long *)(unaff_x29 + -0xf0) * 0x18);
  }
  lVar5 = *(long *)(unaff_x29 + -0x78);
  if (lVar5 != 0) {
    uVar4 = lVar5 * 4 + 0xbU & 0xfffffffffffffff8;
    lVar5 = lVar5 + uVar4 + 9;
    if (lVar5 != 0) {
      lVar3 = 8;
      func_0x00187bd4(*(long *)(unaff_x29 + -0x80) - uVar4,lVar5);
    }
  }
  func_0x0053a3f4(auStack_7ffffffe + 0x8000024e);
  if (unaff_x19 != 0) {
    lVar3 = 4;
    func_0x00187bd4();
  }
  func_0x0053defc();
  __Unwind_Resume();
  func_0x007a2668();
  auVar15 = func_0x007a2668();
  lVar5 = auVar15._0_8_;
  if (*(long *)(lVar5 + 0x198) != 0) {
    lVar9 = 0;
    uVar11 = (auVar15._8_8_ + 8) * 0x517cc1b727220a95;
    lVar6 = *(long *)(lVar5 + 0x180);
    uVar7 = *(ulong *)(lVar5 + 0x188);
    bVar8 = (byte)(uVar11 >> 0x39);
    uVar11 = uVar11 & uVar7;
    uVar14 = *(undefined8 *)(lVar6 + uVar11);
    uVar4 = CONCAT17(-((byte)((ulong)uVar14 >> 0x38) == bVar8),
                     CONCAT16(-((byte)((ulong)uVar14 >> 0x30) == bVar8),
                              CONCAT15(-((byte)((ulong)uVar14 >> 0x28) == bVar8),
                                       CONCAT14(-((byte)((ulong)uVar14 >> 0x20) == bVar8),
                                                CONCAT13(-((byte)((ulong)uVar14 >> 0x18) == bVar8),
                                                         CONCAT12(-((byte)((ulong)uVar14 >> 0x10) ==
                                                                   bVar8),CONCAT11(-((byte)((ulong)
                                                  uVar14 >> 8) == bVar8),-((byte)uVar14 == bVar8))))
                                               )))) & 0x8080808080808080;
    while( true ) {
      for (; uVar4 != 0; uVar4 = uVar4 - 1 & uVar4) {
        uVar12 = (uVar4 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar4 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
        uVar12 = uVar11 + ((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3) & uVar7;
        if (auVar15._8_8_ == *(long *)(lVar6 + -0x28 + uVar12 * -0x28)) {
          lVar5 = 0;
          lVar9 = lVar6 + uVar12 * -0x28;
          uVar11 = *(ulong *)(lVar9 + -0x10);
          uVar12 = *(ulong *)(lVar9 + -8);
          uVar10 = (lVar3 + 8) * 0x517cc1b727220a95;
          bVar8 = (byte)(uVar10 >> 0x39);
          uVar10 = uVar10 & uVar7;
          uVar14 = *(undefined8 *)(lVar6 + uVar10);
          uVar4 = CONCAT17(-((byte)((ulong)uVar14 >> 0x38) == bVar8),
                           CONCAT16(-((byte)((ulong)uVar14 >> 0x30) == bVar8),
                                    CONCAT15(-((byte)((ulong)uVar14 >> 0x28) == bVar8),
                                             CONCAT14(-((byte)((ulong)uVar14 >> 0x20) == bVar8),
                                                      CONCAT13(-((byte)((ulong)uVar14 >> 0x18) ==
                                                                bVar8),CONCAT12(-((byte)((ulong)
                                                  uVar14 >> 0x10) == bVar8),
                                                  CONCAT11(-((byte)((ulong)uVar14 >> 8) == bVar8),
                                                           -((byte)uVar14 == bVar8)))))))) &
                  0x8080808080808080;
          goto joined_r0x00544074;
        }
      }
      bVar13 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar14 >> 0x38) == -1),
                                   CONCAT16(-((char)((ulong)uVar14 >> 0x30) == -1),
                                            CONCAT15(-((char)((ulong)uVar14 >> 0x28) == -1),
                                                     CONCAT14(-((char)((ulong)uVar14 >> 0x20) == -1)
                                                              ,CONCAT13(-((char)((ulong)uVar14 >>
                                                                                0x18) == -1),
                                                                        CONCAT12(-((char)((ulong)
                                                  uVar14 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar14 >> 8) == -1),
                                                           -((char)uVar14 == -1)))))))),1);
      if ((bVar13 & 1) != 0) break;
      lVar9 = lVar9 + 8;
      uVar11 = uVar11 + lVar9 & uVar7;
      uVar14 = *(undefined8 *)(lVar6 + uVar11);
      uVar4 = CONCAT17(-((byte)((ulong)uVar14 >> 0x38) == bVar8),
                       CONCAT16(-((byte)((ulong)uVar14 >> 0x30) == bVar8),
                                CONCAT15(-((byte)((ulong)uVar14 >> 0x28) == bVar8),
                                         CONCAT14(-((byte)((ulong)uVar14 >> 0x20) == bVar8),
                                                  CONCAT13(-((byte)((ulong)uVar14 >> 0x18) == bVar8)
                                                           ,CONCAT12(-((byte)((ulong)uVar14 >> 0x10)
                                                                      == bVar8),
                                                                     CONCAT11(-((byte)((ulong)uVar14
                                                                                      >> 8) == bVar8
                                                                               ),-((byte)uVar14 ==
                                                                                  bVar8)))))))) &
              0x8080808080808080;
    }
  }
  func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ec7d0);
LAB_0054411c:
  func_0x007a23d8(&UNK_008aad91,0x16,&UNK_009ec7e8);
  uVar4 = extraout_x8;
  uVar7 = extraout_x9;
  uVar11 = extraout_x11;
  uVar12 = extraout_x12;
LAB_00544134:
  if ((int)uVar4 == 0) {
code_r0x005440fc:
    bVar1 = uVar7 <= uVar12;
  }
  else {
code_r0x00544138:
    bVar1 = uVar4 <= uVar11;
  }
LAB_0054413c:
  return !bVar1;
joined_r0x00544074:
  if (uVar4 != 0) {
    uVar2 = (uVar4 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar4 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
    uVar2 = uVar10 + ((ulong)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) >> 3) & uVar7;
    if (lVar3 == *(long *)(lVar6 + -0x28 + uVar2 * -0x28)) {
      lVar6 = lVar6 + uVar2 * -0x28;
      bVar1 = *(ulong *)(lVar6 + -0x20) <= *(ulong *)(lVar9 + -0x20);
      if (*(ulong *)(lVar9 + -0x20) != *(ulong *)(lVar6 + -0x20)) goto LAB_0054413c;
      uVar4 = *(ulong *)(lVar6 + -0x10);
      uVar7 = *(ulong *)(lVar6 + -8);
      if ((uVar11 & 1) == 0) goto LAB_00544134;
      if ((uVar4 & 1) == 0) goto code_r0x00544138;
      goto code_r0x005440fc;
    }
    uVar4 = uVar4 - 1 & uVar4;
    goto joined_r0x00544074;
  }
  bVar13 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar14 >> 0x38) == -1),
                               CONCAT16(-((char)((ulong)uVar14 >> 0x30) == -1),
                                        CONCAT15(-((char)((ulong)uVar14 >> 0x28) == -1),
                                                 CONCAT14(-((char)((ulong)uVar14 >> 0x20) == -1),
                                                          CONCAT13(-((char)((ulong)uVar14 >> 0x18)
                                                                    == -1),CONCAT12(-((char)((ulong)
                                                  uVar14 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar14 >> 8) == -1),
                                                           -((char)uVar14 == -1)))))))),1);
  if ((bVar13 & 1) != 0) goto LAB_0054411c;
  lVar5 = lVar5 + 8;
  uVar10 = uVar10 + lVar5 & uVar7;
  uVar14 = *(undefined8 *)(lVar6 + uVar10);
  uVar4 = CONCAT17(-((byte)((ulong)uVar14 >> 0x38) == bVar8),
                   CONCAT16(-((byte)((ulong)uVar14 >> 0x30) == bVar8),
                            CONCAT15(-((byte)((ulong)uVar14 >> 0x28) == bVar8),
                                     CONCAT14(-((byte)((ulong)uVar14 >> 0x20) == bVar8),
                                              CONCAT13(-((byte)((ulong)uVar14 >> 0x18) == bVar8),
                                                       CONCAT12(-((byte)((ulong)uVar14 >> 0x10) ==
                                                                 bVar8),CONCAT11(-((byte)((ulong)
                                                  uVar14 >> 8) == bVar8),-((byte)uVar14 == bVar8))))
                                             )))) & 0x8080808080808080;
  goto joined_r0x00544074;
}

