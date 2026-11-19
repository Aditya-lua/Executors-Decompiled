/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b87470
 */

void psa_export_public_key(undefined8 param_1,void *param_2,size_t param_3,undefined8 *param_4)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  ulong uVar4;
  void *__src;
  long local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (param_3 == 0) {
    uVar4 = 0xffffff76;
  }
  else {
    *param_4 = 0;
    uVar4 = psa_get_and_lock_key_slot(param_1,&local_50);
    if ((int)uVar4 == 0) {
      __src = calloc(param_3,1);
      if (__src == (void *)0x0) {
        psa_unregister_read_under_mutex(local_50);
        uVar4 = 0xffffff73;
      }
      else {
        if ((*(byte *)(local_50 + 1) >> 6 & 1) == 0) {
          uVar2 = 0xffffff79;
        }
        else {
          uVar2 = psa_driver_wrapper_export_public_key
                            (local_50,*(undefined8 *)(local_50 + 0x28),
                             *(undefined8 *)(local_50 + 0x30),__src,param_3,param_4);
        }
        uVar3 = psa_unregister_read_under_mutex(local_50);
        if (param_2 == (void *)0x0) {
          uVar4 = 0xffffff69;
        }
        else {
          memcpy(param_2,__src,param_3);
          free(__src);
          if (uVar2 != 0) {
            uVar3 = uVar2;
          }
          uVar4 = (ulong)uVar3;
        }
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

