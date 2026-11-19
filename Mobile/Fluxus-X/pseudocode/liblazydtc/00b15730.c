/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15730
 */

int X509_REQ_verify(X509_REQ *a,EVP_PKEY *r)

{
  undefined4 uVar1;
  int iVar2;
  
  uVar1 = X509_REQ_INFO_it();
  iVar2 = ASN1_item_verify_ex(uVar1,&a[1].references,a[2].sig_alg,a,a[3].req_info,r,0,0);
  return iVar2;
}

