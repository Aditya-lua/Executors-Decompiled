/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a947ac
 */

ulong FUN_00a947ac(long param_1,uchar *param_2,uchar *param_3,ulong param_4)

{
  uchar *__dest;
  int iVar1;
  long lVar2;
  DES_key_schedule *pDVar3;
  DES_cblock *ivec;
  uint uVar4;
  size_t siz;
  size_t siz_00;
  undefined8 local_78 [3];
  uchar auStack_60 [8];
  uchar auStack_58 [8];
  
  if ((param_4 & 0xffffffffc0000007) == 0) {
    iVar1 = ossl_is_partially_overlapping(param_2,param_3,param_4 & 0xffffffff);
    if (iVar1 != 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/e_des3.c",0x18e,"des_ede3_wrap_cipher");
      ERR_set_error(6,0xa2,0);
      siz_00 = 0;
      goto LAB_00a9482c;
    }
    iVar1 = EVP_CIPHER_CTX_is_encrypting(param_1);
    if (iVar1 == 0) {
      if (0x17 < param_4) {
        if (param_2 == (uchar *)0x0) {
          siz_00 = (size_t)((int)param_4 - 0x10);
          goto LAB_00a9482c;
        }
        ivec = (DES_cblock *)(param_1 + 0x28);
        *ivec = (DES_cblock)0x521e8792ca2dd4a;
        pDVar3 = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data(param_1);
                    /* WARNING: Load size is inaccurate */
        if (pDVar3[3].ks[0].cblock[0] == (DES_cblock)0x0) {
          iVar1 = EVP_CIPHER_CTX_is_encrypting(param_1);
          DES_ede3_cbc_encrypt(param_3,auStack_58,8,pDVar3,pDVar3 + 1,pDVar3 + 2,ivec,iVar1);
        }
        else {
          (*(code *)pDVar3[3].ks[0].cblock[0])(param_3,auStack_58,8,pDVar3,ivec);
        }
        if (param_2 == param_3) {
          memmove(param_2,param_2 + 8,param_4 - 8);
          param_3 = param_2 + -8;
        }
        siz = param_4 - 0x10;
        FUN_00a93ef8(param_1,param_2,param_3 + 8,siz);
        pDVar3 = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data(param_1);
                    /* WARNING: Load size is inaccurate */
        if (pDVar3[3].ks[0].cblock[0] == (DES_cblock)0x0) {
          iVar1 = EVP_CIPHER_CTX_is_encrypting(param_1);
          DES_ede3_cbc_encrypt
                    (param_3 + (param_4 - 8),auStack_60,8,pDVar3,pDVar3 + 1,pDVar3 + 2,ivec,iVar1);
        }
        else {
          (*(code *)pDVar3[3].ks[0].cblock[0])(param_3 + (param_4 - 8),auStack_60,8,pDVar3,ivec);
        }
        BUF_reverse(auStack_58,(uchar *)0x0,8);
        BUF_reverse(param_2,(uchar *)0x0,siz);
        BUF_reverse((uchar *)ivec,auStack_60,8);
        FUN_00a93ef8(param_1,param_2,param_2,siz);
        pDVar3 = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data(param_1);
                    /* WARNING: Load size is inaccurate */
        if (pDVar3[3].ks[0].cblock[0] == (DES_cblock)0x0) {
          iVar1 = EVP_CIPHER_CTX_is_encrypting(param_1);
          DES_ede3_cbc_encrypt(auStack_58,auStack_58,8,pDVar3,pDVar3 + 1,pDVar3 + 2,ivec,iVar1);
        }
        else {
          (*(code *)pDVar3[3].ks[0].cblock[0])(auStack_58,auStack_58,8,pDVar3,ivec);
        }
        lVar2 = ossl_sha1(param_2,siz,local_78);
        if (lVar2 == 0) {
          siz_00 = 0xffffffff;
        }
        else {
          iVar1 = CRYPTO_memcmp(local_78,auStack_58,8);
          uVar4 = (uint)siz;
          if (iVar1 != 0) {
            uVar4 = 0xffffffff;
          }
          siz_00 = (size_t)uVar4;
        }
        OPENSSL_cleanse(auStack_58,8);
        OPENSSL_cleanse(local_78,0x14);
        OPENSSL_cleanse(auStack_60,8);
        OPENSSL_cleanse(ivec,8);
        if ((int)siz_00 != -1) goto LAB_00a9482c;
        OPENSSL_cleanse(param_2,siz);
      }
    }
    else {
      if (param_2 == (uchar *)0x0) {
        siz_00 = (size_t)((int)param_4 + 0x10);
        goto LAB_00a9482c;
      }
      __dest = param_2 + 8;
      memmove(__dest,param_3,param_4);
      lVar2 = ossl_sha1(param_3,param_4,local_78);
      if (lVar2 != 0) {
        *(undefined8 *)(param_2 + param_4 + 8) = local_78[0];
        OPENSSL_cleanse(local_78,0x14);
        iVar1 = RAND_bytes((uchar *)(param_1 + 0x28),8);
        if (0 < iVar1) {
          *(undefined8 *)param_2 = *(undefined8 *)(param_1 + 0x28);
          FUN_00a93ef8(param_1,__dest,__dest,param_4 + 8);
          siz_00 = param_4 + 0x10;
          BUF_reverse(param_2,(uchar *)0x0,siz_00);
          *(undefined8 *)(param_1 + 0x28) = 0x521e8792ca2dd4a;
          FUN_00a93ef8(param_1,param_2,param_2,siz_00);
          goto LAB_00a9482c;
        }
      }
    }
  }
  siz_00 = 0xffffffff;
LAB_00a9482c:
  return siz_00 & 0xffffffff;
}

