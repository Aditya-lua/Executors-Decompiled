/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afa9f4
 */

ASN1_VALUE * FUN_00afa9f4(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  int iVar2;
  ASN1_VALUE *val;
  CONF_VALUE *value;
  char *__s1;
  
  val = ASN1_item_new((ASN1_ITEM *)&DAT_00c7ee40);
  if (val == (ASN1_VALUE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_bcons.c",0x40,"v2i_BASIC_CONSTRAINTS");
    ERR_set_error(0x22,0xc0100,0);
  }
  else {
    iVar1 = OPENSSL_sk_num(param_3);
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        value = (CONF_VALUE *)OPENSSL_sk_value(param_3,iVar1);
        __s1 = value->name;
        iVar2 = strcmp(__s1,"CA");
        if (iVar2 == 0) {
          iVar2 = X509V3_get_value_bool(value,(int *)val);
        }
        else {
          iVar2 = strcmp(__s1,"pathlen");
          if (iVar2 != 0) {
            ERR_new();
            ERR_set_debug("crypto/x509/v3_bcons.c",0x4c,"v2i_BASIC_CONSTRAINTS");
            ERR_set_error(0x22,0x6a,0);
            ERR_add_error_data(4,"name=",value->name,", value=",value->value);
            goto LAB_00afab38;
          }
          iVar2 = X509V3_get_value_int(value,(ASN1_INTEGER **)(val + 8));
        }
        if (iVar2 == 0) {
LAB_00afab38:
          ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c7ee40);
          return (ASN1_VALUE *)0x0;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(param_3);
      } while (iVar1 < iVar2);
    }
  }
  return val;
}

