/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac2d50
 */

int PKCS7_add_crl(PKCS7 *p7,X509_CRL *x509)

{
  stack_st_X509_CRL **ppsVar1;
  int iVar2;
  stack_st_X509_CRL *psVar3;
  undefined8 uVar4;
  
  iVar2 = OBJ_obj2nid(p7->type);
  if ((iVar2 == 0x18) || (iVar2 == 0x16)) {
    ppsVar1 = &((p7->d).sign)->crl;
    if (*ppsVar1 == (stack_st_X509_CRL *)0x0) {
      psVar3 = (stack_st_X509_CRL *)OPENSSL_sk_new_null();
      *ppsVar1 = psVar3;
      if (psVar3 == (stack_st_X509_CRL *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/pkcs7/pk7_lib.c",0x125,"PKCS7_add_crl");
        uVar4 = 0xc0100;
        goto LAB_00ac2e14;
      }
    }
    X509_CRL_up_ref(x509);
    iVar2 = OPENSSL_sk_push(*ppsVar1,x509);
    if (iVar2 != 0) {
      return 1;
    }
    X509_CRL_free(x509);
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_lib.c",0x11e,"PKCS7_add_crl");
    uVar4 = 0x71;
LAB_00ac2e14:
    ERR_set_error(0x21,uVar4,0);
  }
  return 0;
}

