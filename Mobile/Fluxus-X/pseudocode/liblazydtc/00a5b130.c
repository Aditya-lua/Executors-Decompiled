/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5b130
 */

int EVP_DecryptUpdate(EVP_CIPHER_CTX *ctx,uchar *out,int *outl,uchar *in,int inl)

{
  long lVar1;
  uint uVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  EVP_CIPHER *pEVar7;
  code *pcVar8;
  ulong __n;
  ulong local_58;
  
  if (outl == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/evp_enc.c",0x328,"EVP_DecryptUpdate");
    uVar6 = 0xc0102;
  }
  else {
    *outl = 0;
    if (ctx->encrypt == 0) {
      pEVar7 = ctx->cipher;
      if (pEVar7 == (EVP_CIPHER *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/evp/evp_enc.c",0x333,"EVP_DecryptUpdate");
        uVar6 = 0x83;
      }
      else if (pEVar7[1].do_cipher == (_func_1090 *)0x0) {
        uVar2 = pEVar7->block_size;
        __n = (ulong)uVar2;
        iVar5 = EVP_CIPHER_CTX_test_flags(ctx,0x2000);
        iVar4 = inl;
        if (iVar5 != 0) {
          iVar4 = inl + 0xe;
          if (-1 < inl + 7) {
            iVar4 = inl + 7;
          }
          iVar4 = iVar4 >> 3;
        }
        if ((*(byte *)((long)&ctx->cipher->flags + 2) >> 4 & 1) == 0) {
          if (inl < 1) {
            *outl = 0;
            return (uint)(inl == 0);
          }
          if ((ctx->flags & 0x100) != 0) {
            iVar4 = FUN_00a5bc20(ctx,out,outl,in,inl);
            return iVar4;
          }
          if (0x20 < uVar2) {
                    /* WARNING: Subroutine does not return */
            OPENSSL_die("assertion failed: b <= sizeof(ctx->final)","crypto/evp/evp_enc.c",0x36c);
          }
          if (ctx->final_used == 0) {
            bVar3 = false;
LAB_00a5b48c:
            iVar4 = FUN_00a5bc20(ctx,out,outl,in,inl);
            if (iVar4 == 0) {
              return 0;
            }
            if ((uVar2 < 2) || (ctx->buf_len != 0)) {
              ctx->final_used = 0;
            }
            else {
              *outl = *outl - uVar2;
              ctx->final_used = 1;
              memcpy(ctx->final,out + *outl,__n);
            }
            if (bVar3) {
              *outl = *outl + uVar2;
              return 1;
            }
            return 1;
          }
          if (out != in) {
            if (((out == in) || ((int)uVar2 < 1)) ||
               ((ulong)(long)(int)uVar2 <= (ulong)((long)out - (long)in) &&
                (ulong)((long)out - (long)in) <= (ulong)-(long)(int)uVar2)) {
              if (0x7fffffff - uVar2 < (-uVar2 & inl)) {
                ERR_new();
                ERR_set_debug("crypto/evp/evp_enc.c",0x37f,"EVP_DecryptUpdate");
                uVar6 = 0xca;
                goto LAB_00a5b1b8;
              }
              memcpy(out,ctx->final,__n);
              out = out + __n;
              bVar3 = true;
              goto LAB_00a5b48c;
            }
          }
          ERR_new();
          uVar6 = 0x372;
        }
        else {
          if (uVar2 != 1) {
LAB_00a5b3c8:
            iVar4 = (*ctx->cipher->cleanup)(ctx);
            if (iVar4 < 0) {
              *outl = 0;
              return 0;
            }
            *outl = iVar4;
            return 1;
          }
          if (((out == in) || (iVar4 < 1)) ||
             ((ulong)(long)iVar4 <= (ulong)((long)out - (long)in) &&
              (ulong)((long)out - (long)in) <= (ulong)-(long)iVar4)) goto LAB_00a5b3c8;
          ERR_new();
          uVar6 = 0x357;
        }
        ERR_set_debug("crypto/evp/evp_enc.c",uVar6,"EVP_DecryptUpdate");
        uVar6 = 0xa2;
      }
      else {
        iVar4 = EVP_CIPHER_CTX_get_block_size(ctx);
        if ((iVar4 < 1) || (pcVar8 = ctx->cipher[1].app_data, pcVar8 == (code *)0x0)) {
          ERR_new();
          uVar6 = 0x33c;
        }
        else {
          lVar1 = 0;
          if (iVar4 != 1) {
            lVar1 = (long)iVar4;
          }
          iVar4 = (*pcVar8)(ctx[1].cipher,out,&local_58,lVar1 + inl,in,(long)inl);
          if (iVar4 == 0) {
            return 0;
          }
          if (local_58 >> 0x1f == 0) {
            *outl = (int)local_58;
            return iVar4;
          }
          ERR_new();
          uVar6 = 0x345;
        }
        ERR_set_debug("crypto/evp/evp_enc.c",uVar6,"EVP_DecryptUpdate");
        uVar6 = 0xbd;
      }
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/evp/evp_enc.c",0x32e,"EVP_DecryptUpdate");
      uVar6 = 0x94;
    }
  }
LAB_00a5b1b8:
  ERR_set_error(6,uVar6,0);
  return 0;
}

