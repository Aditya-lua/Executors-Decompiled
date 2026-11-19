/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c218
 */

stack_st_X509_EXTENSION * X509_REQ_get_extensions(X509_REQ *req)

{
  int iVar1;
  stack_st_X509_EXTENSION *psVar2;
  X509_ATTRIBUTE *attr;
  ASN1_TYPE *pAVar3;
  ASN1_ITEM *it;
  ASN1_VALUE *pAVar4;
  int *piVar5;
  uchar *local_28;
  
  psVar2 = (stack_st_X509_EXTENSION *)0x0;
  if ((req != (X509_REQ *)0x0) && (PTR_DAT_00cc9bd8 != (undefined *)0x0)) {
    iVar1 = *(int *)PTR_DAT_00cc9bd8;
    if (iVar1 != 0) {
      piVar5 = (int *)PTR_DAT_00cc9bd8;
      do {
        piVar5 = piVar5 + 1;
        iVar1 = X509at_get_attr_by_NID((stack_st_X509_ATTRIBUTE *)req[1].signature,iVar1,-1);
        if (iVar1 != -1) {
          attr = X509at_get_attr((stack_st_X509_ATTRIBUTE *)req[1].signature,iVar1);
          pAVar3 = X509_ATTRIBUTE_get0_type(attr,0);
          if (pAVar3 != (ASN1_TYPE *)0x0) {
            if (pAVar3->type == 0x10) {
              local_28 = ((pAVar3->value).asn1_string)->data;
              iVar1 = ((pAVar3->value).asn1_string)->length;
              it = (ASN1_ITEM *)X509_EXTENSIONS_it();
              pAVar4 = ASN1_item_d2i((ASN1_VALUE **)0x0,&local_28,(long)iVar1,it);
              return (stack_st_X509_EXTENSION *)pAVar4;
            }
            return (stack_st_X509_EXTENSION *)0x0;
          }
          break;
        }
        iVar1 = *piVar5;
      } while (iVar1 != 0);
    }
    psVar2 = (stack_st_X509_EXTENSION *)OPENSSL_sk_new_null();
  }
  return psVar2;
}

