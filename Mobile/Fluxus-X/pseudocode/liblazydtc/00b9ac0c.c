/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9ac0c
 */

int mbedtls_psa_key_agreement_ecdh
              (undefined2 *param_1,undefined8 param_2,undefined8 param_3,uint param_4,
              undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
              ulong *param_9)

{
  long lVar1;
  void *__ptr;
  undefined4 *__ptr_00;
  int iVar2;
  uint uVar3;
  long local_1c0;
  undefined1 auStack_1b8 [336];
  void *local_68;
  undefined4 *local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  if (((char)((ushort)*param_1 >> 8) != 'q') || ((param_4 & 0xffff0000 | 0x9000000) != 0x9020000)) {
    iVar2 = -0x87;
    goto LAB_00b9ada0;
  }
  local_60 = (undefined4 *)0x0;
  iVar2 = mbedtls_psa_ecp_load_representation(*param_1,param_1[1],param_2,param_3,&local_60);
  __ptr_00 = local_60;
  if (iVar2 != 0) goto LAB_00b9ada0;
  local_68 = (void *)0x0;
  local_1c0 = 0;
  uVar3 = mbedtls_ecc_group_to_psa(*local_60,&local_1c0);
  mbedtls_ecdh_init(auStack_1b8);
  iVar2 = mbedtls_psa_ecp_load_representation
                    (uVar3 & 0xff | 0x4100,local_1c0,param_5,param_6,&local_68);
  __ptr = local_68;
  if (iVar2 == 0) {
    mbedtls_ecdh_get_params(auStack_1b8,local_68,1);
    iVar2 = mbedtls_to_psa_error();
    if (iVar2 != 0) goto LAB_00b9ad64;
    mbedtls_ecdh_get_params(auStack_1b8,__ptr_00,0);
    iVar2 = mbedtls_to_psa_error();
    if (iVar2 != 0) goto LAB_00b9ad64;
    mbedtls_ecdh_calc_secret(auStack_1b8,param_9,param_7,param_8,mbedtls_psa_get_random,0);
    iVar2 = mbedtls_to_psa_error();
    if (iVar2 != 0) goto LAB_00b9ad64;
    if (local_1c0 + 7U >> 3 != *param_9) {
      iVar2 = -0x97;
      goto LAB_00b9ad64;
    }
  }
  else {
LAB_00b9ad64:
    mbedtls_platform_zeroize(param_7,param_8);
  }
  mbedtls_ecdh_free(auStack_1b8);
  mbedtls_ecp_keypair_free(__ptr);
  free(__ptr);
  mbedtls_ecp_keypair_free(__ptr_00);
  free(__ptr_00);
LAB_00b9ada0:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

