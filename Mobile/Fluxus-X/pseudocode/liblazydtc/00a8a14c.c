/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8a14c
 */

undefined8 FUN_00a8a14c(long param_1,long param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  ulong uVar4;
  undefined4 local_54;
  
  if (param_4 != 0) {
    uVar4 = param_4;
    if (param_4 >> 0x1e != 0) {
      uVar4 = 0x40000000;
    }
    do {
      local_54 = EVP_CIPHER_CTX_get_num(param_1);
      uVar3 = EVP_CIPHER_CTX_get_cipher_data(param_1);
      uVar2 = EVP_CIPHER_CTX_is_encrypting(param_1);
      CRYPTO_cfb128_encrypt
                (param_3,param_2,uVar4,uVar3,param_1 + 0x28,&local_54,uVar2,ossl_aria_encrypt);
      EVP_CIPHER_CTX_set_num(param_1,local_54);
      param_4 = param_4 - uVar4;
      param_3 = param_3 + uVar4;
      param_2 = param_2 + uVar4;
      uVar1 = param_4;
      if (uVar4 <= param_4) {
        uVar1 = uVar4;
      }
      uVar4 = uVar1;
    } while (param_4 != 0);
  }
  return 1;
}

