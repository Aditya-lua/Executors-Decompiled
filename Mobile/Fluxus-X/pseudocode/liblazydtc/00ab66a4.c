/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab66a4
 */

int PEM_write_bio(BIO *bp,char *name,char *hdr,uchar *data,long len)

{
  long lVar1;
  int inl;
  int iVar2;
  int iVar3;
  int iVar4;
  int extraout_w0;
  int iVar5;
  EVP_ENCODE_CTX *ctx;
  size_t sVar6;
  uchar *out;
  undefined4 uVar7;
  int local_64;
  
  uVar7 = 0xc0100;
  ctx = (EVP_ENCODE_CTX *)EVP_ENCODE_CTX_new();
  if (ctx == (EVP_ENCODE_CTX *)0x0) {
    out = (uchar *)0x0;
  }
  else {
    EVP_EncodeInit(ctx);
    sVar6 = strlen(name);
    iVar2 = BIO_write(bp,"-----BEGIN ",0xb);
    if (iVar2 == 0xb) {
      iVar2 = (int)sVar6;
      iVar3 = BIO_write(bp,name,iVar2);
      if ((iVar3 != iVar2) || (iVar3 = BIO_write(bp,"-----\n",6), iVar3 != 6)) goto LAB_00ab6830;
      if (hdr != (char *)0x0) {
        sVar6 = strlen(hdr);
        iVar3 = (int)sVar6;
        if ((0 < iVar3) &&
           ((iVar4 = BIO_write(bp,hdr,iVar3), iVar4 != iVar3 ||
            (iVar3 = BIO_write(bp,&DAT_002c4dae,1), iVar3 != 1)))) goto LAB_00ab6830;
      }
      out = CRYPTO_malloc(0x2000,"crypto/pem/pem_lib.c",0x27c);
      if (out == (uchar *)0x0) goto LAB_00ab6844;
      if (len < 1) {
        iVar3 = 0;
      }
      else {
        iVar4 = 0;
        iVar3 = 0;
        do {
          lVar1 = len;
          if (0x13ff < len) {
            lVar1 = 0x1400;
          }
          inl = (int)lVar1;
          EVP_EncodeUpdate(ctx,out,&local_64,data + iVar4,inl);
          if (extraout_w0 == 0) goto LAB_00ab6834;
          if (local_64 == 0) {
            iVar5 = 0;
          }
          else {
            iVar5 = BIO_write(bp,out,local_64);
            if (iVar5 != local_64) goto LAB_00ab6834;
          }
          len = len - inl;
          iVar3 = iVar5 + iVar3;
          iVar4 = iVar4 + inl;
        } while (0 < len);
      }
      EVP_EncodeFinal(ctx,out,&local_64);
      if ((((local_64 < 1) || (iVar4 = BIO_write(bp,out,local_64), iVar4 == local_64)) &&
          (iVar4 = BIO_write(bp,"-----END ",9), iVar4 == 9)) &&
         (((iVar4 = BIO_write(bp,name,iVar2), iVar4 == iVar2 &&
           (iVar2 = BIO_write(bp,"-----\n",6), iVar2 == 6)) &&
          (local_64 = local_64 + iVar3, local_64 != 0)))) goto LAB_00ab6874;
    }
    else {
LAB_00ab6830:
      out = (uchar *)0x0;
    }
LAB_00ab6834:
    uVar7 = 0x80007;
  }
LAB_00ab6844:
  ERR_new();
  ERR_set_debug("crypto/pem/pem_lib.c",0x298,"PEM_write_bio");
  ERR_set_error(9,uVar7,0);
  local_64 = 0;
LAB_00ab6874:
  EVP_ENCODE_CTX_free(ctx);
  CRYPTO_clear_free(out,0x2000,"crypto/pem/pem_lib.c",0x29a);
  return local_64;
}

