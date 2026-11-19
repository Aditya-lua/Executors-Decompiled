/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009efe5c
 */

int ASN1_UTCTIME_set_string(ASN1_UTCTIME *s,char *str)

{
  int iVar1;
  int iVar2;
  size_t sVar3;
  ASN1_STRING local_38;
  
  local_38.type = 0x17;
  sVar3 = strlen(str);
  local_38.length = (int)sVar3;
  local_38.flags = 0;
  local_38.data = (uchar *)str;
  iVar1 = ossl_asn1_time_to_tm(0,&local_38);
  iVar2 = 0;
  if ((iVar1 != 0) &&
     ((s == (ASN1_UTCTIME *)0x0 || (iVar1 = ASN1_STRING_copy(s,&local_38), iVar2 = 0, iVar1 != 0))))
  {
    iVar2 = 1;
  }
  return iVar2;
}

