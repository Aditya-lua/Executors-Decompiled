/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9450c
 */

undefined8 FUN_00a9450c(EVP_CIPHER_CTX *param_1,long param_2,long param_3,ulong param_4)

{
  uint uVar1;
  ulong uVar2;
  int iVar3;
  DES_key_schedule *ks1;
  long lVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  byte local_68 [4];
  uchar local_64 [4];
  
  iVar3 = EVP_CIPHER_CTX_test_flags(param_1,0x2000);
  uVar2 = param_4 << 3;
  if (iVar3 != 0) {
    uVar2 = param_4;
  }
  if (uVar2 != 0) {
    uVar6 = 0;
    do {
      uVar7 = uVar6 >> 3;
      uVar1 = (uint)uVar6 & 7;
      local_64[0] = '\0';
      if ((1 << (ulong)(uVar1 ^ 7) & (uint)*(byte *)(param_3 + uVar7)) != 0) {
        local_64[0] = 0x80;
      }
      ks1 = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data(param_1);
      lVar4 = EVP_CIPHER_CTX_get_cipher_data(param_1);
      lVar5 = EVP_CIPHER_CTX_get_cipher_data(param_1);
      iVar3 = EVP_CIPHER_CTX_is_encrypting(param_1);
      DES_ede3_cfb_encrypt
                (local_64,local_68,1,1,ks1,(DES_key_schedule *)(lVar4 + 0x80),
                 (DES_key_schedule *)(lVar5 + 0x100),(DES_cblock *)param_1->iv,iVar3);
      uVar6 = uVar6 + 1;
      *(byte *)(param_2 + uVar7) =
           (byte)((local_68[0] & 0x80) >> (ulong)uVar1) |
           (byte)(-0x81 >> uVar1) & *(byte *)(param_2 + uVar7);
    } while (uVar2 != uVar6);
  }
  return 1;
}

