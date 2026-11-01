
void FUN_0012d724(long param_1,float param_2,float param_3)

{
  byte *in_x9;
  long in_x10;
  byte *in_x11;
  long in_x12;
  uint in_w13;
  
  while( true ) {
    if ((in_w13 != 0) && ((*in_x11 >> 3 & 1) != 0)) {
      param_2 = param_2 + *(float *)(in_x11 + 0x18);
      param_3 = param_3 + *(float *)(in_x11 + 0x10);
    }
    in_x12 = in_x12 + -1;
    if (in_x12 == 0) break;
    in_w13 = (uint)in_x11[0xd2];
    in_x11 = in_x11 + 0x70;
  }
  do {
    if ((in_x9[0x62] != 0) && ((*in_x9 >> 3 & 1) != 0)) {
      *(float *)(in_x9 + 0x18) = param_2 * (*(float *)(in_x9 + 0x10) / param_3);
    }
    in_x9 = in_x9 + 0x70;
    in_x10 = in_x10 + -1;
  } while (in_x10 != 0);
  *(undefined1 *)(param_1 + 0x23e) = 1;
  return;
}

