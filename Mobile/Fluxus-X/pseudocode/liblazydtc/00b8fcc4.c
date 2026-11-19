/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8fcc4
 */

int psa_pake_set_password_key(int *param_1,undefined4 param_2)

{
  long lVar1;
  short *psVar2;
  int iVar3;
  void *__dest;
  char cVar4;
  undefined8 uVar5;
  short *local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_40 = (short *)0x0;
  cVar4 = (char)param_1[3];
  if (cVar4 == '\x01') {
    iVar3 = FUN_00b86e5c(param_2,&local_40,0x4000,param_1[1]);
    psVar2 = local_40;
    if (iVar3 == 0) {
      if ((*local_40 == 0x1205) || (*local_40 == 0x1203)) {
        __dest = calloc(1,*(size_t *)(local_40 + 0x18));
        *(void **)(param_1 + 8) = __dest;
        if (__dest != (void *)0x0) {
          memcpy(__dest,*(void **)(psVar2 + 0x14),*(size_t *)(psVar2 + 0x18));
          *(undefined8 *)(param_1 + 10) = *(undefined8 *)(psVar2 + 0x18);
          *(undefined8 *)(param_1 + 0x18) = *(undefined8 *)(psVar2 + 8);
          uVar5 = *(undefined8 *)psVar2;
          *(undefined8 *)(param_1 + 0x16) = *(undefined8 *)(psVar2 + 4);
          *(undefined8 *)(param_1 + 0x14) = uVar5;
          iVar3 = psa_unregister_read_under_mutex(psVar2);
          goto LAB_00b8fd98;
        }
        iVar3 = -0x8d;
      }
      else {
        iVar3 = -0x87;
      }
    }
    cVar4 = (char)param_1[3];
    if (cVar4 != '\x02') goto LAB_00b8fd20;
LAB_00b8fd60:
    if (*param_1 == 1) {
      mbedtls_psa_pake_abort(param_1 + 8);
      if ((char)param_1[3] != '\x01') goto LAB_00b8fd80;
      goto LAB_00b8fd28;
    }
  }
  else {
    iVar3 = -0x89;
    if (cVar4 == '\x02') goto LAB_00b8fd60;
LAB_00b8fd20:
    if (cVar4 == '\x01') {
LAB_00b8fd28:
      if (*(long *)(param_1 + 8) != 0) {
        mbedtls_zeroize_and_free(*(long *)(param_1 + 8),*(undefined8 *)(param_1 + 10));
      }
      if (*(void **)(param_1 + 0xc) != (void *)0x0) {
        free(*(void **)(param_1 + 0xc));
      }
      if (*(void **)(param_1 + 0x10) != (void *)0x0) {
        free(*(void **)(param_1 + 0x10));
      }
    }
  }
LAB_00b8fd80:
  memset(param_1,0,0x390);
  psa_unregister_read_under_mutex(local_40);
LAB_00b8fd98:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

