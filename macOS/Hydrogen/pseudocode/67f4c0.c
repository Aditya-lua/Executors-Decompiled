
void FUN_0067f4c0(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined1 uStack0000000000000018;
  
  uStack0000000000000018 = 0;
  _uStack0000000000000008 = param_3;
  uStack0000000000000010 = param_1;
  iVar1 = func_0x0068026c(param_1);
  if (iVar1 != 0) {
    uStack0000000000000018 = 1;
  }
  uVar2 = func_0x0067ee60(&uStack0000000000000008,"Modulus","SubgroupGenerator",0xa8,1);
  func_0x0067f274(uVar2,"SubgroupOrder",&DAT_0067ebec,0);
  return;
}

