
bool FUN_002aad3c(undefined8 param_1,undefined8 param_2)

{
  long *unaff_x20;
  long lVar1;
  
  func_0x00373db8(param_2);
  lVar1 = *unaff_x20;
  func_0x00373df0();
  if (lVar1 != 0) {
    return true;
  }
  func_0x00373dd4();
  lVar1 = *unaff_x20;
  if (lVar1 == 0) {
    lVar1 = func_0x002a4fe0();
    *unaff_x20 = lVar1;
  }
  func_0x00373e0c();
  return lVar1 != 0;
}

