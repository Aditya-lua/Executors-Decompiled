
void FUN_005c6e68(long param_1,long *param_2)

{
  undefined8 uVar1;
  ushort uVar2;
  code *pcVar3;
  long *plVar4;
  long lVar5;
  undefined8 *unaff_x19;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  
  while( true ) {
    uVar2 = *(ushort *)(param_2 + 0x6f);
    uVar1 = unaff_x25;
    if (param_1 != 0) {
      uVar1 = unaff_x24;
    }
    func_0x00187bd4(param_2,uVar1,8);
    if (uVar2 < *(ushort *)((long)unaff_x21 + 0x37a)) break;
    if ((long *)*unaff_x21 == (long *)0x0) {
      uVar1 = 0x380;
      if (unaff_x22 != 0) {
        uVar1 = 0x3e0;
      }
      func_0x00187bd4(unaff_x21,uVar1,8);
      func_0x007a23bc(&UNK_009f2768);
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x5c6f48);
      (*pcVar3)();
    }
    param_2 = unaff_x21;
    param_1 = unaff_x22;
    unaff_x21 = (long *)*unaff_x21;
    unaff_x22 = unaff_x22 + 1;
  }
  lVar5 = (ulong)uVar2 + 1;
  if (unaff_x22 == 0) {
    plVar4 = unaff_x21;
  }
  else {
    plVar4 = unaff_x21 + lVar5;
    lVar5 = unaff_x22;
    do {
      plVar4 = (long *)plVar4[0x70];
      lVar5 = lVar5 + -1;
    } while (lVar5 != 0);
    lVar5 = 0;
  }
  *unaff_x19 = unaff_x21;
  unaff_x19[1] = unaff_x22;
  unaff_x19[2] = (ulong)uVar2;
  *(long **)(unaff_x23 + 8) = plVar4;
  *(undefined8 *)(unaff_x23 + 0x10) = 0;
  *(long *)(unaff_x23 + 0x18) = lVar5;
  return;
}

