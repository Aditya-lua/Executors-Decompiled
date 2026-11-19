/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090f270
 */

void FUN_0090f270(long param_1)

{
  while (param_1 != 0) {
    param_1 = *(long *)(param_1 + 0x28);
    (*(code *)PTR_free_00cc4678)();
  }
  return;
}

