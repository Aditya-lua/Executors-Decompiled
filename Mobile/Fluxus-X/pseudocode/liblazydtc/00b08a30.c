/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08a30
 */

void * X509_ATTRIBUTE_get0_data(X509_ATTRIBUTE *attr,int idx,int atrtype,void *data)

{
  int iVar1;
  ASN1_TYPE *a;
  
  if ((attr != (X509_ATTRIBUTE *)0x0) &&
     (a = (ASN1_TYPE *)OPENSSL_sk_value(*(undefined8 *)&attr->single,idx), a != (ASN1_TYPE *)0x0)) {
    if (((atrtype | 4U) != 5) && (iVar1 = ASN1_TYPE_get(a), iVar1 == atrtype)) {
      return (a->value).ptr;
    }
    ERR_new();
    ERR_set_debug("crypto/x509/x509_att.c",0x197,"X509_ATTRIBUTE_get0_data");
    ERR_set_error(0xb,0x7a,0);
  }
  return (void *)0x0;
}

