
void FUN_00479b60(byte *param_1,undefined8 param_2)

{
  bool bVar1;
  byte bVar2;
  long lVar3;
  long lVar4;
  uint uVar5;
  byte bStack_11;
  
  lVar3 = 0;
  uVar5 = (uint)*param_1;
  do {
    lVar4 = lVar3;
    bVar2 = (byte)uVar5 & 0xf | 0x30;
    if (9 < (uVar5 & 0xf)) {
      bVar2 = (char)(uVar5 & 0xf) + 0x37;
    }
    (&bStack_11)[lVar4] = bVar2;
    bVar1 = 0xf < uVar5;
    lVar3 = lVar4 + -1;
    uVar5 = uVar5 >> 4;
  } while (bVar1);
  func_0x00468684(param_2,1,&UNK_00893f21,2,&bStack_11 + lVar4,-(lVar4 + -1));
  return;
}

