/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008042b4
 */

void FUN_008042b4(long param_1)

{
  int iVar1;
  long lVar2;
  
  if (param_1 != 0) {
    iVar1 = *(int *)(param_1 + 0xac);
    *(undefined **)(param_1 + 0x68) = &DAT_00cc4440;
    if (0 < iVar1) {
      lVar2 = 0;
      do {
        if (*(long *)(*(long *)(param_1 + 0x38) + lVar2 * 8) != 0) {
          FUN_008042b4();
          iVar1 = *(int *)(param_1 + 0xac);
        }
        lVar2 = lVar2 + 1;
      } while (lVar2 < iVar1);
    }
  }
  return;
}

