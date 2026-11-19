/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3e0f4
 */

undefined8
ossl_ecx_key_from_pkcs8(PKCS8_PRIV_KEY_INFO *param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  ASN1_OCTET_STRING *x;
  undefined8 uVar2;
  X509_ALGOR *local_40;
  int local_34;
  uchar *local_28;
  
  iVar1 = PKCS8_pkey_get0((ASN1_OBJECT **)0x0,&local_28,&local_34,&local_40,param_1);
  if (iVar1 == 0) {
    uVar2 = 0;
  }
  else {
    x = d2i_ASN1_OCTET_STRING((ASN1_OCTET_STRING **)0x0,&local_28,(long)local_34);
    if (x == (ASN1_OCTET_STRING *)0x0) {
      local_34 = 0;
      local_28 = (uchar *)0x0;
    }
    else {
      local_28 = (uchar *)ASN1_STRING_get0_data(x);
      local_34 = ASN1_STRING_length(x);
    }
    uVar2 = ossl_ecx_key_op(local_40,local_28,local_34,0,1,param_2,param_3);
    ASN1_OCTET_STRING_free(x);
  }
  return uVar2;
}

