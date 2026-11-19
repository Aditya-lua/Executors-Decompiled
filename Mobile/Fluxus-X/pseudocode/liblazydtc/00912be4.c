/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00912be4
 */

void FUN_00912be4(long param_1)

{
  long lVar1;
  undefined8 *puVar2;
  
  puVar2 = *(undefined8 **)(param_1 + 0x1298);
  if (puVar2 == (undefined8 *)0x0) {
    return;
  }
  FUN_0093f628(param_1,2,2);
  do {
    while (lVar1 = FUN_00912ca4(param_1,*puVar2,*(undefined8 *)(param_1 + 0xa90),
                                *(ulong *)(param_1 + 0xa82) >> 4 & 1), lVar1 != 0) {
      *(long *)(param_1 + 0xa90) = lVar1;
      puVar2 = (undefined8 *)puVar2[1];
      if (puVar2 == (undefined8 *)0x0) goto LAB_00912c7c;
    }
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"ignoring failed cookie_init for %s",*puVar2);
    }
    puVar2 = (undefined8 *)puVar2[1];
  } while (puVar2 != (undefined8 *)0x0);
LAB_00912c7c:
  FUN_0093f680(param_1,2);
  return;
}

