/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1987c
 */

DH * ossl_dh_key_from_pkcs8(PKCS8_PRIV_KEY_INFO *param_1)

{
  int iVar1;
  int iVar2;
  DH *dh;
  BIGNUM *bn;
  BIGNUM *pBVar3;
  ASN1_INTEGER *ai;
  X509_ALGOR *local_50;
  int *piStack_48;
  int local_40;
  int local_3c;
  uchar *local_38;
  uchar *puStack_28;
  
  iVar1 = PKCS8_pkey_get0((ASN1_OBJECT **)0x0,&puStack_28,&local_3c,&local_50,param_1);
  if (iVar1 == 0) {
    return (DH *)0x0;
  }
  X509_ALGOR_get0((ASN1_OBJECT **)0x0,&local_40,&piStack_48,local_50);
  ai = (ASN1_INTEGER *)0x0;
  if ((local_40 == 0x10) &&
     (ai = d2i_ASN1_INTEGER((ASN1_INTEGER **)0x0,&puStack_28,(long)local_3c),
     ai != (ASN1_INTEGER *)0x0)) {
    local_38 = *(uchar **)(piStack_48 + 2);
    iVar1 = *piStack_48;
    iVar2 = OBJ_obj2nid(local_50->algorithm);
    if (iVar2 == 0x398) {
      dh = (DH *)d2i_DHxparams(0,&local_38,(long)iVar1);
    }
    else {
      if (iVar2 != 0x1c) goto LAB_00a19988;
      dh = d2i_DHparams((DH **)0x0,&local_38,(long)iVar1);
    }
    if (dh == (DH *)0x0) goto LAB_00a19988;
    bn = (BIGNUM *)BN_secure_new();
    if ((bn == (BIGNUM *)0x0) || (pBVar3 = ASN1_INTEGER_to_BN(ai,bn), pBVar3 == (BIGNUM *)0x0)) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_backend.c",0xe5,"ossl_dh_key_from_pkcs8");
      ERR_set_error(5,0x6a,0);
      BN_clear_free(bn);
    }
    else {
      iVar1 = DH_set0_key(dh,0,bn);
      if ((iVar1 != 0) && (iVar1 = DH_generate_key(dh), iVar1 != 0)) goto LAB_00a199c4;
    }
  }
  else {
LAB_00a19988:
    ERR_new();
    ERR_set_debug("crypto/dh/dh_backend.c",0xf2,"ossl_dh_key_from_pkcs8");
    ERR_set_error(5,0x72,0);
    dh = (DH *)0x0;
  }
  DH_free(dh);
  dh = (DH *)0x0;
LAB_00a199c4:
  ASN1_STRING_clear_free(ai);
  return dh;
}

