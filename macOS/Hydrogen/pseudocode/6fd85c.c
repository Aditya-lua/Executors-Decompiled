
undefined8 FUN_006fd85c(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long unaff_x19;
  
  func_0x006e69bc(param_1,param_2,6);
  if (*(char *)(**(long **)(unaff_x19 + 0x10) + 4) == '\0') {
    func_0x006fc49c();
    return 0;
  }
  uVar2 = func_0x006ed124();
  func_0x006e69bc(uVar2,1,6);
  iVar1 = func_0x006e421c(uVar2,1);
  if (iVar1 == 0) {
    iVar1 = func_0x006e6dc8(uVar2,1,"__metatable");
    if (iVar1 == 0) {
      func_0x006e41a4(uVar2,1,1);
      func_0x006e2154(uVar2,1);
      return 1;
    }
  }
  else {
    func_0x006e63b0(uVar2,1,"table is already frozen");
  }
  uVar2 = func_0x006e63b0(uVar2,1,"table has a protected metatable");
  func_0x006e69bc(uVar2,1,6);
  uVar3 = func_0x006e421c(uVar2,1);
  func_0x006e3c24(uVar2,uVar3);
  return 1;
}

