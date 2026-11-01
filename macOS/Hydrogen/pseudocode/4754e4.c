
void FUN_004754e4(long param_1,undefined8 param_2,undefined8 param_3)

{
  char cVar1;
  long in_x9;
  uint in_w10;
  uint in_w11;
  uint in_w12;
  uint in_w13;
  undefined1 uStack000000000000007f;
  
  while( true ) {
    cVar1 = (char)in_w13;
    if (9 < in_w12) {
      cVar1 = (char)in_w12 + '7';
    }
    *(char *)(in_x9 + param_1 + 0x7f) = cVar1;
    if (in_w11 < 0x10) break;
    in_w11 = in_w10 & 0xffff;
    in_w12 = in_w10 & 0xf;
    in_w13 = in_w10 & 0xf | 0x30;
    in_w10 = in_w10 >> 4 & 0xfff;
    param_1 = param_1 + -1;
  }
  func_0x00468684(param_3,1,&UNK_00893f21,2,&uStack000000000000007f + param_1,-(param_1 + -1));
  return;
}

