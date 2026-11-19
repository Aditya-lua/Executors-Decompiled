/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0d75c
 */

int X509_EXTENSION_set_object(X509_EXTENSION *ex,ASN1_OBJECT *obj)

{
  uint uVar1;
  ASN1_OBJECT *pAVar2;
  
  uVar1 = 0;
  if ((ex != (X509_EXTENSION *)0x0) && (obj != (ASN1_OBJECT *)0x0)) {
    ASN1_OBJECT_free(ex->object);
    pAVar2 = OBJ_dup(obj);
    ex->object = pAVar2;
    uVar1 = (uint)(pAVar2 != (ASN1_OBJECT *)0x0);
  }
  return uVar1;
}

