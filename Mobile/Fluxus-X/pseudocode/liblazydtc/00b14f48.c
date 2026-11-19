/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14f48
 */

X509_NAME_ENTRY *
X509_NAME_ENTRY_create_by_OBJ(X509_NAME_ENTRY **ne,ASN1_OBJECT *obj,int type,uchar *bytes,int len)

{
  int iVar1;
  ASN1_OBJECT *pAVar2;
  X509_NAME_ENTRY *ne_00;
  
  if (((ne != (X509_NAME_ENTRY **)0x0) && (ne_00 = *ne, ne_00 != (X509_NAME_ENTRY *)0x0)) ||
     (ne_00 = X509_NAME_ENTRY_new(), ne_00 != (X509_NAME_ENTRY *)0x0)) {
    if ((obj == (ASN1_OBJECT *)0x0) || (ne_00 == (X509_NAME_ENTRY *)0x0)) {
      ERR_new();
      ERR_set_debug("crypto/x509/x509name.c",0x135,"X509_NAME_ENTRY_set_object");
      ERR_set_error(0xb,0xc0102,0);
    }
    else {
      ASN1_OBJECT_free(ne_00->object);
      pAVar2 = OBJ_dup(obj);
      ne_00->object = pAVar2;
      if ((pAVar2 != (ASN1_OBJECT *)0x0) &&
         (iVar1 = X509_NAME_ENTRY_set_data(ne_00,type,bytes,len), iVar1 != 0)) {
        if (ne == (X509_NAME_ENTRY **)0x0) {
          return ne_00;
        }
        if (*ne == (X509_NAME_ENTRY *)0x0) {
          *ne = ne_00;
          return ne_00;
        }
        return ne_00;
      }
    }
    if ((ne == (X509_NAME_ENTRY **)0x0) || (ne_00 != *ne)) {
      X509_NAME_ENTRY_free(ne_00);
    }
  }
  return (X509_NAME_ENTRY *)0x0;
}

