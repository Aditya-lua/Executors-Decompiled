/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094a3a8
 */

int FUN_0094a3a8(long param_1,long param_2)

{
  int iVar1;
  uint uVar2;
  
  if (param_2 == 0) {
    uVar2 = *(uint *)(param_1 + 0x131c);
  }
  else {
    *(ulong *)(param_2 + 0x3a0) = *(ulong *)(param_2 + 0x3a0) & 0xffffffffffffdfff;
    uVar2 = *(uint *)(param_1 + 0x131c);
    if (((uVar2 >> 6 & 1) != 0) && ((*(byte *)(*(long *)(param_2 + 0x3a8) + 0x95) >> 4 & 1) == 0)) {
      uVar2 = uVar2 & 0xffffffbf;
      *(uint *)(param_1 + 0x131c) = uVar2;
    }
  }
  *(uint *)(param_1 + 0x131c) = uVar2 & 0xfffffbff;
  if (*(char *)(param_1 + 0x1b2) < '\0') {
    *(undefined1 *)(param_1 + 0x131a) = 5;
  }
  iVar1 = FUN_009327ec(param_1 + 0xd8,param_1);
  if (iVar1 == 0) {
    FUN_00941238(param_1);
    FUN_00931fec(param_1,0);
    FUN_00931fe0(param_1,0);
  }
  return iVar1;
}

