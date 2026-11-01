
void FUN_00474654(undefined8 param_1,undefined8 param_2)

{
  byte bVar1;
  uint uVar2;
  uint in_w8;
  long in_x9;
  long in_x10;
  uint in_w11;
  uint in_w12;
  byte in_w13;
  undefined1 uStack000000000000007f;
  
  while( true ) {
    bVar1 = (byte)in_w8;
    uVar2 = in_w8 >> 4;
    in_w8 = uVar2 & 0xfff;
    bVar1 = in_w13 & 0xf0 | bVar1 & 0xf;
    if (9 < in_w12) {
      bVar1 = (char)in_w12 + 0x37;
    }
    *(byte *)(in_x10 + in_x9 + 0x7f) = bVar1;
    if (in_w11 < 0x10) break;
    in_w12 = uVar2 & 0xf;
    in_w13 = 0x30;
    in_x9 = in_x9 + -1;
    in_w11 = in_w8;
  }
  func_0x00468684(param_2,1,&UNK_00893f21,2,&uStack000000000000007f + in_x9,-(in_x9 + -1));
  return;
}

