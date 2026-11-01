
undefined8 FUN_004aab58(long param_1,long *param_2)

{
  long in_x9;
  ulong uVar1;
  long *in_x11;
  long *plVar2;
  long lVar3;
  
  do {
    plVar2 = in_x11 + 1;
    lVar3 = *in_x11;
    in_x9 = in_x9 + -0x80;
    uVar1 = CONCAT17(-(-1 < lVar3),
                     CONCAT16(-(-1 < (char)((ulong)lVar3 >> 0x30)),
                              CONCAT15(-(-1 < (char)((ulong)lVar3 >> 0x28)),
                                       CONCAT14(-(-1 < (char)((ulong)lVar3 >> 0x20)),
                                                CONCAT13(-(-1 < (char)((ulong)lVar3 >> 0x18)),
                                                         CONCAT12(-(-1 < (char)((ulong)lVar3 >> 0x10
                                                                               )),
                                                                  CONCAT11(-(-1 < (char)((ulong)
                                                  lVar3 >> 8)),-(-1 < (char)lVar3)))))))) &
            0x8080808080808080;
    in_x11 = plVar2;
  } while (uVar1 == 0);
  param_2[2] = (long)plVar2;
  *param_2 = in_x9;
  param_2[1] = uVar1 - 1 & uVar1;
  param_2[4] = param_1 + -1;
  return 1;
}

