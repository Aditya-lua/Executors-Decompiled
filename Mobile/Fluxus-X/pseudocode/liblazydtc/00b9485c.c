/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9485c
 */

void mbedtls_ecp_write_public_key
               (long param_1,undefined4 param_2,undefined8 param_3,undefined8 param_4,
               undefined8 param_5)

{
  mbedtls_ecp_point_write_binary(param_1,param_1 + 0xd0,param_2,param_3,param_4,param_5);
  return;
}

