/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ecd68
 */

int ASN1_PRINTABLE_type(uchar *s,int max)

{
  byte bVar1;
  bool bVar2;
  bool bVar3;
  int iVar4;
  size_t sVar5;
  int iVar6;
  
  if (s != (uchar *)0x0) {
    if (max < 0) {
      sVar5 = strlen((char *)s);
      max = (int)sVar5;
    }
    if (0 < max) {
      bVar2 = false;
      bVar3 = false;
      iVar6 = max + 1;
      do {
        bVar1 = *s;
        iVar4 = ossl_ctype_check(bVar1,0x800);
        iVar6 = iVar6 + -1;
        if (iVar4 == 0) {
          bVar3 = true;
        }
        if ((bVar1 & 0x80) != 0) {
          bVar2 = true;
        }
        s = s + 1;
      } while (1 < iVar6);
      if (bVar2) {
        return 0x14;
      }
      if (bVar3) {
        return 0x16;
      }
    }
  }
  return 0x13;
}

