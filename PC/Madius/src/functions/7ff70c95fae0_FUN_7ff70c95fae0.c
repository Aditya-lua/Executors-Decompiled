/* 7ff70c95fae0 FUN_7ff70c95fae0 */

/* WARNING: Restarted to delay deadcode elimination for space: stack */

void FUN_7ff70c95fae0(undefined8 param_1,uint param_2,undefined8 param_3,undefined8 param_4)

{
  undefined4 uVar1;
  undefined8 uStackX_18;
  undefined8 uStackX_20;
  undefined8 *puVar2;
  
  puVar2 = &uStackX_18;
  uVar1 = 0;
  if ((param_2 & 0x100) != 0) {
    puVar2 = &uStackX_20;
    uStackX_18._0_4_ = (undefined4)param_3;
    uVar1 = (undefined4)uStackX_18;
  }
  uStackX_18 = param_3;
  uStackX_20 = param_4;
  func_0x7ff70d73c4d3(param_1,param_2,uVar1,param_4,puVar2);
  return;
}


