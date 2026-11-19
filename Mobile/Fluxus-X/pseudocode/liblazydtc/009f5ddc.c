/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f5ddc
 */

int ASN1_BIT_STRING_set_bit(ASN1_BIT_STRING *a,int n,int value)

{
  bool bVar1;
  byte bVar2;
  byte bVar3;
  uint uVar4;
  size_t __n;
  long lVar5;
  long lVar6;
  uchar *puVar7;
  
  if (n < 0) {
    return 0;
  }
  bVar3 = (byte)(1 << (ulong)(~n & 7));
  bVar2 = bVar3;
  if (value == 0) {
    bVar2 = 0;
  }
  if (a == (ASN1_BIT_STRING *)0x0) {
    return 0;
  }
  uVar4 = (uint)n >> 3;
  a->flags = a->flags & 0xfffffffffffffff0;
  if ((a->length <= (int)uVar4) || (puVar7 = a->data, puVar7 == (uchar *)0x0)) {
    if (value == 0) {
      return 1;
    }
    lVar6 = (long)(int)uVar4 + 1;
    puVar7 = (uchar *)CRYPTO_clear_realloc
                                (a->data,(long)a->length,lVar6,"crypto/asn1/a_bitstr.c",0xa8);
    if (puVar7 == (uchar *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/a_bitstr.c",0xaa,"ASN1_BIT_STRING_set_bit");
      ERR_set_error(0xd,0xc0100,0);
      return 0;
    }
    __n = lVar6 - a->length;
    if (0 < (int)__n) {
      memset(puVar7 + a->length,0,__n);
    }
    a->data = puVar7;
    a->length = (int)lVar6;
  }
  puVar7[uVar4] = (bVar3 ^ 0xff) & puVar7[uVar4] | bVar2;
  if (0 < a->length) {
    lVar6 = (long)a->length;
    do {
      lVar5 = lVar6 + -1;
      if (a->data[lVar5] != '\0') {
        return 1;
      }
      a->length = (int)lVar5;
      bVar1 = 1 < lVar6;
      lVar6 = lVar5;
    } while (bVar1);
  }
  return 1;
}

