
void FUN_001910f4(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  uint *unaff_x19;
  
  lVar1 = _SecAccessControlCreateWithFlags(param_1,0,param_3,0);
  if (lVar1 == 0) {
    unaff_x19[1] = 0xffffffce;
  }
  else {
    *(long *)(unaff_x19 + 2) = lVar1;
  }
  *unaff_x19 = (uint)(lVar1 == 0);
  return;
}

