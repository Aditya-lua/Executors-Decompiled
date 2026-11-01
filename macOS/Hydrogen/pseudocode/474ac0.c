
void FUN_00474ac0(long param_1,ulong param_2,undefined8 param_3)

{
  bool bVar1;
  uint uVar2;
  byte bVar3;
  long lVar4;
  undefined1 uStack000000000000007f;
  
  do {
    lVar4 = param_1;
    uVar2 = (uint)param_2 & 0xf;
    bVar3 = (byte)param_2 & 0xf | 0x30;
    if (9 < uVar2) {
      bVar3 = (char)uVar2 + 0x37;
    }
    (&uStack000000000000007f)[lVar4] = bVar3;
    bVar1 = 0xf < param_2;
    param_2 = param_2 >> 4;
    param_1 = lVar4 + -1;
  } while (bVar1);
  func_0x00468684(param_3,1,&UNK_00893f21,2,&uStack000000000000007f + lVar4,-(lVar4 + -1));
  return;
}

