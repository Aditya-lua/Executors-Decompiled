/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8b340
 */

/* WARNING: Type propagation algorithm not settling */

ulong FUN_00a8b340(EVP_CIPHER_CTX *param_1,void *param_2,void *param_3,ulong param_4)

{
  long lVar1;
  size_t len;
  int iVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  ulong uVar6;
  void *a;
  
  lVar4 = EVP_CIPHER_CTX_get_cipher_data();
  if (*(int *)(lVar4 + 0x118) == 0) {
    return 0xffffffff;
  }
  if (*(int *)(lVar4 + 0x2ec) < 0) {
    if (*(int *)(lVar4 + 0x11c) == 0) {
      return 0xffffffff;
    }
    if (param_3 != (void *)0x0) {
      if (param_2 == (void *)0x0) {
        iVar3 = CRYPTO_gcm128_aad(lVar4 + 0x120,param_3,param_4);
      }
      else {
        iVar3 = EVP_CIPHER_CTX_is_encrypting(param_1);
        if (iVar3 == 0) {
          iVar3 = CRYPTO_gcm128_decrypt(lVar4 + 0x120,param_3,param_2,param_4);
        }
        else {
          iVar3 = CRYPTO_gcm128_encrypt();
        }
      }
      if (iVar3 == 0) {
        return param_4 & 0xffffffff;
      }
      return 0xffffffff;
    }
    iVar3 = EVP_CIPHER_CTX_is_encrypting(param_1);
    if (iVar3 == 0) {
      if (*(int *)(lVar4 + 0x2e4) < 0) {
        return 0xffffffff;
      }
      uVar5 = EVP_CIPHER_CTX_buf_noconst(param_1);
      uVar6 = CRYPTO_gcm128_finish(lVar4 + 0x120,uVar5,(long)*(int *)(lVar4 + 0x2e4));
      if ((int)uVar6 != 0) {
        return 0xffffffff;
      }
    }
    else {
      uVar5 = EVP_CIPHER_CTX_buf_noconst(param_1);
      CRYPTO_gcm128_tag(lVar4 + 0x120,uVar5,0x10);
      uVar6 = 0;
      *(undefined4 *)(lVar4 + 0x2e4) = 0x10;
    }
    *(undefined4 *)(lVar4 + 0x11c) = 0;
    return uVar6;
  }
  lVar4 = EVP_CIPHER_CTX_get_cipher_data(param_1);
  if (param_2 != param_3) {
    return 0xffffffff;
  }
  len = param_4 - 0x18;
  if (param_4 < 0x18) {
    return 0xffffffff;
  }
  iVar2 = EVP_CIPHER_CTX_is_encrypting(param_1);
  iVar3 = 0x18;
  if (iVar2 != 0) {
    iVar3 = 0x13;
  }
  iVar3 = EVP_CIPHER_CTX_ctrl(param_1,iVar3,8,param_3);
  if (0 < iVar3) {
    lVar1 = lVar4 + 0x120;
    uVar5 = EVP_CIPHER_CTX_buf_noconst(param_1);
    iVar3 = CRYPTO_gcm128_aad(lVar1,uVar5,(long)*(int *)(lVar4 + 0x2ec));
    if (iVar3 == 0) {
      param_3 = (void *)((long)param_3 + 8);
      iVar3 = EVP_CIPHER_CTX_is_encrypting(param_1);
      if (iVar3 == 0) {
        iVar3 = CRYPTO_gcm128_decrypt(lVar1,param_3,param_3,len);
        if (iVar3 == 0) {
          uVar5 = EVP_CIPHER_CTX_buf_noconst(param_1);
          CRYPTO_gcm128_tag(lVar1,uVar5,0x10);
          a = (void *)EVP_CIPHER_CTX_buf_noconst(param_1);
          iVar3 = CRYPTO_memcmp(a,(void *)((long)param_3 + len),0x10);
          if (iVar3 == 0) {
            param_4 = len & 0xffffffff;
            goto LAB_00a8b3f0;
          }
          OPENSSL_cleanse(param_3,len);
        }
      }
      else {
        iVar3 = CRYPTO_gcm128_encrypt(lVar1,param_3,param_3,len);
        if (iVar3 == 0) {
          CRYPTO_gcm128_tag(lVar1,(long)param_3 + len,0x10);
          param_4 = param_4 & 0xffffffff;
          goto LAB_00a8b3f0;
        }
      }
    }
  }
  param_4 = 0xffffffff;
LAB_00a8b3f0:
  *(undefined4 *)(lVar4 + 0x11c) = 0;
  *(undefined4 *)(lVar4 + 0x2ec) = 0xffffffff;
  return param_4;
}

