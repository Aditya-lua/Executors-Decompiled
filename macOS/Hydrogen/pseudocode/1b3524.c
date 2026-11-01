
void FUN_001b3524(void)

{
  ushort uVar1;
  long *unaff_x19;
  uint uVar2;
  long unaff_x20;
  long lVar3;
  
  func_0x001f0f84();
  lVar3 = unaff_x19[2];
  if ((ulong)(*unaff_x19 - lVar3) < 2) {
    func_0x0079b61c();
    lVar3 = unaff_x19[2];
  }
  *(undefined2 *)(unaff_x19[1] + lVar3) = 0xffff;
  lVar3 = lVar3 + 2;
  unaff_x19[2] = lVar3;
  uVar1 = *(ushort *)(unaff_x20 + 8);
  if (uVar1 < 5) {
    if (uVar1 < 2) {
      if (uVar1 == 0) {
        uVar2 = 2;
      }
      else {
        uVar2 = 0x300;
      }
    }
    else if (uVar1 == 2) {
      uVar2 = 0x301;
    }
    else if (uVar1 == 3) {
      uVar2 = 0x302;
    }
    else {
      uVar2 = 0x303;
    }
  }
  else if (uVar1 < 7) {
    if (uVar1 == 5) {
      uVar2 = 0x304;
    }
    else {
      uVar2 = 0xfeff;
    }
  }
  else if (uVar1 == 7) {
    uVar2 = 0xfefd;
  }
  else if (uVar1 == 8) {
    uVar2 = 0xfefc;
  }
  else {
    uVar2 = (uint)*(ushort *)(unaff_x20 + 10);
  }
  if ((ulong)(*unaff_x19 - lVar3) < 2) {
    func_0x0079b61c();
    lVar3 = unaff_x19[2];
  }
  *(ushort *)(unaff_x19[1] + lVar3) = (ushort)(uVar2 >> 8) | (ushort)((uVar2 & 0xff00ff) << 8);
  unaff_x19[2] = lVar3 + 2;
  func_0x0024031c();
  return;
}

