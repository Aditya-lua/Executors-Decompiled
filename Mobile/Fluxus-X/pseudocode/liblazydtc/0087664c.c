/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087664c
 */

void FUN_0087664c(long param_1,undefined8 param_2,undefined8 param_3,undefined1 param_4,
                 undefined4 param_5,undefined4 param_6)

{
  long lVar1;
  long lVar2;
  int iVar3;
  undefined8 local_58;
  undefined8 local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_58 = param_2;
  local_50 = param_3;
  if (((ulong)(*(long *)(param_1 + 0x240) * 3) >> 2 <= *(ulong *)(param_1 + 0x248)) &&
     (lVar2 = FUN_0087bef8(param_1 + 0x220,&local_58), lVar2 == 0)) {
    FUN_0087bff0(param_1 + 0x220);
  }
  lVar2 = FUN_0087bdcc(param_1 + 0x220,&local_58);
  iVar3 = *(int *)(lVar2 + 0x10);
  if (iVar3 == 0) {
    iVar3 = *(int *)(param_1 + 0x248);
    *(int *)(lVar2 + 0x10) = iVar3;
    if ((*(byte *)(param_1 + 0x2c0) & 1) != 0) {
      FUN_00874d58(param_1 + 600,&local_58);
      iVar3 = *(int *)(lVar2 + 0x10);
    }
  }
  local_58._0_5_ = CONCAT14(param_4,iVar3);
  local_50 = CONCAT44(param_6,param_5);
  FUN_0087672c(param_1 + 0x1a8,&local_58);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

