
void FUN_005a83a8(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  long lVar2;
  long lVar3;
  long *unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  
  while( true ) {
    func_0x00187bd4(param_1,param_2,param_3);
    if ((uint)unaff_x20 < (uint)*(ushort *)(unaff_x21 + 0x322)) {
      lVar3 = unaff_x20 + 1;
      if (unaff_x22 == 0) {
        lVar2 = unaff_x21;
      }
      else {
        lVar2 = unaff_x21 + lVar3 * 8;
        lVar3 = unaff_x22;
        do {
          lVar2 = *(long *)(lVar2 + 0x328);
          lVar3 = lVar3 + -1;
        } while (lVar3 != 0);
        lVar3 = 0;
      }
      *unaff_x19 = lVar2;
      unaff_x19[1] = 0;
      unaff_x19[2] = lVar3;
      unaff_x19[3] = unaff_x21;
      unaff_x19[4] = unaff_x22;
      unaff_x19[5] = unaff_x20;
      return;
    }
    if (*(long *)(unaff_x21 + 0x210) == 0) break;
    unaff_x20 = (ulong)*(ushort *)(unaff_x21 + 800);
    param_2 = unaff_x24;
    if (unaff_x22 != 0) {
      param_2 = unaff_x23;
    }
    param_3 = 8;
    param_1 = unaff_x21;
    unaff_x21 = *(long *)(unaff_x21 + 0x210);
    unaff_x22 = unaff_x22 + 1;
  }
  uVar1 = 0x328;
  if (unaff_x22 != 0) {
    uVar1 = 0x388;
  }
  func_0x00187bd4(unaff_x21,uVar1,8);
  *unaff_x19 = 0;
  return;
}

