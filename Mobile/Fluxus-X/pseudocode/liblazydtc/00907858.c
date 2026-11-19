/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907858
 */

undefined8 FUN_00907858(long param_1,int param_2)

{
  long *plVar1;
  
  if (param_1 != 0) {
    for (plVar1 = *(long **)(param_1 + (long)param_2 * 8 + 0x248); plVar1 != (long *)0x0;
        plVar1 = (long *)plVar1[1]) {
      if ((*(uint *)(*plVar1 + 8) >> 1 & 1) != 0) {
        return 1;
      }
      if ((*(uint *)(*plVar1 + 8) & 1) != 0) {
        return 0;
      }
    }
  }
  return 0;
}

