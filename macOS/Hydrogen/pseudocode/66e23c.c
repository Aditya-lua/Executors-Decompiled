
ulong FUN_0066e23c(void)

{
  int iVar1;
  undefined4 uVar2;
  long *plVar3;
  long lVar4;
  ulong uVar5;
  long *unaff_x19;
  int unaff_w21;
  ulong uVar6;
  undefined8 uStack0000000000000008;
  
  (**(code **)(*(long *)unaff_x19[0xb] + 0x28))();
  if (unaff_w21 == 0) {
    return 0;
  }
  plVar3 = (long *)(**(code **)(*unaff_x19 + 0x160))();
  uVar6 = (ulong)*(uint *)((long)unaff_x19 + 100);
  uStack0000000000000008 = uVar6;
  if ((ulong)unaff_x19[9] < uVar6) {
    lVar4 = (**(code **)(*plVar3 + 0x128))(plVar3,unaff_x19 + 0x11,&uStack0000000000000008);
    if (uStack0000000000000008 < uVar6) {
      uVar5 = unaff_x19[9];
      lVar4 = unaff_x19[10];
      if (uVar5 != uVar6) {
        if (lVar4 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined1 *)(lVar4 + -1 + uVar5) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644(lVar4);
        }
        lVar4 = func_0x006115d0(uVar6);
        unaff_x19[10] = lVar4;
      }
      unaff_x19[8] = -1;
      unaff_x19[9] = uVar6;
    }
    else {
    }
  }
  else {
    lVar4 = unaff_x19[10];
  }
  unaff_x19[0xd] = lVar4;
  (**(code **)(*(long *)unaff_x19[0xb] + 0x80))
            ((long *)unaff_x19[0xb],lVar4,*(undefined4 *)((long)unaff_x19 + 100));
  lVar4 = unaff_x19[0xd];
  uVar2 = *(undefined4 *)((long)unaff_x19 + 100);
  iVar1 = 0;
  if (unaff_w21 != 0) {
    iVar1 = unaff_w21 + -1;
  }
  plVar3 = (long *)(**(code **)(*unaff_x19 + 0x160))();
  lVar4 = (**(code **)(*plVar3 + 0x130))(plVar3,unaff_x19 + 0x11,lVar4,uVar2,iVar1);
  *(uint *)(unaff_x19 + 5) = (uint)(lVar4 != 0) << 1;
  if (lVar4 == 0) {
    return 0;
  }
  uVar6 = (ulong)*(uint *)((long)unaff_x19 + 100) - unaff_x19[4];
  if (uVar6 < 2) {
    uVar6 = 1;
  }
  return uVar6;
}

