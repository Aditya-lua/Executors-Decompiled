
void FUN_001ebba8(long param_1)

{
  ushort uVar1;
  int in_w9;
  uint uVar2;
  short sVar3;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  long lStack0000000000000018;
  undefined8 uStack0000000000000020;
  long lStack0000000000000028;
  undefined8 uStack0000000000000030;
  long lStack0000000000000038;
  undefined8 uStack0000000000000040;
  
  *(undefined2 *)(unaff_x29 + -6) = 0x2100;
  if (in_w9 < 2) {
    sVar3 = 1;
    if (in_w9 != 0) {
      sVar3 = 2;
    }
    *(short *)(unaff_x29 + -4) = sVar3 << 8;
    uVar1 = *(ushort *)(param_1 + 4);
  }
  else if (in_w9 == 2) {
    *(undefined2 *)(unaff_x29 + -4) = 0x300;
    uVar1 = *(ushort *)(param_1 + 4);
  }
  else {
    *(ushort *)(unaff_x29 + -4) = *(ushort *)(param_1 + 2) >> 8 | *(ushort *)(param_1 + 2) << 8;
    uVar1 = *(ushort *)(param_1 + 4);
  }
  if (uVar1 < 2) {
    uVar2 = 1;
    if (uVar1 != 0) {
      uVar2 = 2;
    }
  }
  else if (uVar1 == 2) {
    uVar2 = 3;
  }
  else if (uVar1 == 3) {
    uVar2 = 0xffff;
  }
  else {
    uVar2 = (uint)*(ushort *)(param_1 + 6);
  }
  *(ushort *)(unaff_x29 + -2) = (ushort)(uVar2 >> 8) | (ushort)((uVar2 & 0xff00ff) << 8);
  _uStack0000000000000008 = &UNK_0081f740;
  uStack0000000000000010 = 4;
  lStack0000000000000018 = unaff_x29 + -6;
  uStack0000000000000020 = 2;
  lStack0000000000000028 = unaff_x29 + -4;
  uStack0000000000000030 = 2;
  lStack0000000000000038 = unaff_x29 + -2;
  uStack0000000000000040 = 2;
  func_0x001e1508(&uStack0000000000000008,4);
  return;
}

