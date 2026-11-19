/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a95bcc
 */

undefined8 FUN_00a95bcc(undefined8 param_1,undefined8 param_2,undefined8 param_3,int param_4)

{
  int iVar1;
  undefined8 uVar2;
  undefined1 auStack_108 [216];
  
  if (param_4 == 0) {
    EVP_CIPHER_CTX_get0_cipher(param_1);
    iVar1 = EVP_CIPHER_get_mode();
    if (iVar1 != 4) {
      EVP_CIPHER_CTX_get0_cipher(param_1);
      iVar1 = EVP_CIPHER_get_mode();
      if (iVar1 != 3) {
        IDEA_set_encrypt_key(param_2,auStack_108);
        uVar2 = EVP_CIPHER_CTX_get_cipher_data(param_1);
        IDEA_set_decrypt_key(auStack_108,uVar2);
        OPENSSL_cleanse(auStack_108,0xd8);
        return 1;
      }
    }
  }
  uVar2 = EVP_CIPHER_CTX_get_cipher_data(param_1);
  IDEA_set_encrypt_key(param_2,uVar2);
  return 1;
}

