
undefined1 FUN_00649a90(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  long lVar2;
  undefined1 auVar3 [16];
  undefined1 auStack_38 [40];
  
  func_0x00087574();
  auVar3 = __Unwind_Resume();
  func_0x006633f0(auStack_38,auVar3._0_8_,auVar3._8_8_,param_3,param_4,0);
  uVar1 = func_0x0062395c(auStack_38,"SubgroupOrder",0xa0,1);
  lVar2 = func_0x0065e22c(uVar1,"SubgroupGenerator",0x68,1);
  return *(undefined1 *)(lVar2 + 0x20);
}

