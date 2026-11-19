/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008514d0
 */

undefined8 FUN_008514d0(long param_1)

{
  undefined8 uVar1;
  
  if ((param_1 == 0) || (*(int *)(param_1 + 8) != DAT_00d1b020)) {
    uVar1 = 0;
    if ((param_1 != 0) && (*(int *)(param_1 + 8) == DAT_00d1b010)) {
      return **(undefined8 **)(param_1 + 0x20);
    }
  }
  else {
    uVar1 = *(undefined8 *)(param_1 + 0x20);
  }
  return uVar1;
}

