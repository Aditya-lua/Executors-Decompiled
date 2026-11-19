/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093f8bc
 */

void curl_slist_free_all(undefined8 *param_1)

{
  undefined8 *puVar1;
  
  while (param_1 != (undefined8 *)0x0) {
    puVar1 = (undefined8 *)param_1[1];
    (*(code *)PTR_free_00cc4678)(*param_1);
    *param_1 = 0;
    (*(code *)PTR_free_00cc4678)(param_1);
    param_1 = puVar1;
  }
  return;
}

