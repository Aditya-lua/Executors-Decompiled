/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8fdcc
 */

undefined8 FUN_00a8fdcc(long param_1,uchar *param_2,uchar *param_3,ulong param_4)

{
  ulong uVar1;
  long lVar2;
  uchar *puVar3;
  int iVar4;
  CAST_KEY *pCVar5;
  ulong uVar6;
  uchar *out;
  
  if (param_4 >> 0x1e != 0) {
    uVar1 = param_4 - 0x40000000;
    uVar6 = uVar1 & 0xffffffffc0000000;
    lVar2 = uVar6 + 0x40000000;
    puVar3 = param_3 + lVar2;
    out = param_2;
    do {
      pCVar5 = (CAST_KEY *)EVP_CIPHER_CTX_get_cipher_data(param_1);
      iVar4 = EVP_CIPHER_CTX_is_encrypting(param_1);
      CAST_cbc_encrypt(param_3,out,0x40000000,pCVar5,(uchar *)(param_1 + 0x28),iVar4);
      param_4 = param_4 - 0x40000000;
      param_3 = param_3 + 0x40000000;
      out = out + 0x40000000;
    } while (param_4 >> 0x1e != 0);
    param_2 = param_2 + lVar2;
    param_4 = uVar1 - uVar6;
    param_3 = puVar3;
  }
  if (param_4 != 0) {
    pCVar5 = (CAST_KEY *)EVP_CIPHER_CTX_get_cipher_data(param_1);
    iVar4 = EVP_CIPHER_CTX_is_encrypting(param_1);
    CAST_cbc_encrypt(param_3,param_2,param_4,pCVar5,(uchar *)(param_1 + 0x28),iVar4);
  }
  return 1;
}

