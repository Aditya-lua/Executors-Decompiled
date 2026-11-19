/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00891590
 */

void FUN_00891590(undefined8 param_1,long param_2)

{
  int iVar1;
  
  iVar1 = *(int *)(param_2 + 8);
  if ((param_2 == 0) || (iVar1 != DAT_00d1b010)) {
    do {
      if ((iVar1 != DAT_00d1afc0) && (iVar1 != DAT_00d1b0b0)) {
        FUN_008917fc();
        return;
      }
      param_2 = *(long *)(param_2 + 0x20);
      iVar1 = *(int *)(param_2 + 8);
    } while ((param_2 == 0) || (iVar1 != DAT_00d1b010));
  }
  return;
}

