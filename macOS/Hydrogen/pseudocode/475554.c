
void FUN_00475554(long param_1,undefined8 param_2,undefined8 param_3)

{
  uint in_w9;
  long in_x10;
  byte in_w11;
  undefined1 uStack000000000000007f;
  
  while( true ) {
    *(byte *)(in_x10 + param_1 + 0x7f) = in_w11 & 0xfe | (byte)in_w9 & 1;
    if (in_w9 < 2) break;
    in_w11 = 0x30;
    param_1 = param_1 + -1;
    in_w9 = in_w9 >> 1;
  }
  func_0x00468684(param_3,1,&UNK_00893f23,2,&uStack000000000000007f + param_1,-(param_1 + -1));
  return;
}

