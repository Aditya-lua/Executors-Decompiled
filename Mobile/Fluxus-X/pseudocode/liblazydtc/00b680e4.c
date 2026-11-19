/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b680e4
 */

undefined8
ossl_gcm_cipher_update(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  
  if ((*(byte *)(param_1 + 0x54) & 1) == 0) {
    iVar1 = CRYPTO_gcm128_decrypt();
  }
  else {
    iVar1 = CRYPTO_gcm128_encrypt(param_1 + 0xf8,param_2,param_4,param_3);
  }
  if (iVar1 == 0) {
    return 1;
  }
  return 0;
}

