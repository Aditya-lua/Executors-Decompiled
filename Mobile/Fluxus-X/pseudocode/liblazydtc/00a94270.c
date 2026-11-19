/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a94270
 */

undefined8 FUN_00a94270(long param_1,uchar *param_2,uchar *param_3,ulong param_4)

{
  ulong uVar1;
  uchar *puVar2;
  DES_key_schedule *pDVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  uchar *out;
  int local_68;
  int local_64;
  
  if (param_4 >> 0x1e != 0) {
    uVar1 = param_4 - 0x40000000;
    uVar7 = uVar1 & 0xffffffffc0000000;
    lVar6 = uVar7 + 0x40000000;
    puVar2 = param_3 + lVar6;
    out = param_2;
    do {
      local_64 = EVP_CIPHER_CTX_get_num(param_1);
      pDVar3 = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data(param_1);
      lVar4 = EVP_CIPHER_CTX_get_cipher_data(param_1);
      lVar5 = EVP_CIPHER_CTX_get_cipher_data(param_1);
      DES_ede3_ofb64_encrypt
                (param_3,out,0x40000000,pDVar3,(DES_key_schedule *)(lVar4 + 0x80),
                 (DES_key_schedule *)(lVar5 + 0x100),(DES_cblock *)(param_1 + 0x28),&local_64);
      EVP_CIPHER_CTX_set_num(param_1,local_64);
      param_4 = param_4 - 0x40000000;
      param_3 = param_3 + 0x40000000;
      out = out + 0x40000000;
    } while (param_4 >> 0x1e != 0);
    param_4 = uVar1 - uVar7;
    param_2 = param_2 + lVar6;
    param_3 = puVar2;
  }
  if (param_4 != 0) {
    local_68 = EVP_CIPHER_CTX_get_num(param_1);
    pDVar3 = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data(param_1);
    lVar6 = EVP_CIPHER_CTX_get_cipher_data(param_1);
    lVar4 = EVP_CIPHER_CTX_get_cipher_data(param_1);
    DES_ede3_ofb64_encrypt
              (param_3,param_2,param_4,pDVar3,(DES_key_schedule *)(lVar6 + 0x80),
               (DES_key_schedule *)(lVar4 + 0x100),(DES_cblock *)(param_1 + 0x28),&local_68);
    EVP_CIPHER_CTX_set_num(param_1,local_68);
  }
  return 1;
}

