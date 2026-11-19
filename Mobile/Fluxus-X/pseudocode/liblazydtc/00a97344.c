/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a97344
 */

undefined8 FUN_00a97344(long param_1,uchar *param_2,uchar *param_3,ulong param_4)

{
  ulong uVar1;
  uchar *puVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  uchar *out;
  
  if (param_4 >> 0x1e != 0) {
    uVar1 = param_4 - 0x40000000;
    uVar6 = uVar1 & 0xffffffffc0000000;
    lVar5 = uVar6 + 0x40000000;
    puVar2 = param_3 + lVar5;
    out = param_2;
    do {
      lVar4 = EVP_CIPHER_CTX_get_cipher_data(param_1);
      iVar3 = EVP_CIPHER_CTX_is_encrypting(param_1);
      RC2_cbc_encrypt(param_3,out,0x40000000,(RC2_KEY *)(lVar4 + 4),(uchar *)(param_1 + 0x28),iVar3)
      ;
      param_4 = param_4 - 0x40000000;
      param_3 = param_3 + 0x40000000;
      out = out + 0x40000000;
    } while (param_4 >> 0x1e != 0);
    param_2 = param_2 + lVar5;
    param_4 = uVar1 - uVar6;
    param_3 = puVar2;
  }
  if (param_4 != 0) {
    lVar5 = EVP_CIPHER_CTX_get_cipher_data(param_1);
    iVar3 = EVP_CIPHER_CTX_is_encrypting(param_1);
    RC2_cbc_encrypt(param_3,param_2,param_4,(RC2_KEY *)(lVar5 + 4),(uchar *)(param_1 + 0x28),iVar3);
  }
  return 1;
}

