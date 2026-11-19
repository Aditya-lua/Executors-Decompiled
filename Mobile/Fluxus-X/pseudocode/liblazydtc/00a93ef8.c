/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a93ef8
 */

undefined8 FUN_00a93ef8(long param_1,uchar *param_2,uchar *param_3,ulong param_4)

{
  ulong uVar1;
  long lVar2;
  uchar *puVar3;
  int iVar4;
  DES_key_schedule *ks1;
  ulong uVar5;
  uchar *output;
  
  ks1 = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data();
                    /* WARNING: Load size is inaccurate */
  if (ks1[3].ks[0].cblock[0] == (DES_cblock)0x0) {
    if (param_4 >> 0x1e != 0) {
      uVar1 = param_4 - 0x40000000;
      uVar5 = uVar1 & 0xffffffffc0000000;
      lVar2 = uVar5 + 0x40000000;
      puVar3 = param_3 + lVar2;
      output = param_2;
      do {
        iVar4 = EVP_CIPHER_CTX_is_encrypting(param_1);
        DES_ede3_cbc_encrypt
                  (param_3,output,0x40000000,ks1,ks1 + 1,ks1 + 2,(DES_cblock *)(param_1 + 0x28),
                   iVar4);
        param_4 = param_4 - 0x40000000;
        param_3 = param_3 + 0x40000000;
        output = output + 0x40000000;
      } while (param_4 >> 0x1e != 0);
      param_4 = uVar1 - uVar5;
      param_2 = param_2 + lVar2;
      param_3 = puVar3;
    }
    if (param_4 != 0) {
      iVar4 = EVP_CIPHER_CTX_is_encrypting(param_1);
      DES_ede3_cbc_encrypt
                (param_3,param_2,param_4,ks1,ks1 + 1,ks1 + 2,(DES_cblock *)(param_1 + 0x28),iVar4);
    }
  }
  else {
    (*(code *)ks1[3].ks[0].cblock[0])(param_3,param_2,param_4,ks1,param_1 + 0x28);
  }
  return 1;
}

