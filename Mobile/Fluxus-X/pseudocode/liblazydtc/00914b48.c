/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00914b48
 */

void FUN_00914b48(long *param_1)

{
  long lVar1;
  
  while (param_1 != (long *)0x0) {
    lVar1 = *param_1;
    (*(code *)PTR_free_00cc4678)(param_1[5]);
    (*(code *)PTR_free_00cc4678)(param_1[3]);
    (*(code *)PTR_free_00cc4678)(param_1[4]);
    (*(code *)PTR_free_00cc4678)(param_1[1]);
    (*(code *)PTR_free_00cc4678)(param_1[2]);
    (*(code *)PTR_free_00cc4678)(param_1);
    param_1 = (long *)lVar1;
  }
  return;
}

