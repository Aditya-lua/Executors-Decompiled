/* 7ff70c91d130 FUN_7ff70c91d130 */

undefined8 * FUN_7ff70c91d130(undefined8 *param_1,undefined8 *param_2)

{
  ulonglong uVar1;
  longlong lVar2;
  undefined8 *puVar3;
  
  uVar1 = param_2[2];
  if (0xf < (ulonglong)param_2[3]) {
    param_2 = (undefined8 *)*param_2;
  }
  lVar2 = param_1[2];
  if ((ulonglong)(param_1[3] - lVar2) < uVar1) {
    param_1 = (undefined8 *)FUN_7ff70ca00b60(param_1,uVar1,uVar1,param_2,uVar1);
  }
  else {
    param_1[2] = lVar2 + uVar1;
    puVar3 = param_1;
    if (0xf < (ulonglong)param_1[3]) {
      puVar3 = (undefined8 *)*param_1;
    }
    FUN_7ff70cb12b70(lVar2 + (longlong)puVar3,param_2);
    *(undefined1 *)((longlong)puVar3 + lVar2 + uVar1) = 0;
  }
  return param_1;
}


