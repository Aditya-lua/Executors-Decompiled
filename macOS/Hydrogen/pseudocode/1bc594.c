
void FUN_001bc594(undefined8 param_1,undefined8 param_2)

{
  undefined8 uVar1;
  ulong uVar2;
  undefined1 uVar3;
  long in_x9;
  long in_x10;
  long *unaff_x19;
  long unaff_x20;
  long lVar4;
  ulong unaff_x21;
  long unaff_x22;
  long lVar5;
  undefined8 uStack_20;
  undefined8 uStack_18;
  undefined8 uStack_10;
  undefined8 uStack_8;
  
  unaff_x19[2] = unaff_x22;
  if ((ulong)(in_x9 - unaff_x22) < unaff_x21) {
    func_0x0079b61c();
    in_x10 = unaff_x19[1];
    unaff_x22 = unaff_x19[2];
  }
  _memcpy(in_x10 + unaff_x22,param_2);
  unaff_x19[2] = unaff_x22 + unaff_x21;
  func_0x001a6f40(unaff_x20 + 0x18);
  uVar3 = *(undefined1 *)(unaff_x20 + 0x68);
  lVar5 = unaff_x19[2];
  if (lVar5 == *unaff_x19) {
    func_0x00458a18();
  }
  *(undefined1 *)(unaff_x19[1] + lVar5) = uVar3;
  lVar4 = lVar5 + 1;
  unaff_x19[2] = lVar4;
  uVar1 = *(undefined8 *)(unaff_x20 + 0x58);
  uVar2 = *(ulong *)(unaff_x20 + 0x60);
  if (lVar4 == *unaff_x19) {
    func_0x00458a18();
  }
  *(char *)(unaff_x19[1] + lVar4) = (char)uVar2;
  lVar5 = lVar5 + 2;
  unaff_x19[2] = lVar5;
  if ((ulong)(*unaff_x19 - lVar5) < uVar2) {
    func_0x0079b61c();
    lVar5 = unaff_x19[2];
  }
  _memcpy(unaff_x19[1] + lVar5,uVar1,uVar2);
  unaff_x19[2] = lVar5 + uVar2;
  lVar5 = unaff_x19[2];
  if ((ulong)(*unaff_x19 - lVar5) < 2) {
    func_0x0079b61c();
    lVar5 = unaff_x19[2];
  }
  *(undefined2 *)(unaff_x19[1] + lVar5) = 0xffff;
  unaff_x19[2] = lVar5 + 2;
  uStack_18 = 0x1616161616161616;
  uStack_20 = 0x1616161616161616;
  uStack_8 = 0x1616161616161616;
  uStack_10 = 0x1616161616161616;
  if (*(long *)(unaff_x20 + 0x48) != 0) {
    lVar5 = *(long *)(unaff_x20 + 0x40);
    lVar4 = *(long *)(unaff_x20 + 0x48) << 5;
    do {
      func_0x001bcf34(lVar5);
      lVar5 = lVar5 + 0x20;
      lVar4 = lVar4 + -0x20;
    } while (lVar4 != 0);
  }
  func_0x0024031c(&uStack_20);
  return;
}

