/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00884b30
 */

void FUN_00884b30(long param_1,long param_2,int param_3)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = *(int *)(param_1 + 0x64c) + param_3;
  if (0xff < uVar1) {
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(param_2 + 0xc,
                 "Out of registers when trying to allocate %d registers: exceeded limit %d",param_3,
                 0xff);
  }
  *(uint *)(param_1 + 0x64c) = uVar1;
  uVar2 = *(uint *)(param_1 + 0x650);
  if (*(uint *)(param_1 + 0x650) <= uVar1) {
    uVar2 = uVar1;
  }
  *(uint *)(param_1 + 0x650) = uVar2;
  return;
}

