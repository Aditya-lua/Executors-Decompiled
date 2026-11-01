
undefined8 FUN_002cb064(void)

{
  undefined8 *puVar1;
  int iVar2;
  undefined8 uVar3;
  long in_x3;
  undefined8 uVar4;
  undefined8 *unaff_x19;
  long *plVar5;
  undefined1 uStack0000000000000008;
  
  func_0x0028f83c(0xf,0,0x6a,in_x3 + 0x3a9,0x287);
  uVar3 = *unaff_x19;
  puVar1 = (undefined8 *)unaff_x19[1];
  iVar2 = func_0x002c2908(uVar3,*puVar1);
  if (iVar2 == 0) {
    iVar2 = func_0x002c7cd4(uVar3,puVar1 + 1);
    if (iVar2 != 0) {
      if (unaff_x19[2] == 0) {
        return 1;
      }
      plVar5 = (long *)*unaff_x19;
      (**(code **)(*plVar5 + 0x28))(plVar5,&uStack0000000000000008,unaff_x19[2] + 0x18);
      iVar2 = func_0x002c7cd4(plVar5,&uStack0000000000000008);
      if (iVar2 == 0) {
        func_0x0028f83c(0xf,0,0x44,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3d6);
        uVar3 = 0xf;
        uVar4 = 0x13d;
      }
      else {
        iVar2 = func_0x002c6bf4(*unaff_x19,&uStack0000000000000008,unaff_x19[1] + 8);
        if (iVar2 != 0) {
          return 1;
        }
        uVar3 = 0x71;
        uVar4 = 0x144;
      }
      goto LAB_002cb0e0;
    }
  }
  else {
    func_0x0028f83c(0xf,0,0x6a,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x290);
  }
  uVar3 = 0x78;
  uVar4 = 0x131;
LAB_002cb0e0:
  func_0x0028f83c(0xf,0,uVar3,"/aws-lc/crypto/fipsmodule/ec/ec_key.c",uVar4);
  return 0;
}

