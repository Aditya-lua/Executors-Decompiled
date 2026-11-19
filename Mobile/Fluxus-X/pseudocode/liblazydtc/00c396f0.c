/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c396f0
 */

ASN1_INTEGER * s2i_ASN1_INTEGER(X509V3_EXT_METHOD *meth,char *value)

{
  ASN1_INTEGER *pAVar1;
  
  pAVar1 = s2i_ASN1_INTEGER(meth,value);
  return pAVar1;
}

