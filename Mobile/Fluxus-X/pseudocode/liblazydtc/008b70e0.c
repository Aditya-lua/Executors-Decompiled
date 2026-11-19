/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b70e0
 */

void FUN_008b70e0(long param_1)

{
  long lVar1;
  long lVar2;
  
  lVar2 = -0x2490;
  do {
    lVar1 = param_1 + lVar2;
    if (4 < *(int *)(lVar1 + 0x2dcc)) {
      if ((*(byte *)(*(long *)(lVar1 + 0x2dc0) + 2) & 3) != 0) {
        FUN_008b61bc(param_1);
      }
    }
    if (4 < *(int *)(lVar1 + 0x2ddc)) {
      if ((*(byte *)(*(long *)(param_1 + lVar2 + 0x2dd0) + 2) & 3) != 0) {
        FUN_008b61bc(param_1);
      }
    }
    if (4 < *(int *)(param_1 + lVar2 + 0x2dec)) {
      if ((*(byte *)(*(long *)(param_1 + lVar2 + 0x2de0) + 2) & 3) != 0) {
        FUN_008b61bc(param_1);
      }
    }
    lVar2 = lVar2 + 0x48;
  } while (lVar2 != 0);
  return;
}

