/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3f7c0
 */

X509 * X509_find_by_issuer_and_serial(stack_st_X509 *sk,X509_NAME *name,ASN1_INTEGER *serial)

{
  X509 *pXVar1;
  
  pXVar1 = X509_find_by_issuer_and_serial(sk,name,serial);
  return pXVar1;
}

