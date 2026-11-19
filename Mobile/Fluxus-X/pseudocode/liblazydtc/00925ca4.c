/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00925ca4
 */

void FUN_00925ca4(long *param_1,long param_2,undefined8 param_3,undefined8 *param_4)

{
  long *plVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  
  *param_4 = param_3;
  lVar2 = param_1[3];
  if (lVar2 == 0) {
    plVar3 = param_1 + 1;
    *param_1 = (long)param_4;
    param_4[1] = 0;
    param_4[2] = 0;
  }
  else {
    plVar3 = (long *)(param_2 + 0x10);
    plVar1 = plVar3;
    if (param_2 == 0) {
      plVar1 = param_1;
    }
    lVar4 = *plVar1;
    param_4[1] = param_2;
    param_4[2] = lVar4;
    if (param_2 == 0) {
      *(undefined8 **)(*param_1 + 8) = param_4;
      plVar3 = param_1;
    }
    else {
      plVar1 = param_1;
      if ((long *)*plVar3 != (long *)0x0) {
        plVar1 = (long *)*plVar3;
      }
      plVar1[1] = (long)param_4;
    }
  }
  *plVar3 = (long)param_4;
  param_1[3] = lVar2 + 1;
  return;
}

