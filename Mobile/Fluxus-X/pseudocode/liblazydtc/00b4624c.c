/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4624c
 */

undefined8 FUN_00b4624c(long param_1,DES_cblock *param_2,ulong param_3,undefined8 param_4)

{
  DES_cblock *key;
  size_t __n;
  byte *out;
  uchar *key_00;
  void *__src;
  ulong uVar1;
  uchar uVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  byte bVar7;
  undefined2 uVar8;
  int iVar9;
  uint uVar10;
  bool bVar11;
  ulong uVar12;
  int iVar13;
  uint uVar14;
  EVP_CIPHER *cipher;
  ENGINE *impl;
  EVP_CIPHER_CTX *ctx;
  ulong uVar15;
  undefined8 uVar16;
  ulong uVar17;
  uint uVar18;
  ulong uVar19;
  uint uVar20;
  uint uVar21;
  ulong uVar22;
  byte *out_00;
  int local_a4;
  byte abStack_a0 [32];
  byte abStack_80 [32];
  
  iVar13 = ossl_prov_is_running();
  if (iVar13 == 0) {
    return 0;
  }
  iVar13 = FUN_00b46850(param_1,param_4);
  if (iVar13 == 0) {
    return 0;
  }
  cipher = (EVP_CIPHER *)ossl_prov_cipher_cipher(param_1 + 8);
  if (cipher == (EVP_CIPHER *)0x0) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/krb5kdf.c",0x75,"krb5kdf_derive");
    uVar16 = 0x9b;
LAB_00b4644c:
    ERR_set_error(0x39,uVar16,0);
    return 0;
  }
  if (*(long *)(param_1 + 0x20) == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/krb5kdf.c",0x79,"krb5kdf_derive");
    uVar16 = 0x80;
    goto LAB_00b4644c;
  }
  if (*(long *)(param_1 + 0x30) == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/kdfs/krb5kdf.c",0x7d,"krb5kdf_derive");
    uVar16 = 0x9c;
    goto LAB_00b4644c;
  }
  impl = (ENGINE *)ossl_prov_cipher_engine(param_1 + 8);
  key_00 = *(uchar **)(param_1 + 0x20);
  uVar1 = *(ulong *)(param_1 + 0x28);
  __src = *(void **)(param_1 + 0x30);
  uVar22 = *(ulong *)(param_1 + 0x38);
  bVar11 = false;
  if (uVar1 != param_3) {
    iVar13 = EVP_CIPHER_get_nid(cipher);
    if (((param_3 != 0x15) || (uVar1 != 0x18)) || (iVar13 != 0x2c)) {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/krb5kdf.c",0x17c,"KRB5KDF");
      uVar16 = 0x8b;
      goto LAB_00b4644c;
    }
    bVar11 = true;
  }
  ctx = EVP_CIPHER_CTX_new();
  if (ctx == (EVP_CIPHER_CTX *)0x0) {
    return 0;
  }
  iVar13 = EVP_EncryptInit_ex(ctx,cipher,impl,key_00,(uchar *)0x0);
  if (iVar13 != 0) {
    iVar13 = EVP_CIPHER_CTX_get_key_length(ctx);
    if (((uVar1 == (long)iVar13) ||
        (iVar13 = EVP_CIPHER_CTX_set_key_length(ctx,(int)uVar1), 0 < iVar13)) &&
       (iVar13 = EVP_CIPHER_CTX_set_padding(ctx,0), iVar13 != 0)) {
      uVar15 = EVP_CIPHER_CTX_get_block_size(ctx);
      uVar14 = (uint)uVar15;
      if ((ulong)(long)(int)uVar14 < uVar22) {
        ERR_new();
        ERR_set_debug("providers/implementations/kdfs/krb5kdf.c",399,"KRB5KDF");
        uVar16 = 0x9d;
      }
      else {
        uVar17 = uVar15 & 0xffffffff;
        if (uVar22 == uVar17) {
          memcpy(abStack_a0,__src,uVar22);
        }
        else {
          uVar19 = uVar17;
          if ((int)uVar22 != 0) {
            uVar15 = uVar15 & 0xffffffff;
            uVar12 = uVar22 & 0xffffffff;
            do {
              uVar19 = uVar12;
              uVar18 = 0;
              uVar21 = (uint)uVar19;
              if (uVar21 != 0) {
                uVar18 = (uint)uVar15 / uVar21;
              }
              uVar18 = (uint)uVar15 - uVar18 * uVar21;
              uVar15 = uVar19;
              uVar12 = (ulong)uVar18;
            } while (uVar18 != 0);
          }
          iVar13 = 0;
          if (uVar19 != 0) {
            iVar13 = (int)((uVar22 * uVar17) / uVar19);
          }
          memset(abStack_a0,0,uVar17);
          if (-1 < iVar13 + -1) {
            uVar18 = 0;
            uVar15 = (ulong)(iVar13 + -1);
            do {
              iVar13 = 0;
              if (uVar22 != 0) {
                iVar13 = (int)(uVar15 / uVar22);
              }
              uVar21 = 0;
              uVar20 = (uint)uVar15;
              if (uVar14 != 0) {
                uVar21 = uVar20 / uVar14;
              }
              uVar10 = uVar20 - ((uint)(iVar13 * 0xd) >> 3);
              iVar9 = uVar20 - uVar21 * uVar14;
              uVar17 = 0;
              if (uVar22 != 0) {
                uVar17 = uVar10 / uVar22;
              }
              uVar19 = 0;
              if (uVar22 != 0) {
                uVar19 = (uVar10 - 1) / uVar22;
              }
              uVar21 = iVar13 * 0xd & 7;
              uVar18 = uVar18 + abStack_a0[iVar9] +
                       ((uint)*(byte *)((long)__src + ((ulong)(uVar10 - 1) - uVar19 * uVar22)) <<
                        (ulong)(8 - uVar21 & 0x1f) & 0xff |
                       (uint)(*(byte *)((long)__src + ((ulong)uVar10 - uVar17 * uVar22)) >>
                             (ulong)uVar21));
              uVar15 = uVar15 - 1;
              abStack_a0[iVar9] = (byte)uVar18;
              uVar18 = uVar18 >> 8;
            } while (-1 < (int)uVar15);
            if ((-1 < (int)(uVar14 - 1)) && (uVar18 != 0)) {
              iVar13 = uVar14 - 2;
              do {
                bVar3 = abStack_a0[iVar13 + 1];
                abStack_a0[iVar13 + 1] = (byte)(uVar18 + bVar3);
                if (iVar13 < 0) break;
                uVar18 = uVar18 + bVar3 >> 8;
                iVar13 = iVar13 + -1;
              } while (uVar18 != 0);
            }
          }
        }
        if (param_3 != 0) {
          iVar13 = EVP_EncryptUpdate(ctx,abStack_80,&local_a4,abStack_a0,uVar14);
          if (iVar13 != 0) {
            uVar22 = 0;
            out_00 = abStack_80;
            while( true ) {
              uVar15 = (ulong)local_a4;
              iVar13 = EVP_EncryptFinal_ex(ctx,out_00,&local_a4);
              if (iVar13 == 0) break;
              if (local_a4 != 0) {
                ERR_new();
                ERR_set_debug("providers/implementations/kdfs/krb5kdf.c",0x1a4,"KRB5KDF");
                uVar16 = 0x6b;
                goto LAB_00b4638c;
              }
              __n = param_3 - uVar22;
              if (uVar15 <= param_3 - uVar22) {
                __n = uVar15;
              }
              memcpy(*param_2 + uVar22,out_00,__n);
              uVar22 = __n + uVar22;
              if (param_3 <= uVar22) goto LAB_00b466ac;
              iVar13 = EVP_CIPHER_CTX_reset(ctx);
              if (((iVar13 == 0) ||
                  (iVar13 = EVP_EncryptInit_ex(ctx,cipher,impl,key_00,(uchar *)0x0), iVar13 == 0))
                 || (((iVar13 = EVP_CIPHER_CTX_get_key_length(ctx), uVar1 != (long)iVar13 &&
                      (iVar13 = EVP_CIPHER_CTX_set_key_length(ctx,(int)uVar1), iVar13 < 1)) ||
                     (iVar13 = EVP_CIPHER_CTX_set_padding(ctx,0), iVar13 == 0)))) break;
              out = out_00 + 0x20;
              if (out_00 != abStack_a0) {
                out = abStack_a0;
              }
              iVar13 = EVP_EncryptUpdate(ctx,out,&local_a4,out_00,uVar14);
              out_00 = out;
              if (iVar13 == 0) break;
            }
          }
          goto LAB_00b46394;
        }
LAB_00b466ac:
        iVar13 = EVP_CIPHER_get_nid(cipher);
        uVar16 = 1;
        if ((bVar11) || (iVar13 != 0x2c)) goto LAB_00b46398;
        uVar14 = *(uint *)(param_2[1] + 6);
        uVar8 = *(undefined2 *)(param_2[2] + 2);
        uVar2 = param_2[2][4];
        *(uint *)param_2[2] = uVar14;
        *(undefined2 *)(param_2[2] + 4) = uVar8;
        bVar3 = param_2[2][1];
        bVar4 = param_2[2][2];
        bVar5 = param_2[2][3];
        bVar6 = param_2[2][4];
        bVar7 = param_2[2][5];
        param_2[2][6] = uVar2;
        param_2[2][7] =
             (byte)((uVar14 & 1) << 1) | (bVar3 & 1) << 2 | (bVar4 & 1) << 3 | (bVar5 & 1) << 4 |
             (bVar6 & 1) << 5 | (bVar7 & 1) << 6 | uVar2 << 7;
        DES_set_odd_parity(param_2 + 2);
        uVar14 = *(uint *)(*param_2 + 7);
        uVar8 = *(undefined2 *)(param_2[1] + 3);
        uVar2 = param_2[1][5];
        key = param_2 + 1;
        *(uint *)param_2[1] = uVar14;
        *(undefined2 *)(param_2[1] + 4) = uVar8;
        bVar3 = param_2[1][1];
        bVar4 = param_2[1][2];
        bVar5 = param_2[1][3];
        bVar6 = param_2[1][4];
        bVar7 = param_2[1][5];
        param_2[1][6] = uVar2;
        param_2[1][7] =
             (byte)((uVar14 & 1) << 1) | (bVar3 & 1) << 2 | (bVar4 & 1) << 3 | (bVar5 & 1) << 4 |
             (bVar6 & 1) << 5 | (bVar7 & 1) << 6 | uVar2 << 7;
        DES_set_odd_parity(key);
        (*param_2)[7] =
             ((*param_2)[0] & 1) << 1 | ((*param_2)[1] & 1) << 2 | ((*param_2)[2] & 1) << 3 |
             ((*param_2)[3] & 1) << 4 | ((*param_2)[4] & 1) << 5 | ((*param_2)[5] & 1) << 6 |
             (*param_2)[6] << 7;
        DES_set_odd_parity(param_2);
        iVar13 = CRYPTO_memcmp(param_2,key,8);
        if ((iVar13 != 0) && (iVar13 = CRYPTO_memcmp(key,param_2 + 2,8), iVar13 != 0)) {
          uVar16 = 1;
          goto LAB_00b46398;
        }
        ERR_new();
        ERR_set_debug("providers/implementations/kdfs/krb5kdf.c",0x1c6,"KRB5KDF");
        uVar16 = 0x79;
      }
LAB_00b4638c:
      ERR_set_error(0x39,uVar16,0);
    }
  }
LAB_00b46394:
  uVar16 = 0;
LAB_00b46398:
  EVP_CIPHER_CTX_free(ctx);
  OPENSSL_cleanse(abStack_a0,0x40);
  return uVar16;
}

