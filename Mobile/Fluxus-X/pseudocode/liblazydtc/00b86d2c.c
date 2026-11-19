/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b86d2c
 */

void psa_destroy_key(ulong param_1)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  long local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  if (((int)param_1 != 0) &&
     (param_1 = psa_get_and_lock_key_slot(param_1,&local_30), (int)param_1 == 0)) {
    if (*(int *)(local_30 + 0x18) == 2) {
      *(undefined4 *)(local_30 + 0x18) = 3;
      if (*(char *)(local_30 + 4) == '\0') {
        uVar2 = 0;
      }
      else if (*(char *)(local_30 + 4) == -1) {
        uVar2 = 0xffffff7b;
      }
      else {
        uVar2 = psa_destroy_persistent_key(*(undefined4 *)(local_30 + 0x14));
      }
    }
    else {
      uVar2 = 0xffffff69;
    }
    uVar3 = psa_unregister_read(local_30);
    if (uVar3 != 0) {
      uVar2 = uVar3;
    }
    param_1 = (ulong)uVar2;
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(param_1);
  }
  return;
}

