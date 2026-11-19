/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091e3d0
 */

void FUN_0091e3d0(long param_1)

{
  if (param_1 == 0) {
    return;
  }
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x18));
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x20));
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x28));
  FUN_0091fdcc(param_1 + 0x30);
  FUN_0091fdcc(param_1 + 0x68);
  (*(code *)PTR_free_00cc4678)(param_1);
  return;
}

