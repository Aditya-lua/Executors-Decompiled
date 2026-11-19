/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00928f34
 */

void FUN_00928f34(long param_1)

{
  long lVar1;
  
  if (param_1 != 0) {
    if (*(long *)(param_1 + 0x1b0) == 0x10000001) {
      *(undefined8 *)(param_1 + 0x1b0) = 1;
    }
    if ((*(int *)(param_1 + 0x10) == 4) && (*(long *)(param_1 + 0x38) != 0)) {
      for (lVar1 = *(long *)(*(long *)(param_1 + 0x38) + 8); lVar1 != 0;
          lVar1 = *(long *)(lVar1 + 8)) {
        FUN_00928f34(lVar1);
      }
    }
  }
  return;
}

