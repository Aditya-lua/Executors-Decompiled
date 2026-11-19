/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00924348
 */

void FUN_00924348(undefined8 *param_1)

{
  long *plVar1;
  long *plVar2;
  long *plVar3;
  
  if ((long *)*param_1 != (long *)0x0) {
    plVar2 = (long *)*param_1;
    plVar3 = (long *)param_1[2];
    do {
      plVar1 = plVar2;
      plVar2 = (long *)*plVar1;
      *plVar1 = (long)plVar3;
      plVar3 = plVar1;
    } while (plVar2 != (long *)0x0);
    *param_1 = 0;
    param_1[2] = plVar1;
  }
  param_1[1] = 0;
  return;
}

