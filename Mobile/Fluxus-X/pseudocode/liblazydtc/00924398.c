/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00924398
 */

bool FUN_00924398(long param_1)

{
  bool bVar1;
  long lVar2;
  
  lVar2 = *(long *)(param_1 + 8);
  if (lVar2 == 0) {
    return false;
  }
  bVar1 = false;
  if (*(long *)(param_1 + 0x10) == 0) {
    bVar1 = false;
    if (*(ulong *)(param_1 + 0x28) <= *(ulong *)(param_1 + 0x20)) {
      if (*(ulong *)(param_1 + 0x28) < *(ulong *)(param_1 + 0x20)) {
        return true;
      }
      bVar1 = *(ulong *)(lVar2 + 8) <= *(ulong *)(lVar2 + 0x18);
    }
  }
  return bVar1;
}

