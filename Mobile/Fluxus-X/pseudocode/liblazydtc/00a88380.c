/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a88380
 */

ulong FUN_00a88380(long param_1,undefined8 *param_2,undefined8 *param_3,size_t param_4)

{
  int iVar1;
  long lVar2;
  undefined8 *puVar3;
  long lVar4;
  void *b;
  undefined8 uVar5;
  ulong len;
  undefined1 auStack_50 [16];
  
  lVar2 = EVP_CIPHER_CTX_get_cipher_data();
  if (*(int *)(lVar2 + 0xf8) != 0) {
    if (*(int *)(lVar2 + 0x110) < 0) {
      if ((param_2 != (undefined8 *)0x0) && (len = 0, param_3 == (undefined8 *)0x0))
      goto LAB_00a884a8;
      if (*(int *)(lVar2 + 0xfc) == 0) goto LAB_00a884a4;
      lVar4 = lVar2 + 0x118;
      if (param_2 == (undefined8 *)0x0) {
        if (param_3 == (undefined8 *)0x0) {
          iVar1 = CRYPTO_ccm128_setiv(lVar4,param_1 + 0x28,0xf - (long)*(int *)(lVar2 + 0x108),
                                      param_4);
          if (iVar1 == 0) {
            *(undefined4 *)(lVar2 + 0x104) = 1;
            goto LAB_00a88694;
          }
        }
        else if ((param_4 == 0) || (*(int *)(lVar2 + 0x104) != 0)) {
          CRYPTO_ccm128_aad(lVar4,param_3,param_4);
          goto LAB_00a88694;
        }
      }
      else {
        iVar1 = EVP_CIPHER_CTX_is_encrypting(param_1);
        if ((iVar1 != 0) || (*(int *)(lVar2 + 0x100) != 0)) {
          if (*(int *)(lVar2 + 0x104) == 0) {
            iVar1 = CRYPTO_ccm128_setiv(lVar4,param_1 + 0x28,0xf - (long)*(int *)(lVar2 + 0x108),
                                        param_4);
            if (iVar1 != 0) goto LAB_00a884a4;
            *(undefined4 *)(lVar2 + 0x104) = 1;
          }
          iVar1 = EVP_CIPHER_CTX_is_encrypting(param_1);
          if (iVar1 == 0) {
            if (*(long *)(lVar2 + 0x150) == 0) {
              iVar1 = CRYPTO_ccm128_decrypt(lVar4,param_3,param_2,param_4);
              if (iVar1 == 0) goto LAB_00a88644;
LAB_00a8867c:
              OPENSSL_cleanse(param_2,param_4);
              param_4 = 0xffffffff;
            }
            else {
              iVar1 = CRYPTO_ccm128_decrypt_ccm64(lVar4,param_3,param_2,param_4);
              if (iVar1 != 0) goto LAB_00a8867c;
LAB_00a88644:
              lVar4 = CRYPTO_ccm128_tag(lVar4,auStack_50,(long)*(int *)(lVar2 + 0x10c));
              if (lVar4 == 0) goto LAB_00a8867c;
              b = (void *)EVP_CIPHER_CTX_buf_noconst(param_1);
              iVar1 = CRYPTO_memcmp(auStack_50,b,(long)*(int *)(lVar2 + 0x10c));
              if ((iVar1 != 0) || ((int)param_4 == -1)) goto LAB_00a8867c;
            }
            *(undefined4 *)(lVar2 + 0xfc) = 0;
            *(undefined8 *)(lVar2 + 0x100) = 0;
LAB_00a88694:
            len = param_4 & 0xffffffff;
            goto LAB_00a884a8;
          }
          if (*(long *)(lVar2 + 0x150) == 0) {
            iVar1 = CRYPTO_ccm128_encrypt(lVar4,param_3,param_2,param_4);
          }
          else {
            iVar1 = CRYPTO_ccm128_encrypt_ccm64(lVar4,param_3,param_2,param_4);
          }
          if (iVar1 == 0) {
            *(undefined4 *)(lVar2 + 0x100) = 1;
            goto LAB_00a88694;
          }
        }
      }
    }
    else {
      lVar2 = EVP_CIPHER_CTX_get_cipher_data(param_1);
      if ((param_2 == param_3) && ((long)*(int *)(lVar2 + 0x10c) + 8U <= param_4)) {
        lVar4 = lVar2 + 0x118;
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
        len = param_4 - ((long)*(int *)(lVar2 + 0x10c) + 8);
        iVar1 = CRYPTO_ccm128_setiv(lVar4,param_1 + 0x28,0xf - (long)*(int *)(lVar2 + 0x108),len);
        if (iVar1 == 0) {
          uVar5 = EVP_CIPHER_CTX_buf_noconst(param_1);
          CRYPTO_ccm128_aad(lVar4,uVar5,(long)*(int *)(lVar2 + 0x110));
          param_3 = param_3 + 1;
          iVar1 = EVP_CIPHER_CTX_is_encrypting(param_1);
          if (iVar1 == 0) {
            if (*(long *)(lVar2 + 0x150) == 0) {
              iVar1 = CRYPTO_ccm128_decrypt(lVar4,param_3,param_3,len);
            }
            else {
              iVar1 = CRYPTO_ccm128_decrypt_ccm64(lVar4,param_3,param_3,len);
            }
            if (((iVar1 == 0) &&
                (lVar4 = CRYPTO_ccm128_tag(lVar4,auStack_50,(long)*(int *)(lVar2 + 0x10c)),
                lVar4 != 0)) &&
               (iVar1 = CRYPTO_memcmp(auStack_50,(void *)((long)param_3 + len),
                                      (long)*(int *)(lVar2 + 0x10c)), iVar1 == 0))
            goto LAB_00a884a8;
            OPENSSL_cleanse(param_3,len);
          }
          else {
            if (*(long *)(lVar2 + 0x150) == 0) {
              iVar1 = CRYPTO_ccm128_encrypt(lVar4,param_3,param_3,len);
            }
            else {
              iVar1 = CRYPTO_ccm128_encrypt_ccm64(lVar4,param_3,param_3,len);
            }
            if ((iVar1 == 0) &&
               (lVar4 = CRYPTO_ccm128_tag(lVar4,(long)param_3 + len,(long)*(int *)(lVar2 + 0x10c)),
               lVar4 != 0)) {
              len = (ulong)((int)len + *(int *)(lVar2 + 0x10c) + 8);
              goto LAB_00a884a8;
            }
          }
        }
      }
    }
  }
LAB_00a884a4:
  len = 0xffffffff;
LAB_00a884a8:
  return len & 0xffffffff;
}

