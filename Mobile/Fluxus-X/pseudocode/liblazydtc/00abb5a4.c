/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abb5a4
 */

uchar * PKCS12_pbe_crypt_ex(undefined8 *param_1,undefined8 param_2,int param_3,uchar *param_4,
                           int param_5,undefined8 *param_6,undefined4 *param_7,undefined4 param_8,
                           undefined8 param_9,undefined8 param_10)

{
  int iVar1;
  uint uVar2;
  int iVar3;
  EVP_CIPHER_CTX *ctx;
  uchar *out;
  undefined8 uVar4;
  char *pcVar5;
  ulong uVar6;
  long lVar7;
  int local_58;
  int local_54;
  
  ctx = EVP_CIPHER_CTX_new();
  local_58 = 0;
  if (ctx == (EVP_CIPHER_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_decr.c",0x1f,"PKCS12_pbe_crypt_ex");
    uVar4 = 0xc0100;
LAB_00abb72c:
    pcVar5 = (char *)0x0;
LAB_00abb730:
    ERR_set_error(0x23,uVar4,pcVar5);
  }
  else {
    iVar1 = EVP_PBE_CipherInit_ex(*param_1,param_2,param_3,param_1[1],ctx,param_8,param_9,param_10);
    if (iVar1 != 0) {
      iVar1 = EVP_CIPHER_CTX_get_block_size(ctx);
      iVar1 = iVar1 + param_5;
      EVP_CIPHER_CTX_get0_cipher(ctx);
      uVar2 = EVP_CIPHER_get_flags();
      if ((uVar2 >> 0x19 & 1) != 0) {
        iVar3 = EVP_CIPHER_CTX_ctrl(ctx,0x16,0,&local_58);
        if (-1 < iVar3) {
          iVar3 = EVP_CIPHER_CTX_is_encrypting(ctx);
          if (iVar3 == 0) {
            if (param_5 < local_58) {
              ERR_new();
              ERR_set_debug("crypto/pkcs12/p12_decr.c",0x3a,"PKCS12_pbe_crypt_ex");
              uVar4 = 0x77;
              goto LAB_00abb72c;
            }
            param_5 = param_5 - local_58;
            iVar3 = EVP_CIPHER_CTX_ctrl(ctx,0x11,local_58,param_4 + param_5);
            if (iVar3 < 0) {
              ERR_new();
              uVar4 = 0x40;
              goto LAB_00abb7b0;
            }
          }
          else {
            iVar1 = local_58 + iVar1;
          }
          goto LAB_00abb658;
        }
        ERR_new();
        uVar4 = 0x32;
LAB_00abb7b0:
        ERR_set_debug("crypto/pkcs12/p12_decr.c",uVar4,"PKCS12_pbe_crypt_ex");
        uVar4 = 0xc0103;
        goto LAB_00abb72c;
      }
LAB_00abb658:
      out = CRYPTO_malloc(iVar1,"crypto/pkcs12/p12_decr.c",0x46);
      if (out == (uchar *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/pkcs12/p12_decr.c",0x47,"PKCS12_pbe_crypt_ex");
        ERR_set_error(0x23,0xc0100,0);
        goto LAB_00abb738;
      }
      iVar1 = EVP_CipherUpdate(ctx,out,&local_54,param_4,param_5);
      if (iVar1 == 0) {
        CRYPTO_free(out);
        ERR_new();
        ERR_set_debug("crypto/pkcs12/p12_decr.c",0x4e,"PKCS12_pbe_crypt_ex");
        uVar4 = 0x80006;
        goto LAB_00abb72c;
      }
      lVar7 = (long)local_54;
      iVar1 = EVP_CipherFinal_ex(ctx,out + lVar7,&local_54);
      if (iVar1 != 0) {
        uVar6 = local_54 + lVar7;
        EVP_CIPHER_CTX_get0_cipher(ctx);
        uVar2 = EVP_CIPHER_get_flags();
        if (((uVar2 >> 0x19 & 1) != 0) && (iVar1 = EVP_CIPHER_CTX_is_encrypting(ctx), iVar1 != 0)) {
          iVar1 = EVP_CIPHER_CTX_ctrl(ctx,0x10,local_58,out + uVar6);
          if (iVar1 < 0) {
            CRYPTO_free(out);
            ERR_new();
            uVar4 = 99;
            goto LAB_00abb7b0;
          }
          uVar6 = (ulong)(uint)(local_58 + (int)uVar6);
        }
        if (param_7 != (undefined4 *)0x0) {
          *param_7 = (int)uVar6;
        }
        if (param_6 != (undefined8 *)0x0) {
          *param_6 = out;
        }
        goto LAB_00abb738;
      }
      CRYPTO_free(out);
      ERR_new();
      ERR_set_debug("crypto/pkcs12/p12_decr.c",0x56,"PKCS12_pbe_crypt_ex");
      pcVar5 = "empty password";
      if (param_3 != 0) {
        pcVar5 = "maybe wrong password";
      }
      uVar4 = 0x74;
      goto LAB_00abb730;
    }
  }
  out = (uchar *)0x0;
LAB_00abb738:
  EVP_CIPHER_CTX_free(ctx);
  return out;
}

