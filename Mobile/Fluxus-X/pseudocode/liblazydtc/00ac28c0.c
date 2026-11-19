/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac28c0
 */

int PKCS7_set_type(PKCS7 *p7,int type)

{
  int iVar1;
  ASN1_OBJECT *pAVar2;
  ASN1_OCTET_STRING *pAVar3;
  PKCS7_SIGNED *pPVar4;
  PKCS7_ENVELOPE *pPVar5;
  PKCS7_SIGN_ENVELOPE *pPVar6;
  PKCS7_DIGEST *pPVar7;
  PKCS7_ENCRYPT *pPVar8;
  pkcs7_st *ppVar9;
  
  pAVar2 = OBJ_nid2obj(type);
  switch(type) {
  case 0x15:
    p7->type = pAVar2;
    pAVar3 = ASN1_OCTET_STRING_new();
    (p7->d).data = pAVar3;
    if (pAVar3 != (ASN1_OCTET_STRING *)0x0) {
      return 1;
    }
    break;
  case 0x16:
    p7->type = pAVar2;
    pPVar4 = PKCS7_SIGNED_new();
    (p7->d).sign = pPVar4;
    if (pPVar4 != (PKCS7_SIGNED *)0x0) {
      iVar1 = ASN1_INTEGER_set(pPVar4->version,1);
      if (iVar1 != 0) {
        return 1;
      }
      PKCS7_SIGNED_free((p7->d).sign);
      (p7->d).ptr = (char *)0x0;
    }
    break;
  case 0x17:
    p7->type = pAVar2;
    pPVar5 = PKCS7_ENVELOPE_new();
    (p7->d).enveloped = pPVar5;
    if ((pPVar5 != (PKCS7_ENVELOPE *)0x0) &&
       (iVar1 = ASN1_INTEGER_set(pPVar5->version,0), iVar1 != 0)) {
      pAVar2 = OBJ_nid2obj(0x15);
      ppVar9 = (pkcs7_st *)((p7->d).enveloped)->enc_data;
LAB_00ac2a34:
      ppVar9->asn1 = (uchar *)pAVar2;
      return 1;
    }
    break;
  case 0x18:
    p7->type = pAVar2;
    pPVar6 = PKCS7_SIGN_ENVELOPE_new();
    (p7->d).signed_and_enveloped = pPVar6;
    if ((pPVar6 != (PKCS7_SIGN_ENVELOPE *)0x0) &&
       (iVar1 = ASN1_INTEGER_set(pPVar6->version,1), iVar1 != 0)) {
      pAVar2 = OBJ_nid2obj(0x15);
      ppVar9 = ((p7->d).sign)->contents;
      goto LAB_00ac2a34;
    }
    break;
  case 0x19:
    p7->type = pAVar2;
    pPVar7 = PKCS7_DIGEST_new();
    (p7->d).digest = pPVar7;
    if ((pPVar7 != (PKCS7_DIGEST *)0x0) && (iVar1 = ASN1_INTEGER_set(pPVar7->version,0), iVar1 != 0)
       ) {
      return 1;
    }
    break;
  case 0x1a:
    p7->type = pAVar2;
    pPVar8 = PKCS7_ENCRYPT_new();
    (p7->d).encrypted = pPVar8;
    if ((pPVar8 != (PKCS7_ENCRYPT *)0x0) &&
       (iVar1 = ASN1_INTEGER_set(pPVar8->version,0), iVar1 != 0)) {
      pAVar2 = OBJ_nid2obj(0x15);
      ppVar9 = (pkcs7_st *)((p7->d).digest)->md;
      goto LAB_00ac2a34;
    }
    break;
  default:
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_lib.c",0xad,"PKCS7_set_type");
    ERR_set_error(0x21,0x70,0);
  }
  return 0;
}

