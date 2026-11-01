
void FUN_0017c128(undefined8 *param_1,long param_2)

{
  bool bVar1;
  byte bVar2;
  byte *pbVar3;
  long lVar4;
  long lVar5;
  uint uVar6;
  uint uVar7;
  ulong uVar8;
  undefined1 auStack_14 [2];
  undefined2 uStack_12;
  
  pbVar3 = (byte *)*param_1;
  if ((*(uint *)(param_2 + 0x10) >> 0x19 & 1) != 0) {
    lVar5 = 0;
    uVar6 = (uint)*pbVar3;
    do {
      lVar4 = lVar5;
      bVar2 = (byte)uVar6 & 0xf | 0x30;
      if (9 < (uVar6 & 0xf)) {
        bVar2 = (char)(uVar6 & 0xf) + 0x57;
      }
      auStack_14[lVar4 + 3] = bVar2;
      bVar1 = 0xf < uVar6;
      lVar5 = lVar4 + -1;
      uVar6 = uVar6 >> 4;
    } while (bVar1);
    func_0x00468684(param_2,1,&UNK_00893f21,2,auStack_14 + lVar4 + 3,-(lVar4 + -1));
    return;
  }
  if ((*(uint *)(param_2 + 0x10) >> 0x1a & 1) != 0) {
    lVar5 = 0;
    uVar6 = (uint)*pbVar3;
    do {
      lVar4 = lVar5;
      bVar2 = (byte)uVar6 & 0xf | 0x30;
      if (9 < (uVar6 & 0xf)) {
        bVar2 = (char)(uVar6 & 0xf) + 0x37;
      }
      auStack_14[lVar4 + 3] = bVar2;
      bVar1 = 0xf < uVar6;
      lVar5 = lVar4 + -1;
      uVar6 = uVar6 >> 4;
    } while (bVar1);
    func_0x00468684(param_2,1,&UNK_00893f21,2,auStack_14 + lVar4 + 3,-(lVar4 + -1));
    return;
  }
  bVar2 = *pbVar3;
  uVar8 = (ulong)bVar2;
  if (bVar2 < 10) {
    lVar5 = 3;
  }
  else {
    uVar7 = (uint)bVar2;
    uVar6 = uVar7 * 0x29 >> 0xc;
    uVar8 = (ulong)uVar6;
    uStack_12 = *(undefined2 *)(&UNK_00893f27 + ((ulong)(uVar7 + uVar6 * -100) & 0xff) * 2);
    lVar4 = 1;
    lVar5 = lVar4;
    if (uVar7 != 0 && uVar6 == 0) goto code_r0x004762bc;
  }
  lVar4 = lVar5 + -1;
  auStack_14[lVar5] = (&UNK_00893f28)[(uVar8 & 0x7f) * 2];
code_r0x004762bc:
  func_0x00468684(param_2,1,1,0,auStack_14 + lVar4 + 1,3 - lVar4);
  return;
}

