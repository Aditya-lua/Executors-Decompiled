
undefined8 FUN_004a2c74(void)

{
  bool bVar1;
  byte bVar2;
  undefined8 uVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  long unaff_x19;
  uint uVar8;
  long *unaff_x20;
  byte abStack_3 [3];
  
  uVar4 = func_0x004b41f0(*unaff_x20 + 8);
  if (((uVar4 & 1) != 0) || (uVar4 = func_0x0046920c(), (uVar4 & 1) != 0)) {
    return 1;
  }
  lVar6 = *unaff_x20;
  uVar4 = *(ulong *)(unaff_x19 + 0x10);
  uVar8 = (uint)uVar4;
  if ((uVar8 >> 0x17 & 1) == 0) {
    uVar7 = uVar4;
  }
  else if ((uVar8 >> 0x1b & 1) == 0) {
    uVar7 = (ulong)(uVar8 | 0x9000000);
    *(undefined2 *)(unaff_x19 + 0x14) = 0x12;
  }
  else {
    uVar7 = (ulong)(uVar8 | 0x1000000);
  }
  lVar5 = 0;
  *(uint *)(unaff_x19 + 0x10) = (uint)uVar7 | 0x800000;
  uVar7 = lVar6 + 8;
  do {
    uVar8 = (uint)uVar7 & 0xf;
    bVar2 = (byte)uVar7 & 0xf | 0x30;
    if (9 < uVar8) {
      bVar2 = (char)uVar8 + 0x57;
    }
    abStack_3[lVar5 + 2] = bVar2;
    lVar5 = lVar5 + -1;
    bVar1 = 0xf < uVar7;
    uVar7 = uVar7 >> 4;
  } while (bVar1);
  uVar3 = func_0x00468684();
  *(ulong *)(unaff_x19 + 0x10) = uVar4;
  return uVar3;
}

