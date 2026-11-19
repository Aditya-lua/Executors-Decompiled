/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d660
 */

X509_EXTENSION *
X509_EXTENSION_create_by_OBJ(X509_EXTENSION **ex,ASN1_OBJECT *obj,int crit,ASN1_OCTET_STRING *data)

{
  int iVar1;
  ASN1_OBJECT *pAVar2;
  ASN1_BOOLEAN AVar3;
  X509_EXTENSION *a;
  
  if (((ex == (X509_EXTENSION **)0x0) || (a = *ex, a == (X509_EXTENSION *)0x0)) &&
     (a = X509_EXTENSION_new(), a == (X509_EXTENSION *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_v3.c",0xa5,"X509_EXTENSION_create_by_OBJ");
    ERR_set_error(0xb,0xc0100,0);
  }
  else {
    if ((obj != (ASN1_OBJECT *)0x0) && (a != (X509_EXTENSION *)0x0)) {
      ASN1_OBJECT_free(a->object);
      pAVar2 = OBJ_dup(obj);
      a->object = pAVar2;
      if (pAVar2 != (ASN1_OBJECT *)0x0) {
        AVar3 = 0xff;
        if (crit == 0) {
          AVar3 = -1;
        }
        a->critical = AVar3;
        iVar1 = ASN1_OCTET_STRING_set((ASN1_STRING *)&a->value,data->data,data->length);
        if (iVar1 != 0) {
          if (ex == (X509_EXTENSION **)0x0) {
            return a;
          }
          if (*ex == (X509_EXTENSION *)0x0) {
            *ex = a;
            return a;
          }
          return a;
        }
      }
    }
    if ((ex == (X509_EXTENSION **)0x0) || (a != *ex)) {
      X509_EXTENSION_free(a);
    }
  }
  return (X509_EXTENSION *)0x0;
}

