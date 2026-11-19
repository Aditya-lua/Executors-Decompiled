/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084c0ac
 */

void FUN_0084c0ac(undefined8 *param_1)

{
  void *pvVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  
  FUN_0084bf48();
  puVar4 = (undefined8 *)param_1[1];
  puVar2 = (undefined8 *)param_1[2];
  if (puVar4 != puVar2) {
    do {
      puVar3 = puVar4 + 1;
      operator_delete((void *)*puVar4,0xfc0);
      puVar4 = puVar3;
    } while (puVar3 != puVar2);
    puVar4 = (undefined8 *)param_1[1];
    puVar2 = (undefined8 *)param_1[2];
  }
  if ((long)puVar4 - (long)puVar2 != 0) {
    param_1[2] = (long)puVar2 + (((long)puVar4 - (long)puVar2) + 7U & 0xfffffffffffffff8);
  }
  pvVar1 = (void *)*param_1;
  if (pvVar1 == (void *)0x0) {
    return;
  }
  operator_delete(pvVar1,param_1[3] - (long)pvVar1);
  return;
}

