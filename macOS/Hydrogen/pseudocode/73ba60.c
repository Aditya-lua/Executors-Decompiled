
undefined8 FUN_0073ba60(void)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  long *unaff_x19;
  undefined4 *unaff_x20;
  long unaff_x22;
  undefined4 unaff_w25;
  undefined4 unaff_w26;
  undefined1 uStack0000000000000038;
  
  unaff_x19[2] = unaff_x22;
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
    lVar1 = _strlen();
    lVar3 = func_0x0015665c(&uStack0000000000000038);
    if (*(ulong *)(*unaff_x19 + 0x28) < (ulong)(lVar3 + lVar1)) {
      func_0x0072a74c(&uStack0000000000000038);
    }
  }
  if (((int)uVar2 == 0) && (uVar2 = (**(code **)(*unaff_x19 + 8))(), (int)uVar2 == 0)) {
    *unaff_x20 = 1;
    lVar1 = func_0x00156654(&uStack0000000000000038);
    if (lVar1 != 0) {
      unaff_w25 = unaff_w26;
    }
    *(undefined4 *)(unaff_x19 + 1) = unaff_w25;
  }
  func_0x0072a74c(&uStack0000000000000038);
  return uVar2;
}

