/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9d978
 */

undefined8 mbedtls_psa_hash_update(undefined4 *param_1)

{
  undefined8 uVar1;
  
  switch(*param_1) {
  case 0x2000003:
    mbedtls_md5_update(param_1 + 2);
    uVar1 = mbedtls_to_psa_error();
    return uVar1;
  case 0x2000004:
    mbedtls_ripemd160_update(param_1 + 2);
    uVar1 = mbedtls_to_psa_error();
    return uVar1;
  case 0x2000005:
    mbedtls_sha1_update(param_1 + 2);
    uVar1 = mbedtls_to_psa_error();
    return uVar1;
  default:
    return 0xffffff77;
  case 0x2000008:
  case 0x2000009:
    mbedtls_sha256_update(param_1 + 2);
    uVar1 = mbedtls_to_psa_error();
    return uVar1;
  case 0x200000a:
  case 0x200000b:
    mbedtls_sha512_update(param_1 + 2);
    uVar1 = mbedtls_to_psa_error();
    return uVar1;
  case 0x2000010:
  case 0x2000011:
  case 0x2000012:
  case 0x2000013:
    mbedtls_sha3_update(param_1 + 2);
    uVar1 = mbedtls_to_psa_error();
    return uVar1;
  }
}

