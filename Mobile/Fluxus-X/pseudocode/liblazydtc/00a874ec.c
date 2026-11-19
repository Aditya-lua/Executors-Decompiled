/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a874ec
 */

undefined8 FUN_00a874ec(EVP_CIPHER_CTX *param_1,long param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  int iVar4;
  undefined4 uVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  undefined4 local_6c;
  undefined4 local_68;
  undefined4 local_64;
  
  lVar6 = EVP_CIPHER_CTX_get_cipher_data();
  iVar4 = EVP_CIPHER_CTX_test_flags(param_1,0x2000);
  if (iVar4 == 0) {
    if (param_4 >> 0x3c != 0) {
      uVar1 = param_4 + 0xf000000000000000;
      uVar7 = uVar1 & 0xf000000000000000;
      lVar2 = uVar7 + 0x1000000000000000;
      lVar3 = param_2 + lVar2;
      lVar8 = param_3;
      do {
        local_68 = EVP_CIPHER_CTX_get_num(param_1);
        uVar5 = EVP_CIPHER_CTX_is_encrypting(param_1);
        CRYPTO_cfb128_1_encrypt
                  (lVar8,param_2,0x8000000000000000,lVar6,param_1->iv,&local_68,uVar5,
                   *(undefined8 *)(lVar6 + 0xf8));
        EVP_CIPHER_CTX_set_num(param_1,local_68);
        param_4 = param_4 + 0xf000000000000000;
        param_2 = param_2 + 0x1000000000000000;
        lVar8 = lVar8 + 0x1000000000000000;
      } while (param_4 >> 0x3c != 0);
      param_3 = param_3 + lVar2;
      param_4 = uVar1 - uVar7;
      param_2 = lVar3;
    }
    if (param_4 == 0) {
      return 1;
    }
    local_6c = EVP_CIPHER_CTX_get_num(param_1);
    uVar5 = EVP_CIPHER_CTX_is_encrypting(param_1);
    CRYPTO_cfb128_1_encrypt
              (param_3,param_2,param_4 << 3,lVar6,param_1->iv,&local_6c,uVar5,
               *(undefined8 *)(lVar6 + 0xf8));
    uVar5 = local_6c;
  }
  else {
    local_64 = EVP_CIPHER_CTX_get_num(param_1);
    uVar5 = EVP_CIPHER_CTX_is_encrypting(param_1);
    CRYPTO_cfb128_1_encrypt
              (param_3,param_2,param_4,lVar6,param_1->iv,&local_64,uVar5,
               *(undefined8 *)(lVar6 + 0xf8));
    uVar5 = local_64;
  }
  EVP_CIPHER_CTX_set_num(param_1,uVar5);
  return 1;
}

