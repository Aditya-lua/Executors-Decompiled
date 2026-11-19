/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8a814
 */

undefined8 FUN_00a8a814(long param_1,long param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  int iVar4;
  undefined8 uVar5;
  ulong uVar6;
  long lVar7;
  
  if (param_4 >> 0x1e != 0) {
    uVar1 = param_4 - 0x40000000;
    uVar6 = uVar1 & 0xffffffffc0000000;
    lVar2 = uVar6 + 0x40000000;
    lVar3 = param_3 + lVar2;
    lVar7 = param_2;
    do {
      uVar5 = EVP_CIPHER_CTX_get_cipher_data(param_1);
      iVar4 = EVP_CIPHER_CTX_is_encrypting(param_1);
      if (iVar4 == 0) {
        CRYPTO_cbc128_decrypt(param_3,lVar7,0x40000000,uVar5,param_1 + 0x28,ossl_aria_encrypt);
      }
      else {
        CRYPTO_cbc128_encrypt(param_3,lVar7,0x40000000,uVar5,param_1 + 0x28,ossl_aria_encrypt);
      }
      param_4 = param_4 - 0x40000000;
      param_3 = param_3 + 0x40000000;
      lVar7 = lVar7 + 0x40000000;
    } while (param_4 >> 0x1e != 0);
    param_4 = uVar1 - uVar6;
    param_2 = param_2 + lVar2;
    param_3 = lVar3;
  }
  if (param_4 != 0) {
    uVar5 = EVP_CIPHER_CTX_get_cipher_data(param_1);
    iVar4 = EVP_CIPHER_CTX_is_encrypting(param_1);
    if (iVar4 == 0) {
      CRYPTO_cbc128_decrypt(param_3,param_2,param_4,uVar5,param_1 + 0x28,ossl_aria_encrypt);
    }
    else {
      CRYPTO_cbc128_encrypt(param_3,param_2,param_4,uVar5,param_1 + 0x28);
    }
  }
  return 1;
}

