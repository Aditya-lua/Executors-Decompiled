/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acb368
 */

void RC2_set_key(RC2_KEY *key,int len,uchar *data,int bits)

{
  char *pcVar1;
  ulong uVar2;
  uchar *puVar3;
  long lVar4;
  int iVar5;
  byte bVar6;
  long lVar7;
  int iVar8;
  ulong uVar9;
  long lVar10;
  byte *pbVar11;
  char cVar12;
  ulong uVar13;
  uchar *puVar14;
  uint *puVar15;
  ulong uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  
  iVar5 = len;
  if (0x7f < len) {
    iVar5 = 0x80;
  }
  iVar8 = 0x400;
  if (0 < bits) {
    iVar8 = bits;
  }
  if (0x3ff < iVar8) {
    iVar8 = 0x400;
  }
  *(undefined1 *)key->data = 0;
  if (0 < len) {
    uVar9 = (ulong)iVar5;
    uVar2 = uVar9;
    if ((long)uVar9 < 2) {
      uVar2 = 1;
    }
    uVar13 = 0;
    if (0x1f < uVar2) {
      uVar16 = uVar9;
      if ((long)uVar9 < 2) {
        uVar16 = 1;
      }
      if (((RC2_KEY *)(data + uVar16) <= key) ||
         (uVar13 = 0, (uchar *)((long)key->data + uVar16) <= data)) {
        uVar13 = uVar2 & 0x7fffffffffffffe0;
        puVar14 = data + 0x10;
        puVar15 = key->data + 4;
        uVar16 = uVar13;
        do {
          puVar3 = puVar14 + -8;
          uVar17 = *(undefined8 *)(puVar14 + -0x10);
          uVar19 = *(undefined8 *)(puVar14 + 8);
          uVar18 = *(undefined8 *)puVar14;
          puVar14 = puVar14 + 0x20;
          uVar16 = uVar16 - 0x20;
          *(undefined8 *)(puVar15 + -2) = *(undefined8 *)puVar3;
          *(undefined8 *)((RC2_KEY *)(puVar15 + -4))->data = uVar17;
          *(undefined8 *)(puVar15 + 2) = uVar19;
          *(undefined8 *)puVar15 = uVar18;
          puVar15 = puVar15 + 8;
        } while (uVar16 != 0);
        if (uVar2 == uVar13) goto LAB_00acb414;
      }
    }
    do {
      *(uchar *)((long)key->data + uVar13) = data[uVar13];
      uVar13 = uVar13 + 1;
    } while ((long)uVar13 < (long)uVar9);
  }
LAB_00acb414:
  if (len < 0x80) {
    cVar12 = *(char *)((long)key->data + (long)iVar5 + -1);
    lVar10 = 0;
    do {
      pcVar1 = (char *)((long)key->data + lVar10);
      lVar7 = lVar10 + (iVar5 + 1);
      lVar10 = lVar10 + 1;
      cVar12 = (&DAT_007747ac)[(byte)(*pcVar1 + cVar12)];
      *(char *)((long)key->data + lVar7 + -1) = cVar12;
    } while ((iVar5 + 1) + lVar10 + -2 < 0x7f);
  }
  iVar5 = iVar8 + 7 >> 3;
  lVar10 = 0x80 - (long)iVar5;
  bVar6 = (&DAT_007747ac)[0xffU >> (ulong)(-iVar8 & 7) & (uint)*(byte *)((long)key + lVar10)];
  *(byte *)((long)key + lVar10) = bVar6;
  if ((int)lVar10 != 0) {
    pbVar11 = (byte *)((long)key->data + 0x7f);
    iVar5 = iVar5 + -0x80;
    do {
      iVar5 = iVar5 + 1;
      bVar6 = (&DAT_007747ac)[*pbVar11 ^ bVar6];
      pbVar11[(long)(int)lVar10 + -0x80] = bVar6;
      pbVar11 = pbVar11 + -1;
    } while (iVar5 != 0);
  }
  lVar7 = 0;
  lVar10 = 0xfc;
  do {
    lVar4 = lVar7 + 0x7e;
    uVar2 = lVar7 + 0x7f;
    lVar7 = lVar7 + -2;
    *(uint *)((long)key->data + lVar10) = (uint)*(ushort *)((long)key->data + lVar4);
    lVar10 = lVar10 + -4;
  } while (1 < uVar2);
  return;
}

