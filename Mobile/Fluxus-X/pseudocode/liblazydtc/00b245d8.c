/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b245d8
 */

undefined8 FUN_00b245d8(long param_1,uchar *param_2,int param_3)

{
  AES_KEY *key;
  
  key = (AES_KEY *)(param_1 + 0x2c0);
  *(AES_KEY **)(param_1 + 0x2b8) = key;
  AES_set_encrypt_key(param_2,param_3 << 3,key);
  CRYPTO_gcm128_init(param_1 + 0xf8,key,AES_encrypt);
  *(undefined8 *)(param_1 + 0x2b0) = 0;
  *(byte *)(param_1 + 0x54) = *(byte *)(param_1 + 0x54) | 4;
  return 1;
}

