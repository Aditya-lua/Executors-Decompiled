/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9d6e8
 */

ulong mbedtls_psa_hash_setup(uint *param_1,uint param_2)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  uint uVar4;
  
  if (*param_1 != 0) {
    return 0xffffff77;
  }
  switch(param_2) {
  case 0x2000003:
    mbedtls_md5_init(param_1 + 2);
    iVar1 = mbedtls_md5_starts(param_1 + 2);
    goto joined_r0x00b9d77c;
  case 0x2000004:
    mbedtls_ripemd160_init(param_1 + 2);
    iVar1 = mbedtls_ripemd160_starts(param_1 + 2);
    goto joined_r0x00b9d77c;
  case 0x2000005:
    mbedtls_sha1_init(param_1 + 2);
    iVar1 = mbedtls_sha1_starts(param_1 + 2);
    goto joined_r0x00b9d890;
  default:
    uVar4 = 0xffffff79;
    if ((param_2 & 0x7f000000) == 0x2000000) {
      uVar4 = 0xffffff7a;
    }
    return (ulong)uVar4;
  case 0x2000008:
    mbedtls_sha256_init(param_1 + 2);
    uVar3 = 1;
    goto LAB_00b9d7e8;
  case 0x2000009:
    mbedtls_sha256_init(param_1 + 2);
    uVar3 = 0;
LAB_00b9d7e8:
    iVar1 = mbedtls_sha256_starts(param_1 + 2,uVar3);
joined_r0x00b9d77c:
    if (iVar1 != 0) goto LAB_00b9d894;
    goto LAB_00b9d830;
  case 0x200000a:
    mbedtls_sha512_init(param_1 + 2);
    uVar3 = 1;
    goto LAB_00b9d824;
  case 0x200000b:
    mbedtls_sha512_init(param_1 + 2);
    uVar3 = 0;
LAB_00b9d824:
    iVar1 = mbedtls_sha512_starts(param_1 + 2,uVar3);
    goto joined_r0x00b9d890;
  case 0x2000010:
    mbedtls_sha3_init(param_1 + 2);
    uVar3 = 1;
    break;
  case 0x2000011:
    mbedtls_sha3_init(param_1 + 2);
    uVar3 = 2;
    break;
  case 0x2000012:
    mbedtls_sha3_init(param_1 + 2);
    uVar3 = 3;
    break;
  case 0x2000013:
    mbedtls_sha3_init(param_1 + 2);
    uVar3 = 4;
  }
  iVar1 = mbedtls_sha3_starts(param_1 + 2,uVar3);
joined_r0x00b9d890:
  if (iVar1 == 0) {
LAB_00b9d830:
    *param_1 = param_2;
  }
  else {
LAB_00b9d894:
    mbedtls_psa_hash_abort(param_1);
  }
  uVar2 = mbedtls_to_psa_error(iVar1);
  return uVar2;
}

