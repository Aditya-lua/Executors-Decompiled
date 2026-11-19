/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15978
 */

int X509_REQ_sign(X509_REQ *x,EVP_PKEY *pkey,EVP_MD *md)

{
  int iVar1;
  undefined8 uVar2;
  
  if (x == (X509_REQ *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_all.c",0x73,"X509_REQ_sign");
    ERR_set_error(0xb,0xc0102,0);
    iVar1 = 0;
  }
  else {
    *(undefined4 *)&x->signature = 1;
    uVar2 = X509_REQ_INFO_it();
    iVar1 = ASN1_item_sign_ex(uVar2,&x[1].references,0,x[2].sig_alg,x,0,pkey,md,x[3].sig_alg,
                              x[3].signature);
  }
  return iVar1;
}

