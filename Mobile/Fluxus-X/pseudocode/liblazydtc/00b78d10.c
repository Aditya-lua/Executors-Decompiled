/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b78d10
 */

undefined8 mbedtls_md(undefined4 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  
  if (param_1 != (undefined4 *)0x0) {
    switch(*param_1) {
    case 3:
      uVar1 = mbedtls_md5(param_2,param_3,param_4);
      return uVar1;
    case 4:
      uVar1 = mbedtls_ripemd160(param_2,param_3,param_4);
      return uVar1;
    case 5:
      uVar1 = mbedtls_sha1(param_2,param_3,param_4);
      return uVar1;
    case 8:
      uVar1 = mbedtls_sha256(param_2,param_3,param_4,1);
      return uVar1;
    case 9:
      uVar1 = mbedtls_sha256(param_2,param_3,param_4,0);
      return uVar1;
    case 10:
      uVar1 = mbedtls_sha512(param_2,param_3,param_4,1);
      return uVar1;
    case 0xb:
      uVar1 = mbedtls_sha512(param_2,param_3,param_4,0);
      return uVar1;
    case 0x10:
      uVar1 = mbedtls_sha3(1,param_2,param_3,param_4,*(undefined1 *)(param_1 + 1));
      return uVar1;
    case 0x11:
      uVar1 = mbedtls_sha3(2,param_2,param_3,param_4,*(undefined1 *)(param_1 + 1));
      return uVar1;
    case 0x12:
      uVar1 = mbedtls_sha3(3,param_2,param_3,param_4,*(undefined1 *)(param_1 + 1));
      return uVar1;
    case 0x13:
      uVar1 = mbedtls_sha3(4,param_2,param_3,param_4,*(undefined1 *)(param_1 + 1));
      return uVar1;
    }
  }
  return 0xffffaf00;
}

