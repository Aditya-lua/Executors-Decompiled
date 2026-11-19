/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0d74
 */

void ASN1_put_object(uchar **pp,int constructed,int length,int tag,int xclass)

{
  byte *pbVar1;
  byte *pbVar2;
  byte bVar3;
  long lVar4;
  uint uVar5;
  long lVar6;
  int iVar7;
  
  pbVar1 = *pp;
  bVar3 = 0;
  if (constructed != 0) {
    bVar3 = 0x20;
  }
  bVar3 = (byte)xclass & 0xc0 | bVar3;
  if (tag < 0x1f) {
    pbVar2 = pbVar1 + 1;
    *pbVar1 = bVar3 | (byte)tag & 0x1f;
  }
  else {
    *pbVar1 = bVar3 | 0x1f;
    lVar6 = 0;
    uVar5 = tag;
    do {
      lVar4 = lVar6;
      uVar5 = uVar5 >> 7;
      lVar6 = lVar4 + 1;
    } while (uVar5 != 0);
    iVar7 = 0;
    do {
      bVar3 = (byte)tag & 0x7f;
      if (iVar7 != 0) {
        bVar3 = (byte)tag | 0x80;
      }
      pbVar1[lVar6] = bVar3;
      lVar6 = lVar6 + -1;
      tag = tag >> 7;
      iVar7 = iVar7 + 1;
    } while (0 < lVar6);
    pbVar2 = pbVar1 + lVar4 + 2;
  }
  if (constructed == 2) {
    *pbVar2 = 0x80;
    *pp = pbVar2 + 1;
    return;
  }
  if (length < 0x80) {
    *pbVar2 = (byte)length;
    *pp = pbVar2 + 1;
    return;
  }
  lVar6 = 0;
  uVar5 = length;
  do {
    lVar4 = lVar6;
    uVar5 = uVar5 >> 8;
    lVar6 = lVar4 + 1;
  } while (uVar5 != 0);
  *pbVar2 = (byte)lVar6 | 0x80;
  do {
    pbVar2[lVar6] = (byte)length;
    lVar6 = lVar6 + -1;
    length = length >> 8;
  } while (0 < lVar6);
  *pp = pbVar2 + lVar4 + 2;
  return;
}

