/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af464c
 */

X509_EXTENSION * FUN_00af464c(long param_1,int param_2,int param_3,ASN1_VALUE *param_4)

{
  int num;
  ASN1_ITEM *it;
  X509_EXTENSION *pXVar1;
  ASN1_OCTET_STRING *data;
  uchar *local_48;
  uchar *local_38;
  
  local_38 = (uchar *)0x0;
  if (*(code **)(param_1 + 8) == (code *)0x0) {
    num = (**(code **)(param_1 + 0x28))(param_4,0);
    if ((0 < num) &&
       (local_38 = CRYPTO_malloc(num,"crypto/x509/v3_conf.c",0x9f), local_38 != (uchar *)0x0)) {
      local_48 = local_38;
      (**(code **)(param_1 + 0x28))(param_4,&local_48);
      goto LAB_00af46ec;
    }
  }
  else {
    local_38 = (uchar *)0x0;
    it = (ASN1_ITEM *)(**(code **)(param_1 + 8))();
    num = ASN1_item_i2d(param_4,&local_38,it);
    if (-1 < num) {
LAB_00af46ec:
      data = ASN1_OCTET_STRING_new();
      if (data != (ASN1_OCTET_STRING *)0x0) {
        data->data = local_38;
        local_38 = (uchar *)0x0;
        data->length = num;
        pXVar1 = X509_EXTENSION_create_by_NID((X509_EXTENSION **)0x0,param_2,param_3,data);
        if (pXVar1 != (X509_EXTENSION *)0x0) {
          ASN1_OCTET_STRING_free(data);
          return pXVar1;
        }
      }
      goto LAB_00af4734;
    }
  }
  data = (ASN1_STRING *)0x0;
LAB_00af4734:
  ERR_new();
  ERR_set_debug("crypto/x509/v3_conf.c",0xb2,"do_ext_i2d");
  ERR_set_error(0x22,0xc0100,0);
  CRYPTO_free(local_38);
  ASN1_OCTET_STRING_free(data);
  return (X509_EXTENSION *)0x0;
}

