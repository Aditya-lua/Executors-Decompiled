/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f5f90
 */

int ASN1_BIT_STRING_check(ASN1_BIT_STRING *a,uchar *flags,int flags_len)

{
  long lVar1;
  byte bVar2;
  
  if (a == (ASN1_BIT_STRING *)0x0) {
    return 1;
  }
  if (a->data == (uchar *)0x0) {
    return 1;
  }
  if (a->length < 1) {
    return 1;
  }
  lVar1 = 0;
  do {
    if (lVar1 < flags_len) {
      bVar2 = ~flags[lVar1];
    }
    else {
      bVar2 = 0xff;
    }
    bVar2 = a->data[lVar1] & bVar2;
  } while ((bVar2 == 0) && (lVar1 = lVar1 + 1, lVar1 < a->length));
  return (int)(bVar2 == 0);
}

