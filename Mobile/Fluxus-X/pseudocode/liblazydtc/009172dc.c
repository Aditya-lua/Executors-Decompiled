/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009172dc
 */

void FUN_009172dc(char *param_1)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  undefined1 auStack_40 [8];
  undefined1 auStack_38 [16];
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  iVar3 = inet_pton(2,param_1,auStack_40);
  if (iVar3 < 1) {
    iVar3 = inet_pton(10,param_1,auStack_38);
    bVar2 = 0 < iVar3;
  }
  else {
    bVar2 = true;
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(bVar2);
  }
  return;
}

