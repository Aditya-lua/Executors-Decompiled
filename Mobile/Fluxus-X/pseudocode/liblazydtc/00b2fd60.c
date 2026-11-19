/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2fd60
 */

undefined8 ossl_blake2s_init_key(uint *param_1,uint *param_2,void *param_3)

{
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  
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
  uStack_48 = 0;
  local_50 = 0;
  uStack_38 = 0;
  local_40 = 0;
  uStack_68 = 0;
  local_70 = 0;
  uStack_58 = 0;
  local_60 = 0;
  memcpy(&local_70,param_3,(ulong)*(byte *)((long)param_2 + 1));
  *(undefined8 *)(param_1 + 0x1a) = uStack_38;
  *(undefined8 *)(param_1 + 0x18) = local_40;
  *(undefined8 *)(param_1 + 0x16) = uStack_48;
  *(undefined8 *)(param_1 + 0x14) = local_50;
  *(undefined8 *)(param_1 + 0x12) = uStack_58;
  *(undefined8 *)(param_1 + 0x10) = local_60;
  param_1[0x1c] = 0x40;
  param_1[0x1d] = 0;
  *(undefined8 *)(param_1 + 0xe) = uStack_68;
  *(undefined8 *)(param_1 + 0xc) = local_70;
  OPENSSL_cleanse(&local_70,0x40);
  return 1;
}

