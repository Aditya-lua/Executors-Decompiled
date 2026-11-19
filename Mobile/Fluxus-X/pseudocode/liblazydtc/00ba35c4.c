/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba35c4
 */

void psa_open_key(undefined8 param_1,undefined4 *param_2)

{
  uint uVar1;
  long lVar2;
  uint uVar3;
  ulong uVar4;
  long lVar5;
  long local_40;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  uVar3 = psa_get_and_lock_key_slot(param_1,&local_40);
  if (uVar3 == 0) {
    *param_2 = (int)param_1;
    if (local_40 == 0) {
      uVar4 = 0;
    }
    else {
      if ((*(uint *)(local_40 + 0x18) & 0xfffffffe) == 2) {
        lVar5 = *(long *)(local_40 + 0x20);
        if ((*(uint *)(local_40 + 0x18) == 3) && (lVar5 == 1)) {
          uVar4 = psa_wipe_key_slot(local_40);
          goto LAB_00ba3608;
        }
        if (lVar5 != 0) {
          uVar4 = 0;
          *(long *)(local_40 + 0x20) = lVar5 + -1;
          goto LAB_00ba3608;
        }
      }
      uVar4 = 0xffffff69;
    }
  }
  else {
    *param_2 = 0;
    uVar1 = 0xffffff74;
    if (uVar3 != 0xffffff78) {
      uVar1 = uVar3;
    }
    uVar4 = (ulong)uVar1;
  }
LAB_00ba3608:
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

