
long * FUN_007a6fe4(int param_1,undefined8 param_2,undefined8 param_3)

{
  ulong uVar1;
  int iVar2;
  long *plVar3;
  long *extraout_x1;
  long *extraout_x8;
  byte bVar4;
  ulong uVar5;
  long lVar6;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  
  if (param_1 == 0) {
    return (long *)0x0;
  }
  _uStack0000000000000010 = &UNK_009df590;
  uStack0000000000000018 = 1;
  uStack0000000000000028 = 0;
  uStack0000000000000030 = 0;
  uStack0000000000000020 = 8;
  iVar2 = func_0x007a2420(&uStack0000000000000010,&UNK_009df5a0);
  if (iVar2 == 0) {
    return extraout_x1;
  }
  auVar7 = func_0x007a1f18(extraout_x1,param_3);
  plVar3 = auVar7._0_8_;
  uVar1 = plVar3[1];
  uVar5 = uVar1 & auVar7._8_8_;
  lVar6 = *(long *)(*plVar3 + uVar5);
  bVar4 = auVar7[0xf] >> 1;
  *extraout_x8 = *plVar3;
  extraout_x8[1] = uVar1;
  *(byte *)(extraout_x8 + 6) = auVar7[0xf] >> 1;
  extraout_x8[2] = uVar5;
  extraout_x8[3] = 0;
  extraout_x8[4] = lVar6;
  extraout_x8[5] =
       CONCAT17(-((byte)((ulong)lVar6 >> 0x38) == bVar4),
                CONCAT16(-((byte)((ulong)lVar6 >> 0x30) == bVar4),
                         CONCAT15(-((byte)((ulong)lVar6 >> 0x28) == bVar4),
                                  CONCAT14(-((byte)((ulong)lVar6 >> 0x20) == bVar4),
                                           CONCAT13(-((byte)((ulong)lVar6 >> 0x18) == bVar4),
                                                    CONCAT12(-((byte)((ulong)lVar6 >> 0x10) == bVar4
                                                              ),CONCAT11(-((byte)((ulong)lVar6 >> 8)
                                                                          == bVar4),
                                                                         -((byte)lVar6 == bVar4)))))
                                 ))) & 0x8080808080808080;
  return plVar3;
}

