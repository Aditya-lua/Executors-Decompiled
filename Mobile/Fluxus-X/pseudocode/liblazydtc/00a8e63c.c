/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8e63c
 */

undefined8 FUN_00a8e63c(undefined8 param_1,uchar *param_2,undefined8 param_3,int param_4)

{
  int iVar1;
  CAMELLIA_KEY *key;
  undefined8 uVar2;
  code *pcVar3;
  code *pcVar4;
  
  key = (CAMELLIA_KEY *)EVP_CIPHER_CTX_get_cipher_data();
  iVar1 = EVP_CIPHER_CTX_get_key_length(param_1);
  iVar1 = Camellia_set_key(param_2,iVar1 << 3,key);
  if (iVar1 < 0) {
    ERR_new();
    ERR_set_debug("crypto/evp/e_camellia.c",0xc9,"camellia_init_key");
    ERR_set_error(6,0x9d,0);
    uVar2 = 0;
  }
  else {
    EVP_CIPHER_CTX_get0_cipher(param_1);
    iVar1 = EVP_CIPHER_get_mode();
    if ((param_4 == 0) && (iVar1 - 1U < 2)) {
      pcVar3 = Camellia_decrypt;
    }
    else {
      pcVar3 = Camellia_encrypt;
    }
    pcVar4 = Camellia_cbc_encrypt;
    uVar2 = 1;
    if (iVar1 != 2) {
      pcVar4 = (code *)0x0;
    }
    key[1].u.d = (double)pcVar3;
    *(code **)((long)&key[1].u + 8) = pcVar4;
  }
  return uVar2;
}

