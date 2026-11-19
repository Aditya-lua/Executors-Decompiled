/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00916a80
 */

undefined8 FUN_00916a80(undefined8 *param_1)

{
  undefined8 *puVar1;
  ulong uVar2;
  long lVar3;
  undefined8 *puVar4;
  ulong uVar5;
  undefined8 *puVar6;
  
  lVar3 = *(long *)*param_1;
  if (lVar3 == 0) {
    return 0;
  }
  puVar1 = (undefined8 *)0x0;
  if (param_1[2] != 0) {
    puVar1 = *(undefined8 **)(param_1[2] + 0x10);
    param_1[2] = puVar1;
    if (puVar1 != (undefined8 *)0x0) goto LAB_00916acc;
  }
  uVar2 = param_1[1];
  uVar5 = ((long *)*param_1)[4];
  if (uVar2 < uVar5) {
    puVar4 = (undefined8 *)(lVar3 + uVar2 * 0x20);
    do {
      puVar6 = (undefined8 *)*puVar4;
      if (puVar6 != (undefined8 *)0x0) {
        param_1[1] = uVar2 + 1;
        param_1[2] = puVar6;
        return *puVar6;
      }
      uVar2 = uVar2 + 1;
      puVar4 = puVar4 + 4;
    } while (uVar2 < uVar5);
  }
LAB_00916acc:
  if (puVar1 == (undefined8 *)0x0) {
    return 0;
  }
  return *puVar1;
}

