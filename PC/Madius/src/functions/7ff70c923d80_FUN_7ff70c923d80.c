/* 7ff70c923d80 FUN_7ff70c923d80 */

undefined8 * FUN_7ff70c923d80(undefined8 *param_1,longlong param_2,undefined4 param_3)

{
  undefined8 uVar1;
  longlong lVar2;
  
  *param_1 = 0;
  uVar1 = FUN_7ff70cb12730(1);
  param_1[4] = uVar1;
  uVar1 = FUN_7ff70c924760(param_1 + 3);
  param_1[1] = uVar1;
  uVar1 = FUN_7ff70c9248e0(param_1 + 3);
  param_1[2] = uVar1;
  lVar2 = FUN_7ff70cb12e80(param_2);
  FUN_7ff70c92cd80(param_1,param_2,lVar2 + param_2,param_3);
  return param_1;
}


