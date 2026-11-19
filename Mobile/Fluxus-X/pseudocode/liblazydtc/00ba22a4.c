/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba22a4
 */

void psa_is_key_present_in_storage(undefined4 param_1)

{
  long lVar1;
  int iVar2;
  undefined1 auStack_30 [8];
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  iVar2 = psa_its_get_info(param_1,auStack_30);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar2 != -0x8c);
  }
  return;
}

