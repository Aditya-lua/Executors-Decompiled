/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08040
 */

stack_st_X509_ATTRIBUTE * X509at_add1_attr(stack_st_X509_ATTRIBUTE **x,X509_ATTRIBUTE *attr)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  stack_st_X509_ATTRIBUTE *psVar5;
  ASN1_OBJECT *b;
  int iVar6;
  
  if ((x == (stack_st_X509_ATTRIBUTE **)0x0) || (attr == (X509_ATTRIBUTE *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_att.c",0x70,"X509at_add1_attr");
    uVar4 = 0xc0102;
LAB_00b080f4:
    ERR_set_error(0xb,uVar4,0);
    return (stack_st_X509_ATTRIBUTE *)0x0;
  }
  psVar5 = *x;
  if (psVar5 != (stack_st_X509_ATTRIBUTE *)0x0) {
    b = attr->object;
    iVar1 = OPENSSL_sk_num(psVar5);
    if (0 < iVar1) {
      iVar6 = 0;
      do {
        puVar3 = (undefined8 *)OPENSSL_sk_value(psVar5,iVar6);
        iVar2 = OBJ_cmp((ASN1_OBJECT *)*puVar3,b);
        if (iVar2 == 0) {
          ERR_new();
          ERR_set_debug("crypto/x509/x509_att.c",0x74,"X509at_add1_attr");
          uVar4 = 0x8c;
          goto LAB_00b080f4;
        }
        iVar6 = iVar6 + 1;
      } while (iVar6 < iVar1);
    }
  }
  psVar5 = (stack_st_X509_ATTRIBUTE *)ossl_x509at_add1_attr(x,attr);
  return psVar5;
}

