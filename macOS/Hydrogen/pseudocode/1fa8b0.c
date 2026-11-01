
undefined8 FUN_001fa8b0(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 unaff_x19;
  undefined8 *unaff_x21;
  
  lVar1 = func_0x00187bd0();
  if (lVar1 == 0) {
    func_0x007a1f00(2);
    return 1;
  }
  uVar2 = _memcpy(lVar1,param_2);
  *unaff_x21 = unaff_x19;
  unaff_x21[1] = lVar1;
  unaff_x21[2] = unaff_x19;
  return uVar2;
}

