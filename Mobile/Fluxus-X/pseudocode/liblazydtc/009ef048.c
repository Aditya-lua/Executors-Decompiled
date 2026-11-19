/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ef048
 */

int ASN1_TIME_set_string(ASN1_TIME *s,char *str)

{
  int iVar1;
  
  iVar1 = ASN1_UTCTIME_set_string(s,str);
  if (iVar1 == 0) {
    iVar1 = ASN1_GENERALIZEDTIME_set_string(s,str);
    return iVar1;
  }
  return 1;
}

