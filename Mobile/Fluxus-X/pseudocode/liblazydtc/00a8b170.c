/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8b170
 */

bool FUN_00a8b170(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  int local_44;
  
  iVar1 = EVP_CIPHER_CTX_get_num();
  uVar2 = EVP_CIPHER_CTX_get_cipher_data(param_1);
  if (-1 < iVar1) {
    local_44 = iVar1;
    uVar3 = EVP_CIPHER_CTX_buf_noconst(param_1);
    CRYPTO_ctr128_encrypt
              (param_3,param_2,param_4,uVar2,param_1 + 0x28,uVar3,&local_44,ossl_aria_encrypt);
    EVP_CIPHER_CTX_set_num(param_1,local_44);
  }
  return -1 < iVar1;
}

