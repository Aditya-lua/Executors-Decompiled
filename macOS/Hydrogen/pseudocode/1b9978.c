
void FUN_001b9978(void)

{
  long lVar1;
  uint uVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long *unaff_x19;
  long unaff_x20;
  uint unaff_w21;
  ulong uVar7;
  undefined8 uStack_20;
  undefined8 uStack_18;
  undefined8 uStack_10;
  undefined8 uStack_8;
  
  lVar4 = unaff_x19[2];
  lVar5 = *unaff_x19;
  uVar2 = (unaff_w21 & 0xff00ff00) >> 8 | (unaff_w21 & 0xff00ff) << 8;
  lVar6 = unaff_x19[1];
  *(uint *)(lVar6 + lVar4) = uVar2 >> 0x10 | uVar2 << 0x10;
  lVar4 = lVar4 + 4;
  unaff_x19[2] = lVar4;
  uVar2 = *(uint *)(unaff_x20 + 0x3c);
  if ((ulong)(lVar5 - lVar4) < 4) {
    func_0x0079b61c();
    lVar6 = unaff_x19[1];
    lVar4 = unaff_x19[2];
    lVar5 = *unaff_x19;
  }
  uVar2 = (uVar2 & 0xff00ff00) >> 8 | (uVar2 & 0xff00ff) << 8;
  *(uint *)(lVar6 + lVar4) = uVar2 >> 0x10 | uVar2 << 0x10;
  lVar1 = lVar4 + 4;
  unaff_x19[2] = lVar1;
  uVar7 = *(ulong *)(unaff_x20 + 0x10);
  if (lVar1 == lVar5) {
    func_0x00458a18();
    lVar6 = unaff_x19[1];
  }
  *(char *)(lVar6 + lVar1) = (char)uVar7;
  lVar4 = lVar4 + 5;
  unaff_x19[2] = lVar4;
  uVar3 = *(undefined8 *)(unaff_x20 + 8);
  if ((ulong)(*unaff_x19 - lVar4) < uVar7) {
    func_0x0079b61c();
    lVar4 = unaff_x19[2];
  }
  _memcpy(unaff_x19[1] + lVar4,uVar3,uVar7);
  lVar6 = *unaff_x19;
  lVar4 = lVar4 + uVar7;
  unaff_x19[2] = lVar4;
  uVar3 = *(undefined8 *)(*(long *)(unaff_x20 + 0x30) + 0x18);
  uVar7 = *(ulong *)(*(long *)(unaff_x20 + 0x30) + 0x20);
  if ((ulong)(lVar6 - lVar4) < 2) {
    func_0x0079b61c();
    lVar4 = unaff_x19[2];
    lVar6 = *unaff_x19;
  }
  lVar5 = unaff_x19[1];
  *(ushort *)(lVar5 + lVar4) = (ushort)(uVar7 >> 8) & 0xff | (ushort)(((uint)uVar7 & 0xff00ff) << 8)
  ;
  lVar4 = lVar4 + 2;
  unaff_x19[2] = lVar4;
  if ((ulong)(lVar6 - lVar4) < uVar7) {
    func_0x0079b61c();
    lVar5 = unaff_x19[1];
    lVar4 = unaff_x19[2];
  }
  _memcpy(lVar5 + lVar4,uVar3,uVar7);
  unaff_x19[2] = lVar4 + uVar7;
  lVar4 = unaff_x19[2];
  if ((ulong)(*unaff_x19 - lVar4) < 2) {
    func_0x0079b61c();
    lVar4 = unaff_x19[2];
  }
  *(undefined2 *)(unaff_x19[1] + lVar4) = 0xffff;
  unaff_x19[2] = lVar4 + 2;
  uStack_18 = 0x1616161616161616;
  uStack_20 = 0x1616161616161616;
  uStack_8 = 0x1616161616161616;
  uStack_10 = 0x1616161616161616;
  if (*(long *)(unaff_x20 + 0x28) != 0) {
    lVar4 = *(long *)(unaff_x20 + 0x20);
    lVar6 = *(long *)(unaff_x20 + 0x28) << 5;
    do {
      func_0x001b9160(lVar4);
      lVar4 = lVar4 + 0x20;
      lVar6 = lVar6 + -0x20;
    } while (lVar6 != 0);
  }
  func_0x0024031c(&uStack_20);
  return;
}

