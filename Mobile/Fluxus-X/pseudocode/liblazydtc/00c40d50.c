/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c40d50
 */

int X509_CRL_get0_by_serial(X509_CRL *crl,X509_REVOKED **ret,ASN1_INTEGER *serial)

{
  int iVar1;
  
  iVar1 = X509_CRL_get0_by_serial(crl,ret,serial);
  return iVar1;
}

