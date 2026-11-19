/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a87458
 */

undefined8 FUN_00a87458(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined4 uVar1;
  long lVar2;
  undefined4 local_44;
  
  lVar2 = EVP_CIPHER_CTX_get_cipher_data();
  local_44 = EVP_CIPHER_CTX_get_num(param_1);
  uVar1 = EVP_CIPHER_CTX_is_encrypting(param_1);
  CRYPTO_cfb128_encrypt
            (param_3,param_2,param_4,lVar2,param_1 + 0x28,&local_44,uVar1,
             *(undefined8 *)(lVar2 + 0xf8));
  EVP_CIPHER_CTX_set_num(param_1,local_44);
  return 1;
}

