/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009456c0
 */

undefined4 FUN_009456c0(long param_1,long param_2,undefined4 *param_3)

{
  undefined4 uVar1;
  
  *param_3 = *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x220);
  uVar1 = 0x10000;
  if (*(long *)(param_2 + 0x18) == 0) {
    uVar1 = 1;
  }
  return uVar1;
}

