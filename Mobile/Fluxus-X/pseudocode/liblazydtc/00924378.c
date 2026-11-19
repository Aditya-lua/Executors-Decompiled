/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00924378
 */

bool FUN_00924378(long *param_1)

{
  long lVar1;
  
  lVar1 = *param_1;
  if (lVar1 == 0) {
    return true;
  }
  return *(ulong *)(lVar1 + 0x18) <= *(ulong *)(lVar1 + 0x10);
}

