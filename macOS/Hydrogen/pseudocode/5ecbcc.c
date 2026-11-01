
void FUN_005ecbcc(undefined8 param_1)

{
  bool bVar1;
  byte bVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  uint uVar8;
  ulong uVar9;
  undefined1 auVar10 [16];
  byte bStack_21;
  
  func_0x00187bd4(param_1,0x18,8);
  auVar10 = __Unwind_Resume();
  lVar5 = auVar10._8_8_;
  uVar4 = *auVar10._0_8_;
  uVar9 = *(ulong *)(lVar5 + 0x10);
  uVar8 = (uint)uVar9;
  if ((uVar8 >> 0x17 & 1) == 0) {
    uVar7 = uVar9;
  }
  else if ((uVar8 >> 0x1b & 1) == 0) {
    uVar7 = (ulong)(uVar8 | 0x9000000);
    *(undefined2 *)(lVar5 + 0x14) = 0x12;
  }
  else {
    uVar7 = (ulong)(uVar8 | 0x1000000);
  }
  *(uint *)(lVar5 + 0x10) = (uint)uVar7 | 0x800000;
  lVar3 = 0;
  do {
    lVar6 = lVar3;
    uVar8 = (uint)uVar4 & 0xf;
    bVar2 = (byte)uVar4 & 0xf | 0x30;
    if (9 < uVar8) {
      bVar2 = (char)uVar8 + 0x57;
    }
    (&bStack_21)[lVar6] = bVar2;
    bVar1 = 0xf < uVar4;
    uVar4 = uVar4 >> 4;
    lVar3 = lVar6 + -1;
  } while (bVar1);
  func_0x00468684(lVar5,1,&UNK_00893f21,2,&bStack_21 + lVar6,-(lVar6 + -1));
  *(ulong *)(lVar5 + 0x10) = uVar9;
  return;
}

