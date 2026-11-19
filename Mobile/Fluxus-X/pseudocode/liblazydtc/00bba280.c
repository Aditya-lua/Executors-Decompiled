/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bba280
 */

ulong ZSTD_getcBlockSize(ushort *param_1,ulong param_2,int *param_3)

{
  ushort uVar1;
  uint uVar2;
  ushort uVar3;
  int iVar4;
  ulong uVar5;
  
  if (param_2 < 3) {
    return 0xffffffffffffffb8;
  }
  uVar1 = *param_1;
  uVar3 = param_1[1];
  uVar5 = (ulong)(uVar1 >> 1) & 3;
  iVar4 = (int)uVar5;
  *param_3 = iVar4;
  param_3[1] = uVar1 & 1;
  uVar2 = (uVar1 & 0xfff8 | (uint)(byte)uVar3 << 0x10) >> 3;
  param_3[2] = uVar2;
  if (iVar4 != 1) {
    if (iVar4 == 3) {
      return 0xffffffffffffffec;
    }
    uVar5 = (ulong)uVar2;
  }
  return uVar5;
}

