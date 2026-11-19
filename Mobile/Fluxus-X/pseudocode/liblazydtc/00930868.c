/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00930868
 */

void FUN_00930868(long param_1)

{
  if (param_1 == 0) {
    return;
  }
  FUN_00904534(param_1 + 0x98);
  (*(code *)PTR_free_00cc4678)(param_1);
  return;
}

