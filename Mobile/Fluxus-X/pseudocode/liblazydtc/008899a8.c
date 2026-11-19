/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008899a8
 */

void FUN_008899a8(long param_1,long param_2,undefined8 param_3)

{
  if ((*(char *)(param_2 + 0x31) == '\x01') &&
     (((*(long *)(param_1 + 0x668) == 0 ||
       (*(long *)(*(long *)(param_1 + 0x668) + 0x98) != 0 || *(long *)(param_1 + 0x670) != 0)) ||
      (*(long *)(param_1 + 2000) != *(long *)(param_1 + 0x7d8))))) {
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(param_3,"\'export\' may only be applied to top-level statements");
  }
  return;
}

