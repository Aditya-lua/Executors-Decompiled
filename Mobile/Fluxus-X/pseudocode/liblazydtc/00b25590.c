/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b25590
 */

undefined8 FUN_00b25590(long param_1,uchar *param_2,int param_3)

{
  undefined8 uVar1;
  
  CRYPTO_ocb128_cleanup(param_1 + 0x2b0);
  AES_set_encrypt_key(param_2,param_3 << 3,(AES_KEY *)(param_1 + 0xc0));
  AES_set_decrypt_key(param_2,param_3 << 3,(AES_KEY *)(param_1 + 0x1b8));
  uVar1 = CRYPTO_ocb128_init(param_1 + 0x2b0,(AES_KEY *)(param_1 + 0xc0),
                             (AES_KEY *)(param_1 + 0x1b8),AES_encrypt,AES_decrypt,0);
  if ((int)uVar1 != 0) {
    uVar1 = 1;
    *(byte *)(param_1 + 0x364) = *(byte *)(param_1 + 0x364) | 1;
  }
  return uVar1;
}

