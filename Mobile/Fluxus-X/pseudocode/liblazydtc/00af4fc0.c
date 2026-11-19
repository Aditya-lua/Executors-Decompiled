/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4fc0
 */

int GENERAL_NAME_cmp(GENERAL_NAME *a,GENERAL_NAME *b)

{
  int iVar1;
  ASN1_STRING *pAVar2;
  ASN1_STRING *b_00;
  OTHERNAME *pOVar3;
  EDIPARTYNAME *pEVar4;
  OTHERNAME *pOVar5;
  EDIPARTYNAME *pEVar6;
  
  if (a == (GENERAL_NAME *)0x0) {
    return -1;
  }
  if (b == (GENERAL_NAME *)0x0) {
    return -1;
  }
  if (a->type == b->type) {
    switch(a->type) {
    case 0:
      pOVar3 = (a->d).otherName;
      if (pOVar3 == (OTHERNAME *)0x0) {
        return -1;
      }
      pOVar5 = (b->d).otherName;
      if (pOVar5 == (OTHERNAME *)0x0) {
        return -1;
      }
      iVar1 = OBJ_cmp(pOVar3->type_id,pOVar5->type_id);
      if (iVar1 == 0) {
        iVar1 = ASN1_TYPE_cmp(pOVar3->value,pOVar5->value);
        return iVar1;
      }
      return iVar1;
    case 1:
    case 2:
    case 3:
    case 6:
      pAVar2 = (ASN1_STRING *)(a->d).otherName;
      b_00 = (ASN1_STRING *)(b->d).otherName;
LAB_00af5014:
      iVar1 = ASN1_STRING_cmp(pAVar2,b_00);
      return iVar1;
    case 4:
      iVar1 = X509_NAME_cmp((a->d).directoryName,(b->d).directoryName);
      return iVar1;
    case 5:
      pEVar4 = (a->d).ediPartyName;
      if (pEVar4 == (EDIPARTYNAME *)0x0) {
        return -1;
      }
      pEVar6 = (b->d).ediPartyName;
      if (pEVar6 == (EDIPARTYNAME *)0x0) {
        return -1;
      }
      pAVar2 = pEVar6->nameAssigner;
      if (pEVar4->nameAssigner == (ASN1_STRING *)0x0) {
        if (pAVar2 != (ASN1_STRING *)0x0) {
          return -1;
        }
      }
      else {
        if (pAVar2 == (ASN1_STRING *)0x0) {
          return 1;
        }
        iVar1 = ASN1_STRING_cmp(pEVar4->nameAssigner,pAVar2);
        if (iVar1 != 0) {
          return iVar1;
        }
      }
      pAVar2 = pEVar4->partyName;
      if ((pAVar2 != (ASN1_STRING *)0x0) && (b_00 = pEVar6->partyName, b_00 != (ASN1_STRING *)0x0))
      goto LAB_00af5014;
      break;
    case 7:
      iVar1 = ASN1_OCTET_STRING_cmp((ASN1_STRING *)(a->d).otherName,(ASN1_STRING *)(b->d).otherName)
      ;
      return iVar1;
    case 8:
      iVar1 = OBJ_cmp((a->d).registeredID,(b->d).registeredID);
      return iVar1;
    }
  }
  return -1;
}

