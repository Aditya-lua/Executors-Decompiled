
void FUN_0046b040(ulong *param_1,long param_2)

{
  byte bVar1;
  long lVar2;
  bool bVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  uint uVar7;
  ulong uVar8;
  undefined1 uStack000000000000007f;
  
  uVar4 = *param_1;
  uVar8 = *(ulong *)(param_2 + 0x10);
  uVar7 = (uint)uVar8;
  if ((uVar7 >> 0x17 & 1) == 0) {
    uVar6 = uVar8;
  }
  else if ((uVar7 >> 0x1b & 1) == 0) {
    uVar6 = (ulong)(uVar7 | 0x9000000);
    *(undefined2 *)(param_2 + 0x14) = 0x12;
  }
  else {
    uVar6 = (ulong)(uVar7 | 0x1000000);
  }
  *(uint *)(param_2 + 0x10) = (uint)uVar6 | 0x800000;
  lVar2 = 0;
  do {
    lVar5 = lVar2;
    uVar7 = (uint)uVar4 & 0xf;
    bVar1 = (byte)uVar4 & 0xf | 0x30;
    if (9 < uVar7) {
      bVar1 = (char)uVar7 + 0x57;
    }
    (&uStack000000000000007f)[lVar5] = bVar1;
    bVar3 = 0xf < uVar4;
    uVar4 = uVar4 >> 4;
    lVar2 = lVar5 + -1;
  } while (bVar3);
  func_0x00468684(param_2,1,&UNK_00893f21,2,&uStack000000000000007f + lVar5,-(lVar5 + -1));
  *(ulong *)(param_2 + 0x10) = uVar8;
  return;
}

