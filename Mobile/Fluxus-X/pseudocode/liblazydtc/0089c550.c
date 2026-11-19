/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089c550
 */

undefined8 FUN_0089c550(undefined8 param_1,long param_2)

{
  undefined8 *puVar1;
  long lVar2;
  
  if (*(long *)(param_2 + 0x40) != 0) {
    lVar2 = *(long *)(param_2 + 0x40) << 3;
    puVar1 = *(undefined8 **)(param_2 + 0x38);
    do {
      FUN_0089c9e8(param_1,*puVar1);
      lVar2 = lVar2 + -8;
      puVar1 = puVar1 + 1;
    } while (lVar2 != 0);
  }
  if ((*(byte *)(param_2 + 0x48) & 1) != 0) {
    lVar2 = *(long *)(param_2 + 0x20);
    if (((lVar2 != 0) && (*(int *)(lVar2 + 8) == DAT_00d1b050)) ||
       ((lVar2 != 0 && (*(int *)(lVar2 + 8) == DAT_00d1b060)))) {
      FUN_0089c9e8(param_1,*(undefined8 *)(lVar2 + 0x20));
    }
  }
  return 1;
}

