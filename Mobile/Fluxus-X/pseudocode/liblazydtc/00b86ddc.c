/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b86ddc
 */

void psa_get_key_attributes(undefined4 param_1,undefined8 *param_2)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 *local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  psa_reset_key_attributes(param_2);
  iVar2 = psa_get_and_lock_key_slot(param_1,&local_40);
  if (iVar2 == 0) {
    param_2[2] = local_40[2];
    uVar3 = *local_40;
    param_2[1] = local_40[1];
    *param_2 = uVar3;
    psa_unregister_read_under_mutex();
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

