
long FUN_004857d8(void)

{
  long lVar1;
  byte bVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 *puVar6;
  long extraout_x8;
  long *extraout_x8_00;
  long *extraout_x8_01;
  long *plVar7;
  ulong extraout_x9;
  ulong extraout_x9_00;
  ulong uVar8;
  long extraout_x10;
  ulong uVar9;
  ulong extraout_x11;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  byte bVar13;
  long unaff_x21;
  ulong uVar14;
  long lVar15;
  long *unaff_x26;
  byte bVar16;
  undefined1 auVar17 [16];
  long in_stack_000000e8;
  long in_stack_000000f0;
  long in_stack_000000f8;
  undefined8 uStack0000000000000100;
  undefined8 in_stack_00000108;
  undefined8 uStack0000000000000118;
  undefined8 uStack00000000000001d8;
  undefined1 uStack00000000000001f0;
  
  uVar4 = func_0x007a2668();
  func_0x0047a214(&uStack00000000000001f0);
  lVar3 = *unaff_x26;
  *unaff_x26 = lVar3 + -1;
  LORelease();
  if (lVar3 == 1) {
    func_0x005d2ac4(&uStack00000000000001d8);
  }
  if (uStack0000000000000118 != 0xc) {
    func_0x0047a214(&uStack0000000000000118);
  }
  func_0x0048e1b8(&uStack0000000000000100);
  if (uStack0000000000000100 != 0) {
    func_0x00187bd4(in_stack_00000108,uStack0000000000000100 * 0x28,8);
  }
  in_stack_000000f8 = in_stack_000000f8 + 1;
  lVar3 = in_stack_000000f0;
  while (in_stack_000000f8 = in_stack_000000f8 + -1, in_stack_000000f8 != 0) {
    lVar3 = lVar3 + 0x108;
    func_0x00488488();
    unaff_x21 = lVar3;
  }
  if (in_stack_000000e8 != 0) {
    func_0x00187bd4(in_stack_000000f0,in_stack_000000e8 * 0x108,8);
  }
  __Unwind_Resume(uVar4);
  lVar3 = 0;
  while (lVar3 = lVar3 + -1, lVar3 != 0) {
    func_0x00488488(unaff_x21);
    unaff_x21 = unaff_x21 + 0x108;
  }
  if (in_stack_000000e8 != 0) {
    func_0x00187bd4(in_stack_000000f0,in_stack_000000e8 * 0x108,8);
    func_0x007a2668();
    func_0x007a2668();
    func_0x007a2668();
    lVar3 = uStack0000000000000100;
    if (uStack0000000000000100 != 0) goto LAB_00486d90;
  }
  func_0x007a2668();
  lVar3 = extraout_x8;
LAB_00486d90:
  func_0x00187bd4(in_stack_00000108,lVar3 * 0x28,8);
  auVar17 = func_0x007a2668();
  lVar15 = auVar17._8_8_;
  lVar5 = auVar17._0_8_;
  lVar3 = 0;
  uVar14 = lVar15 * 0x517cc1b727220a95;
  lVar11 = *(long *)(lVar5 + 0x100);
  uVar9 = *(ulong *)(lVar5 + 0x108);
  bVar2 = (byte)(uVar14 >> 0x38);
  bVar13 = bVar2 >> 1;
  uVar10 = uVar14 & uVar9;
  uVar4 = *(undefined8 *)(lVar11 + uVar10);
  uVar8 = CONCAT17(-((byte)((ulong)uVar4 >> 0x38) == bVar13),
                   CONCAT16(-((byte)((ulong)uVar4 >> 0x30) == bVar13),
                            CONCAT15(-((byte)((ulong)uVar4 >> 0x28) == bVar13),
                                     CONCAT14(-((byte)((ulong)uVar4 >> 0x20) == bVar13),
                                              CONCAT13(-((byte)((ulong)uVar4 >> 0x18) == bVar13),
                                                       CONCAT12(-((byte)((ulong)uVar4 >> 0x10) ==
                                                                 bVar13),CONCAT11(-((byte)((ulong)
                                                  uVar4 >> 8) == bVar13),-((byte)uVar4 == bVar13))))
                                             ))));
  while( true ) {
    for (uVar8 = uVar8 & 0x8080808080808080; uVar8 != 0; uVar8 = uVar8 - 1 & uVar8) {
      uVar12 = (uVar8 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar8 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
      uVar12 = uVar10 + ((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3) & uVar9;
      if (*(long *)(lVar11 + -0x10 + uVar12 * -0x10) == lVar15) {
        plVar7 = (long *)(lVar11 + uVar12 * -0x10);
        lVar3 = *(long *)plVar7[-1];
        *(long *)plVar7[-1] = lVar3 + 1;
        lVar15 = 0;
        if (lVar3 < 0) goto LAB_00486f3c;
        goto LAB_00486e78;
      }
    }
    bVar16 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar4 >> 0x38) == -1),
                                 CONCAT16(-((char)((ulong)uVar4 >> 0x30) == -1),
                                          CONCAT15(-((char)((ulong)uVar4 >> 0x28) == -1),
                                                   CONCAT14(-((char)((ulong)uVar4 >> 0x20) == -1),
                                                            CONCAT13(-((char)((ulong)uVar4 >> 0x18)
                                                                      == -1),CONCAT12(-((char)((
                                                  ulong)uVar4 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar4 >> 8) == -1),
                                                           -((char)uVar4 == -1)))))))),1);
    if ((bVar16 & 1) != 0) break;
    lVar3 = lVar3 + 8;
    uVar10 = uVar10 + lVar3 & uVar9;
    uVar4 = *(undefined8 *)(lVar11 + uVar10);
    uVar8 = CONCAT17(-((byte)((ulong)uVar4 >> 0x38) == bVar13),
                     CONCAT16(-((byte)((ulong)uVar4 >> 0x30) == bVar13),
                              CONCAT15(-((byte)((ulong)uVar4 >> 0x28) == bVar13),
                                       CONCAT14(-((byte)((ulong)uVar4 >> 0x20) == bVar13),
                                                CONCAT13(-((byte)((ulong)uVar4 >> 0x18) == bVar13),
                                                         CONCAT12(-((byte)((ulong)uVar4 >> 0x10) ==
                                                                   bVar13),CONCAT11(-((byte)((ulong)
                                                  uVar4 >> 8) == bVar13),-((byte)uVar4 == bVar13))))
                                               ))));
  }
  if (*(long *)(lVar5 + 0x110) == 0) {
    func_0x007a3ad0(lVar5 + 0x100,1,lVar5 + 0x120,1);
  }
  puVar6 = (undefined8 *)func_0x00187bd0(0x28,8);
  if (puVar6 == (undefined8 *)0x0) {
    puVar6 = (undefined8 *)func_0x007a1f18(8,0x28);
    plVar7 = extraout_x8_01;
    uVar8 = extraout_x9_00;
    lVar3 = extraout_x10;
    goto LAB_00486f8c;
  }
  *puVar6 = 1;
  *(undefined1 *)(puVar6 + 1) = 0;
  puVar6[2] = 0x8000000000000000;
  plVar7 = *(long **)(lVar5 + 0x100);
  uVar8 = *(ulong *)(lVar5 + 0x108);
  uVar14 = uVar8 & uVar14;
  lVar3 = *(long *)((long)plVar7 + uVar14);
  uVar9 = CONCAT17(-(lVar3 < 0),
                   CONCAT16(-((char)((ulong)lVar3 >> 0x30) < '\0'),
                            CONCAT15(-((char)((ulong)lVar3 >> 0x28) < '\0'),
                                     CONCAT14(-((char)((ulong)lVar3 >> 0x20) < '\0'),
                                              CONCAT13(-((char)((ulong)lVar3 >> 0x18) < '\0'),
                                                       CONCAT12(-((char)((ulong)lVar3 >> 0x10) <
                                                                 '\0'),CONCAT11(-((char)((ulong)
                                                  lVar3 >> 8) < '\0'),-((char)lVar3 < '\0'))))))));
  lVar3 = lVar15;
  if (uVar9 == 0) goto LAB_00486f40;
  while( true ) {
    uVar9 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
    uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
    uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
    uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
    uVar10 = uVar14 + ((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) & uVar8;
    uVar9 = (ulong)*(char *)((long)plVar7 + uVar10);
    lVar15 = lVar3;
    if (-1 < *(char *)((long)plVar7 + uVar10)) {
LAB_00486f8c:
      lVar11 = *plVar7;
      uVar9 = CONCAT17(-(lVar11 < 0),
                       CONCAT16(-((char)((ulong)lVar11 >> 0x30) < '\0'),
                                CONCAT15(-((char)((ulong)lVar11 >> 0x28) < '\0'),
                                         CONCAT14(-((char)((ulong)lVar11 >> 0x20) < '\0'),
                                                  CONCAT13(-((char)((ulong)lVar11 >> 0x18) < '\0'),
                                                           CONCAT12(-((char)((ulong)lVar11 >> 0x10)
                                                                     < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar11 >> 8) < '\0'),-((char)lVar11 < '\0'))
                                                  ))))));
      uVar9 = (uVar9 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar9 & 0x5555555555555555) << 1;
      uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
      uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
      uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
      uVar10 = (ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3;
      uVar9 = (ulong)*(byte *)((long)plVar7 + uVar10);
    }
    *(byte *)((long)plVar7 + uVar10) = bVar2 >> 1;
    *(byte *)((long)plVar7 + (uVar10 - 8 & uVar8) + 8) = bVar2 >> 1;
    plVar7 = plVar7 + uVar10 * -2;
    lVar11 = *(long *)(lVar5 + 0x110);
    lVar1 = *(long *)(lVar5 + 0x118);
    plVar7[-2] = lVar3;
    plVar7[-1] = (long)puVar6;
    *(ulong *)(lVar5 + 0x110) = lVar11 - (uVar9 & 1);
    *(long *)(lVar5 + 0x118) = lVar1 + 1;
    lVar3 = *(long *)plVar7[-1];
    *(long *)plVar7[-1] = lVar3 + 1;
    if (-1 < lVar3) break;
LAB_00486f3c:
    puVar6 = (undefined8 *)func_0x007a05dc();
    plVar7 = extraout_x8_00;
    uVar8 = extraout_x9;
    uVar14 = extraout_x11;
LAB_00486f40:
    lVar11 = 8;
    do {
      uVar14 = uVar14 + lVar11 & uVar8;
      lVar3 = *(long *)((long)plVar7 + uVar14);
      uVar9 = CONCAT17(-(lVar3 < 0),
                       CONCAT16(-((char)((ulong)lVar3 >> 0x30) < '\0'),
                                CONCAT15(-((char)((ulong)lVar3 >> 0x28) < '\0'),
                                         CONCAT14(-((char)((ulong)lVar3 >> 0x20) < '\0'),
                                                  CONCAT13(-((char)((ulong)lVar3 >> 0x18) < '\0'),
                                                           CONCAT12(-((char)((ulong)lVar3 >> 0x10) <
                                                                     '\0'),CONCAT11(-((char)((ulong)
                                                  lVar3 >> 8) < '\0'),-((char)lVar3 < '\0'))))))));
      lVar11 = lVar11 + 8;
      lVar3 = lVar15;
    } while (uVar9 == 0);
  }
LAB_00486e78:
  return plVar7[-1];
}

