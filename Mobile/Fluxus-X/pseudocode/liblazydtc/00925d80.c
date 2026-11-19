/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00925d80
 */

void FUN_00925d80(long *param_1,undefined8 *param_2,undefined8 param_3)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  
  if ((param_2 != (undefined8 *)0x0) && (lVar3 = param_1[3], lVar3 != 0)) {
    if ((undefined8 *)*param_1 == param_2) {
      lVar1 = param_2[2];
      *param_1 = lVar1;
      if (lVar1 == 0) {
        param_1[1] = 0;
      }
      else {
        *(undefined8 *)(lVar1 + 8) = 0;
      }
    }
    else {
      lVar1 = param_2[1];
      if (lVar1 != 0) {
        *(undefined8 *)(lVar1 + 0x10) = param_2[2];
      }
      if (param_2[2] == 0) {
        param_1[1] = lVar1;
      }
      else {
        *(long *)(param_2[2] + 8) = lVar1;
      }
    }
    uVar2 = *param_2;
    param_2[1] = 0;
    param_2[2] = 0;
    *param_2 = 0;
    param_1[3] = lVar3 + -1;
    if ((code *)param_1[2] != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00925dfc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)param_1[2])(param_3,uVar2);
      return;
    }
  }
  return;
}

