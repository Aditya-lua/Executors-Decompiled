/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5b77c
 */

int EVP_DecryptFinal_ex(EVP_CIPHER_CTX *ctx,uchar *outm,int *outl)

{
  byte bVar1;
  uchar *puVar2;
  int iVar3;
  undefined8 uVar4;
  uint uVar5;
  EVP_CIPHER *pEVar6;
  ulong uVar7;
  long lVar8;
  uint uVar9;
  ulong uVar10;
  uint uVar11;
  uchar *puVar12;
  uchar *puVar13;
  ulong uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  ulong local_28;
  
  if (outl == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/evp_enc.c",0x3ae,"EVP_DecryptFinal_ex");
    uVar4 = 0xc0102;
  }
  else {
    *outl = 0;
    if (ctx->encrypt == 0) {
      pEVar6 = ctx->cipher;
      if (pEVar6 == (EVP_CIPHER *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/evp/evp_enc.c",0x3b9,"EVP_DecryptFinal_ex");
        uVar4 = 0x83;
      }
      else if (pEVar6[1].do_cipher == (_func_1090 *)0x0) {
        *outl = 0;
        if ((*(byte *)((long)&pEVar6->flags + 2) >> 4 & 1) != 0) {
          iVar3 = (*pEVar6->cleanup)(ctx);
          if (iVar3 < 0) {
            return 0;
          }
          *outl = iVar3;
          return 1;
        }
        if ((ctx->flags & 0x100) == 0) {
          uVar11 = pEVar6->block_size;
          uVar5 = 0;
          if (uVar11 < 2) goto LAB_00a5ba6c;
          if ((ctx->buf_len == 0) && (ctx->final_used != 0)) {
            if (0x20 < uVar11) {
                    /* WARNING: Subroutine does not return */
              OPENSSL_die("assertion failed: b <= sizeof(ctx->final)","crypto/evp/evp_enc.c",0x3ef);
            }
            uVar7 = (ulong)(uVar11 - 1);
            bVar1 = ctx->final[uVar7];
            uVar9 = (uint)bVar1;
            if ((uVar9 != 0) && (uVar5 = uVar11 - uVar9, (int)uVar9 <= (int)uVar11)) {
              uVar11 = 0;
              do {
                if ((uint)ctx->final[uVar7] != (uint)bVar1) {
                  ERR_new();
                  uVar4 = 0x3fc;
                  goto LAB_00a5baac;
                }
                uVar11 = uVar11 + 1;
                uVar7 = (ulong)((int)uVar7 - 1);
              } while (uVar11 < bVar1);
              if (0 < (int)uVar5) {
                uVar10 = 0;
                uVar7 = (ulong)uVar5;
                if ((0x1f < uVar5) &&
                   ((ctx->final + uVar7 <= outm || (uVar10 = 0, outm + uVar7 <= ctx->final)))) {
                  uVar10 = uVar7 & 0xffffffe0;
                  puVar12 = ctx->final + 0x10;
                  puVar13 = outm + 0x10;
                  uVar14 = uVar10;
                  do {
                    puVar2 = puVar12 + -8;
                    uVar4 = *(undefined8 *)(puVar12 + -0x10);
                    uVar16 = *(undefined8 *)(puVar12 + 8);
                    uVar15 = *(undefined8 *)puVar12;
                    puVar12 = puVar12 + 0x20;
                    uVar14 = uVar14 - 0x20;
                    *(undefined8 *)(puVar13 + -8) = *(undefined8 *)puVar2;
                    *(undefined8 *)(puVar13 + -0x10) = uVar4;
                    *(undefined8 *)(puVar13 + 8) = uVar16;
                    *(undefined8 *)puVar13 = uVar15;
                    puVar13 = puVar13 + 0x20;
                  } while (uVar14 != 0);
                  if (uVar10 == uVar7) goto LAB_00a5ba6c;
                }
                lVar8 = uVar7 - uVar10;
                puVar12 = outm + uVar10;
                puVar13 = ctx->final + uVar10;
                do {
                  lVar8 = lVar8 + -1;
                  *puVar12 = *puVar13;
                  puVar12 = puVar12 + 1;
                  puVar13 = puVar13 + 1;
                } while (lVar8 != 0);
              }
LAB_00a5ba6c:
              *outl = uVar5;
              return 1;
            }
            ERR_new();
            uVar4 = 0x3f7;
LAB_00a5baac:
            ERR_set_debug("crypto/evp/evp_enc.c",uVar4,"EVP_DecryptFinal_ex");
            uVar4 = 100;
          }
          else {
            ERR_new();
            ERR_set_debug("crypto/evp/evp_enc.c",0x3ec,"EVP_DecryptFinal_ex");
            uVar4 = 0x6d;
          }
        }
        else {
          if (ctx->buf_len == 0) {
            *outl = 0;
            return 1;
          }
          ERR_new();
          ERR_set_debug("crypto/evp/evp_enc.c",0x3e4,"EVP_DecryptFinal_ex");
          uVar4 = 0x8a;
        }
      }
      else {
        iVar3 = EVP_CIPHER_CTX_get_block_size(ctx);
        if ((iVar3 < 1) || (*(code **)(ctx->cipher + 2) == (code *)0x0)) {
          ERR_new();
          uVar4 = 0x3c3;
        }
        else {
          lVar8 = 0;
          if (iVar3 != 1) {
            lVar8 = (long)iVar3;
          }
          iVar3 = (**(code **)(ctx->cipher + 2))(ctx[1].cipher,outm,&local_28,lVar8);
          if (iVar3 == 0) {
            return 0;
          }
          if (local_28 >> 0x1f == 0) {
            *outl = (int)local_28;
            return iVar3;
          }
          ERR_new();
          uVar4 = 0x3cc;
        }
        ERR_set_debug("crypto/evp/evp_enc.c",uVar4,"EVP_DecryptFinal_ex");
        uVar4 = 0xbc;
      }
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/evp/evp_enc.c",0x3b4,"EVP_DecryptFinal_ex");
      uVar4 = 0x94;
    }
  }
  ERR_set_error(6,uVar4,0);
  return 0;
}

