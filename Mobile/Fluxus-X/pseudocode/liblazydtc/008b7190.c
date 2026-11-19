/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b7190
 */

void FUN_008b7190(long param_1,int param_2)

{
  long *plVar1;
  
  if ((0 < param_2) &&
     (plVar1 = (long *)FUN_008bb19c(*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x4c48)),
     4 < *(int *)((long)plVar1 + 0xc))) {
    if ((*(byte *)(*plVar1 + 2) & 3) != 0) {
      FUN_008b61bc(*(undefined8 *)(param_1 + 0x60));
      return;
    }
  }
  return;
}

