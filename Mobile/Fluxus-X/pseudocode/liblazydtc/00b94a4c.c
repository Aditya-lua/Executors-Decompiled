/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b94a4c
 */

undefined8 mbedtls_ecp_keypair_calc_public(long param_1,long param_2,undefined8 param_3)

{
  undefined8 uVar1;
  
  if (param_2 == 0) {
    return 0xffffb080;
  }
  uVar1 = FUN_00b923c4(param_1,param_1 + 0xd0,param_1 + 0xc0,param_1 + 0x38,param_2,param_3);
  return uVar1;
}

