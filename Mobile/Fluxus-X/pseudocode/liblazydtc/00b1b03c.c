/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b03c
 */

X509_ATTRIBUTE * X509_ATTRIBUTE_create(int nid,int atrtype,void *value)

{
  int iVar1;
  ASN1_OBJECT *pAVar2;
  X509_ATTRIBUTE *val;
  ASN1_TYPE *a;
  
  pAVar2 = OBJ_nid2obj(nid);
  if (pAVar2 != (ASN1_OBJECT *)0x0) {
    val = (X509_ATTRIBUTE *)ASN1_item_new((ASN1_ITEM *)&DAT_00c81fd0);
    if (val == (X509_ATTRIBUTE *)0x0) {
      return (X509_ATTRIBUTE *)0x0;
    }
    val->object = pAVar2;
    a = ASN1_TYPE_new();
    if ((a != (ASN1_TYPE *)0x0) &&
       (iVar1 = OPENSSL_sk_push(*(undefined8 *)&val->single,a), iVar1 != 0)) {
      ASN1_TYPE_set(a,atrtype,value);
      return val;
    }
    ASN1_item_free((ASN1_VALUE *)val,(ASN1_ITEM *)&DAT_00c81fd0);
    ASN1_TYPE_free(a);
  }
  return (X509_ATTRIBUTE *)0x0;
}

