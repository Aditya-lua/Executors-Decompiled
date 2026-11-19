/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9c0fc
 */

void mbedtls_ecdsa_genkey(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  
  iVar1 = mbedtls_ecp_group_load();
  if (iVar1 == 0) {
    mbedtls_ecp_gen_keypair(param_1,param_1 + 0xc0,param_1 + 0xd0,param_3,param_4);
    return;
  }
  return;
}

