/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b04bc0
 */

SXNET * FUN_00b04bc0(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  char *user;
  int iVar1;
  int iVar2;
  long lVar3;
  ASN1_INTEGER *izone;
  SXNET *local_38;
  
  local_38 = (SXNET *)0x0;
  iVar1 = OPENSSL_sk_num(param_3);
  if (iVar1 < 1) {
LAB_00b04c8c:
    local_38 = (SXNET *)0x0;
  }
  else {
    iVar1 = 0;
    do {
      lVar3 = OPENSSL_sk_value(param_3,iVar1);
      user = *(char **)(lVar3 + 0x10);
      izone = s2i_ASN1_INTEGER((X509V3_EXT_METHOD *)0x0,*(char **)(lVar3 + 8));
      if (izone == (ASN1_INTEGER *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/x509/v3_sxnet.c",0x7d,"SXNET_add_id_asc");
        ERR_set_error(0x22,0x83,0);
LAB_00b04c7c:
        ASN1_item_free((ASN1_VALUE *)local_38,(ASN1_ITEM *)&DAT_00c80fc8);
        goto LAB_00b04c8c;
      }
      iVar2 = SXNET_add_id_INTEGER(&local_38,izone,user,-1);
      if (iVar2 == 0) {
        ASN1_INTEGER_free(izone);
        goto LAB_00b04c7c;
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(param_3);
    } while (iVar1 < iVar2);
  }
  return local_38;
}

