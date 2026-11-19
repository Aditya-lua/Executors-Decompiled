/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3a130
 */

int X509_signature_dump(BIO *bp,ASN1_STRING *sig,int indent)

{
  int iVar1;
  
  iVar1 = X509_signature_dump(bp,sig,indent);
  return iVar1;
}

