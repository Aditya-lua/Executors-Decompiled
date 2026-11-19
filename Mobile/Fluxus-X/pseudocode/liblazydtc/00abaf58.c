/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abaf58
 */

PKCS7 * PKCS12_pack_p7data(stack_st_PKCS12_SAFEBAG *sk)

{
  PKCS7 *a;
  ASN1_OBJECT *pAVar1;
  ASN1_OCTET_STRING *pAVar2;
  ASN1_ITEM *it;
  ASN1_STRING *pAVar3;
  undefined8 uVar4;
  
  a = PKCS7_new();
  if (a == (PKCS7 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_add.c",0x36,"PKCS12_pack_p7data");
    ERR_set_error(0x23,0xc0100,0);
  }
  else {
    pAVar1 = OBJ_nid2obj(0x15);
    a->type = pAVar1;
    pAVar2 = ASN1_OCTET_STRING_new();
    (a->d).data = pAVar2;
    if (pAVar2 == (ASN1_OCTET_STRING *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/pkcs12/p12_add.c",0x3b,"PKCS12_pack_p7data");
      uVar4 = 0xc0100;
    }
    else {
      it = (ASN1_ITEM *)PKCS12_SAFEBAGS_it();
      pAVar3 = ASN1_item_pack(sk,it,&(a->d).data);
      if (pAVar3 != (ASN1_STRING *)0x0) {
        return a;
      }
      ERR_new();
      ERR_set_debug("crypto/pkcs12/p12_add.c",0x40,"PKCS12_pack_p7data");
      uVar4 = 100;
    }
    ERR_set_error(0x23,uVar4,0);
    PKCS7_free(a);
  }
  return (PKCS7 *)0x0;
}

