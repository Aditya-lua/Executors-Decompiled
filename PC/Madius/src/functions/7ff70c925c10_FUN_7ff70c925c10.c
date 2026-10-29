/* 7ff70c925c10 FUN_7ff70c925c10 */

undefined8 * FUN_7ff70c925c10(undefined8 *param_1,undefined8 *param_2,undefined8 param_3)

{
  int iVar1;
  longlong lVar2;
  undefined8 *puVar3;
  
  if (param_1 != param_2) {
    lVar2 = FUN_7ff70cb12e80(param_3);
    if (lVar2 == 0) {
      do {
        if (param_1[2] == 0) {
          return param_1;
        }
        param_1 = param_1 + 4;
      } while (param_1 != param_2);
    }
    else {
      do {
        if (param_1[2] == lVar2) {
          puVar3 = param_1;
          if (0xf < (ulonglong)param_1[3]) {
            puVar3 = (undefined8 *)*param_1;
          }
          iVar1 = FUN_7ff70cb12b50(puVar3,param_3,lVar2);
          if (iVar1 == 0) {
            return param_1;
          }
        }
        param_1 = param_1 + 4;
      } while (param_1 != param_2);
    }
  }
  return param_1;
}


