/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00916bf8
 */

void FUN_00916bf8(long param_1)

{
  long lVar1;
  time_t tVar2;
  long lVar3;
  int iVar4;
  time_t local_70;
  long local_68;
  int local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  if (*(long *)(param_1 + 0xb0) != 0) {
    iVar4 = *(int *)(param_1 + 0x6e0);
    if (*(long *)(param_1 + 0xd0) != 0) {
      FUN_0093f628(param_1,3,2);
    }
    tVar2 = time((time_t *)0x0);
    lVar3 = *(long *)(param_1 + 0xb0);
    do {
      local_68 = 0;
      local_70 = tVar2;
      local_60 = iVar4;
      FUN_0091694c(lVar3,&local_70,&LAB_009182f4);
      iVar4 = (int)local_68;
      if (0x7ffffffe < local_68) {
        iVar4 = 0x7ffffffe;
      }
    } while ((iVar4 != 0) &&
            (lVar3 = *(long *)(param_1 + 0xb0), 0x752 < *(ulong *)(lVar3 + 0x28) >> 4));
    if (*(long *)(param_1 + 0xd0) != 0) {
      FUN_0093f680(param_1,3);
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

