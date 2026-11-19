/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093f6d8
 */

undefined8 * FUN_0093f6d8(undefined8 *param_1,undefined8 param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  
  puVar1 = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(0x10);
  if (puVar1 == (undefined8 *)0x0) {
    puVar1 = (undefined8 *)0x0;
  }
  else {
    *puVar1 = param_2;
    puVar1[1] = 0;
    if (param_1 != (undefined8 *)0x0) {
      puVar3 = param_1;
      do {
        puVar2 = puVar3;
        puVar3 = (undefined8 *)puVar2[1];
      } while (puVar3 != (undefined8 *)0x0);
      puVar2[1] = puVar1;
      puVar1 = param_1;
    }
  }
  return puVar1;
}

