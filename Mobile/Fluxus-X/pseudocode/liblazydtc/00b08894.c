/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b08894
 */

void * X509at_get0_data_by_OBJ(stack_st_X509_ATTRIBUTE *x,ASN1_OBJECT *obj,int lastpos,int type)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  undefined8 *puVar4;
  ASN1_TYPE *a;
  long lVar5;
  uint uVar6;
  
  if (x == (stack_st_X509_ATTRIBUTE *)0x0) {
    return (void *)0x0;
  }
  uVar1 = lastpos + 1U & ((int)(lastpos + 1U) >> 0x1f ^ 0xffffffffU);
  iVar2 = OPENSSL_sk_num();
  if (iVar2 <= (int)uVar1) {
    return (void *)0x0;
  }
  while( true ) {
    uVar6 = uVar1 + 1;
    puVar4 = (undefined8 *)OPENSSL_sk_value(x,uVar1);
    iVar3 = OBJ_cmp((ASN1_OBJECT *)*puVar4,obj);
    if (iVar3 == 0) break;
    uVar1 = uVar6;
    if (iVar2 <= (int)uVar6) {
      return (void *)0x0;
    }
  }
  if (lastpos < -1) {
    iVar2 = OPENSSL_sk_num(x);
    for (; (int)uVar6 < iVar2; uVar6 = uVar6 + 1) {
      puVar4 = (undefined8 *)OPENSSL_sk_value(x,uVar6);
      iVar3 = OBJ_cmp((ASN1_OBJECT *)*puVar4,obj);
      if (iVar3 == 0) {
        return (void *)0x0;
      }
    }
  }
  iVar2 = OPENSSL_sk_num(x);
  lVar5 = 0;
  if ((int)uVar1 < iVar2) {
    lVar5 = OPENSSL_sk_value(x,uVar1);
  }
  if (lastpos < -2) {
    if (lVar5 == 0) {
      return (void *)0x0;
    }
    iVar2 = OPENSSL_sk_num(*(undefined8 *)(lVar5 + 8));
    if (iVar2 != 1) {
      return (void *)0x0;
    }
  }
  else if (lVar5 == 0) {
    return (void *)0x0;
  }
  a = (ASN1_TYPE *)OPENSSL_sk_value(*(undefined8 *)(lVar5 + 8),0);
  if (a == (ASN1_TYPE *)0x0) {
    return (void *)0x0;
  }
  if (((type | 4U) == 5) || (iVar2 = ASN1_TYPE_get(a), iVar2 != type)) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_att.c",0x197,"X509_ATTRIBUTE_get0_data");
    ERR_set_error(0xb,0x7a,0);
    return (void *)0x0;
  }
  return (a->value).ptr;
}

