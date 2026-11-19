/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0846c
 */

X509_ATTRIBUTE *
X509_ATTRIBUTE_create_by_NID(X509_ATTRIBUTE **attr,int nid,int atrtype,void *data,int len)

{
  ASN1_OBJECT *obj;
  X509_ATTRIBUTE *pXVar1;
  
  obj = OBJ_nid2obj(nid);
  if (obj == (ASN1_OBJECT *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_att.c",0x10a,"X509_ATTRIBUTE_create_by_NID");
    ERR_set_error(0xb,0x6d,0);
  }
  else {
    pXVar1 = X509_ATTRIBUTE_create_by_OBJ(attr,obj,atrtype,data,len);
    if (pXVar1 != (X509_ATTRIBUTE *)0x0) {
      return pXVar1;
    }
    ASN1_OBJECT_free(obj);
  }
  return (X509_ATTRIBUTE *)0x0;
}

