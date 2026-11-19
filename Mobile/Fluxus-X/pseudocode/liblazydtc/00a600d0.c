/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a600d0
 */

int ASN1_TYPE_get_octetstring(ASN1_TYPE *a,uchar *data,int max_len)

{
  int iVar1;
  int iVar2;
  void *__src;
  
  if ((a->type == 4) && ((a->value).ptr != (char *)0x0)) {
    __src = (void *)ASN1_STRING_get0_data();
    iVar2 = ASN1_STRING_length((a->value).asn1_string);
    iVar1 = iVar2;
    if (max_len <= iVar2) {
      iVar1 = max_len;
    }
    if ((data != (uchar *)0x0) && (0 < iVar1)) {
      memcpy(data,__src,(long)iVar1);
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/asn1/evp_asn1.c",0x28,"ASN1_TYPE_get_octetstring");
    ERR_set_error(0xd,0x6d,0);
    iVar2 = -1;
  }
  return iVar2;
}

