/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba82c0
 */

undefined8
mbedtls_rsa_rsassa_pss_sign(long param_1,undefined8 param_2,undefined8 param_3,int param_4)

{
  undefined8 uVar1;
  
  if ((*(int *)(param_1 + 0xe0) == 1) && (*(int *)(param_1 + 0xe4) != 0 || param_4 != 0)) {
    uVar1 = FUN_00ba8060();
    return uVar1;
  }
  return 0xffffbf80;
}

