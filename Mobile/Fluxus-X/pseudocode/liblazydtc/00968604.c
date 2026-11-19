/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00968604
 */

void FUN_00968604(undefined8 *param_1)

{
  if (param_1[3] != 0) {
    (*(code *)param_1[5])(param_1[3],param_1[4]);
    param_1[3] = 0;
    param_1[5] = 0;
    param_1[6] = 0;
    (*(code *)PTR_free_00cc4678)(param_1[9]);
    param_1[9] = 0;
    (*(code *)PTR_free_00cc4678)(param_1[10]);
    param_1[10] = 0;
    (*(code *)PTR_free_00cc4678)(param_1[0xb]);
    param_1[0xb] = 0;
    (*(code *)PTR_free_00cc4678)(param_1[0xc]);
    param_1[0xc] = 0;
    (*(code *)PTR_free_00cc4678)(param_1[0xd]);
    param_1[0xd] = 0;
    (*(code *)PTR_free_00cc4678)(param_1[0xe]);
    param_1[0xe] = 0;
    (*(code *)PTR_free_00cc4678)(param_1[0xf]);
    param_1[0xf] = 0;
    (*(code *)PTR_free_00cc4678)(param_1[0x11]);
    param_1[0x11] = 0;
    (*(code *)PTR_free_00cc4678)(param_1[0x12]);
    param_1[0x12] = 0;
    (*(code *)PTR_free_00cc4678)(param_1[0x13]);
    param_1[0x13] = 0;
    (*(code *)PTR_free_00cc4678)(param_1[0x16]);
    param_1[0x16] = 0;
    (*(code *)PTR_free_00cc4678)(param_1[0x10]);
    param_1[0x10] = 0;
    (*(code *)PTR_free_00cc4678)(param_1[0x14]);
    param_1[0x14] = 0;
    (*(code *)PTR_free_00cc4678)(param_1[0x15]);
    param_1[0x15] = 0;
    (*(code *)PTR_free_00cc4678)(*param_1);
    *param_1 = 0;
    (*(code *)PTR_free_00cc4678)(param_1[1]);
    param_1[1] = 0;
  }
  return;
}

