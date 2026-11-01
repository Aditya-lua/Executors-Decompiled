
void FUN_004b4bf4(void)

{
  char *pcVar1;
  long lVar2;
  ulong uVar3;
  code *pcVar4;
  long *plVar5;
  long lVar6;
  byte bVar7;
  ulong uVar8;
  ulong uVar9;
  long *plVar10;
  long lVar11;
  ulong uVar12;
  undefined8 *puVar13;
  undefined8 *puVar14;
  ulong unaff_x26;
  char cVar15;
  long in_xzr;
  byte bVar16;
  undefined8 uVar17;
  undefined1 auVar18 [16];
  undefined8 uStack0000000000000010;
  undefined1 uStack0000000000000028;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  long *plStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  
  if ((unaff_x26 & 1) != 0) {
    if (uStack0000000000000010 != 2) {
      func_0x005ec378(&uStack0000000000000010,&uStack0000000000000028);
    }
    func_0x004b39a8(&uStack0000000000000010);
  }
  __Unwind_Resume();
  auVar18 = func_0x007a2668();
  plVar5 = auVar18._8_8_;
  if (*plVar5 != 10) {
    return;
  }
  plVar10 = (long *)*auVar18._0_8_;
  if (plVar10[3] == 0) {
LAB_004b4e3c:
    func_0x007a23d8(&UNK_008a18d5,0x16,&UNK_009e5488);
code_r0x004b4e54:
    func_0x007a05dc();
code_r0x004b4e60:
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x4b4e64);
    (*pcVar4)();
  }
  lVar6 = 0;
  lVar11 = plVar5[4];
  pcVar1 = (char *)(lVar11 + 8);
  lVar2 = *plVar10;
  uVar3 = plVar10[1];
  bVar7 = (byte)((ulong)((long)pcVar1 * 0x517cc1b727220a95) >> 0x39);
  uVar8 = (long)pcVar1 * 0x517cc1b727220a95 & uVar3;
  uVar17 = *(undefined8 *)(lVar2 + uVar8);
  uVar12 = CONCAT17(-((byte)((ulong)uVar17 >> 0x38) == bVar7),
                    CONCAT16(-((byte)((ulong)uVar17 >> 0x30) == bVar7),
                             CONCAT15(-((byte)((ulong)uVar17 >> 0x28) == bVar7),
                                      CONCAT14(-((byte)((ulong)uVar17 >> 0x20) == bVar7),
                                               CONCAT13(-((byte)((ulong)uVar17 >> 0x18) == bVar7),
                                                        CONCAT12(-((byte)((ulong)uVar17 >> 0x10) ==
                                                                  bVar7),CONCAT11(-((byte)((ulong)
                                                  uVar17 >> 8) == bVar7),-((byte)uVar17 == bVar7))))
                                              )))) & 0x8080808080808080;
  while( true ) {
    while (uVar12 == 0) {
      bVar16 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar17 >> 0x38) == -1),
                                   CONCAT16(-((char)((ulong)uVar17 >> 0x30) == -1),
                                            CONCAT15(-((char)((ulong)uVar17 >> 0x28) == -1),
                                                     CONCAT14(-((char)((ulong)uVar17 >> 0x20) == -1)
                                                              ,CONCAT13(-((char)((ulong)uVar17 >>
                                                                                0x18) == -1),
                                                                        CONCAT12(-((char)((ulong)
                                                  uVar17 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar17 >> 8) == -1),
                                                           -((char)uVar17 == -1)))))))),1);
      if ((bVar16 & 1) != 0) goto LAB_004b4e3c;
      lVar6 = lVar6 + 8;
      uVar8 = uVar8 + lVar6 & uVar3;
      uVar17 = *(undefined8 *)(lVar2 + uVar8);
      uVar12 = CONCAT17(-((byte)((ulong)uVar17 >> 0x38) == bVar7),
                        CONCAT16(-((byte)((ulong)uVar17 >> 0x30) == bVar7),
                                 CONCAT15(-((byte)((ulong)uVar17 >> 0x28) == bVar7),
                                          CONCAT14(-((byte)((ulong)uVar17 >> 0x20) == bVar7),
                                                   CONCAT13(-((byte)((ulong)uVar17 >> 0x18) == bVar7
                                                             ),CONCAT12(-((byte)((ulong)uVar17 >>
                                                                                0x10) == bVar7),
                                                                        CONCAT11(-((byte)((ulong)
                                                  uVar17 >> 8) == bVar7),-((byte)uVar17 == bVar7))))
                                                  )))) & 0x8080808080808080;
    }
    uVar9 = (uVar12 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar12 >> 7 & 0xff00ff00ff00ff) << 8;
    uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
    uVar9 = uVar8 + ((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) & uVar3;
    if (lVar11 == *(long *)(lVar2 + -0x20 + uVar9 * -0x20)) break;
    uVar12 = uVar12 - 1 & uVar12;
  }
  lVar2 = lVar2 + uVar9 * -0x20;
  if (*pcVar1 == '\0') {
    *pcVar1 = '\x01';
  }
  else {
    func_0x007aff64(pcVar1,plVar5,1000000000);
  }
  func_0x00491fd4(&uStack_80,*(undefined8 *)(lVar2 + -8));
  cVar15 = (char)in_xzr;
  uStack_a8 = uStack_78;
  uStack_b0 = uStack_80;
  uStack_98 = uStack_68;
  uStack_a0 = uStack_70;
  uVar12 = plVar5[3];
  if (*(ulong *)(lVar2 + -8) <= (ulong)plVar5[3]) {
    uVar12 = *(ulong *)(lVar2 + -8);
  }
  if (uVar12 != 0) {
    puVar13 = *(undefined8 **)(lVar2 + -0x10);
    puVar14 = (undefined8 *)(plVar5[2] + 8);
    do {
      lVar6 = *(long *)*puVar13;
      *(long *)*puVar13 = lVar6 + 1;
      if (lVar6 < 0) goto code_r0x004b4e54;
      uStack_80 = *puVar13;
      lVar6 = *(long *)*puVar14;
      *(long *)*puVar14 = lVar6 + 1;
      if (lVar6 < 0) {
        func_0x007a05dc();
        goto code_r0x004b4e60;
      }
      plStack_88 = (long *)func_0x0049e294(&uStack_b0,uStack_80,*puVar14);
      if (plStack_88 != (long *)0x0) {
        lVar6 = *plStack_88;
        *plStack_88 = lVar6 + -1;
        LORelease();
        if (lVar6 == 1) {
          in_xzr = *plStack_88;
          func_0x005d2ac4(&plStack_88);
        }
      }
      cVar15 = (char)in_xzr;
      puVar14 = puVar14 + 2;
      puVar13 = puVar13 + 1;
      uVar12 = uVar12 - 1;
    } while (uVar12 != 0);
  }
  func_0x00499fc8(lVar11 + 0x28,plVar10);
  func_0x004b023c(lVar11 + 0x28,&uStack_b0);
  func_0x00491304(&uStack_b0);
  if (*pcVar1 == '\x01') {
    *pcVar1 = cVar15;
    return;
  }
  func_0x007b05dc(pcVar1,0);
  return;
}

