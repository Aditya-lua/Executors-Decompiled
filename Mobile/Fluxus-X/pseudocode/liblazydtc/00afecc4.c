/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afecc4
 */

ASN1_VALUE * FUN_00afecc4(X509V3_EXT_METHOD *param_1,X509V3_CTX *param_2,undefined8 param_3)

{
  int iVar1;
  int iVar2;
  ASN1_VALUE *val;
  long lVar3;
  ASN1_VALUE *val_00;
  GENERAL_NAME *pGVar4;
  long lVar5;
  ASN1_VALUE *pAVar6;
  char *__s1;
  CONF_VALUE CStack_78;
  
  val = ASN1_item_new((ASN1_ITEM *)&DAT_00c807e0);
  if (val == (ASN1_VALUE *)0x0) {
    val_00 = (ASN1_VALUE *)0x0;
LAB_00afee04:
    ERR_new();
    ERR_set_debug("crypto/x509/v3_ncons.c",0xa5,"v2i_NAME_CONSTRAINTS");
    ERR_set_error(0x22,0xc0100,0);
LAB_00afee34:
    ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c807e0);
    ASN1_item_free(val_00,(ASN1_ITEM *)&DAT_00c807a8);
    val = (ASN1_VALUE *)0x0;
  }
  else {
    iVar1 = OPENSSL_sk_num(param_3);
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        lVar3 = OPENSSL_sk_value(param_3,iVar1);
        __s1 = *(char **)(lVar3 + 8);
        iVar2 = strncmp(__s1,"permitted",9);
        if ((iVar2 == 0) && (__s1[9] != '\0')) {
          lVar5 = 10;
          pAVar6 = val;
        }
        else {
          iVar2 = strncmp(__s1,"excluded",8);
          if ((iVar2 != 0) || (__s1[8] == '\0')) {
            ERR_new();
            ERR_set_debug("crypto/x509/v3_ncons.c",0x92,"v2i_NAME_CONSTRAINTS");
            ERR_set_error(0x22,0x8f,0);
            val_00 = (ASN1_VALUE *)0x0;
            goto LAB_00afee34;
          }
          lVar5 = 9;
          pAVar6 = val + 8;
        }
        CStack_78.name = __s1 + lVar5;
        CStack_78.value = *(char **)(lVar3 + 0x10);
        val_00 = ASN1_item_new((ASN1_ITEM *)&DAT_00c807a8);
        if (val_00 == (ASN1_VALUE *)0x0) goto LAB_00afee04;
        pGVar4 = v2i_GENERAL_NAME_ex(*(GENERAL_NAME **)val_00,param_1,param_2,&CStack_78,1);
        if (pGVar4 == (GENERAL_NAME *)0x0) goto LAB_00afee34;
        lVar3 = *(long *)pAVar6;
        if (lVar3 == 0) {
          lVar3 = OPENSSL_sk_new_null();
          *(long *)pAVar6 = lVar3;
          if (lVar3 == 0) goto LAB_00afee04;
        }
        iVar2 = OPENSSL_sk_push(lVar3,val_00);
        if (iVar2 == 0) goto LAB_00afee04;
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(param_3);
      } while (iVar1 < iVar2);
    }
  }
  return val;
}

