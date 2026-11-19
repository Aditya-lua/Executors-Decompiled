/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba3690
 */

void psa_close_key(undefined8 param_1)

{
  long lVar1;
  long lVar2;
  long local_30;
  long local_28;
  
  lVar2 = tpidr_el0;
  local_28 = *(long *)(lVar2 + 0x28);
  if ((int)param_1 != 0) {
    param_1 = FUN_00ba3388(param_1,&local_30);
    if ((int)param_1 == 0) {
      lVar1 = *(long *)(local_30 + 0x20) + -1;
      if (lVar1 == 0) {
        param_1 = psa_wipe_key_slot(local_30);
      }
      else if (local_30 == 0) {
        param_1 = 0;
      }
      else {
        param_1 = 0xffffff69;
        if ((*(long *)(local_30 + 0x20) != 0) && ((*(uint *)(local_30 + 0x18) & 0xfffffffe) == 2)) {
          param_1 = 0;
          *(long *)(local_30 + 0x20) = lVar1;
        }
      }
    }
    else if ((int)param_1 == -0x8c) {
      param_1 = 0xffffff78;
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(param_1);
  }
  return;
}

