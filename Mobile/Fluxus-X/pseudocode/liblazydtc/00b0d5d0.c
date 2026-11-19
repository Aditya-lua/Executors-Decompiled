/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d5d0
 */

X509_EXTENSION *
X509_EXTENSION_create_by_NID(X509_EXTENSION **ex,int nid,int crit,ASN1_OCTET_STRING *data)

{
  ASN1_OBJECT *obj;
  X509_EXTENSION *pXVar1;
  
  obj = OBJ_nid2obj(nid);
  if (obj == (ASN1_OBJECT *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_v3.c",0x94,"X509_EXTENSION_create_by_NID");
    ERR_set_error(0xb,0x6d,0);
  }
  else {
    pXVar1 = X509_EXTENSION_create_by_OBJ(ex,obj,crit,data);
    if (pXVar1 != (X509_EXTENSION *)0x0) {
      return pXVar1;
    }
    ASN1_OBJECT_free(obj);
  }
  return (X509_EXTENSION *)0x0;
}

