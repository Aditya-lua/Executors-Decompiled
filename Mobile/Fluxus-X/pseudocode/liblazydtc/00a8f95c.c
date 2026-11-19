/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8f95c
 */

void Camellia_DecryptBlock_Rounds(int param_1,uint *param_2,uint *param_3,undefined1 *param_4)

{
  uint *puVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  long lVar5;
  uint *puVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  
  puVar1 = param_3 + (param_1 << 4);
  lVar5 = -(long)(param_1 << 4);
  uVar8 = (*param_2 & 0xff00ff00) >> 8 | (*param_2 & 0xff00ff) << 8;
  uVar10 = (param_2[1] & 0xff00ff00) >> 8 | (param_2[1] & 0xff00ff) << 8;
  uVar7 = (uVar8 >> 0x10 | uVar8 << 0x10) ^ *puVar1;
  uVar8 = (uVar10 >> 0x10 | uVar10 << 0x10) ^ puVar1[1];
  uVar10 = (param_2[2] & 0xff00ff00) >> 8 | (param_2[2] & 0xff00ff) << 8;
  uVar9 = (uVar10 >> 0x10 | uVar10 << 0x10) ^ puVar1[2];
  uVar10 = (param_2[3] & 0xff00ff00) >> 8 | (param_2[3] & 0xff00ff) << 8;
  puVar6 = puVar1 + -8;
  uVar10 = (uVar10 >> 0x10 | uVar10 << 0x10) ^ puVar1[3];
  while( true ) {
    lVar5 = lVar5 + 0x10;
    uVar2 = puVar6[6] ^ uVar7;
    uVar3 = puVar6[7] ^ uVar8;
    uVar2 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar2 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b9a0 + (ulong)(uVar2 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar2 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar2 >> 0x18) * 4);
    uVar3 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar3 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar3 & 0xff) * 4) ^ uVar2 ^
            *(uint *)(&DAT_0076c1a0 + (ulong)(uVar3 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar3 >> 0x18) * 4);
    uVar9 = uVar3 ^ uVar9;
    uVar3 = uVar10 ^ (uVar2 >> 8 | uVar2 << 0x18) ^ uVar3;
    uVar10 = uVar9 ^ puVar6[4];
    uVar2 = uVar3 ^ puVar6[5];
    uVar10 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar10 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_0076b9a0 + (ulong)(uVar10 & 0xff) * 4) ^
             *(uint *)(&DAT_0076bda0 + (ulong)(uVar10 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_0076b5a0 + (ulong)(uVar10 >> 0x18) * 4);
    uVar2 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar2 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar2 & 0xff) * 4) ^ uVar10 ^
            *(uint *)(&DAT_0076c1a0 + (ulong)(uVar2 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar2 >> 0x18) * 4);
    uVar7 = uVar2 ^ uVar7;
    uVar2 = uVar8 ^ (uVar10 >> 8 | uVar10 << 0x18) ^ uVar2;
    uVar8 = uVar7 ^ puVar6[2];
    uVar10 = uVar2 ^ puVar6[3];
    uVar8 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar8 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b9a0 + (ulong)(uVar8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar8 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar8 >> 0x18) * 4);
    uVar4 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar10 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar10 & 0xff) * 4) ^ uVar8 ^
            *(uint *)(&DAT_0076c1a0 + (ulong)(uVar10 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar10 >> 0x18) * 4);
    uVar9 = uVar4 ^ uVar9;
    uVar4 = uVar3 ^ (uVar8 >> 8 | uVar8 << 0x18) ^ uVar4;
    uVar8 = uVar9 ^ *puVar6;
    uVar10 = uVar4 ^ puVar6[1];
    uVar8 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar8 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b9a0 + (ulong)(uVar8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar8 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar8 >> 0x18) * 4);
    uVar3 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar10 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar10 & 0xff) * 4) ^ uVar8 ^
            *(uint *)(&DAT_0076c1a0 + (ulong)(uVar10 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar10 >> 0x18) * 4);
    uVar7 = uVar3 ^ uVar7;
    uVar10 = uVar7 ^ puVar6[-2];
    uVar3 = uVar2 ^ (uVar8 >> 8 | uVar8 << 0x18) ^ uVar3;
    uVar8 = uVar3 ^ puVar6[-1];
    uVar2 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar10 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b9a0 + (ulong)(uVar10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar10 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar10 >> 0x18) * 4);
    uVar10 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar8 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_0076b5a0 + (ulong)(uVar8 & 0xff) * 4) ^ uVar2 ^
             *(uint *)(&DAT_0076c1a0 + (ulong)(uVar8 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_0076bda0 + (ulong)(uVar8 >> 0x18) * 4);
    uVar9 = uVar10 ^ uVar9;
    uVar10 = uVar4 ^ (uVar2 >> 8 | uVar2 << 0x18) ^ uVar10;
    uVar8 = uVar9 ^ puVar6[-4];
    uVar2 = uVar10 ^ puVar6[-3];
    uVar4 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar8 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b9a0 + (ulong)(uVar8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar8 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar8 >> 0x18) * 4);
    uVar8 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar2 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar2 & 0xff) * 4) ^ uVar4 ^
            *(uint *)(&DAT_0076c1a0 + (ulong)(uVar2 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar2 >> 0x18) * 4);
    uVar7 = uVar8 ^ uVar7;
    uVar8 = uVar3 ^ (uVar4 >> 8 | uVar4 << 0x18) ^ uVar8;
    if (lVar5 == 0) break;
    uVar8 = uVar8 ^ ((puVar6[-6] & uVar7) >> 0x1f | (puVar6[-6] & uVar7) << 1);
    uVar9 = (puVar6[-7] | uVar10) ^ uVar9;
    uVar7 = (uVar8 | puVar6[-5]) ^ uVar7;
    uVar10 = uVar10 ^ ((uVar9 & puVar6[-8]) >> 0x1f | (uVar9 & puVar6[-8]) << 1);
    puVar6 = puVar6 + -0x10;
  }
  uVar9 = *param_3 ^ uVar9;
  uVar10 = param_3[1] ^ uVar10;
  uVar7 = param_3[2] ^ uVar7;
  uVar8 = param_3[3] ^ uVar8;
  param_4[3] = (char)uVar9;
  *param_4 = (char)(uVar9 >> 0x18);
  param_4[1] = (char)(uVar9 >> 0x10);
  param_4[7] = (char)uVar10;
  param_4[2] = (char)(uVar9 >> 8);
  param_4[4] = (char)(uVar10 >> 0x18);
  param_4[0xb] = (char)uVar7;
  param_4[5] = (char)(uVar10 >> 0x10);
  param_4[6] = (char)(uVar10 >> 8);
  param_4[8] = (char)(uVar7 >> 0x18);
  param_4[9] = (char)(uVar7 >> 0x10);
  param_4[10] = (char)(uVar7 >> 8);
  param_4[0xc] = (char)(uVar8 >> 0x18);
  param_4[0xd] = (char)(uVar8 >> 0x10);
  param_4[0xe] = (char)(uVar8 >> 8);
  param_4[0xf] = (char)uVar8;
  return;
}

