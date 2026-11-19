/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00934a90
 */

void FUN_00934a90(undefined8 *param_1)

{
  if ((*(byte *)(param_1 + 2) & 1) != 0) {
    (*(code *)PTR_free_00cc4678)(*param_1);
  }
  *param_1 = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  return;
}

