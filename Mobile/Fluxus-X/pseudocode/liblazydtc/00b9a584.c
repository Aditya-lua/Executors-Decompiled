/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9a584
 */

ulong mbedtls_psa_ecp_export_key
                (uint param_1,long param_2,void *param_3,size_t param_4,undefined8 param_5)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  ulong uVar4;
  
  if ((param_1 & 0x7000) != 0x4000) {
    mbedtls_ecp_write_key_ext(param_2,param_5,param_3,param_4);
    uVar4 = mbedtls_to_psa_error();
    return uVar4;
  }
  lVar1 = param_2 + 0xd0;
  iVar2 = mbedtls_ecp_is_zero(lVar1);
  if (iVar2 != 0) {
    mbedtls_ecp_mul(param_2,lVar1,param_2 + 0xc0,param_2 + 0x38,mbedtls_psa_get_random,0);
    uVar3 = mbedtls_to_psa_error();
    if (uVar3 != 0) {
      return (ulong)uVar3;
    }
  }
  mbedtls_ecp_point_write_binary(param_2,lVar1,0,param_5,param_3,param_4);
  uVar3 = mbedtls_to_psa_error();
  if (uVar3 != 0) {
    memset(param_3,0,param_4);
  }
  return (ulong)uVar3;
}

