/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af0280
 */

void WHIRLPOOL_BitUpdate(WHIRLPOOL_CTX *c,void *inp,size_t bits)

{
  uchar *puVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  byte bVar5;
  uint uVar6;
  uint uVar7;
  ulong uVar8;
  byte *pbVar9;
  byte *pbVar10;
  size_t sVar11;
  uint uVar12;
  uint uVar13;
  byte *pbVar14;
  
  uVar12 = c->bitoff;
  uVar8 = c->bitlen[0];
  uVar2 = -(int)bits & 7;
  uVar13 = uVar12 & 7;
  c->bitlen[0] = uVar8 + bits;
  if (((CARRY8(uVar8,bits)) && (sVar11 = c->bitlen[1] + 1, c->bitlen[1] = sVar11, sVar11 == 0)) &&
     (sVar11 = c->bitlen[2] + 1, c->bitlen[2] = sVar11, sVar11 == 0)) {
    c->bitlen[3] = c->bitlen[3] + 1;
    if (uVar2 == 0 && uVar13 == 0) goto LAB_00af04c4;
  }
  else if (uVar2 == 0 && uVar13 == 0) goto LAB_00af04c4;
  if (bits == 0) {
    return;
  }
  puVar1 = c->data;
  pbVar14 = inp;
  while( true ) {
    uVar4 = 8 - uVar13;
    uVar8 = (ulong)(uVar12 >> 3);
    if (uVar13 == uVar2) break;
    sVar11 = bits;
    pbVar10 = pbVar14;
    uVar7 = uVar12;
    while( true ) {
      pbVar9 = pbVar10 + 1;
      uVar3 = (uint)*pbVar10 << (ulong)uVar2;
      if (sVar11 < 9) break;
      bVar5 = *pbVar9 >> (ulong)(8 - uVar2 & 0x1f);
      if (uVar13 == 0) {
        c->data[uVar8] = bVar5 | (byte)uVar3;
      }
      else {
        c->data[uVar8] = c->data[uVar8] | (byte)(((uint)bVar5 | uVar3 & 0xff) >> (ulong)uVar13);
      }
      uVar7 = uVar7 + 8;
      if (uVar7 < 0x200) {
        uVar6 = (int)uVar8 + 1;
      }
      else {
        whirlpool_block(c,puVar1,1);
        uVar6 = 0;
        uVar7 = uVar7 & 0x1ff;
      }
      pbVar10 = pbVar9;
      if (uVar13 == 0) {
        bits = sVar11 - 8;
        uVar12 = uVar7;
        goto LAB_00af045c;
      }
      sVar11 = sVar11 - 8;
      uVar8 = (ulong)(uVar7 >> 3);
      c->data[uVar6] = (uchar)(((uint)bVar5 | uVar3 & 0xff) << (ulong)(uVar4 & 0x1f));
      c->bitoff = uVar7;
      if (uVar13 == uVar2) goto LAB_00af0478;
    }
    if (uVar13 == 0) {
      c->data[uVar8] = (byte)uVar3;
    }
    else {
      c->data[uVar8] = c->data[uVar8] | (byte)((uVar3 & 0xff) >> (ulong)uVar13);
    }
    uVar12 = (int)sVar11 + uVar7;
    if (uVar12 == 0x200) {
      whirlpool_block(c,puVar1,1);
      uVar12 = 0;
      uVar7 = 0;
    }
    else {
      uVar7 = (int)uVar8 + 1;
    }
    if (uVar13 != 0) {
      c->data[uVar7] = (uchar)((uVar3 & 0xff) << (ulong)(uVar4 & 0x1f));
      c->bitoff = uVar12;
      return;
    }
    bits = 0;
LAB_00af045c:
    uVar13 = 0;
    c->bitoff = uVar12;
    pbVar14 = pbVar10;
    if (bits == 0) {
      return;
    }
  }
LAB_00af0478:
  inp = pbVar14 + 1;
  uVar12 = uVar4 + uVar12;
  bits = bits - uVar4;
  c->data[uVar8] = c->data[uVar8] | *pbVar14 & (byte)(0xff >> (ulong)uVar13);
  if (uVar12 == 0x200) {
    whirlpool_block(c,puVar1,1);
    uVar12 = 0;
  }
  c->bitoff = uVar12;
LAB_00af04c4:
  if (bits != 0) {
    do {
      while ((uVar12 != 0 || (bits >> 9 == 0))) {
        uVar2 = 0x200 - uVar12;
        if (bits < uVar2) {
          memcpy(c->data + (uVar12 >> 3),inp,bits >> 3);
          uVar12 = uVar12 + (int)bits;
          bits = 0;
        }
        else {
          memcpy(c->data + (uVar12 >> 3),inp,(ulong)(uVar2 >> 3));
          inp = (void *)((long)inp + (ulong)(uVar2 >> 3));
          whirlpool_block(c,c->data,1);
          uVar12 = 0;
          bits = bits - uVar2;
        }
        c->bitoff = uVar12;
        if (bits == 0) {
          return;
        }
      }
      whirlpool_block(c,inp);
      uVar8 = bits >> 3;
      uVar12 = 0;
      bits = bits & 0x1ff;
      inp = (void *)((long)inp + (uVar8 & 0x1fffffffffffffc0));
    } while (bits != 0);
  }
  return;
}

