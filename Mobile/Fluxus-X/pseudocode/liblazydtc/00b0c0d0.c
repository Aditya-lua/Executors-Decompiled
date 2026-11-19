/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c0d0
 */

int X509_REQ_check_private_key(X509_REQ *x509,EVP_PKEY *pkey)

{
  undefined4 uVar1;
  EVP_PKEY *pkey_00;
  undefined8 uVar2;
  int iVar3;
  
  if (x509 == (X509_REQ *)0x0) {
    pkey_00 = (EVP_PKEY *)0x0;
  }
  else {
    pkey_00 = X509_PUBKEY_get((X509_PUBKEY *)x509[1].sig_alg);
  }
  uVar1 = EVP_PKEY_eq(pkey_00,pkey);
  switch(uVar1) {
  case 0:
    ERR_new();
    ERR_set_debug("crypto/x509/x509_req.c",0x5d,"X509_REQ_check_private_key");
    uVar2 = 0x74;
    break;
  case 1:
    iVar3 = 1;
    goto LAB_00b0c1ac;
  case 0xfffffffe:
    ERR_new();
    ERR_set_debug("crypto/x509/x509_req.c",99,"X509_REQ_check_private_key");
    uVar2 = 0x75;
    break;
  case 0xffffffff:
    ERR_new();
    ERR_set_debug("crypto/x509/x509_req.c",0x60,"X509_REQ_check_private_key");
    uVar2 = 0x73;
    break;
  default:
    goto switchD_00b0c120_default;
  }
  ERR_set_error(0xb,uVar2,0);
switchD_00b0c120_default:
  iVar3 = 0;
LAB_00b0c1ac:
  EVP_PKEY_free(pkey_00);
  return iVar3;
}

