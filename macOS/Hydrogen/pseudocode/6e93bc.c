
undefined8 FUN_006e93bc(void)

{
  int iVar1;
  uint uVar2;
  undefined8 uVar3;
  
  func_0x006e63b0();
  uVar3 = func_0x006e644c();
  iVar1 = func_0x006e6bc0(uVar3,2);
  uVar2 = func_0x006e6c78(uVar3,1);
  func_0x006e3894(uVar3,uVar2 >> (-iVar1 & 0x1fU) | uVar2 << 0x20 - (-iVar1 & 0x1fU));
  return 1;
}

