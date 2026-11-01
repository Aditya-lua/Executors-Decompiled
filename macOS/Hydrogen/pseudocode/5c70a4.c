
void FUN_005c70a4(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  code *pcVar2;
  long lVar3;
  long lVar4;
  long *unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  
  while( true ) {
    func_0x00187bd4(param_1,param_2,8);
    if ((uint)unaff_x20 < (uint)*(ushort *)(unaff_x21 + 0x322)) {
      lVar4 = unaff_x20 + 1;
      if (unaff_x22 == 0) {
        lVar3 = unaff_x21;
      }
      else {
        lVar3 = unaff_x21 + lVar4 * 8;
        lVar4 = unaff_x22;
        do {
          lVar3 = *(long *)(lVar3 + 0x328);
          lVar4 = lVar4 + -1;
        } while (lVar4 != 0);
        lVar4 = 0;
      }
      *unaff_x19 = unaff_x21;
      unaff_x19[1] = unaff_x22;
      unaff_x19[2] = unaff_x20;
      *(long *)(unaff_x23 + 8) = lVar3;
      *(undefined8 *)(unaff_x23 + 0x10) = 0;
      *(long *)(unaff_x23 + 0x18) = lVar4;
      return;
    }
    if (*(long *)(unaff_x21 + 0x210) == 0) break;
    unaff_x20 = (ulong)*(ushort *)(unaff_x21 + 800);
    param_2 = unaff_x25;
    if (unaff_x22 != 0) {
      param_2 = unaff_x24;
    }
    param_1 = unaff_x21;
    unaff_x21 = *(long *)(unaff_x21 + 0x210);
    unaff_x22 = unaff_x22 + 1;
  }
  uVar1 = 0x328;
  if (unaff_x22 != 0) {
    uVar1 = 0x388;
  }
  func_0x00187bd4(unaff_x21,uVar1,8);
  func_0x007a23bc(&UNK_009f2768);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x5c7178);
  (*pcVar2)();
}

