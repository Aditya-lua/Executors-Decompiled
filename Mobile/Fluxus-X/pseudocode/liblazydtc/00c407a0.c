/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c407a0
 */

X509_EXTENSION *
X509_EXTENSION_create_by_NID(X509_EXTENSION **ex,int nid,int crit,ASN1_OCTET_STRING *data)

{
  X509_EXTENSION *pXVar1;
  
  pXVar1 = X509_EXTENSION_create_by_NID(ex,nid,crit,data);
  return pXVar1;
}

