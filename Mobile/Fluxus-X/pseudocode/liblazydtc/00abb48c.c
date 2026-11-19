/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abb48c
 */

stack_st_PKCS7 * PKCS12_unpack_authsafes(PKCS12 *p12)

{
  int iVar1;
  int iVar2;
  ASN1_ITEM *it;
  stack_st_PKCS7 *psVar3;
  undefined8 uVar4;
  ASN1_STRING *oct;
  
  iVar1 = OBJ_obj2nid(p12->authsafes->type);
  if (iVar1 == 0x15) {
    oct = (p12->authsafes->d).data;
    if (oct == (ASN1_STRING *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/pkcs12/p12_add.c",0xcd,"PKCS12_unpack_authsafes");
      ERR_set_error(0x23,0x65,0);
      psVar3 = (stack_st_PKCS7 *)0x0;
    }
    else {
      it = (ASN1_ITEM *)PKCS12_AUTHSAFES_it();
      psVar3 = ASN1_item_unpack(oct,it);
      if ((psVar3 != (stack_st_PKCS7 *)0x0) && (iVar1 = OPENSSL_sk_num(psVar3), 0 < iVar1)) {
        iVar1 = 0;
        do {
          uVar4 = OPENSSL_sk_value(psVar3,iVar1);
          iVar2 = ossl_pkcs7_ctx_propagate(p12->authsafes,uVar4);
          if (iVar2 == 0) {
            OPENSSL_sk_free(psVar3);
            goto LAB_00abb550;
          }
          iVar1 = iVar1 + 1;
          iVar2 = OPENSSL_sk_num(psVar3);
        } while (iVar1 < iVar2);
      }
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_add.c",200,"PKCS12_unpack_authsafes");
    ERR_set_error(0x23,0x79,0);
LAB_00abb550:
    psVar3 = (stack_st_PKCS7 *)0x0;
  }
  return psVar3;
}

