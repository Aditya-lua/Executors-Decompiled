/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9d8b0
 */

undefined8 mbedtls_psa_hash_clone(int *param_1,int *param_2)

{
  switch(*param_1) {
  case 0x2000003:
    mbedtls_md5_clone(param_2 + 2,param_1 + 2);
    break;
  case 0x2000004:
    mbedtls_ripemd160_clone(param_2 + 2,param_1 + 2);
    break;
  case 0x2000005:
    mbedtls_sha1_clone(param_2 + 2,param_1 + 2);
    break;
  case 0x2000006:
  case 0x2000007:
  case 0x200000c:
  case 0x200000d:
  case 0x200000e:
  case 0x200000f:
    return 0xffffff7a;
  case 0x2000008:
  case 0x2000009:
    mbedtls_sha256_clone(param_2 + 2,param_1 + 2);
    break;
  case 0x200000a:
  case 0x200000b:
    mbedtls_sha512_clone(param_2 + 2,param_1 + 2);
    break;
  case 0x2000010:
  case 0x2000011:
  case 0x2000012:
  case 0x2000013:
    mbedtls_sha3_clone(param_2 + 2,param_1 + 2);
    break;
  default:
    if (*param_1 == 0) {
      return 0xffffff77;
    }
    return 0xffffff7a;
  }
  *param_2 = *param_1;
  return 0;
}

