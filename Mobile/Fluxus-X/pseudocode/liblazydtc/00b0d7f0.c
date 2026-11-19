/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d7f0
 */

ASN1_OBJECT * X509_EXTENSION_get_object(X509_EXTENSION *ex)

{
  ASN1_OBJECT *pAVar1;
  
  pAVar1 = (ASN1_OBJECT *)0x0;
  if (ex != (X509_EXTENSION *)0x0) {
    pAVar1 = ex->object;
  }
  return pAVar1;
}

