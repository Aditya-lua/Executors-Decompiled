/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009344cc
 */

void FUN_009344cc(long param_1)

{
  long lVar1;
  int iVar2;
  undefined4 uVar3;
  timeval *__timeout;
  int *piVar4;
  undefined4 *puVar5;
  undefined1 auStack_38 [16];
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  uVar3 = 0;
  if (param_1 != 0) {
    if (param_1 < 0) {
      puVar5 = (undefined4 *)__errno();
      *puVar5 = 0x16;
    }
    else {
      __timeout = (timeval *)FUN_00941c68(auStack_38);
      iVar2 = select(0,(fd_set *)0x0,(fd_set *)0x0,(fd_set *)0x0,__timeout);
      uVar3 = 0;
      if (iVar2 == 0) goto LAB_00934548;
      if (iVar2 == -1) {
        piVar4 = (int *)__errno();
        uVar3 = 0;
        if (*piVar4 == 4) goto LAB_00934548;
      }
    }
    uVar3 = 0xffffffff;
  }
LAB_00934548:
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

