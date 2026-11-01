
void FUN_00475814(long param_1,undefined8 param_2,undefined8 param_3)

{
  byte bVar1;
  ulong in_x9;
  long in_x10;
  uint in_w11;
  undefined1 uStack000000000000007f;
  
  while( true ) {
    bVar1 = (byte)in_x9 & 0xf | 0x30;
    if (9 < in_w11) {
      bVar1 = (char)in_w11 + 0x57;
    }
    *(byte *)(in_x10 + param_1 + 0x7f) = bVar1;
    if (in_x9 < 0x10) break;
    in_w11 = (uint)(in_x9 >> 4) & 0xf;
    param_1 = param_1 + -1;
    in_x9 = in_x9 >> 4;
  }
  func_0x00468684(param_3,1,&UNK_00893f21,2,&uStack000000000000007f + param_1,-(param_1 + -1));
  return;
}

