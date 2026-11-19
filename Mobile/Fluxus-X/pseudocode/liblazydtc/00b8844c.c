/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8844c
 */

int FUN_00b8844c(int *param_1,undefined4 param_2,undefined4 param_3,int param_4)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  undefined4 uVar5;
  long local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_50 = 0;
  if (*param_1 == 0) {
    uVar5 = 0x400;
    if (param_4 == 0) {
      uVar5 = 0x800;
    }
    iVar3 = FUN_00b86e5c(param_2,&local_50,uVar5,param_3);
    if ((iVar3 != 0) || (iVar3 = FUN_00b91284(param_3,local_50,param_1 + 1), iVar3 != 0))
    goto LAB_00b88544;
    *(byte *)((long)param_1 + 5) = *(byte *)((long)param_1 + 5) & 0xfe | (byte)param_4 & 1;
    if (param_4 != 0) {
      if (0xff < *(uint *)(local_50 + 4)) goto LAB_00b88540;
      iVar3 = mbedtls_psa_mac_sign_setup(param_1 + 2);
      if (iVar3 != -0x86) {
        if (iVar3 != 0) goto LAB_00b88534;
        goto LAB_00b885c4;
      }
      goto LAB_00b88544;
    }
    if (0xff < *(uint *)(local_50 + 4)) {
LAB_00b88540:
      iVar3 = -0x87;
      goto LAB_00b88544;
    }
    iVar3 = mbedtls_psa_mac_verify_setup
                      (param_1 + 2,local_50,*(undefined8 *)(local_50 + 0x28),
                       *(undefined8 *)(local_50 + 0x30),param_3);
    if (iVar3 != 0) {
      if (iVar3 == -0x86) goto LAB_00b88544;
LAB_00b88534:
      bVar2 = false;
      if (iVar3 == 0) goto LAB_00b885cc;
      goto LAB_00b8854c;
    }
LAB_00b885c4:
    *param_1 = 1;
LAB_00b885cc:
    iVar4 = psa_unregister_read_under_mutex(local_50);
  }
  else {
    iVar3 = -0x89;
LAB_00b88544:
    bVar2 = iVar3 == 0;
LAB_00b8854c:
    if (*param_1 == 0) {
      iVar4 = psa_unregister_read_under_mutex(local_50);
    }
    else {
      if (*param_1 == 1) {
        mbedtls_psa_mac_abort(param_1 + 2);
      }
      *(undefined1 *)(param_1 + 1) = 0;
      *param_1 = 0;
      *(byte *)((long)param_1 + 5) = *(byte *)((long)param_1 + 5) & 0xfe;
      iVar4 = psa_unregister_read_under_mutex(local_50);
    }
    if (!bVar2) goto LAB_00b88598;
  }
  iVar3 = iVar4;
LAB_00b88598:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

