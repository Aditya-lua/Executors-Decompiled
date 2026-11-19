/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8cf8c
 */

undefined4 psa_key_derivation_abort(uint *param_1)

{
  uint uVar1;
  uint uVar2;
  undefined4 uVar3;
  
  uVar2 = *param_1;
  uVar1 = uVar2 & 0xfe00ffff | 0x8000000;
  if ((uVar2 & 0x7f000000) != 0x9000000) {
    uVar1 = uVar2;
  }
  if (uVar1 != 0) {
    uVar2 = uVar1 + 0xf7ffff00 >> 8;
    if (uVar2 < 5) {
      if ((1 << (ulong)(uVar2 & 0x1f) & 0x19U) != 0) {
        free(*(void **)(param_1 + 4));
        uVar3 = 0;
        if (param_1[0x2a] != 0) {
          if (param_1[0x2a] == 1) {
            uVar3 = mbedtls_psa_mac_abort(param_1 + 0x2c);
          }
          else {
            uVar3 = 0xffffff79;
          }
          *(undefined1 *)(param_1 + 0x2b) = 0;
          param_1[0x2a] = 0;
          *(byte *)((long)param_1 + 0xad) = *(byte *)((long)param_1 + 0xad) & 0xfe;
        }
        goto LAB_00b8d090;
      }
      if (*(long *)(param_1 + 6) != 0) {
        mbedtls_zeroize_and_free(*(long *)(param_1 + 6),*(undefined8 *)(param_1 + 8));
      }
      if (*(long *)(param_1 + 10) != 0) {
        mbedtls_zeroize_and_free(*(long *)(param_1 + 10),*(undefined8 *)(param_1 + 0xc));
      }
      if (*(long *)(param_1 + 0xe) != 0) {
        mbedtls_zeroize_and_free(*(long *)(param_1 + 0xe),*(undefined8 *)(param_1 + 0x10));
      }
      if (*(long *)(param_1 + 0x12) != 0) {
        mbedtls_zeroize_and_free(*(long *)(param_1 + 0x12),*(undefined8 *)(param_1 + 0x14));
      }
    }
    else {
      if (uVar1 != 0x8000609) {
        uVar3 = 0xffffff77;
        goto LAB_00b8d090;
      }
      mbedtls_platform_zeroize(param_1 + 4,0x20);
    }
  }
  uVar3 = 0;
LAB_00b8d090:
  mbedtls_platform_zeroize(param_1,0x238);
  return uVar3;
}

