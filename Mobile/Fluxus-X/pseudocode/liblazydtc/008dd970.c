/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dd970
 */

void FUN_008dd970(long param_1,ulong param_2,ulong param_3)

{
  ulong *puVar1;
  ulong uVar2;
  int iVar3;
  
  if (param_2 != 0 || param_3 != 0) {
    do {
      uVar2 = 0x3f - LZCOUNT(param_2);
      if (param_3 != 0) {
        uVar2 = LZCOUNT(param_3) ^ 0x7f;
      }
      puVar1 = (ulong *)(param_1 + uVar2 * 0x10);
      if (puVar1[1] == 0 && *puVar1 == 0) {
        iVar3 = *(int *)(param_1 + 0x800);
        *puVar1 = param_2;
        puVar1[1] = param_3;
        *(int *)(param_1 + 0x800) = iVar3 + 1;
        return;
      }
      param_2 = *puVar1 ^ param_2;
      param_3 = puVar1[1] ^ param_3;
    } while (param_2 != 0 || param_3 != 0);
  }
  return;
}

