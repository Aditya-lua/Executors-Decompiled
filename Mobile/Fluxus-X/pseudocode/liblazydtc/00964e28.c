/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00964e28
 */

void FUN_00964e28(undefined8 *param_1)

{
  (*(code *)PTR_free_00cc4678)(*param_1);
  *param_1 = 0;
  (*(code *)PTR_free_00cc4678)(param_1[1]);
  param_1[1] = 0;
  (*(code *)PTR_free_00cc4678)(param_1[2]);
  param_1[2] = 0;
  (*(code *)PTR_free_00cc4678)(param_1[3]);
  param_1[3] = 0;
  (*(code *)PTR_free_00cc4678)(param_1[4]);
  param_1[4] = 0;
  (*(code *)PTR_free_00cc4678)(param_1[5]);
  param_1[5] = 0;
  *(undefined4 *)(param_1 + 6) = 0;
  *(undefined1 *)((long)param_1 + 0x34) = 0;
  *(byte *)((long)param_1 + 0x35) = *(byte *)((long)param_1 + 0x35) & 0xfc;
  return;
}

