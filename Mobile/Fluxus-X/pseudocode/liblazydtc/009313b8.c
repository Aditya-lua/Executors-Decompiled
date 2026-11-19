/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009313b8
 */

long FUN_009313b8(undefined8 param_1)

{
  long lVar1;
  int iVar2;
  long lVar3;
  long local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_30 = -1;
  iVar2 = FUN_009309cc(param_1,&local_30);
  if (iVar2 == 1) {
    lVar3 = local_30;
  }
  else {
    lVar3 = -1;
    if ((iVar2 == 0) && (lVar3 = local_30, local_30 == -1)) {
      local_30 = 0;
      lVar3 = 0;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return lVar3;
}

