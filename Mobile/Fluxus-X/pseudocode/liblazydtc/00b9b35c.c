/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9b35c
 */

undefined8
mbedtls_ecdh_make_public
          (undefined1 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
          undefined8 param_5,undefined8 param_6)

{
  undefined1 *puVar1;
  undefined1 uVar2;
  undefined8 uVar3;
  
  if ((*(int *)(param_1 + 8) == 1) && (*(long *)(param_1 + 0x88) != 0)) {
    uVar2 = *param_1;
    puVar1 = param_1 + 0x10;
    uVar3 = mbedtls_ecp_gen_privkey(puVar1,param_1 + 0xd0,param_5,param_6);
    if ((int)uVar3 == 0) {
      uVar3 = mbedtls_ecp_mul_restartable
                        (puVar1,param_1 + 0xe0,param_1 + 0xd0,param_1 + 0x48,param_5,param_6,0);
      if ((int)uVar3 == 0) {
        uVar3 = mbedtls_ecp_tls_write_point(puVar1,param_1 + 0xe0,uVar2,param_2,param_3,param_4);
        return uVar3;
      }
    }
  }
  else {
    uVar3 = 0xffffb080;
  }
  return uVar3;
}

