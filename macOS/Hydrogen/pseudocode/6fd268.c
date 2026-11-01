
undefined8 FUN_006fd268(undefined8 param_1)

{
  bool bVar1;
  bool bVar2;
  bool bVar3;
  int iVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  int iVar8;
  ulong uVar9;
  
  func_0x006e69bc(param_1,1,6);
  uVar5 = func_0x006e3144(param_1,1);
  iVar4 = func_0x006e1e34(param_1);
  if (iVar4 == 3) {
    uVar9 = func_0x006e6bc0(param_1,2);
    iVar4 = (int)uVar9;
    if ((0 < iVar4) && (iVar4 <= (int)uVar5)) {
      func_0x006fdac0(param_1,1,uVar9,uVar5,iVar4 + 1);
    }
  }
  else {
    if (iVar4 != 2) {
      uVar5 = func_0x006e644c(param_1,"wrong number of arguments to \'insert\'");
      func_0x006e69bc(uVar5,1,6);
      uVar6 = func_0x006e3144(uVar5,1);
      uVar7 = func_0x006e6c08(uVar5,2,uVar6);
      iVar4 = (int)uVar7;
      bVar1 = false;
      bVar2 = false;
      bVar3 = false;
      if (0 < iVar4) {
        iVar8 = (int)uVar6;
        bVar3 = SBORROW4(iVar4,iVar8);
        bVar1 = iVar4 - iVar8 < 0;
        bVar2 = iVar4 == iVar8;
      }
      if (bVar2 || bVar1 != bVar3) {
        func_0x006e3f90(uVar5,1,uVar7);
        func_0x006fdac0(uVar5,1,iVar4 + 1,uVar6,uVar7);
        func_0x006e383c(uVar5);
        func_0x006e4860(uVar5,1,uVar6);
        return 1;
      }
      return 0;
    }
    uVar9 = (ulong)((int)uVar5 + 1);
  }
  func_0x006e4860(param_1,1,uVar9);
  return 0;
}

