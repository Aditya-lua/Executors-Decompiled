/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02c3c
 */

int X509_supported_extension(X509_EXTENSION *ex)

{
  uint uVar1;
  ASN1_OBJECT *o;
  void *pvVar2;
  int local_14;
  
  o = X509_EXTENSION_get_object(ex);
  local_14 = OBJ_obj2nid(o);
  uVar1 = 0;
  if (local_14 != 0) {
    pvVar2 = OBJ_bsearch_(&local_14,&DAT_0077b71c,0xf,4,(cmp *)&LAB_00b03718);
    uVar1 = (uint)(pvVar2 != (void *)0x0);
  }
  return uVar1;
}

