/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b01024
 */

ASN1_VALUE * FUN_00b01024(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  int iVar2;
  ASN1_VALUE *val;
  CONF_VALUE *value;
  ASN1_INTEGER *pAVar3;
  char *__s1;
  
  val = ASN1_item_new((ASN1_ITEM *)&DAT_00c80ac0);
  if (val == (ASN1_VALUE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_pcons.c",0x40,"v2i_POLICY_CONSTRAINTS");
    ERR_set_error(0x22,0xc0100,0);
  }
  else {
    iVar1 = OPENSSL_sk_num(param_3);
    if (iVar1 < 1) {
      pAVar3 = *(ASN1_INTEGER **)(val + 8);
    }
    else {
      iVar1 = 0;
      do {
        value = (CONF_VALUE *)OPENSSL_sk_value(param_3,iVar1);
        __s1 = value->name;
        iVar2 = strcmp(__s1,"requireExplicitPolicy");
        if (iVar2 == 0) {
          iVar2 = X509V3_get_value_int(value,(ASN1_INTEGER **)val);
        }
        else {
          iVar2 = strcmp(__s1,"inhibitPolicyMapping");
          if (iVar2 != 0) {
            ERR_new();
            ERR_set_debug("crypto/x509/v3_pcons.c",0x4c,"v2i_POLICY_CONSTRAINTS");
            ERR_set_error(0x22,0x6a,&DAT_002b6c62,value->name);
            goto LAB_00b011a0;
          }
          iVar2 = X509V3_get_value_int(value,(ASN1_INTEGER **)(val + 8));
        }
        if (iVar2 == 0) goto LAB_00b011a0;
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(param_3);
      } while (iVar1 < iVar2);
      pAVar3 = *(ASN1_INTEGER **)(val + 8);
    }
    if ((pAVar3 == (ASN1_INTEGER *)0x0) && (*(long *)val == 0)) {
      ERR_new();
      ERR_set_debug("crypto/x509/v3_pcons.c",0x53,"v2i_POLICY_CONSTRAINTS");
      ERR_set_error(0x22,0x97,0);
LAB_00b011a0:
      ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c80ac0);
      val = (ASN1_VALUE *)0x0;
    }
  }
  return val;
}

