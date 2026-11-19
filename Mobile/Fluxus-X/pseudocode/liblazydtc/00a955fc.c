/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a955fc
 */

undefined8 FUN_00a955fc(long param_1,uchar *param_2,uchar *param_3,ulong param_4)

{
  ulong uVar1;
  uchar *puVar2;
  int iVar3;
  DES_key_schedule *pDVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  uchar *output;
  
  if (param_4 >> 0x1e != 0) {
    uVar1 = param_4 - 0x40000000;
    uVar8 = uVar1 & 0xffffffffc0000000;
    lVar7 = uVar8 + 0x40000000;
    puVar2 = param_3 + lVar7;
    output = param_2;
    do {
      pDVar4 = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data(param_1);
      lVar5 = EVP_CIPHER_CTX_get_cipher_data(param_1);
      lVar6 = EVP_CIPHER_CTX_get_cipher_data(param_1);
      iVar3 = EVP_CIPHER_CTX_is_encrypting(param_1);
      DES_xcbc_encrypt(param_3,output,0x40000000,pDVar4,(DES_cblock *)(param_1 + 0x28),
                       (const_DES_cblock *)(lVar5 + 0x80),(const_DES_cblock *)(lVar6 + 0x88),iVar3);
      param_4 = param_4 - 0x40000000;
      param_3 = param_3 + 0x40000000;
      output = output + 0x40000000;
    } while (param_4 >> 0x1e != 0);
    param_4 = uVar1 - uVar8;
    param_2 = param_2 + lVar7;
    param_3 = puVar2;
  }
  if (param_4 != 0) {
    pDVar4 = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data(param_1);
    lVar7 = EVP_CIPHER_CTX_get_cipher_data(param_1);
    lVar5 = EVP_CIPHER_CTX_get_cipher_data(param_1);
    iVar3 = EVP_CIPHER_CTX_is_encrypting(param_1);
    DES_xcbc_encrypt(param_3,param_2,param_4,pDVar4,(DES_cblock *)(param_1 + 0x28),
                     (const_DES_cblock *)(lVar7 + 0x80),(const_DES_cblock *)(lVar5 + 0x88),iVar3);
  }
  return 1;
}

