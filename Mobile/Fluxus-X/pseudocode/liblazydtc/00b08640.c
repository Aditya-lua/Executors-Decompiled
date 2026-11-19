/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08640
 */

undefined8
ossl_x509at_add1_attr_by_txt(undefined8 param_1,char *param_2,int param_3,void *param_4,int param_5)

{
  ASN1_OBJECT *obj;
  X509_ATTRIBUTE *a;
  undefined8 uVar1;
  
  obj = OBJ_txt2obj(param_2,0);
  if (obj == (ASN1_OBJECT *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_att.c",0x13a,"X509_ATTRIBUTE_create_by_txt");
    ERR_set_error(0xb,0x77,"name=%s",param_2);
  }
  else {
    a = X509_ATTRIBUTE_create_by_OBJ((X509_ATTRIBUTE **)0x0,obj,param_3,param_4,param_5);
    ASN1_OBJECT_free(obj);
    if (a != (X509_ATTRIBUTE *)0x0) {
      uVar1 = ossl_x509at_add1_attr(param_1,a);
      X509_ATTRIBUTE_free(a);
      return uVar1;
    }
  }
  return 0;
}

