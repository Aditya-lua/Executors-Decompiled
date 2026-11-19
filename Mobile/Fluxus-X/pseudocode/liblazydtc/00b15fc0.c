/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15fc0
 */

X509_REQ * d2i_X509_REQ_bio(BIO *bp,X509_REQ **req)

{
  undefined8 uVar1;
  X509_REQ *pXVar2;
  X509_ALGOR *pXVar3;
  ASN1_BIT_STRING *pAVar4;
  
  if ((req == (X509_REQ **)0x0) || (pXVar2 = *req, pXVar2 == (X509_REQ *)0x0)) {
    pXVar3 = (X509_ALGOR *)0x0;
    pAVar4 = (ASN1_BIT_STRING *)0x0;
  }
  else {
    pXVar3 = pXVar2[3].sig_alg;
    pAVar4 = pXVar2[3].signature;
  }
  uVar1 = X509_REQ_it();
  pXVar2 = (X509_REQ *)ASN1_item_d2i_bio_ex(uVar1,bp,req,pXVar3,pAVar4);
  return pXVar2;
}

