/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b78960
 */

undefined8 mbedtls_md_clone(undefined8 *param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  undefined4 *puVar2;
  
  if (param_1 == (undefined8 *)0x0) {
    return 0xffffaf00;
  }
  uVar1 = 0xffffaf00;
  if ((param_2 != (undefined8 *)0x0) &&
     (puVar2 = (undefined4 *)*param_1, puVar2 != (undefined4 *)0x0)) {
    uVar1 = 0xffffaf00;
    if (((undefined4 *)*param_2 != (undefined4 *)0x0) && (puVar2 == (undefined4 *)*param_2)) {
      uVar1 = 0xffffaf00;
      switch(*puVar2) {
      case 3:
        mbedtls_md5_clone(param_1[1],param_2[1]);
        break;
      case 4:
        mbedtls_ripemd160_clone(param_1[1],param_2[1]);
        break;
      case 5:
        mbedtls_sha1_clone(param_1[1],param_2[1]);
        break;
      default:
        goto switchD_00b789b8_caseD_6;
      case 8:
      case 9:
        mbedtls_sha256_clone(param_1[1],param_2[1]);
        break;
      case 10:
      case 0xb:
        mbedtls_sha512_clone(param_1[1],param_2[1]);
        break;
      case 0x10:
      case 0x11:
      case 0x12:
      case 0x13:
        mbedtls_sha3_clone(param_1[1],param_2[1]);
      }
      uVar1 = 0;
    }
  }
switchD_00b789b8_caseD_6:
  return uVar1;
}

