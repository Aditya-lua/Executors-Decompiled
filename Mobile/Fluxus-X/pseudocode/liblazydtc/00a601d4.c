/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a601d4
 */

int ASN1_TYPE_get_int_octetstring(ASN1_TYPE *a,long *num,uchar *data,int max_len)

{
  int iVar1;
  int iVar2;
  void *__src;
  ASN1_VALUE *val;
  ASN1_STRING *x;
  
  val = (ASN1_VALUE *)0x0;
  if (a->type == 0x10) {
    if ((a->value).ptr == (char *)0x0) {
      val = (ASN1_VALUE *)0x0;
    }
    else {
      val = (ASN1_VALUE *)ASN1_TYPE_unpack_sequence(&DAT_00c5d6d0,a);
      if (val != (ASN1_VALUE *)0x0) {
        x = *(ASN1_STRING **)(val + 8);
        iVar1 = *(int *)val;
        iVar2 = ASN1_STRING_length(x);
        if (num != (long *)0x0) {
          *num = (long)iVar1;
        }
        if (data != (uchar *)0x0) {
          iVar1 = iVar2;
          if (max_len <= iVar2) {
            iVar1 = max_len;
          }
          __src = (void *)ASN1_STRING_get0_data(x);
          memcpy(data,__src,(long)iVar1);
        }
        if (iVar2 != -1) goto LAB_00a602a8;
      }
    }
  }
  ERR_new();
  ERR_set_debug("crypto/asn1/evp_asn1.c",0x80,"ASN1_TYPE_get_int_octetstring");
  ERR_set_error(0xd,0x6d,0);
  iVar2 = -1;
LAB_00a602a8:
  ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5d6d0);
  return iVar2;
}

