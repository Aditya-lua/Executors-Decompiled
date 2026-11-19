/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cacb4
 */

void FUN_008cacb4(long *param_1,long *param_2)

{
  long lVar1;
  int iVar2;
  long local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  if (*(int *)((long)param_1 + 0xc) != 3) {
    if ((*(int *)((long)param_1 + 0xc) == 5) &&
       (iVar2 = FUN_008b93c8(*param_1 + 0x18,&local_30), iVar2 != 0)) {
      *(undefined4 *)((long)param_2 + 0xc) = 3;
      *param_2 = local_30;
      param_1 = param_2;
    }
    else {
      param_1 = (long *)0x0;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(param_1);
  }
  return;
}

