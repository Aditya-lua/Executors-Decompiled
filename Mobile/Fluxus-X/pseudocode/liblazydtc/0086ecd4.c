/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086ecd4
 */

void FUN_0086ecd4(long param_1)

{
  long lVar1;
  long lVar2;
  
  if ((*(byte *)(param_1 + 0x18) & 1) == 0) {
    lVar2 = **(long **)(param_1 + 8);
    for (lVar1 = **(long **)(param_1 + 0x10); lVar1 != lVar2; lVar1 = lVar1 + -0x28) {
      if ((*(byte *)(lVar1 + -0x18) & 1) != 0) {
        operator_delete(*(void **)(lVar1 + -8),*(ulong *)(lVar1 + -0x18) & 0xfffffffffffffffe);
      }
    }
  }
  return;
}

