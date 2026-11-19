/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a17684
 */

int DES_set_key(const_DES_cblock *key,DES_key_schedule *schedule)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  uint uVar9;
  int iVar10;
  uint uVar11;
  long lVar12;
  
  bVar1 = (*key)[0] ^ (*key)[0] >> 4;
  bVar2 = (*key)[1] ^ (*key)[1] >> 4;
  bVar1 = bVar1 ^ bVar1 >> 2;
  bVar2 = bVar2 ^ bVar2 >> 2;
  bVar3 = (*key)[2] ^ (*key)[2] >> 4;
  bVar3 = bVar3 ^ bVar3 >> 2;
  bVar4 = (*key)[3] ^ (*key)[3] >> 4;
  bVar5 = (*key)[4] ^ (*key)[4] >> 4;
  bVar4 = bVar4 ^ bVar4 >> 2;
  bVar6 = (*key)[5] ^ (*key)[5] >> 4;
  bVar5 = bVar5 ^ bVar5 >> 2;
  bVar7 = (*key)[6] ^ (*key)[6] >> 4;
  bVar6 = bVar6 ^ bVar6 >> 2;
  bVar8 = (*key)[7] ^ (*key)[7] >> 4;
  bVar7 = bVar7 ^ bVar7 >> 2;
  bVar8 = bVar8 ^ bVar8 >> 2;
  lVar12 = 0;
  uVar11 = 0;
  iVar10 = ((byte)((bVar1 ^ bVar1 >> 1) & (bVar2 ^ bVar2 >> 1) & (bVar3 ^ bVar3 >> 1) &
                   (bVar4 ^ bVar4 >> 1) & (bVar5 ^ bVar5 >> 1) & (bVar6 ^ bVar6 >> 1) &
                   (bVar7 ^ bVar7 >> 1) & (bVar8 ^ bVar8 >> 1)) & 1) - 1;
  do {
    uVar9 = CRYPTO_memcmp(&DAT_00753040 + lVar12,key,8);
    lVar12 = lVar12 + 8;
    uVar11 = uVar11 | (int)(uVar9 - 1 & (uVar9 ^ 0xffffffff)) >> 0x1f;
  } while (lVar12 != 0x80);
  if ((uVar11 & 1) != 0) {
    iVar10 = -2;
  }
  DES_set_key_unchecked(key,schedule);
  return iVar10;
}

