
undefined8 FUN_006e94c0(undefined8 param_1)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  undefined8 uVar4;
  int unaff_w22;
  
  iVar1 = func_0x006e6c08(param_1,4,1);
  if (unaff_w22 < 0) {
    func_0x006e63b0();
  }
  else if (0 < iVar1) {
    if ((uint)(iVar1 + unaff_w22) < 0x21) {
      func_0x006e3894();
      return 1;
    }
    goto LAB_006e954c;
  }
  func_0x006e63b0();
LAB_006e954c:
  uVar4 = func_0x006e644c();
  uVar2 = func_0x006e6bc0(uVar4,2);
  uVar3 = func_0x006e6c78(uVar4,1);
  func_0x006e3894(uVar4,uVar3 >> (uVar2 & 0x1f) | uVar3 << 0x20 - (uVar2 & 0x1f));
  return 1;
}

