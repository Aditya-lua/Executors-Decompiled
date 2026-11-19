/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009082b0
 */

void FUN_009082b0(undefined8 param_1,long param_2,int param_3)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  long *plVar4;
  long lVar5;
  int local_2c;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_2c = 0;
  plVar4 = *(long **)(param_2 + (long)param_3 * 8 + 0x248);
  if (plVar4 == (long *)0x0) {
    bVar2 = true;
  }
  else {
    iVar3 = (**(code **)(*plVar4 + 0x70))(plVar4,param_1,1,&local_2c,0);
    bVar2 = iVar3 != 0;
  }
  lVar5 = (long)local_2c;
  if (bVar2 || local_2c < 1) {
    lVar5 = 1;
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(lVar5);
  }
  return;
}

