/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2dd84
 */

undefined8 ossl_blake2b_init_key(ulong *param_1,ulong *param_2,void *param_3)

{
  undefined1 auStack_b0 [128];
  
  memset(param_1 + 8,0,0xa8);
  param_1[5] = 0x9b05688c2b3e6c1f;
  param_1[4] = 0x510e527fade682d1;
  param_1[7] = 0x5be0cd19137e2179;
  param_1[6] = 0x1f83d9abfb41bd6b;
  param_1[1] = 0xbb67ae8584caa73b;
  *param_1 = 0x6a09e667f3bcc908;
  param_1[3] = 0xa54ff53a5f1d36f1;
  param_1[2] = 0x3c6ef372fe94f82b;
  param_1[0x1d] = (ulong)(byte)*param_2;
  *param_1 = *param_2 ^ 0x6a09e667f3bcc908;
  param_1[1] = param_2[1] ^ 0xbb67ae8584caa73b;
  param_1[2] = param_2[2] ^ 0x3c6ef372fe94f82b;
  param_1[3] = param_2[3] ^ 0xa54ff53a5f1d36f1;
  param_1[4] = param_2[4] ^ 0x510e527fade682d1;
  param_1[5] = param_2[5] ^ 0x9b05688c2b3e6c1f;
  param_1[6] = param_2[6] ^ 0x1f83d9abfb41bd6b;
  param_1[7] = param_2[7] ^ 0x5be0cd19137e2179;
  memset(auStack_b0,0,0x80);
  memcpy(auStack_b0,param_3,(ulong)*(byte *)((long)param_2 + 1));
  memcpy(param_1 + 0xc,auStack_b0,0x80);
  param_1[0x1c] = 0x80;
  OPENSSL_cleanse(auStack_b0,0x80);
  return 1;
}

