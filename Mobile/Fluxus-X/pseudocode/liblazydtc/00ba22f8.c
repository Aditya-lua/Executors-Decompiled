/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba22f8
 */

undefined4 psa_destroy_persistent_key(undefined4 param_1)

{
  long lVar1;
  int iVar2;
  undefined4 uVar3;
  undefined1 auStack_40 [8];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  iVar2 = psa_its_get_info(param_1,auStack_40);
  uVar3 = 0;
  if (iVar2 != -0x8c) {
    iVar2 = psa_its_remove(param_1);
    uVar3 = 0xffffff67;
    if (iVar2 == 0) {
      iVar2 = psa_its_get_info(param_1,auStack_40);
      uVar3 = 0;
      if (iVar2 != -0x8c) {
        uVar3 = 0xffffff67;
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar3;
}

