/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9d648
 */

undefined8 mbedtls_psa_hash_abort(int *param_1)

{
  undefined8 uVar1;
  
  uVar1 = 0xffffff77;
  switch(*param_1) {
  case 0x2000003:
    mbedtls_md5_free(param_1 + 2);
    break;
  case 0x2000004:
    mbedtls_ripemd160_free(param_1 + 2);
    break;
  case 0x2000005:
    mbedtls_sha1_free(param_1 + 2);
    break;
  case 0x2000006:
  case 0x2000007:
  case 0x200000c:
  case 0x200000d:
  case 0x200000e:
  case 0x200000f:
    goto switchD_00b9d684_caseD_2000006;
  case 0x2000008:
  case 0x2000009:
    mbedtls_sha256_free(param_1 + 2);
    break;
  case 0x200000a:
  case 0x200000b:
    mbedtls_sha512_free(param_1 + 2);
    break;
  case 0x2000010:
  case 0x2000011:
  case 0x2000012:
  case 0x2000013:
    mbedtls_sha3_free(param_1 + 2);
    break;
  default:
    if (*param_1 != 0) {
      return 0xffffff77;
    }
  }
  uVar1 = 0;
  *param_1 = 0;
switchD_00b9d684_caseD_2000006:
  return uVar1;
}

