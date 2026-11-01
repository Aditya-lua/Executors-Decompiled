
void FUN_00225088(void)

{
  uint uVar1;
  undefined1 uVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  ulong uVar7;
  long unaff_x22;
  long unaff_x23;
  
  func_0x00458a18();
  *(char *)(unaff_x19[1] + unaff_x23) = (char)unaff_x21;
  lVar4 = unaff_x22 + 3;
  unaff_x19[2] = lVar4;
  uVar3 = *(undefined8 *)(unaff_x20 + 8);
  if ((ulong)(*unaff_x19 - lVar4) < unaff_x21) {
    func_0x0079b61c();
    lVar4 = unaff_x19[2];
  }
  _memcpy(unaff_x19[1] + lVar4,uVar3);
  lVar4 = lVar4 + unaff_x21;
  unaff_x19[2] = lVar4;
  uVar2 = *(undefined1 *)(unaff_x20 + 0x8c);
  if (lVar4 == *unaff_x19) {
    func_0x00458a18();
  }
  *(undefined1 *)(unaff_x19[1] + lVar4) = uVar2;
  lVar5 = lVar4 + 1;
  unaff_x19[2] = lVar5;
  if (*(long *)(unaff_x20 + 0x30) == -0x8000000000000000) {
    if (lVar5 == *unaff_x19) {
      func_0x00458a18();
    }
    *(undefined1 *)(unaff_x19[1] + lVar5) = 0;
    lVar4 = lVar4 + 2;
    unaff_x19[2] = lVar4;
    lVar6 = *(long *)(unaff_x20 + 0x48);
    lVar5 = *unaff_x19;
  }
  else {
    if (lVar5 == *unaff_x19) {
      func_0x00458a18();
    }
    *(undefined1 *)(unaff_x19[1] + lVar5) = 1;
    unaff_x19[2] = lVar4 + 2;
    func_0x001a5e70((long *)(unaff_x20 + 0x30));
    lVar6 = *(long *)(unaff_x20 + 0x48);
    lVar4 = unaff_x19[2];
    lVar5 = *unaff_x19;
  }
  if (lVar6 == -0x8000000000000000) {
    if (lVar4 == lVar5) {
      func_0x00458a18();
    }
    *(undefined1 *)(unaff_x19[1] + lVar4) = 0;
    lVar4 = lVar4 + 1;
  }
  else {
    if (lVar4 == lVar5) {
      func_0x00458a18();
    }
    *(undefined1 *)(unaff_x19[1] + lVar4) = 1;
    lVar5 = lVar4 + 1;
    unaff_x19[2] = lVar5;
    uVar7 = *(ulong *)(unaff_x20 + 0x58);
    if (lVar5 == *unaff_x19) {
      func_0x00458a18();
    }
    *(char *)(unaff_x19[1] + lVar5) = (char)uVar7;
    lVar4 = lVar4 + 2;
    unaff_x19[2] = lVar4;
    uVar3 = *(undefined8 *)(unaff_x20 + 0x50);
    if ((ulong)(*unaff_x19 - lVar4) < uVar7) {
      func_0x0079b61c();
      lVar4 = unaff_x19[2];
    }
    _memcpy(unaff_x19[1] + lVar4,uVar3,uVar7);
    lVar4 = lVar4 + uVar7;
  }
  unaff_x19[2] = lVar4;
  uVar3 = *(undefined8 *)(unaff_x20 + 0x20);
  uVar7 = *(ulong *)(unaff_x20 + 0x28);
  if ((ulong)(*unaff_x19 - lVar4) < 2) {
    func_0x0079b61c();
    lVar4 = unaff_x19[2];
  }
  *(ushort *)(unaff_x19[1] + lVar4) =
       (ushort)(uVar7 >> 8) & 0xff | (ushort)(((uint)uVar7 & 0xff00ff) << 8);
  lVar4 = lVar4 + 2;
  unaff_x19[2] = lVar4;
  if ((ulong)(*unaff_x19 - lVar4) < uVar7) {
    func_0x0079b61c();
    lVar4 = unaff_x19[2];
  }
  _memcpy(unaff_x19[1] + lVar4,uVar3,uVar7);
  lVar4 = lVar4 + uVar7;
  unaff_x19[2] = lVar4;
  uVar7 = *(ulong *)(unaff_x20 + 0x78);
  if ((ulong)(*unaff_x19 - lVar4) < 8) {
    func_0x0079b61c();
    lVar4 = unaff_x19[2];
  }
  uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
  uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
  *(ulong *)(unaff_x19[1] + lVar4) = uVar7 >> 0x20 | uVar7 << 0x20;
  lVar4 = lVar4 + 8;
  unaff_x19[2] = lVar4;
  uVar1 = *(uint *)(unaff_x20 + 0x88);
  if ((ulong)(*unaff_x19 - lVar4) < 4) {
    func_0x0079b61c();
    lVar4 = unaff_x19[2];
  }
  uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
  *(uint *)(unaff_x19[1] + lVar4) = uVar1 >> 0x10 | uVar1 << 0x10;
  unaff_x19[2] = lVar4 + 4;
  return;
}

