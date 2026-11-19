/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9da18
 */

undefined8 mbedtls_psa_hash_finish(uint *param_1,void *param_2,size_t param_3,ulong *param_4)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  ulong uVar4;
  
  uVar1 = *param_1 - 3;
  if (((uVar1 & 0xff) < 0x10) && ((0xe7e7U >> (ulong)(uVar1 & 0x1f) & 1) != 0)) {
    uVar4 = *(ulong *)(&DAT_00787680 + (long)(char)uVar1 * 8);
    *param_4 = param_3;
  }
  else {
    uVar4 = (ulong)((*param_1 & 0xff | 0x2000000) == 0x2000013) << 6;
    *param_4 = param_3;
  }
  if (param_3 != 0) {
    memset(param_2,0x21,param_3);
  }
  if (param_3 < uVar4) {
    return 0xffffff76;
  }
  uVar3 = 0xffffff77;
  switch(*param_1) {
  case 0x2000003:
    mbedtls_md5_finish(param_1 + 2,param_2);
    uVar3 = mbedtls_to_psa_error();
    iVar2 = (int)uVar3;
    goto joined_r0x00b9db78;
  case 0x2000004:
    mbedtls_ripemd160_finish(param_1 + 2,param_2);
    uVar3 = mbedtls_to_psa_error();
    iVar2 = (int)uVar3;
joined_r0x00b9db78:
    if (iVar2 != 0) {
      return uVar3;
    }
    goto LAB_00b9daec;
  case 0x2000005:
    mbedtls_sha1_finish(param_1 + 2,param_2);
    uVar3 = mbedtls_to_psa_error();
    iVar2 = (int)uVar3;
    break;
  default:
    goto switchD_00b9dad0_caseD_2000006;
  case 0x2000008:
  case 0x2000009:
    mbedtls_sha256_finish(param_1 + 2,param_2);
    uVar3 = mbedtls_to_psa_error();
    iVar2 = (int)uVar3;
    break;
  case 0x200000a:
  case 0x200000b:
    mbedtls_sha512_finish(param_1 + 2,param_2);
    uVar3 = mbedtls_to_psa_error();
    iVar2 = (int)uVar3;
    break;
  case 0x2000010:
  case 0x2000011:
  case 0x2000012:
  case 0x2000013:
    mbedtls_sha3_finish(param_1 + 2,param_2,param_3);
    uVar3 = mbedtls_to_psa_error();
    iVar2 = (int)uVar3;
  }
  if (iVar2 == 0) {
LAB_00b9daec:
    *param_4 = uVar4;
  }
switchD_00b9dad0_caseD_2000006:
  return uVar3;
}

