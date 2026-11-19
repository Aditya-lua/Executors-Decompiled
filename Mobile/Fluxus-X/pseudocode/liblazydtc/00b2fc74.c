/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2fc74
 */

undefined8 ossl_blake2s_init(uint *param_1,uint *param_2)

{
  memset(param_1 + 8,0,0x58);
  param_1[2] = 0x3c6ef372;
  param_1[3] = 0xa54ff53a;
  param_1[0] = 0x6a09e667;
  param_1[1] = 0xbb67ae85;
  param_1[6] = 0x1f83d9ab;
  param_1[7] = 0x5be0cd19;
  param_1[4] = 0x510e527f;
  param_1[5] = 0x9b05688c;
  *(ulong *)(param_1 + 0x1e) = (ulong)(byte)*param_2;
  *param_1 = *param_2 ^ 0x6a09e667;
  param_1[1] = param_2[1] ^ 0xbb67ae85;
  param_1[2] = param_2[2] ^ 0x3c6ef372;
  param_1[3] = param_2[3] ^ 0xa54ff53a;
  param_1[4] = param_2[4] ^ 0x510e527f;
  param_1[5] = param_2[5] ^ 0x9b05688c;
  param_1[6] = param_2[6] ^ 0x1f83d9ab;
  param_1[7] = param_2[7] ^ 0x5be0cd19;
  return 1;
}

