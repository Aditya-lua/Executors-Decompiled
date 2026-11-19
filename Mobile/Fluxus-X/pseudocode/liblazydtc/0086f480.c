/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086f480
 */

void FUN_0086f480(undefined8 *param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  
  if ((*(byte *)(param_1 + 1) & 1) == 0) {
    puVar5 = (undefined8 *)*param_1;
    puVar6 = (undefined8 *)*puVar5;
    if (puVar6 != (undefined8 *)0x0) {
      puVar4 = (undefined8 *)puVar5[1];
      puVar1 = puVar6;
      puVar2 = puVar5;
      if (puVar6 != puVar4) {
        do {
          puVar4 = puVar4 + -6;
          (**(code **)*puVar4)(puVar4);
        } while (puVar4 != puVar6);
        puVar2 = (undefined8 *)*param_1;
        puVar1 = (undefined8 *)*puVar2;
      }
      lVar3 = puVar2[2];
      puVar5[1] = puVar6;
      operator_delete(puVar1,lVar3 - (long)puVar1);
      return;
    }
  }
  return;
}

