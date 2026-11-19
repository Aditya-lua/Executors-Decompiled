/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5afcc
 */

int EVP_EncryptUpdate(EVP_CIPHER_CTX *ctx,uchar *out,int *outl,uchar *in,int inl)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  EVP_CIPHER *pEVar4;
  ulong local_18;
  
  if (outl == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/evp_enc.c",0x293,"EVP_EncryptUpdate");
    uVar3 = 0xc0102;
  }
  else {
    *outl = 0;
    if (ctx->encrypt == 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/evp_enc.c",0x299,"EVP_EncryptUpdate");
      uVar3 = 0x94;
    }
    else {
      pEVar4 = ctx->cipher;
      if (pEVar4 == (EVP_CIPHER *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/evp/evp_enc.c",0x29e,"EVP_EncryptUpdate");
        uVar3 = 0x83;
      }
      else {
        if (pEVar4[1].do_cipher == (_func_1090 *)0x0) {
          iVar2 = FUN_00a5bc20(ctx,out,outl,in);
          return iVar2;
        }
        iVar2 = pEVar4->block_size;
        if ((iVar2 < 1) || (pEVar4[1].app_data == (code *)0x0)) {
          ERR_new();
          uVar3 = 0x2a8;
        }
        else {
          lVar1 = 0;
          if (iVar2 != 1) {
            lVar1 = (long)iVar2;
          }
          iVar2 = (*pEVar4[1].app_data)(ctx[1].cipher,out,&local_18,lVar1 + inl,in);
          if (iVar2 == 0) {
            return 0;
          }
          if (local_18 >> 0x1f == 0) {
            *outl = (int)local_18;
            return iVar2;
          }
          ERR_new();
          uVar3 = 0x2b2;
        }
        ERR_set_debug("crypto/evp/evp_enc.c",uVar3,"EVP_EncryptUpdate");
        uVar3 = 0xbd;
      }
    }
  }
  ERR_set_error(6,uVar3,0);
  return 0;
}

