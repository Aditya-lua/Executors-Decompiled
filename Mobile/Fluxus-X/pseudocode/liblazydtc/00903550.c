/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00903550
 */

void FUN_00903550(undefined8 *param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  
  puVar1 = (undefined8 *)*param_1;
  if (puVar1 != (undefined8 *)0x0) {
    puVar3 = (undefined8 *)puVar1[1];
    while (puVar3 != (undefined8 *)0x0) {
      puVar2 = (undefined8 *)*puVar3;
      puVar3 = (undefined8 *)puVar3[2];
      (*(code *)PTR_free_00cc4678)(*puVar2);
      (*(code *)PTR_free_00cc4678)(puVar2[2]);
      (*(code *)PTR_free_00cc4678)(puVar2);
    }
    (*(code *)PTR_free_00cc4678)(*puVar1);
    (*(code *)PTR_free_00cc4678)(puVar1);
    *param_1 = 0;
  }
  return;
}

