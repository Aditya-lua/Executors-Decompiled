
void FUN_00474b8c(ulong param_1,undefined8 param_2)

{
  bool bVar1;
  uint uVar2;
  byte bVar3;
  long lVar4;
  long lVar5;
  undefined1 uStack000000000000007f;
  
  lVar4 = 0;
  do {
    lVar5 = lVar4;
    uVar2 = (uint)param_1 & 0xf;
    bVar3 = (byte)param_1 & 0xf | 0x30;
    if (9 < uVar2) {
      bVar3 = (char)uVar2 + 0x57;
    }
    (&uStack000000000000007f)[lVar5] = bVar3;
    bVar1 = 0xf < param_1;
    param_1 = param_1 >> 4;
    lVar4 = lVar5 + -1;
  } while (bVar1);
  func_0x00468684(param_2,1,&UNK_00893f21,2,&uStack000000000000007f + lVar5,-(lVar5 + -1));
  return;
}

