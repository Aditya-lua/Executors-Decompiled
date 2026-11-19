/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b943d8
 */

undefined8
mbedtls_ecp_gen_keypair
          (long param_1,undefined8 param_2,undefined8 param_3,long param_4,undefined8 param_5)

{
  undefined8 uVar1;
  
  uVar1 = mbedtls_ecp_gen_privkey(param_1,param_2,param_4,param_5);
  if ((int)uVar1 == 0) {
    if (param_4 != 0) {
      uVar1 = FUN_00b923c4(param_1,param_3,param_2,param_1 + 0x38,param_4,param_5);
      return uVar1;
    }
    uVar1 = 0xffffb080;
  }
  return uVar1;
}

