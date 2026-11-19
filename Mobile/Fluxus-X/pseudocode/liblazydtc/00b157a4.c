/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b157a4
 */

int X509_sign(X509 *x,EVP_PKEY *pkey,EVP_MD *md)

{
  int iVar1;
  undefined8 uVar2;
  
  if (x == (X509 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_all.c",0x3f,"X509_sign");
    ERR_set_error(0xb,0xc0102,0);
    iVar1 = 0;
  }
  else {
    *(undefined4 *)&x->crldp = 1;
    uVar2 = X509_CINF_it();
    iVar1 = ASN1_item_sign_ex(uVar2,&x->name,&x->altname,&x->rfc3779_addr,x,0,pkey,md,
                              *(undefined8 *)x[1].sha1_hash,*(undefined8 *)(x[1].sha1_hash + 8));
  }
  return iVar1;
}

