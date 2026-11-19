/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08184
 */

X509_ATTRIBUTE *
X509_ATTRIBUTE_create_by_OBJ(X509_ATTRIBUTE **attr,ASN1_OBJECT *obj,int atrtype,void *data,int len)

{
  int iVar1;
  ASN1_OBJECT *pAVar2;
  X509_ATTRIBUTE *attr_00;
  
  if (((attr == (X509_ATTRIBUTE **)0x0) || (attr_00 = *attr, attr_00 == (X509_ATTRIBUTE *)0x0)) &&
     (attr_00 = X509_ATTRIBUTE_new(), attr_00 == (X509_ATTRIBUTE *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_att.c",0x11c,"X509_ATTRIBUTE_create_by_OBJ");
    ERR_set_error(0xb,0xc0100,0);
  }
  else {
    if ((obj != (ASN1_OBJECT *)0x0) && (attr_00 != (X509_ATTRIBUTE *)0x0)) {
      ASN1_OBJECT_free(attr_00->object);
      pAVar2 = OBJ_dup(obj);
      attr_00->object = pAVar2;
      if ((pAVar2 != (ASN1_OBJECT *)0x0) &&
         (iVar1 = X509_ATTRIBUTE_set1_data(attr_00,atrtype,data,len), iVar1 != 0)) {
        if (attr == (X509_ATTRIBUTE **)0x0) {
          return attr_00;
        }
        if (*attr == (X509_ATTRIBUTE *)0x0) {
          *attr = attr_00;
          return attr_00;
        }
        return attr_00;
      }
    }
    if ((attr == (X509_ATTRIBUTE **)0x0) || (attr_00 != *attr)) {
      X509_ATTRIBUTE_free(attr_00);
    }
  }
  return (X509_ATTRIBUTE *)0x0;
}

