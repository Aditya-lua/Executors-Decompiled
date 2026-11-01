
bool FUN_00277028(void)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uStack_40;
  undefined8 uStack_38;
  
  uVar2 = __Unwind_Resume();
  uStack_40 = 0;
  uStack_38 = 0;
  iVar1 = func_0x00281efc(uVar2,&uStack_40,&uStack_38);
  func_0x00281ecc(uVar2);
  return iVar1 != 1;
}

