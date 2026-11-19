/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab4308
 */

int PEM_X509_INFO_write_bio
              (BIO *bp,X509_INFO *xi,EVP_CIPHER *enc,uchar *kstr,int klen,undefined1 *cd,void *u)

{
  int iVar1;
  int len;
  char *pcVar2;
  size_t sVar3;
  RSA *x;
  undefined8 uVar4;
  uchar *data;
  char local_468 [1032];
  
  if (enc == (EVP_CIPHER *)0x0) {
LAB_00ab43ac:
    if (xi->x_pkey != (X509_PKEY *)0x0) {
      data = (uchar *)xi->enc_data;
      if ((data == (uchar *)0x0) || (iVar1 = xi->enc_len, iVar1 < 1)) {
        x = (RSA *)EVP_PKEY_get0_RSA(xi->x_pkey->dec_pkey);
        iVar1 = PEM_write_bio_RSAPrivateKey(bp,x,enc,kstr,klen,cd,u);
      }
      else {
        if (enc == (EVP_CIPHER *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/pem/pem_info.c",0x100,"PEM_X509_INFO_write_bio");
          uVar4 = 0x7f;
          goto LAB_00ab439c;
        }
        pcVar2 = (char *)EVP_CIPHER_get0_name((xi->enc_cipher).cipher);
        if (pcVar2 == (char *)0x0) {
          ERR_new();
          uVar4 = 0x110;
          goto LAB_00ab4390;
        }
        local_468[0] = '\0';
        PEM_proc_type(local_468,10);
        len = EVP_CIPHER_get_iv_length(enc);
        PEM_dek_info(local_468,pcVar2,len,(char *)(xi->enc_cipher).iv);
        iVar1 = PEM_write_bio(bp,"RSA PRIVATE KEY",local_468,data,(long)iVar1);
      }
      if (iVar1 < 1) goto LAB_00ab43a4;
    }
    if ((xi->x509 == (X509 *)0x0) || (iVar1 = PEM_write_bio_X509(bp,xi->x509), 0 < iVar1)) {
      iVar1 = 1;
      goto LAB_00ab4480;
    }
  }
  else {
    pcVar2 = (char *)EVP_CIPHER_get0_name(enc);
    if (pcVar2 != (char *)0x0) {
      sVar3 = strlen(pcVar2);
      iVar1 = EVP_CIPHER_get_iv_length(enc);
      if (sVar3 + (long)(iVar1 << 1) + 0x24 < 0x401) goto LAB_00ab43ac;
    }
    ERR_new();
    uVar4 = 0xf3;
LAB_00ab4390:
    ERR_set_debug("crypto/pem/pem_info.c",uVar4,"PEM_X509_INFO_write_bio");
    uVar4 = 0x71;
LAB_00ab439c:
    ERR_set_error(9,uVar4,0);
  }
LAB_00ab43a4:
  iVar1 = 0;
LAB_00ab4480:
  OPENSSL_cleanse(local_468,0x400);
  return iVar1;
}

