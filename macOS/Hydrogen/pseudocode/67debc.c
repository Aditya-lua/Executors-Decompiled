
bool FUN_0067debc(void)

{
  int iVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000060;
  
  func_0x0001753c();
  func_0x0001753c();
  uVar4 = func_0x0001753c();
  func_0x00087574();
  func_0x00087574(&uStack0000000000000060);
  uVar4 = __Unwind_Resume(uVar4);
  func_0x00087574(&uStack0000000000000060);
  uVar4 = __Unwind_Resume(uVar4);
  func_0x00087574(&uStack0000000000000030);
  func_0x00087574();
  func_0x00087574(&uStack0000000000000060);
  uVar4 = __Unwind_Resume(uVar4);
  func_0x00087574(&uStack0000000000000060);
  lVar5 = __Unwind_Resume(uVar4);
  lVar6 = lVar5 + -8;
  iVar1 = func_0x0067dca4(lVar6);
  (**(code **)(*(long *)(lVar5 + -8) + 0xa0))(lVar6);
  iVar2 = func_0x00602288();
  (**(code **)(*(long *)(lVar5 + -8) + 0x50))(lVar6);
  iVar3 = func_0x00602288();
  if (iVar1 == 0) {
    return false;
  }
  if ((iVar2 == 0x400) && (iVar3 == 0xa0)) {
    return true;
  }
  if ((iVar2 == 0x800) && (iVar3 == 0xe0)) {
    return true;
  }
  if ((iVar2 == 0x800) && (iVar3 == 0x100)) {
    return true;
  }
  return iVar2 == 0xc00 && iVar3 == 0x100;
}

