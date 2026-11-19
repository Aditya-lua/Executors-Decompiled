/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b168d8
 */

int X509_REQ_digest(X509_REQ *data,EVP_MD *type,uchar *md,uint *len)

{
  undefined4 uVar1;
  int iVar2;
  
  uVar1 = X509_REQ_it();
  iVar2 = ossl_asn1_item_digest_ex(uVar1,type,data,md,len,data[3].sig_alg,data[3].signature);
  return iVar2;
}

