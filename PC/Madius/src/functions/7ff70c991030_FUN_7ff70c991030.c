/* 7ff70c991030 FUN_7ff70c991030 */

void FUN_7ff70c991030(undefined8 *param_1,undefined8 *param_2,undefined8 param_3)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  
  if ((param_2 != (undefined8 *)0x0) && (param_1[3] != 0)) {
    if (param_2 == (undefined8 *)*param_1) {
      puVar1 = (undefined8 *)param_2[2];
      *param_1 = puVar1;
      if (puVar1 == (undefined8 *)0x0) {
        puVar1 = param_1;
      }
      uVar2 = 0;
    }
    else {
      puVar1 = (undefined8 *)param_2[2];
      if (param_2[1] != 0) {
        *(undefined8 **)(param_2[1] + 0x10) = puVar1;
      }
      uVar2 = param_2[1];
      if (puVar1 == (undefined8 *)0x0) {
        puVar1 = param_1;
      }
    }
    puVar1[1] = uVar2;
    uVar2 = *param_2;
    *param_2 = 0;
    param_2[1] = 0;
    param_2[2] = 0;
    param_1[3] = param_1[3] + -1;
    if ((code *)param_1[2] != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ff70c991098. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)param_1[2])(param_3,uVar2);
      return;
    }
  }
  return;
}


