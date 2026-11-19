/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15674
 */

int X509_verify(X509 *a,EVP_PKEY *r)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = X509_ALGOR_cmp((X509_ALGOR *)&a->altname,(X509_ALGOR *)&a->name);
  if (iVar1 == 0) {
    uVar2 = X509_CINF_it();
    iVar1 = ASN1_item_verify_ex(uVar2,&a->altname,&a->rfc3779_addr,a,a[1].rfc3779_asid,r,
                                *(undefined8 *)a[1].sha1_hash,*(undefined8 *)(a[1].sha1_hash + 8));
    return iVar1;
  }
  return 0;
}

