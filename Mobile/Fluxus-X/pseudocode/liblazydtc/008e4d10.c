/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4d10
 */

long * FUN_008e4d10(long *param_1,long param_2)

{
  long *plVar1;
  
  plVar1 = param_1;
  do {
    plVar1 = (long *)*plVar1;
    if (plVar1 == param_1) {
      return (long *)0x0;
    }
  } while (*(long *)(plVar1[2] + 8) != param_2);
  return plVar1;
}

