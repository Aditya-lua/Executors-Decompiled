/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8a220
 */

undefined8 FUN_00a8a220(long param_1,long param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  undefined4 local_68;
  undefined4 local_64;
  
  lVar4 = param_3;
  if (param_4 >> 0x1e != 0) {
    uVar1 = param_4 - 0x40000000;
    uVar6 = uVar1 & 0xffffffffc0000000;
    lVar2 = uVar6 + 0x40000000;
    lVar4 = param_3 + lVar2;
    lVar5 = param_2;
    do {
      local_64 = EVP_CIPHER_CTX_get_num(param_1);
      uVar3 = EVP_CIPHER_CTX_get_cipher_data(param_1);
      CRYPTO_ofb128_encrypt
                (param_3,lVar5,0x40000000,uVar3,param_1 + 0x28,&local_64,ossl_aria_encrypt);
      EVP_CIPHER_CTX_set_num(param_1,local_64);
      param_4 = param_4 - 0x40000000;
      param_3 = param_3 + 0x40000000;
      lVar5 = lVar5 + 0x40000000;
    } while (param_4 >> 0x1e != 0);
    param_4 = uVar1 - uVar6;
    param_2 = param_2 + lVar2;
  }
  if (param_4 != 0) {
    local_68 = EVP_CIPHER_CTX_get_num(param_1);
    uVar3 = EVP_CIPHER_CTX_get_cipher_data(param_1);
    CRYPTO_ofb128_encrypt(lVar4,param_2,param_4,uVar3,param_1 + 0x28,&local_68,ossl_aria_encrypt);
    EVP_CIPHER_CTX_set_num(param_1,local_68);
  }
  return 1;
}

