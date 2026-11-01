
undefined8 FUN_0073bb20(void)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  long *unaff_x19;
  undefined4 *unaff_x20;
  long unaff_x21;
  ulong unaff_x23;
  long unaff_x24;
  undefined4 uVar4;
  undefined1 uStack0000000000000038;
  
  *(undefined2 *)((long)unaff_x19 + 0x1c) = 0x80;
  if ((((unaff_x23 & 1) == 0) && ((*(byte *)(unaff_x21 + 0xa1f) & 1) == 0)) ||
     (uVar2 = func_0x007906b4(*(undefined8 *)(unaff_x24 + 0x1e0)), (int)uVar2 == 0)) {
    unaff_x19[2] = (long)"XOAUTH2";
    lVar1 = func_0x00156654(&uStack0000000000000038);
    if (lVar1 == 0) {
      uVar2 = 0;
      lVar1 = *(long *)(*unaff_x19 + 0x28);
    }
    else {
      uVar2 = func_0x0073bc5c(*(undefined2 *)(*unaff_x19 + 0x3a),&uStack0000000000000038);
      lVar1 = *(long *)(*unaff_x19 + 0x28);
    }
    if (lVar1 != 0) {
      lVar1 = _strlen("XOAUTH2");
      lVar3 = func_0x0015665c(&uStack0000000000000038);
      if (*(ulong *)(*unaff_x19 + 0x28) < (ulong)(lVar3 + lVar1)) {
        func_0x0072a74c(&uStack0000000000000038);
      }
    }
    if (((int)uVar2 == 0) && (uVar2 = (**(code **)(*unaff_x19 + 8))(), (int)uVar2 == 0)) {
      *unaff_x20 = 1;
      lVar1 = func_0x00156654(&uStack0000000000000038);
      uVar4 = 0xd;
      if (lVar1 != 0) {
        uVar4 = 0x11;
      }
      *(undefined4 *)(unaff_x19 + 1) = uVar4;
    }
  }
  func_0x0072a74c(&uStack0000000000000038);
  return uVar2;
}

