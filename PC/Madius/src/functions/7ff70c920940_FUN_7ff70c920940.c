/* 7ff70c920940 FUN_7ff70c920940 */

undefined8 * FUN_7ff70c920940(undefined8 *param_1,longlong param_2,undefined8 param_3)

{
  longlong lVar1;
  undefined8 auStack_50 [2];
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
  uStack_40 = 3;
  puStack_38 = auStack_50;
  ppuStack_30 = &puStack_38;
  auStack_50[0] = param_3;
  lVar1 = FUN_7ff70cb12e80(param_2);
  puStack_28 = param_1;
  FUN_7ff70c91fa10(param_1,param_2,lVar1 + param_2,&puStack_38);
  return puStack_28;
}


