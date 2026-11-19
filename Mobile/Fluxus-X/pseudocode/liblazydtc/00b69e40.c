/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b69e40
 */

undefined8 mbedtls_cipher_update_ad(long *param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  undefined8 uVar2;
  
  if (*param_1 == 0) {
    uVar2 = 0xffff9f00;
  }
  else {
    uVar1 = *(uint *)(*param_1 + 8);
    if ((uVar1 & 0xf000) == 0x6000) {
      uVar2 = mbedtls_gcm_update_ad(param_1[10],param_2,param_3);
      return uVar2;
    }
    if ((uVar1 & 0xff0000) == 0x4d0000) {
      uVar2 = mbedtls_chachapoly_starts(param_1[10],param_1 + 7,*(int *)((long)param_1 + 0xc) != 1);
      if ((int)uVar2 == 0) {
        uVar2 = mbedtls_chachapoly_update_aad(param_1[10],param_2,param_3);
        return uVar2;
      }
    }
    else {
      uVar2 = 0xffff9f80;
    }
  }
  return uVar2;
}

