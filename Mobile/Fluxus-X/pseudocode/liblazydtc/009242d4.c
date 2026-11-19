/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009242d4
 */

void FUN_009242d4(long *param_1)

{
  long *plVar1;
  
  plVar1 = (long *)*param_1;
  while (plVar1 != (long *)0x0) {
    *param_1 = *plVar1;
    (*(code *)PTR_free_00cc4678)();
    plVar1 = (long *)*param_1;
  }
  plVar1 = (long *)param_1[2];
  while (plVar1 != (long *)0x0) {
    param_1[2] = *plVar1;
    (*(code *)PTR_free_00cc4678)();
    plVar1 = (long *)param_1[2];
  }
  param_1[1] = 0;
  param_1[4] = 0;
  return;
}

