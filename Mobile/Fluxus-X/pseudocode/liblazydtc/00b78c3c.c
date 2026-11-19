/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b78c3c
 */

undefined8 mbedtls_md_update(undefined8 *param_1)

{
  undefined8 uVar1;
  
  if ((param_1 != (undefined8 *)0x0) && ((undefined4 *)*param_1 != (undefined4 *)0x0)) {
    switch(*(undefined4 *)*param_1) {
    case 3:
      uVar1 = mbedtls_md5_update(param_1[1]);
      return uVar1;
    case 4:
      uVar1 = mbedtls_ripemd160_update(param_1[1]);
      return uVar1;
    case 5:
      uVar1 = mbedtls_sha1_update(param_1[1]);
      return uVar1;
    case 8:
    case 9:
      uVar1 = mbedtls_sha256_update(param_1[1]);
      return uVar1;
    case 10:
    case 0xb:
      uVar1 = mbedtls_sha512_update(param_1[1]);
      return uVar1;
    case 0x10:
    case 0x11:
    case 0x12:
    case 0x13:
      uVar1 = mbedtls_sha3_update(param_1[1]);
      return uVar1;
    }
  }
  return 0xffffaf00;
}

