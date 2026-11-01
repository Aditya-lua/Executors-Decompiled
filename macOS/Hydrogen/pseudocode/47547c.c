
void FUN_0047547c(long param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  byte bVar2;
  long in_x9;
  uint in_w10;
  uint in_w11;
  undefined1 uStack0000000000000080;
  
  while (0xf < in_w11) {
    in_w11 = in_w10 & 0xffff;
    uVar1 = in_w10 & 0xf;
    bVar2 = (byte)in_w10;
    in_w10 = in_w10 >> 4 & 0xfff;
    bVar2 = bVar2 & 0xf | 0x30;
    if (9 < uVar1) {
      bVar2 = (char)uVar1 + 0x57;
    }
    *(byte *)(in_x9 + param_1 + 0x7f) = bVar2;
    param_1 = param_1 + -1;
  }
  func_0x00468684(param_3,1,&UNK_00893f21,2,&uStack0000000000000080 + param_1,-param_1);
  return;
}

