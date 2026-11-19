/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b24638
 */

undefined8 FUN_00b24638(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  long lVar1;
  int iVar2;
  
  lVar1 = param_1 + 0xf8;
  if ((*(byte *)(param_1 + 0x54) & 1) == 0) {
    if (*(long *)(param_1 + 0x2b0) == 0) {
      iVar2 = CRYPTO_gcm128_decrypt(lVar1,param_2,param_4);
    }
    else {
      iVar2 = CRYPTO_gcm128_decrypt_ctr32(lVar1,param_2,param_4);
    }
  }
  else if (*(long *)(param_1 + 0x2b0) == 0) {
    iVar2 = CRYPTO_gcm128_encrypt(lVar1,param_2,param_4,param_3);
  }
  else {
    iVar2 = CRYPTO_gcm128_encrypt_ctr32(lVar1,param_2,param_4);
  }
  if (iVar2 == 0) {
    return 1;
  }
  return 0;
}

