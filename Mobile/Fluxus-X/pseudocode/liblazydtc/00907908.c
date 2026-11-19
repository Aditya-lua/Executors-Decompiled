/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907908
 */

void FUN_00907908(long *param_1,undefined8 param_2,undefined8 param_3)

{
  long *plVar1;
  
  do {
    plVar1 = param_1;
    if (plVar1 == (long *)0x0) {
      return;
    }
  } while ((((*(byte *)((long)plVar1 + 0x24) & 1) == 0) &&
           (param_1 = (long *)plVar1[1], param_1 != (long *)0x0)) &&
          ((*(byte *)((long)param_1 + 0x24) & 1) == 0));
  do {
    if ((*(byte *)((long)plVar1 + 0x24) >> 1 & 1) == 0) {
      do {
        (**(code **)(*plVar1 + 0x38))(plVar1,param_2,param_3);
        plVar1 = (long *)plVar1[1];
      } while (plVar1 != (long *)0x0);
      return;
    }
    plVar1 = (long *)plVar1[1];
  } while (plVar1 != (long *)0x0);
  return;
}

