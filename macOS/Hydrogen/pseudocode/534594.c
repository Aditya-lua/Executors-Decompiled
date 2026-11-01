
long * FUN_00534594(undefined8 param_1,undefined8 param_2,long *param_3)

{
  ulong uVar1;
  long *plVar2;
  long *plVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  undefined1 auVar9 [16];
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  
  if (in_stack_00000000 != 0) {
    param_3 = (long *)((long)&MACH_HEADER.magic + 1);
    func_0x00187bd4(in_stack_00000008);
  }
  auVar9 = __Unwind_Resume();
  plVar2 = auVar9._0_8_;
  plVar3 = (long *)*plVar2;
  uVar1 = plVar2[1];
  uVar4 = uVar1 & auVar9._8_8_;
  lVar6 = *(long *)((long)plVar3 + uVar4);
  uVar5 = CONCAT17(-(lVar6 < 0),
                   CONCAT16(-((char)((ulong)lVar6 >> 0x30) < '\0'),
                            CONCAT15(-((char)((ulong)lVar6 >> 0x28) < '\0'),
                                     CONCAT14(-((char)((ulong)lVar6 >> 0x20) < '\0'),
                                              CONCAT13(-((char)((ulong)lVar6 >> 0x18) < '\0'),
                                                       CONCAT12(-((char)((ulong)lVar6 >> 0x10) <
                                                                 '\0'),CONCAT11(-((char)((ulong)
                                                  lVar6 >> 8) < '\0'),-((char)lVar6 < '\0'))))))));
  if (uVar5 == 0) {
    lVar6 = 8;
    do {
      uVar4 = uVar4 + lVar6 & uVar1;
      lVar8 = *(long *)((long)plVar3 + uVar4);
      uVar5 = CONCAT17(-(lVar8 < 0),
                       CONCAT16(-((char)((ulong)lVar8 >> 0x30) < '\0'),
                                CONCAT15(-((char)((ulong)lVar8 >> 0x28) < '\0'),
                                         CONCAT14(-((char)((ulong)lVar8 >> 0x20) < '\0'),
                                                  CONCAT13(-((char)((ulong)lVar8 >> 0x18) < '\0'),
                                                           CONCAT12(-((char)((ulong)lVar8 >> 0x10) <
                                                                     '\0'),CONCAT11(-((char)((ulong)
                                                  lVar8 >> 8) < '\0'),-((char)lVar8 < '\0'))))))));
      lVar6 = lVar6 + 8;
    } while (uVar5 == 0);
  }
  uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
  uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
  uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
  uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
  uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
  uVar4 = uVar4 + ((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3) & uVar1;
  uVar5 = (ulong)*(char *)((long)plVar3 + uVar4);
  if (-1 < *(char *)((long)plVar3 + uVar4)) {
    lVar6 = *plVar3;
    uVar4 = CONCAT17(-(lVar6 < 0),
                     CONCAT16(-((char)((ulong)lVar6 >> 0x30) < '\0'),
                              CONCAT15(-((char)((ulong)lVar6 >> 0x28) < '\0'),
                                       CONCAT14(-((char)((ulong)lVar6 >> 0x20) < '\0'),
                                                CONCAT13(-((char)((ulong)lVar6 >> 0x18) < '\0'),
                                                         CONCAT12(-((char)((ulong)lVar6 >> 0x10) <
                                                                   '\0'),CONCAT11(-((char)((ulong)
                                                  lVar6 >> 8) < '\0'),-((char)lVar6 < '\0'))))))));
    uVar4 = (uVar4 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar4 & 0x5555555555555555) << 1;
    uVar4 = (uVar4 & 0xcccccccccccccccc) >> 2 | (uVar4 & 0x3333333333333333) << 2;
    uVar4 = (uVar4 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar4 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar4 = (uVar4 & 0xff00ff00ff00ff00) >> 8 | (uVar4 & 0xff00ff00ff00ff) << 8;
    uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
    uVar4 = (ulong)LZCOUNT(uVar4 >> 0x20 | uVar4 << 0x20) >> 3;
    uVar5 = (ulong)*(byte *)((long)plVar3 + uVar4);
  }
  *(byte *)((long)plVar3 + uVar4) = auVar9[0xf] >> 1;
  *(byte *)((long)plVar3 + (uVar4 - 8 & uVar1) + 8) = auVar9[0xf] >> 1;
  plVar3 = plVar3 + uVar4 * -2;
  lVar6 = plVar2[2];
  lVar8 = plVar2[3];
  lVar7 = *param_3;
  plVar3[-1] = param_3[1];
  plVar3[-2] = lVar7;
  plVar2[2] = lVar6 - (uVar5 & 1);
  plVar2[3] = lVar8 + 1;
  return plVar3;
}

