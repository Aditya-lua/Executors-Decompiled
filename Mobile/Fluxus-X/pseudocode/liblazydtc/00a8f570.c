/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8f570
 */

void Camellia_EncryptBlock_Rounds(uint param_1,uint *param_2,uint *param_3,undefined1 *param_4)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint *puVar4;
  ulong uVar5;
  ulong uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  
  uVar10 = (*param_2 & 0xff00ff00) >> 8 | (*param_2 & 0xff00ff) << 8;
  uVar7 = (uVar10 >> 0x10 | uVar10 << 0x10) ^ *param_3;
  uVar8 = (param_2[1] & 0xff00ff00) >> 8 | (param_2[1] & 0xff00ff) << 8;
  uVar10 = (param_2[2] & 0xff00ff00) >> 8 | (param_2[2] & 0xff00ff) << 8;
  uVar5 = -(ulong)((param_1 & 0xfffffff) >> 0x1b) & 0xfffffffc00000000 | (ulong)(param_1 << 4) << 2;
  uVar9 = (uVar10 >> 0x10 | uVar10 << 0x10) ^ param_3[2];
  uVar10 = (param_2[3] & 0xff00ff00) >> 8 | (param_2[3] & 0xff00ff) << 8;
  uVar10 = (uVar10 >> 0x10 | uVar10 << 0x10) ^ param_3[3];
  uVar8 = (uVar8 >> 0x10 | uVar8 << 0x10) ^ param_3[1];
  puVar4 = param_3 + 10;
  uVar6 = uVar5;
  while( true ) {
    uVar6 = uVar6 - 0x40;
    uVar1 = puVar4[-6] ^ uVar7;
    uVar2 = puVar4[-5] ^ uVar8;
    uVar1 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar1 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b9a0 + (ulong)(uVar1 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar1 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar1 >> 0x18) * 4);
    uVar2 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar2 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar2 & 0xff) * 4) ^ uVar1 ^
            *(uint *)(&DAT_0076c1a0 + (ulong)(uVar2 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar2 >> 0x18) * 4);
    uVar9 = uVar2 ^ uVar9;
    uVar2 = uVar10 ^ (uVar1 >> 8 | uVar1 << 0x18) ^ uVar2;
    uVar10 = uVar9 ^ puVar4[-4];
    uVar1 = uVar2 ^ puVar4[-3];
    uVar10 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar10 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_0076b9a0 + (ulong)(uVar10 & 0xff) * 4) ^
             *(uint *)(&DAT_0076bda0 + (ulong)(uVar10 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_0076b5a0 + (ulong)(uVar10 >> 0x18) * 4);
    uVar1 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar1 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar1 & 0xff) * 4) ^ uVar10 ^
            *(uint *)(&DAT_0076c1a0 + (ulong)(uVar1 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar1 >> 0x18) * 4);
    uVar7 = uVar1 ^ uVar7;
    uVar1 = uVar8 ^ (uVar10 >> 8 | uVar10 << 0x18) ^ uVar1;
    uVar10 = uVar7 ^ puVar4[-2];
    uVar8 = uVar1 ^ puVar4[-1];
    uVar10 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar10 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_0076b9a0 + (ulong)(uVar10 & 0xff) * 4) ^
             *(uint *)(&DAT_0076bda0 + (ulong)(uVar10 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_0076b5a0 + (ulong)(uVar10 >> 0x18) * 4);
    uVar8 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar8 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar8 & 0xff) * 4) ^ uVar10 ^
            *(uint *)(&DAT_0076c1a0 + (ulong)(uVar8 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar8 >> 0x18) * 4);
    uVar9 = uVar8 ^ uVar9;
    uVar8 = uVar2 ^ (uVar10 >> 8 | uVar10 << 0x18) ^ uVar8;
    uVar10 = uVar9 ^ *puVar4;
    uVar2 = uVar8 ^ puVar4[1];
    uVar10 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar10 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_0076b9a0 + (ulong)(uVar10 & 0xff) * 4) ^
             *(uint *)(&DAT_0076bda0 + (ulong)(uVar10 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_0076b5a0 + (ulong)(uVar10 >> 0x18) * 4);
    uVar3 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar2 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar2 & 0xff) * 4) ^ uVar10 ^
            *(uint *)(&DAT_0076c1a0 + (ulong)(uVar2 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar2 >> 0x18) * 4);
    uVar7 = uVar3 ^ uVar7;
    uVar2 = uVar7 ^ puVar4[2];
    uVar3 = uVar1 ^ (uVar10 >> 8 | uVar10 << 0x18) ^ uVar3;
    uVar10 = uVar3 ^ puVar4[3];
    uVar1 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar2 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b9a0 + (ulong)(uVar2 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar2 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar2 >> 0x18) * 4);
    uVar10 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar10 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_0076b5a0 + (ulong)(uVar10 & 0xff) * 4) ^ uVar1 ^
             *(uint *)(&DAT_0076c1a0 + (ulong)(uVar10 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_0076bda0 + (ulong)(uVar10 >> 0x18) * 4);
    uVar9 = uVar10 ^ uVar9;
    uVar10 = uVar8 ^ (uVar1 >> 8 | uVar1 << 0x18) ^ uVar10;
    uVar8 = uVar9 ^ puVar4[4];
    uVar1 = uVar10 ^ puVar4[5];
    uVar2 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar8 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b9a0 + (ulong)(uVar8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar8 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar8 >> 0x18) * 4);
    uVar8 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar1 >> 8 & 0xff) * 4) ^
            *(uint *)(&DAT_0076b5a0 + (ulong)(uVar1 & 0xff) * 4) ^ uVar2 ^
            *(uint *)(&DAT_0076c1a0 + (ulong)(uVar1 >> 0x10 & 0xff) * 4) ^
            *(uint *)(&DAT_0076bda0 + (ulong)(uVar1 >> 0x18) * 4);
    uVar7 = uVar8 ^ uVar7;
    uVar8 = uVar3 ^ (uVar2 >> 8 | uVar2 << 0x18) ^ uVar8;
    if (uVar6 == 0) break;
    uVar1 = uVar7 & puVar4[6];
    uVar8 = uVar8 ^ (uVar1 >> 0x1f | uVar1 << 1);
    uVar9 = (puVar4[9] | uVar10) ^ uVar9;
    uVar7 = (puVar4[7] | uVar8) ^ uVar7;
    uVar10 = uVar10 ^ ((uVar9 & puVar4[8]) >> 0x1f | (uVar9 & puVar4[8]) << 1);
    puVar4 = puVar4 + 0x10;
  }
  uVar1 = *(uint *)((long)param_3 + uVar5 + 4);
  uVar2 = *(uint *)((long)param_3 + uVar5 + 8);
  uVar9 = puVar4[6] ^ uVar9;
  uVar3 = *(uint *)((long)param_3 + uVar5 + 0xc);
  *param_4 = (char)(uVar9 >> 0x18);
  param_4[3] = (char)uVar9;
  param_4[2] = (char)(uVar9 >> 8);
  uVar1 = uVar1 ^ uVar10;
  uVar2 = uVar2 ^ uVar7;
  uVar3 = uVar3 ^ uVar8;
  param_4[1] = (char)(uVar9 >> 0x10);
  param_4[7] = (char)uVar1;
  param_4[0xb] = (char)uVar2;
  param_4[4] = (char)(uVar1 >> 0x18);
  param_4[5] = (char)(uVar1 >> 0x10);
  param_4[6] = (char)(uVar1 >> 8);
  param_4[8] = (char)(uVar2 >> 0x18);
  param_4[9] = (char)(uVar2 >> 0x10);
  param_4[10] = (char)(uVar2 >> 8);
  param_4[0xc] = (char)(uVar3 >> 0x18);
  param_4[0xd] = (char)(uVar3 >> 0x10);
  param_4[0xe] = (char)(uVar3 >> 8);
  param_4[0xf] = (char)uVar3;
  return;
}

