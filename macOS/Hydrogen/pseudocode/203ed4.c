
long FUN_00203ed4(long param_1,long param_2,long param_3,undefined8 param_4,undefined8 *param_5)

{
  long lVar1;
  long lVar2;
  byte bVar3;
  byte bVar4;
  ulong in_x9;
  ulong uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  
  uVar5 = CONCAT17(-(param_2 < 0),
                   CONCAT16(-((char)((ulong)param_2 >> 0x30) < '\0'),
                            CONCAT15(-((char)((ulong)param_2 >> 0x28) < '\0'),
                                     CONCAT14(-((char)((ulong)param_2 >> 0x20) < '\0'),
                                              CONCAT13(-((char)((ulong)param_2 >> 0x18) < '\0'),
                                                       CONCAT12(-((char)((ulong)param_2 >> 0x10) <
                                                                 '\0'),CONCAT11(-((char)((ulong)
                                                  param_2 >> 8) < '\0'),-((char)param_2 < '\0'))))))
                           ));
  uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
  uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
  uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
  uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
  uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
  uVar5 = (ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3;
  bVar3 = *(byte *)(param_1 + uVar5);
  bVar4 = (byte)((ulong)param_4 >> 0x38);
  *(byte *)(param_1 + uVar5) = bVar4 >> 1;
  *(byte *)(param_1 + (uVar5 - 8 & in_x9) + 8) = bVar4 >> 1;
  param_1 = param_1 + uVar5 * -0x30;
  lVar1 = *(long *)(param_3 + 0x10);
  lVar2 = *(long *)(param_3 + 0x18);
  uVar6 = *param_5;
  uVar8 = param_5[3];
  uVar7 = param_5[2];
  *(undefined8 *)(param_1 + -0x28) = param_5[1];
  *(undefined8 *)(param_1 + -0x30) = uVar6;
  *(undefined8 *)(param_1 + -0x18) = uVar8;
  *(undefined8 *)(param_1 + -0x20) = uVar7;
  uVar6 = param_5[4];
  *(undefined8 *)(param_1 + -8) = param_5[5];
  *(undefined8 *)(param_1 + -0x10) = uVar6;
  *(ulong *)(param_3 + 0x10) = lVar1 - ((ulong)bVar3 & 1);
  *(long *)(param_3 + 0x18) = lVar2 + 1;
  return param_1;
}

