/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b083a8
 */

undefined8
ossl_x509at_add1_attr_by_NID(undefined8 param_1,int param_2,int param_3,void *param_4,int param_5)

{
  ASN1_OBJECT *obj;
  X509_ATTRIBUTE *a;
  undefined8 uVar1;
  
  obj = OBJ_nid2obj(param_2);
  if (obj == (ASN1_OBJECT *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_att.c",0x10a,"X509_ATTRIBUTE_create_by_NID");
    ERR_set_error(0xb,0x6d,0);
  }
  else {
    a = X509_ATTRIBUTE_create_by_OBJ((X509_ATTRIBUTE **)0x0,obj,param_3,param_4,param_5);
    if (a != (X509_ATTRIBUTE *)0x0) {
      uVar1 = ossl_x509at_add1_attr(param_1,a);
      X509_ATTRIBUTE_free(a);
      return uVar1;
    }
    ASN1_OBJECT_free(obj);
  }
  return 0;
}

