/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092f02c
 */

void FUN_0092f02c(long param_1,int param_2)

{
  long *plVar1;
  
  plVar1 = *(long **)(param_1 + 0xe10);
  if (plVar1 != (long *)0x0) {
    do {
      if (*(int *)(*plVar1 + 0x28) == param_2) {
        FUN_00925d80(param_1 + 0xe10,plVar1,0);
        return;
      }
      plVar1 = (long *)plVar1[2];
    } while (plVar1 != (long *)0x0);
  }
  return;
}

