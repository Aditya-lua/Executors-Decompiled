
void FUN_0047460c(undefined8 param_1,undefined8 param_2)

{
  bool bVar1;
  uint uVar2;
  byte bVar3;
  uint in_w8;
  long in_x9;
  long lVar4;
  long in_x10;
  uint in_w11;
  undefined1 uStack000000000000007f;
  
  do {
    lVar4 = in_x9;
    uVar2 = in_w8 & 0xf;
    bVar3 = (byte)in_w8;
    in_w8 = in_w8 >> 4 & 0xfff;
    bVar3 = bVar3 & 0xf | 0x30;
    if (9 < uVar2) {
      bVar3 = (char)uVar2 + 0x57;
    }
    *(byte *)(in_x10 + lVar4 + 0x7f) = bVar3;
    bVar1 = 0xf < in_w11;
    in_x9 = lVar4 + -1;
    in_w11 = in_w8;
  } while (bVar1);
  func_0x00468684(param_2,1,&UNK_00893f21,2,&uStack000000000000007f + lVar4,-(lVar4 + -1));
  return;
}

