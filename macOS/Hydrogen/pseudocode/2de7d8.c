
bool FUN_002de7d8(int param_1)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  long *unaff_x24;
  long unaff_x28;
  undefined8 uStack0000000000000008;
  
  if (param_1 == 0) {
    func_0x0036e464();
    func_0x0036e3d8();
    func_0x0036e3d8();
    bVar1 = false;
  }
  else {
    *unaff_x24 = unaff_x28;
    uStack0000000000000008 = unaff_x24;
    func_0x00373e9c(0xa29608,&DAT_002de424);
    iVar2 = func_0x002de574(0xa3a550,&uStack0000000000000008);
    bVar1 = iVar2 != 0;
    if (uStack0000000000000008 != (long *)0x0) {
      lVar3 = *uStack0000000000000008;
      if (lVar3 != 0) {
        func_0x0036e464(lVar3,0x2a0);
        func_0x0036e3d8(lVar3);
      }
      func_0x0036e3d8(uStack0000000000000008);
    }
  }
  return bVar1;
}

