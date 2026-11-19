/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5bae4
 */

int EVP_EncryptFinal(EVP_CIPHER_CTX *ctx,uchar *out,int *outl)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  undefined8 uVar5;
  EVP_CIPHER *pEVar6;
  ulong uStack_38;
  
  if (outl == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/evp_enc.c",0x2d1,"EVP_EncryptFinal_ex");
    uVar5 = 0xc0102;
  }
  else {
    *outl = 0;
    if (ctx->encrypt == 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/evp_enc.c",0x2d7,"EVP_EncryptFinal_ex");
      uVar5 = 0x94;
    }
    else {
      pEVar6 = ctx->cipher;
      if (pEVar6 == (EVP_CIPHER *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/evp/evp_enc.c",0x2dc,"EVP_EncryptFinal_ex");
        uVar5 = 0x83;
      }
      else {
        if (pEVar6[1].do_cipher == (_func_1090 *)0x0) {
          if ((*(byte *)((long)&pEVar6->flags + 2) >> 4 & 1) != 0) {
            iVar4 = (*pEVar6->cleanup)(ctx);
            if (iVar4 < 0) {
              return 0;
            }
            *outl = iVar4;
            return 1;
          }
          uVar2 = pEVar6->block_size;
          if (0x20 < uVar2) {
                    /* WARNING: Subroutine does not return */
            OPENSSL_die("assertion failed: b <= sizeof(ctx->buf)","crypto/evp/evp_enc.c",0x303);
          }
          if (uVar2 - 1 != 0) {
            uVar3 = ctx->buf_len;
            if ((ctx->flags & 0x100) == 0) {
              if (uVar3 < uVar2) {
                memset(ctx->buf + uVar3,uVar2 - uVar3,(ulong)((uVar2 - 1) - uVar3) + 1);
              }
              iVar4 = (*pEVar6->cleanup)(ctx);
              if (iVar4 == 0) {
                return 0;
              }
              *outl = uVar2;
              return iVar4;
            }
            if (uVar3 != 0) {
              ERR_new();
              ERR_set_debug("crypto/evp/evp_enc.c",0x30b,"EVP_EncryptFinal_ex");
              uVar5 = 0x8a;
              goto LAB_00a5b670;
            }
          }
          *outl = 0;
          return 1;
        }
        iVar4 = EVP_CIPHER_CTX_get_block_size(ctx);
        if ((iVar4 < 1) || (*(code **)(ctx->cipher + 2) == (code *)0x0)) {
          ERR_new();
          uVar5 = 0x2e5;
        }
        else {
          lVar1 = 0;
          if (iVar4 != 1) {
            lVar1 = (long)iVar4;
          }
          iVar4 = (**(code **)(ctx->cipher + 2))(ctx[1].cipher,out,&uStack_38,lVar1);
          if (iVar4 == 0) {
            return 0;
          }
          if (uStack_38 >> 0x1f == 0) {
            *outl = (int)uStack_38;
            return iVar4;
          }
          ERR_new();
          uVar5 = 0x2ee;
        }
        ERR_set_debug("crypto/evp/evp_enc.c",uVar5,"EVP_EncryptFinal_ex");
        uVar5 = 0xbc;
      }
    }
  }
LAB_00a5b670:
  ERR_set_error(6,uVar5,0);
  return 0;
}

