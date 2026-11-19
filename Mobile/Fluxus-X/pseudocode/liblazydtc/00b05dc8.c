/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b05dc8
 */

ASN1_INTEGER * s2i_ASN1_INTEGER(X509V3_EXT_METHOD *meth,char *value)

{
  char *str;
  char *pcVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  ASN1_INTEGER *pAVar5;
  undefined8 uVar6;
  BIGNUM *local_28;
  
  local_28 = (BIGNUM *)0x0;
  if (value == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_utl.c",0xca,"s2i_ASN1_INTEGER");
    uVar6 = 0x6d;
LAB_00b05eb0:
    ERR_set_error(0x22,uVar6,0);
  }
  else {
    local_28 = BN_new();
    if (local_28 == (BIGNUM *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/x509/v3_utl.c",0xcf,"s2i_ASN1_INTEGER");
      uVar6 = 0xc0100;
    }
    else {
      cVar2 = *value;
      pcVar1 = value;
      if (cVar2 == '-') {
        pcVar1 = value + 1;
      }
      str = value + 1;
      if (cVar2 != '-') {
        str = value;
      }
      if ((*pcVar1 == '0') && ((byte)(str[1] | 0x20U) == 0x78)) {
        str = str + 2;
        iVar4 = BN_hex2bn(&local_28,str);
      }
      else {
        iVar4 = BN_dec2bn(&local_28,str);
      }
      if ((iVar4 != 0) && (str[iVar4] == '\0')) {
        bVar3 = false;
        if (cVar2 == '-') {
          iVar4 = BN_is_zero(local_28);
          bVar3 = iVar4 == 0;
        }
        pAVar5 = BN_to_ASN1_INTEGER(local_28,(ASN1_INTEGER *)0x0);
        BN_free(local_28);
        if (pAVar5 != (ASN1_INTEGER *)0x0) {
          if (bVar3) {
            pAVar5->type = pAVar5->type | 0x100;
            return pAVar5;
          }
          return pAVar5;
        }
        ERR_new();
        ERR_set_debug("crypto/x509/v3_utl.c",0xf1,"s2i_ASN1_INTEGER");
        uVar6 = 0x65;
        goto LAB_00b05eb0;
      }
      BN_free(local_28);
      ERR_new();
      ERR_set_debug("crypto/x509/v3_utl.c",0xe7,"s2i_ASN1_INTEGER");
      uVar6 = 100;
    }
    ERR_set_error(0x22,uVar6,0);
  }
  return (ASN1_INTEGER *)0x0;
}

