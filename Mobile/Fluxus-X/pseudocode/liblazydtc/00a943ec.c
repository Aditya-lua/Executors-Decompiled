/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a943ec
 */

undefined8 FUN_00a943ec(undefined8 param_1,long param_2,long param_3,ulong param_4)

{
  int enc;
  long lVar1;
  DES_key_schedule *ks1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  
  lVar1 = EVP_CIPHER_CTX_get0_cipher();
  uVar3 = (ulong)*(int *)(lVar1 + 4);
  if (uVar3 <= param_4) {
    uVar4 = 0;
    do {
      ks1 = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data(param_1);
      lVar1 = EVP_CIPHER_CTX_get_cipher_data(param_1);
      lVar2 = EVP_CIPHER_CTX_get_cipher_data(param_1);
      enc = EVP_CIPHER_CTX_is_encrypting(param_1);
      DES_ecb3_encrypt((const_DES_cblock *)(param_3 + uVar4),(DES_cblock *)(param_2 + uVar4),ks1,
                       (DES_key_schedule *)(lVar1 + 0x80),(DES_key_schedule *)(lVar2 + 0x100),enc);
      uVar4 = uVar4 + uVar3;
    } while (uVar4 <= param_4 - uVar3);
  }
  return 1;
}

