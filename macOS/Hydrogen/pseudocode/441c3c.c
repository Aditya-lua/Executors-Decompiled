
void FUN_00441c3c(undefined8 *param_1,long param_2)

{
  undefined *in_x9;
  ulong in_x10;
  undefined2 in_w11;
  undefined8 in_x12;
  ulong in_x13;
  long in_x14;
  long in_x15;
  char *in_x16;
  long in_x17;
  
  do {
    if (*in_x16 == '\0') {
      in_x13 = (long)in_x16 - (long)in_x9;
      if (in_x13 < in_x10) {
        in_x12 = 0;
        *(undefined2 *)(param_1 + 1) = in_w11;
        in_x14 = 0x18;
        in_x15 = 0x10;
      }
      else {
        in_x12 = 1;
        in_x13 = 0x1c;
        in_x14 = 0x10;
        in_x15 = 8;
        in_x9 = &UNK_00888a10;
      }
      goto LAB_00441dbc;
    }
    in_x16 = in_x16 + 1;
    param_2 = param_2 + -1;
  } while (param_2 != 0);
  in_x9 = (undefined *)(in_x17 + 0xa10);
LAB_00441dbc:
  *(undefined **)((long)param_1 + in_x15) = in_x9;
  *(ulong *)((long)param_1 + in_x14) = in_x13;
  *param_1 = in_x12;
  return;
}

