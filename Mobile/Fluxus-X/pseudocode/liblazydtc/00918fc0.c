/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00918fc0
 */

void FUN_00918fc0(long param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  
  puVar2 = *(undefined8 **)(param_1 + 0xc80);
  if (puVar2 == (undefined8 *)0x0) {
    return;
  }
  uVar1 = FUN_0093f628(param_1,7,2);
  do {
    uVar1 = FUN_00918b80(uVar1,*(undefined8 *)(param_1 + 0xa98),*puVar2);
    puVar2 = (undefined8 *)puVar2[1];
  } while (puVar2 != (undefined8 *)0x0);
  FUN_0093f680(param_1,7);
  return;
}

