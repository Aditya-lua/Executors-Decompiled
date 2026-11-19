/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090fba8
 */

undefined8 FUN_0090fba8(long param_1)

{
  undefined8 uVar1;
  
  if (*(long *)(param_1 + 0xd0) == 0) {
    uVar1 = *(undefined8 *)(*(long *)(param_1 + 0xc38) + 0x30);
  }
  else {
    FUN_0093f628(param_1,5,2);
    uVar1 = *(undefined8 *)(*(long *)(param_1 + 0xc38) + 0x30);
    if (*(long *)(param_1 + 0xd0) != 0) {
      FUN_0093f680(param_1,5);
    }
  }
  return uVar1;
}

