/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f03b4
 */

EVP_PKEY_ASN1_METHOD * EVP_PKEY_asn1_find(ENGINE **pe,int type)

{
  int iVar1;
  EVP_PKEY_ASN1_METHOD *pEVar2;
  long *plVar3;
  ENGINE *e;
  int *local_198;
  int local_190 [80];
  
  while( true ) {
    local_198 = local_190;
    local_190[0] = type;
    if ((DAT_00d218e0 == 0) || (iVar1 = OPENSSL_sk_find(DAT_00d218e0,local_190), iVar1 < 0)) {
      plVar3 = OBJ_bsearch_(&local_198,&DAT_00cc8608,0x10,8,(cmp *)&LAB_009f0ad4);
      if (plVar3 == (long *)0x0) {
        pEVar2 = (EVP_PKEY_ASN1_METHOD *)0x0;
        if (pe == (ENGINE **)0x0) {
          return (EVP_PKEY_ASN1_METHOD *)0x0;
        }
        goto LAB_009f045c;
      }
      pEVar2 = (EVP_PKEY_ASN1_METHOD *)*plVar3;
    }
    else {
      pEVar2 = (EVP_PKEY_ASN1_METHOD *)OPENSSL_sk_value(DAT_00d218e0,iVar1);
    }
    if ((pEVar2 == (EVP_PKEY_ASN1_METHOD *)0x0) || (((byte)pEVar2[8] & 1) == 0)) break;
    type = *(int *)(pEVar2 + 4);
  }
  if (pe != (ENGINE **)0x0) {
LAB_009f045c:
    e = ENGINE_get_pkey_asn1_meth_engine(type);
    if (e == (ENGINE *)0x0) {
      *pe = (ENGINE *)0x0;
    }
    else {
      *pe = e;
      pEVar2 = ENGINE_get_pkey_asn1_meth(e,type);
    }
  }
  return pEVar2;
}

