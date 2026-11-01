
void FUN_001b5954(long param_1,long param_2)

{
  uint uVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long *unaff_x19;
  long unaff_x20;
  ulong uVar6;
  undefined8 uStack_20;
  undefined8 uStack_18;
  undefined8 uStack_10;
  undefined8 uStack_8;
  
  uVar6 = *(ulong *)(param_1 + 0x28);
  lVar2 = *(long *)(param_2 + 0x10);
  lVar4 = *unaff_x19;
  if ((ulong)(lVar4 - lVar2) < 3) {
    func_0x0079b61c();
    lVar2 = unaff_x19[2];
    lVar4 = *unaff_x19;
  }
  uVar1 = (uint)uVar6 & 0xff00ff;
  lVar5 = unaff_x19[1];
  *(char *)((ushort *)(lVar5 + lVar2) + 1) = (char)uVar1;
  *(ushort *)(lVar5 + lVar2) =
       (ushort)(byte)(uVar1 >> 0x10) | (ushort)(((((uint)uVar6 & 0xff00ff00) >> 8) << 0x10) >> 8);
  lVar2 = lVar2 + 3;
  unaff_x19[2] = lVar2;
  uVar3 = *(undefined8 *)(unaff_x20 + 0x20);
  if ((ulong)(lVar4 - lVar2) < uVar6) {
    func_0x0079b61c();
    lVar5 = unaff_x19[1];
    lVar2 = unaff_x19[2];
  }
  _memcpy(lVar5 + lVar2,uVar3,uVar6);
  unaff_x19[2] = lVar2 + uVar6;
  lVar2 = unaff_x19[2];
  if ((ulong)(*unaff_x19 - lVar2) < 2) {
    func_0x0079b61c();
    lVar2 = unaff_x19[2];
  }
  *(undefined2 *)(unaff_x19[1] + lVar2) = 0xffff;
  unaff_x19[2] = lVar2 + 2;
  uStack_18 = 0x1616161616161616;
  uStack_20 = 0x1616161616161616;
  uStack_8 = 0x1616161616161616;
  uStack_10 = 0x1616161616161616;
  if (*(long *)(unaff_x20 + 0x10) != 0) {
    lVar2 = *(long *)(unaff_x20 + 8);
    lVar4 = *(long *)(unaff_x20 + 0x10) << 5;
    do {
      func_0x001b5440(lVar2);
      lVar2 = lVar2 + 0x20;
      lVar4 = lVar4 + -0x20;
    } while (lVar4 != 0);
  }
  func_0x0024031c(&uStack_20);
  return;
}

