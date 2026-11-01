
undefined8 FUN_006e948c(undefined8 param_1)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  undefined8 uVar6;
  
  uVar2 = func_0x006e6c78(param_1,1);
  uVar3 = func_0x006e6c78(param_1,2);
  uVar4 = func_0x006e6bc0(param_1,3);
  iVar5 = func_0x006e6c08(param_1,4,1);
  if ((int)uVar4 < 0) {
    func_0x006e63b0(param_1,3,"field cannot be negative");
  }
  else if (0 < iVar5) {
    if (iVar5 + uVar4 < 0x21) {
      uVar1 = -2 << (ulong)(iVar5 - 1U & 0x1f);
      func_0x006e3894(param_1,uVar2 & (~uVar1 << (ulong)(uVar4 & 0x1f) ^ 0xffffffff) |
                              (uVar3 & (uVar1 ^ 0xffffffff)) << (ulong)(uVar4 & 0x1f));
      return 1;
    }
    goto LAB_006e954c;
  }
  func_0x006e63b0(param_1,4,"width must be positive");
LAB_006e954c:
  uVar6 = func_0x006e644c(param_1,"trying to access non-existent bits");
  uVar2 = func_0x006e6bc0(uVar6,2);
  uVar3 = func_0x006e6c78(uVar6,1);
  func_0x006e3894(uVar6,uVar3 >> (uVar2 & 0x1f) | uVar3 << 0x20 - (uVar2 & 0x1f));
  return 1;
}

