/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092f788
 */

void FUN_0092f788(undefined8 *param_1)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)*param_1;
  if (puVar1 != (undefined8 *)0x0) {
    if ((code *)puVar1[7] != (code *)0x0) {
      (*(code *)puVar1[7])(puVar1[6]);
      puVar1[6] = 0;
      puVar1[7] = 0;
    }
    FUN_00925e04(puVar1 + 2,0);
    (*(code *)PTR_free_00cc4678)(*puVar1);
    *puVar1 = 0;
    (*(code *)PTR_free_00cc4678)(puVar1[1]);
    puVar1[1] = 0;
    *(undefined1 *)(puVar1 + 8) = 1;
    (*(code *)PTR_free_00cc4678)(puVar1);
    *param_1 = 0;
  }
  return;
}

