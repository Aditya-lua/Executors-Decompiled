/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b98540
 */

undefined8
mbedtls_psa_aead_finish
          (int *param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4,undefined8 param_5
          ,ulong param_6,ulong *param_7)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  
  uVar3 = (ulong)*(byte *)((long)param_1 + 7);
  if (param_6 < uVar3) {
LAB_00b98568:
    uVar2 = 0xffffff76;
  }
  else {
    iVar1 = *param_1;
    if (iVar1 == 0x5100500) {
      if (param_6 < 0x10) goto LAB_00b98568;
      mbedtls_chachapoly_finish(param_1 + 2,param_5);
      uVar2 = mbedtls_to_psa_error();
      iVar1 = (int)uVar2;
    }
    else if (iVar1 == 0x5500100) {
      mbedtls_ccm_finish(param_1 + 2,param_5,uVar3);
      uVar2 = mbedtls_to_psa_error();
      iVar1 = (int)uVar2;
    }
    else {
      if (iVar1 != 0x5500200) {
        return 0xffffff7a;
      }
      mbedtls_gcm_finish(param_1 + 2,param_2,param_3,param_4,param_5,uVar3);
      uVar2 = mbedtls_to_psa_error();
      iVar1 = (int)uVar2;
    }
    if (iVar1 == 0) {
      *param_4 = 0;
      *param_7 = (ulong)*(byte *)((long)param_1 + 7);
    }
  }
  return uVar2;
}

