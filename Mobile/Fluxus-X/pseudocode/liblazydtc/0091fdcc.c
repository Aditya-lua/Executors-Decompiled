/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091fdcc
 */

void FUN_0091fdcc(long *param_1)

{
  undefined8 *puVar1;
  ulong uVar2;
  
  puVar1 = (undefined8 *)*param_1;
  if ((puVar1 != (undefined8 *)0x0) && (param_1[1] != 0)) {
    (*(code *)PTR_free_00cc4678)(*puVar1);
    if (1 < (ulong)param_1[1]) {
      uVar2 = 1;
      do {
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(*param_1 + uVar2 * 8));
        uVar2 = uVar2 + 1;
      } while (uVar2 < (ulong)param_1[1]);
    }
    puVar1 = (undefined8 *)*param_1;
  }
  (*(code *)PTR_free_00cc4678)(puVar1);
  param_1[4] = 0;
  param_1[1] = 0;
  param_1[2] = 0;
  *param_1 = 0;
  return;
}

