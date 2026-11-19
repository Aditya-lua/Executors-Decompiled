/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b01ab0
 */

int X509V3_extensions_print
              (BIO *out,char *title,stack_st_X509_EXTENSION *exts,ulong flag,int indent)

{
  char *param2;
  int iVar1;
  int iVar2;
  X509_EXTENSION *ex;
  ASN1_OBJECT *o;
  ASN1_OCTET_STRING *v;
  
  iVar1 = OPENSSL_sk_num(exts);
  if (0 < iVar1) {
    if (title != (char *)0x0) {
      BIO_printf(out,"%*s%s:\n",indent,"",title);
      indent = indent + 4;
    }
    iVar1 = OPENSSL_sk_num(exts);
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        ex = (X509_EXTENSION *)OPENSSL_sk_value(exts,iVar1);
        o = X509_EXTENSION_get_object(ex);
        if (((((uint)flag >> 0xd & 1) == 0) || (iVar2 = OBJ_obj2nid(o), iVar2 == 0x52)) ||
           (iVar2 = OBJ_obj2nid(o), iVar2 == 0x5a)) {
          if ((indent != 0) &&
             (iVar2 = BIO_printf(out,"%*s",(ulong)(uint)indent,&DAT_002ab32c), iVar2 < 1)) {
            return 0;
          }
          i2a_ASN1_OBJECT(out,o);
          iVar2 = X509_EXTENSION_get_critical(ex);
          param2 = "";
          if (iVar2 != 0) {
            param2 = "critical";
          }
          iVar2 = BIO_printf(out,": %s\n",param2);
          if (iVar2 < 1) {
            return 0;
          }
          iVar2 = X509V3_EXT_print(out,ex,flag,indent + 4U);
          if (iVar2 == 0) {
            BIO_printf(out,"%*s",(ulong)(indent + 4U),&DAT_002ab32c);
            v = X509_EXTENSION_get_data(ex);
            ASN1_STRING_print(out,v);
          }
          iVar2 = BIO_write(out,&DAT_002c4dae,1);
          if (iVar2 < 1) {
            return 0;
          }
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(exts);
      } while (iVar1 < iVar2);
    }
  }
  return 1;
}

