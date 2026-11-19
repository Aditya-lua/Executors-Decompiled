/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adc7d8
 */

void SEED_encrypt(uchar *s,uchar *d,SEED_KEY_SCHEDULE *ks)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar5;
  uint uVar4;
  uint uVar7;
  uint uVar6;
  uint uVar8;
  uint uVar9;
  
  uVar4 = (*(uint *)(s + 8) & 0xff00ff00) >> 8 | (*(uint *)(s + 8) & 0xff00ff) << 8;
  uVar5 = uVar4 >> 0x10 | uVar4 << 0x10;
  uVar4 = ks->data[0] ^ uVar5;
  uVar6 = (*(uint *)(s + 0xc) & 0xff00ff00) >> 8 | (*(uint *)(s + 0xc) & 0xff00ff) << 8;
  uVar7 = uVar6 >> 0x10 | uVar6 << 0x10;
  uVar6 = uVar4 ^ ks->data[1] ^ uVar7;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar4 = uVar6 + uVar4;
  uVar8 = (*(uint *)s & 0xff00ff00) >> 8 | (*(uint *)s & 0xff00ff) << 8;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar9 = (*(uint *)(s + 4) & 0xff00ff00) >> 8 | (*(uint *)(s + 4) & 0xff00ff) << 8;
  uVar9 = uVar6 ^ (uVar9 >> 0x10 | uVar9 << 0x10);
  uVar8 = uVar6 + uVar4 ^ (uVar8 >> 0x10 | uVar8 << 0x10);
  uVar4 = uVar8 ^ ks->data[2];
  uVar6 = uVar9 ^ ks->data[3] ^ uVar4;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar4 = uVar6 + uVar4;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar7 = uVar6 ^ uVar7;
  uVar5 = uVar6 + uVar4 ^ uVar5;
  uVar4 = uVar5 ^ ks->data[4];
  uVar6 = uVar7 ^ ks->data[5] ^ uVar4;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar4 = uVar6 + uVar4;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar9 = uVar6 ^ uVar9;
  uVar8 = uVar6 + uVar4 ^ uVar8;
  uVar4 = uVar8 ^ ks->data[6];
  uVar6 = uVar9 ^ ks->data[7] ^ uVar4;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar4 = uVar6 + uVar4;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar7 = uVar6 ^ uVar7;
  uVar5 = uVar6 + uVar4 ^ uVar5;
  uVar4 = uVar5 ^ ks->data[8];
  uVar6 = uVar7 ^ ks->data[9] ^ uVar4;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar4 = uVar6 + uVar4;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar9 = uVar6 ^ uVar9;
  uVar8 = uVar6 + uVar4 ^ uVar8;
  uVar4 = uVar8 ^ ks->data[10];
  uVar6 = uVar9 ^ ks->data[0xb] ^ uVar4;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar4 = uVar6 + uVar4;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar7 = uVar6 ^ uVar7;
  uVar5 = uVar6 + uVar4 ^ uVar5;
  uVar4 = uVar5 ^ ks->data[0xc];
  uVar6 = uVar7 ^ ks->data[0xd] ^ uVar4;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar4 = uVar6 + uVar4;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar9 = uVar6 ^ uVar9;
  uVar8 = uVar6 + uVar4 ^ uVar8;
  uVar4 = uVar8 ^ ks->data[0xe];
  uVar6 = uVar9 ^ ks->data[0xf] ^ uVar4;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar4 = uVar6 + uVar4;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar7 = uVar6 ^ uVar7;
  uVar5 = uVar6 + uVar4 ^ uVar5;
  uVar4 = uVar5 ^ ks->data[0x10];
  uVar6 = uVar7 ^ ks->data[0x11] ^ uVar4;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar4 = uVar6 + uVar4;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar9 = uVar6 ^ uVar9;
  uVar8 = uVar6 + uVar4 ^ uVar8;
  uVar4 = uVar8 ^ ks->data[0x12];
  uVar6 = uVar9 ^ ks->data[0x13] ^ uVar4;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar4 = uVar6 + uVar4;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar7 = uVar6 ^ uVar7;
  uVar5 = uVar6 + uVar4 ^ uVar5;
  uVar4 = uVar5 ^ ks->data[0x14];
  uVar6 = uVar7 ^ ks->data[0x15] ^ uVar4;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar4 = uVar6 + uVar4;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar9 = uVar6 ^ uVar9;
  uVar8 = uVar6 + uVar4 ^ uVar8;
  uVar4 = uVar8 ^ ks->data[0x16];
  uVar6 = uVar9 ^ ks->data[0x17] ^ uVar4;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar4 = uVar6 + uVar4;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar7 = uVar6 ^ uVar7;
  uVar5 = uVar6 + uVar4 ^ uVar5;
  uVar4 = uVar5 ^ ks->data[0x18];
  uVar6 = uVar7 ^ ks->data[0x19] ^ uVar4;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar4 = uVar6 + uVar4;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar9 = uVar6 ^ uVar9;
  uVar8 = uVar6 + uVar4 ^ uVar8;
  uVar4 = uVar8 ^ ks->data[0x1a];
  uVar6 = uVar9 ^ ks->data[0x1b] ^ uVar4;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar4 = uVar6 + uVar4;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar7 = uVar6 ^ uVar7;
  uVar5 = uVar6 + uVar4 ^ uVar5;
  uVar4 = uVar5 ^ ks->data[0x1c];
  uVar6 = uVar7 ^ ks->data[0x1d] ^ uVar4;
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar4 = uVar6 + uVar4;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar1 = ks->data[0x1f];
  uVar6 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  uVar9 = uVar6 ^ uVar9;
  uVar8 = uVar6 + uVar4 ^ uVar8;
  uVar4 = uVar8 ^ ks->data[0x1e];
  d[0xc] = (uchar)(uVar9 >> 0x18);
  d[0xd] = (uchar)(uVar9 >> 0x10);
  uVar6 = uVar9 ^ uVar1 ^ uVar4;
  d[0xe] = (uchar)(uVar9 >> 8);
  d[8] = (uchar)(uVar8 >> 0x18);
  d[9] = (uchar)(uVar8 >> 0x10);
  uVar1 = *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4);
  uVar2 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4);
  uVar3 = *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4);
  uVar6 = *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  d[0xb] = (uchar)uVar8;
  uVar6 = uVar2 ^ uVar1 ^ uVar3 ^ uVar6;
  uVar4 = uVar6 + uVar4;
  uVar4 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar4 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_00774ae8 + (ulong)(uVar4 & 0xff) * 4) ^
          *(uint *)(&DAT_007752e8 + (ulong)(uVar4 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_007756e8 + (ulong)(uVar4 >> 0x18) * 4);
  uVar6 = uVar4 + uVar6;
  uVar1 = *(uint *)(&DAT_00774ae8 + (ulong)(uVar6 & 0xff) * 4);
  uVar2 = *(uint *)(&DAT_00774ee8 + (ulong)(uVar6 >> 8 & 0xff) * 4);
  uVar3 = *(uint *)(&DAT_007752e8 + (ulong)(uVar6 >> 0x10 & 0xff) * 4);
  uVar6 = *(uint *)(&DAT_007756e8 + (ulong)(uVar6 >> 0x18) * 4);
  d[10] = (uchar)(uVar8 >> 8);
  uVar6 = uVar2 ^ uVar1 ^ uVar3 ^ uVar6;
  uVar7 = uVar6 ^ uVar7;
  uVar5 = uVar6 + uVar4 ^ uVar5;
  d[7] = (uchar)uVar7;
  d[3] = (uchar)uVar5;
  d[4] = (uchar)(uVar7 >> 0x18);
  d[5] = (uchar)(uVar7 >> 0x10);
  d[6] = (uchar)(uVar7 >> 8);
  *d = (uchar)(uVar5 >> 0x18);
  d[1] = (uchar)(uVar5 >> 0x10);
  d[2] = (uchar)(uVar5 >> 8);
  d[0xf] = (uchar)uVar9;
  return;
}

