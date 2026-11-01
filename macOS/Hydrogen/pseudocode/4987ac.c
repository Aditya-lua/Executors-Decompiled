
void FUN_004987ac(void)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  long *plVar7;
  long *plVar8;
  ulong uVar9;
  long *unaff_x24;
  long unaff_x25;
  long unaff_x26;
  ulong unaff_x27;
  long unaff_x29;
  undefined8 uVar10;
  long lVar11;
  undefined8 *in_stack_00000008;
  undefined8 uStack0000000000000020;
  long *in_stack_00000028;
  undefined8 uStack0000000000000038;
  undefined1 uStack0000000000000088;
  undefined1 uStack00000000000000f0;
  undefined1 uStack0000000000000110;
  
  func_0x005d731c(unaff_x29 + -0x80,1);
  *(undefined8 *)(unaff_x25 + 0x68) = 0;
  *(undefined8 *)(unaff_x25 + 0x70) = 1;
  *(undefined8 *)(unaff_x25 + 0x78) = 0;
  unaff_x24[2] = 0xe0000020;
  *unaff_x24 = (long)&uStack00000000000000f0;
  unaff_x24[1] = (long)&UNK_009e2088;
  iVar3 = func_0x005afc10(unaff_x29 + -0x80,&uStack0000000000000110);
  if (iVar3 != 0) {
    func_0x007a2810(&UNK_0089edb1,0x37,unaff_x29 + -0x61,&UNK_009e2100,&UNK_009e20b8);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x498b50);
    (*pcVar2)();
  }
  uVar10 = *(undefined8 *)(unaff_x25 + 0x68);
  in_stack_00000008[1] = *(undefined8 *)(unaff_x25 + 0x70);
  *in_stack_00000008 = uVar10;
  in_stack_00000008[2] = *(undefined8 *)(unaff_x25 + 0x78);
  lVar4 = *(long *)(unaff_x26 + 0x28) + 1;
  lVar6 = *(long *)(unaff_x26 + 0x20);
  while (lVar4 = lVar4 + -1, lVar4 != 0) {
    func_0x00488488(lVar6);
    lVar6 = lVar6 + 0x108;
  }
  if (*(long *)(unaff_x26 + 0x18) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x26 + 0x20),*(long *)(unaff_x26 + 0x18) * 0x108,8);
  }
  lVar4 = unaff_x24[0x1b];
  if (lVar4 != 0) {
    lVar6 = unaff_x24[0x1d];
    if (lVar6 != 0) {
      plVar7 = (long *)unaff_x24[0x1a];
      plVar8 = plVar7 + 1;
      lVar11 = *plVar7;
      uVar9 = CONCAT17(-(-1 < lVar11),
                       CONCAT16(-(-1 < (char)((ulong)lVar11 >> 0x30)),
                                CONCAT15(-(-1 < (char)((ulong)lVar11 >> 0x28)),
                                         CONCAT14(-(-1 < (char)((ulong)lVar11 >> 0x20)),
                                                  CONCAT13(-(-1 < (char)((ulong)lVar11 >> 0x18)),
                                                           CONCAT12(-(-1 < (char)((ulong)lVar11 >>
                                                                                 0x10)),
                                                                    CONCAT11(-(-1 < (char)((ulong)
                                                  lVar11 >> 8)),-(-1 < (char)lVar11)))))))) &
              0x8080808080808080;
      do {
        while (uVar9 == 0) {
          lVar11 = *plVar8;
          plVar7 = plVar7 + -0x20;
          plVar8 = plVar8 + 1;
          uVar9 = CONCAT17(-(-1 < lVar11),
                           CONCAT16(-(-1 < (char)((ulong)lVar11 >> 0x30)),
                                    CONCAT15(-(-1 < (char)((ulong)lVar11 >> 0x28)),
                                             CONCAT14(-(-1 < (char)((ulong)lVar11 >> 0x20)),
                                                      CONCAT13(-(-1 < (char)((ulong)lVar11 >> 0x18))
                                                               ,CONCAT12(-(-1 < (char)((ulong)lVar11
                                                                                      >> 0x10)),
                                                                         CONCAT11(-(-1 < (char)((
                                                  ulong)lVar11 >> 8)),-(-1 < (char)lVar11)))))))) &
                  0x8080808080808080;
        }
        uVar1 = (uVar9 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar9 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
        func_0x00490a30((long)plVar7 + (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U) * -4 + -0x20
                       );
        uVar9 = uVar9 - 1 & uVar9;
        lVar6 = lVar6 + -1;
      } while (lVar6 != 0);
    }
    lVar6 = lVar4 * 0x21 + 0x29;
    if (lVar6 != 0) {
      func_0x00187bd4(unaff_x24[0x1a] + lVar4 * -0x20 + -0x20,lVar6,8);
    }
  }
  if (*(long *)(unaff_x25 + 0x60) != 0) {
    puVar5 = *(undefined8 **)(unaff_x25 + 0x58);
    lVar4 = 1 - *(long *)(unaff_x25 + 0x60);
    do {
      lVar6 = *(long *)*puVar5;
      *(long *)*puVar5 = lVar6 + -1;
      LORelease();
      if (lVar6 == 1) {
        func_0x005d2b20(puVar5);
      }
      puVar5 = puVar5 + 2;
      lVar4 = lVar4 + 1;
    } while (lVar4 != 1);
  }
  if (*(long *)(unaff_x25 + 0x50) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x25 + 0x58),*(long *)(unaff_x25 + 0x50) << 4,8);
  }
  func_0x00493bd8(&uStack0000000000000088);
  if ((((unaff_x27 < 3) && (uStack0000000000000020 != 2)) &&
      (func_0x005ec378(&uStack0000000000000020,&uStack0000000000000038),
      lVar4 = uStack0000000000000020, uStack0000000000000020 != 2)) &&
     (func_0x005ec3ac(&uStack0000000000000020,uStack0000000000000038), lVar4 != 0)) {
    lVar4 = *in_stack_00000028;
    *in_stack_00000028 = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      DataMemoryBarrier(2,1);
      func_0x005e80f0((ulong)&uStack0000000000000020 | 8);
    }
  }
  return;
}

