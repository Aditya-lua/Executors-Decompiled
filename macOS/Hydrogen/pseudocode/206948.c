
void FUN_00206948(undefined1 param_1 [16])

{
  long *plVar1;
  ulong uVar2;
  byte bVar3;
  bool bVar4;
  long lVar5;
  long lVar6;
  code *pcVar7;
  int iVar8;
  undefined8 *puVar9;
  ulong uVar10;
  ulong uVar11;
  long lVar12;
  byte bVar13;
  ulong extraout_x12;
  ulong extraout_x12_00;
  ulong uVar14;
  undefined8 *unaff_x20;
  long *unaff_x21;
  long *plVar15;
  undefined8 unaff_x23;
  ulong uVar16;
  long unaff_x27;
  undefined8 unaff_x28;
  byte bVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  char cVar22;
  char cVar23;
  char cVar24;
  char cVar25;
  char cVar26;
  char cVar27;
  long lVar21;
  ulong in_stack_00000040;
  undefined8 uStack00000000000000c8;
  long in_stack_000000d0;
  long in_stack_000000d8;
  undefined1 auStack_7ffffffe [2147483646];
  
  *(undefined8 *)(unaff_x27 + 0x48) = 1;
  *(undefined8 *)(unaff_x27 + 0x40) = 1;
  *(long *)(unaff_x27 + 0x58) = param_1._8_8_;
  *(long *)(unaff_x27 + 0x50) = param_1._0_8_;
  puVar9 = (undefined8 *)func_0x00187bd0(0x50,8);
  if (puVar9 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x50);
                    /* WARNING: Does not return */
    pcVar7 = (code *)SoftwareBreakpoint(1,0x206be0);
    (*pcVar7)();
  }
  uVar18 = *(undefined8 *)(unaff_x27 + 0x60);
  uVar20 = *(undefined8 *)(unaff_x27 + 0x78);
  uVar19 = *(undefined8 *)(unaff_x27 + 0x70);
  puVar9[5] = *(undefined8 *)(unaff_x27 + 0x68);
  puVar9[4] = uVar18;
  puVar9[7] = uVar20;
  puVar9[6] = uVar19;
  uVar18 = *(undefined8 *)(unaff_x27 + 0x80);
  puVar9[9] = *(undefined8 *)(unaff_x27 + 0x88);
  puVar9[8] = uVar18;
  uVar20 = *(undefined8 *)(unaff_x27 + 0x40);
  uVar19 = *(undefined8 *)(unaff_x27 + 0x58);
  uVar18 = *(undefined8 *)(unaff_x27 + 0x50);
  puVar9[1] = *(undefined8 *)(unaff_x27 + 0x48);
  *puVar9 = uVar20;
  puVar9[3] = uVar19;
  puVar9[2] = uVar18;
  uVar10 = func_0x00192570(unaff_x21 + 4,&uStack00000000000000c8);
  uVar14 = extraout_x12;
  if (unaff_x21[2] == 0) {
    func_0x0079c610();
    uVar14 = extraout_x12_00;
  }
  lVar6 = in_stack_000000d8;
  lVar5 = in_stack_000000d0;
  lVar12 = 0;
  bVar4 = false;
  plVar1 = (long *)*unaff_x21;
  uVar2 = unaff_x21[1];
  bVar3 = (byte)(uVar10 >> 0x38);
  bVar13 = bVar3 >> 1;
  uVar10 = uVar10 & uVar2;
  lVar21 = *(long *)((long)plVar1 + uVar10);
  uVar16 = CONCAT17(-((byte)((ulong)lVar21 >> 0x38) == bVar13),
                    CONCAT16(-((byte)((ulong)lVar21 >> 0x30) == bVar13),
                             CONCAT15(-((byte)((ulong)lVar21 >> 0x28) == bVar13),
                                      CONCAT14(-((byte)((ulong)lVar21 >> 0x20) == bVar13),
                                               CONCAT13(-((byte)((ulong)lVar21 >> 0x18) == bVar13),
                                                        CONCAT12(-((byte)((ulong)lVar21 >> 0x10) ==
                                                                  bVar13),CONCAT11(-((byte)((ulong)
                                                  lVar21 >> 8) == bVar13),-((byte)lVar21 == bVar13))
                                                  ))))));
  while( true ) {
    uVar16 = uVar16 & 0x8080808080808080;
    if (uVar16 != 0) {
      do {
        uVar11 = (uVar16 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar16 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
        uVar11 = uVar10 + ((ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >> 3) & uVar2;
        if ((lVar6 == plVar1[uVar11 * -4 + -2]) &&
           (iVar8 = _memcmp(lVar5,plVar1[uVar11 * -4 + -3],lVar6), iVar8 == 0)) {
          plVar15 = (long *)plVar1[uVar11 * -4 + -1];
          plVar1[uVar11 * -4 + -1] = (long)puVar9;
          if (uStack00000000000000c8 != 0) {
            func_0x00187bd4(in_stack_000000d0,uStack00000000000000c8,1);
          }
          lVar12 = *plVar15;
          *plVar15 = lVar12 + -1;
          LORelease();
          if (lVar12 == 1) {
            DataMemoryBarrier(2,1);
            func_0x001f9f8c(auStack_7ffffffe + 0x8000021e);
          }
          goto LAB_00206b34;
        }
        uVar16 = uVar16 - 1 & uVar16;
      } while (uVar16 != 0);
    }
    cVar22 = (char)((ulong)lVar21 >> 8);
    cVar23 = (char)((ulong)lVar21 >> 0x10);
    cVar24 = (char)((ulong)lVar21 >> 0x18);
    cVar25 = (char)((ulong)lVar21 >> 0x20);
    cVar26 = (char)((ulong)lVar21 >> 0x28);
    cVar27 = (char)((ulong)lVar21 >> 0x30);
    uVar11 = CONCAT17(-(lVar21 < 0),
                      CONCAT16(-(cVar27 < '\0'),
                               CONCAT15(-(cVar26 < '\0'),
                                        CONCAT14(-(cVar25 < '\0'),
                                                 CONCAT13(-(cVar24 < '\0'),
                                                          CONCAT12(-(cVar23 < '\0'),
                                                                   CONCAT11(-(cVar22 < '\0'),
                                                                            -((char)lVar21 < '\0')))
                                                         )))));
    uVar16 = (uVar11 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar11 & 0x5555555555555555) << 1;
    uVar16 = (uVar16 & 0xcccccccccccccccc) >> 2 | (uVar16 & 0x3333333333333333) << 2;
    uVar16 = (uVar16 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar16 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar16 = (uVar16 & 0xff00ff00ff00ff00) >> 8 | (uVar16 & 0xff00ff00ff00ff) << 8;
    uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
    if (!bVar4) {
      uVar14 = uVar10 + ((ulong)LZCOUNT(uVar16 >> 0x20 | uVar16 << 0x20) >> 3) & uVar2;
    }
    bVar4 = bVar4 || uVar11 != 0;
    bVar17 = NEON_umaxv(CONCAT17(-((char)((ulong)lVar21 >> 0x38) == -1),
                                 CONCAT16(-(cVar27 == -1),
                                          CONCAT15(-(cVar26 == -1),
                                                   CONCAT14(-(cVar25 == -1),
                                                            CONCAT13(-(cVar24 == -1),
                                                                     CONCAT12(-(cVar23 == -1),
                                                                              CONCAT11(-(cVar22 ==
                                                                                        -1),-((char)
                                                  lVar21 == -1)))))))),1);
    if ((bVar17 & 1) != 0) break;
    lVar12 = lVar12 + 8;
    uVar10 = uVar10 + lVar12 & uVar2;
    lVar21 = *(long *)((long)plVar1 + uVar10);
    uVar16 = CONCAT17(-((byte)((ulong)lVar21 >> 0x38) == bVar13),
                      CONCAT16(-((byte)((ulong)lVar21 >> 0x30) == bVar13),
                               CONCAT15(-((byte)((ulong)lVar21 >> 0x28) == bVar13),
                                        CONCAT14(-((byte)((ulong)lVar21 >> 0x20) == bVar13),
                                                 CONCAT13(-((byte)((ulong)lVar21 >> 0x18) == bVar13)
                                                          ,CONCAT12(-((byte)((ulong)lVar21 >> 0x10)
                                                                     == bVar13),
                                                                    CONCAT11(-((byte)((ulong)lVar21
                                                                                     >> 8) == bVar13
                                                                              ),-((byte)lVar21 ==
                                                                                 bVar13))))))));
  }
  uVar10 = (ulong)*(char *)((long)plVar1 + uVar14);
  if (-1 < *(char *)((long)plVar1 + uVar14)) {
    lVar12 = *plVar1;
    uVar14 = CONCAT17(-(lVar12 < 0),
                      CONCAT16(-((char)((ulong)lVar12 >> 0x30) < '\0'),
                               CONCAT15(-((char)((ulong)lVar12 >> 0x28) < '\0'),
                                        CONCAT14(-((char)((ulong)lVar12 >> 0x20) < '\0'),
                                                 CONCAT13(-((char)((ulong)lVar12 >> 0x18) < '\0'),
                                                          CONCAT12(-((char)((ulong)lVar12 >> 0x10) <
                                                                    '\0'),CONCAT11(-((char)((ulong)
                                                  lVar12 >> 8) < '\0'),-((char)lVar12 < '\0'))))))))
    ;
    uVar14 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
    uVar14 = (uVar14 & 0xcccccccccccccccc) >> 2 | (uVar14 & 0x3333333333333333) << 2;
    uVar14 = (uVar14 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar14 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar14 = (uVar14 & 0xff00ff00ff00ff00) >> 8 | (uVar14 & 0xff00ff00ff00ff) << 8;
    uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
    uVar14 = (ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3;
    uVar10 = (ulong)*(byte *)((long)plVar1 + uVar14);
  }
  unaff_x21[2] = unaff_x21[2] - (uVar10 & 1);
  bVar3 = bVar3 >> 1;
  *(byte *)((long)plVar1 + uVar14) = bVar3;
  *(byte *)((long)plVar1 + (uVar14 - 8 & uVar2) + 8) = bVar3;
  unaff_x21[3] = unaff_x21[3] + 1;
  plVar1[uVar14 * -4 + -3] = in_stack_000000d0;
  plVar1[uVar14 * -4 + -4] = uStack00000000000000c8;
  plVar1[uVar14 * -4 + -2] = in_stack_000000d8;
  plVar1[uVar14 * -4 + -1] = (long)puVar9;
LAB_00206b34:
  if ((in_stack_00000040 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(unaff_x23,in_stack_00000040,1);
  }
  *unaff_x20 = unaff_x28;
  return;
}

