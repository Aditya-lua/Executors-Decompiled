/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00925d10
 */

void FUN_00925d10(long *param_1,undefined8 param_2,undefined8 *param_3)

{
  long *plVar1;
  long *plVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  long lVar6;
  
  plVar4 = param_1 + 1;
  lVar5 = *plVar4;
  *param_3 = param_2;
  lVar3 = param_1[3];
  if (lVar3 == 0) {
    *param_1 = (long)param_3;
    param_3[1] = 0;
    param_3[2] = 0;
  }
  else {
    plVar1 = (long *)(lVar5 + 0x10);
    plVar2 = plVar1;
    if (lVar5 == 0) {
      plVar2 = param_1;
    }
    lVar6 = *plVar2;
    param_3[1] = lVar5;
    param_3[2] = lVar6;
    if (lVar5 == 0) {
      *(undefined8 **)(*param_1 + 8) = param_3;
      plVar4 = param_1;
    }
    else {
      if (*plVar1 != 0) {
        plVar4 = (long *)(*plVar1 + 8);
      }
      *plVar4 = (long)param_3;
      plVar4 = plVar1;
    }
  }
  *plVar4 = (long)param_3;
  param_1[3] = lVar3 + 1;
  return;
}

