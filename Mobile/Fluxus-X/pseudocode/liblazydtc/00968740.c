/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00968740
 */

void FUN_00968740(long param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  
  if (*(ulong *)(param_1 + 0x6d0) != 0) {
    lVar1 = *(long *)(param_1 + 0xca8);
    uVar2 = 0;
    do {
      if (*(long *)(lVar1 + 0x18) == param_2) {
        FUN_00968604();
        return;
      }
      uVar2 = uVar2 + 1;
      lVar1 = lVar1 + 200;
    } while (uVar2 < *(ulong *)(param_1 + 0x6d0));
  }
  return;
}

