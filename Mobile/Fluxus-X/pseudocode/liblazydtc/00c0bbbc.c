/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0bbbc
 */

long FUN_00c0bbbc(byte *param_1,long param_2)

{
  ulong uVar1;
  byte *pbVar2;
  
  uVar1 = *(ulong *)(param_1 + 8);
  pbVar2 = *(byte **)(param_1 + 0x10);
  if ((*param_1 & 1) == 0) {
    pbVar2 = param_1 + 1;
    uVar1 = (ulong)(*param_1 >> 1);
  }
  if (uVar1 < (ulong)(param_2 - (long)pbVar2)) {
                    /* WARNING: Subroutine does not return */
    FUN_00814f80();
  }
  FUN_0081ff10(param_1,param_2 - (long)pbVar2,1);
  return param_2;
}

