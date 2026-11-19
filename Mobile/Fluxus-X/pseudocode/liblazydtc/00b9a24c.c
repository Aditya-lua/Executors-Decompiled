/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9a24c
 */

int mbedtls_psa_ecp_load_representation
              (uint param_1,long param_2,undefined8 param_3,ulong param_4,undefined8 *param_5)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  int iVar4;
  undefined4 *__ptr;
  
  uVar1 = param_1 & 0x7000;
  uVar3 = param_4;
  if ((uVar1 == 0x4000) && (((param_1 & 0xff) != 0x41 || ((param_1 & 0xcf00) != 0x4100)))) {
    if ((param_4 & 1) == 0) {
      return -0x87;
    }
    uVar3 = param_4 >> 1;
  }
  if (param_2 == 0) {
    param_2 = uVar3 << 3;
  }
  else if (uVar3 != param_2 + 7U >> 3) {
    return -0x87;
  }
  __ptr = calloc(1,0x100);
  if (__ptr == (undefined4 *)0x0) {
    return -0x8d;
  }
  mbedtls_ecp_keypair_init(__ptr);
  if ((param_1 & 0xcf00) != 0x4100) {
    param_1 = 0;
  }
  uVar2 = param_1 & 0xff;
  iVar4 = -0x87;
  if (uVar2 < 0x30) {
    if (uVar2 == 0x12) {
      iVar4 = -0x87;
      if (param_2 < 0x180) {
        if (((param_2 != 0xc0) && (param_2 != 0xe0)) && (param_2 != 0x100)) goto LAB_00b9a464;
      }
      else if ((param_2 != 0x180) && (param_2 != 0x209)) {
        if (param_2 != 0x210) goto LAB_00b9a464;
        param_2 = 0x209;
      }
    }
    else {
      if (uVar2 != 0x17) goto LAB_00b9a464;
      if ((param_2 != 0x100) && (param_2 != 0xc0)) goto LAB_00b9a3b8;
    }
  }
  else if (uVar2 == 0x30) {
    if (((param_2 != 0x100) && (param_2 != 0x180)) && (param_2 != 0x200)) {
LAB_00b9a3b8:
      iVar4 = -0x87;
      goto LAB_00b9a464;
    }
  }
  else {
    if (uVar2 != 0x41) goto LAB_00b9a464;
    if ((param_2 != 0xff) && (param_2 != 0x1c0)) {
      if (param_2 != 0x100) goto LAB_00b9a3b8;
      param_2 = 0xff;
    }
  }
  iVar4 = mbedtls_ecc_group_from_psa(param_1,param_2);
  if (iVar4 == 0) {
    iVar4 = -0x86;
  }
  else {
    mbedtls_ecp_group_load(__ptr,iVar4);
    iVar4 = mbedtls_to_psa_error();
    if (iVar4 == 0) {
      if (uVar1 == 0x4000) {
        mbedtls_ecp_point_read_binary(__ptr,__ptr + 0x34,param_3,param_4);
        iVar4 = mbedtls_to_psa_error();
        if (iVar4 != 0) goto LAB_00b9a464;
        mbedtls_ecp_check_pubkey(__ptr,__ptr + 0x34);
      }
      else {
        mbedtls_ecp_read_key(*__ptr,__ptr,param_3,param_4);
      }
      iVar4 = mbedtls_to_psa_error();
      if (iVar4 == 0) {
        *param_5 = __ptr;
        return 0;
      }
    }
  }
LAB_00b9a464:
  mbedtls_ecp_keypair_free(__ptr);
  free(__ptr);
  return iVar4;
}

