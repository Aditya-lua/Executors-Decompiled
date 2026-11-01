
void FUN_00473810(ulong param_1,undefined8 param_2,undefined8 param_3)

{
  byte bVar1;
  long in_x9;
  long in_x10;
  uint in_w11;
  byte in_w12;
  undefined1 uStack000000000000007f;
  
  while( true ) {
    bVar1 = in_w12 & 0xf0 | (byte)param_1 & 0xf;
    if (9 < in_w11) {
      bVar1 = (char)in_w11 + 0x37;
    }
    *(byte *)(in_x10 + in_x9 + 0x7f) = bVar1;
    if (param_1 < 0x10) break;
    in_w11 = (uint)(param_1 >> 4) & 0xf;
    in_w12 = 0x30;
    param_1 = param_1 >> 4;
    in_x9 = in_x9 + -1;
  }
  func_0x00468684(param_3,1,&UNK_00893f21,2,&uStack000000000000007f + in_x9,-(in_x9 + -1));
  return;
}

