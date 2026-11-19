/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b087c4
 */

stack_st_X509_ATTRIBUTE *
X509at_add1_attr_by_txt(stack_st_X509_ATTRIBUTE **x,char *attrname,int type,uchar *bytes,int len)

{
  ASN1_OBJECT *obj;
  X509_ATTRIBUTE *attr;
  stack_st_X509_ATTRIBUTE *psVar1;
  
  obj = OBJ_txt2obj(attrname,0);
  if (obj == (ASN1_OBJECT *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_att.c",0x13a,"X509_ATTRIBUTE_create_by_txt");
    ERR_set_error(0xb,0x77,"name=%s",attrname);
  }
  else {
    attr = X509_ATTRIBUTE_create_by_OBJ((X509_ATTRIBUTE **)0x0,obj,type,bytes,len);
    ASN1_OBJECT_free(obj);
    if (attr != (X509_ATTRIBUTE *)0x0) {
      psVar1 = X509at_add1_attr(x,attr);
      X509_ATTRIBUTE_free(attr);
      return psVar1;
    }
  }
  return (stack_st_X509_ATTRIBUTE *)0x0;
}

