/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9434c
 */

undefined8
mbedtls_ecp_gen_keypair_base
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,long param_5,
          undefined8 param_6)

{
  undefined8 uVar1;
  
  uVar1 = mbedtls_ecp_gen_privkey(param_1,param_3,param_5,param_6);
  if ((int)uVar1 == 0) {
    if (param_5 != 0) {
      uVar1 = FUN_00b923c4(param_1,param_4,param_3,param_2,param_5,param_6);
      return uVar1;
    }
    uVar1 = 0xffffb080;
  }
  return uVar1;
}

