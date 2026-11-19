/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907ce4
 */

void FUN_00907ce4(long param_1,int param_2)

{
  long lVar1;
  int iVar2;
  long *plVar3;
  long lVar4;
  undefined4 local_2c;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  lVar4 = *(long *)(param_1 + 0x20);
  if (lVar4 == 0) {
    local_2c = 0xffffffff;
  }
  else {
    plVar3 = *(long **)(lVar4 + (long)param_2 * 8 + 0x248);
    if ((plVar3 == (long *)0x0) || ((*(byte *)((long)plVar3 + 0x24) & 1) != 0)) {
      local_2c = *(undefined4 *)(lVar4 + (long)param_2 * 4 + 0x220);
    }
    else {
      iVar2 = (**(code **)(*plVar3 + 0x70))(plVar3,param_1,3,0,&local_2c);
      if (iVar2 != 0) {
        local_2c = 0xffffffff;
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_2c);
  }
  return;
}

