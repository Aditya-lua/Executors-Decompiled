/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14ee8
 */

int X509_NAME_add_entry_by_OBJ
              (X509_NAME *name,ASN1_OBJECT *obj,int type,uchar *bytes,int len,int loc,int set)

{
  int iVar1;
  X509_NAME_ENTRY *ne;
  
  ne = X509_NAME_ENTRY_create_by_OBJ((X509_NAME_ENTRY **)0x0,obj,type,bytes,len);
  iVar1 = 0;
  if (ne != (X509_NAME_ENTRY *)0x0) {
    iVar1 = X509_NAME_add_entry(name,ne,loc,set);
    X509_NAME_ENTRY_free(ne);
  }
  return iVar1;
}

