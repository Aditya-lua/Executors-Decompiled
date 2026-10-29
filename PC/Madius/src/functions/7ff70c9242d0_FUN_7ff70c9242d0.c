/* 7ff70c9242d0 FUN_7ff70c9242d0 */

undefined8 * FUN_7ff70c9242d0(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  ulonglong uVar2;
  longlong lVar3;
  undefined8 *puVar4;
  
  uVar1 = *param_2;
  uVar2 = param_2[1];
  lVar3 = param_1[2];
  if ((ulonglong)(param_1[3] - lVar3) < uVar2) {
    param_1 = (undefined8 *)FUN_7ff70ca00b60(param_1,uVar2,uVar2,uVar1,uVar2);
  }
  else {
    param_1[2] = lVar3 + uVar2;
    puVar4 = param_1;
    if (0xf < (ulonglong)param_1[3]) {
      puVar4 = (undefined8 *)*param_1;
    }
    FUN_7ff70cb12b70(lVar3 + (longlong)puVar4,uVar1);
    *(undefined1 *)((longlong)puVar4 + lVar3 + uVar2) = 0;
  }
  return param_1;
}


