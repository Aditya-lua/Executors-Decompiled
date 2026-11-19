/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a97abc
 */

undefined8 FUN_00a97abc(undefined8 param_1,uchar *param_2,uchar *param_3,size_t param_4)

{
  MD5_CTX *pMVar1;
  uchar *md;
  size_t len;
  int iVar2;
  RC4_KEY *key;
  undefined8 uVar3;
  size_t len_00;
  uchar auStack_50 [16];
  
  key = (RC4_KEY *)EVP_CIPHER_CTX_get_cipher_data();
  len_00 = *(size_t *)(key->data + 0x84);
  if ((len_00 + 0x10 == param_4) || (uVar3 = 0, len_00 == 0xffffffffffffffff)) {
    iVar2 = EVP_CIPHER_CTX_is_encrypting(param_1);
    if (iVar2 == 0) {
      RC4(key,param_4,param_3,param_2);
      pMVar1 = (MD5_CTX *)(key->data + 0x6d);
      if (len_00 == 0xffffffffffffffff) {
        MD5_Update(pMVar1,param_2,param_4);
      }
      else {
        MD5_Update(pMVar1,param_2,len_00);
        MD5_Final(auStack_50,pMVar1);
        memcpy(pMVar1,key->data + 0x56,0x5c);
        MD5_Update(pMVar1,auStack_50,0x10);
        MD5_Final(auStack_50,pMVar1);
        iVar2 = CRYPTO_memcmp(param_2 + len_00,auStack_50,0x10);
        if (iVar2 != 0) {
          return 0;
        }
      }
    }
    else {
      len = param_4;
      if (len_00 != 0xffffffffffffffff) {
        len = len_00;
      }
      pMVar1 = (MD5_CTX *)(key->data + 0x6d);
      MD5_Update(pMVar1,param_3,len);
      if (len == param_4) {
      }
      else {
        if (param_3 != param_2) {
          memcpy(param_2,param_3,len);
        }
        md = param_2 + len;
        MD5_Final(md,pMVar1);
        memcpy(pMVar1,key->data + 0x56,0x5c);
        MD5_Update(pMVar1,md,0x10);
        MD5_Final(md,pMVar1);
        param_3 = param_2;
      }
      RC4(key,param_4,param_3,param_2);
    }
    uVar3 = 1;
    key->data[0x84] = 0xffffffff;
    key->data[0x85] = 0xffffffff;
  }
  return uVar3;
}

