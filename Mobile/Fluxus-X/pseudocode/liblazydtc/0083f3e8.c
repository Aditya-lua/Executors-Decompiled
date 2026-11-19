/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083f3e8
 */

void FUN_0083f3e8(undefined8 param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  void *pvVar2;
  void *pvVar3;
  
  if (param_2 != (void *)0x0) {
    do {
      pvVar3 = (void *)*param_2;
      puVar1 = (void *)param_2[5];
      while (puVar1 != (void *)0x0) {
        pvVar2 = (void *)*puVar1;
        if ((*(byte *)(puVar1 + 2) & 1) != 0) {
          operator_delete((void *)puVar1[4],puVar1[2] & 0xfffffffffffffffe);
        }
        operator_delete(puVar1,0x30);
        puVar1 = pvVar2;
      }
      pvVar2 = (void *)param_2[3];
      param_2[3] = 0;
      if (pvVar2 != (void *)0x0) {
        operator_delete(pvVar2,param_2[4] << 3);
      }
      operator_delete(param_2,0x40);
      param_2 = pvVar3;
    } while (pvVar3 != (void *)0x0);
  }
  return;
}

