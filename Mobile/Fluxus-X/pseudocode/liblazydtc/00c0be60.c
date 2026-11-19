/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0be60
 */

long FUN_00c0be60(byte *param_1,long param_2)

{
  byte *pbVar1;
  ulong uVar2;
  bool bVar3;
  ulong uVar4;
  
  bVar3 = (*param_1 & 1) != 0;
  pbVar1 = param_1 + 4;
  if (bVar3) {
    pbVar1 = *(byte **)(param_1 + 0x10);
  }
  uVar2 = (ulong)(*param_1 >> 1);
  if (bVar3) {
    uVar2 = *(ulong *)(param_1 + 8);
  }
  uVar4 = param_2 - (long)pbVar1 >> 2;
  if (uVar2 < uVar4) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc531c();
  }
  FUN_00bc6aa0(param_1,uVar4,1);
  return param_2;
}

