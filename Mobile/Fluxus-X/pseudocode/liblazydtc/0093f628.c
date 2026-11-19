/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093f628
 */

undefined8 FUN_0093f628(long param_1,uint param_2)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 0xd0);
  if (lVar1 == 0) {
    return 3;
  }
  if ((*(uint *)(lVar1 + 4) & 1 << (ulong)(param_2 & 0x1f)) == 0) {
    return 0;
  }
  if (*(code **)(lVar1 + 0x10) == (code *)0x0) {
    return 0;
  }
  (**(code **)(lVar1 + 0x10))();
  return 0;
}

