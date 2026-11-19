/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b05258
 */

ASN1_OCTET_STRING * SXNET_get_id_asc(SXNET *sx,char *zone)

{
  int iVar1;
  int iVar2;
  ASN1_INTEGER *y;
  undefined8 *puVar3;
  ASN1_OCTET_STRING *pAVar4;
  
  y = s2i_ASN1_INTEGER((X509V3_EXT_METHOD *)0x0,zone);
  if (y == (ASN1_INTEGER *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_sxnet.c",0xda,"SXNET_get_id_asc");
    ERR_set_error(0x22,0x83,0);
    pAVar4 = (ASN1_OCTET_STRING *)0x0;
  }
  else {
    iVar1 = OPENSSL_sk_num(sx->ids);
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        puVar3 = (undefined8 *)OPENSSL_sk_value(sx->ids,iVar1);
        iVar2 = ASN1_INTEGER_cmp((ASN1_INTEGER *)*puVar3,y);
        if (iVar2 == 0) {
          pAVar4 = (ASN1_OCTET_STRING *)puVar3[1];
          goto LAB_00b05304;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(sx->ids);
      } while (iVar1 < iVar2);
    }
    pAVar4 = (ASN1_OCTET_STRING *)0x0;
LAB_00b05304:
    ASN1_INTEGER_free(y);
  }
  return pAVar4;
}

