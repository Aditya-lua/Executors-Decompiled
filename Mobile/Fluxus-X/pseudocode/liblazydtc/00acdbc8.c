/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acdbc8
 */

undefined8 FUN_00acdbc8(X509_PUBKEY *param_1,long param_2)

{
  int iVar1;
  int penclen;
  ASN1_ITEM *it;
  ASN1_STRING *pAVar2;
  ASN1_OBJECT *aobj;
  long lVar3;
  void *obj;
  ASN1_OCTET_STRING *local_40;
  uchar *local_38;
  
  local_40 = (ASN1_STRING *)0x0;
  local_38 = (uchar *)0x0;
  lVar3 = *(long *)(param_2 + 0x20);
  iVar1 = RSA_test_flags(lVar3,0xf000);
  if (iVar1 == 0x1000) {
    obj = *(void **)(lVar3 + 0x80);
    if (obj == (void *)0x0) {
      iVar1 = -1;
    }
    else {
      it = (ASN1_ITEM *)RSA_PSS_PARAMS_it();
      pAVar2 = ASN1_item_pack(obj,it,&local_40);
      if (pAVar2 == (ASN1_STRING *)0x0) {
        return 0;
      }
      iVar1 = 0x10;
    }
  }
  else {
    iVar1 = 5;
  }
  penclen = i2d_RSAPublicKey(*(RSA **)(param_2 + 0x20),&local_38);
  if (0 < penclen) {
    aobj = OBJ_nid2obj(**(int **)(param_2 + 8));
    iVar1 = X509_PUBKEY_set0_param(param_1,aobj,iVar1,local_40,local_38,penclen);
    if (iVar1 != 0) {
      return 1;
    }
    CRYPTO_free(local_38);
  }
  ASN1_STRING_free(local_40);
  return 0;
}

