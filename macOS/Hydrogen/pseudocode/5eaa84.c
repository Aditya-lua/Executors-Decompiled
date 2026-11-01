
void FUN_005eaa84(undefined8 param_1)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  long unaff_x19;
  long lVar4;
  long *plVar5;
  
  *(undefined8 *)(unaff_x19 + 0x10) = param_1;
  lVar3 = __Unwind_Resume();
  lVar4 = *(long *)(lVar3 + 0x10);
  if (lVar4 != 0) {
    plVar5 = (long *)(*(long *)(lVar3 + 8) + 0x10);
    do {
      if ((plVar5[-2] != 0) && (lVar3 = plVar5[-1], lVar3 != -1)) {
        lVar2 = *(long *)(lVar3 + 8);
        *(long *)(lVar3 + 8) = lVar2 + -1;
        LORelease();
        if (lVar2 == 1) {
          DataMemoryBarrier(2,1);
          uVar1 = *(ulong *)(*plVar5 + 0x10);
          if (uVar1 < 9) {
            uVar1 = 8;
          }
          uVar1 = *(long *)(*plVar5 + 8) + uVar1 + 0xf & -uVar1;
          if (uVar1 != 0) {
            func_0x00187bd4(lVar3,uVar1);
          }
        }
      }
      plVar5 = plVar5 + 3;
      lVar4 = lVar4 + -1;
    } while (lVar4 != 0);
  }
  return;
}

