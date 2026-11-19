/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac0b84
 */

int PKCS7_dataVerify(X509_STORE *cert_store,X509_STORE_CTX *ctx,BIO *bio,PKCS7 *p7,
                    PKCS7_SIGNER_INFO *si)

{
  int iVar1;
  X509 *x509;
  undefined8 uVar2;
  stack_st_X509 *sk;
  
  if (p7 == (PKCS7 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x3c9,"PKCS7_dataVerify");
    uVar2 = 0x8f;
  }
  else if ((p7->d).ptr == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x3ce,"PKCS7_dataVerify");
    uVar2 = 0x7a;
  }
  else {
    iVar1 = OBJ_obj2nid(p7->type);
    if (iVar1 != 0x16) {
      iVar1 = OBJ_obj2nid(p7->type);
      if (iVar1 != 0x18) {
        ERR_new();
        ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x3d7,"PKCS7_dataVerify");
        uVar2 = 0x72;
        goto LAB_00ac0d3c;
      }
    }
    sk = ((p7->d).sign)->cert;
    x509 = X509_find_by_issuer_and_serial
                     (sk,si->issuer_and_serial->issuer,si->issuer_and_serial->serial);
    if (x509 == (X509 *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/pkcs7/pk7_doit.c",0x3e1,"PKCS7_dataVerify");
      uVar2 = 0x6a;
    }
    else {
      iVar1 = X509_STORE_CTX_init(ctx,cert_store,x509,sk);
      if (iVar1 == 0) {
        ERR_new();
        uVar2 = 999;
      }
      else {
        X509_STORE_CTX_set_purpose(ctx,4);
        iVar1 = X509_verify_cert(ctx);
        if (0 < iVar1) {
          iVar1 = PKCS7_signatureVerify(bio,p7,si,x509);
          return iVar1;
        }
        ERR_new();
        uVar2 = 0x3ed;
      }
      ERR_set_debug("crypto/pkcs7/pk7_doit.c",uVar2,"PKCS7_dataVerify");
      uVar2 = 0x8000b;
    }
  }
LAB_00ac0d3c:
  ERR_set_error(0x21,uVar2,0);
  return 0;
}

