/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00876818
 */

void FUN_00876818(long param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  long lVar2;
  int iVar3;
  undefined8 local_48;
  undefined8 uStack_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_48 = param_2;
  uStack_40 = param_3;
  if (((ulong)(*(long *)(param_1 + 0x240) * 3) >> 2 <= *(ulong *)(param_1 + 0x248)) &&
     (lVar2 = FUN_0087bef8(param_1 + 0x220,&local_48), lVar2 == 0)) {
    FUN_0087bff0(param_1 + 0x220);
  }
  lVar2 = FUN_0087bdcc(param_1 + 0x220,&local_48);
  iVar3 = *(int *)(lVar2 + 0x10);
  if (iVar3 == 0) {
    iVar3 = *(int *)(param_1 + 0x248);
    *(int *)(lVar2 + 0x10) = iVar3;
    if ((*(byte *)(param_1 + 0x2c0) & 1) != 0) {
      FUN_00874d58(param_1 + 600,&local_48);
      iVar3 = *(int *)(lVar2 + 0x10);
    }
  }
  local_48 = CONCAT44(local_48._4_4_,iVar3);
  FUN_008768dc(param_1 + 0x1c0,&local_48);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

