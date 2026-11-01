
long FUN_0043e270(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  ulong uVar1;
  ulong uVar2;
  int iVar3;
  long lVar4;
  char *pcVar5;
  ulong uVar6;
  long lVar7;
  short *psVar8;
  ushort uVar9;
  undefined4 uVar10;
  undefined6 uVar11;
  undefined8 uVar12;
  ushort uVar13;
  undefined4 uVar14;
  undefined6 uVar15;
  undefined8 uVar16;
  undefined1 auVar17 [16];
  long in_stack_00000050;
  undefined1 uStack0000000000000090;
  undefined1 uStack00000000000000c0;
  
  func_0x003f5a48(&uStack00000000000000c0);
  func_0x003f7530(&uStack0000000000000090);
  if (in_stack_00000050 != 0) {
    param_3 = 8;
    func_0x00187bd4();
  }
  __Unwind_Resume(param_1);
  auVar17 = func_0x007a2668();
  pcVar5 = auVar17._8_8_;
  lVar4 = auVar17._0_8_;
  if ((*(short **)(lVar4 + 0x68) != (short *)0x0) && (*(long *)(lVar4 + 0x70) != 0)) {
    lVar7 = *(long *)(lVar4 + 0x70) * 0x50;
    psVar8 = *(short **)(lVar4 + 0x68);
    do {
      uVar16 = *(undefined8 *)(psVar8 + 4);
      uVar12 = *(undefined8 *)psVar8;
      uVar9 = CONCAT11(-((char)((ulong)uVar12 >> 8) == '\0'),-((char)uVar12 == '\0'));
      uVar10 = CONCAT13(-((char)((ulong)uVar12 >> 0x18) == '\0'),
                        CONCAT12(-((char)((ulong)uVar12 >> 0x10) == '\0'),uVar9));
      uVar11 = CONCAT15(-((char)((ulong)uVar12 >> 0x28) == '\0'),
                        CONCAT14(-((char)((ulong)uVar12 >> 0x20) == '\0'),uVar10));
      uVar13 = CONCAT11(-((char)((ulong)uVar16 >> 8) == '\0'),-((char)uVar16 == '\0'));
      uVar14 = CONCAT13(-((char)((ulong)uVar16 >> 0x18) == '\0'),
                        CONCAT12(-((char)((ulong)uVar16 >> 0x10) == '\0'),uVar13));
      uVar15 = CONCAT15(-((char)((ulong)uVar16 >> 0x28) == '\0'),
                        CONCAT14(-((char)((ulong)uVar16 >> 0x20) == '\0'),uVar14));
      uVar6 = CONCAT17((char)(CONCAT17(-((char)((ulong)uVar16 >> 0x38) == '\0'),
                                       CONCAT16(-((char)((ulong)uVar16 >> 0x30) == '\0'),uVar15)) >>
                             0x34),
                       CONCAT16((char)((uint6)uVar15 >> 0x24),
                                CONCAT15((char)((uint)uVar14 >> 0x14),
                                         CONCAT14((char)(uVar13 >> 4),
                                                  CONCAT13((char)(CONCAT17(-((char)((ulong)uVar12 >>
                                                                                   0x38) == '\0'),
                                                                           CONCAT16(-((char)((ulong)
                                                  uVar12 >> 0x30) == '\0'),uVar11)) >> 0x34),
                                                  CONCAT12((char)((uint6)uVar11 >> 0x24),
                                                           CONCAT11((char)((uint)uVar10 >> 0x14),
                                                                    (char)(uVar9 >> 4)))))))) &
              0x8888888888888888;
      uVar2 = uVar6 >> 3;
      uVar2 = (uVar2 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar2 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar2 = (uVar2 & 0xff00ff00ff00ff00) >> 8 | (uVar2 & 0xff00ff00ff00ff) << 8;
      uVar1 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
      uVar2 = 0x10;
      if (uVar6 != 0) {
        uVar2 = (ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >> 2;
      }
      if (((uVar2 == param_3) && (iVar3 = _memcmp(psVar8,pcVar5,param_3), iVar3 == 0)) ||
         (((1 < uVar2 && (((*psVar8 == 0x5f5f && (*pcVar5 == '.')) && (uVar2 - 1 == param_3)))) &&
          (iVar3 = _memcmp(psVar8 + 1,pcVar5 + 1,uVar2 - 2), iVar3 == 0)))) {
        if ((*(byte *)(psVar8 + 0x20) < 0x13) &&
           ((1 << (ulong)(*(byte *)(psVar8 + 0x20) & 0x1f) & 0x41002U) != 0)) {
          return 1;
        }
        uVar6 = (ulong)*(uint *)(psVar8 + 0x18);
        lVar7 = 0;
        if (*(ulong *)(psVar8 + 0x14) <= *(ulong *)(lVar4 + 0x50) - uVar6 &&
            uVar6 <= *(ulong *)(lVar4 + 0x50)) {
          lVar7 = *(long *)(lVar4 + 0x48) + uVar6;
        }
        return lVar7;
      }
      lVar7 = lVar7 + -0x50;
      psVar8 = psVar8 + 0x28;
    } while (lVar7 != 0);
  }
  return 0;
}

