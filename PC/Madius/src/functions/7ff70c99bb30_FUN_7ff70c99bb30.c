/* 7ff70c99bb30 FUN_7ff70c99bb30 */

undefined8
FUN_7ff70c99bb30(undefined8 param_1,longlong param_2,undefined8 *param_3,undefined8 *param_4,
                int *param_5,undefined8 *param_6,undefined8 *param_7,undefined8 *param_8)

{
  longlong lVar1;
  undefined8 auStack_e8 [2];
  undefined4 uStack_d8;
  undefined8 uStack_d0;
  undefined4 uStack_c0;
  longlong lStack_b8;
  undefined4 uStack_a8;
  undefined8 uStack_a0;
  undefined4 uStack_90;
  undefined8 uStack_88;
  undefined4 uStack_78;
  undefined8 uStack_70;
  undefined4 uStack_60;
  undefined8 *puStack_58;
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
  auStack_e8[0] = *param_3;
  uStack_d8 = 5;
  uStack_d0 = *param_4;
  uStack_c0 = 5;
  lStack_b8 = (longlong)*param_5;
  uStack_a8 = 1;
  uStack_a0 = *param_6;
  uStack_90 = 5;
  uStack_88 = *param_7;
  uStack_78 = 5;
  uStack_70 = *param_8;
  uStack_60 = 5;
  puStack_58 = auStack_e8;
  ppuStack_50 = &puStack_58;
  lVar1 = FUN_7ff70cb12e80(param_2);
  FUN_7ff70c91fa10(&uStack_48,param_2,lVar1 + param_2,&puStack_58);
  FUN_7ff70c99b4c0(param_1,&uStack_48);
  return param_1;
}


