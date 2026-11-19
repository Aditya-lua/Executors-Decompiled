/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00908c4c
 */

void FUN_00908c4c(long param_1,int param_2)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = FUN_00907890((int)param_1,0);
  uVar2 = 1;
  if (param_2 != 1) {
    if (param_2 == 2) {
      if ((uVar1 & 1) != 0) {
        return;
      }
      uVar2 = ~uVar1 & 1;
    }
    else {
      uVar2 = 0;
    }
  }
  if (uVar2 != ((uint)*(ulong *)(param_1 + 0x3a0) >> 6 & 1)) {
    *(ulong *)(param_1 + 0x3a0) =
         *(ulong *)(param_1 + 0x3a0) & 0xffffffffffffffbf | (ulong)(uVar2 << 6);
  }
  return;
}

