/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b154c0
 */

int X509_NAME_ENTRY_set_object(X509_NAME_ENTRY *ne,ASN1_OBJECT *obj)

{
  uint uVar1;
  ASN1_OBJECT *pAVar2;
  
  if ((ne == (X509_NAME_ENTRY *)0x0) || (obj == (ASN1_OBJECT *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509name.c",0x135,"X509_NAME_ENTRY_set_object");
    ERR_set_error(0xb,0xc0102,0);
    uVar1 = 0;
  }
  else {
    ASN1_OBJECT_free(ne->object);
    pAVar2 = OBJ_dup(obj);
    ne->object = pAVar2;
    uVar1 = (uint)(pAVar2 != (ASN1_OBJECT *)0x0);
  }
  return uVar1;
}

