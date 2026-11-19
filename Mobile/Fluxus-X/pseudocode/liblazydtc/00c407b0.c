/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c407b0
 */

X509_EXTENSION *
X509_EXTENSION_create_by_OBJ(X509_EXTENSION **ex,ASN1_OBJECT *obj,int crit,ASN1_OCTET_STRING *data)

{
  X509_EXTENSION *pXVar1;
  
  pXVar1 = X509_EXTENSION_create_by_OBJ(ex,obj,crit,data);
  return pXVar1;
}

