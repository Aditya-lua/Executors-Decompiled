/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8536c
 */

ulong mbedtls_asn1_write_raw_buffer(ulong *param_1,ulong param_2,void *param_3,ulong param_4)

{
  ulong uVar1;
  
  uVar1 = *param_1;
  if ((uVar1 < param_2) || (uVar1 - param_2 < param_4)) {
    param_4 = 0xffffff94;
  }
  else {
    *param_1 = uVar1 - param_4;
    memcpy((void *)(uVar1 - param_4),param_3,param_4);
  }
  return param_4 & 0xffffffff;
}

