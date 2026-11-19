/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b78b8c
 */

undefined8 mbedtls_md_starts(undefined8 *param_1)

{
  undefined8 uVar1;
  
  if ((param_1 != (undefined8 *)0x0) && ((undefined4 *)*param_1 != (undefined4 *)0x0)) {
    switch(*(undefined4 *)*param_1) {
    case 3:
      uVar1 = mbedtls_md5_starts(param_1[1]);
      return uVar1;
    case 4:
      uVar1 = mbedtls_ripemd160_starts(param_1[1]);
      return uVar1;
    case 5:
      uVar1 = mbedtls_sha1_starts(param_1[1]);
      return uVar1;
    case 8:
      uVar1 = mbedtls_sha256_starts(param_1[1],1);
      return uVar1;
    case 9:
      uVar1 = mbedtls_sha256_starts(param_1[1],0);
      return uVar1;
    case 10:
      uVar1 = mbedtls_sha512_starts(param_1[1],1);
      return uVar1;
    case 0xb:
      uVar1 = mbedtls_sha512_starts(param_1[1],0);
      return uVar1;
    case 0x10:
      uVar1 = mbedtls_sha3_starts(param_1[1],1);
      return uVar1;
    case 0x11:
      uVar1 = mbedtls_sha3_starts(param_1[1],2);
      return uVar1;
    case 0x12:
      uVar1 = mbedtls_sha3_starts(param_1[1],3);
      return uVar1;
    case 0x13:
      uVar1 = mbedtls_sha3_starts(param_1[1],4);
      return uVar1;
    }
  }
  return 0xffffaf00;
}

