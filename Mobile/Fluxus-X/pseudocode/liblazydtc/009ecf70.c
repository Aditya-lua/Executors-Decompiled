/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ecf70
 */

int ASN1_STRING_print(BIO *bp,ASN1_STRING *v)

{
  bool bVar1;
  int len;
  int iVar2;
  int len_00;
  byte bVar3;
  long lVar4;
  uchar *puVar5;
  byte bVar6;
  byte local_90 [80];
  
  if (v == (ASN1_STRING *)0x0) {
LAB_009ed03c:
    iVar2 = 0;
  }
  else {
    iVar2 = v->length;
    if (0 < iVar2) {
      puVar5 = v->data;
      lVar4 = 0;
      len_00 = 0;
      do {
        bVar3 = puVar5[lVar4];
        if (bVar3 < 0x7f) {
          if (bVar3 < 0x20) {
            bVar6 = bVar3;
            if (bVar3 != 10) {
              bVar6 = 0x2e;
            }
            if (bVar3 != 0xd) {
              bVar3 = bVar6;
            }
          }
        }
        else {
          bVar3 = 0x2e;
        }
        local_90[len_00] = bVar3;
        len = len_00 + 1;
        bVar1 = 0x4e < len_00;
        len_00 = len;
        if (bVar1) {
          iVar2 = BIO_write(bp,local_90,len);
          if (iVar2 < 1) goto LAB_009ed03c;
          iVar2 = v->length;
          len_00 = 0;
        }
        lVar4 = lVar4 + 1;
      } while (lVar4 < iVar2);
      if ((0 < len_00) && (iVar2 = BIO_write(bp,local_90,len_00), iVar2 < 1)) goto LAB_009ed03c;
    }
    iVar2 = 1;
  }
  return iVar2;
}

