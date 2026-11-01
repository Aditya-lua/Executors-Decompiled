
void FUN_00225218(void)

{
  uint uVar1;
  undefined8 uVar2;
  long lVar3;
  long in_x9;
  long *unaff_x19;
  long unaff_x20;
  ulong uVar4;
  long unaff_x22;
  
  if (in_x9 == -0x8000000000000000) {
    if (unaff_x22 == *unaff_x19) {
      func_0x00458a18();
    }
    *(undefined1 *)(unaff_x19[1] + unaff_x22) = 0;
    lVar3 = unaff_x22 + 1;
  }
  else {
    if (unaff_x22 == *unaff_x19) {
      func_0x00458a18();
    }
    *(undefined1 *)(unaff_x19[1] + unaff_x22) = 1;
    lVar3 = unaff_x22 + 1;
    unaff_x19[2] = lVar3;
    uVar4 = *(ulong *)(unaff_x20 + 0x58);
    if (lVar3 == *unaff_x19) {
      func_0x00458a18();
    }
    *(char *)(unaff_x19[1] + lVar3) = (char)uVar4;
    lVar3 = unaff_x22 + 2;
    unaff_x19[2] = lVar3;
    uVar2 = *(undefined8 *)(unaff_x20 + 0x50);
    if ((ulong)(*unaff_x19 - lVar3) < uVar4) {
      func_0x0079b61c();
      lVar3 = unaff_x19[2];
    }
    _memcpy(unaff_x19[1] + lVar3,uVar2,uVar4);
    lVar3 = lVar3 + uVar4;
  }
  unaff_x19[2] = lVar3;
  uVar2 = *(undefined8 *)(unaff_x20 + 0x20);
  uVar4 = *(ulong *)(unaff_x20 + 0x28);
  if ((ulong)(*unaff_x19 - lVar3) < 2) {
    func_0x0079b61c();
    lVar3 = unaff_x19[2];
  }
  *(ushort *)(unaff_x19[1] + lVar3) =
       (ushort)(uVar4 >> 8) & 0xff | (ushort)(((uint)uVar4 & 0xff00ff) << 8);
  lVar3 = lVar3 + 2;
  unaff_x19[2] = lVar3;
  if ((ulong)(*unaff_x19 - lVar3) < uVar4) {
    func_0x0079b61c();
    lVar3 = unaff_x19[2];
  }
  _memcpy(unaff_x19[1] + lVar3,uVar2,uVar4);
  lVar3 = lVar3 + uVar4;
  unaff_x19[2] = lVar3;
  uVar4 = *(ulong *)(unaff_x20 + 0x78);
  if ((ulong)(*unaff_x19 - lVar3) < 8) {
    func_0x0079b61c();
    lVar3 = unaff_x19[2];
  }
  uVar4 = (uVar4 & 0xff00ff00ff00ff00) >> 8 | (uVar4 & 0xff00ff00ff00ff) << 8;
  uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
  *(ulong *)(unaff_x19[1] + lVar3) = uVar4 >> 0x20 | uVar4 << 0x20;
  lVar3 = lVar3 + 8;
  unaff_x19[2] = lVar3;
  uVar1 = *(uint *)(unaff_x20 + 0x88);
  if ((ulong)(*unaff_x19 - lVar3) < 4) {
    func_0x0079b61c();
    lVar3 = unaff_x19[2];
  }
  uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
  *(uint *)(unaff_x19[1] + lVar3) = uVar1 >> 0x10 | uVar1 << 0x10;
  unaff_x19[2] = lVar3 + 4;
  return;
}

