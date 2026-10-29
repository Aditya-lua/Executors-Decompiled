/* 7ff70c962da0 FUN_7ff70c962da0 */

undefined8 *
FUN_7ff70c962da0(undefined8 *param_1,longlong param_2,undefined8 *param_3,undefined8 *param_4)

{
  longlong lVar1;
  undefined8 auStack_68 [2];
  undefined4 uStack_58;
  undefined8 uStack_50;
  undefined4 uStack_40;
  undefined8 *puStack_38;
  undefined8 **ppuStack_30;
  undefined8 *puStack_28;
  undefined8 uStack_20;
  
  uStack_20 = 0xfffffffffffffffe;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  param_1[3] = 0xf;
  auStack_68[0] = *param_3;
  uStack_58 = 5;
  uStack_50 = *param_4;
  uStack_40 = 5;
  puStack_38 = auStack_68;
  ppuStack_30 = &puStack_38;
  lVar1 = FUN_7ff70cb12e80(param_2);
  puStack_28 = param_1;
  FUN_7ff70c91fa10(param_1,param_2,lVar1 + param_2,&puStack_38);
  return puStack_28;
}


