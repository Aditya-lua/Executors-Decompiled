/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009415dc
 */

undefined8 FUN_009415dc(long param_1,long *param_2,long *param_3)

{
  undefined8 uVar1;
  long *plVar2;
  long lVar3;
  
  uVar1 = 1;
  if ((param_1 != 0) && (param_2 != (long *)0x0)) {
    if ((param_2[4] == -1) && ((int)param_2[5] == -1)) {
      if ((long *)param_2[2] == param_2) {
        uVar1 = 3;
      }
      else {
        lVar3 = param_2[3];
        uVar1 = 0;
        *(long **)(lVar3 + 0x10) = (long *)param_2[2];
        *(long *)(param_2[2] + 0x18) = lVar3;
        param_2[2] = (long)param_2;
        *param_3 = param_1;
      }
    }
    else {
      plVar2 = (long *)FUN_00941308(param_2[4],param_2[5]);
      if (plVar2 == param_2) {
        plVar2 = (long *)param_2[2];
        if (plVar2 == param_2) {
          if (*param_2 == 0) {
            plVar2 = (long *)param_2[1];
          }
          else {
            plVar2 = (long *)FUN_00941308(param_2[4],param_2[5]);
            plVar2[1] = param_2[1];
          }
        }
        else {
          lVar3 = param_2[4];
          plVar2[5] = param_2[5];
          plVar2[4] = lVar3;
          lVar3 = *param_2;
          plVar2[1] = param_2[1];
          *plVar2 = lVar3;
          plVar2[3] = param_2[3];
          *(long **)(param_2[3] + 0x10) = plVar2;
        }
        uVar1 = 0;
        *param_3 = (long)plVar2;
      }
      else {
        uVar1 = 2;
      }
    }
  }
  return uVar1;
}

