/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8945c
 */

int AES_set_decrypt_key(uchar *userKey,int bits,AES_KEY *key)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  int iVar14;
  long lVar15;
  uint *puVar16;
  long lVar17;
  uint *puVar18;
  
  iVar14 = AES_set_encrypt_key(userKey,bits,key);
  if (-1 < iVar14) {
    if (0 < key->rounds) {
      iVar14 = key->rounds << 2;
      lVar17 = (long)iVar14;
      lVar15 = 0;
      puVar16 = key->rd_key + (long)iVar14 + 2;
      puVar18 = key->rd_key + 2;
      do {
        lVar17 = lVar17 + -4;
        uVar4 = ((AES_KEY *)(puVar18 + -2))->rd_key[0];
        lVar15 = lVar15 + 4;
        ((AES_KEY *)(puVar18 + -2))->rd_key[0] = puVar16[-2];
        puVar16[-2] = uVar4;
        uVar4 = puVar18[-1];
        puVar18[-1] = puVar16[-1];
        puVar16[-1] = uVar4;
        uVar4 = *puVar18;
        *puVar18 = *puVar16;
        *puVar16 = uVar4;
        uVar4 = puVar18[1];
        puVar18[1] = puVar16[1];
        puVar16[1] = uVar4;
        puVar16 = puVar16 + -4;
        puVar18 = puVar18 + 4;
      } while (lVar15 < lVar17);
      if (key->rounds < 2) {
        return 0;
      }
      puVar16 = key->rd_key + 7;
      iVar14 = 1;
      do {
        uVar4 = puVar16[-3];
        uVar2 = puVar16[-2];
        uVar1 = puVar16[-1];
        uVar3 = *puVar16;
        iVar14 = iVar14 + 1;
        uVar5 = *(uint *)(&DAT_007682a0 +
                         (ulong)(byte)(&DAT_00767e78)[(ulong)(uVar2 >> 0x18) * 4] * 4);
        uVar6 = *(uint *)(&DAT_007686a0 +
                         (ulong)(byte)(&DAT_00767e78)[(ulong)(uVar2 >> 0x10 & 0xff) * 4] * 4);
        uVar7 = *(uint *)(&DAT_007682a0 +
                         (ulong)(byte)(&DAT_00767e78)[(ulong)(uVar1 >> 0x18) * 4] * 4);
        uVar8 = *(uint *)(&DAT_007686a0 +
                         (ulong)(byte)(&DAT_00767e78)[(ulong)(uVar1 >> 0x10 & 0xff) * 4] * 4);
        uVar9 = *(uint *)(&DAT_007682a0 +
                         (ulong)(byte)(&DAT_00767e78)[(ulong)(uVar3 >> 0x18) * 4] * 4);
        uVar10 = *(uint *)(&DAT_007686a0 +
                          (ulong)(byte)(&DAT_00767e78)[(ulong)(uVar3 >> 0x10 & 0xff) * 4] * 4);
        uVar11 = *(uint *)(&DAT_00768aa0 +
                          (ulong)(byte)(&DAT_00767e78)[(ulong)(uVar2 >> 8 & 0xff) * 4] * 4);
        uVar12 = *(uint *)(&DAT_00768aa0 +
                          (ulong)(byte)(&DAT_00767e78)[(ulong)(uVar1 >> 8 & 0xff) * 4] * 4);
        uVar13 = *(uint *)(&DAT_00768aa0 +
                          (ulong)(byte)(&DAT_00767e78)[(ulong)(uVar3 >> 8 & 0xff) * 4] * 4);
        uVar2 = *(uint *)(&DAT_00768ea0 +
                         (ulong)(byte)(&DAT_00767e78)[((ulong)uVar2 & 0xff) * 4] * 4);
        uVar1 = *(uint *)(&DAT_00768ea0 +
                         (ulong)(byte)(&DAT_00767e78)[((ulong)uVar1 & 0xff) * 4] * 4);
        uVar3 = *(uint *)(&DAT_00768ea0 +
                         (ulong)(byte)(&DAT_00767e78)[((ulong)uVar3 & 0xff) * 4] * 4);
        puVar16[-3] = *(uint *)(&DAT_007686a0 +
                               (ulong)(byte)(&DAT_00767e78)[(ulong)(uVar4 >> 0x10 & 0xff) * 4] * 4)
                      ^ *(uint *)(&DAT_007682a0 +
                                 (ulong)(byte)(&DAT_00767e78)[(ulong)(uVar4 >> 0x18) * 4] * 4) ^
                      *(uint *)(&DAT_00768aa0 +
                               (ulong)(byte)(&DAT_00767e78)[(ulong)(uVar4 >> 8 & 0xff) * 4] * 4) ^
                      *(uint *)(&DAT_00768ea0 +
                               (ulong)(byte)(&DAT_00767e78)[((ulong)uVar4 & 0xff) * 4] * 4);
        puVar16[-2] = uVar6 ^ uVar5 ^ uVar11 ^ uVar2;
        puVar16[-1] = uVar8 ^ uVar7 ^ uVar12 ^ uVar1;
        *puVar16 = uVar10 ^ uVar9 ^ uVar13 ^ uVar3;
        puVar16 = puVar16 + 4;
      } while (iVar14 < key->rounds);
    }
    iVar14 = 0;
  }
  return iVar14;
}

