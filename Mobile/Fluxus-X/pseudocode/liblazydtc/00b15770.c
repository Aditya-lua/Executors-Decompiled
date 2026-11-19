/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15770
 */

int NETSCAPE_SPKI_verify(NETSCAPE_SPKI *a,EVP_PKEY *r)

{
  int iVar1;
  ASN1_ITEM *it;
  
  it = (ASN1_ITEM *)NETSCAPE_SPKAC_it();
  iVar1 = ASN1_item_verify(it,(X509_ALGOR *)&a->sig_algor,(ASN1_BIT_STRING *)a[1].spkac,a->spkac,r);
  return iVar1;
}

