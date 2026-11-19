/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a32384
 */

int EC_GROUP_get_basis_type(EC_GROUP *param_1)

{
  int iVar1;
  
  iVar1 = 0;
  if (((*(int *)(*(long *)param_1 + 4) == 0x197) && (iVar1 = 0, *(int *)(param_1 + 0x48) != 0)) &&
     (iVar1 = 0, *(int *)(param_1 + 0x4c) != 0)) {
    if (*(int *)(param_1 + 0x50) == 0) {
      iVar1 = 0x2aa;
    }
    else {
      iVar1 = 0;
      if (*(int *)(param_1 + 0x54) != 0) {
        iVar1 = 0x2ab;
        if (*(int *)(param_1 + 0x58) != 0) {
          iVar1 = 0;
        }
        return iVar1;
      }
    }
  }
  return iVar1;
}

