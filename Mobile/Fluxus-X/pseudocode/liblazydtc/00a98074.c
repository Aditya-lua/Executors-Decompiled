/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a98074
 */

undefined8 FUN_00a98074(long param_1,uchar *param_2,uchar *param_3,ulong param_4)

{
  ulong uVar1;
  long lVar2;
  SEED_KEY_SCHEDULE *pSVar3;
  uchar *in;
  uchar *out;
  ulong uVar4;
  int local_68;
  int local_64;
  
  in = param_3;
  if (param_4 >> 0x1e != 0) {
    uVar1 = param_4 - 0x40000000;
    uVar4 = uVar1 & 0xffffffffc0000000;
    lVar2 = uVar4 + 0x40000000;
    in = param_3 + lVar2;
    out = param_2;
    do {
      local_64 = EVP_CIPHER_CTX_get_num(param_1);
      pSVar3 = (SEED_KEY_SCHEDULE *)EVP_CIPHER_CTX_get_cipher_data(param_1);
      SEED_ofb128_encrypt(param_3,out,0x40000000,pSVar3,(uchar *)(param_1 + 0x28),&local_64);
      EVP_CIPHER_CTX_set_num(param_1,local_64);
      param_4 = param_4 - 0x40000000;
      param_3 = param_3 + 0x40000000;
      out = out + 0x40000000;
    } while (param_4 >> 0x1e != 0);
    param_2 = param_2 + lVar2;
    param_4 = uVar1 - uVar4;
  }
  if (param_4 != 0) {
    local_68 = EVP_CIPHER_CTX_get_num(param_1);
    pSVar3 = (SEED_KEY_SCHEDULE *)EVP_CIPHER_CTX_get_cipher_data(param_1);
    SEED_ofb128_encrypt(in,param_2,param_4,pSVar3,(uchar *)(param_1 + 0x28),&local_68);
    EVP_CIPHER_CTX_set_num(param_1,local_68);
  }
  return 1;
}

