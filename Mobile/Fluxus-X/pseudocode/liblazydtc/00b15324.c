/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15324
 */

int X509_NAME_add_entry_by_txt
              (X509_NAME *name,char *field,int type,uchar *bytes,int len,int loc,int set)

{
  int iVar1;
  ASN1_OBJECT *obj;
  X509_NAME_ENTRY *ne;
  
  obj = OBJ_txt2obj(field,0);
  if (obj == (ASN1_OBJECT *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509name.c",0xfc,"X509_NAME_ENTRY_create_by_txt");
    ERR_set_error(0xb,0x77,"name=%s",field);
  }
  else {
    ne = X509_NAME_ENTRY_create_by_OBJ((X509_NAME_ENTRY **)0x0,obj,type,bytes,len);
    ASN1_OBJECT_free(obj);
    if (ne != (X509_NAME_ENTRY *)0x0) {
      iVar1 = X509_NAME_add_entry(name,ne,loc,set);
      X509_NAME_ENTRY_free(ne);
      return iVar1;
    }
  }
  return 0;
}

