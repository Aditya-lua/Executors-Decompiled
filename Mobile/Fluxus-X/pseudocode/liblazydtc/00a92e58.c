/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a92e58
 */

undefined8 FUN_00a92e58(long param_1,uchar *param_2,uchar *param_3,ulong param_4)

{
  ulong uVar1;
  long lVar2;
  uchar *puVar3;
  int iVar4;
  DES_key_schedule *pDVar5;
  ulong uVar6;
  uchar *out;
  int local_68;
  int local_64;
  
  if (param_4 >> 0x1e != 0) {
    uVar1 = param_4 - 0x40000000;
    uVar6 = uVar1 & 0xffffffffc0000000;
    lVar2 = uVar6 + 0x40000000;
    puVar3 = param_3 + lVar2;
    out = param_2;
    do {
      local_64 = EVP_CIPHER_CTX_get_num(param_1);
      pDVar5 = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data(param_1);
      iVar4 = EVP_CIPHER_CTX_is_encrypting(param_1);
      DES_cfb64_encrypt(param_3,out,0x40000000,pDVar5,(DES_cblock *)(param_1 + 0x28),&local_64,iVar4
                       );
      EVP_CIPHER_CTX_set_num(param_1,local_64);
      param_4 = param_4 - 0x40000000;
      param_3 = param_3 + 0x40000000;
      out = out + 0x40000000;
    } while (param_4 >> 0x1e != 0);
    param_2 = param_2 + lVar2;
    param_4 = uVar1 - uVar6;
    param_3 = puVar3;
  }
  if (param_4 != 0) {
    local_68 = EVP_CIPHER_CTX_get_num(param_1);
    pDVar5 = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data(param_1);
    iVar4 = EVP_CIPHER_CTX_is_encrypting(param_1);
    DES_cfb64_encrypt(param_3,param_2,param_4,pDVar5,(DES_cblock *)(param_1 + 0x28),&local_68,iVar4)
    ;
    EVP_CIPHER_CTX_set_num(param_1,local_68);
  }
  return 1;
}

