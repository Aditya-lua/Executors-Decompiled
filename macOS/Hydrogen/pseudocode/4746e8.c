
void FUN_004746e8(long param_1,uint param_2,undefined8 param_3)

{
  uint uVar1;
  uint uVar2;
  byte bVar3;
  long lVar4;
  long in_x9;
  undefined1 uStack000000000000007f;
  
  do {
    lVar4 = param_1;
    uVar1 = param_2 & 0xffff;
    uVar2 = param_2 & 0xf;
    bVar3 = (byte)param_2;
    param_2 = param_2 >> 4 & 0xfff;
    bVar3 = bVar3 & 0xf | 0x30;
    if (9 < uVar2) {
      bVar3 = (char)uVar2 + 0x57;
    }
    *(byte *)(in_x9 + lVar4 + 0x7f) = bVar3;
    param_1 = lVar4 + -1;
  } while (0xf < uVar1);
  func_0x00468684(param_3,1,&UNK_00893f21,2,&uStack000000000000007f + lVar4,-(lVar4 + -1));
  return;
}

