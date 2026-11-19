/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00857aac
 */

void FUN_00857aac(undefined8 *param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  
  puVar3 = (undefined8 *)*param_1;
  if (puVar3 == (undefined8 *)0x0) {
    return;
  }
  puVar2 = (undefined8 *)param_1[1];
  puVar1 = puVar3;
  if (puVar3 != puVar2) {
    do {
      puVar2 = puVar2 + -6;
      (**(code **)*puVar2)(puVar2);
    } while (puVar2 != puVar3);
    puVar1 = (undefined8 *)*param_1;
  }
  param_1[1] = puVar3;
  operator_delete(puVar1,param_1[2] - (long)puVar1);
  return;
}

