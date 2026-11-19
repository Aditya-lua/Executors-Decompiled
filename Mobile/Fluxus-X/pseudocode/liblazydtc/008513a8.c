/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008513a8
 */

bool FUN_008513a8(long param_1)

{
  int iVar1;
  
  iVar1 = *(int *)(param_1 + 8);
  if ((iVar1 == DAT_00d1afd0 || iVar1 == DAT_00d1afe0) || iVar1 == DAT_00d1aff0) {
    return true;
  }
  return iVar1 == DAT_00d1b000;
}

