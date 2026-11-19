/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f3068
 */

ASN1_INTEGER * d2i_ASN1_UINTEGER(ASN1_INTEGER **a,uchar **pp,long length)

{
  uint uVar1;
  uchar *__dest;
  ASN1_INTEGER *a_00;
  undefined4 uVar2;
  int iStack_48;
  int local_44;
  long local_40;
  uchar *local_38;
  
  local_40 = 0;
  if ((a == (ASN1_INTEGER **)0x0) || (a_00 = *a, a_00 == (ASN1_INTEGER *)0x0)) {
    a_00 = ASN1_INTEGER_new();
    if (a_00 == (ASN1_INTEGER *)0x0) {
      return (ASN1_INTEGER *)0x0;
    }
    a_00->type = 2;
  }
  local_38 = *pp;
  uVar1 = ASN1_get_object(&local_38,&local_40,&local_44,&iStack_48,length);
  if ((uVar1 >> 7 & 1) == 0) {
    if (local_44 == 2) {
      if (local_40 < 0) {
        uVar2 = 0xe2;
      }
      else {
        __dest = CRYPTO_malloc((int)((ulong)((local_40 << 0x20) + 0x100000000) >> 0x20),
                               "crypto/asn1/a_int.c",0x1b0);
        if (__dest != (uchar *)0x0) {
          a_00->type = 2;
          if (local_40 != 0) {
            if ((local_40 + -1 != 0) && (*local_38 == '\0')) {
              local_38 = local_38 + 1;
              local_40 = local_40 + -1;
            }
            memcpy(__dest,local_38,(long)(int)local_40);
            local_38 = local_38 + local_40;
          }
          CRYPTO_free(a_00->data);
          a_00->data = __dest;
          a_00->length = (int)local_40;
          if (a != (ASN1_INTEGER **)0x0) {
            *a = a_00;
          }
          *pp = local_38;
          return a_00;
        }
        uVar2 = 0xc0100;
      }
    }
    else {
      uVar2 = 0x73;
    }
  }
  else {
    uVar2 = 0x66;
  }
  ERR_new();
  ERR_set_debug("crypto/asn1/a_int.c",0x1c7,"d2i_ASN1_UINTEGER");
  ERR_set_error(0xd,uVar2,0);
  if ((a == (ASN1_INTEGER **)0x0) || (*a != a_00)) {
    ASN1_INTEGER_free(a_00);
  }
  return (ASN1_INTEGER *)0x0;
}

