/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08b78
 */

int X509_ATTRIBUTE_set1_data(X509_ATTRIBUTE *attr,int attrtype,void *data,int len)

{
  int iVar1;
  int iVar2;
  ASN1_STRING *str;
  ASN1_TYPE *a;
  
  if (attr == (X509_ATTRIBUTE *)0x0) {
    return 0;
  }
  if (((uint)attrtype >> 0xc & 1) == 0) {
    if (len == -1) {
      str = (ASN1_STRING *)0x0;
      iVar1 = 0;
    }
    else {
      str = ASN1_STRING_type_new(attrtype);
      if ((str == (ASN1_STRING *)0x0) ||
         (iVar2 = ASN1_STRING_set(str,data,len), iVar1 = attrtype, iVar2 == 0)) {
        a = (ASN1_TYPE *)0x0;
        goto LAB_00b08cc4;
      }
    }
  }
  else {
    iVar1 = OBJ_obj2nid(attr->object);
    str = ASN1_STRING_set_by_NID((ASN1_STRING **)0x0,data,len,attrtype,iVar1);
    if (str == (ASN1_STRING *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/x509_att.c",0x158,"X509_ATTRIBUTE_set1_data");
      ERR_set_error(0xb,0x8000d,0);
      return 0;
    }
    iVar1 = str->type;
  }
  if (attrtype == 0) {
    ASN1_STRING_free(str);
    return 1;
  }
  a = ASN1_TYPE_new();
  if (a != (ASN1_TYPE *)0x0) {
    if ((((uint)attrtype >> 0xc & 1) == 0) && (len == -1)) {
      iVar1 = ASN1_TYPE_set1(a,attrtype,data);
      if (iVar1 == 0) goto LAB_00b08cc4;
    }
    else {
      ASN1_TYPE_set(a,iVar1,str);
      str = (ASN1_STRING *)0x0;
    }
    iVar1 = OPENSSL_sk_push(*(undefined8 *)&attr->single,a);
    if (iVar1 != 0) {
      return 1;
    }
  }
LAB_00b08cc4:
  ERR_new();
  ERR_set_debug("crypto/x509/x509_att.c",0x179,"X509_ATTRIBUTE_set1_data");
  ERR_set_error(0xb,0xc0100,0);
  ASN1_TYPE_free(a);
  ASN1_STRING_free(str);
  return 0;
}

