/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9e45c
 */

int mbedtls_psa_mac_compute
              (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
              undefined8 param_5,long param_6,undefined8 param_7,undefined8 param_8,
              undefined8 *param_9)

{
  long lVar1;
  int iVar2;
  uint local_1f8 [2];
  undefined1 auStack_1f0 [8];
  undefined1 auStack_1e8 [232];
  undefined1 auStack_100 [144];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  memset(local_1f8,0,0x188);
  iVar2 = FUN_00b9dd04(local_1f8,param_1,param_2,param_3,param_4);
  if (iVar2 != 0) goto joined_r0x00b9e5e0;
  if (param_6 != 0) {
    if (local_1f8[0] == 0) {
LAB_00b9e5e8:
      iVar2 = -0x89;
      goto joined_r0x00b9e5e0;
    }
    if ((local_1f8[0] & 0xffc07fff) == 0x3c00200) {
      mbedtls_cipher_cmac_update(auStack_1f0,param_5,param_6);
      iVar2 = mbedtls_to_psa_error();
    }
    else {
      if ((local_1f8[0] & 0x7fc00000) != 0x3800000) goto LAB_00b9e5e8;
      iVar2 = psa_hash_update(auStack_1e8,param_5,param_6);
    }
    if (iVar2 != 0) goto joined_r0x00b9e5e0;
  }
  iVar2 = FUN_00b9e1e0(local_1f8,param_7,param_8);
  if (iVar2 == 0) {
    *param_9 = param_8;
  }
joined_r0x00b9e5e0:
  if (local_1f8[0] != 0) {
    if ((local_1f8[0] & 0xffc07fff) == 0x3c00200) {
      mbedtls_cipher_free(auStack_1f0);
      local_1f8[0] = 0;
    }
    else if ((local_1f8[0] & 0x7fc00000) == 0x3800000) {
      mbedtls_platform_zeroize(auStack_100,0x90);
      psa_hash_abort(auStack_1e8);
      local_1f8[0] = 0;
    }
    else {
      memset(local_1f8,0,0x188);
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

