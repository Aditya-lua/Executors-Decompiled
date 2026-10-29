/* 7ff70c925e60 FUN_7ff70c925e60 */

undefined8 *
FUN_7ff70c925e60(undefined8 *param_1,longlong param_2,undefined8 param_3,undefined8 param_4,
                undefined8 param_5,undefined8 param_6)

{
  longlong lVar1;
  undefined8 auStack_98 [2];
  undefined4 uStack_88;
  undefined8 uStack_80;
  undefined4 uStack_70;
  undefined8 uStack_68;
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
  uStack_88 = 3;
  uStack_70 = 3;
  uStack_68 = param_5;
  uStack_58 = 3;
  uStack_50 = param_6;
  uStack_40 = 3;
  puStack_38 = auStack_98;
  auStack_98[0] = param_3;
  uStack_80 = param_4;
  ppuStack_30 = &puStack_38;
  lVar1 = FUN_7ff70cb12e80(param_2);
  puStack_28 = param_1;
  FUN_7ff70c91fa10(param_1,param_2,lVar1 + param_2,&puStack_38);
  return puStack_28;
}


