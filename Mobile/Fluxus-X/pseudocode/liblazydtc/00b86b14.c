/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b86b14
 */

ulong psa_import_key_into_slot
                (ushort *param_1,void *param_2,size_t param_3,void *param_4,undefined8 param_5,
                size_t *param_6,long *param_7)

{
  ushort uVar1;
  uint uVar2;
  ulong uVar3;
  
  if (param_3 != 0) {
    uVar1 = *param_1;
    if (((uVar1 & 0x7000) == 0x2000) || ((uVar1 & 0x7000) == 0x1000)) {
      *param_7 = param_3 << 3;
      uVar2 = psa_validate_unstructured_key_bit_size(uVar1);
      if (uVar2 == 0) {
        memcpy(param_4,param_2,param_3);
        *param_6 = param_3;
        return 0;
      }
      return (ulong)uVar2;
    }
    if ((uVar1 >> 0xe & 1) != 0) {
      if ((uVar1 & 0xcf00) == 0x4100) {
        uVar3 = mbedtls_psa_ecp_import_key(param_1,param_2,param_3,param_4,param_5,param_6);
        return uVar3;
      }
      if ((uVar1 & 0xcf00) == 0x4200) {
        uVar3 = param_3 * 8 - 0x800 >> 10;
        if (6 < (uVar3 | param_3 << 0x39)) {
          return 0xffffff7a;
        }
        if ((1L << (uVar3 & 0x3f) & 0x57U) == 0) {
          return 0xffffff7a;
        }
        uVar3 = mbedtls_psa_ffdh_import_key(param_1,param_2,param_3,param_4,param_5,param_6);
        return uVar3;
      }
      if ((uVar1 & 0xcfff) == 0x4001) {
        uVar3 = mbedtls_psa_rsa_import_key(param_1,param_2,param_3,param_4,param_5,param_6);
        return uVar3;
      }
    }
  }
  return 0xffffff7a;
}

