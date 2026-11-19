/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b06044
 */

int X509V3_get_value_bool(CONF_VALUE *value,int *asn1_bool)

{
  int iVar1;
  char *__s1;
  
  __s1 = value->value;
  if (__s1 == (char *)0x0) {
LAB_00b06154:
    ERR_new();
    ERR_set_debug("crypto/x509/v3_utl.c",0x121,"X509V3_get_value_bool");
    ERR_set_error(0x22,0x68,0);
    ERR_add_error_data(4,"name=",value->name,", value=",value->value);
    iVar1 = 0;
  }
  else {
    iVar1 = strcmp(__s1,"TRUE");
    if (((((iVar1 == 0) || (iVar1 = strcmp(__s1,"true"), iVar1 == 0)) ||
         (iVar1 = strcmp(__s1,"Y"), iVar1 == 0)) ||
        ((iVar1 = strcmp(__s1,"y"), iVar1 == 0 || (iVar1 = strcmp(__s1,"YES"), iVar1 == 0)))) ||
       (iVar1 = strcmp(__s1,"yes"), iVar1 == 0)) {
      *asn1_bool = 0xff;
    }
    else {
      iVar1 = strcmp(__s1,"FALSE");
      if (((iVar1 != 0) && (iVar1 = strcmp(__s1,"false"), iVar1 != 0)) &&
         ((iVar1 = strcmp(__s1,"N"), iVar1 != 0 &&
          ((iVar1 = strcmp(__s1,"n"), iVar1 != 0 && (iVar1 = strcmp(__s1,"NO"), iVar1 != 0)))))) {
        iVar1 = strcmp(__s1,"no");
        if (iVar1 != 0) goto LAB_00b06154;
      }
      *asn1_bool = 0;
    }
    iVar1 = 1;
  }
  return iVar1;
}

