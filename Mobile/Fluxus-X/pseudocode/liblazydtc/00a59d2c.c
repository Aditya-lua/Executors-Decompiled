/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a59d2c
 */

int EVP_EncodeBlock(uchar *t,uchar *f,int n)

{
  byte *pbVar1;
  uchar *puVar2;
  uchar uVar3;
  uchar uVar4;
  long lVar5;
  byte *pbVar6;
  ulong uVar7;
  uchar uVar8;
  
  if (n < 1) {
    *t = '\0';
    return 0;
  }
  lVar5 = 0;
  pbVar6 = f + 1;
  do {
    pbVar1 = pbVar6 + -1;
    uVar7 = (ulong)*pbVar1 << 0x10;
    if (n < 3) {
      if (n == 2) {
        uVar7 = uVar7 | (ulong)*pbVar6 << 8;
      }
      uVar3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"[uVar7 >> 0x12];
      puVar2 = t + lVar5;
      puVar2[1] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
                  [uVar7 >> 0xc & 0x3f];
      uVar8 = '=';
      *puVar2 = uVar3;
      if (n != 1) {
        uVar8 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
                [uVar7 >> 6 & 0x3f];
      }
      puVar2[2] = uVar8;
      puVar2[3] = '=';
      puVar2[4] = '\0';
      return (int)lVar5 + 4;
    }
    uVar3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            [(ulong)pbVar6[1] & 0x3f];
    uVar8 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            [(ulong)(((uint)*pbVar6 << 8 | (uint)uVar7) >> 0xc) & 0x3f];
    uVar4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            [(ulong)(ushort)(CONCAT11(*pbVar6,pbVar6[1]) >> 6) & 0x3f];
    puVar2 = t + lVar5;
    n = n + -3;
    lVar5 = lVar5 + 4;
    pbVar6 = pbVar6 + 3;
    *puVar2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"[*pbVar1 >> 2];
    puVar2[3] = uVar3;
    puVar2[1] = uVar8;
    puVar2[2] = uVar4;
  } while (n != 0);
  t[lVar5] = '\0';
  return (int)lVar5;
}

