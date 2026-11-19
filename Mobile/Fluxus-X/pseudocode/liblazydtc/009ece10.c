/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ece10
 */

int ASN1_UNIVERSALSTRING_to_string(ASN1_UNIVERSALSTRING *s)

{
  uchar *puVar1;
  uint uVar2;
  byte bVar3;
  bool bVar4;
  bool bVar5;
  int iVar6;
  int iVar7;
  size_t sVar8;
  uchar *puVar9;
  uchar *puVar10;
  long lVar11;
  byte *__s;
  
  if (s->type != 0x1c) {
    return 0;
  }
  uVar2 = s->length;
  if ((uVar2 & 3) != 0) {
    return 0;
  }
  puVar9 = s->data;
  puVar10 = puVar9;
  if (0 < (int)uVar2) {
    lVar11 = 0;
    do {
      puVar1 = puVar9 + lVar11;
      if (((*puVar1 != '\0') || (puVar1[1] != '\0')) || (puVar1[2] != '\0')) {
        return 0;
      }
      lVar11 = lVar11 + 4;
    } while ((int)lVar11 < (int)uVar2);
    if (3 < (int)uVar2) {
      puVar10 = puVar9 + 1;
      *puVar9 = puVar9[3];
      if (7 < s->length) {
        lVar11 = 7;
        puVar9 = puVar10;
        do {
          puVar1 = s->data + lVar11;
          lVar11 = lVar11 + 4;
          puVar10 = puVar9 + 1;
          *puVar9 = *puVar1;
          puVar9 = puVar10;
        } while (lVar11 < s->length);
      }
    }
  }
  *puVar10 = '\0';
  iVar7 = s->length;
  __s = s->data;
  iVar6 = iVar7 + 3;
  if (-1 < iVar7) {
    iVar6 = iVar7;
  }
  iVar6 = iVar6 >> 2;
  s->length = iVar6;
  if (__s != (byte *)0x0) {
    if (iVar7 < -3) {
      sVar8 = strlen((char *)__s);
      iVar6 = (int)sVar8;
    }
    if (0 < iVar6) {
      bVar4 = false;
      bVar5 = false;
      iVar6 = iVar6 + 1;
      do {
        bVar3 = *__s;
        iVar7 = ossl_ctype_check(bVar3,0x800);
        iVar6 = iVar6 + -1;
        if (iVar7 == 0) {
          bVar5 = true;
        }
        if ((bVar3 & 0x80) != 0) {
          bVar4 = true;
        }
        __s = __s + 1;
      } while (1 < iVar6);
      if (bVar4) {
        iVar6 = 0x14;
        goto LAB_009ecf54;
      }
      if (bVar5) {
        iVar6 = 0x16;
        goto LAB_009ecf54;
      }
    }
  }
  iVar6 = 0x13;
LAB_009ecf54:
  s->type = iVar6;
  return 1;
}

