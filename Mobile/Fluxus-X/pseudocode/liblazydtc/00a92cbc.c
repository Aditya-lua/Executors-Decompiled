/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a92cbc
 */

undefined8 FUN_00a92cbc(long param_1,uchar *param_2,uchar *param_3,ulong param_4)

{
  ulong uVar1;
  uchar *puVar2;
  int iVar3;
  long lVar4;
  DES_key_schedule *pDVar5;
  ulong uVar6;
  uchar *output;
  
  lVar4 = EVP_CIPHER_CTX_get_cipher_data();
  if (*(code **)(lVar4 + 0x80) == (code *)0x0) {
    if (param_4 >> 0x1e != 0) {
      uVar1 = param_4 - 0x40000000;
      uVar6 = uVar1 & 0xffffffffc0000000;
      lVar4 = uVar6 + 0x40000000;
      puVar2 = param_3 + lVar4;
      output = param_2;
      do {
        pDVar5 = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data(param_1);
        iVar3 = EVP_CIPHER_CTX_is_encrypting(param_1);
        DES_ncbc_encrypt(param_3,output,0x40000000,pDVar5,(DES_cblock *)(param_1 + 0x28),iVar3);
        param_4 = param_4 - 0x40000000;
        param_3 = param_3 + 0x40000000;
        output = output + 0x40000000;
      } while (param_4 >> 0x1e != 0);
      param_2 = param_2 + lVar4;
      param_4 = uVar1 - uVar6;
      param_3 = puVar2;
    }
    if (param_4 != 0) {
      pDVar5 = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data(param_1);
      iVar3 = EVP_CIPHER_CTX_is_encrypting(param_1);
      DES_ncbc_encrypt(param_3,param_2,param_4,pDVar5,(DES_cblock *)(param_1 + 0x28),iVar3);
    }
  }
  else {
    (**(code **)(lVar4 + 0x80))(param_3,param_2,param_4,lVar4,param_1 + 0x28);
  }
  return 1;
}

