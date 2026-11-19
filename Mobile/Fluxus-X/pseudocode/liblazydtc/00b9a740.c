/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9a740
 */

undefined4
mbedtls_psa_ecp_generate_key
          (ushort *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  ushort uVar1;
  long lVar2;
  int iVar3;
  undefined4 uVar4;
  long lVar5;
  undefined1 auStack_158 [256];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  uVar1 = *param_1;
  if ((uVar1 & 0xcf00) != 0x4100) {
    uVar1 = 0;
  }
  iVar3 = mbedtls_ecc_group_from_psa(uVar1,param_1[1]);
  lVar5 = mbedtls_ecp_curve_info_from_grp_id();
  uVar4 = 0xffffff7a;
  if ((iVar3 != 0) && (lVar5 != 0)) {
    mbedtls_ecp_keypair_init(auStack_158);
    iVar3 = mbedtls_ecp_gen_key(iVar3,auStack_158,mbedtls_psa_get_random,0);
    if (iVar3 == 0) {
      mbedtls_ecp_write_key_ext(auStack_158,param_4,param_2,param_3);
      uVar4 = mbedtls_to_psa_error();
      mbedtls_ecp_keypair_free(auStack_158);
    }
    else {
      mbedtls_ecp_keypair_free(auStack_158);
      uVar4 = mbedtls_to_psa_error(iVar3);
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar4;
}

