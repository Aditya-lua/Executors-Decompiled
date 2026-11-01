
long FUN_00561124(long param_1,long *param_2)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  long *plVar5;
  long *plVar4;
  long lVar6;
  
  if (param_1 == 0) {
    return 0;
  }
  lVar2 = *param_2;
  uVar3 = param_2[1];
  if (uVar3 == 0) {
    plVar4 = (long *)param_2[2];
    do {
      plVar5 = plVar4 + 1;
      lVar6 = *plVar4;
      lVar2 = lVar2 + -0x40;
      uVar3 = CONCAT17(-(-1 < lVar6),
                       CONCAT16(-(-1 < (char)((ulong)lVar6 >> 0x30)),
                                CONCAT15(-(-1 < (char)((ulong)lVar6 >> 0x28)),
                                         CONCAT14(-(-1 < (char)((ulong)lVar6 >> 0x20)),
                                                  CONCAT13(-(-1 < (char)((ulong)lVar6 >> 0x18)),
                                                           CONCAT12(-(-1 < (char)((ulong)lVar6 >>
                                                                                 0x10)),
                                                                    CONCAT11(-(-1 < (char)((ulong)
                                                  lVar6 >> 8)),-(-1 < (char)lVar6)))))))) &
              0x8080808080808080;
      plVar4 = plVar5;
    } while (uVar3 == 0);
    param_2[2] = (long)plVar5;
    *param_2 = lVar2;
  }
  uVar1 = (uVar3 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar3 & 0x5555555555555555) << 1;
  uVar1 = (uVar1 & 0xcccccccccccccccc) >> 2 | (uVar1 & 0x3333333333333333) << 2;
  uVar1 = (uVar1 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f0f0f0f0f) << 4;
  uVar1 = (uVar1 & 0xff00ff00ff00ff00) >> 8 | (uVar1 & 0xff00ff00ff00ff) << 8;
  uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
  param_2[1] = uVar3 - 1 & uVar3;
  param_2[4] = param_1 + -1;
  return (lVar2 - (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U)) + -8;
}

