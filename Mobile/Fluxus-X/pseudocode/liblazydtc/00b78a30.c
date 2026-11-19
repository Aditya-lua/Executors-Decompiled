/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b78a30
 */

undefined8 mbedtls_md_setup(undefined8 *param_1,undefined4 *param_2,int param_3)

{
  undefined8 uVar1;
  void *pvVar2;
  undefined8 *puVar3;
  
  if (param_1 == (undefined8 *)0x0) {
    return 0xffffaf00;
  }
  if (param_2 == (undefined4 *)0x0) {
    return 0xffffaf00;
  }
  *param_1 = param_2;
  puVar3 = param_1 + 1;
  *puVar3 = 0;
  param_1[2] = 0;
  uVar1 = 0xffffaf00;
  switch(*param_2) {
  case 3:
    pvVar2 = calloc(1,0x58);
    *puVar3 = pvVar2;
    if (pvVar2 != (void *)0x0) {
      mbedtls_md5_init();
joined_r0x00b78b10:
      if (param_3 == 0) {
        return 0;
      }
      pvVar2 = calloc(2,(ulong)*(byte *)((long)param_2 + 5));
      param_1[2] = pvVar2;
      if (pvVar2 != (void *)0x0) {
        return 0;
      }
      mbedtls_md_free(param_1);
    }
    break;
  case 4:
    pvVar2 = calloc(1,0x5c);
    *puVar3 = pvVar2;
    if (pvVar2 != (void *)0x0) {
      mbedtls_ripemd160_init();
      goto joined_r0x00b78b10;
    }
    break;
  case 5:
    pvVar2 = calloc(1,0x5c);
    *puVar3 = pvVar2;
    if (pvVar2 != (void *)0x0) {
      mbedtls_sha1_init();
      goto joined_r0x00b78b10;
    }
    break;
  default:
    goto switchD_00b78a8c_caseD_6;
  case 8:
  case 9:
    pvVar2 = calloc(1,0x6c);
    *puVar3 = pvVar2;
    if (pvVar2 != (void *)0x0) {
      mbedtls_sha256_init();
      goto joined_r0x00b78b10;
    }
    break;
  case 10:
  case 0xb:
    pvVar2 = calloc(1,0xd8);
    *puVar3 = pvVar2;
    if (pvVar2 != (void *)0x0) {
      mbedtls_sha512_init();
      goto joined_r0x00b78b10;
    }
    break;
  case 0x10:
  case 0x11:
  case 0x12:
  case 0x13:
    pvVar2 = calloc(1,0xd0);
    *puVar3 = pvVar2;
    if (pvVar2 != (void *)0x0) {
      mbedtls_sha3_init();
      goto joined_r0x00b78b10;
    }
  }
  uVar1 = 0xffffae80;
switchD_00b78a8c_caseD_6:
  return uVar1;
}

