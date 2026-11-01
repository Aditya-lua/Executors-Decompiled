
bool FUN_0068b4f0(void)

{
  ulong uVar1;
  long lVar2;
  uint uVar3;
  uint unaff_w20;
  long unaff_x21;
  uint unaff_w22;
  
  do {
    lVar2 = func_0x00609cf4();
    if (lVar2 == 0) {
      return false;
    }
    uVar1 = (ulong)unaff_w22;
    unaff_w22 = unaff_w22 + 1;
    uVar3 = (uint)*(ushort *)(unaff_x21 + uVar1 * 2);
  } while (uVar3 < unaff_w20);
  if (uVar3 == unaff_w20) {
    lVar2 = func_0x00609cf4();
    return lVar2 != 0;
  }
  return true;
}

