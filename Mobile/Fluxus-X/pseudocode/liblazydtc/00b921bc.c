/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b921bc
 */

undefined8
mbedtls_ecp_tls_read_point(undefined8 param_1,undefined8 param_2,long *param_3,ulong param_4)

{
  byte *pbVar1;
  undefined8 uVar2;
  ulong uVar3;
  byte *pbVar4;
  
  if (1 < param_4) {
    pbVar4 = (byte *)*param_3;
    pbVar1 = pbVar4 + 1;
    *param_3 = (long)pbVar1;
    uVar3 = (ulong)*pbVar4;
    if ((uVar3 != 0) && (uVar3 <= param_4 - 1)) {
      *param_3 = (long)(pbVar1 + uVar3);
      uVar2 = mbedtls_ecp_point_read_binary(param_1,param_2,pbVar1);
      return uVar2;
    }
  }
  return 0xffffb080;
}

