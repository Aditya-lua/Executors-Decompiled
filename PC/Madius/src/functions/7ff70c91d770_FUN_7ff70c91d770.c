/* 7ff70c91d770 FUN_7ff70c91d770 */

undefined8 * FUN_7ff70c91d770(undefined8 *param_1,undefined8 param_2)

{
  longlong lVar1;
  ulonglong uVar2;
  undefined8 *puVar3;
  
  uVar2 = FUN_7ff70cb12e80(param_2);
  lVar1 = param_1[2];
  if ((ulonglong)(param_1[3] - lVar1) < uVar2) {
    param_1 = (undefined8 *)FUN_7ff70ca00b60(param_1,uVar2,uVar2,param_2,uVar2);
  }
  else {
    param_1[2] = uVar2 + lVar1;
    puVar3 = param_1;
    if (0xf < (ulonglong)param_1[3]) {
      puVar3 = (undefined8 *)*param_1;
    }
    FUN_7ff70cb12b70(lVar1 + (longlong)puVar3,param_2);
    *(undefined1 *)((longlong)puVar3 + uVar2 + lVar1) = 0;
  }
  return param_1;
}


