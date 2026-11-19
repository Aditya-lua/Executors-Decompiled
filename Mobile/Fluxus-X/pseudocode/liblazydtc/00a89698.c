/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a89698
 */

void AES_encrypt(uchar *in,uchar *out,AES_KEY *key)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  byte bVar8;
  byte bVar9;
  byte bVar10;
  uint uVar11;
  ulong uVar12;
  uint *puVar13;
  int iVar14;
  uint uVar15;
  uint uVar16;
  uint uVar17;
  
  uVar15 = (*(uint *)in & 0xff00ff00) >> 8 | (*(uint *)in & 0xff00ff) << 8;
  uVar15 = (uVar15 >> 0x10 | uVar15 << 0x10) ^ key->rd_key[0];
  uVar17 = (*(uint *)(in + 8) & 0xff00ff00) >> 8 | (*(uint *)(in + 8) & 0xff00ff) << 8;
  iVar14 = key->rounds >> 1;
  uVar16 = (*(uint *)(in + 4) & 0xff00ff00) >> 8 | (*(uint *)(in + 4) & 0xff00ff) << 8;
  uVar17 = (uVar17 >> 0x10 | uVar17 << 0x10) ^ key->rd_key[2];
  uVar12 = (ulong)(iVar14 - 1);
  uVar16 = (uVar16 >> 0x10 | uVar16 << 0x10) ^ key->rd_key[1];
  uVar11 = (*(uint *)(in + 0xc) & 0xff00ff00) >> 8 | (*(uint *)(in + 0xc) & 0xff00ff) << 8;
  iVar14 = -iVar14;
  puVar13 = key->rd_key + 6;
  uVar11 = (uVar11 >> 0x10 | uVar11 << 0x10) ^ key->rd_key[3];
  while( true ) {
    iVar14 = iVar14 + 1;
    uVar1 = *(uint *)(&DAT_00767e78 + (ulong)(uVar16 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_00767a78 + (ulong)(uVar15 >> 0x18) * 4) ^
            *(uint *)(&DAT_00767278 + (ulong)(uVar17 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_00767678 + (ulong)(uVar11 & 0xff) * 4) ^ puVar13[-2];
    uVar2 = *(uint *)(&DAT_00767e78 + (ulong)(uVar17 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_00767a78 + (ulong)(uVar16 >> 0x18) * 4) ^
            *(uint *)(&DAT_00767278 + (ulong)(uVar11 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_00767678 + (ulong)(uVar15 & 0xff) * 4) ^ puVar13[-1];
    uVar3 = *(uint *)(&DAT_00767e78 + (ulong)(uVar11 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_00767a78 + (ulong)(uVar17 >> 0x18) * 4) ^
            *(uint *)(&DAT_00767278 + (ulong)(uVar15 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_00767678 + (ulong)(uVar16 & 0xff) * 4) ^ *puVar13;
    uVar11 = *(uint *)(&DAT_00767e78 + (ulong)(uVar15 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_00767a78 + (ulong)(uVar11 >> 0x18) * 4) ^
             *(uint *)(&DAT_00767278 + (ulong)(uVar16 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_00767678 + (ulong)(uVar17 & 0xff) * 4) ^ puVar13[1];
    if (iVar14 == 0) break;
    uVar15 = *(uint *)(&DAT_00767e78 + (ulong)(uVar2 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_00767a78 + (ulong)(uVar1 >> 0x18) * 4) ^
             *(uint *)(&DAT_00767278 + (ulong)(uVar3 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_00767678 + (ulong)(uVar11 & 0xff) * 4) ^ puVar13[2];
    uVar16 = *(uint *)(&DAT_00767e78 + (ulong)(uVar3 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_00767a78 + (ulong)(uVar2 >> 0x18) * 4) ^
             *(uint *)(&DAT_00767278 + (ulong)(uVar11 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_00767678 + (ulong)(uVar1 & 0xff) * 4) ^ puVar13[3];
    uVar17 = *(uint *)(&DAT_00767e78 + (ulong)(uVar11 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_00767a78 + (ulong)(uVar3 >> 0x18) * 4) ^
             *(uint *)(&DAT_00767278 + (ulong)(uVar1 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_00767678 + (ulong)(uVar2 & 0xff) * 4) ^ puVar13[4];
    uVar11 = *(uint *)(&DAT_00767e78 + (ulong)(uVar1 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_00767a78 + (ulong)(uVar11 >> 0x18) * 4) ^
             *(uint *)(&DAT_00767278 + (ulong)(uVar2 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_00767678 + (ulong)(uVar3 & 0xff) * 4) ^ puVar13[5];
    puVar13 = puVar13 + 8;
  }
  uVar17 = *(uint *)(&DAT_00767278 + (ulong)(uVar2 >> 0x18) * 4);
  uVar16 = *(uint *)(&DAT_00767278 + (ulong)(uVar3 >> 0x18) * 4);
  uVar4 = *(uint *)(&DAT_00767278 + (ulong)(uVar11 >> 0x18) * 4);
  uVar5 = *(uint *)(&DAT_00767678 + (ulong)(uVar3 >> 0x10 & 0xff) * 4);
  uVar6 = *(uint *)(&DAT_00767678 + (ulong)(uVar11 >> 0x10 & 0xff) * 4);
  uVar7 = *(uint *)(&DAT_00767678 + (ulong)(uVar1 >> 0x10 & 0xff) * 4);
  bVar8 = (&DAT_00767e78)[(ulong)(uVar1 & 0xff) * 4];
  bVar9 = (&DAT_00767e78)[(ulong)(uVar2 & 0xff) * 4];
  bVar10 = (&DAT_00767e78)[(ulong)(uVar3 & 0xff) * 4];
  uVar15 = (*(uint *)(&DAT_00767678 + (ulong)(uVar2 >> 0x10 & 0xff) * 4) & 0xff0000 |
            *(uint *)(&DAT_00767278 + (ulong)(uVar1 >> 0x18) * 4) & 0xff000000 |
            *(uint *)(&DAT_00767a78 + (ulong)(uVar3 >> 8 & 0xff) * 4) & 0xff00 |
           (uint)(byte)(&DAT_00767e78)[(ulong)(uVar11 & 0xff) * 4]) ^ key->rd_key[uVar12 * 8 + 8];
  uVar11 = *(uint *)(&DAT_00767a78 + (ulong)(uVar11 >> 8 & 0xff) * 4);
  uVar1 = *(uint *)(&DAT_00767a78 + (ulong)(uVar1 >> 8 & 0xff) * 4);
  uVar2 = *(uint *)(&DAT_00767a78 + (ulong)(uVar2 >> 8 & 0xff) * 4);
  *out = (uchar)(uVar15 >> 0x18);
  out[3] = (uchar)uVar15;
  out[1] = (uchar)(uVar15 >> 0x10);
  out[2] = (uchar)(uVar15 >> 8);
  uVar15 = (uVar5 & 0xff0000 | uVar17 & 0xff000000 | uVar11 & 0xff00 | (uint)bVar8) ^
           key->rd_key[uVar12 * 8 + 9];
  out[7] = (uchar)uVar15;
  out[4] = (uchar)(uVar15 >> 0x18);
  out[5] = (uchar)(uVar15 >> 0x10);
  out[6] = (uchar)(uVar15 >> 8);
  uVar15 = (uVar6 & 0xff0000 | uVar16 & 0xff000000 | uVar1 & 0xff00 | (uint)bVar9) ^
           key->rd_key[uVar12 * 8 + 10];
  out[0xb] = (uchar)uVar15;
  out[8] = (uchar)(uVar15 >> 0x18);
  out[9] = (uchar)(uVar15 >> 0x10);
  out[10] = (uchar)(uVar15 >> 8);
  uVar15 = (uVar7 & 0xff0000 | uVar4 & 0xff000000 | uVar2 & 0xff00 | (uint)bVar10) ^
           key->rd_key[uVar12 * 8 + 0xb];
  out[0xc] = (uchar)(uVar15 >> 0x18);
  out[0xd] = (uchar)(uVar15 >> 0x10);
  out[0xe] = (uchar)(uVar15 >> 8);
  out[0xf] = (uchar)uVar15;
  return;
}

