/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4190
 */

X509_EXTENSION *
FUN_00af4190(char *param_1,char *param_2,int param_3,int param_4,X509V3_CTX *param_5)

{
  int iVar1;
  ASN1_OBJECT *obj;
  uchar *ptr;
  ASN1_TYPE *a;
  undefined8 uVar2;
  char *pcVar3;
  ASN1_OCTET_STRING *data;
  X509_EXTENSION *pXVar4;
  long local_50;
  uchar *local_48;
  
  local_50 = 0;
  obj = OBJ_txt2obj(param_1,0);
  if (obj == (ASN1_OBJECT *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_conf.c",0xf5,"v3_generic_extension");
    pcVar3 = "name=%s";
    uVar2 = 0x73;
LAB_00af4258:
    ERR_set_error(0x22,uVar2,pcVar3,param_1);
    ptr = (uchar *)0x0;
    data = (ASN1_OCTET_STRING *)0x0;
  }
  else {
    if (param_4 == 2) {
      local_48 = (uchar *)0x0;
      a = ASN1_generate_v3(param_2,param_5);
      ptr = (uchar *)0x0;
      if (a != (ASN1_TYPE *)0x0) {
        iVar1 = i2d_ASN1_TYPE(a,&local_48);
        local_50 = (long)iVar1;
        ASN1_TYPE_free(a);
        ptr = local_48;
      }
      if (ptr != (uchar *)0x0) goto LAB_00af42e4;
LAB_00af41f4:
      ERR_new();
      ERR_set_debug("crypto/x509/v3_conf.c",0x100,"v3_generic_extension");
      pcVar3 = "value=%s";
      uVar2 = 0x74;
      param_1 = param_2;
      goto LAB_00af4258;
    }
    if ((param_4 != 1) ||
       (ptr = (uchar *)OPENSSL_hexstr2buf(param_2,&local_50), ptr == (uchar *)0x0))
    goto LAB_00af41f4;
LAB_00af42e4:
    data = ASN1_OCTET_STRING_new();
    if (data != (ASN1_OCTET_STRING *)0x0) {
      data->data = ptr;
      data->length = (int)local_50;
      pXVar4 = X509_EXTENSION_create_by_OBJ((X509_EXTENSION **)0x0,obj,param_3,data);
      ptr = (uchar *)0x0;
      goto LAB_00af4268;
    }
    ERR_new();
    ERR_set_debug("crypto/x509/v3_conf.c",0x106,"v3_generic_extension");
    ERR_set_error(0x22,0xc0100,0);
  }
  pXVar4 = (X509_EXTENSION *)0x0;
LAB_00af4268:
  ASN1_OBJECT_free(obj);
  ASN1_OCTET_STRING_free(data);
  CRYPTO_free(ptr);
  return pXVar4;
}

