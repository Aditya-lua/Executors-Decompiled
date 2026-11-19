/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9445c
 */

undefined8 mbedtls_ecp_gen_key(undefined4 param_1,long param_2,long param_3,undefined8 param_4)

{
  undefined8 uVar1;
  
  uVar1 = mbedtls_ecp_group_load(param_2,param_1);
  if ((int)uVar1 == 0) {
    uVar1 = mbedtls_ecp_gen_privkey(param_2,param_2 + 0xc0,param_3,param_4);
    if ((int)uVar1 == 0) {
      if (param_3 != 0) {
        uVar1 = FUN_00b923c4(param_2,param_2 + 0xd0,param_2 + 0xc0,param_2 + 0x38,param_3,param_4);
        return uVar1;
      }
      uVar1 = 0xffffb080;
    }
  }
  return uVar1;
}

