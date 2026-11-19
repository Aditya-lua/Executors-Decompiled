/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b788ac
 */

void mbedtls_md_free(long *param_1)

{
  if ((param_1 == (long *)0x0) || ((undefined4 *)*param_1 == (undefined4 *)0x0)) {
    return;
  }
  if (param_1[1] != 0) {
    switch(*(undefined4 *)*param_1) {
    case 3:
      mbedtls_md5_free();
      break;
    case 4:
      mbedtls_ripemd160_free();
      break;
    case 5:
      mbedtls_sha1_free();
      break;
    case 8:
    case 9:
      mbedtls_sha256_free();
      break;
    case 10:
    case 0xb:
      mbedtls_sha512_free();
      break;
    case 0x10:
    case 0x11:
    case 0x12:
    case 0x13:
      mbedtls_sha3_free();
    }
    free((void *)param_1[1]);
  }
  if (param_1[2] != 0) {
    mbedtls_zeroize_and_free(param_1[2],(ulong)*(byte *)(*param_1 + 5) << 1);
  }
  mbedtls_platform_zeroize(param_1,0x18);
  return;
}

