/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1ce9c
 */

int X509_PUBKEY_set(X509_PUBKEY **x,EVP_PKEY *pkey)

{
  int iVar1;
  X509_PUBKEY *val;
  undefined8 uVar2;
  code *pcVar3;
  uchar *local_50;
  long local_48;
  uchar *local_38;
  
  if ((x == (X509_PUBKEY **)0x0) || (pkey == (EVP_PKEY *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_pubkey.c",0x142,"X509_PUBKEY_set");
    ERR_set_error(0xb,0xc0102,0);
    return 0;
  }
  if (*(long *)&pkey->references == 0) {
    if (*(long *)&pkey[1].save_parameters != 0) {
      local_38 = (uchar *)0x0;
      local_48 = 0;
      uVar2 = OSSL_ENCODER_CTX_new_for_pkey(pkey,0x86,&DAT_002b7291,"SubjectPublicKeyInfo",0);
      iVar1 = OSSL_ENCODER_to_data(uVar2,&local_38,&local_48);
      if (iVar1 == 0) {
        val = (X509_PUBKEY *)0x0;
      }
      else {
        local_50 = local_38;
        val = (X509_PUBKEY *)
              ASN1_item_d2i((ASN1_VALUE **)0x0,&local_50,local_48,(ASN1_ITEM *)&DAT_00c82640);
      }
      OSSL_ENCODER_CTX_free(uVar2);
      CRYPTO_free(local_38);
      if (val != (X509_PUBKEY *)0x0) {
LAB_00b1d050:
        ASN1_item_free((ASN1_VALUE *)*x,(ASN1_ITEM *)&DAT_00c82640);
        iVar1 = EVP_PKEY_up_ref(pkey);
        if (iVar1 != 0) {
          *x = val;
          if (val->pkey != (EVP_PKEY *)0x0) {
            EVP_PKEY_free(val->pkey);
          }
          val->pkey = pkey;
          return 1;
        }
        ERR_new();
        ERR_set_debug("crypto/x509/x_pubkey.c",0x16d,"X509_PUBKEY_set");
        uVar2 = 0xc0103;
        goto LAB_00b1d0e8;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/x509/x_pubkey.c",0x167,"X509_PUBKEY_set");
    ERR_set_error(0xb,0x6f,0);
    val = (X509_PUBKEY *)0x0;
  }
  else {
    val = (X509_PUBKEY *)ASN1_item_new((ASN1_ITEM *)&DAT_00c82640);
    if (val == (X509_PUBKEY *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/x_pubkey.c",0x148,"X509_PUBKEY_set");
      uVar2 = 0xc0100;
    }
    else {
      pcVar3 = *(code **)(*(long *)&pkey->references + 0x28);
      if (pcVar3 == (code *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/x509/x_pubkey.c",0x151,"X509_PUBKEY_set");
        uVar2 = 0x7c;
      }
      else {
        iVar1 = (*pcVar3)(val,pkey);
        if (iVar1 != 0) goto LAB_00b1d050;
        ERR_new();
        ERR_set_debug("crypto/x509/x_pubkey.c",0x14d,"X509_PUBKEY_set");
        uVar2 = 0x7e;
      }
    }
LAB_00b1d0e8:
    ERR_set_error(0xb,uVar2,0);
  }
  ASN1_item_free((ASN1_VALUE *)val,(ASN1_ITEM *)&DAT_00c82640);
  return 0;
}

