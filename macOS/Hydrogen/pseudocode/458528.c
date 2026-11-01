
void FUN_00458528(undefined8 *param_1,undefined1 param_2 [16])

{
  char in_w9;
  undefined8 in_x10;
  undefined8 in_x11;
  undefined8 in_x12;
  
  *param_1 = in_x11;
  param_1[1] = in_x10;
  *(char *)(param_1 + 6) = in_w9;
  param_1[2] = in_x12;
  param_1[3] = 0;
  param_1[4] = param_2._0_8_;
  param_1[5] = CONCAT17(-(param_2[7] == in_w9),
                        CONCAT16(-(param_2[6] == in_w9),
                                 CONCAT15(-(param_2[5] == in_w9),
                                          CONCAT14(-(param_2[4] == in_w9),
                                                   CONCAT13(-(param_2[3] == in_w9),
                                                            CONCAT12(-(param_2[2] == in_w9),
                                                                     CONCAT11(-(param_2[1] == in_w9)
                                                                              ,-(param_2[0] == in_w9
                                                                                )))))))) &
               0x8080808080808080;
  return;
}

