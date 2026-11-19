/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009077ec
 */

undefined8 FUN_009077ec(long param_1,int param_2)

{
  long *plVar1;
  
  plVar1 = *(long **)(*(long *)(param_1 + 0x20) + (long)param_2 * 8 + 0x248);
  while( true ) {
    if (plVar1 == (long *)0x0) {
      return 0;
    }
    if ((*(byte *)((long)plVar1 + 0x24) & 1) != 0) break;
    if ((*(byte *)(*plVar1 + 8) & 1) != 0) {
      return 0;
    }
    plVar1 = (long *)plVar1[1];
  }
  return 1;
}

