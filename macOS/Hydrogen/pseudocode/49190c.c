
void FUN_0049190c(undefined8 *param_1,undefined1 param_2 [16])

{
  undefined8 *puVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long in_x9;
  long in_x10;
  undefined8 in_x11;
  long in_x12;
  undefined8 *in_x13;
  
  param_1[4] = CONCAT17(-(-1 < param_2[7]),
                        CONCAT16(-(-1 < param_2[6]),
                                 CONCAT15(-(-1 < param_2[5]),
                                          CONCAT14(-(-1 < param_2[4]),
                                                   CONCAT13(-(-1 < param_2[3]),
                                                            CONCAT12(-(-1 < param_2[2]),
                                                                     CONCAT11(-(-1 < param_2[1]),
                                                                              -(-1 < param_2[0])))))
                                         ))) & 0x8080808080808080;
  param_1[5] = in_x9 + 8;
  param_1[6] = in_x9 + in_x10 + 1;
  param_1[7] = in_x11;
  puVar1 = param_1;
  puVar3 = param_1;
  if (in_x10 != 0) {
    puVar1 = (undefined8 *)(in_x9 - in_x12);
    puVar3 = in_x13;
  }
  uVar2 = 0;
  if (in_x10 != 0) {
    uVar2 = 8;
  }
  *param_1 = uVar2;
  param_1[1] = puVar3;
  param_1[2] = puVar1;
  param_1[3] = in_x9;
  return;
}

