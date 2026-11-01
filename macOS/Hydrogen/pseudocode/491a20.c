
long FUN_00491a20(long param_1,long *param_2)

{
  ulong uVar1;
  ulong uVar2;
  long *plVar4;
  long *plVar3;
  long lVar5;
  
  plVar3 = (long *)param_2[2];
  do {
    plVar4 = plVar3 + 1;
    lVar5 = *plVar3;
    param_1 = param_1 + -0x80;
    uVar2 = CONCAT17(-(-1 < lVar5),
                     CONCAT16(-(-1 < (char)((ulong)lVar5 >> 0x30)),
                              CONCAT15(-(-1 < (char)((ulong)lVar5 >> 0x28)),
                                       CONCAT14(-(-1 < (char)((ulong)lVar5 >> 0x20)),
                                                CONCAT13(-(-1 < (char)((ulong)lVar5 >> 0x18)),
                                                         CONCAT12(-(-1 < (char)((ulong)lVar5 >> 0x10
                                                                               )),
                                                                  CONCAT11(-(-1 < (char)((ulong)
                                                  lVar5 >> 8)),-(-1 < (char)lVar5)))))))) &
            0x8080808080808080;
    plVar3 = plVar4;
  } while (uVar2 == 0);
  param_2[2] = (long)plVar4;
  *param_2 = param_1;
  uVar1 = (uVar2 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar2 >> 7 & 0xff00ff00ff00ff) << 8;
  uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
  param_2[1] = uVar2 - 1 & uVar2;
  return param_1 + (LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) & 0x78U) * -2;
}

