/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba27f0
 */

ulong psa_its_get_info(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  uint uVar2;
  ulong uVar3;
  ulong uVar4;
  FILE *local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_30 = (FILE *)0x0;
  uVar3 = FUN_00ba2854(param_1,param_2,&local_30);
  uVar4 = uVar3 & 0xffffffff;
  if (local_30 != (FILE *)0x0) {
    uVar2 = fclose(local_30);
    uVar3 = (ulong)uVar2;
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return uVar4;
}

