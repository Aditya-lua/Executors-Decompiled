/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b01394
 */

long FUN_00b01394(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  long lVar2;
  long lVar3;
  ASN1_OBJECT *a;
  ASN1_OBJECT *a_00;
  ASN1_VALUE *pAVar4;
  int iVar5;
  
  iVar1 = OPENSSL_sk_num(param_3);
  lVar2 = OPENSSL_sk_new_reserve(0,iVar1);
  if (lVar2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_pmaps.c",0x4c,"v2i_POLICY_MAPPINGS");
    ERR_set_error(0x22,0xc0100,0);
  }
  else if (0 < iVar1) {
    iVar5 = 0;
    do {
      lVar3 = OPENSSL_sk_value(param_3,iVar5);
      if ((*(long *)(lVar3 + 0x10) == 0) || (*(char **)(lVar3 + 8) == (char *)0x0)) {
        ERR_new();
        ERR_set_debug("crypto/x509/v3_pmaps.c",0x53,"v2i_POLICY_MAPPINGS");
        ERR_set_error(0x22,0x6e,&DAT_002b6c62,*(undefined8 *)(lVar3 + 8));
        a_00 = (ASN1_OBJECT *)0x0;
        a = (ASN1_OBJECT *)0x0;
LAB_00b01534:
        ASN1_OBJECT_free(a);
        ASN1_OBJECT_free(a_00);
        OPENSSL_sk_pop_free(lVar2,POLICY_MAPPING_free);
        return 0;
      }
      a = OBJ_txt2obj(*(char **)(lVar3 + 8),0);
      a_00 = OBJ_txt2obj(*(char **)(lVar3 + 0x10),0);
      if ((a == (ASN1_OBJECT *)0x0) || (a_00 == (ASN1_OBJECT *)0x0)) {
        ERR_new();
        ERR_set_debug("crypto/x509/v3_pmaps.c",0x5a,"v2i_POLICY_MAPPINGS");
        ERR_set_error(0x22,0x6e,&DAT_002b6c62,*(undefined8 *)(lVar3 + 8));
        goto LAB_00b01534;
      }
      pAVar4 = ASN1_item_new((ASN1_ITEM *)&DAT_00c80ca0);
      if (pAVar4 == (ASN1_VALUE *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/x509/v3_pmaps.c",0x60,"v2i_POLICY_MAPPINGS");
        ERR_set_error(0x22,0xc0100,0);
        goto LAB_00b01534;
      }
      *(ASN1_OBJECT **)pAVar4 = a;
      *(ASN1_OBJECT **)(pAVar4 + 8) = a_00;
      OPENSSL_sk_push(lVar2,pAVar4);
      iVar5 = iVar5 + 1;
    } while (iVar5 < iVar1);
  }
  return lVar2;
}

