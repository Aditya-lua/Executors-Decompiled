/* 7ff70c9e79f0 FUN_7ff70c9e79f0 */

undefined8 FUN_7ff70c9e79f0(undefined8 param_1,longlong param_2,uint *param_3)

{
  longlong lVar1;
  ulonglong auStack_70 [2];
  undefined4 uStack_60;
  ulonglong *puStack_58;
  undefined8 **ppuStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_20;
  
  uStack_20 = 0xfffffffffffffffe;
  uStack_48 = 0;
  uStack_40 = 0;
  uStack_38 = 0;
  uStack_30 = 0xf;
  auStack_70[0] = (ulonglong)*param_3;
  uStack_60 = 2;
  puStack_58 = auStack_70;
  ppuStack_50 = &puStack_58;
  lVar1 = FUN_7ff70cb12e80(param_2);
  FUN_7ff70c91fa10(&uStack_48,param_2,lVar1 + param_2,&puStack_58);
  FUN_7ff70c99b4c0(param_1,&uStack_48);
  return param_1;
}


