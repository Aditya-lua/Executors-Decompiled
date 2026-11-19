/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009612a0
 */

void curl_url_cleanup(undefined8 *param_1)

{
  if (param_1 == (undefined8 *)0x0) {
    return;
  }
  (*(code *)PTR_free_00cc4678)(*param_1);
  (*(code *)PTR_free_00cc4678)(param_1[1]);
  (*(code *)PTR_free_00cc4678)(param_1[2]);
  (*(code *)PTR_free_00cc4678)(param_1[3]);
  (*(code *)PTR_free_00cc4678)(param_1[4]);
  (*(code *)PTR_free_00cc4678)(param_1[5]);
  (*(code *)PTR_free_00cc4678)(param_1[6]);
  (*(code *)PTR_free_00cc4678)(param_1[7]);
  (*(code *)PTR_free_00cc4678)(param_1[8]);
  (*(code *)PTR_free_00cc4678)(param_1[9]);
  (*(code *)PTR_free_00cc4678)(param_1);
  return;
}

