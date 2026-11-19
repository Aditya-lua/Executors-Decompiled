/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00891514
 */

void FUN_00891514(long param_1,long param_2)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  
  iVar3 = FUN_0088df20();
  if (-1 < iVar3) {
    return;
  }
  iVar3 = *(int *)(param_1 + 0x64c);
  uVar1 = iVar3 + 1;
  if (0xff < uVar1) {
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(param_2 + 0xc,
                 "Out of registers when trying to allocate %d registers: exceeded limit %d",1,0xff);
  }
  *(uint *)(param_1 + 0x64c) = uVar1;
  uVar2 = *(uint *)(param_1 + 0x650);
  if (*(uint *)(param_1 + 0x650) <= uVar1) {
    uVar2 = uVar1;
  }
  *(uint *)(param_1 + 0x650) = uVar2;
  FUN_00891438(param_1,param_2,iVar3,0xff);
  return;
}

