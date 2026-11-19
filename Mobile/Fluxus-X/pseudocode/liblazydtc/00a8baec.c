/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8baec
 */

ulong FUN_00a8baec(long param_1,undefined8 *param_2,undefined8 *param_3,size_t param_4)

{
  int iVar1;
  long lVar2;
  undefined8 *puVar3;
  long lVar4;
  void *b;
  undefined8 uVar5;
  ulong len;
  undefined1 auStack_60 [16];
  
  lVar2 = EVP_CIPHER_CTX_get_cipher_data();
  if (*(int *)(lVar2 + 0x118) != 0) {
    if (*(int *)(lVar2 + 0x130) < 0) {
      if ((param_2 != (undefined8 *)0x0) && (len = 0, param_3 == (undefined8 *)0x0))
      goto LAB_00a8bc18;
      if (*(int *)(lVar2 + 0x11c) == 0) goto LAB_00a8bc14;
      lVar4 = lVar2 + 0x138;
      if (param_2 == (undefined8 *)0x0) {
        if (param_3 == (undefined8 *)0x0) {
          iVar1 = CRYPTO_ccm128_setiv(lVar4,param_1 + 0x28,0xf - (long)*(int *)(lVar2 + 0x128),
                                      param_4);
          if (iVar1 == 0) {
            *(undefined4 *)(lVar2 + 0x124) = 1;
            goto LAB_00a8bdfc;
          }
        }
        else if ((param_4 == 0) || (*(int *)(lVar2 + 0x124) != 0)) {
          CRYPTO_ccm128_aad(lVar4,param_3,param_4);
          goto LAB_00a8bdfc;
        }
      }
      else {
        iVar1 = EVP_CIPHER_CTX_is_encrypting(param_1);
        if ((iVar1 != 0) || (*(int *)(lVar2 + 0x120) != 0)) {
          if (*(int *)(lVar2 + 0x124) == 0) {
            iVar1 = CRYPTO_ccm128_setiv(lVar4,param_1 + 0x28,0xf - (long)*(int *)(lVar2 + 0x128),
                                        param_4);
            if (iVar1 != 0) goto LAB_00a8bc14;
            *(undefined4 *)(lVar2 + 0x124) = 1;
          }
          iVar1 = EVP_CIPHER_CTX_is_encrypting(param_1);
          if (iVar1 == 0) {
            if (*(long *)(lVar2 + 0x170) == 0) {
              iVar1 = CRYPTO_ccm128_decrypt(lVar4,param_3,param_2,param_4);
              if (iVar1 == 0) goto LAB_00a8bdac;
LAB_00a8bde4:
              OPENSSL_cleanse(param_2,param_4);
              param_4 = 0xffffffff;
            }
            else {
              iVar1 = CRYPTO_ccm128_decrypt_ccm64();
              if (iVar1 != 0) goto LAB_00a8bde4;
LAB_00a8bdac:
              lVar4 = CRYPTO_ccm128_tag(lVar4,auStack_60,(long)*(int *)(lVar2 + 300));
              if (lVar4 == 0) goto LAB_00a8bde4;
              b = (void *)EVP_CIPHER_CTX_buf_noconst(param_1);
              iVar1 = CRYPTO_memcmp(auStack_60,b,(long)*(int *)(lVar2 + 300));
              if ((iVar1 != 0) || ((int)param_4 == -1)) goto LAB_00a8bde4;
            }
            *(undefined8 *)(lVar2 + 0x11c) = 0;
            *(undefined4 *)(lVar2 + 0x124) = 0;
LAB_00a8bdfc:
            len = param_4 & 0xffffffff;
            goto LAB_00a8bc18;
          }
          if (*(long *)(lVar2 + 0x170) == 0) {
            iVar1 = CRYPTO_ccm128_encrypt(lVar4,param_3,param_2,param_4);
          }
          else {
            iVar1 = CRYPTO_ccm128_encrypt_ccm64(lVar4,param_3,param_2,param_4);
          }
          if (iVar1 == 0) {
            *(undefined4 *)(lVar2 + 0x120) = 1;
            goto LAB_00a8bdfc;
          }
        }
      }
    }
    else {
      lVar2 = EVP_CIPHER_CTX_get_cipher_data(param_1);
      if ((param_2 == param_3) && ((long)*(int *)(lVar2 + 300) + 8U <= param_4)) {
        lVar4 = lVar2 + 0x138;
        iVar1 = EVP_CIPHER_CTX_is_encrypting(param_1);
        if (iVar1 == 0) {
          uVar5 = *param_3;
        }
        else {
          puVar3 = (undefined8 *)EVP_CIPHER_CTX_buf_noconst(param_1);
          uVar5 = *puVar3;
          *param_3 = uVar5;
        }
        *(undefined8 *)(param_1 + 0x2c) = uVar5;
        len = param_4 - ((long)*(int *)(lVar2 + 300) + 8);
        iVar1 = CRYPTO_ccm128_setiv(lVar4,param_1 + 0x28,0xf - (long)*(int *)(lVar2 + 0x128),len);
        if (iVar1 == 0) {
          uVar5 = EVP_CIPHER_CTX_buf_noconst(param_1);
          CRYPTO_ccm128_aad(lVar4,uVar5,(long)*(int *)(lVar2 + 0x130));
          param_3 = param_3 + 1;
          iVar1 = EVP_CIPHER_CTX_is_encrypting(param_1);
          if (iVar1 == 0) {
            if (*(long *)(lVar2 + 0x170) == 0) {
              iVar1 = CRYPTO_ccm128_decrypt(lVar4,param_3,param_3,len);
            }
            else {
              iVar1 = CRYPTO_ccm128_decrypt_ccm64(lVar4,param_3,param_3,len);
            }
            if (((iVar1 == 0) &&
                (lVar4 = CRYPTO_ccm128_tag(lVar4,auStack_60,(long)*(int *)(lVar2 + 300)), lVar4 != 0
                )) && (iVar1 = CRYPTO_memcmp(auStack_60,(void *)((long)param_3 + len),
                                             (long)*(int *)(lVar2 + 300)), iVar1 == 0))
            goto LAB_00a8bc18;
            OPENSSL_cleanse(param_3,len);
          }
          else {
            if (*(long *)(lVar2 + 0x170) == 0) {
              iVar1 = CRYPTO_ccm128_encrypt(lVar4,param_3,param_3,len);
            }
            else {
              iVar1 = CRYPTO_ccm128_encrypt_ccm64(lVar4,param_3,param_3,len);
            }
            if ((iVar1 == 0) &&
               (lVar4 = CRYPTO_ccm128_tag(lVar4,(long)param_3 + len,(long)*(int *)(lVar2 + 300)),
               lVar4 != 0)) {
              len = (ulong)((int)len + *(int *)(lVar2 + 300) + 8);
              goto LAB_00a8bc18;
            }
          }
        }
      }
    }
  }
LAB_00a8bc14:
  len = 0xffffffff;
LAB_00a8bc18:
  return len & 0xffffffff;
}

