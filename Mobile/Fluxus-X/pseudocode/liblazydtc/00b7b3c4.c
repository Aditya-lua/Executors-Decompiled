/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7b3c4
 */

undefined8 mbedtls_poly1305_starts(uint *param_1,uint *param_2)

{
  uint uVar1;
  
  *param_1 = *param_2 & 0xfffffff;
  param_1[1] = param_2[1] & 0xffffffc;
  param_1[2] = param_2[2] & 0xffffffc;
  param_1[3] = param_2[3] & 0xffffffc;
  param_1[4] = param_2[4];
  param_1[5] = param_2[5];
  param_1[6] = param_2[6];
  uVar1 = param_2[7];
  param_1[8] = 0;
  param_1[9] = 0;
  param_1[10] = 0;
  param_1[0xb] = 0;
  param_1[7] = uVar1;
  param_1[0xc] = 0;
  mbedtls_platform_zeroize(param_1 + 0xd,0x10);
  param_1[0x12] = 0;
  param_1[0x13] = 0;
  return 0;
}

