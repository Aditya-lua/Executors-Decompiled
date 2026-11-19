/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a60324
 */

int ossl_asn1_type_get_octetstring_int(int *param_1,long *param_2,void *param_3,int param_4)

{
  int iVar1;
  int iVar2;
  void *__src;
  ASN1_VALUE *val;
  ASN1_STRING *x;
  
  val = (ASN1_VALUE *)0x0;
  if (*param_1 == 0x10) {
    if (*(long *)(param_1 + 2) == 0) {
      val = (ASN1_VALUE *)0x0;
    }
    else {
      val = (ASN1_VALUE *)ASN1_TYPE_unpack_sequence(&DAT_00c5d758,param_1);
      if (val != (ASN1_VALUE *)0x0) {
        x = *(ASN1_STRING **)val;
        iVar1 = *(int *)(val + 8);
        iVar2 = ASN1_STRING_length(x);
        if (param_2 != (long *)0x0) {
          *param_2 = (long)iVar1;
        }
        if (param_3 != (void *)0x0) {
          iVar1 = iVar2;
          if (param_4 <= iVar2) {
            iVar1 = param_4;
          }
          __src = (void *)ASN1_STRING_get0_data(x);
          memcpy(param_3,__src,(long)iVar1);
        }
        if (iVar2 != -1) goto LAB_00a603f8;
      }
    }
  }
  ERR_new();
  ERR_set_debug("crypto/asn1/evp_asn1.c",0xb7,"ossl_asn1_type_get_octetstring_int");
  ERR_set_error(0xd,0x6d,0);
  iVar2 = -1;
LAB_00a603f8:
  ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5d758);
  return iVar2;
}

