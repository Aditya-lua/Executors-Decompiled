
void FUN_004739e8(long param_1,ulong param_2,undefined8 param_3)

{
  byte bVar1;
  long in_x9;
  uint in_w10;
  byte in_w11;
  undefined1 uStack000000000000007f;
  
  while( true ) {
    bVar1 = in_w11 & 0xf0 | (byte)param_2 & 0xf;
    if (9 < in_w10) {
      bVar1 = (char)in_w10 + 0x37;
    }
    *(byte *)(in_x9 + param_1 + 0x7f) = bVar1;
    if (param_2 < 0x10) break;
    in_w10 = (uint)(param_2 >> 4) & 0xf;
    in_w11 = 0x30;
    param_2 = param_2 >> 4;
    param_1 = param_1 + -1;
  }
  func_0x00468684(param_3,1,&UNK_00893f21,2,&uStack000000000000007f + param_1,-(param_1 + -1));
  return;
}

