/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08278
 */

stack_st_X509_ATTRIBUTE *
X509at_add1_attr_by_OBJ(stack_st_X509_ATTRIBUTE **x,ASN1_OBJECT *obj,int type,uchar *bytes,int len)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  X509_ATTRIBUTE *a;
  undefined8 uVar4;
  stack_st_X509_ATTRIBUTE *psVar5;
  int iVar6;
  
  if ((x == (stack_st_X509_ATTRIBUTE **)0x0) || (obj == (ASN1_OBJECT *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_att.c",0x93,"X509at_add1_attr_by_OBJ");
    uVar4 = 0xc0102;
LAB_00b0835c:
    ERR_set_error(0xb,uVar4,0);
  }
  else {
    psVar5 = *x;
    if ((psVar5 != (stack_st_X509_ATTRIBUTE *)0x0) && (iVar1 = OPENSSL_sk_num(psVar5), 0 < iVar1)) {
      iVar6 = 0;
      do {
        puVar3 = (undefined8 *)OPENSSL_sk_value(psVar5,iVar6);
        iVar2 = OBJ_cmp((ASN1_OBJECT *)*puVar3,obj);
        if (iVar2 == 0) {
          ERR_new();
          ERR_set_debug("crypto/x509/x509_att.c",0x97,"X509at_add1_attr_by_OBJ");
          uVar4 = 0x8c;
          goto LAB_00b0835c;
        }
        iVar6 = iVar6 + 1;
      } while (iVar6 < iVar1);
    }
    a = X509_ATTRIBUTE_create_by_OBJ((X509_ATTRIBUTE **)0x0,obj,type,bytes,len);
    if (a != (X509_ATTRIBUTE *)0x0) {
      psVar5 = (stack_st_X509_ATTRIBUTE *)ossl_x509at_add1_attr(x,a);
      X509_ATTRIBUTE_free(a);
      return psVar5;
    }
  }
  return (stack_st_X509_ATTRIBUTE *)0x0;
}

