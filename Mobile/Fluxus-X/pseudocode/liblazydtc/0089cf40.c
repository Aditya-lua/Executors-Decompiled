/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089cf40
 */

void FUN_0089cf40(undefined8 *param_1)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  
  puVar4 = (undefined8 *)*param_1;
  puVar5 = (undefined8 *)*puVar4;
  if (puVar5 == (undefined8 *)0x0) {
    return;
  }
  puVar1 = puVar5;
  puVar2 = puVar4;
  if (puVar5 != (undefined8 *)puVar4[1]) {
    puVar1 = (undefined8 *)puVar4[1];
    do {
      puVar2 = puVar1 + -7;
      if ((void *)*puVar2 != (void *)0x0) {
        operator_delete((void *)*puVar2);
        puVar1[-7] = 0;
        operator_delete((void *)puVar1[-4]);
        puVar1[-6] = 0;
        puVar1[-5] = 0;
        puVar1[-4] = 0;
        operator_delete((void *)0x0);
        puVar1[-3] = 0;
        *(undefined1 *)(puVar1 + -1) = 0x40;
      }
      operator_delete((void *)puVar1[-4]);
      puVar1 = puVar2;
    } while (puVar2 != puVar5);
    puVar2 = (undefined8 *)*param_1;
    puVar1 = (undefined8 *)*puVar2;
  }
  lVar3 = puVar2[2];
  puVar4[1] = puVar5;
  operator_delete(puVar1,lVar3 - (long)puVar1);
  return;
}

