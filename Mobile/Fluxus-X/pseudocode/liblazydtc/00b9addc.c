/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9addc
 */

void mbedtls_ecdh_gen_public
               (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5)

{
  int iVar1;
  
  iVar1 = mbedtls_ecp_gen_privkey(param_1,param_2,param_4,param_5);
  if (iVar1 == 0) {
    mbedtls_ecp_mul_restartable(param_1,param_3,param_2,param_1 + 0x38,param_4,param_5,0);
    return;
  }
  return;
}

