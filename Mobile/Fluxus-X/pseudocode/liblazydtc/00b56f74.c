/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b56f74
 */

ulong FUN_00b56f74(long param_1,uchar *param_2,ulong param_3,long param_4,long param_5)

{
  byte *pbVar1;
  byte *pbVar2;
  byte *pbVar3;
  byte *pbVar4;
  byte *pbVar5;
  byte *pbVar6;
  byte *pbVar7;
  byte *pbVar8;
  byte *pbVar9;
  byte *pbVar10;
  byte *pbVar11;
  uchar *iv;
  uint uVar12;
  uint uVar13;
  uint uVar14;
  uint uVar15;
  uint uVar16;
  uint uVar17;
  uint uVar18;
  uint uVar19;
  uint uVar20;
  uint uVar21;
  uint uVar22;
  uint uVar23;
  uint uVar24;
  uint uVar25;
  uint uVar26;
  byte bVar27;
  char cVar28;
  int iVar29;
  int iVar30;
  ulong uVar31;
  long lVar32;
  long local_b8;
  long local_a8;
  int local_64;
  
  lVar32 = *(long *)(param_1 + 0xf8);
  if ((param_4 == 0) || (param_5 == 0)) {
    local_b8 = 0;
    local_a8 = param_4;
  }
  else {
    uVar12 = *(byte *)(lVar32 + 99) + 1;
    *(char *)(lVar32 + 99) = (char)uVar12;
    uVar12 = (uint)*(byte *)(lVar32 + 0x62) + (uVar12 >> 8);
    *(char *)(lVar32 + 0x62) = (char)uVar12;
    uVar12 = (uint)*(byte *)(lVar32 + 0x61) + (uVar12 >> 8);
    *(char *)(lVar32 + 0x61) = (char)uVar12;
    uVar12 = (uint)*(byte *)(lVar32 + 0x60) + (uVar12 >> 8);
    *(char *)(lVar32 + 0x60) = (char)uVar12;
    uVar12 = (uint)*(byte *)(lVar32 + 0x5f) + (uVar12 >> 8);
    *(byte *)(lVar32 + 0x5f) = (byte)uVar12;
    uVar12 = (uint)*(byte *)(lVar32 + 0x5e) + (uVar12 >> 8);
    *(byte *)(lVar32 + 0x5e) = (byte)uVar12;
    uVar12 = (uint)*(byte *)(lVar32 + 0x5d) + (uVar12 >> 8);
    *(byte *)(lVar32 + 0x5d) = (byte)uVar12;
    uVar12 = (uint)*(byte *)(lVar32 + 0x5c) + (uVar12 >> 8);
    *(byte *)(lVar32 + 0x5c) = (byte)uVar12;
    uVar12 = (uint)*(byte *)(lVar32 + 0x5b) + (uVar12 >> 8);
    *(byte *)(lVar32 + 0x5b) = (byte)uVar12;
    uVar12 = (uint)*(byte *)(lVar32 + 0x5a) + (uVar12 >> 8);
    *(byte *)(lVar32 + 0x5a) = (byte)uVar12;
    uVar12 = (uint)*(byte *)(lVar32 + 0x59) + (uVar12 >> 8);
    *(byte *)(lVar32 + 0x59) = (byte)uVar12;
    uVar12 = (uint)*(byte *)(lVar32 + 0x58) + (uVar12 >> 8);
    *(byte *)(lVar32 + 0x58) = (byte)uVar12;
    uVar12 = (uint)*(byte *)(lVar32 + 0x57) + (uVar12 >> 8);
    *(byte *)(lVar32 + 0x57) = (byte)uVar12;
    uVar12 = (uint)*(byte *)(lVar32 + 0x56) + (uVar12 >> 8);
    *(byte *)(lVar32 + 0x56) = (byte)uVar12;
    iVar29 = (uint)*(byte *)(lVar32 + 0x55) + (uVar12 >> 8);
    *(byte *)(lVar32 + 0x55) = (byte)iVar29;
    *(char *)(lVar32 + 0x54) = *(char *)(lVar32 + 0x54) + (char)((uint)iVar29 >> 8);
    uVar31 = FUN_00b57484(param_1,param_4,param_5,0,0,0,0);
    if ((int)uVar31 == 0) {
      return uVar31;
    }
    if (*(int *)(lVar32 + 0x30) != 0) {
      param_4 = 0;
      param_5 = 1;
    }
    local_b8 = param_5;
    local_a8 = param_4;
  }
  pbVar1 = (byte *)(lVar32 + 0x5f);
  uVar12 = *(byte *)(lVar32 + 99) + 1;
  pbVar2 = (byte *)(lVar32 + 0x5e);
  uVar13 = (uint)*(byte *)(lVar32 + 0x62) + (uVar12 >> 8);
  pbVar3 = (byte *)(lVar32 + 0x5d);
  uVar14 = (uint)*(byte *)(lVar32 + 0x61) + (uVar13 >> 8);
  pbVar4 = (byte *)(lVar32 + 0x5c);
  uVar15 = (uint)*(byte *)(lVar32 + 0x60) + (uVar14 >> 8);
  pbVar5 = (byte *)(lVar32 + 0x5b);
  uVar16 = (uint)*pbVar1 + (uVar15 >> 8);
  pbVar6 = (byte *)(lVar32 + 0x5a);
  uVar17 = (uint)*pbVar2 + (uVar16 >> 8);
  pbVar7 = (byte *)(lVar32 + 0x59);
  uVar18 = (uint)*pbVar3 + (uVar17 >> 8);
  pbVar8 = (byte *)(lVar32 + 0x58);
  uVar19 = (uint)*pbVar4 + (uVar18 >> 8);
  pbVar9 = (byte *)(lVar32 + 0x57);
  uVar20 = (uint)*pbVar5 + (uVar19 >> 8);
  pbVar10 = (byte *)(lVar32 + 0x56);
  uVar21 = (uint)*pbVar6 + (uVar20 >> 8);
  pbVar11 = (byte *)(lVar32 + 0x55);
  uVar22 = (uint)*pbVar7 + (uVar21 >> 8);
  iv = (uchar *)(lVar32 + 0x54);
  uVar23 = (uint)*pbVar8 + (uVar22 >> 8);
  uVar24 = (uint)*pbVar9 + (uVar23 >> 8);
  uVar25 = (uint)*pbVar10 + (uVar24 >> 8);
  uVar26 = (uint)*pbVar11 + (uVar25 >> 8);
  cVar28 = *iv + (char)(uVar26 >> 8);
  *(char *)(lVar32 + 99) = (char)uVar12;
  *(char *)(lVar32 + 0x62) = (char)uVar13;
  *(char *)(lVar32 + 0x61) = (char)uVar14;
  *(char *)(lVar32 + 0x60) = (char)uVar15;
  *(char *)(lVar32 + 0x5f) = (char)uVar16;
  *(char *)(lVar32 + 0x5e) = (char)uVar17;
  *(char *)(lVar32 + 0x5d) = (char)uVar18;
  *(char *)(lVar32 + 0x5c) = (char)uVar19;
  *(char *)(lVar32 + 0x5b) = (char)uVar20;
  *(char *)(lVar32 + 0x5a) = (char)uVar21;
  *(char *)(lVar32 + 0x59) = (char)uVar22;
  *(char *)(lVar32 + 0x58) = (char)uVar23;
  *(char *)(lVar32 + 0x57) = (char)uVar24;
  *(char *)(lVar32 + 0x56) = (char)uVar25;
  *(char *)(lVar32 + 0x55) = (char)uVar26;
  *(char *)(lVar32 + 0x54) = cVar28;
  if (param_3 == 0) {
    uVar12 = (uVar12 & 0xff) + 1;
    *(char *)(lVar32 + 99) = (char)uVar12;
    uVar12 = (uVar12 >> 8) + (uVar13 & 0xff);
    *(char *)(lVar32 + 0x62) = (char)uVar12;
    uVar12 = (uVar12 >> 8) + (uVar14 & 0xff);
    *(char *)(lVar32 + 0x61) = (char)uVar12;
    uVar12 = (uVar12 >> 8) + (uVar15 & 0xff);
    *(char *)(lVar32 + 0x60) = (char)uVar12;
    uVar12 = (uVar12 >> 8) + (uVar16 & 0xff);
    *(char *)(lVar32 + 0x5f) = (char)uVar12;
    uVar12 = (uVar12 >> 8) + (uVar17 & 0xff);
    *(char *)(lVar32 + 0x5e) = (char)uVar12;
    uVar12 = (uVar12 >> 8) + (uVar18 & 0xff);
    *(char *)(lVar32 + 0x5d) = (char)uVar12;
    uVar12 = (uVar12 >> 8) + (uVar19 & 0xff);
    *(char *)(lVar32 + 0x5c) = (char)uVar12;
    uVar12 = (uVar12 >> 8) + (uVar20 & 0xff);
    *(char *)(lVar32 + 0x5b) = (char)uVar12;
    uVar12 = (uVar12 >> 8) + (uVar21 & 0xff);
    *(char *)(lVar32 + 0x5a) = (char)uVar12;
    uVar12 = (uVar12 >> 8) + (uVar22 & 0xff);
    *(char *)(lVar32 + 0x59) = (char)uVar12;
    uVar12 = (uVar12 >> 8) + (uVar23 & 0xff);
    *(char *)(lVar32 + 0x58) = (char)uVar12;
    uVar12 = (uVar12 >> 8) + (uVar24 & 0xff);
    *(char *)(lVar32 + 0x57) = (char)uVar12;
    uVar12 = (uVar12 >> 8) + (uVar25 & 0xff);
    *(char *)(lVar32 + 0x56) = (char)uVar12;
    iVar29 = (uVar12 >> 8) + (uVar26 & 0xff);
    *(char *)(lVar32 + 0x55) = (char)iVar29;
    *(char *)(lVar32 + 0x54) = cVar28 + (char)((uint)iVar29 >> 8);
  }
  else {
    memset(param_2,0,param_3);
    do {
      iVar29 = EVP_CipherInit_ex(*(EVP_CIPHER_CTX **)(lVar32 + 8),(EVP_CIPHER *)0x0,(ENGINE *)0x0,
                                 (uchar *)0x0,iv,-1);
      if (iVar29 == 0) {
        return 0;
      }
      iVar29 = (int)param_3;
      if (param_3 >> 0x1e != 0) {
        iVar29 = 0x40000000;
      }
      uVar12 = (*(uint *)(lVar32 + 0x60) & 0xff00ff00) >> 8 |
               (*(uint *)(lVar32 + 0x60) & 0xff00ff) << 8;
      uVar13 = uVar12 >> 0x10 | uVar12 << 0x10;
      uVar12 = iVar29 + 0xfU >> 4;
      iVar30 = uVar13 + uVar12;
      if (CARRY4(uVar13,uVar12)) {
        if (iVar30 != 0) {
          iVar29 = uVar13 * -0x10;
        }
        bVar27 = *pbVar1;
        *pbVar1 = (byte)(bVar27 + 1);
        uVar12 = (uint)*pbVar2 + (bVar27 + 1 >> 8);
        *pbVar2 = (byte)uVar12;
        uVar12 = (uint)*pbVar3 + (uVar12 >> 8);
        *pbVar3 = (byte)uVar12;
        uVar12 = (uint)*pbVar4 + (uVar12 >> 8);
        *pbVar4 = (byte)uVar12;
        uVar12 = (uint)*pbVar5 + (uVar12 >> 8);
        *pbVar5 = (byte)uVar12;
        uVar12 = (uint)*pbVar6 + (uVar12 >> 8);
        *pbVar6 = (byte)uVar12;
        uVar12 = (uint)*pbVar7 + (uVar12 >> 8);
        *pbVar7 = (byte)uVar12;
        uVar12 = (uint)*pbVar8 + (uVar12 >> 8);
        *pbVar8 = (byte)uVar12;
        uVar12 = (uint)*pbVar9 + (uVar12 >> 8);
        *pbVar9 = (byte)uVar12;
        uVar12 = (uint)*pbVar10 + (uVar12 >> 8);
        *pbVar10 = (byte)uVar12;
        iVar30 = (uint)*pbVar11 + (uVar12 >> 8);
        *pbVar11 = (byte)iVar30;
        *iv = *iv + (char)((uint)iVar30 >> 8);
        iVar30 = 0;
      }
      *(char *)(lVar32 + 0x60) = (char)((uint)iVar30 >> 0x18);
      *(char *)(lVar32 + 0x61) = (char)((uint)iVar30 >> 0x10);
      *(char *)(lVar32 + 0x62) = (char)((uint)iVar30 >> 8);
      *(char *)(lVar32 + 99) = (char)iVar30;
      iVar30 = EVP_CipherUpdate(*(EVP_CIPHER_CTX **)(lVar32 + 8),param_2,&local_64,param_2,iVar29);
      if (iVar30 == 0) {
        return 0;
      }
      if (local_64 != iVar29) {
        return 0;
      }
      param_3 = param_3 - (long)iVar29;
      param_2 = param_2 + iVar29;
    } while (param_3 != 0);
  }
  iVar29 = FUN_00b57484(param_1,local_a8,local_b8,0,0,0,0);
  return (ulong)(iVar29 != 0);
}

