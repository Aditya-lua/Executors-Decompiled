/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b24320
 */

undefined8 FUN_00b24320(byte *param_1,uchar *param_2,int param_3)

{
  AES_set_encrypt_key(param_2,param_3 << 3,(AES_KEY *)(param_1 + 0xa8));
  CRYPTO_ccm128_init(param_1 + 0x50,*(undefined4 *)(param_1 + 0x10),*(undefined4 *)(param_1 + 8),
                     (AES_KEY *)(param_1 + 0xa8),AES_encrypt);
  param_1[0x88] = 0;
  param_1[0x89] = 0;
  param_1[0x8a] = 0;
  param_1[0x8b] = 0;
  param_1[0x8c] = 0;
  param_1[0x8d] = 0;
  param_1[0x8e] = 0;
  param_1[0x8f] = 0;
  *param_1 = *param_1 | 2;
  return 1;
}

