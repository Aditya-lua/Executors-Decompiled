/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba8628
 */

undefined8
mbedtls_rsa_pkcs1_sign
          (long param_1,undefined8 param_2,undefined8 param_3,int param_4,int param_5,long param_6)

{
  undefined8 uVar1;
  
  if ((param_5 == 0 && param_4 == 0) || (param_6 != 0)) {
    if (*(int *)(param_1 + 0xe0) != 1) {
      if (*(int *)(param_1 + 0xe0) == 0) {
        uVar1 = mbedtls_rsa_rsassa_pkcs1_v15_sign();
        return uVar1;
      }
      return 0xffffbf00;
    }
    if (*(int *)(param_1 + 0xe4) != 0 || param_4 != 0) {
      uVar1 = FUN_00ba8060();
      return uVar1;
    }
  }
  return 0xffffbf80;
}

