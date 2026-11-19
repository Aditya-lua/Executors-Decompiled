/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14c78
 */

int X509_NAME_get_index_by_OBJ(X509_NAME *name,ASN1_OBJECT *obj,int lastpos)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  stack_st_X509_NAME_ENTRY *psVar4;
  
  if (name == (X509_NAME *)0x0) {
LAB_00b14cd4:
    lastpos = -1;
  }
  else {
    psVar4 = name->entries;
    if (lastpos < 0) {
      lastpos = -1;
    }
    iVar1 = OPENSSL_sk_num(psVar4);
    do {
      lastpos = lastpos + 1;
      if (iVar1 <= lastpos) goto LAB_00b14cd4;
      puVar3 = (undefined8 *)OPENSSL_sk_value(psVar4,lastpos);
      iVar2 = OBJ_cmp((ASN1_OBJECT *)*puVar3,obj);
    } while (iVar2 != 0);
  }
  return lastpos;
}

