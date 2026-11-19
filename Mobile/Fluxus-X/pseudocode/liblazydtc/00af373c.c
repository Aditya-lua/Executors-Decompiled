/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af373c
 */

int X509_ocspid_print(BIO *bp,X509 *x)

{
  int iVar1;
  X509_NAME *a;
  uchar *data;
  EVP_MD *type;
  ASN1_BIT_STRING *x_00;
  void *data_00;
  ulong uVar2;
  byte local_64 [20];
  uchar *local_48;
  
  if (bp == (BIO *)0x0) {
    return 0;
  }
  if (x == (X509 *)0x0) {
    return 0;
  }
  iVar1 = BIO_printf(bp,"        Subject OCSP hash: ");
  if (iVar1 < 1) {
LAB_00af38fc:
    data = (uchar *)0x0;
  }
  else {
    a = X509_get_subject_name(x);
    iVar1 = i2d_X509_NAME(a,(uchar **)0x0);
    if (iVar1 < 1) goto LAB_00af38fc;
    data = CRYPTO_malloc(iVar1,"crypto/x509/t_x509.c",0xf4);
    local_48 = data;
    if (data != (uchar *)0x0) {
      i2d_X509_NAME(a,&local_48);
      type = (EVP_MD *)
             EVP_MD_fetch(*(undefined8 *)x[1].sha1_hash,&DAT_002d142e,
                          *(undefined8 *)(x[1].sha1_hash + 8));
      if ((type != (EVP_MD *)0x0) &&
         (iVar1 = EVP_Digest(data,(long)iVar1,local_64,(uint *)0x0,type,(ENGINE *)0x0), iVar1 != 0))
      {
        uVar2 = 0;
        do {
          iVar1 = BIO_printf(bp,"%02X",(ulong)local_64[uVar2]);
          if (iVar1 < 1) goto LAB_00af3904;
          uVar2 = uVar2 + 1;
        } while (uVar2 < 0x14);
        CRYPTO_free(data);
        iVar1 = BIO_printf(bp,"\n        Public key OCSP hash: ");
        if ((0 < iVar1) && (x_00 = X509_get0_pubkey_bitstr(x), x_00 != (ASN1_BIT_STRING *)0x0)) {
          data_00 = (void *)ASN1_STRING_get0_data();
          iVar1 = ASN1_STRING_length(x_00);
          iVar1 = EVP_Digest(data_00,(long)iVar1,local_64,(uint *)0x0,type,(ENGINE *)0x0);
          data = (uchar *)0x0;
          if (iVar1 == 0) goto LAB_00af3904;
          while (iVar1 = BIO_printf(bp,"%02X",(ulong)local_64[(long)data]), 0 < iVar1) {
            data = data + 1;
            if ((uchar *)0x13 < data) {
              BIO_printf(bp,"\n");
              EVP_MD_free(type);
              return 1;
            }
          }
        }
        data = (uchar *)0x0;
      }
      goto LAB_00af3904;
    }
  }
  type = (EVP_MD *)0x0;
LAB_00af3904:
  CRYPTO_free(data);
  EVP_MD_free(type);
  return 0;
}

