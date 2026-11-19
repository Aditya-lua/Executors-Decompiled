/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b92200
 */

undefined8
mbedtls_ecp_tls_write_point
          (undefined8 param_1,undefined8 param_2,uint param_3,long *param_4,undefined1 *param_5,
          long param_6)

{
  undefined8 uVar1;
  
  uVar1 = 0xffffb080;
  if (((param_3 < 2) && (param_6 != 0)) &&
     (uVar1 = mbedtls_ecp_point_write_binary
                        (param_1,param_2,param_3,param_4,param_5 + 1,param_6 + -1), (int)uVar1 == 0)
     ) {
    *param_5 = (char)*param_4;
    *param_4 = *param_4 + 1;
  }
  return uVar1;
}

