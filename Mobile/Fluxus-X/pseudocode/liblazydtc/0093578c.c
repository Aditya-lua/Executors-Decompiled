/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093578c
 */

void FUN_0093578c(undefined8 param_1,long *param_2)

{
  if (param_2 == (long *)0x0) {
    return;
  }
  (**(code **)(*param_2 + 0x18))(param_1,param_2);
  (*(code *)PTR_free_00cc4678)(param_2);
  return;
}

