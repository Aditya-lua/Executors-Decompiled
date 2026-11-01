
void FUN_00475198(long param_1,undefined8 param_2,undefined8 param_3)

{
  uint in_w9;
  long in_x10;
  uint in_w11;
  undefined1 uStack000000000000007f;
  
  while( true ) {
    *(char *)(in_x10 + param_1 + 0x7f) = (char)in_w11;
    if (in_w9 < 2) break;
    in_w11 = in_w9 >> 1 & 1 | 0x30;
    param_1 = param_1 + -1;
    in_w9 = in_w9 >> 1;
  }
  func_0x00468684(param_3,1,&UNK_00893f23,2,&uStack000000000000007f + param_1,-(param_1 + -1));
  return;
}

