/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ec8c4
 */

ASN1_OBJECT * d2i_ASN1_OBJECT(ASN1_OBJECT **a,uchar **pp,long length)

{
  uint uVar1;
  ASN1_OBJECT *pAVar2;
  undefined8 uVar3;
  int iStack_38;
  int local_34;
  long local_30;
  uchar *local_28;
  
  local_28 = *pp;
  uVar1 = ASN1_get_object(&local_28,&local_30,&local_34,&iStack_38,length);
  if ((uVar1 >> 7 & 1) == 0) {
    if (local_34 == 6) {
      pAVar2 = (ASN1_OBJECT *)ossl_c2i_ASN1_OBJECT(a,&local_28,local_30);
      if (pAVar2 == (ASN1_OBJECT *)0x0) {
        return (ASN1_OBJECT *)0x0;
      }
      *pp = local_28;
      return pAVar2;
    }
    uVar3 = 0x74;
  }
  else {
    uVar3 = 0x66;
  }
  ERR_new();
  ERR_set_debug("crypto/asn1/a_object.c",0xf0,"d2i_ASN1_OBJECT");
  ERR_set_error(0xd,uVar3,0);
  return (ASN1_OBJECT *)0x0;
}

