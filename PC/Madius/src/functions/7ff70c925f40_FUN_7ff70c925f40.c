/* 7ff70c925f40 FUN_7ff70c925f40 */

undefined8 * FUN_7ff70c925f40(undefined8 *param_1,undefined8 *param_2,undefined4 param_3)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  
  uVar3 = 0xfffffffffffffffe;
  *param_1 = 0;
  uVar1 = FUN_7ff70cb12730(1);
  puVar2 = param_1 + 3;
  param_1[4] = uVar1;
  uVar1 = FUN_7ff70c924760(puVar2);
  param_1[1] = uVar1;
  uVar1 = FUN_7ff70c9248e0(puVar2);
  param_1[2] = uVar1;
  puVar2 = param_2;
  if (0xf < (ulonglong)param_2[3]) {
    puVar2 = (undefined8 *)*param_2;
  }
  FUN_7ff70c92cd80(param_1,puVar2,param_2[2] + (longlong)puVar2,param_3,param_1,uVar3);
  return param_1;
}


