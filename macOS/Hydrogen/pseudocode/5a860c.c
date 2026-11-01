
void FUN_005a860c(long *param_1,long *param_2)

{
  undefined8 uVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long *plVar5;
  ulong uVar6;
  ulong uVar7;
  
  uVar7 = param_2[2];
  plVar3 = (long *)*param_2;
  lVar4 = param_2[1];
  while( true ) {
    if (uVar7 != 0) {
      plVar5 = plVar3;
      uVar6 = uVar7 - 1;
      if (lVar4 != 0) {
        plVar5 = (long *)plVar3[uVar7 + 0x6f];
        lVar2 = lVar4;
        while (lVar2 = lVar2 + -1, lVar2 != 0) {
          plVar5 = (long *)plVar5[(ulong)*(ushort *)((long)plVar5 + 0x37a) + 0x70];
        }
        uVar6 = (ulong)*(ushort *)((long)plVar5 + 0x37a);
      }
      *param_1 = (long)plVar5;
      param_1[1] = 0;
      param_1[2] = uVar6;
      param_1[3] = (long)plVar3;
      param_1[4] = lVar4;
      param_1[5] = uVar7 - 1;
      return;
    }
    plVar5 = (long *)*plVar3;
    if (plVar5 == (long *)0x0) break;
    uVar7 = (ulong)*(ushort *)(plVar3 + 0x6f);
    uVar1 = 0x380;
    if (lVar4 != 0) {
      uVar1 = 0x3e0;
    }
    func_0x00187bd4(plVar3,uVar1,8);
    plVar3 = plVar5;
    lVar4 = lVar4 + 1;
  }
  uVar1 = 0x380;
  if (lVar4 != 0) {
    uVar1 = 0x3e0;
  }
  func_0x00187bd4(plVar3,uVar1,8);
  *param_1 = 0;
  return;
}

