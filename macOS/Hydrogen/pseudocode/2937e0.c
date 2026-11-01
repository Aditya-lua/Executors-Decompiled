
bool FUN_002937e0(long *param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  long *plVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined1 auVar6 [16];
  
  if (*param_1 != 0) {
    iVar1 = func_0x002c2908();
    if (iVar1 == 0) {
      return true;
    }
    func_0x0028f83c(0xf,0,0x82,"/aws-lc/crypto/fipsmodule/ec/ec_key.c",0xd4);
    return false;
  }
  if (param_1[2] == 0) {
    if (param_1[1] == 0) {
      lVar2 = func_0x002c6ae8(param_2);
      *param_1 = lVar2;
      return lVar2 != 0;
    }
  }
  else {
    func_0x0079e7a4();
  }
  auVar6 = func_0x0079e77c();
  puVar4 = auVar6._8_8_;
  plVar3 = auVar6._0_8_;
  if (*plVar3 == 0) {
    func_0x0028f83c(0xf,0,0x72,"/aws-lc/crypto/fipsmodule/ec/ec_key.c",0x101);
    return false;
  }
  if (puVar4 == (undefined8 *)0x0) {
    puVar4 = (undefined8 *)plVar3[1];
    if (puVar4 != (undefined8 *)0x0) {
      func_0x002c6434(*puVar4);
      func_0x0036e3d8(puVar4);
    }
    lVar2 = 0;
  }
  else {
    iVar1 = func_0x002c2908(*plVar3,*puVar4);
    if (iVar1 != 0) {
      func_0x0028f83c(0xf,0,0x82,"/aws-lc/crypto/fipsmodule/ec/ec_key.c",0x106);
      return false;
    }
    puVar5 = (undefined8 *)plVar3[1];
    if (puVar5 != (undefined8 *)0x0) {
      func_0x002c6434(*puVar5);
      func_0x0036e3d8(puVar5);
    }
    lVar2 = func_0x002c78e4(puVar4,*plVar3);
  }
  plVar3[1] = lVar2;
  return lVar2 != 0;
}

