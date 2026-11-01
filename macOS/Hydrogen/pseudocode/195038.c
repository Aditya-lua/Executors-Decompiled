
undefined8 FUN_00195038(void)

{
  undefined8 uVar1;
  long *unaff_x19;
  long lVar2;
  long lVar3;
  
  uVar1 = func_0x00195930();
  lVar2 = unaff_x19[1];
  for (lVar3 = unaff_x19[2]; lVar3 != 0; lVar3 = lVar3 + -1) {
    func_0x0019fb28(lVar2);
    func_0x0019e6a4(lVar2 + 8);
    lVar2 = lVar2 + 0x10;
  }
  if (*unaff_x19 != 0) {
    func_0x00187bd4(unaff_x19[1],*unaff_x19 << 4,8);
  }
  return uVar1;
}

