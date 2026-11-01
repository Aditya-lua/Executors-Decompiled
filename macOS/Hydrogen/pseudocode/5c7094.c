
void FUN_005c7094(long param_1,long param_2)

{
  long lVar1;
  undefined8 uVar2;
  ushort uVar3;
  code *pcVar4;
  long lVar5;
  long lVar6;
  long *unaff_x19;
  long unaff_x21;
  long lVar7;
  long unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  
  while( true ) {
    lVar7 = unaff_x21;
    lVar1 = param_1 + 1;
    uVar3 = *(ushort *)(param_2 + 800);
    uVar2 = unaff_x25;
    if (param_1 != 0) {
      uVar2 = unaff_x24;
    }
    func_0x00187bd4(param_2,uVar2,8);
    if (uVar3 < *(ushort *)(lVar7 + 0x322)) break;
    param_2 = lVar7;
    param_1 = lVar1;
    unaff_x21 = *(long *)(lVar7 + 0x210);
    if (*(long *)(lVar7 + 0x210) == 0) {
      uVar2 = 0x328;
      if (lVar1 != 0) {
        uVar2 = 0x388;
      }
      func_0x00187bd4(lVar7,uVar2,8);
      func_0x007a23bc(&UNK_009f2768);
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x5c7178);
      (*pcVar4)();
    }
  }
  lVar6 = (ulong)uVar3 + 1;
  if (lVar1 == 0) {
    lVar5 = lVar7;
  }
  else {
    lVar5 = lVar7 + lVar6 * 8;
    lVar6 = lVar1;
    do {
      lVar5 = *(long *)(lVar5 + 0x328);
      lVar6 = lVar6 + -1;
    } while (lVar6 != 0);
    lVar6 = 0;
  }
  *unaff_x19 = lVar7;
  unaff_x19[1] = lVar1;
  unaff_x19[2] = (ulong)uVar3;
  *(long *)(unaff_x23 + 8) = lVar5;
  *(undefined8 *)(unaff_x23 + 0x10) = 0;
  *(long *)(unaff_x23 + 0x18) = lVar6;
  return;
}

