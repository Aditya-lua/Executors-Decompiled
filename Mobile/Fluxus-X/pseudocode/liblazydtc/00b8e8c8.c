/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8e8c8
 */

int psa_key_derivation_input_key(undefined4 *param_1,int param_2,undefined4 param_3)

{
  long lVar1;
  int iVar2;
  int iVar3;
  undefined2 *local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  iVar2 = FUN_00b86e5c(param_3,&local_40,0x4000,*param_1);
  if (iVar2 == 0) {
    if (*(uint *)(local_40 + 2) < 0x100) {
      if ((param_2 - 0x101U & 0xffff) < 2) {
        *(byte *)(param_1 + 1) = *(byte *)(param_1 + 1) | 1;
      }
      iVar3 = FUN_00b8e20c(param_1,param_2,*local_40,*(undefined8 *)(local_40 + 0x14),
                           *(undefined8 *)(local_40 + 0x18));
      iVar2 = psa_unregister_read_under_mutex(local_40);
      if (iVar3 != 0) {
        iVar2 = iVar3;
      }
      goto LAB_00b8e980;
    }
    psa_unregister_read_under_mutex();
    iVar2 = -0x86;
    local_40 = (undefined2 *)0x0;
  }
  psa_key_derivation_abort(param_1);
LAB_00b8e980:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

