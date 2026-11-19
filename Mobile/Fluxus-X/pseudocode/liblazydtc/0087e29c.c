/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087e29c
 */

undefined4 FUN_0087e29c(long *param_1,ulong param_2)

{
  ulong uVar1;
  
  if (param_1[5] != 0) {
    uVar1 = (param_2 >> 4 ^ param_2 >> 9) * -0x61c8864680b583eb >>
            ((ulong)*(byte *)(param_1 + 6) & 0x3f);
    if ((*(ulong *)(param_1[3] + (uVar1 >> 6) * 8) >> (uVar1 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*param_1 + uVar1 * 0x10) == param_2) {
          return *(undefined4 *)(*param_1 + uVar1 * 0x10 + 8);
        }
        uVar1 = uVar1 + 1 & param_1[4] - 1U;
      } while ((*(ulong *)(param_1[3] + (uVar1 >> 6) * 8) >> (uVar1 & 0x3f) & 1) != 0);
    }
  }
  return 0;
}

