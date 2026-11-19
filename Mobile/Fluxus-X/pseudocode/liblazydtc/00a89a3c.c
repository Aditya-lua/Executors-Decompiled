/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a89a3c
 */

void AES_decrypt(uchar *in,uchar *out,AES_KEY *key)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  byte bVar9;
  byte bVar10;
  byte bVar11;
  byte bVar12;
  byte bVar13;
  byte bVar14;
  byte bVar15;
  uint uVar16;
  ulong uVar17;
  uint *puVar18;
  int iVar19;
  uint uVar20;
  uint uVar21;
  uint uVar22;
  
  uVar20 = (*(uint *)in & 0xff00ff00) >> 8 | (*(uint *)in & 0xff00ff) << 8;
  uVar20 = (uVar20 >> 0x10 | uVar20 << 0x10) ^ key->rd_key[0];
  uVar21 = (*(uint *)(in + 4) & 0xff00ff00) >> 8 | (*(uint *)(in + 4) & 0xff00ff) << 8;
  uVar21 = (uVar21 >> 0x10 | uVar21 << 0x10) ^ key->rd_key[1];
  uVar22 = (*(uint *)(in + 8) & 0xff00ff00) >> 8 | (*(uint *)(in + 8) & 0xff00ff) << 8;
  iVar19 = key->rounds >> 1;
  uVar16 = (*(uint *)(in + 0xc) & 0xff00ff00) >> 8 | (*(uint *)(in + 0xc) & 0xff00ff) << 8;
  uVar22 = (uVar22 >> 0x10 | uVar22 << 0x10) ^ key->rd_key[2];
  uVar17 = (ulong)(iVar19 - 1);
  uVar16 = (uVar16 >> 0x10 | uVar16 << 0x10) ^ key->rd_key[3];
  puVar18 = key->rd_key + 6;
  iVar19 = -iVar19;
  while( true ) {
    iVar19 = iVar19 + 1;
    uVar1 = *(uint *)(&DAT_007686a0 + (ulong)(uVar16 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_007682a0 + (ulong)(uVar20 >> 0x18) * 4) ^
            *(uint *)(&DAT_00768aa0 + (ulong)(uVar22 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_00768ea0 + (ulong)(uVar21 & 0xff) * 4) ^ puVar18[-2];
    uVar2 = *(uint *)(&DAT_007686a0 + (ulong)(uVar20 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_007682a0 + (ulong)(uVar21 >> 0x18) * 4) ^
            *(uint *)(&DAT_00768aa0 + (ulong)(uVar16 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_00768ea0 + (ulong)(uVar22 & 0xff) * 4) ^ puVar18[-1];
    uVar3 = *(uint *)(&DAT_007686a0 + (ulong)(uVar21 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_007682a0 + (ulong)(uVar22 >> 0x18) * 4) ^
            *(uint *)(&DAT_00768aa0 + (ulong)(uVar20 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_00768ea0 + (ulong)(uVar16 & 0xff) * 4) ^ *puVar18;
    uVar16 = *(uint *)(&DAT_007686a0 + (ulong)(uVar22 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_007682a0 + (ulong)(uVar16 >> 0x18) * 4) ^
             *(uint *)(&DAT_00768aa0 + (ulong)(uVar21 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_00768ea0 + (ulong)(uVar20 & 0xff) * 4) ^ puVar18[1];
    if (iVar19 == 0) break;
    uVar20 = *(uint *)(&DAT_007686a0 + (ulong)(uVar16 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_007682a0 + (ulong)(uVar1 >> 0x18) * 4) ^
             *(uint *)(&DAT_00768aa0 + (ulong)(uVar3 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_00768ea0 + (ulong)(uVar2 & 0xff) * 4) ^ puVar18[2];
    uVar21 = *(uint *)(&DAT_007686a0 + (ulong)(uVar1 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_007682a0 + (ulong)(uVar2 >> 0x18) * 4) ^
             *(uint *)(&DAT_00768aa0 + (ulong)(uVar16 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_00768ea0 + (ulong)(uVar3 & 0xff) * 4) ^ puVar18[3];
    uVar22 = *(uint *)(&DAT_007686a0 + (ulong)(uVar2 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_007682a0 + (ulong)(uVar3 >> 0x18) * 4) ^
             *(uint *)(&DAT_00768aa0 + (ulong)(uVar1 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_00768ea0 + (ulong)(uVar16 & 0xff) * 4) ^ puVar18[4];
    uVar16 = *(uint *)(&DAT_007686a0 + (ulong)(uVar3 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_007682a0 + (ulong)(uVar16 >> 0x18) * 4) ^
             *(uint *)(&DAT_00768aa0 + (ulong)(uVar2 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_00768ea0 + (ulong)(uVar1 & 0xff) * 4) ^ puVar18[5];
    puVar18 = puVar18 + 8;
  }
  bVar4 = (&DAT_007692a0)[uVar2 >> 0x18];
  bVar5 = (&DAT_007692a0)[uVar1 >> 0x10 & 0xff];
  bVar6 = (&DAT_007692a0)[uVar16 >> 8 & 0xff];
  bVar7 = (&DAT_007692a0)[uVar3 & 0xff];
  bVar8 = (&DAT_007692a0)[uVar3 >> 0x18];
  bVar9 = (&DAT_007692a0)[uVar2 >> 0x10 & 0xff];
  bVar10 = (&DAT_007692a0)[uVar1 >> 8 & 0xff];
  bVar11 = (&DAT_007692a0)[uVar16 & 0xff];
  bVar12 = (&DAT_007692a0)[uVar16 >> 0x18];
  bVar13 = (&DAT_007692a0)[uVar3 >> 0x10 & 0xff];
  bVar14 = (&DAT_007692a0)[uVar2 >> 8 & 0xff];
  bVar15 = (&DAT_007692a0)[uVar1 & 0xff];
  uVar20 = ((uint)(byte)(&DAT_007692a0)[uVar1 >> 0x18] << 0x18 |
            (uint)(byte)(&DAT_007692a0)[uVar16 >> 0x10 & 0xff] << 0x10 |
            (uint)(byte)(&DAT_007692a0)[uVar3 >> 8 & 0xff] << 8 |
           (uint)(byte)(&DAT_007692a0)[uVar2 & 0xff]) ^ key->rd_key[uVar17 * 8 + 8];
  *out = (uchar)(uVar20 >> 0x18);
  out[3] = (uchar)uVar20;
  out[1] = (uchar)(uVar20 >> 0x10);
  out[2] = (uchar)(uVar20 >> 8);
  uVar20 = ((uint)bVar4 << 0x18 | (uint)bVar5 << 0x10 | (uint)bVar6 << 8 | (uint)bVar7) ^
           key->rd_key[uVar17 * 8 + 9];
  out[4] = (uchar)(uVar20 >> 0x18);
  out[7] = (uchar)uVar20;
  out[5] = (uchar)(uVar20 >> 0x10);
  out[6] = (uchar)(uVar20 >> 8);
  uVar20 = ((uint)bVar8 << 0x18 | (uint)bVar9 << 0x10 | (uint)bVar10 << 8 | (uint)bVar11) ^
           key->rd_key[uVar17 * 8 + 10];
  out[0xb] = (uchar)uVar20;
  out[8] = (uchar)(uVar20 >> 0x18);
  out[9] = (uchar)(uVar20 >> 0x10);
  out[10] = (uchar)(uVar20 >> 8);
  uVar20 = ((uint)bVar12 << 0x18 | (uint)bVar13 << 0x10 | (uint)bVar14 << 8 | (uint)bVar15) ^
           key->rd_key[uVar17 * 8 + 0xb];
  out[0xc] = (uchar)(uVar20 >> 0x18);
  out[0xd] = (uchar)(uVar20 >> 0x10);
  out[0xe] = (uchar)(uVar20 >> 8);
  out[0xf] = (uchar)uVar20;
  return;
}

