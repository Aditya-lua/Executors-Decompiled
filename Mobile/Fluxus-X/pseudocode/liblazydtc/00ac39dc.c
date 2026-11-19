/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac39dc
 */

int PKCS7_stream(uchar ***boundary,PKCS7 *p7)

{
  int iVar1;
  ASN1_OBJECT *pAVar2;
  
  iVar1 = OBJ_obj2nid(p7->type);
  switch(iVar1) {
  case 0x15:
    pAVar2 = (ASN1_OBJECT *)(p7->d).data;
    if (pAVar2 == (ASN1_OBJECT *)0x0) {
      return 0;
    }
    break;
  case 0x16:
    pAVar2 = (p7->d).enveloped[1].enc_data[1].content_type;
    if (pAVar2 == (ASN1_OBJECT *)0x0) {
      return 0;
    }
    break;
  case 0x17:
    pAVar2 = (ASN1_OBJECT *)((p7->d).enveloped)->enc_data->enc_data;
    if (pAVar2 == (ASN1_OBJECT *)0x0) {
      pAVar2 = (ASN1_OBJECT *)ASN1_OCTET_STRING_new();
      ((p7->d).enveloped)->enc_data->enc_data = (ASN1_OCTET_STRING *)pAVar2;
      if (pAVar2 == (ASN1_OBJECT *)0x0) {
        return 0;
      }
    }
    break;
  case 0x18:
    pAVar2 = (ASN1_OBJECT *)((p7->d).enveloped[1].enc_data)->enc_data;
    if (pAVar2 == (ASN1_OBJECT *)0x0) {
      pAVar2 = (ASN1_OBJECT *)ASN1_OCTET_STRING_new();
      ((p7->d).enveloped[1].enc_data)->enc_data = (ASN1_OCTET_STRING *)pAVar2;
      if (pAVar2 == (ASN1_OBJECT *)0x0) {
        return 0;
      }
    }
    break;
  default:
    return 0;
  }
  *(ulong *)&pAVar2->nid = *(ulong *)&pAVar2->nid | 0x10;
  *boundary = (uchar **)&pAVar2->ln;
  return 1;
}

