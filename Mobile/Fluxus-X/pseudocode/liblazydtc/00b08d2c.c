/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08d2c
 */

ASN1_TYPE * X509_ATTRIBUTE_get0_type(X509_ATTRIBUTE *attr,int idx)

{
  ASN1_TYPE *pAVar1;
  
  pAVar1 = (ASN1_TYPE *)0x0;
  if (attr != (X509_ATTRIBUTE *)0x0) {
    pAVar1 = (ASN1_TYPE *)OPENSSL_sk_value(*(undefined8 *)&attr->single,idx);
  }
  return pAVar1;
}

