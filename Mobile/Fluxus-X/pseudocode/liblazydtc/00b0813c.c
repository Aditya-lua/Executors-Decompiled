/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0813c
 */

undefined8
ossl_x509at_add1_attr_by_OBJ
          (undefined8 param_1,ASN1_OBJECT *param_2,int param_3,void *param_4,int param_5)

{
  X509_ATTRIBUTE *a;
  undefined8 uVar1;
  
  a = X509_ATTRIBUTE_create_by_OBJ((X509_ATTRIBUTE **)0x0,param_2,param_3,param_4,param_5);
  uVar1 = 0;
  if (a != (X509_ATTRIBUTE *)0x0) {
    uVar1 = ossl_x509at_add1_attr(param_1,a);
    X509_ATTRIBUTE_free(a);
  }
  return uVar1;
}

