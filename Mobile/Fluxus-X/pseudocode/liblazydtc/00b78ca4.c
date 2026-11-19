/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b78ca4
 */

undefined8 mbedtls_md_finish(undefined8 *param_1,undefined8 param_2)

{
  undefined8 uVar1;
  undefined4 *puVar2;
  
  if ((param_1 != (undefined8 *)0x0) &&
     (puVar2 = (undefined4 *)*param_1, puVar2 != (undefined4 *)0x0)) {
    switch(*puVar2) {
    case 3:
      uVar1 = mbedtls_md5_finish(param_1[1]);
      return uVar1;
    case 4:
      uVar1 = mbedtls_ripemd160_finish(param_1[1]);
      return uVar1;
    case 5:
      uVar1 = mbedtls_sha1_finish(param_1[1]);
      return uVar1;
    case 8:
    case 9:
      uVar1 = mbedtls_sha256_finish(param_1[1]);
      return uVar1;
    case 10:
    case 0xb:
      uVar1 = mbedtls_sha512_finish(param_1[1]);
      return uVar1;
    case 0x10:
    case 0x11:
    case 0x12:
    case 0x13:
      uVar1 = mbedtls_sha3_finish(param_1[1],param_2,*(undefined1 *)(puVar2 + 1));
      return uVar1;
    }
  }
  return 0xffffaf00;
}

