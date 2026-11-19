/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14920
 */

int X509_CRL_set_version(X509_CRL *x,long version)

{
  int iVar1;
  X509_CRL_INFO *a;
  
  if (x == (X509_CRL *)0x0) {
    return 0;
  }
  a = x->crl;
  if (a == (X509_CRL_INFO *)0x0) {
    a = (X509_CRL_INFO *)ASN1_INTEGER_new();
    x->crl = a;
    if (a == (X509_CRL_INFO *)0x0) {
      return 0;
    }
  }
  iVar1 = ASN1_INTEGER_set((ASN1_INTEGER *)a,version);
  return iVar1;
}

