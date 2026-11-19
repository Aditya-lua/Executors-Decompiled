/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1553c
 */

int X509_NAME_ENTRY_set_data(X509_NAME_ENTRY *ne,int type,uchar *bytes,int len)

{
  int iVar1;
  uint uVar2;
  ASN1_STRING *pAVar3;
  size_t sVar4;
  
  uVar2 = 0;
  if ((ne != (X509_NAME_ENTRY *)0x0) && ((bytes != (uchar *)0x0 || (uVar2 = 0, len == 0)))) {
    if ((type < 1) || (((uint)type >> 0xc & 1) == 0)) {
      if (len < 0) {
        sVar4 = strlen((char *)bytes);
        len = (int)sVar4;
      }
      iVar1 = ASN1_STRING_set(ne->value,bytes,len);
      uVar2 = 0;
      if (iVar1 != 0) {
        if (type != -1) {
          if (type == -2) {
            iVar1 = ASN1_PRINTABLE_type(bytes,len);
            ne->value->type = iVar1;
          }
          else {
            ne->value->type = type;
          }
        }
        uVar2 = 1;
      }
    }
    else {
      iVar1 = OBJ_obj2nid(ne->object);
      pAVar3 = ASN1_STRING_set_by_NID(&ne->value,bytes,len,type,iVar1);
      uVar2 = (uint)(pAVar3 != (ASN1_STRING *)0x0);
    }
  }
  return uVar2;
}

