
long * FUN_00491d78(long *param_1,long param_2,undefined8 param_3,long param_4,undefined4 param_5)

{
  long lVar1;
  byte bVar2;
  ulong in_x9;
  ulong uVar3;
  ulong in_x10;
  ulong uVar4;
  long in_x11;
  ulong in_x12;
  long lVar5;
  
  while (in_x12 == 0) {
    in_x10 = in_x10 + in_x11 & in_x9;
    lVar5 = *(long *)((long)param_1 + in_x10);
    in_x11 = in_x11 + 8;
    in_x12 = CONCAT17(-(lVar5 < 0),
                      CONCAT16(-((char)((ulong)lVar5 >> 0x30) < '\0'),
                               CONCAT15(-((char)((ulong)lVar5 >> 0x28) < '\0'),
                                        CONCAT14(-((char)((ulong)lVar5 >> 0x20) < '\0'),
                                                 CONCAT13(-((char)((ulong)lVar5 >> 0x18) < '\0'),
                                                          CONCAT12(-((char)((ulong)lVar5 >> 0x10) <
                                                                    '\0'),CONCAT11(-((char)((ulong)
                                                  lVar5 >> 8) < '\0'),-((char)lVar5 < '\0'))))))));
  }
  uVar3 = (in_x12 & 0xaaaaaaaaaaaaaaaa) >> 1 | (in_x12 & 0x5555555555555555) << 1;
  uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
  uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
  uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
  uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
  uVar4 = in_x10 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3) & in_x9;
  uVar3 = (ulong)*(char *)((long)param_1 + uVar4);
  if (-1 < *(char *)((long)param_1 + uVar4)) {
    lVar5 = *param_1;
    uVar3 = CONCAT17(-(lVar5 < 0),
                     CONCAT16(-((char)((ulong)lVar5 >> 0x30) < '\0'),
                              CONCAT15(-((char)((ulong)lVar5 >> 0x28) < '\0'),
                                       CONCAT14(-((char)((ulong)lVar5 >> 0x20) < '\0'),
                                                CONCAT13(-((char)((ulong)lVar5 >> 0x18) < '\0'),
                                                         CONCAT12(-((char)((ulong)lVar5 >> 0x10) <
                                                                   '\0'),CONCAT11(-((char)((ulong)
                                                  lVar5 >> 8) < '\0'),-((char)lVar5 < '\0'))))))));
    uVar3 = (uVar3 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar3 & 0x5555555555555555) << 1;
    uVar3 = (uVar3 & 0xcccccccccccccccc) >> 2 | (uVar3 & 0x3333333333333333) << 2;
    uVar3 = (uVar3 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar3 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar3 = (uVar3 & 0xff00ff00ff00ff00) >> 8 | (uVar3 & 0xff00ff00ff00ff) << 8;
    uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
    uVar4 = (ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3;
    uVar3 = (ulong)*(byte *)((long)param_1 + uVar4);
  }
  bVar2 = (byte)((ulong)param_3 >> 0x38);
  *(byte *)((long)param_1 + uVar4) = bVar2 >> 1;
  *(byte *)((long)param_1 + (uVar4 - 8 & in_x9) + 8) = bVar2 >> 1;
  param_1 = param_1 + uVar4 * -2;
  lVar5 = *(long *)(param_2 + 0x10);
  lVar1 = *(long *)(param_2 + 0x18);
  param_1[-2] = param_4;
  *(undefined4 *)(param_1 + -1) = param_5;
  *(ulong *)(param_2 + 0x10) = lVar5 - (uVar3 & 1);
  *(long *)(param_2 + 0x18) = lVar1 + 1;
  return param_1;
}

