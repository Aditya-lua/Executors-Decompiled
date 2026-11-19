/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8ea0c
 */

void psa_key_derivation_key_agreement
               (uint *param_1,uint param_2,undefined4 param_3,void *param_4,size_t param_5)

{
  long lVar1;
  bool bVar2;
  long lVar3;
  uint uVar4;
  uint uVar5;
  ulong uVar6;
  void *__dest;
  long local_478;
  undefined8 local_470;
  undefined1 auStack_468 [1024];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  if ((*param_1 & 0x7f000000) != 0x9000000) {
    uVar6 = 0xffffff79;
    goto LAB_00b8eab4;
  }
  uVar6 = FUN_00b86e5c(param_3,&local_478,0x4000);
  lVar3 = local_478;
  if ((int)uVar6 != 0) goto LAB_00b8eab4;
  if (0xff < *(uint *)(local_478 + 4)) {
    psa_unregister_read_under_mutex(local_478);
    local_478 = 0;
    uVar6 = 0xffffff7a;
    goto LAB_00b8eab4;
  }
  if (param_5 == 0) {
    __dest = (void *)0x0;
LAB_00b8eafc:
    memset(auStack_468,0,0x400);
    local_470 = 0;
    uVar4 = *param_1;
    uVar5 = uVar4 & 0xf6ff0000 | 0x9000000;
    if ((((uVar4 & 0x76000000 | 0x9000000) == 0x9000000) &&
        ((uVar4 & 0xf6000000 | 0x8000000) == 0x8000000)) && (*(uint *)(lVar3 + 4) < 0x100)) {
      if (uVar5 == 0x9010000) {
        uVar4 = mbedtls_psa_ffdh_key_agreement
                          (lVar3,__dest,param_5,*(undefined8 *)(lVar3 + 0x28),
                           *(undefined8 *)(lVar3 + 0x30),auStack_468,0x400,&local_470);
      }
      else {
        if (uVar5 != 0x9020000) goto LAB_00b8eba4;
        uVar4 = mbedtls_psa_key_agreement_ecdh
                          (lVar3,*(undefined8 *)(lVar3 + 0x28),*(undefined8 *)(lVar3 + 0x30),
                           0x9020000,__dest,param_5,auStack_468,0x400,&local_470);
      }
      if (uVar4 == 0) {
        uVar4 = FUN_00b8e20c(param_1,param_2,0x1200,auStack_468,local_470);
      }
    }
    else {
LAB_00b8eba4:
      uVar4 = 0xffffff7a;
    }
    mbedtls_platform_zeroize(auStack_468,local_470);
    if (uVar4 != 0) goto LAB_00b8ebdc;
    if ((param_2 & 0xffff) == 0x101) {
      *(byte *)(param_1 + 1) = (byte)param_1[1] | 1;
    }
    uVar4 = 0;
    bVar2 = true;
  }
  else {
    __dest = calloc(param_5,1);
    if (__dest != (void *)0x0) {
      memcpy(__dest,param_4,param_5);
      goto LAB_00b8eafc;
    }
    uVar4 = 0xffffff73;
LAB_00b8ebdc:
    psa_key_derivation_abort(param_1);
    bVar2 = false;
  }
  uVar5 = psa_unregister_read_under_mutex(local_478);
  free(__dest);
  if (!bVar2) {
    uVar5 = uVar4;
  }
  uVar6 = (ulong)uVar5;
LAB_00b8eab4:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return;
}

