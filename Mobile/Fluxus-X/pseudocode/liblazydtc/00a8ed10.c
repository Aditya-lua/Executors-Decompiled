/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8ed10
 */

undefined8 Camellia_Ekeygen(int param_1,byte *param_2,uint *param_3)

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
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  byte bVar17;
  byte bVar18;
  byte bVar19;
  byte bVar20;
  uint uVar21;
  uint uVar22;
  uint uVar23;
  uint uVar24;
  ulong uVar25;
  ulong uVar26;
  uint uVar27;
  uint uVar28;
  uint uVar29;
  uint uVar30;
  undefined8 uVar31;
  uint uVar32;
  uint uVar33;
  uint uVar34;
  uint uVar35;
  ulong uVar36;
  uint uVar37;
  long lVar38;
  uint uVar39;
  ulong uVar40;
  uint uVar41;
  long lVar42;
  ulong uVar43;
  long lVar44;
  long lVar45;
  ulong uVar46;
  uint uVar47;
  uint uVar48;
  ulong uVar49;
  uint uVar50;
  uint uVar51;
  uint uVar52;
  uint uVar53;
  
  bVar17 = param_2[1];
  uVar51 = (uint)*param_2 << 0x18 | (uint)bVar17 << 0x10;
  uVar33 = uVar51 | (uint)param_2[2] << 8 | (uint)param_2[3];
  *param_3 = uVar33;
  bVar18 = param_2[5];
  uVar39 = (uint)param_2[4] << 0x18 | (uint)bVar18 << 0x10;
  uVar34 = uVar39 | (uint)param_2[6] << 8 | (uint)param_2[7];
  param_3[1] = uVar34;
  bVar19 = param_2[9];
  uVar48 = (uint)param_2[8] << 0x18 | (uint)bVar19 << 0x10;
  uVar47 = uVar48 | (uint)param_2[10] << 8 | (uint)param_2[0xb];
  param_3[2] = uVar47;
  bVar20 = param_2[0xd];
  uVar41 = (uint)param_2[0xc] << 0x18 | (uint)bVar20 << 0x10;
  uVar24 = uVar41 | (uint)param_2[0xe] << 8 | (uint)param_2[0xf];
  param_3[3] = uVar24;
  if (param_1 == 0x80) {
    uVar53 = uVar24;
    uVar35 = uVar47;
    uVar37 = uVar34;
    uVar52 = uVar33;
  }
  else {
    uVar52 = (*(uint *)(param_2 + 0x10) & 0xff00ff00) >> 8 |
             (*(uint *)(param_2 + 0x10) & 0xff00ff) << 8;
    uVar52 = uVar52 >> 0x10 | uVar52 << 0x10;
    param_3[8] = uVar52;
    uVar37 = (*(uint *)(param_2 + 0x14) & 0xff00ff00) >> 8 |
             (*(uint *)(param_2 + 0x14) & 0xff00ff) << 8;
    uVar37 = uVar37 >> 0x10 | uVar37 << 0x10;
    param_3[9] = uVar37;
    if (param_1 == 0xc0) {
      uVar35 = ~uVar52;
      param_3[10] = uVar35;
      uVar32 = ~uVar37;
    }
    else {
      uVar35 = (*(uint *)(param_2 + 0x18) & 0xff00ff00) >> 8 |
               (*(uint *)(param_2 + 0x18) & 0xff00ff) << 8;
      uVar35 = uVar35 >> 0x10 | uVar35 << 0x10;
      param_3[10] = uVar35;
      uVar32 = (*(uint *)(param_2 + 0x1c) & 0xff00ff00) >> 8 |
               (*(uint *)(param_2 + 0x1c) & 0xff00ff) << 8;
      uVar32 = uVar32 >> 0x10 | uVar32 << 0x10;
    }
    uVar52 = uVar52 ^ uVar33;
    uVar37 = uVar37 ^ uVar34;
    uVar35 = uVar35 ^ uVar47;
    uVar53 = uVar32 ^ uVar24;
    param_3[0xb] = uVar32;
  }
  uVar32 = uVar52 ^ 0xa09e667f;
  uVar9 = uVar37 ^ 0x3bcc908b;
  uVar32 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar32 >> 8 & 0xff) * 4) ^
           *(uint *)(&DAT_0076b9a0 + (ulong)(uVar32 & 0xff) * 4) ^
           *(uint *)(&DAT_0076bda0 + (ulong)(uVar32 >> 0x10 & 0xff) * 4) ^
           *(uint *)(&DAT_0076b5a0 + (ulong)(uVar32 >> 0x18) * 4);
  uVar9 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar9 >> 8 & 0xff) * 4) ^
          *(uint *)(&DAT_0076b5a0 + (ulong)(uVar9 & 0xff) * 4) ^ uVar32 ^
          *(uint *)(&DAT_0076c1a0 + (ulong)(uVar9 >> 0x10 & 0xff) * 4) ^
          *(uint *)(&DAT_0076bda0 + (ulong)(uVar9 >> 0x18) * 4);
  uVar35 = uVar9 ^ uVar35;
  uVar9 = uVar53 ^ (uVar32 >> 8 | uVar32 << 0x18) ^ uVar9;
  uVar32 = uVar35 ^ 0xb67ae858;
  uVar53 = uVar9 ^ 0x4caa73b2;
  uVar32 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar32 >> 8 & 0xff) * 4) ^
           *(uint *)(&DAT_0076b9a0 + (ulong)(uVar32 & 0xff) * 4) ^
           *(uint *)(&DAT_0076bda0 + (ulong)(uVar32 >> 0x10 & 0xff) * 4) ^
           *(uint *)(&DAT_0076b5a0 + (ulong)(uVar32 >> 0x18) * 4);
  uVar53 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar53 >> 8 & 0xff) * 4) ^
           *(uint *)(&DAT_0076b5a0 + (ulong)(uVar53 & 0xff) * 4) ^ uVar32 ^
           *(uint *)(&DAT_0076c1a0 + (ulong)(uVar53 >> 0x10 & 0xff) * 4) ^
           *(uint *)(&DAT_0076bda0 + (ulong)(uVar53 >> 0x18) * 4);
  uVar10 = uVar52 ^ uVar33 ^ uVar53;
  uVar53 = uVar37 ^ uVar34 ^ (uVar32 >> 8 | uVar32 << 0x18) ^ uVar53;
  uVar52 = uVar10 ^ 0xc6ef372f;
  uVar37 = uVar53 ^ 0xe94f82be;
  uVar52 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar52 >> 8 & 0xff) * 4) ^
           *(uint *)(&DAT_0076b9a0 + (ulong)(uVar52 & 0xff) * 4) ^
           *(uint *)(&DAT_0076bda0 + (ulong)(uVar52 >> 0x10 & 0xff) * 4) ^
           *(uint *)(&DAT_0076b5a0 + (ulong)(uVar52 >> 0x18) * 4);
  uVar32 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar37 >> 8 & 0xff) * 4) ^
           *(uint *)(&DAT_0076b5a0 + (ulong)(uVar37 & 0xff) * 4) ^ uVar52 ^
           *(uint *)(&DAT_0076c1a0 + (ulong)(uVar37 >> 0x10 & 0xff) * 4) ^
           *(uint *)(&DAT_0076bda0 + (ulong)(uVar37 >> 0x18) * 4);
  uVar37 = uVar35 ^ uVar47 ^ uVar32;
  uVar32 = uVar9 ^ uVar24 ^ (uVar52 >> 8 | uVar52 << 0x18) ^ uVar32;
  uVar52 = uVar37 ^ 0x54ff53a5;
  uVar35 = uVar32 ^ 0xf1d36f1c;
  uVar52 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar52 >> 8 & 0xff) * 4) ^
           *(uint *)(&DAT_0076b9a0 + (ulong)(uVar52 & 0xff) * 4) ^
           *(uint *)(&DAT_0076bda0 + (ulong)(uVar52 >> 0x10 & 0xff) * 4) ^
           *(uint *)(&DAT_0076b5a0 + (ulong)(uVar52 >> 0x18) * 4);
  uVar35 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar35 >> 8 & 0xff) * 4) ^
           *(uint *)(&DAT_0076b5a0 + (ulong)(uVar35 & 0xff) * 4) ^ uVar52 ^
           *(uint *)(&DAT_0076c1a0 + (ulong)(uVar35 >> 0x10 & 0xff) * 4) ^
           *(uint *)(&DAT_0076bda0 + (ulong)(uVar35 >> 0x18) * 4);
  uVar10 = uVar35 ^ uVar10;
  uVar35 = uVar53 ^ (uVar52 >> 8 | uVar52 << 0x18) ^ uVar35;
  if (param_1 == 0x80) {
    param_3[4] = uVar10;
    param_3[5] = uVar35;
    param_3[6] = uVar37;
    param_3[7] = uVar32;
    uVar21 = (uint)(CONCAT44(uVar10,uVar35) >> 0x11);
    uVar11 = CONCAT44(uVar35,uVar37) >> 0x11;
    uVar12 = CONCAT44(uVar37,uVar32) >> 0x11;
    uVar22 = (uint)(CONCAT44(uVar32,uVar10) >> 0x11);
    uVar10 = uVar10 >> 2;
    uVar32 = uVar32 >> 2;
    uVar13 = CONCAT44(uVar33,uVar39) >> 0x11;
    uVar40 = uVar13 & 0xffffffff;
    uVar14 = CONCAT44(uVar34,uVar48) >> 0x11;
    uVar43 = CONCAT44(uVar47,uVar41) >> 0x11;
    uVar46 = CONCAT44(uVar24,uVar51) >> 0x11;
    param_3[10] = (uint)uVar43;
    param_3[0xb] = (uint)uVar46;
    uVar25 = uVar40 >> 2;
    uVar15 = ((ulong)(uVar39 >> 0x11) << 0x20 | uVar14 & 0xffffffff) >> 2;
    uVar36 = uVar15 & 0xffffffff;
    uVar16 = ((ulong)(uVar41 >> 0x11) << 0x20 | uVar46 & 0xffffffff) >> 2;
    uVar49 = uVar16 & 0xffffffff;
    uVar26 = (uVar46 & 0xffffffff) >> 2;
    uVar46 = ((ulong)(uVar51 >> 0x11) << 0x20 | uVar40) >> 2;
    uVar40 = uVar46 & 0xffffffff;
    uVar34 = (uint)uVar11;
    param_3[0xc] = uVar21;
    param_3[0xd] = uVar34;
    uVar41 = (uint)uVar14;
    param_3[8] = (uint)uVar13;
    param_3[9] = uVar41;
    uVar13 = ((ulong)(uVar48 >> 0x11) << 0x20 | uVar43 & 0xffffffff) >> 2;
    uVar1 = uVar35 >> 2 & 0x7fff | uVar21 << 0xf;
    uVar33 = (uint)uVar12;
    param_3[0xe] = uVar33;
    param_3[0xf] = uVar22;
    uVar51 = uVar10 & 0x7fff | uVar22 << 0xf;
    uVar48 = (uint)((((uVar43 & 0xffffffff) >> 2) << 0x20 | uVar49) >> 0xf);
    param_3[0x1a] = (uint)((uVar26 << 0x20 | uVar40) >> 0x11);
    param_3[0x1b] = (uint)((uVar25 << 0x20 | uVar36) >> 0x11);
    uVar14 = (uVar26 << 0x20 | uVar40) >> 0xf;
    uVar43 = (uVar25 << 0x20 | uVar36) >> 0xf;
    param_3[0x24] = uVar48;
    param_3[0x25] = (uint)uVar14;
    uVar39 = (uint)(((uVar49 >> 0xf) << 0x20 | uVar14 & 0xffffffff) >> 0xf);
    uVar14 = ((ulong)(uVar41 >> 2) << 0x20 | uVar13 & 0xffffffff) >> 0xf;
    uVar52 = (uint)(((uVar40 >> 0xf) << 0x20 | uVar43 & 0xffffffff) >> 0xf);
    param_3[0x26] = (uint)uVar43;
    param_3[0x27] = (uint)uVar14;
    uVar41 = (uint)(((uVar36 >> 0xf) << 0x20 | uVar14 & 0xffffffff) >> 0xf);
    uVar2 = uVar37 >> 2 & 0x7fff | uVar34 << 0xf;
    uVar24 = uVar32 & 0x7fff | uVar33 << 0xf;
    uVar50 = (uint)uVar13;
    uVar34 = (uint)uVar16;
    param_3[0x20] = uVar50;
    param_3[0x21] = uVar34;
    uVar33 = (uint)uVar46;
    param_3[0x16] = uVar34;
    param_3[0x17] = uVar33;
    uVar34 = (uint)uVar15;
    param_3[0x22] = uVar33;
    param_3[0x23] = uVar34;
    param_3[0x14] = uVar34;
    param_3[0x15] = uVar50;
    param_3[0x12] = uVar24;
    param_3[0x13] = uVar51;
    uVar33 = (uint)((uVar11 & 0xffffffff) >> 2) & 0x7fff;
    uVar3 = uVar33 | uVar1 << 0xf;
    uVar34 = (uint)((uVar12 & 0xffffffff) >> 2) & 0x7fff;
    uVar4 = uVar34 | uVar2 << 0xf;
    uVar47 = uVar2 >> 2 & 0x7fff;
    uVar5 = uVar47 | uVar3 << 0xf;
    uVar24 = uVar24 >> 2 & 0x7fff;
    uVar6 = uVar24 | uVar4 << 0xf;
    uVar53 = uVar51 >> 2 & 0x7fff;
    uVar7 = uVar53 | (uVar32 << 0xf | uVar22 >> 2 & 0x7fff) << 0xf;
    uVar9 = uVar1 >> 2 & 0x7fff;
    uVar8 = uVar9 | (uVar10 << 0xf | uVar21 >> 2 & 0x7fff) << 0xf;
    uVar51 = (uVar50 & 0x3fff8000) << 2;
    uVar48 = uVar48 >> 0xf;
    param_3[0x18] = uVar3;
    param_3[0x19] = uVar4;
    param_3[0x1c] = uVar5;
    param_3[0x1d] = uVar6;
    param_3[0x1e] = uVar7;
    param_3[0x1f] = uVar8;
    uVar34 = uVar32 & 3 | (uVar24 | uVar34 << 0xf) << 2;
    uVar24 = uVar10 & 3 | (uVar53 | (uVar22 >> 2 & 0x7fff) << 0xf) << 2;
    uVar35 = uVar35 >> 2 & 3 | (uVar9 | (uVar21 >> 2 & 0x7fff) << 0xf) << 2;
    uVar33 = uVar37 >> 2 & 3 | (uVar47 | uVar33 << 0xf) << 2;
    uVar31 = 3;
    lVar42 = 0x2f;
    lVar44 = 0x2e;
    lVar45 = 0x2d;
    param_3[0x10] = uVar1;
    param_3[0x11] = uVar2;
    param_3[0x28] = uVar34;
    param_3[0x29] = uVar24;
    param_3[0x2a] = uVar35;
    param_3[0x2b] = uVar33;
    param_3[0x30] = uVar7 >> 0xd & 0x1ffff | uVar34 << 0x11;
    param_3[0x31] = uVar8 >> 0xd & 0x1ffff | uVar24 << 0x11;
    param_3[0x32] = uVar5 >> 0xd & 0x1ffff | uVar35 << 0x11;
    param_3[0x33] = uVar6 >> 0xd & 0x1ffff | uVar33 << 0x11;
    lVar38 = 0x2c;
  }
  else {
    uVar5 = (uint)(CONCAT44(uVar34,uVar48) >> 0x13);
    uVar4 = (uint)(CONCAT44(uVar47,uVar41) >> 0x13);
    uVar11 = CONCAT44(uVar37,uVar32) >> 0x11;
    param_3[0x18] = uVar5;
    param_3[0x19] = uVar4;
    uVar48 = uVar4 & 0x1ffff | (uVar47 >> 4) << 0x11;
    uVar41 = uVar5 & 0x1ffff | (uVar34 >> 4) << 0x11;
    uVar12 = CONCAT44(uVar32,uVar10) >> 0x11;
    param_3[0xe] = uVar37;
    param_3[0xf] = uVar32;
    param_3[0xe] = (uint)uVar11;
    param_3[0xf] = (uint)uVar12;
    uVar13 = ((ulong)(uVar37 >> 0x11) << 0x20 | uVar11 & 0xffffffff) >> 2;
    uVar14 = ((ulong)(uVar32 >> 0x11) << 0x20 | uVar12 & 0xffffffff) >> 2;
    uVar52 = (uint)uVar14;
    uVar53 = (uint)uVar13;
    param_3[0x30] = uVar53;
    param_3[0x31] = uVar52;
    param_3[0x1d] = uVar53;
    param_3[0x1e] = uVar52;
    uVar43 = CONCAT44(uVar10,uVar35) >> 0x11;
    uVar46 = ((ulong)(uVar10 >> 0x11) << 0x20 | uVar43 & 0xffffffff) >> 2;
    uVar52 = (uint)uVar46;
    param_3[0x1f] = uVar52;
    param_3[0x32] = uVar52;
    uVar15 = CONCAT44(uVar35,uVar37) >> 0x11;
    param_3[0xc] = uVar10;
    param_3[0xd] = uVar35;
    uVar52 = (uint)uVar43;
    param_3[0xc] = uVar52;
    param_3[0xd] = (uint)uVar15;
    uVar43 = ((ulong)(uVar35 >> 0x11) << 0x20 | uVar15 & 0xffffffff) >> 2;
    uVar6 = (uint)(CONCAT44(uVar24,uVar51) >> 0x13);
    uVar53 = (uint)(CONCAT44(uVar33,uVar39) >> 0x13);
    uVar51 = (uint)uVar43;
    param_3[0x1c] = uVar51;
    param_3[0x33] = uVar51;
    uVar9 = param_3[8];
    uVar2 = param_3[9];
    param_3[0x1a] = uVar6;
    param_3[0x1b] = uVar53;
    uVar1 = param_3[10];
    uVar3 = param_3[0xb];
    uVar51 = uVar53 & 0x1ffff | (uVar33 >> 4) << 0x11;
    param_3[0x3a] = (uint)(((ulong)(uVar52 >> 2) << 0x20 | uVar43 & 0xffffffff) >> 0xf);
    param_3[0x3b] = (uint)((((uVar15 & 0xffffffff) >> 2) << 0x20 | uVar13 & 0xffffffff) >> 0xf);
    uVar21 = uVar3 >> 2;
    uVar39 = uVar6 & 0x1ffff | (uVar24 >> 4) << 0x11;
    param_3[0x2e] = uVar51;
    param_3[0x2f] = uVar41;
    uVar41 = bVar19 >> 1 & 3 | uVar41 << 2;
    param_3[0x38] = (uint)((((uVar11 & 0xffffffff) >> 2) << 0x20 | uVar14 & 0xffffffff) >> 0xf);
    param_3[0x39] = (uint)((((uVar12 & 0xffffffff) >> 2) << 0x20 | uVar46 & 0xffffffff) >> 0xf);
    uVar7 = (uint)(CONCAT44(uVar1,uVar3) >> 0x11);
    uVar52 = bVar18 >> 1 & 3 | uVar51 << 2;
    uVar8 = (uint)(CONCAT44(uVar2,uVar1) >> 0x11);
    uVar22 = uVar1 >> 2;
    uVar27 = uVar7 << 0xf;
    uVar51 = uVar21 & 0x7fff | uVar27;
    param_3[0x22] = uVar33 >> 4 & 0x7fff | uVar6 << 0xf;
    param_3[0x23] = uVar53 << 0xf | uVar34 >> 4 & 0x7fff;
    uVar29 = (uint)(CONCAT44(uVar9,uVar2) >> 0x11);
    uVar50 = uVar2 >> 2;
    param_3[10] = uVar7;
    uVar28 = uVar8 << 0xf;
    uVar33 = uVar22 & 0x7fff | uVar28;
    uVar53 = uVar9 ^ uVar10 ^ 0x10e527fa;
    param_3[8] = uVar29;
    param_3[9] = uVar8;
    param_3[0x20] = uVar5 << 0xf | uVar47 >> 4 & 0x7fff;
    param_3[0x21] = uVar4 << 0xf | uVar24 >> 4 & 0x7fff;
    param_3[0x2d] = uVar39;
    uVar24 = uVar2 ^ uVar35 ^ 0xde682d1d;
    uVar29 = uVar29 << 0xf;
    uVar34 = uVar50 & 0x7fff | uVar29;
    param_3[0x24] = (uint)(CONCAT44(uVar50,uVar33) >> 2);
    uVar4 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar53 & 0xff) * 4);
    uVar5 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar53 >> 8 & 0xff) * 4);
    param_3[0x25] = (uint)(CONCAT44(uVar22,uVar51) >> 2);
    uVar6 = *(uint *)(&DAT_0076b5a0 + (ulong)(uVar24 & 0xff) * 4);
    uVar7 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar24 >> 8 & 0xff) * 4);
    uVar30 = (uint)(CONCAT44(uVar3,uVar9) >> 0x11);
    uVar23 = uVar9 >> 2;
    param_3[0xb] = uVar30;
    uVar30 = uVar30 << 0xf;
    uVar47 = uVar23 & 0x7fff | uVar30;
    uVar8 = *(uint *)(&DAT_0076bda0 + (ulong)(uVar53 >> 0x10 & 0xff) * 4);
    param_3[0x10] = uVar34;
    param_3[0x11] = uVar33;
    param_3[0x12] = uVar51;
    param_3[0x13] = uVar47;
    uVar51 = *(uint *)(&DAT_0076b5a0 + (ulong)(uVar53 >> 0x18) * 4);
    param_3[0x36] = uVar50 & 0x7ffc | uVar29 | uVar2 >> 2 & 3;
    param_3[0x37] = uVar22 & 0x7ffc | uVar28 | uVar1 >> 2 & 3;
    param_3[0x26] = (uint)(CONCAT44(uVar21,uVar47) >> 2);
    param_3[0x27] = (uint)(CONCAT44(uVar23,uVar34) >> 2);
    param_3[0x34] = uVar21 & 0x7ffc | uVar27 | uVar3 >> 2 & 3;
    param_3[0x35] = uVar23 & 0x7ffc | uVar30 | uVar9 >> 2 & 3;
    uVar51 = uVar5 ^ uVar4 ^ uVar8 ^ uVar51;
    uVar34 = uVar7 ^ uVar6 ^ uVar51 ^ *(uint *)(&DAT_0076c1a0 + (ulong)(uVar24 >> 0x10 & 0xff) * 4)
             ^ *(uint *)(&DAT_0076bda0 + (ulong)(uVar24 >> 0x18) * 4);
    uVar33 = uVar1 ^ uVar37 ^ uVar34;
    uVar34 = uVar3 ^ uVar32 ^ (uVar51 >> 8 | uVar51 << 0x18) ^ uVar34;
    uVar51 = uVar33 ^ 0xb05688c2;
    uVar47 = uVar34 ^ 0xb3e6c1fd;
    uVar51 = *(uint *)(&DAT_0076c1a0 + (ulong)(uVar51 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_0076b9a0 + (ulong)(uVar51 & 0xff) * 4) ^
             *(uint *)(&DAT_0076bda0 + (ulong)(uVar51 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_0076b5a0 + (ulong)(uVar51 >> 0x18) * 4);
    uVar24 = *(uint *)(&DAT_0076b9a0 + (ulong)(uVar47 >> 8 & 0xff) * 4) ^
             *(uint *)(&DAT_0076b5a0 + (ulong)(uVar47 & 0xff) * 4) ^ uVar51 ^
             *(uint *)(&DAT_0076c1a0 + (ulong)(uVar47 >> 0x10 & 0xff) * 4) ^
             *(uint *)(&DAT_0076bda0 + (ulong)(uVar47 >> 0x18) * 4);
    uVar47 = uVar24 ^ uVar9 ^ uVar10;
    param_3[6] = uVar33;
    param_3[7] = uVar34;
    uVar11 = CONCAT44(uVar33,uVar34) >> 2;
    uVar46 = uVar11 & 0xffffffff;
    uVar12 = CONCAT44(uVar34,uVar47) >> 2;
    uVar24 = uVar2 ^ uVar35 ^ (uVar51 >> 8 | uVar51 << 0x18) ^ uVar24;
    uVar13 = ((ulong)(uVar34 >> 2) << 0x20 | uVar12 & 0xffffffff) >> 2;
    param_3[0x2a] = (uint)uVar13;
    uVar34 = (uint)(((ulong)(uVar33 >> 2) << 0x20 | uVar46) >> 2);
    param_3[4] = uVar47;
    param_3[5] = uVar24;
    uVar37 = (uint)uVar12;
    param_3[0x16] = (uint)uVar11;
    param_3[0x17] = uVar37;
    uVar11 = CONCAT44(uVar47,uVar24) >> 2;
    uVar43 = uVar11 & 0xffffffff;
    uVar12 = CONCAT44(uVar24,uVar33) >> 2;
    uVar33 = (uint)(((ulong)(uVar47 >> 2) << 0x20 | uVar43) >> 2);
    uVar14 = ((ulong)(uVar24 >> 2) << 0x20 | uVar12 & 0xffffffff) >> 2;
    param_3[0x2b] = uVar33;
    param_3[0x2c] = uVar48;
    param_3[0x28] = (uint)uVar14;
    param_3[0x29] = uVar34;
    uVar47 = (uint)uVar12;
    param_3[0x14] = (uint)uVar11;
    param_3[0x15] = uVar47;
    uVar39 = bVar17 >> 1 & 3 | uVar39 << 2;
    uVar31 = 4;
    param_3[0x40] = (uint)(((uVar46 >> 2) << 0x20 | uVar13 & 0xffffffff) >> 0xd);
    uVar51 = bVar20 >> 1 & 3;
    lVar42 = 0x3f;
    param_3[0x41] = (uint)(CONCAT44(uVar37 >> 2,uVar33) >> 0xd);
    lVar44 = 0x3e;
    param_3[0x42] = (uint)(((uVar43 >> 2) << 0x20 | uVar14 & 0xffffffff) >> 0xd);
    lVar45 = 0x3d;
    uVar48 = uVar48 << 2;
    lVar38 = 0x3c;
    param_3[0x43] = (uint)(CONCAT44(uVar47 >> 2,uVar34) >> 0xd);
  }
  param_3[lVar38] = uVar39;
  param_3[lVar45] = uVar52;
  param_3[lVar44] = uVar41;
  param_3[lVar42] = uVar48 | uVar51;
  return uVar31;
}

